package academy.devdojo.maratonajava;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Goten";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
