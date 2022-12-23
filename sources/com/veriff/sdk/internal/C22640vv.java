package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vv */
public final class C22640vv {

    /* renamed from: b */
    public final FrameLayout f57165b;

    /* renamed from: c */
    public final ImageView f57166c;

    /* renamed from: d */
    public final ImageView f57167d;

    /* renamed from: e */
    public final View f57168e;

    /* renamed from: f */
    public final TextView f57169f;

    /* renamed from: g */
    public final FrameLayout f57170g;

    /* renamed from: h */
    public final FrameLayout f57171h;

    /* renamed from: i */
    public final TextView f57172i;

    /* renamed from: j */
    public final TextView f57173j;

    /* renamed from: l */
    public final C22622vi f57174l;

    private C22640vv(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, View view, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView2, TextView textView3, RelativeLayout relativeLayout, C22622vi viVar, CoordinatorLayout coordinatorLayout2) {
        this.f57165b = frameLayout;
        this.f57166c = imageView;
        this.f57167d = imageView2;
        this.f57168e = view;
        this.f57169f = textView;
        this.f57170g = frameLayout2;
        this.f57171h = frameLayout3;
        this.f57172i = textView2;
        this.f57173j = textView3;
        this.f57174l = viVar;
    }

    /* renamed from: a */
    public static C22640vv m55190a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_camera_legacy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55191a(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = mobi.lab.veriff.R$id.info_sheet;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r1 = mobi.lab.veriff.R$id.camera_info_sheet_overlay;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22640vv m55191a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = mobi.lab.veriff.R$id.camera_button_container
            android.view.View r2 = r0.findViewById(r1)
            r5 = r2
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_capture
            android.view.View r2 = r0.findViewById(r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_close
            android.view.View r2 = r0.findViewById(r1)
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_info
            android.view.View r2 = r0.findViewById(r1)
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_info_sheet_overlay
            android.view.View r9 = r0.findViewById(r1)
            if (r9 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_instruction
            android.view.View r2 = r0.findViewById(r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_preview_container
            android.view.View r2 = r0.findViewById(r1)
            r11 = r2
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_rounded_frame
            android.view.View r2 = r0.findViewById(r1)
            r12 = r2
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_shutter_blocked
            android.view.View r2 = r0.findViewById(r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_title
            android.view.View r2 = r0.findViewById(r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.camera_toolbar
            android.view.View r2 = r0.findViewById(r1)
            r15 = r2
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            if (r15 == 0) goto L_0x0091
            int r1 = mobi.lab.veriff.R$id.info_sheet
            android.view.View r2 = r0.findViewById(r1)
            if (r2 == 0) goto L_0x0091
            com.veriff.sdk.internal.vi r16 = com.veriff.sdk.internal.C22622vi.m55158a(r2)
            r17 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r17 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r17
            com.veriff.sdk.internal.vv r0 = new com.veriff.sdk.internal.vv
            r3 = r0
            r4 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x0091:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22640vv.m55191a(android.view.View):com.veriff.sdk.internal.vv");
    }
}
