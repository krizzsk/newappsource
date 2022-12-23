package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.utility.ViewUtility;
import java.util.regex.Pattern;
import ld0.C24220a;
import od0.C24545c;
import p066e0.C4436j0;

/* renamed from: com.vungle.warren.t */
public final class C23223t {

    /* renamed from: d */
    public static final String f58932d = Pattern.quote("{{{req_width}}}");

    /* renamed from: e */
    public static final String f58933e = Pattern.quote("{{{req_height}}}");

    /* renamed from: f */
    public static final String f58934f = Pattern.quote("{{{width}}}");

    /* renamed from: g */
    public static final String f58935g = Pattern.quote("{{{height}}}");

    /* renamed from: h */
    public static final String f58936h = Pattern.quote("{{{down_x}}}");

    /* renamed from: i */
    public static final String f58937i = Pattern.quote("{{{down_y}}}");

    /* renamed from: j */
    public static final String f58938j = Pattern.quote("{{{up_x}}}");

    /* renamed from: k */
    public static final String f58939k = Pattern.quote("{{{up_y}}}");

    /* renamed from: a */
    public final C24545c f58940a;

    /* renamed from: b */
    public final C24220a f58941b;

    /* renamed from: c */
    public C23224a f58942c;

    /* renamed from: com.vungle.warren.t$a */
    public static class C23224a {

        /* renamed from: a */
        public C23225b f58943a = new C23225b(Integer.MIN_VALUE, Integer.MIN_VALUE);

        /* renamed from: b */
        public C23225b f58944b = new C23225b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: com.vungle.warren.t$b */
    public static class C23225b {

        /* renamed from: a */
        public int f58945a;

        /* renamed from: b */
        public int f58946b;

        public C23225b(int i, int i2) {
            this.f58945a = i;
            this.f58946b = i2;
        }
    }

    /* renamed from: com.vungle.warren.t$c */
    public static class C23226c {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: b */
        public static C23226c f58947b;

        /* renamed from: a */
        public final DisplayMetrics f58948a;

        public C23226c(Context context) {
            Context applicationContext = context.getApplicationContext();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f58948a = displayMetrics;
            ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        }
    }

    public C23223t(C24545c cVar, C4436j0 j0Var) {
        this.f58940a = cVar;
        this.f58941b = j0Var;
    }

    /* renamed from: a */
    public final int mo58319a() {
        AdConfig adConfig;
        if (Vungle.appContext() == null || (adConfig = this.f58940a.f62224w) == null) {
            return 0;
        }
        AdConfig.AdSize a = adConfig.mo58261a();
        if (a != AdConfig.AdSize.VUNGLE_DEFAULT) {
            return ViewUtility.m57276a(a.getHeight(), Vungle.appContext());
        } else if (Vungle.appContext() == null) {
            return 0;
        } else {
            Context appContext = Vungle.appContext();
            if (C23226c.f58947b == null) {
                C23226c.f58947b = new C23226c(appContext);
            }
            return C23226c.f58947b.f58948a.heightPixels;
        }
    }

    /* renamed from: b */
    public final int mo58320b() {
        AdConfig adConfig;
        if (Vungle.appContext() == null || (adConfig = this.f58940a.f62224w) == null) {
            return 0;
        }
        AdConfig.AdSize a = adConfig.mo58261a();
        if (a != AdConfig.AdSize.VUNGLE_DEFAULT) {
            return ViewUtility.m57276a(a.getWidth(), Vungle.appContext());
        } else if (Vungle.appContext() == null) {
            return 0;
        } else {
            Context appContext = Vungle.appContext();
            if (C23226c.f58947b == null) {
                C23226c.f58947b = new C23226c(appContext);
            }
            return C23226c.f58947b.f58948a.widthPixels;
        }
    }
}
