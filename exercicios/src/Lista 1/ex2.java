import javax.swing.JOptionPane;

public class ex2 {
  /*2. Criar um programa que receba por janela JoptionPane o valor de um produto e um código de aumento, segundo a tabela: Código % aumento 1 10 3 25 4 30 8 50 Utilizando a estrutura switch-case, mostrar em janela de saída o novo valor do produto depois de acrescida a porcentagem correspondente.*/

  public void main(String[] args) 
  {
  int codigoAumento;
  float valorProduto;
  
  valorProduto = Float.parseFloat(JOptionPane.showInputDialog(null, "R$", "Valor do produto", JOptionPane.QUESTION_MESSAGE));

  codigoAumento = Integer.parseInt(JOptionPane.showInputDialog(null,"Codigo", "Codigo de taxa de aumento",JOptionPane.QUESTION_MESSAGE));
  

  //entrando com switch
  // 1 10 - 3 25 - 4 30 - 8 50
  switch (codigoAumento)
   {
    case 1: valorProduto = valorProduto + (valorProduto * 10 / 100);
      JOptionPane.showMessageDialog(null, "R$" + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
      break;
  
    case 3: valorProduto = valorProduto + (valorProduto * 25/100);
    JOptionPane.showMessageDialog(null, "R$" + valorProduto, "Valor Produto com taxa de aumento", JOptionPane.PLAIN_MESSAGE);
    break;

    case 4:valorProduto = valorProduto + (valorProduto * 30/100);
    JOptionPane.showMessageDialog(null, "R$" + valorProduto, "Valor produto com taxa de aumento", JOptionPane.PLAIN_MESSAGE);
    break;

    case 8: valorProduto = valorProduto + (valorProduto * 50/100);
    JOptionPane.showMessageDialog(null, "R$" + valorProduto, "Valor produto com taxa de aumento", JOptionPane.PLAIN_MESSAGE);
    break;

    default: JOptionPane.showMessageDialog(null, "codigo" + codigoAumento, "Codigo taxa de aumento desconhecido", JOptionPane.PLAIN_MESSAGE);
      break;
  }
  System.exit(0);
}
}
