package com.braze.images;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.lrucache.AppboyLruImageLoader;

@Keep
public class DefaultBrazeImageLoader extends AppboyLruImageLoader {
    public DefaultBrazeImageLoader(Context context) {
        super(context);
    }
}
