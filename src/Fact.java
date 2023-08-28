import com.sun.corba.se.spi.orbutil.fsm.StateImpl;

import java.util.Scanner;


class Rec {
    static int Recursion(int n) {
        if (n == 1) {
            return 1;

        }

            return n * Recursion(n - 1);
        }

    }


    public class Fact {



        public static void main(String[] args) {
            //int fact=Integer.MAX_VALUE;
//            int fact = 1;
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            for (int i = 1; i <= n; i++) {
//                fact *= i;
//            }
//            System.out.println(fact);

            System.out.println(Rec.Recursion(5));

        }
    }

