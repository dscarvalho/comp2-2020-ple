package br.ufrj.dcc.comp2.ple.aula_danilo.lab4.lista1.exercicio1;

import java.io.*;
import java.time.*;
import java.util.*;

public class ExemploSerializacao {
	public static void serializaDatas() {
		HashSet<LocalDate> datas = new HashSet<>();
		datas.add(LocalDate.parse("2020-01-01"));
		datas.add(LocalDate.now());
		datas.add(LocalDate.now().minusDays(1));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datas.ser"))) {
            oos.writeObject(datas);
        }
		catch (IOException e) {
			System.err.println("Problema ao abrir ou fechar o arquivo.");
		}
	}
		
	@SuppressWarnings("unchecked")
	public static HashSet<LocalDate> deserializaDatas() {
		HashSet datas = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datas.ser"))) {
			datas = (HashSet<LocalDate>)ois.readObject();
		}
		catch (ClassNotFoundException e) {
			System.err.println("Problema ao carregar a classe.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.err.println("Problema ao abrir ou fechar o arquivo.");
		}
		
		return datas;
	}

	public static void main(String[] args) {
		serializaDatas();
		System.out.println(deserializaDatas().toString());
	}

}
