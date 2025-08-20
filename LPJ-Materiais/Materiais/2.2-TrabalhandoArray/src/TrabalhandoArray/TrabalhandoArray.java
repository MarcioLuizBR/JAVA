package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		//declarando o array
		String [] paises = new String[5];

		// for (int i = 0; i < paises.length; i++) {
		// 	paises[i] = JOptionPane.showInputDialog("Informe o nome do paises " + (i + 1));
		// }
		 
		// inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Italia";
		paises[3] = "Austria";
		paises[4] = "Polonia";

		for (String lista: paises) {
			System.out.println(lista);
		}
		// inserindo dados no array
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}
		// listando os valores do array com um ForEach
		System.out.println("Apos a entrada de dados");
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
		// calculando os valores para armazenar no array
		numeros[8] = numeros[7] + 4;
		System.out.println("\nApos a alteracao do valor na posicao 8");
		// listando os valores do array com um ForEach
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
	}

}
