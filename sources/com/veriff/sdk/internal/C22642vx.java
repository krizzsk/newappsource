package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.vx */
public final class C22642vx {

    /* renamed from: a */
    public final Group f57189a;

    /* renamed from: c */
    public final Group f57190c;

    /* renamed from: d */
    public final VeriffToolbar f57191d;

    /* renamed from: e */
    public final C22633vo f57192e;

    /* renamed from: f */
    private final ConstraintLayout f57193f;

    private C22642vx(ConstraintLayout constraintLayout, Group group, ConstraintLayout constraintLayout2, Group group2, VeriffToolbar veriffToolbar, C22633vo voVar) {
        this.f57193f = constraintLayout;
        this.f57189a = group;
        this.f57190c = group2;
        this.f57191d = veriffToolbar;
        this.f57192e = voVar;
    }

    /* renamed from: a */
    public ConstraintLayout mo56991a() {
        return this.f57193f;
    }

    /* renamed from: a */
    public static C22642vx m55194a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_country, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55195a(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r0 = mobi.lab.veriff.R$id.loading_group;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.veriff.sdk.internal.C22642vx m55195a(android.view.View r9) {
        /*
            int r0 = mobi.lab.veriff.R$id.country_confirm_group
            android.view.View r1 = r9.findViewById(r0)
            r4 = r1
            androidx.constraintlayout.widget.Group r4 = (androidx.constraintlayout.widget.Group) r4
            if (r4 == 0) goto L_0x0038
            r5 = r9
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            int r0 = mobi.lab.veriff.R$id.country_search_group
            android.view.View r1 = r9.findViewById(r0)
            r6 = r1
            androidx.constraintlayout.widget.Group r6 = (androidx.constraintlayout.widget.Group) r6
            if (r6 == 0) goto L_0x0038
            int r0 = mobi.lab.veriff.R$id.country_toolbar
            android.view.View r1 = r9.findViewById(r0)
            r7 = r1
            mobi.lab.veriff.layouts.VeriffToolbar r7 = (mobi.lab.veriff.layouts.VeriffToolbar) r7
            if (r7 == 0) goto L_0x0038
            int r0 = mobi.lab.veriff.R$id.loading_group
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L_0x0038
            com.veriff.sdk.internal.vo r8 = com.veriff.sdk.internal.C22633vo.m55177a(r1)
            com.veriff.sdk.internal.vx r9 = new com.veriff.sdk.internal.vx
            r2 = r9
            r3 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0038:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22642vx.m55195a(android.view.View):com.veriff.sdk.internal.vx");
    }
}
