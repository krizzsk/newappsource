package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.we */
public final class C22650we {

    /* renamed from: b */
    public final ImageView f57237b;

    /* renamed from: c */
    public final ImageView f57238c;

    /* renamed from: d */
    public final VeriffTextView f57239d;

    /* renamed from: e */
    public final VeriffTextView f57240e;

    /* renamed from: f */
    public final VeriffButton f57241f;

    /* renamed from: g */
    private final View f57242g;

    private C22650we(View view, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, VeriffButton veriffButton) {
        this.f57242g = view;
        this.f57237b = imageView;
        this.f57238c = imageView2;
        this.f57239d = veriffTextView;
        this.f57240e = veriffTextView2;
        this.f57241f = veriffButton;
    }

    /* renamed from: a */
    public static C22650we m55212a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_instruction, viewGroup);
            return m55213a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C22650we m55213a(View view) {
        int i = R$id.camera_toolbar;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = R$id.instruction_close;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R$id.instruction_image;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R$id.instruction_text;
                    VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
                    if (veriffTextView != null) {
                        i = R$id.instruction_title;
                        VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView2 != null) {
                            i = R$id.instructions_ok_btn;
                            VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
                            if (veriffButton != null) {
                                return new C22650we(view, relativeLayout, imageView, imageView2, veriffTextView, veriffTextView2, veriffButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
