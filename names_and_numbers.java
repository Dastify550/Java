import java.util.Scanner;
public class names_and_numbers{
    public static void main(String[] args){
	String nm;
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("!Bienvenido¡");
        System.out.println("Ingresa tu nombre: ");
        nm = sc.nextLine();
        System.out.println("Ingresa primero un número: ");
        n1 = sc.nextInt();
        System.out.println("Ingresa otro número: ");
        n2 = sc.nextInt();
        System.out.println("Ingresa un tercer y último núemro: ");
        n3 = sc.nextInt();

        System.out.println("Los números ingresados fueron: " + n1 + "," + n2 + " ," + n3 + ".");
        System.out.println("Tu nombre es: " + nm);

    }
}