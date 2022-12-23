package p167m3;

import android.content.Context;
import p218q3.C6165a;

/* renamed from: m3.g */
public final class C5677g {

    /* renamed from: e */
    public static C5677g f18452e;

    /* renamed from: a */
    public C5667a f18453a;

    /* renamed from: b */
    public C5668b f18454b;

    /* renamed from: c */
    public C5673e f18455c;

    /* renamed from: d */
    public C5676f f18456d;

    public C5677g(Context context, C6165a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18453a = new C5667a(applicationContext, aVar);
        this.f18454b = new C5668b(applicationContext, aVar);
        this.f18455c = new C5673e(applicationContext, aVar);
        this.f18456d = new C5676f(applicationContext, aVar);
    }

    /* renamed from: a */
    public static synchronized C5677g m13960a(Context context, C6165a aVar) {
        C5677g gVar;
        synchronized (C5677g.class) {
            if (f18452e == null) {
                f18452e = new C5677g(context, aVar);
            }
            gVar = f18452e;
        }
        return gVar;
    }
}
