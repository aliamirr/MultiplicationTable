import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        int myInput, i;

        Scanner Numm = new Scanner(System.in);

        System.out.println("Enter a number: ");
        myInput = Numm.nextInt();
        
        System.out.println("The multiplication table of " + myInput + " is: ");
        for(i =1; i <= 10; i++){
            System.out.println(myInput +" * " + i + " = " + myInput*i);
        }
    }


}