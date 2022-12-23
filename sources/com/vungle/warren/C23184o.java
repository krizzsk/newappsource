package com.vungle.warren;

import com.vungle.warren.AdConfig;
import p384bg.C13622c;

/* renamed from: com.vungle.warren.o */
public class C23184o {
    @C13622c("settings")

    /* renamed from: a */
    public int f58858a;
    @C13622c("adSize")

    /* renamed from: b */
    private AdConfig.AdSize f58859b;

    /* renamed from: c */
    public boolean f58860c;

    public C23184o() {
    }

    /* renamed from: a */
    public final AdConfig.AdSize mo58261a() {
        AdConfig.AdSize adSize = this.f58859b;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    /* renamed from: b */
    public final void mo58262b(AdConfig.AdSize adSize) {
        this.f58859b = adSize;
    }

    public C23184o(C23184o oVar) {
        this.f58859b = oVar.mo58261a();
        this.f58858a = oVar.f58858a;
    }
}
