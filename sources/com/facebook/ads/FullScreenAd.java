package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.C2289Ad;

public interface FullScreenAd extends C2289Ad {

    @Keep
    public interface ShowAdConfig {
    }

    @Keep
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C2289Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
