package br.ufc.quixada.pds;

/**
 * Classe responsavel por pela resposta Visual do Jogo.
 *
 */
public class Visual 
{
    public Visual(int erro){
		if (erro == 0) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("######");
        } else if (erro == 1) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("######");
        } else if (erro == 2) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#   |");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("######");
        } else if (erro == 3) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#  -|");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("######");
        }
        else if (erro == 4) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#  -|-");
        	System.out.println("#    ");
        	System.out.println("#    ");
        	System.out.println("######");
        }
        else if (erro == 5) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#  -|-");
        	System.out.println("#  /  ");
        	System.out.println("#    ");
        	System.out.println("######");
        }
        else if (erro == 6) {
        	System.out.println("\n#####");
        	System.out.println("#   #");
        	System.out.println("#   O");
        	System.out.println("#  -|-");
        	System.out.println("#  / \\ ");
        	System.out.println("#    ");
        	System.out.println("######");
        }
	}
}
