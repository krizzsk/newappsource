package p190o1;

import android.content.Context;
import java.util.concurrent.Callable;
import p190o1.C5917k;

/* renamed from: o1.g */
public final class C5913g implements Callable<C5917k.C5918a> {

    /* renamed from: b */
    public final /* synthetic */ String f18991b;

    /* renamed from: c */
    public final /* synthetic */ Context f18992c;

    /* renamed from: d */
    public final /* synthetic */ C5912f f18993d;

    /* renamed from: e */
    public final /* synthetic */ int f18994e;

    public C5913g(String str, Context context, C5912f fVar, int i) {
        this.f18991b = str;
        this.f18992c = context;
        this.f18993d = fVar;
        this.f18994e = i;
    }

    public final Object call() throws Exception {
        return C5917k.m14392a(this.f18991b, this.f18992c, this.f18993d, this.f18994e);
    }
}
