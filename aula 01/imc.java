import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        float peso;
        float altura;
        

        
        System.out.println("insira o seu peso:");
        peso = myobj.nextFloat();

        System.out.println("insira a sua altura:");
        altura = myobj.nextFloat();

        float imc = peso/(altura * altura);

        System.out.println(imc);

        if (imc < 16.9) {
            System.out.println();
        } else if (imc > 17 && imc <18.4) {
            System.out.println();
        }

        
    }
}
