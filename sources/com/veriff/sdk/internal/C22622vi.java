package com.veriff.sdk.internal;

import android.view.View;
import android.widget.LinearLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vi */
public final class C22622vi {

    /* renamed from: a */
    public final LinearLayout f57065a;

    /* renamed from: c */
    public final VeriffTextView f57066c;

    /* renamed from: d */
    private final LinearLayout f57067d;

    private C22622vi(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, VeriffTextView veriffTextView) {
        this.f57067d = linearLayout;
        this.f57065a = linearLayout2;
        this.f57066c = veriffTextView;
    }

    /* renamed from: a */
    public LinearLayout mo56975a() {
        return this.f57067d;
    }

    /* renamed from: a */
    public static C22622vi m55158a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R$id.info_tag_container;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
        if (linearLayout2 != null) {
            i = R$id.info_tag_title;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                return new C22622vi((LinearLayout) view, linearLayout, linearLayout2, veriffTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
