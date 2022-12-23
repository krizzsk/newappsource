package com.veriff.sdk.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.vl */
public final class C22630vl {

    /* renamed from: a */
    public final VeriffButton f57091a;

    /* renamed from: b */
    public final VeriffTextView f57092b;

    /* renamed from: c */
    public final VeriffTextView f57093c;

    /* renamed from: d */
    public final ImageView f57094d;

    /* renamed from: e */
    public final VeriffTextView f57095e;

    /* renamed from: f */
    private final RelativeLayout f57096f;

    private C22630vl(RelativeLayout relativeLayout, VeriffButton veriffButton, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, ImageView imageView, VeriffTextView veriffTextView3) {
        this.f57096f = relativeLayout;
        this.f57091a = veriffButton;
        this.f57092b = veriffTextView;
        this.f57093c = veriffTextView2;
        this.f57094d = imageView;
        this.f57095e = veriffTextView3;
    }

    /* renamed from: a */
    public RelativeLayout mo56986a() {
        return this.f57096f;
    }

    /* renamed from: a */
    public static C22630vl m55170a(View view) {
        int i = R$id.upload_failed_btn_retry;
        VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
        if (veriffButton != null) {
            i = R$id.upload_failed_text_big;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.upload_retry_description;
                VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                if (veriffTextView2 != null) {
                    i = R$id.upload_retry_image;
                    ImageView imageView = (ImageView) view.findViewById(i);
                    if (imageView != null) {
                        i = R$id.upload_retry_title;
                        VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView3 != null) {
                            return new C22630vl((RelativeLayout) view, veriffButton, veriffTextView, veriffTextView2, imageView, veriffTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
