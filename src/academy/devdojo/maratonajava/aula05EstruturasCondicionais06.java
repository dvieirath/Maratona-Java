package academy.devdojo.maratonajava;

public class aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia){
            case 1:
                System.out.println("Domingo, Fim de Semana");
                break;
            case 2:
                System.out.println("Segunda, Dia Util");
                break;
            case 3:
                System.out.println("Terça, Dia Util");
                break;
            case 4:
                System.out.println("Quarta, Dia Util");
                break;
            case 5:
                System.out.println("Quinta, Dia Util");
                break;
            case 6:
                System.out.println("Sexta, Dia Util");
                break;
            case 7:
                System.out.println("Sabado, Fim de Semana");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
    }
}
