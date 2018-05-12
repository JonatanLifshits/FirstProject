package com.example.jonatan.jonstart;

/**
 * Created by Jonatan on 05.05.2018.
 */

public class MathUtils {

    public static final String TAG = "HELL";

    public static long stepen(int number, int n){
        if (n == 0) return 1;
        long result = number;
        for (int i = 0; i < n - 1; i++){
            result *= number;
        }
        return result;
    }
}
