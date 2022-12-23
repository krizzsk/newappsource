package com.braze;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.Appboy;

@Keep
public final class Braze extends Appboy {
    public Braze(Context context) {
        super(context);
    }

    public static Braze getInstance(Context context) {
        return Appboy.getInstance(context);
    }
}
