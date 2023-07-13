package ConversorMoedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	String valorFormatado = new DecimalFormat("#,##0.00").format(0);
	String valorF = new DecimalFormat("#,##0.00").format(0);

	public void converterReaisEmDolares(double valor) {
		double dolar = valor / 4.90;
		dolar = (double) Math.round(dolar * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(dolar);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a USD$ " + valorF + " Dólares");
	}

	public void converterReaisEmEuros(double valor) {
		double euro = valor / 0.19;
		euro = (double) Math.round(euro * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(euro);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a EUR£ " + valorF + " Euros");
	}

	public void converterReaisEmLibras(double valor) {
		double libra = valor / 0.16;
		libra = (double) Math.round(libra * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(libra);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a GBP£ " + valorF + " Libras Esterlinas");
	}

	public void converterReaisEmPesosArgentinos(double valor) {
		double pesoArgentino = valor / 53.58;
		pesoArgentino = (double) Math.round(pesoArgentino * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(pesoArgentino);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a ARS$ " + valorF + " Pesos Argentinos");
	}

	public void converterReaisEmPesosChilenos(double valor) {
		double pesoChileno = valor / 3.49;
		pesoChileno = (double) Math.round(pesoChileno * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(pesoChileno);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a CLP$ " + valorF + " Pesos Chilenos");
	}

	public void converterReaisEmBitcoin(double valor) {
		double bitcoin = valor / 148776.00;
		bitcoin = (double) Math.round(bitcoin * 100D) / 100;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		valorF = new DecimalFormat("#,##0.00").format(bitcoin);
		JOptionPane.showMessageDialog(null,
				"Seu valor de R$" + valorFormatado + " equivale a BTC " + valorF + " Bitcoin");
	}

}
