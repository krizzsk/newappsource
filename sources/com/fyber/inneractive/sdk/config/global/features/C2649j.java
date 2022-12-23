package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.j */
public class C2649j extends C2644e {

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$a */
    public static /* synthetic */ class C2650a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9305a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9305a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9305a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.features.C2649j.C2650a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$b */
    public enum C2651b {
        NONE("none"),
        OPEN("open");
        

        /* renamed from: a */
        public String f9309a;

        /* access modifiers changed from: public */
        C2651b(String str) {
            this.f9309a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$c */
    public enum C2652c {
        NONE("none"),
        ZOOM_IN("endcard_zoom_in");
        

        /* renamed from: a */
        public String f9313a;

        /* access modifiers changed from: public */
        C2652c(String str) {
            this.f9313a = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.j$d */
    public enum C2653d {
        LEGACY("legacy");
        

        /* renamed from: a */
        public String f9316a;

        /* access modifiers changed from: public */
        C2653d(String str) {
            this.f9316a = str;
        }
    }

    public C2649j() {
        super("video_player");
    }

    /* renamed from: a */
    public int mo13245a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b = mo13240b("prebuffer_interstitial");
            if (b != null) {
                return b.intValue();
            }
            return 3;
        }
        Integer b2 = mo13240b("prebuffer_rewarded");
        if (b2 != null) {
            return b2.intValue();
        }
        return 3;
    }

    /* renamed from: b */
    public C2644e mo13234b() {
        C2649j jVar = new C2649j();
        mo13238a((C2644e) jVar);
        return jVar;
    }

    /* renamed from: c */
    public boolean mo13246c() {
        return mo13239a("cta_text_all_caps", false);
    }

    /* renamed from: d */
    public int mo13247d() {
        Integer b = mo13240b("dl_retries");
        if (b != null) {
            return b.intValue();
        }
        return 10;
    }

    /* renamed from: e */
    public int mo13248e() {
        Integer b = mo13240b("dl_retry_delay");
        if (b != null) {
            return b.intValue();
        }
        return 500;
    }

    /* renamed from: f */
    public int mo13249f() {
        int i;
        Integer b = mo13240b("endcard_animation_duration");
        if (b != null) {
            i = b.intValue();
        } else {
            i = 500;
        }
        if (i < 500 || i > 3000) {
            return 500;
        }
        return i;
    }

    /* renamed from: g */
    public C2652c mo13250g() {
        String a = mo13237a("endcard_animation_type", "none");
        for (C2652c cVar : C2652c.values()) {
            if (a.equalsIgnoreCase(cVar.f9313a)) {
                return cVar;
            }
        }
        return C2652c.NONE;
    }

    /* renamed from: h */
    public int mo13251h() {
        Integer b = mo13240b("max_tries");
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: i */
    public int mo13252i() {
        Integer b = mo13240b("second_checkpoint");
        if (b != null) {
            return b.intValue();
        }
        return 25;
    }
}
