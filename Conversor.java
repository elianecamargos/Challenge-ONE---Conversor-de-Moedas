package ConversorMoedas;

import javax.swing.JOptionPane;

public class Conversor {
	ConverterMoedas moedas = new ConverterMoedas();

	ConverterMoedasReais reais = new ConverterMoedasReais();

	public boolean entradaValida(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void converterMoedas(double valor) {

		String opcaoMoeda = (JOptionPane.showInputDialog(null, "Escolha a opção de moeda para converter seu valor ",
				"Moedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Reais para Dólares", "Reais para Euros", "Reais para Libras",
						"Reais para Peso Argentino", "Reais para Peso Chileno", "Reais para Bitcoin",
						"Dólares para Reais", "Euros para Reais", "Libras para Reais", "Peso Argentino para Reais",
						"Peso Chileno para Reais", "Bitcoin para Reais" },
				"Escolha")).toString();

		switch (opcaoMoeda) {
		case "Reais para Dólares":
			moedas.converterReaisEmDolares(valor);
			break;
		case "Reais para Euros":
			moedas.converterReaisEmEuros(valor);
			break;
		case "Reais para Libras":
			moedas.converterReaisEmLibras(valor);
			break;
		case "Reais para Peso Argentino":
			moedas.converterReaisEmPesosArgentinos(valor);
			break;
		case "Reais para Peso Chileno":
			moedas.converterReaisEmPesosChilenos(valor);
			break;
		case "Reais para Bitcoin":
			moedas.converterReaisEmBitcoin(valor);
			break;
		case "Dólares para Reais":
			reais.converterDolaresEmReais(valor);
			break;
		case "Euros para Reais":
			reais.converterEurosEmReais(valor);
			break;
		case "Libras para Reais":
			reais.converterLibrasEmReais(valor);
			break;
		case "Peso Argentino para Reais":
			reais.converterPesosArgentinosEmReais(valor);
			break;
		case "Peso Chileno para Reais":
			reais.converterPesosChilenosEmReais(valor);
			break;
		case "Bitcoin para Reais":
			reais.converterBitcoinEmReais(valor);
			break;
		}

	}
}
