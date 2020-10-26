package br.ufrj.dcc.comp2.ple.aula_danilo.lab9.calculadora.gui;

import java.awt.*;
import javax.swing.*;

public class JanelaCalculadora {
	private JFrame janela;
	private JButton[] teclas;
	private JLabel display;
	
	public void initWindow() {
		janela = new JFrame("Calculadora Java");
		janela.setSize(300, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		display = new JLabel("0");
		display.setFont(Font.decode("Arial bold 30"));
		
		JPanel painelTeclas = new JPanel(new GridLayout(4, 4));
		teclas = new JButton[4 * 4];
		
		for (int i = 0, lbl = 1; i < 12; i++, lbl++) {
			if ((i + 1) % 4 == 0)
				i++;
			
			teclas[i] = new JButton(String.valueOf(lbl));
		}
		
		teclas[12] = new JButton("0");
		teclas[3] = new JButton("+");
		teclas[7] = new JButton("-");
		teclas[11] = new JButton("*");
		teclas[15] = new JButton("/");
		teclas[13] = new JButton("=");
		teclas[14] = new JButton("C");
		
		for (JButton tecla : teclas) {
			painelTeclas.add(tecla);
		}
		
		janela.add(BorderLayout.NORTH, display);
		janela.add(BorderLayout.CENTER, painelTeclas);
		      
		janela.setVisible(true);
	}

}
