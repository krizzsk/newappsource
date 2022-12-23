package com.veriff.sdk.internal;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vk */
public final class C22629vk {

    /* renamed from: a */
    public final RelativeLayout f57087a;

    /* renamed from: b */
    public final ProgressBar f57088b;

    /* renamed from: c */
    public final VeriffTextView f57089c;

    /* renamed from: d */
    public final VeriffTextView f57090d;

    private C22629vk(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, VeriffTextView veriffTextView, VeriffTextView veriffTextView2) {
        this.f57087a = relativeLayout2;
        this.f57088b = progressBar;
        this.f57089c = veriffTextView;
        this.f57090d = veriffTextView2;
    }

    /* renamed from: a */
    public static C22629vk m55169a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R$id.inflow_end_uploading_progress;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            i = R$id.inflow_end_uploading_text;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.inflow_end_uploading_title;
                VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                if (veriffTextView2 != null) {
                    return new C22629vk((RelativeLayout) view, relativeLayout, progressBar, veriffTextView, veriffTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
