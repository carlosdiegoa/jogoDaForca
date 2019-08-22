package br.ufc.quixada.pds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Classe responsavel por ler o arquivo e fornecer a palavra secreta.
 *
 */

public class PalavraSecreta {
    public static ArrayList<String> palavras = new ArrayList<String>();

    public static String palavra() throws FileNotFoundException {
        //Pega o arquivo
        File file = new File("Palavras.txt");
        Scanner inputFile = new Scanner(file);

        //Preenche o array
        while (inputFile.hasNext()) {
            palavras.add(inputFile.next());
        }
        inputFile.close();
        
        //Apartir do arraylist seleciona uma palavra randomica
        String palavra = palavras.get((int) (Math.random() * palavras.size()));

        return palavra;
    }

}