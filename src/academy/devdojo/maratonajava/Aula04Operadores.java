package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main (String[] args){
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;

        System.out.println("A soma de " + numero01 + " "
                + "e "+
                numero02 + " é igual a " + resultado);
        //%
         int resto = 22 % 7;
         System.out.println(resto);

        //&& (AND ou E)

        int idade = 20;
        float salario = 2500F;
        boolean isDentrodaLei = idade > 30 && salario > 4613;
        System.out.println(isDentrodaLei);

        // || (or ou se)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float PlayStation = 5000F;

        boolean iPlaystationFiveBuilder = valorTotalContaCorrente > PlayStation || valorTotalContaPoupanca > PlayStation;
        System.out.println("This PlayStation five is purchasable? " + iPlaystationFiveBuilder);

        // ! (not ou não)
    }




}
