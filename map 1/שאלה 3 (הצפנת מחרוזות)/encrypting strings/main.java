import java.util.Scanner;

public class main {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        //String massage = scanner.nextLine();
        RouteChiper massage1 = new RouteChiper(scanner.nextLine());
       
        System.out.println(massage1.encryptMassage());
    }
}