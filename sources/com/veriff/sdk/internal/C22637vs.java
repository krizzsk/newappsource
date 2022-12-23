package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.veriff.sdk.views.camera.p978ui.MergedUiOverlay;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vs */
public final class C22637vs {

    /* renamed from: a */
    public final ImageView f57126a;

    /* renamed from: c */
    public final ImageView f57127c;

    /* renamed from: d */
    public final TextView f57128d;

    /* renamed from: e */
    public final ImageView f57129e;

    /* renamed from: f */
    public final TextView f57130f;

    /* renamed from: g */
    public final MergedUiOverlay f57131g;

    /* renamed from: h */
    public final FrameLayout f57132h;

    /* renamed from: i */
    public final TextView f57133i;

    /* renamed from: j */
    public final FrameLayout f57134j;

    /* renamed from: k */
    public final FrameLayout f57135k;

    private C22637vs(ConstraintLayout constraintLayout, ImageView imageView, Barrier barrier, ImageView imageView2, TextView textView, ImageView imageView3, TextView textView2, MergedUiOverlay mergedUiOverlay, FrameLayout frameLayout, TextView textView3, FrameLayout frameLayout2, FrameLayout frameLayout3, Guideline guideline) {
        this.f57126a = imageView;
        this.f57127c = imageView2;
        this.f57128d = textView;
        this.f57129e = imageView3;
        this.f57130f = textView2;
        this.f57131g = mergedUiOverlay;
        this.f57132h = frameLayout;
        this.f57133i = textView3;
        this.f57134j = frameLayout2;
        this.f57135k = frameLayout3;
    }

    /* renamed from: a */
    public static C22637vs m55184a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_autocapture, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55185a(inflate);
    }

    /* renamed from: a */
    public static C22637vs m55185a(View view) {
        View view2 = view;
        int i = R$id.auto_capture_border;
        ImageView imageView = (ImageView) view2.findViewById(i);
        if (imageView != null) {
            i = R$id.auto_capture_bottom_barrier;
            Barrier barrier = (Barrier) view2.findViewById(i);
            if (barrier != null) {
                i = R$id.auto_capture_close;
                ImageView imageView2 = (ImageView) view2.findViewById(i);
                if (imageView2 != null) {
                    i = R$id.auto_capture_description;
                    TextView textView = (TextView) view2.findViewById(i);
                    if (textView != null) {
                        i = R$id.auto_capture_do_manual;
                        ImageView imageView3 = (ImageView) view2.findViewById(i);
                        if (imageView3 != null) {
                            i = R$id.auto_capture_fallback;
                            TextView textView2 = (TextView) view2.findViewById(i);
                            if (textView2 != null) {
                                i = R$id.auto_capture_overlay;
                                MergedUiOverlay mergedUiOverlay = (MergedUiOverlay) view2.findViewById(i);
                                if (mergedUiOverlay != null) {
                                    i = R$id.auto_capture_preview_container;
                                    FrameLayout frameLayout = (FrameLayout) view2.findViewById(i);
                                    if (frameLayout != null) {
                                        i = R$id.auto_capture_title;
                                        TextView textView3 = (TextView) view2.findViewById(i);
                                        if (textView3 != null) {
                                            i = R$id.camera_capture_container;
                                            FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(i);
                                            if (frameLayout2 != null) {
                                                i = R$id.clear_area;
                                                FrameLayout frameLayout3 = (FrameLayout) view2.findViewById(i);
                                                if (frameLayout3 != null) {
                                                    i = R$id.vrff_header_guideline;
                                                    Guideline guideline = (Guideline) view2.findViewById(i);
                                                    if (guideline != null) {
                                                        return new C22637vs((ConstraintLayout) view2, imageView, barrier, imageView2, textView, imageView3, textView2, mergedUiOverlay, frameLayout, textView3, frameLayout2, frameLayout3, guideline);
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
