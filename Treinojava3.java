import java.util.Scanner;

public class Treinojava3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String Mystring = scanner.next();
            int Mynumber =scanner.nextInt();
           
            System.out.printf("%-15s%03d\n", Mystring,Mynumber);

            scanner.close();

        }
        System.out.println("================================");
    }

}
