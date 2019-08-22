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
        Regras jogodaforca = new Regras();
        try {
            jogodaforca.jogar();    
        } catch (FileNotFoundException e) {
            System.out.println("O Jogo não encontrou o arquivo com as palavras");
        }
            
    }
}
