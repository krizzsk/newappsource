package com.veriff.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vo */
public final class C22633vo {

    /* renamed from: a */
    public final FrameLayout f57104a;

    /* renamed from: b */
    public final ProgressBar f57105b;

    /* renamed from: c */
    private final FrameLayout f57106c;

    private C22633vo(FrameLayout frameLayout, FrameLayout frameLayout2, ProgressBar progressBar) {
        this.f57106c = frameLayout;
        this.f57104a = frameLayout2;
        this.f57105b = progressBar;
    }

    /* renamed from: a */
    public FrameLayout mo56989a() {
        return this.f57106c;
    }

    /* renamed from: a */
    public static C22633vo m55177a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R$id.progressBar;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            return new C22633vo((FrameLayout) view, frameLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
