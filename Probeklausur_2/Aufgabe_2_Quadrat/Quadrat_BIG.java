package Probeklausur_2;

import java.math.BigInteger;

public class Quadrat_BIG {
    public static void main(String[] args) {
        BigInteger big= BigInteger.valueOf(16); //Biginteger Werte zuweisen mit .valueof
        System.out.println(big.toString()); // Unformung von Biginterger zu String
        for (int i = 1; i < 6; i++) {
            big = big.pow(2);               // ins Quadrat nehmen
             System.out.println(big);
        }
    }
}
