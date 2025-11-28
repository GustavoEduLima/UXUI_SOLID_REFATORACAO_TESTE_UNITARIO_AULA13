package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Teste rapidos 
        calc.calc(2,3,"+"); //Esperado 5
        calc.calc(10,4,"-"); //Esperado 6
        calc.calc(3,5,"*"); //Esperando 15
        calc.calc(8,2,"/"); //Esperando 4
        calc.calc(8,0,"/"); //divisão por zero
        calc.calc(5,5,"x"); //operação inválida
    }
}