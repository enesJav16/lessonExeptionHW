import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("Chose figure:");
            System.out.println("Parelellepiped[1]---------Cylinder[2]");
            System.out.println("-----------Finish code[0]------------");
            int  input= scanner.nextInt();
            switch (input){
                case 1:
                    Parelellepiped.paralStart();
                    break;
                case 2:
                    Cylinder.cylinderStart();
                    break;
                case 0:
                    check=false;
                    break;

            }
        }
    }
}