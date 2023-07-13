package ConversorMoedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConverterMoedasReais {

	String valorFormatado = new DecimalFormat("#,##0.00").format(0);
	String valorF = new DecimalFormat("#,##0.00").format(0);

	public void converterDolaresEmReais(double valorRecebido) {
		double moedaDolar = valorRecebido * 4.90;
		moedaDolar = (double) Math.round(moedaDolar * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaDolar);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Dólares de USD$ " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

	public void converterEurosEmReais(double valorRecebido) {
		double moedaEuro = valorRecebido * 0.19;
		moedaEuro = (double) Math.round(moedaEuro * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaEuro);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Euros de EUR£ " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

	public void converterLibrasEmReais(double valorRecebido) {
		double moedaLibra = valorRecebido * 0.16;
		moedaLibra = (double) Math.round(moedaLibra * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaLibra);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Libras de GBP£ " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

	public void converterPesosArgentinosEmReais(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido * 53.58;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaPesoArgentino);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Peso Argentino de ARS$ " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

	public void converterPesosChilenosEmReais(double valorRecebido) {
		double moedaPesoChileno = valorRecebido * 3.49;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaPesoChileno);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Peso Chileno de CLP$ " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

	public void converterBitcoinEmReais(double valorRecebido) {
		double moedaBitcoin = valorRecebido * 148776.00;
		moedaBitcoin = (double) Math.round(moedaBitcoin * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valorRecebido);
		valorF = new DecimalFormat("#,##0.00").format(moedaBitcoin);
		JOptionPane.showMessageDialog(null,
				"Seu valor em Bitcoin de BTC " + valorFormatado + " Corresponde a R$ " + valorF + " Reais");
	}

}
