package br.com.fiapp;

import javax.swing.JOptionPane;

public class TestePagamentoJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir ao usuário para inserir informações usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite o valor do salário bruto:");
        double salarioBruto = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o número de dependentes:");
        int numDependentes = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Digite o desconto do INSS:");
        double descontoINSS = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o valor do plano de saúde:");
        double valorPlanoSaude = Double.parseDouble(input);

        // Criar objeto FolhaDePagamento com as informações fornecidas
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(salarioBruto, numDependentes, descontoINSS, valorPlanoSaude);

        // Exibir informações fornecidas pelo usuário usando JOptionPane
        JOptionPane.showMessageDialog(null, "Informações fornecidas:\n" +
                "Salário Bruto: " + folhaDePagamento.getSalarioBruto() + "\n" +
                "Número de Dependentes: " + folhaDePagamento.getNumDependentes() + "\n" +
                "Desconto do INSS: " + folhaDePagamento.getDescontoINSS() + "\n" +
                "Valor do Plano de Saúde: " + folhaDePagamento.getValorPlanoSaude());

        // Exibir o salário líquido usando JOptionPane
        JOptionPane.showMessageDialog(null, "Salário Líquido: " + folhaDePagamento.calcularSalarioLiquido());

	}

}
