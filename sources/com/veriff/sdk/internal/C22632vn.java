package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.vn */
public final class C22632vn {

    /* renamed from: a */
    public final ImageView f57101a;

    /* renamed from: b */
    public final VeriffTextView f57102b;

    /* renamed from: c */
    private final LinearLayout f57103c;

    private C22632vn(LinearLayout linearLayout, ImageView imageView, VeriffTextView veriffTextView) {
        this.f57103c = linearLayout;
        this.f57101a = imageView;
        this.f57102b = veriffTextView;
    }

    /* renamed from: a */
    public LinearLayout mo56988a() {
        return this.f57103c;
    }

    /* renamed from: a */
    public static C22632vn m55174a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R$layout.vrff_document_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55175a(inflate);
    }

    /* renamed from: a */
    public static C22632vn m55175a(View view) {
        int i = R$id.identification_method_icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R$id.identification_method_title;
            VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
            if (veriffTextView != null) {
                return new C22632vn((LinearLayout) view, imageView, veriffTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
