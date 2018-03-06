package clientwsfactorial;

import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class ClientWSFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del cual quiere saber el factorial: ");
        double num = sc.nextDouble();
        System.out.println("Factorial de 5: " + factorial(num));
    }

    private static double factorial(double n1) {
        wsfactorial.WSFactorial_Service service = new wsfactorial.WSFactorial_Service();
        wsfactorial.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(n1);
    }
    
}
