import java.util.*;
class bigger_num{
    public static void main  (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        if (a > b){
            System.out.print("a is greater");

        }else{
            System.out.print("b is greater");
        }
        sc.close();


    }
}