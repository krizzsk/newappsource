package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.d */
public final class C1865d implements Callable<C1904r<C1867f>> {

    /* renamed from: b */
    public final /* synthetic */ int f6445b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f6446c;

    public C1865d(LottieAnimationView lottieAnimationView, int i) {
        this.f6446c = lottieAnimationView;
        this.f6445b = i;
    }

    public final Object call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f6446c;
        if (!lottieAnimationView.f6428o) {
            return C1868g.m5247e(lottieAnimationView.getContext(), this.f6445b, (String) null);
        }
        Context context = lottieAnimationView.getContext();
        int i = this.f6445b;
        return C1868g.m5247e(context, i, C1868g.m5251i(i, context));
    }
}
