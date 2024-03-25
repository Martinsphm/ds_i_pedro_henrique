import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);
        Float peso;
        Float altura;
        String nome;
        String imcr;
        

        System.out.println( "insira o seu nome:");
        nome = myobj.nextLine();

        System.out.println( "insira o seu peso:");
        peso = myobj.nextFloat();

        System.out.println( "insira a sua altura:");
        altura = myobj.nextFloat();

        Float imc = peso/(altura * altura);

        System.out.println(imc);

        if (imc < 17) {
            imcr = "Muito abaixo do peso";
        } else if (imc < 18.5) {
            imcr = "Abaixo do peso";
        } else if (imc < 25) {
            imcr = "Peso normal";
        } else if (imc < 30) {
            imcr = "Acima do peso";
        } else if (imc < 35) {
            imcr = "obesidade grau I";
        } else if (imc < 40) {
            imcr = "obesidade grau II";
        } else{
            imcr = "obesidade grau III";
        }

        System.out.println(nome + " tem " +altura+ "m e pesa " + peso + "kg. Sua situação é: " + imcr);
        myobj.close();
    }
}
