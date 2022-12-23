package com.veriff.sdk.internal;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import mobi.lab.veriff.R$id;

/* renamed from: com.veriff.sdk.internal.vz */
public final class C22644vz {

    /* renamed from: a */
    public final FrameLayout f57200a;

    /* renamed from: b */
    public final RecyclerView f57201b;

    /* renamed from: c */
    public final EditText f57202c;

    /* renamed from: d */
    public final ImageView f57203d;

    /* renamed from: e */
    public final LinearLayout f57204e;

    /* renamed from: f */
    public final ImageView f57205f;

    /* renamed from: g */
    private final View f57206g;

    private C22644vz(View view, FrameLayout frameLayout, RecyclerView recyclerView, EditText editText, ImageView imageView, LinearLayout linearLayout, ImageView imageView2) {
        this.f57206g = view;
        this.f57200a = frameLayout;
        this.f57201b = recyclerView;
        this.f57202c = editText;
        this.f57203d = imageView;
        this.f57204e = linearLayout;
        this.f57205f = imageView2;
    }

    /* renamed from: a */
    public static C22644vz m55198a(View view) {
        int i = R$id.country_recycler_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = R$id.country_recycler_view;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
            if (recyclerView != null) {
                i = R$id.country_search;
                EditText editText = (EditText) view.findViewById(i);
                if (editText != null) {
                    i = R$id.country_search_clear_icon;
                    ImageView imageView = (ImageView) view.findViewById(i);
                    if (imageView != null) {
                        i = R$id.country_search_container;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = R$id.country_search_icon;
                            ImageView imageView2 = (ImageView) view.findViewById(i);
                            if (imageView2 != null) {
                                return new C22644vz(view, frameLayout, recyclerView, editText, imageView, linearLayout, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
