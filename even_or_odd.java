import java.util.*;
class even_or_odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.print("even");        
        }else{
            System.out.print("odd");
        }
        sc.close();  
    }
}