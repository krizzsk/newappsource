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

/* renamed from: com.veriff.sdk.internal.wb */
public final class C22647wb {

    /* renamed from: a */
    public final ImageView f57216a;

    /* renamed from: b */
    public final VeriffTextView f57217b;

    /* renamed from: c */
    public final VeriffButton f57218c;

    /* renamed from: e */
    public final VeriffTextView f57219e;

    /* renamed from: f */
    public final VeriffTextView f57220f;

    private C22647wb(RelativeLayout relativeLayout, ImageView imageView, VeriffTextView veriffTextView, VeriffButton veriffButton, RelativeLayout relativeLayout2, VeriffTextView veriffTextView2, VeriffTextView veriffTextView3) {
        this.f57216a = imageView;
        this.f57217b = veriffTextView;
        this.f57218c = veriffButton;
        this.f57219e = veriffTextView2;
        this.f57220f = veriffTextView3;
    }

    /* renamed from: a */
    public static C22647wb m55206a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_finished, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55207a(inflate);
    }

    /* renamed from: a */
    public static C22647wb m55207a(View view) {
        int i = R$id.complete_image;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R$id.complete_title;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.upload_complete_btn;
                VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
                if (veriffButton != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R$id.upload_finished_description;
                    VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                    if (veriffTextView2 != null) {
                        i = R$id.upload_finished_title;
                        VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView3 != null) {
                            return new C22647wb(relativeLayout, imageView, veriffTextView, veriffButton, relativeLayout, veriffTextView2, veriffTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
