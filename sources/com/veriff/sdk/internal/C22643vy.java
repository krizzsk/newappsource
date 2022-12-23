package com.veriff.sdk.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.vy */
public final class C22643vy {

    /* renamed from: a */
    public final VeriffButton f57194a;

    /* renamed from: b */
    public final VeriffTextView f57195b;

    /* renamed from: c */
    public final VeriffTextView f57196c;

    /* renamed from: d */
    public final LinearLayout f57197d;

    /* renamed from: f */
    public final VeriffTextView f57198f;

    /* renamed from: g */
    private final View f57199g;

    private C22643vy(View view, VeriffButton veriffButton, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, LinearLayout linearLayout, ImageView imageView, VeriffTextView veriffTextView3) {
        this.f57199g = view;
        this.f57194a = veriffButton;
        this.f57195b = veriffTextView;
        this.f57196c = veriffTextView2;
        this.f57197d = linearLayout;
        this.f57198f = veriffTextView3;
    }

    /* renamed from: a */
    public static C22643vy m55197a(View view) {
        int i = R$id.country_button_continue;
        VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
        if (veriffButton != null) {
            i = R$id.country_instruction;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.country_selected;
                VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                if (veriffTextView2 != null) {
                    i = R$id.country_selected_container;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = R$id.country_selected_icon;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            i = R$id.country_title;
                            VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                            if (veriffTextView3 != null) {
                                return new C22643vy(view, veriffButton, veriffTextView, veriffTextView2, linearLayout, imageView, veriffTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
