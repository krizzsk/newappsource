package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.wa */
public final class C22646wa {

    /* renamed from: a */
    public final VeriffButton f57208a;

    /* renamed from: b */
    public final VeriffTextView f57209b;

    /* renamed from: c */
    public final ImageView f57210c;

    /* renamed from: d */
    public final ScrollView f57211d;

    /* renamed from: e */
    public final LinearLayout f57212e;

    /* renamed from: f */
    public final VeriffTextView f57213f;

    /* renamed from: g */
    public final VeriffToolbar f57214g;

    /* renamed from: h */
    private final FrameLayout f57215h;

    private C22646wa(FrameLayout frameLayout, VeriffButton veriffButton, VeriffTextView veriffTextView, ImageView imageView, ScrollView scrollView, LinearLayout linearLayout, VeriffTextView veriffTextView2, VeriffToolbar veriffToolbar) {
        this.f57215h = frameLayout;
        this.f57208a = veriffButton;
        this.f57209b = veriffTextView;
        this.f57210c = imageView;
        this.f57211d = scrollView;
        this.f57212e = linearLayout;
        this.f57213f = veriffTextView2;
        this.f57214g = veriffToolbar;
    }

    /* renamed from: a */
    public static C22646wa m55204a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_view_document, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55205a(inflate);
    }

    /* renamed from: a */
    public static C22646wa m55205a(View view) {
        int i = R$id.document_btn_start;
        VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
        if (veriffButton != null) {
            i = R$id.document_instruction;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                i = R$id.document_preselected_icon;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R$id.document_scroll_view;
                    ScrollView scrollView = (ScrollView) view.findViewById(i);
                    if (scrollView != null) {
                        i = R$id.document_selection;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = R$id.document_title;
                            VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                            if (veriffTextView2 != null) {
                                i = R$id.document_toolbar;
                                VeriffToolbar veriffToolbar = (VeriffToolbar) view.findViewById(i);
                                if (veriffToolbar != null) {
                                    return new C22646wa((FrameLayout) view, veriffButton, veriffTextView, imageView, scrollView, linearLayout, veriffTextView2, veriffToolbar);
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
