package br.ufrj.dcc.comp2.ple.aula_danilo.lab4.lista1.exercicio1;

import java.io.*;
import java.util.*;

public class ExemploArquivo {

	public static void main(String[] args) {
		File arq = new File("/tmp/ABC.bin");
		HashSet<Double> numeros = new HashSet<>();
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(arq))) {
            while (true) {
                numeros.add(dis.readDouble());
            }	
        }
        catch (EOFException e) {
        	System.err.println(numeros.toString());
        }
        catch (IOException e) {
        	System.err.println("Problema ao abrir ou fechar o arquivo: " + arq.getAbsolutePath());
        }
		
		
//		try (FileOutputStream fos = new FileOutputStream(arq)) {
//			DataOutputStream out = new DataOutputStream(fos);
//			for (double num : numeros) {
//				out.writeDouble(num);
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Problema ao abrir ou fechar o arquivo: " + arq.getAbsolutePath());
//		}
	}

}
