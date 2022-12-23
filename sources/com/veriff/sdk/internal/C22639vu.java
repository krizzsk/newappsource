package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.veriff.sdk.camera.view.PreviewView;
import com.veriff.sdk.views.camera.p978ui.MergedUiOverlay;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vu */
public final class C22639vu {

    /* renamed from: a */
    public final ImageView f57151a;

    /* renamed from: b */
    public final TextView f57152b;

    /* renamed from: d */
    public final ImageView f57153d;

    /* renamed from: e */
    public final PreviewView f57154e;

    /* renamed from: f */
    public final TextView f57155f;

    /* renamed from: h */
    public final FrameLayout f57156h;

    /* renamed from: i */
    public final ImageView f57157i;

    /* renamed from: j */
    public final FrameLayout f57158j;

    /* renamed from: k */
    public final C22633vo f57159k;

    /* renamed from: m */
    public final ImageView f57160m;

    /* renamed from: n */
    public final TextView f57161n;

    /* renamed from: o */
    public final ProgressBar f57162o;

    /* renamed from: p */
    public final ImageView f57163p;

    /* renamed from: q */
    public final TextView f57164q;

    private C22639vu(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Guideline guideline, ImageView imageView2, PreviewView previewView, TextView textView2, MergedUiOverlay mergedUiOverlay, FrameLayout frameLayout, ImageView imageView3, FrameLayout frameLayout2, C22633vo voVar, ConstraintLayout constraintLayout2, ImageView imageView4, TextView textView3, ProgressBar progressBar, ImageView imageView5, TextView textView4, Guideline guideline2) {
        this.f57151a = imageView;
        this.f57152b = textView;
        this.f57153d = imageView2;
        this.f57154e = previewView;
        this.f57155f = textView2;
        this.f57156h = frameLayout;
        this.f57157i = imageView3;
        this.f57158j = frameLayout2;
        this.f57159k = voVar;
        this.f57160m = imageView4;
        this.f57161n = textView3;
        this.f57162o = progressBar;
        this.f57163p = imageView5;
        this.f57164q = textView4;
    }

    /* renamed from: a */
    public static C22639vu m55188a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_barcode_merged, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55189a(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = mobi.lab.veriff.R$id.loading;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22639vu m55189a(android.view.View r23) {
        /*
            r0 = r23
            int r1 = mobi.lab.veriff.R$id.barcode_close
            android.view.View r2 = r0.findViewById(r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.barcode_description
            android.view.View r2 = r0.findViewById(r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.barcode_description_guide
            android.view.View r2 = r0.findViewById(r1)
            r7 = r2
            androidx.constraintlayout.widget.Guideline r7 = (androidx.constraintlayout.widget.Guideline) r7
            if (r7 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.barcode_doc_illustration
            android.view.View r2 = r0.findViewById(r1)
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.barcode_preview
            android.view.View r2 = r0.findViewById(r1)
            r9 = r2
            com.veriff.sdk.camera.view.PreviewView r9 = (com.veriff.sdk.camera.view.PreviewView) r9
            if (r9 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.barcode_title
            android.view.View r2 = r0.findViewById(r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.camera_overlay_doc
            android.view.View r2 = r0.findViewById(r1)
            r11 = r2
            com.veriff.sdk.views.camera.ui.MergedUiOverlay r11 = (com.veriff.sdk.views.camera.p978ui.MergedUiOverlay) r11
            if (r11 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.clear_area_barcode
            android.view.View r2 = r0.findViewById(r1)
            r12 = r2
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.illustration_image
            android.view.View r2 = r0.findViewById(r1)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.inflow_error_tips
            android.view.View r2 = r0.findViewById(r1)
            r14 = r2
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            if (r14 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.loading
            android.view.View r2 = r0.findViewById(r1)
            if (r2 == 0) goto L_0x00d1
            com.veriff.sdk.internal.vo r15 = com.veriff.sdk.internal.C22633vo.m55177a(r2)
            r16 = r0
            androidx.constraintlayout.widget.ConstraintLayout r16 = (androidx.constraintlayout.widget.ConstraintLayout) r16
            int r1 = mobi.lab.veriff.R$id.scan_failed
            android.view.View r2 = r0.findViewById(r1)
            r17 = r2
            android.widget.ImageView r17 = (android.widget.ImageView) r17
            if (r17 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.scan_failed_text
            android.view.View r2 = r0.findViewById(r1)
            r18 = r2
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.scan_progress
            android.view.View r2 = r0.findViewById(r1)
            r19 = r2
            android.widget.ProgressBar r19 = (android.widget.ProgressBar) r19
            if (r19 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.scan_success
            android.view.View r2 = r0.findViewById(r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.scan_success_text
            android.view.View r2 = r0.findViewById(r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x00d1
            int r1 = mobi.lab.veriff.R$id.vrffHeaderGuideline
            android.view.View r2 = r0.findViewById(r1)
            r22 = r2
            androidx.constraintlayout.widget.Guideline r22 = (androidx.constraintlayout.widget.Guideline) r22
            if (r22 == 0) goto L_0x00d1
            com.veriff.sdk.internal.vu r0 = new com.veriff.sdk.internal.vu
            r3 = r0
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x00d1:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22639vu.m55189a(android.view.View):com.veriff.sdk.internal.vu");
    }
}
