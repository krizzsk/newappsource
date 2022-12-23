package p190o1;

import android.content.Context;
import java.util.concurrent.Callable;
import p190o1.C5917k;

/* renamed from: o1.i */
public final class C5915i implements Callable<C5917k.C5918a> {

    /* renamed from: b */
    public final /* synthetic */ String f18996b;

    /* renamed from: c */
    public final /* synthetic */ Context f18997c;

    /* renamed from: d */
    public final /* synthetic */ C5912f f18998d;

    /* renamed from: e */
    public final /* synthetic */ int f18999e;

    public C5915i(String str, Context context, C5912f fVar, int i) {
        this.f18996b = str;
        this.f18997c = context;
        this.f18998d = fVar;
        this.f18999e = i;
    }

    public final Object call() throws Exception {
        try {
            return C5917k.m14392a(this.f18996b, this.f18997c, this.f18998d, this.f18999e);
        } catch (Throwable unused) {
            return new C5917k.C5918a(-3);
        }
    }
}
