package br.ufc.quixada.pds;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe responsavel por pelas regras do jogo
 *
 */
public class Regras {

    public void jogar() throws FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        boolean jogar = true;
        // caso queira repetir
        do {
            System.out.println(" ~ Jogo da Forca ~ ");

            // devolver uma palavra
            String palavra = PalavraSecreta.palavra();
            System.out.println("\n\n");

            boolean jogo = true;
            do {
                // separar letra a letra
                char letras[] = new char[palavra.length()];
                for (int x = 0; x < palavra.length(); x++) {
                    letras[x] = palavra.charAt(x);
                    System.out.print("_ ");
                }
                boolean tentativas = true;
                int erro = 0;
                char certas[] = new char[palavra.length()];
                while (tentativas) {
                    if (erro < 6) {
                        System.out.println("\nDigite uma letra.");
                        int letraErrada = 0;

                        // procura na palavra a letra inserida
                        char letra = entrada.next().charAt(0);
                        String PalavraNova = "";

                        for (int i = 0; i < palavra.length(); i++) {
                            if (letra == letras[i]) {
                                // certo
                                certas[i] = letra;
                            } else {
                                // errado
                                letraErrada++;
                            }
                            if (certas[i] == letras[i]) {
                                PalavraNova += certas[i];
                                System.out.print(" " + certas[i] + " ");

                            } else {
                                System.out.print("_ ");
                            }
                        }
                        if (letraErrada >= palavra.length()) {
                            erro++;
                            System.out.println("\nErrado (" + erro + "/6)");
                        }
                        if (palavra.equals(PalavraNova)) {
                            // todas certas
                            System.out.println("\n\nBINGO!  '" + palavra + "'.");
                            tentativas = false;
                        } else {
                            new Visual(erro);
                        }
                    } else {
                        System.out.println("\nEsgotou as tentativas! ");
                        System.out.println("A palavra era: " + palavra);
                        tentativas = false;
                    }
                }
                jogo = false;
            } while (jogo);

            System.out.println("\nNovo jogo? (s/n)?");
            char novoJogo = entrada.next().charAt(0);
            if (novoJogo == 'S' || novoJogo == 's') {
                jogar = true;
            } else {
                jogar = false;
            }
        } while (jogar);
        entrada.close();
    }
}
