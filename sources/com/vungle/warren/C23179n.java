package com.vungle.warren;

import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.n */
public final class C23179n {

    /* renamed from: a */
    public static final /* synthetic */ int f58839a = 0;

    /* renamed from: a */
    public static void m57203a(String str, C23170k kVar, C23258z zVar) {
        VungleLogger.m57028a("Banners#loadBanner", "loadBanner API call invoked");
        if (Vungle.appContext() == null || !Vungle.isInitialized()) {
            m57204b(str, zVar, 9);
            return;
        }
        AdConfig adConfig = new AdConfig(kVar);
        if (!AdConfig.AdSize.isBannerAdSize(adConfig.mo58261a())) {
            m57204b(str, zVar, 30);
        } else {
            Vungle.loadAdInternal(str, (String) null, adConfig, zVar);
        }
    }

    /* renamed from: b */
    public static void m57204b(String str, C23258z zVar, int i) {
        VungleException vungleException = new VungleException(i);
        if (zVar != null) {
            zVar.onError(str, vungleException);
        }
        StringBuilder k = C13555b.m33972k("Banner load error: ");
        k.append(vungleException.getLocalizedMessage());
        VungleLogger.m57029b("Banners#onLoadError", k.toString());
    }

    /* renamed from: c */
    public static void m57205c(String str, C23135f0 f0Var, int i) {
        VungleException vungleException = new VungleException(i);
        if (f0Var != null) {
            f0Var.onError(str, vungleException);
        }
        StringBuilder k = C13555b.m33972k("Banner play error: ");
        k.append(vungleException.getLocalizedMessage());
        VungleLogger.m57029b("Banners#onPlaybackError", k.toString());
    }
}
