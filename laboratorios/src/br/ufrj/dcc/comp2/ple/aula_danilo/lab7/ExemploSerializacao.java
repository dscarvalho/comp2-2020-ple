package br.ufrj.dcc.comp2.ple.aula_danilo.lab7;

import java.util.*;
import java.io.*;

public class ExemploSerializacao {
	public static <T extends Number> void serializar(List<ParOrdenado<T>> pares, String caminhoArquivo) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
			oos.writeObject(pares);
		}
		catch (IOException e) {
			System.err.println("Problema ao abrir ou fechar o arquivo.");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Number> List<ParOrdenado<T>> deserializar(String caminhoArquivo) {
		List<ParOrdenado<T>> pares = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
			pares = (List<ParOrdenado<T>>)ois.readObject();
		}
		catch (ClassNotFoundException e) {
			System.err.println("Problema ao carregar classe.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.err.println("Problema ao abrir ou fechar o arquivo.");
		}
		
		return pares;
	}

	public static void main(String[] args) {	
//		List<ParOrdenado<Double>> pares = new ArrayList<ParOrdenado<Double>>();
//		pares.add(new ParOrdenado<Double>(9.0, 5.4)); 
//		pares.add(new ParOrdenado<Double>(8.7, 1.5)); 
//		pares.add(new ParOrdenado<Double>(0.1, 6.0));
//		pares.add(new ParOrdenado<Double>(3.3, 0.0));
//  
//		serializar(pares, "pares.ser");
//		System.out.println("Serialização concluida.");
		 

		List<ParOrdenado<Double>> pares = deserializar("pares.ser");
		System.out.println(pares.toString());
		System.out.println("Deserialização concluida.");
	}

}
