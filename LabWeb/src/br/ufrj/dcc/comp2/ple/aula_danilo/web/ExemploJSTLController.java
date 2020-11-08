package br.ufrj.dcc.comp2.ple.aula_danilo.web;

import java.util.*;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

import br.ufrj.dcc.comp2.ple.aula_danilo.web.model.*;

public class ExemploJSTLController {
	public static final String arquivoMenu = "/WEB-INF/data/cardapio.json";
	
	private List<ItemCardapio> menu;
	
	public ExemploJSTLController(String caminhoArquivoMenu) {
		menu = new ArrayList<>();
		preparaMenu(caminhoArquivoMenu);
	}
	
	private void preparaMenu(String caminhoArquivoMenu) {
		JSONParser parser = new JSONParser();
		JSONArray menuJson = new JSONArray();
		
		try {
			FileInputStream fisMenu = new FileInputStream(caminhoArquivoMenu);
			menuJson = (JSONArray)parser.parse(new InputStreamReader(fisMenu));
		}
		catch (ParseException e) {
			System.err.println("Problema ao interpretar o cardápio!");
		}
		catch (IOException e) {
			System.err.println("Problema ao ler o cardápio!");
		}
		
		for (Object item : menuJson) {
			JSONObject itemJson = (JSONObject)item;
			ItemCardapio itemCardapio = new ItemCardapio();
			itemCardapio.setNome((String)itemJson.get("nome"));
			itemCardapio.setValor((float)(double)itemJson.get("valor"));
			if (itemJson.get("desconto") != null)
				itemCardapio.setDesconto((float)(double)itemJson.get("desconto"));
			
			menu.add(itemCardapio);
		}
	}
	
	public List<ItemCardapio> getMenu() {
		return menu;
	}

}
