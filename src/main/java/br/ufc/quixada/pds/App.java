package br.ufc.quixada.pds;

import java.io.FileNotFoundException;

/**
 * Classe responsavel por executar o jogo.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Cria o Jogo
        Regras jogodaforca = new Regras();
        try {
            //Inicia o Jogo
            jogodaforca.jogar();    
        } catch (FileNotFoundException e) {
            System.out.println("O Jogo não encontrou o arquivo com as palavras");
        }
            
    }
}
