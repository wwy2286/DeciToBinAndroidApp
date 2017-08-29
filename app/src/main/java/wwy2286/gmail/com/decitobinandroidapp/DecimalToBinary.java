package wwy2286.gmail.com.decitobinandroidapp;

/**
 * Created by William Yu on 8/29/2017.
 */

public class DecimalToBinary {

    public static String toBinaryConverter(long n) {

        if (n>0){
            return toBinaryConverter(n/2)+n%2;

        } else{
            return"";
        }

    }

    public static String toBinary(long n){
        if (n==0)
            return "0";
        else
            return toBinaryConverter(n);
    }
}
