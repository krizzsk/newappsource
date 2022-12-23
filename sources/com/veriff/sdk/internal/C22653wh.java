package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Barrier;
import com.veriff.sdk.internal.widgets.StepIndicator;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.wh */
public final class C22653wh {

    /* renamed from: a */
    public final VeriffButton f57263a;

    /* renamed from: b */
    public final VeriffButton f57264b;

    /* renamed from: d */
    public final ImageView f57265d;

    /* renamed from: e */
    public final ProgressBar f57266e;

    /* renamed from: f */
    public final ImageView f57267f;

    /* renamed from: g */
    public final ImageView f57268g;

    /* renamed from: h */
    public final VeriffTextView f57269h;

    /* renamed from: i */
    public final ImageView f57270i;

    /* renamed from: j */
    public final ImageView f57271j;

    /* renamed from: k */
    public final ImageView f57272k;

    /* renamed from: l */
    public final VeriffTextView f57273l;

    /* renamed from: m */
    public final VeriffTextView f57274m;

    /* renamed from: n */
    public final ImageView f57275n;

    /* renamed from: o */
    public final StepIndicator f57276o;

    /* renamed from: p */
    private final View f57277p;

    private C22653wh(View view, VeriffButton veriffButton, VeriffButton veriffButton2, Barrier barrier, ImageView imageView, ProgressBar progressBar, ImageView imageView2, ImageView imageView3, VeriffTextView veriffTextView, ImageView imageView4, ImageView imageView5, ImageView imageView6, VeriffTextView veriffTextView2, VeriffTextView veriffTextView3, ImageView imageView7, StepIndicator stepIndicator) {
        this.f57277p = view;
        this.f57263a = veriffButton;
        this.f57264b = veriffButton2;
        this.f57265d = imageView;
        this.f57266e = progressBar;
        this.f57267f = imageView2;
        this.f57268g = imageView3;
        this.f57269h = veriffTextView;
        this.f57270i = imageView4;
        this.f57271j = imageView5;
        this.f57272k = imageView6;
        this.f57273l = veriffTextView2;
        this.f57274m = veriffTextView3;
        this.f57275n = imageView7;
        this.f57276o = stepIndicator;
    }

    /* renamed from: a */
    public static C22653wh m55218a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_nfc_scanning, viewGroup);
            return m55219a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C22653wh m55219a(View view) {
        View view2 = view;
        int i = R$id.btn_continue;
        VeriffButton veriffButton = (VeriffButton) view2.findViewById(i);
        if (veriffButton != null) {
            i = R$id.btn_skip;
            VeriffButton veriffButton2 = (VeriffButton) view2.findViewById(i);
            if (veriffButton2 != null) {
                i = R$id.button_barrier;
                Barrier barrier = (Barrier) view2.findViewById(i);
                if (barrier != null) {
                    i = R$id.passport;
                    ImageView imageView = (ImageView) view2.findViewById(i);
                    if (imageView != null) {
                        i = R$id.progress;
                        ProgressBar progressBar = (ProgressBar) view2.findViewById(i);
                        if (progressBar != null) {
                            i = R$id.scan_background;
                            ImageView imageView2 = (ImageView) view2.findViewById(i);
                            if (imageView2 != null) {
                                i = R$id.scan_close;
                                ImageView imageView3 = (ImageView) view2.findViewById(i);
                                if (imageView3 != null) {
                                    i = R$id.scan_hint;
                                    VeriffTextView veriffTextView = (VeriffTextView) view2.findViewById(i);
                                    if (veriffTextView != null) {
                                        i = R$id.scan_passport_large;
                                        ImageView imageView4 = (ImageView) view2.findViewById(i);
                                        if (imageView4 != null) {
                                            i = R$id.scan_passport_small;
                                            ImageView imageView5 = (ImageView) view2.findViewById(i);
                                            if (imageView5 != null) {
                                                i = R$id.scan_phone;
                                                ImageView imageView6 = (ImageView) view2.findViewById(i);
                                                if (imageView6 != null) {
                                                    i = R$id.scan_state;
                                                    VeriffTextView veriffTextView2 = (VeriffTextView) view2.findViewById(i);
                                                    if (veriffTextView2 != null) {
                                                        i = R$id.scan_title;
                                                        VeriffTextView veriffTextView3 = (VeriffTextView) view2.findViewById(i);
                                                        if (veriffTextView3 != null) {
                                                            i = R$id.status_icon;
                                                            ImageView imageView7 = (ImageView) view2.findViewById(i);
                                                            if (imageView7 != null) {
                                                                i = R$id.step_indicator;
                                                                StepIndicator stepIndicator = (StepIndicator) view2.findViewById(i);
                                                                if (stepIndicator != null) {
                                                                    return new C22653wh(view, veriffButton, veriffButton2, barrier, imageView, progressBar, imageView2, imageView3, veriffTextView, imageView4, imageView5, imageView6, veriffTextView2, veriffTextView3, imageView7, stepIndicator);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
