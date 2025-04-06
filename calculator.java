

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT OPT:\n 1. Add\n 2. Sub\n 3. Mult\n");
        int opt = sc.nextInt();
        if(opt!=1&&opt!=2&&opt!=3){
            System.out.println("invalid");

        }
         else
         {
            System.out.println("enter first no:");
            int a = sc.nextInt();
            System.out.println("enter second no:");
            int b = sc.nextInt();

            if(opt==1){
                System.out.print(a+b);
            }
            else if(opt==2){
                System.out.print(a-b);
            }
            else if(opt==3){
                System.out.print(a*b);
            }
            
            
         }




    }
}   


    

