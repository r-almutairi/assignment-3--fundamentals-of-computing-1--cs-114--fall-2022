import java.util.Scanner;

public class RunMatrix
{
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of your matrix: ");
        int input = in.nextInt();
        System.out.println("Your matrix is "+input+" x "+input);


        Matrix m = new Matrix(input);
        System.out.println("printing matrix with default values: ");
        m.printMatrix();

        m.populateMatrix();
        m.printMatrix();
        m.flipMatrix();
        m.printMatrix();






    }
}
