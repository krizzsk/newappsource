package com.braze.configuration;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.configuration.AppboyConfigurationProvider;

@Keep
public class BrazeConfigurationProvider extends AppboyConfigurationProvider {
    public BrazeConfigurationProvider(Context context) {
        super(context);
    }
}
