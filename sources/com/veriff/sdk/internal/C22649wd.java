package com.veriff.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.wd */
public final class C22649wd {

    /* renamed from: c */
    public final ConstraintLayout f57224c;

    /* renamed from: e */
    public final ImageView f57225e;

    /* renamed from: f */
    public final ImageView f57226f;

    /* renamed from: g */
    public final VeriffButton f57227g;

    /* renamed from: h */
    public final VeriffButton f57228h;

    /* renamed from: i */
    public final ImageView f57229i;

    /* renamed from: j */
    public final VeriffTextView f57230j;

    /* renamed from: k */
    public final VeriffTextView f57231k;

    /* renamed from: l */
    public final VeriffToolbar f57232l;

    /* renamed from: m */
    public final TextView f57233m;

    /* renamed from: o */
    public final FrameLayout f57234o;

    /* renamed from: p */
    public final ImageView f57235p;

    /* renamed from: q */
    public final ImageView f57236q;

    private C22649wd(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, ConstraintLayout constraintLayout2, Guideline guideline, ImageView imageView, ImageView imageView2, VeriffButton veriffButton, VeriffButton veriffButton2, ImageView imageView3, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, VeriffToolbar veriffToolbar, TextView textView, Guideline guideline2, FrameLayout frameLayout, ImageView imageView4, ImageView imageView5) {
        this.f57224c = constraintLayout2;
        this.f57225e = imageView;
        this.f57226f = imageView2;
        this.f57227g = veriffButton;
        this.f57228h = veriffButton2;
        this.f57229i = imageView3;
        this.f57230j = veriffTextView;
        this.f57231k = veriffTextView2;
        this.f57232l = veriffToolbar;
        this.f57233m = textView;
        this.f57234o = frameLayout;
        this.f57235p = imageView4;
        this.f57236q = imageView5;
    }

    /* renamed from: a */
    public static C22649wd m55211a(View view) {
        View view2 = view;
        int i = R$id.barrier_visual_feedback;
        Barrier barrier = (Barrier) view2.findViewById(i);
        if (barrier != null) {
            i = R$id.buttons_barrier;
            Barrier barrier2 = (Barrier) view2.findViewById(i);
            if (barrier2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                i = R$id.guide_middle;
                Guideline guideline = (Guideline) view2.findViewById(i);
                if (guideline != null) {
                    i = R$id.icon_not_ok;
                    ImageView imageView = (ImageView) view2.findViewById(i);
                    if (imageView != null) {
                        i = R$id.icon_ok;
                        ImageView imageView2 = (ImageView) view2.findViewById(i);
                        if (imageView2 != null) {
                            i = R$id.inflow_end_btn_continue;
                            VeriffButton veriffButton = (VeriffButton) view2.findViewById(i);
                            if (veriffButton != null) {
                                i = R$id.inflow_end_btn_try_again;
                                VeriffButton veriffButton2 = (VeriffButton) view2.findViewById(i);
                                if (veriffButton2 != null) {
                                    i = R$id.inflow_end_image;
                                    ImageView imageView3 = (ImageView) view2.findViewById(i);
                                    if (imageView3 != null) {
                                        i = R$id.inflow_end_text;
                                        VeriffTextView veriffTextView = (VeriffTextView) view2.findViewById(i);
                                        if (veriffTextView != null) {
                                            i = R$id.inflow_end_title;
                                            VeriffTextView veriffTextView2 = (VeriffTextView) view2.findViewById(i);
                                            if (veriffTextView2 != null) {
                                                i = R$id.inflow_end_toolbar;
                                                VeriffToolbar veriffToolbar = (VeriffToolbar) view2.findViewById(i);
                                                if (veriffToolbar != null) {
                                                    i = R$id.inflow_feedback_label;
                                                    TextView textView = (TextView) view2.findViewById(i);
                                                    if (textView != null) {
                                                        i = R$id.middle_guide;
                                                        Guideline guideline2 = (Guideline) view2.findViewById(i);
                                                        if (guideline2 != null) {
                                                            i = R$id.preview_frame;
                                                            FrameLayout frameLayout = (FrameLayout) view2.findViewById(i);
                                                            if (frameLayout != null) {
                                                                i = R$id.visual_feedback_not_ok;
                                                                ImageView imageView4 = (ImageView) view2.findViewById(i);
                                                                if (imageView4 != null) {
                                                                    i = R$id.visual_feedback_ok;
                                                                    ImageView imageView5 = (ImageView) view2.findViewById(i);
                                                                    if (imageView5 != null) {
                                                                        return new C22649wd(constraintLayout, barrier, barrier2, constraintLayout, guideline, imageView, imageView2, veriffButton, veriffButton2, imageView3, veriffTextView, veriffTextView2, veriffToolbar, textView, guideline2, frameLayout, imageView4, imageView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
