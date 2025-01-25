package academy.devdojo.maratonajava;

public class aula06EstruturasRepetições01 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count +=1;
        }
        do{
            System.out.println("Dentro do Do While");
        }while (count < 10);

        for(int i=0 ;i<10; i++){
            System.out.println("For" +i);

        }

        }
    }

