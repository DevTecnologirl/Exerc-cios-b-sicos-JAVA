import javax.swing.JOptionPane;

public class ex1 
{
  /*1) Programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários em JOptionPane e devolvendo a média em DOS.*/

  public static void main(String[] args) 
  {
    int quantidadeFuncionarios = 0;
    float salarioFuncionario = 0;
    float totalSalarios = 0;
    float mediaSalarial = 0;
    //variavel contadora para laço
    int contadora = 0;


  quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de funcionarios", "Numero de funcionarios",JOptionPane.QUESTION_MESSAGE));

//LAÇO DE REPETIÇÃO
while(contadora < quantidadeFuncionarios)
{
contadora++;
salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do funcionario", "Salario", JOptionPane.QUESTION_MESSAGE));
totalSalarios = totalSalarios + salarioFuncionario;
}

mediaSalarial = totalSalarios / quantidadeFuncionarios;
System.out.println("Média Salarial = " +mediaSalarial);

System.exit(0);

  }  
}
