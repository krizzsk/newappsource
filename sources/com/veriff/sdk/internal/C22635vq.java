package com.veriff.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.veriff.sdk.views.camera.p978ui.MergedUiOverlay;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vq */
public final class C22635vq {

    /* renamed from: c */
    public final ImageView f57109c;

    /* renamed from: d */
    public final FrameLayout f57110d;

    /* renamed from: e */
    public final TextView f57111e;

    /* renamed from: f */
    public final ConstraintLayout f57112f;

    /* renamed from: h */
    public final TextView f57113h;

    /* renamed from: i */
    public final FrameLayout f57114i;

    /* renamed from: j */
    public final FrameLayout f57115j;

    private C22635vq(ConstraintLayout constraintLayout, Barrier barrier, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout2, MergedUiOverlay mergedUiOverlay, TextView textView2, FrameLayout frameLayout2, FrameLayout frameLayout3, Guideline guideline) {
        this.f57109c = imageView2;
        this.f57110d = frameLayout;
        this.f57111e = textView;
        this.f57112f = constraintLayout2;
        this.f57113h = textView2;
        this.f57114i = frameLayout2;
        this.f57115j = frameLayout3;
    }

    /* renamed from: a */
    public static C22635vq m55181a(View view) {
        int i = R$id.address_capture_bottom_barrier;
        Barrier barrier = (Barrier) view.findViewById(i);
        if (barrier != null) {
            i = R$id.address_capture_button;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R$id.address_capture_close;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R$id.address_capture_container;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        i = R$id.address_capture_description;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R$id.address_capture_overlay;
                            MergedUiOverlay mergedUiOverlay = (MergedUiOverlay) view.findViewById(i);
                            if (mergedUiOverlay != null) {
                                i = R$id.address_capture_title;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    i = R$id.camera_capture_container;
                                    FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i);
                                    if (frameLayout2 != null) {
                                        i = R$id.clear_area_address;
                                        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(i);
                                        if (frameLayout3 != null) {
                                            i = R$id.vrff_header_guideline;
                                            Guideline guideline = (Guideline) view.findViewById(i);
                                            if (guideline != null) {
                                                return new C22635vq(constraintLayout, barrier, imageView, imageView2, frameLayout, textView, constraintLayout, mergedUiOverlay, textView2, frameLayout2, frameLayout3, guideline);
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
