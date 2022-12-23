package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.CornerFrame;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.wg */
public final class C22652wg {

    /* renamed from: a */
    public final ImageView f57255a;

    /* renamed from: b */
    public final VeriffButton f57256b;

    /* renamed from: c */
    public final VeriffTextView f57257c;

    /* renamed from: d */
    public final CornerFrame f57258d;

    /* renamed from: e */
    public final SurfaceView f57259e;

    /* renamed from: f */
    public final VeriffTextView f57260f;

    /* renamed from: g */
    public final VeriffTextView f57261g;

    /* renamed from: h */
    private final View f57262h;

    private C22652wg(View view, ImageView imageView, VeriffButton veriffButton, VeriffTextView veriffTextView, CornerFrame cornerFrame, SurfaceView surfaceView, VeriffTextView veriffTextView2, VeriffTextView veriffTextView3) {
        this.f57262h = view;
        this.f57255a = imageView;
        this.f57256b = veriffButton;
        this.f57257c = veriffTextView;
        this.f57258d = cornerFrame;
        this.f57259e = surfaceView;
        this.f57260f = veriffTextView2;
        this.f57261g = veriffTextView3;
    }

    /* renamed from: a */
    public static C22652wg m55216a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_nfc_intro, viewGroup);
            return m55217a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C22652wg m55217a(View view) {
        int i = R$id.instruction_close;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R$id.instruction_continue;
            VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
            if (veriffButton != null) {
                i = R$id.instruction_title;
                VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
                if (veriffTextView != null) {
                    i = R$id.nfc_animation_frame;
                    CornerFrame cornerFrame = (CornerFrame) view.findViewById(i);
                    if (cornerFrame != null) {
                        i = R$id.nfc_instructions_animation;
                        SurfaceView surfaceView = (SurfaceView) view.findViewById(i);
                        if (surfaceView != null) {
                            i = R$id.nfc_instructions_p1;
                            VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                            if (veriffTextView2 != null) {
                                i = R$id.nfc_instructions_p2;
                                VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                                if (veriffTextView3 != null) {
                                    return new C22652wg(view, imageView, veriffButton, veriffTextView, cornerFrame, surfaceView, veriffTextView2, veriffTextView3);
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
