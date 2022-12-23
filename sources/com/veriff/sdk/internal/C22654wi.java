package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.veriff.sdk.internal.widgets.ProgressItem;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

/* renamed from: com.veriff.sdk.internal.wi */
public final class C22654wi {

    /* renamed from: a */
    public final ProgressItem f57278a;

    /* renamed from: b */
    public final ProgressItem f57279b;

    /* renamed from: c */
    public final ProgressItem f57280c;

    /* renamed from: d */
    public final ProgressItem f57281d;

    /* renamed from: e */
    public final VeriffTextView f57282e;

    /* renamed from: f */
    public final VeriffTextView f57283f;

    /* renamed from: g */
    public final VeriffTextView f57284g;

    /* renamed from: i */
    public final VeriffTextView f57285i;

    /* renamed from: k */
    public final VeriffButton f57286k;

    /* renamed from: l */
    public final VeriffToolbar f57287l;

    /* renamed from: m */
    private final View f57288m;

    private C22654wi(View view, ProgressItem progressItem, ProgressItem progressItem2, ProgressItem progressItem3, ProgressItem progressItem4, VeriffTextView veriffTextView, VeriffTextView veriffTextView2, VeriffTextView veriffTextView3, ScrollView scrollView, VeriffTextView veriffTextView4, LinearLayout linearLayout, VeriffButton veriffButton, VeriffToolbar veriffToolbar) {
        this.f57288m = view;
        this.f57278a = progressItem;
        this.f57279b = progressItem2;
        this.f57280c = progressItem3;
        this.f57281d = progressItem4;
        this.f57282e = veriffTextView;
        this.f57283f = veriffTextView2;
        this.f57284g = veriffTextView3;
        this.f57285i = veriffTextView4;
        this.f57286k = veriffButton;
        this.f57287l = veriffToolbar;
    }

    /* renamed from: a */
    public static C22654wi m55220a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_scan_tips, viewGroup);
            return m55221a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C22654wi m55221a(View view) {
        int i = R$id.tip1;
        ProgressItem progressItem = (ProgressItem) view.findViewById(i);
        if (progressItem != null) {
            i = R$id.tip2;
            ProgressItem progressItem2 = (ProgressItem) view.findViewById(i);
            if (progressItem2 != null) {
                i = R$id.tip3;
                ProgressItem progressItem3 = (ProgressItem) view.findViewById(i);
                if (progressItem3 != null) {
                    i = R$id.tip4;
                    ProgressItem progressItem4 = (ProgressItem) view.findViewById(i);
                    if (progressItem4 != null) {
                        i = R$id.tips_error_skip_step;
                        VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView != null) {
                            i = R$id.tips_error_skip_step_title;
                            VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                            if (veriffTextView2 != null) {
                                i = R$id.tips_instruction;
                                VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                                if (veriffTextView3 != null) {
                                    i = R$id.tips_scroll;
                                    ScrollView scrollView = (ScrollView) view.findViewById(i);
                                    if (scrollView != null) {
                                        i = R$id.tips_title;
                                        VeriffTextView veriffTextView4 = (VeriffTextView) view.findViewById(i);
                                        if (veriffTextView4 != null) {
                                            i = R$id.tips_title_container;
                                            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                                            if (linearLayout != null) {
                                                i = R$id.tips_try_again;
                                                VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
                                                if (veriffButton != null) {
                                                    i = R$id.toolbar;
                                                    VeriffToolbar veriffToolbar = (VeriffToolbar) view.findViewById(i);
                                                    if (veriffToolbar != null) {
                                                        return new C22654wi(view, progressItem, progressItem2, progressItem3, progressItem4, veriffTextView, veriffTextView2, veriffTextView3, scrollView, veriffTextView4, linearLayout, veriffButton, veriffToolbar);
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
