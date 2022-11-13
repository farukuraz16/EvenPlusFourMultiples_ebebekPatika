import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);//get value from user
        int num;
        int sum=0;//for total value of numbers that approved
        do {//for loop
            System.out.print("pls enter number: ");//get value from user
            num=dat.nextInt();
            if (num%4==0 || num%2==0) sum+=num;//condition --->even or multiples of 4
            System.out.println("sum = " + sum);//print all steps about sum
        }while(num%2==0);//for loop will continue until if number is odd.
        System.out.println("entered odd number!!!");//warning...
        System.out.println("sum = " + sum);


    }
}
