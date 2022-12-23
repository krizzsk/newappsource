package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.veriff.sdk.camera.view.PreviewView;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vt */
public final class C22638vt {

    /* renamed from: a */
    public final ImageView f57136a;

    /* renamed from: b */
    public final TextView f57137b;

    /* renamed from: c */
    public final PreviewView f57138c;

    /* renamed from: d */
    public final TextView f57139d;

    /* renamed from: f */
    public final ImageView f57140f;

    /* renamed from: g */
    public final FrameLayout f57141g;

    /* renamed from: h */
    public final ImageView f57142h;

    /* renamed from: j */
    public final FrameLayout f57143j;

    /* renamed from: k */
    public final C22633vo f57144k;

    /* renamed from: l */
    public final ImageView f57145l;

    /* renamed from: m */
    public final TextView f57146m;

    /* renamed from: n */
    public final ProgressBar f57147n;

    /* renamed from: o */
    public final ImageView f57148o;

    /* renamed from: p */
    public final TextView f57149p;

    /* renamed from: q */
    private final View f57150q;

    private C22638vt(View view, ImageView imageView, TextView textView, PreviewView previewView, TextView textView2, LinearLayout linearLayout, ImageView imageView2, FrameLayout frameLayout, ImageView imageView3, LinearLayout linearLayout2, FrameLayout frameLayout2, C22633vo voVar, ImageView imageView4, TextView textView3, ProgressBar progressBar, ImageView imageView5, TextView textView4) {
        this.f57150q = view;
        this.f57136a = imageView;
        this.f57137b = textView;
        this.f57138c = previewView;
        this.f57139d = textView2;
        this.f57140f = imageView2;
        this.f57141g = frameLayout;
        this.f57142h = imageView3;
        this.f57143j = frameLayout2;
        this.f57144k = voVar;
        this.f57145l = imageView4;
        this.f57146m = textView3;
        this.f57147n = progressBar;
        this.f57148o = imageView5;
        this.f57149p = textView4;
    }

    /* renamed from: a */
    public static C22638vt m55186a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_barcode, viewGroup);
            return m55187a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r0 = mobi.lab.veriff.R$id.loading;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22638vt m55187a(android.view.View r19) {
        /*
            r1 = r19
            int r0 = mobi.lab.veriff.R$id.barcode_close
            android.view.View r2 = r1.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.barcode_description
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.barcode_preview
            android.view.View r4 = r1.findViewById(r0)
            com.veriff.sdk.camera.view.PreviewView r4 = (com.veriff.sdk.camera.view.PreviewView) r4
            if (r4 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.barcode_title
            android.view.View r5 = r1.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.camera_button_container
            android.view.View r6 = r1.findViewById(r0)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.camera_card_frame
            android.view.View r7 = r1.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.camera_rounded_frame
            android.view.View r8 = r1.findViewById(r0)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.camera_scan_barcode
            android.view.View r9 = r1.findViewById(r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.camera_toolbar
            android.view.View r10 = r1.findViewById(r0)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.inflow_error_tips
            android.view.View r11 = r1.findViewById(r0)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.loading
            android.view.View r12 = r1.findViewById(r0)
            if (r12 == 0) goto L_0x00ae
            com.veriff.sdk.internal.vo r12 = com.veriff.sdk.internal.C22633vo.m55177a(r12)
            int r0 = mobi.lab.veriff.R$id.scan_failed
            android.view.View r13 = r1.findViewById(r0)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.scan_failed_text
            android.view.View r14 = r1.findViewById(r0)
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.scan_progress
            android.view.View r15 = r1.findViewById(r0)
            android.widget.ProgressBar r15 = (android.widget.ProgressBar) r15
            if (r15 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.scan_success
            android.view.View r16 = r1.findViewById(r0)
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            if (r16 == 0) goto L_0x00ae
            int r0 = mobi.lab.veriff.R$id.scan_success_text
            android.view.View r17 = r1.findViewById(r0)
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x00ae
            com.veriff.sdk.internal.vt r18 = new com.veriff.sdk.internal.vt
            r0 = r18
            r1 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        L_0x00ae:
            android.content.res.Resources r1 = r19.getResources()
            java.lang.String r0 = r1.getResourceName(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22638vt.m55187a(android.view.View):com.veriff.sdk.internal.vt");
    }
}
