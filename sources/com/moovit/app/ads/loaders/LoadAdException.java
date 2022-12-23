package com.moovit.app.ads.loaders;

import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.ads.LoadAdError;
import java.io.IOException;

public class LoadAdException extends IOException {
    private LoadAdError loadAdError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadAdException(LoadAdError loadAdError2) {
        super(loadAdError2.getMessage());
        C21100e.m49373x(loadAdError2, "loadAdError");
        this.loadAdError = loadAdError2;
    }

    /* renamed from: a */
    public final int mo44751a() {
        LoadAdError loadAdError2 = this.loadAdError;
        if (loadAdError2 != null) {
            return loadAdError2.getCode();
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadAdException(String str) {
        super(str);
        C21100e.m49373x(str, InAppMessageBase.MESSAGE);
    }
}
