package br.com.fiapp;

import javax.swing.JOptionPane;

public class TestePagamentoJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir ao usu�rio para inserir informa��es usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite o valor do sal�rio bruto:");
        double salarioBruto = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o n�mero de dependentes:");
        int numDependentes = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Digite o desconto do INSS:");
        double descontoINSS = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o valor do plano de sa�de:");
        double valorPlanoSaude = Double.parseDouble(input);

        // Criar objeto FolhaDePagamento com as informa��es fornecidas
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(salarioBruto, numDependentes, descontoINSS, valorPlanoSaude);

        // Exibir informa��es fornecidas pelo usu�rio usando JOptionPane
        JOptionPane.showMessageDialog(null, "Informa��es fornecidas:\n" +
                "Sal�rio Bruto: " + folhaDePagamento.getSalarioBruto() + "\n" +
                "N�mero de Dependentes: " + folhaDePagamento.getNumDependentes() + "\n" +
                "Desconto do INSS: " + folhaDePagamento.getDescontoINSS() + "\n" +
                "Valor do Plano de Sa�de: " + folhaDePagamento.getValorPlanoSaude());

        // Exibir o sal�rio l�quido usando JOptionPane
        JOptionPane.showMessageDialog(null, "Sal�rio L�quido: " + folhaDePagamento.calcularSalarioLiquido());

	}

}
