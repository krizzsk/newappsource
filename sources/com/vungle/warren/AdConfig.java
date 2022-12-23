package com.vungle.warren;

import androidx.annotation.Keep;
import com.google.android.gms.nearby.messages.Strategy;
import p384bg.C13622c;

public final class AdConfig extends C23184o {
    @C13622c("ordinal")

    /* renamed from: d */
    private int f58499d;
    @C13622c("adOrientation")

    /* renamed from: e */
    private int f58500e = 2;

    /* renamed from: f */
    public boolean f58501f;

    @Keep
    public enum AdSize {
        VUNGLE_MREC("mrec", Strategy.TTL_SECONDS_DEFAULT, 250),
        VUNGLE_DEFAULT("default", -1, -1),
        BANNER("banner", 320, 50),
        BANNER_SHORT("banner_short", Strategy.TTL_SECONDS_DEFAULT, 50),
        BANNER_LEADERBOARD("banner_leaderboard", 728, 90);
        
        private final int height;
        private final String name;
        private final int width;

        private AdSize(String str, int i, int i2) {
            this.width = i;
            this.height = i2;
            this.name = str;
        }

        public static AdSize fromName(String str) {
            for (AdSize adSize : values()) {
                if (adSize.name.equals(str)) {
                    return adSize;
                }
            }
            return VUNGLE_DEFAULT;
        }

        public static boolean isBannerAdSize(AdSize adSize) {
            return adSize == BANNER || adSize == BANNER_LEADERBOARD || adSize == BANNER_SHORT || adSize == VUNGLE_MREC;
        }

        public static boolean isDefaultAdSize(AdSize adSize) {
            return adSize == VUNGLE_DEFAULT || adSize == VUNGLE_MREC;
        }

        public static boolean isNonMrecBannerAdSize(AdSize adSize) {
            return adSize != VUNGLE_MREC && isBannerAdSize(adSize);
        }

        public int getHeight() {
            return this.height;
        }

        public String getName() {
            return this.name;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public AdConfig() {
    }

    /* renamed from: c */
    public final int mo58028c() {
        return this.f58500e;
    }

    /* renamed from: d */
    public final int mo58029d() {
        return this.f58499d;
    }

    /* renamed from: e */
    public final void mo58030e(int i) {
        this.f58500e = i;
        this.f58501f = true;
    }

    /* renamed from: f */
    public final void mo58031f(int i) {
        this.f58499d = i;
    }

    public AdConfig(C23184o oVar) {
        super(oVar);
    }
}
