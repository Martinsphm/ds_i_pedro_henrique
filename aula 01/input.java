import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String msg;

        System.out.println("ensira a mensagem");
        msg = myobj.nextLine();

        System.out.println(msg);
    }
}