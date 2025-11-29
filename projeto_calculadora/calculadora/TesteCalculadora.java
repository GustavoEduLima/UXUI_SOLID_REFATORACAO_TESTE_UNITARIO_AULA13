package projeto_calculadora.calculadora;

/**
 * <p>Classe responsável por testar o funcionamento da classe {@code Calculadora}.</p>
 *
 * <p>Este programa executa diversas operações matemáticas utilizando o método
 * {@code calcular} e imprime seus resultados no console. Também demonstra o
 * comportamento da aplicação quando operadores inválidos ou operações proibidas
 * (como divisão por zero) são solicitadas.</p>
 *
 * <p>O objetivo principal desta classe é servir como um cliente simples para a
 * calculadora, validando o fluxo normal e o fluxo de exceções.</p>
 */
public class TesteCalculadora {

    /**
     * Método principal que executa os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Operações Válidas
        System.out.println(calc.calcular(2, 3, "+")); //Valor esperado 5
        System.out.println(calc.calcular(10, 4, "-")); //Valor esperado 6
        System.out.println(calc.calcular(3, 5, "*")); //valor Esperado 15
        System.out.println(calc.calcular(8, 2, "/")); //Valor Eperado 4 

        //Teste de divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/")); //exceção esperada
        } catch (IllegalCallerException e){
            //Exibe a mensagem da exceção lançada pela calculadora
            System.out.println(e.getMessage());
        }

        //Teste de operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x")); //exceção esperada
        } catch (IllegalCallerException e){
            //Exibe a mensagem de operador inválido
            System.out.println(e.getMessage());
        }

    }

}
