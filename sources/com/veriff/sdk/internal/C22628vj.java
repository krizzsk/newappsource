package com.veriff.sdk.internal;

import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.vj */
public final class C22628vj {

    /* renamed from: b */
    public final VeriffButton f57080b;

    /* renamed from: c */
    public final VeriffTextView f57081c;

    /* renamed from: d */
    public final VeriffButton f57082d;

    /* renamed from: e */
    public final VeriffTextView f57083e;

    /* renamed from: f */
    public final VeriffToolbar f57084f;

    /* renamed from: g */
    public final RecyclerView f57085g;

    /* renamed from: i */
    private final ScrollView f57086i;

    private C22628vj(ScrollView scrollView, Barrier barrier, VeriffButton veriffButton, VeriffTextView veriffTextView, VeriffButton veriffButton2, VeriffTextView veriffTextView2, VeriffToolbar veriffToolbar, RecyclerView recyclerView, ScrollView scrollView2) {
        this.f57086i = scrollView;
        this.f57080b = veriffButton;
        this.f57081c = veriffTextView;
        this.f57082d = veriffButton2;
        this.f57083e = veriffTextView2;
        this.f57084f = veriffToolbar;
        this.f57085g = recyclerView;
    }

    /* renamed from: a */
    public ScrollView mo56985a() {
        return this.f57086i;
    }

    /* renamed from: a */
    public static C22628vj m55167a(View view) {
        int i = R$id.decision_btn_barrier;
        Barrier barrier = (Barrier) view.findViewById(i);
        if (barrier != null) {
            i = R$id.decision_complete_btn;
            VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
            if (veriffButton != null) {
                i = R$id.decision_text;
                VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
                if (veriffTextView != null) {
                    i = R$id.decision_timeout_btn;
                    VeriffButton veriffButton2 = (VeriffButton) view.findViewById(i);
                    if (veriffButton2 != null) {
                        i = R$id.decision_title;
                        VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView2 != null) {
                            i = R$id.decision_toolbar;
                            VeriffToolbar veriffToolbar = (VeriffToolbar) view.findViewById(i);
                            if (veriffToolbar != null) {
                                i = R$id.layout_decision_items;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                                if (recyclerView != null) {
                                    ScrollView scrollView = (ScrollView) view;
                                    return new C22628vj(scrollView, barrier, veriffButton, veriffTextView, veriffButton2, veriffTextView2, veriffToolbar, recyclerView, scrollView);
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
