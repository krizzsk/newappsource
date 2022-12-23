package com.veriff.sdk.internal;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.vr */
public final class C22636vr {

    /* renamed from: a */
    public final VeriffTextView f57116a;

    /* renamed from: b */
    public final VeriffTextView f57117b;

    /* renamed from: c */
    public final VeriffTextView f57118c;

    /* renamed from: d */
    public final ConstraintLayout f57119d;

    /* renamed from: e */
    public final VeriffToolbar f57120e;

    /* renamed from: f */
    public final VeriffTextView f57121f;

    /* renamed from: g */
    public final VeriffButton f57122g;

    /* renamed from: h */
    public final VeriffButton f57123h;

    /* renamed from: k */
    public final ConstraintLayout f57124k;

    /* renamed from: l */
    private final ConstraintLayout f57125l;

    private C22636vr(ConstraintLayout constraintLayout, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, VeriffTextView veriffTextView3, ConstraintLayout constraintLayout2, VeriffToolbar veriffToolbar, VeriffTextView veriffTextView4, VeriffButton veriffButton, VeriffButton veriffButton2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout3) {
        this.f57125l = constraintLayout;
        this.f57116a = veriffTextView;
        this.f57117b = veriffTextView2;
        this.f57118c = veriffTextView3;
        this.f57119d = constraintLayout2;
        this.f57120e = veriffToolbar;
        this.f57121f = veriffTextView4;
        this.f57122g = veriffButton;
        this.f57123h = veriffButton2;
        this.f57124k = constraintLayout3;
    }

    /* renamed from: a */
    public ConstraintLayout mo56990a() {
        return this.f57125l;
    }

    /* renamed from: a */
    public static C22636vr m55182a(View view) {
        int i = R$id.address_description;
        VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
        if (veriffTextView != null) {
            i = R$id.address_info_description;
            VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
            if (veriffTextView2 != null) {
                i = R$id.address_info_title;
                VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                if (veriffTextView3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R$id.address_intro_toolbar;
                    VeriffToolbar veriffToolbar = (VeriffToolbar) view.findViewById(i);
                    if (veriffToolbar != null) {
                        i = R$id.address_title;
                        VeriffTextView veriffTextView4 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView4 != null) {
                            i = R$id.btn_take_photo;
                            VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
                            if (veriffButton != null) {
                                i = R$id.btn_upload_file;
                                VeriffButton veriffButton2 = (VeriffButton) view.findViewById(i);
                                if (veriffButton2 != null) {
                                    i = R$id.info_title_layout;
                                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout != null) {
                                        i = R$id.info_title_layout_image;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
                                        if (appCompatImageView != null) {
                                            i = R$id.layout_info;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(i);
                                            if (constraintLayout2 != null) {
                                                return new C22636vr(constraintLayout, veriffTextView, veriffTextView2, veriffTextView3, constraintLayout, veriffToolbar, veriffTextView4, veriffButton, veriffButton2, relativeLayout, appCompatImageView, constraintLayout2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
