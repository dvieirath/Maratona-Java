package academy.devdojo.maratonajava;

public class aula06EstruturasRepetições04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + " R$"+valorParcela);
            }else{
                break;
            }
        }
        
    }

}
