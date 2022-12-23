package com.veriff.sdk.internal;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vm */
public final class C22631vm {

    /* renamed from: a */
    public final ProgressBar f57097a;

    /* renamed from: b */
    public final VeriffTextView f57098b;

    /* renamed from: c */
    public final VeriffTextView f57099c;

    /* renamed from: d */
    private final RelativeLayout f57100d;

    private C22631vm(RelativeLayout relativeLayout, ProgressBar progressBar, VeriffTextView veriffTextView, VeriffTextView veriffTextView2) {
        this.f57100d = relativeLayout;
        this.f57097a = progressBar;
        this.f57098b = veriffTextView;
        this.f57099c = veriffTextView2;
    }

    /* renamed from: a */
    public RelativeLayout mo56987a() {
        return this.f57100d;
    }

    /* renamed from: a */
    public static C22631vm m55172a(View view) {
        int i = R$id.progressBar;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            i = R$id.uploading_text;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.uploading_title;
                VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                if (veriffTextView2 != null) {
                    return new C22631vm((RelativeLayout) view, progressBar, veriffTextView, veriffTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
