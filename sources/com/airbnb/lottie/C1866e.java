package com.airbnb.lottie;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.e */
public final class C1866e implements Callable<C1904r<C1867f>> {

    /* renamed from: b */
    public final /* synthetic */ String f6447b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f6448c;

    public C1866e(LottieAnimationView lottieAnimationView, String str) {
        this.f6448c = lottieAnimationView;
        this.f6447b = str;
    }

    public final Object call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f6448c;
        if (!lottieAnimationView.f6428o) {
            return C1868g.m5244b(lottieAnimationView.getContext(), this.f6447b, (String) null);
        }
        Context context = lottieAnimationView.getContext();
        String str = this.f6447b;
        HashMap hashMap = C1868g.f6464a;
        return C1868g.m5244b(context, str, "asset_" + str);
    }
}
