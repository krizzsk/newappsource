package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.j */
public final class C1874j implements Callable<C1904r<C1867f>> {

    /* renamed from: b */
    public final /* synthetic */ WeakReference f6475b;

    /* renamed from: c */
    public final /* synthetic */ Context f6476c;

    /* renamed from: d */
    public final /* synthetic */ int f6477d;

    /* renamed from: e */
    public final /* synthetic */ String f6478e;

    public C1874j(WeakReference weakReference, Context context, int i, String str) {
        this.f6475b = weakReference;
        this.f6476c = context;
        this.f6477d = i;
        this.f6478e = str;
    }

    public final Object call() throws Exception {
        Context context = (Context) this.f6475b.get();
        if (context == null) {
            context = this.f6476c;
        }
        return C1868g.m5247e(context, this.f6477d, this.f6478e);
    }
}
