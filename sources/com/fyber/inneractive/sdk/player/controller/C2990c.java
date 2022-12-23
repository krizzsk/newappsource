package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.View;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.renderers.C3631g;
import com.fyber.inneractive.sdk.util.C3685f0;
import com.fyber.inneractive.sdk.util.C3691g;
import com.fyber.inneractive.sdk.util.C3724q0;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.c */
public class C2990c {

    /* renamed from: a */
    public IAmraidWebViewController f10223a;

    /* renamed from: b */
    public C3764d.C3771g f10224b = C3764d.C3771g.INLINE;

    /* renamed from: c */
    public UnitDisplayType f10225c;

    /* renamed from: d */
    public C3764d.C3768d f10226d = C3764d.C3768d.ENABLED;

    /* renamed from: e */
    public boolean f10227e;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.c$a */
    public static /* synthetic */ class C2991a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10228a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10229b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|5|6|7|8|9|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.model.vast.g[] r0 = com.fyber.inneractive.sdk.model.vast.C2840g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10229b = r0
                r1 = 1
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r2 = f10229b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r2 = f10229b     // Catch:{ NoSuchFieldError -> 0x0017 }
                r3 = 3
                r2[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10228a = r2
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r1 = f10228a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C2990c.C2991a.<clinit>():void");
        }
    }

    public C2990c(Context context, UnitDisplayType unitDisplayType, boolean z, int i, int i2, C2703z zVar, C2840g gVar) {
        mo13833a(unitDisplayType, z);
        try {
            this.f10223a = new IAmraidWebViewController(context, C3691g.m9936a(unitDisplayType, IAConfigManager.m6632b().mo13276a()), this.f10224b, this.f10226d, C3764d.C3772h.AD_CONTROLLED, true, (C2816a) null);
            mo13834a(gVar);
            C3685f0.m9927a().mo15349a(context, (View) this.f10223a.mo15405a(), (C3685f0.C3690e) this.f10223a);
            this.f10223a.mo15413c();
            C3724q0 a = C3631g.m9669a(i, i2, zVar);
            this.f10223a.setAdDefaultSize(a.f12915a, a.f12916b);
        } catch (Throwable unused) {
            this.f10223a = null;
        }
    }

    /* renamed from: a */
    public void mo13833a(UnitDisplayType unitDisplayType, boolean z) {
        this.f10225c = unitDisplayType;
        this.f10227e = z;
        int i = C2991a.f10228a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            this.f10226d = C3764d.C3768d.ENABLED;
            if (z) {
                this.f10224b = C3764d.C3771g.INTERSTITIAL;
                return;
            }
            return;
        }
        this.f10226d = C3764d.C3768d.ENABLED;
    }

    /* renamed from: a */
    public final void mo13834a(C2840g gVar) {
        C3762c cVar = this.f10223a.f12957b;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            cVar.setId(C2524R.C2526id.inneractive_vast_endcard_gif);
        } else if (ordinal == 1) {
            cVar.setId(C2524R.C2526id.inneractive_vast_endcard_iframe);
        } else if (ordinal == 2) {
            cVar.setId(C2524R.C2526id.inneractive_vast_endcard_html);
        }
    }
}
