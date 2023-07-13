package ConversorMoedas;

import javax.swing.JOptionPane;

public class FuncaoConverter {

	public static void main(String[] args) {
		Conversor moedas = new Conversor();

		try {
			String input = JOptionPane.showInputDialog("Insira um valor: ");

			while (!moedas.entradaValida(input) && input != null) {
				input = JOptionPane.showInputDialog(null, "Digite um valor válido: ");
			}
			double valor = Double.parseDouble(input);
			moedas.converterMoedas(valor);

			int resposta = 0;
			while (JOptionPane.OK_OPTION == resposta) {
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
				if (JOptionPane.OK_OPTION == resposta) {
					input = JOptionPane.showInputDialog("Insira um valor: ");
					while (!moedas.entradaValida(input) && input != null) {
						input = JOptionPane.showInputDialog(null, "Digite um valor válido: ");
					}
					valor = Double.parseDouble(input);
					moedas.converterMoedas(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		} catch (NullPointerException cancelar) {
			JOptionPane.showMessageDialog(null, "Programa Encerrado");
		}
	}
}
