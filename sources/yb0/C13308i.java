package yb0;

import ac0.C7557a;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Timer;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;

/* renamed from: yb0.i */
public final class C13308i {

    /* renamed from: a */
    public final String f33034a;

    /* renamed from: b */
    public final Context f33035b;

    /* renamed from: c */
    public final String f33036c = "BANNER";

    /* renamed from: d */
    public boolean f33037d;

    /* renamed from: e */
    public WeakReference<ViewGroup> f33038e;

    /* renamed from: f */
    public final C13309a f33039f;

    /* renamed from: g */
    public int f33040g;

    /* renamed from: h */
    public long f33041h;

    /* renamed from: i */
    public Rect f33042i;

    /* renamed from: j */
    public Timer f33043j;

    /* renamed from: k */
    public long f33044k;

    /* renamed from: l */
    public long f33045l;

    /* renamed from: m */
    public View f33046m;

    /* renamed from: n */
    public final String f33047n;

    /* renamed from: yb0.i$a */
    public interface C13309a {
    }

    public C13308i(String str, Context context, boolean z, WeakReference weakReference, C13295d dVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f33034a = str;
        this.f33035b = context;
        this.f33037d = z;
        this.f33038e = weakReference;
        this.f33039f = dVar;
        this.f33040g = 50;
        this.f33041h = 1000;
        this.f33044k = 100;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f33047n = str2;
    }

    /* renamed from: a */
    public final void mo40216a(boolean z) {
        if (this.f33043j != null) {
            Logger logger = C7557a.f23040a;
            logger.mo6672i(this.f33036c + "_VIEWABILITY: Stopping Timer, Criteria met: " + z + this.f33047n + "...");
            Timer timer = this.f33043j;
            if (timer != null) {
                timer.cancel();
            }
            this.f33043j = null;
        }
    }
}
