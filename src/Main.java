import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("enter the operation (op1 operation op2) : ");

        Scanner input = new Scanner(System.in);

        int op1 = input.nextInt();
        char op = input.next().charAt(0);
        int op2 = input.nextInt();

        if (op == '+')
        {
            System.out.println(op1+op2);
        } else if (op == '-') {

            System.out.println(op1-op2);

        } else if (op == '*') {

            System.out.println(op1*op2);

        }else {
            if (op2 == 0)
            {
                System.out.println("not valid operation ");
            }else {
                System.out.println((double) op1/op2);
            }
        }


    }
}