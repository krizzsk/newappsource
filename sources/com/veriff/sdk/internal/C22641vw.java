package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.veriff.sdk.views.camera.p978ui.MergedUiOverlay;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vw */
public final class C22641vw {

    /* renamed from: a */
    public final ImageView f57175a;

    /* renamed from: b */
    public final FrameLayout f57176b;

    /* renamed from: c */
    public final ImageView f57177c;

    /* renamed from: d */
    public final TextView f57178d;

    /* renamed from: e */
    public final MergedUiOverlay f57179e;

    /* renamed from: f */
    public final MergedUiOverlay f57180f;

    /* renamed from: g */
    public final FrameLayout f57181g;

    /* renamed from: h */
    public final TextView f57182h;

    /* renamed from: i */
    public final TextView f57183i;

    /* renamed from: j */
    public final FrameLayout f57184j;

    /* renamed from: k */
    public final FrameLayout f57185k;

    /* renamed from: l */
    public final ImageView f57186l;

    /* renamed from: m */
    public final ImageView f57187m;

    /* renamed from: o */
    public final View f57188o;

    private C22641vw(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView, MergedUiOverlay mergedUiOverlay, MergedUiOverlay mergedUiOverlay2, FrameLayout frameLayout2, TextView textView2, TextView textView3, FrameLayout frameLayout3, FrameLayout frameLayout4, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, View view, Guideline guideline) {
        this.f57175a = imageView;
        this.f57176b = frameLayout;
        this.f57177c = imageView2;
        this.f57178d = textView;
        this.f57179e = mergedUiOverlay;
        this.f57180f = mergedUiOverlay2;
        this.f57181g = frameLayout2;
        this.f57182h = textView2;
        this.f57183i = textView3;
        this.f57184j = frameLayout3;
        this.f57185k = frameLayout4;
        this.f57186l = imageView3;
        this.f57187m = imageView4;
        this.f57188o = view;
    }

    /* renamed from: a */
    public static C22641vw m55192a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_camera_merged, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55193a(inflate);
    }

    /* renamed from: a */
    public static C22641vw m55193a(View view) {
        View view2 = view;
        int i = R$id.camera_capture;
        ImageView imageView = (ImageView) view2.findViewById(i);
        if (imageView != null) {
            i = R$id.camera_capture_container;
            FrameLayout frameLayout = (FrameLayout) view2.findViewById(i);
            if (frameLayout != null) {
                i = R$id.camera_close;
                ImageView imageView2 = (ImageView) view2.findViewById(i);
                if (imageView2 != null) {
                    i = R$id.camera_description;
                    TextView textView = (TextView) view2.findViewById(i);
                    if (textView != null) {
                        i = R$id.camera_overlay_doc;
                        MergedUiOverlay mergedUiOverlay = (MergedUiOverlay) view2.findViewById(i);
                        if (mergedUiOverlay != null) {
                            i = R$id.camera_overlay_portrait;
                            MergedUiOverlay mergedUiOverlay2 = (MergedUiOverlay) view2.findViewById(i);
                            if (mergedUiOverlay2 != null) {
                                i = R$id.camera_preview_container;
                                FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(i);
                                if (frameLayout2 != null) {
                                    i = R$id.camera_shutter_blocked;
                                    TextView textView2 = (TextView) view2.findViewById(i);
                                    if (textView2 != null) {
                                        i = R$id.camera_title;
                                        TextView textView3 = (TextView) view2.findViewById(i);
                                        if (textView3 != null) {
                                            i = R$id.clear_area_doc;
                                            FrameLayout frameLayout3 = (FrameLayout) view2.findViewById(i);
                                            if (frameLayout3 != null) {
                                                i = R$id.clear_area_portrait;
                                                FrameLayout frameLayout4 = (FrameLayout) view2.findViewById(i);
                                                if (frameLayout4 != null) {
                                                    i = R$id.illustration_flip;
                                                    ImageView imageView3 = (ImageView) view2.findViewById(i);
                                                    if (imageView3 != null) {
                                                        i = R$id.illustration_image;
                                                        ImageView imageView4 = (ImageView) view2.findViewById(i);
                                                        if (imageView4 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                                            i = R$id.portrait_doc_frame;
                                                            View findViewById = view2.findViewById(i);
                                                            if (findViewById != null) {
                                                                i = R$id.vrffHeaderGuideline;
                                                                Guideline guideline = (Guideline) view2.findViewById(i);
                                                                if (guideline != null) {
                                                                    return new C22641vw(constraintLayout, imageView, frameLayout, imageView2, textView, mergedUiOverlay, mergedUiOverlay2, frameLayout2, textView2, textView3, frameLayout3, frameLayout4, imageView3, imageView4, constraintLayout, findViewById, guideline);
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
