package com.example.jonatan.jonstart;

import android.util.Log;

/**
 * Created by Jonatan on 05.05.2018.
 */

public class AngryUser implements UserInterface {
    @Override
    public void sayHello() {
        MathUtils.stepen(0, 0);

        Log.d("AngryUser", "FUCK U ALL  " + MathUtils.TAG);
    }
}
