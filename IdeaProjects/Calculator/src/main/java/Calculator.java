/**
 * Created by RMTestServices on 22/02/17.
 */
public class Calculator {
    public int addition(int a, int b) {

        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

//    public int multiplication(int a, int b) {
//        return a * b;
//
//    }

    public int multiplication (int a, int b) {
        int product = 0;
        boolean negative = false;
        if (b < 0)
            negative = true;
            b = Math.abs(b);

        for (int i = 1; i <= b; i++) {
            product += a;
            System.out.println(" "+i+" " +product);
        }
        if(negative) product*=-1;

        return product;



    }
}
