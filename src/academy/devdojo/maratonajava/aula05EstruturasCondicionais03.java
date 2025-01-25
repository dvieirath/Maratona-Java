package academy.devdojo.maratonajava;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}