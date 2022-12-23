package com.veriff.sdk.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import com.veriff.sdk.internal.widgets.DropdownButton;
import com.veriff.views.VeriffTextView;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.layouts.VeriffButton;

/* renamed from: com.veriff.sdk.internal.wf */
public final class C22651wf {

    /* renamed from: b */
    public final ImageView f57243b;

    /* renamed from: c */
    public final VeriffTextView f57244c;

    /* renamed from: d */
    public final DropdownButton f57245d;

    /* renamed from: e */
    public final VeriffTextView f57246e;

    /* renamed from: f */
    public final EditText f57247f;

    /* renamed from: g */
    public final VeriffTextView f57248g;

    /* renamed from: h */
    public final DropdownButton f57249h;

    /* renamed from: i */
    public final VeriffTextView f57250i;

    /* renamed from: j */
    public final VeriffButton f57251j;

    /* renamed from: k */
    public final VeriffButton f57252k;

    /* renamed from: l */
    public final VeriffTextView f57253l;

    /* renamed from: m */
    private final View f57254m;

    private C22651wf(View view, Barrier barrier, ImageView imageView, VeriffTextView veriffTextView, DropdownButton dropdownButton, VeriffTextView veriffTextView2, EditText editText, VeriffTextView veriffTextView3, DropdownButton dropdownButton2, VeriffTextView veriffTextView4, VeriffButton veriffButton, VeriffButton veriffButton2, VeriffTextView veriffTextView5) {
        this.f57254m = view;
        this.f57243b = imageView;
        this.f57244c = veriffTextView;
        this.f57245d = dropdownButton;
        this.f57246e = veriffTextView2;
        this.f57247f = editText;
        this.f57248g = veriffTextView3;
        this.f57249h = dropdownButton2;
        this.f57250i = veriffTextView4;
        this.f57251j = veriffButton;
        this.f57252k = veriffButton2;
        this.f57253l = veriffTextView5;
    }

    /* renamed from: a */
    public static C22651wf m55214a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.vrff_view_mrz_info, viewGroup);
            return m55215a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C22651wf m55215a(View view) {
        int i = R$id.buttons_barrier;
        Barrier barrier = (Barrier) view.findViewById(i);
        if (barrier != null) {
            i = R$id.instruction_close;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R$id.instruction_title;
                VeriffTextView veriffTextView = (VeriffTextView) view.findViewById(i);
                if (veriffTextView != null) {
                    i = R$id.mrz_dob;
                    DropdownButton dropdownButton = (DropdownButton) view.findViewById(i);
                    if (dropdownButton != null) {
                        i = R$id.mrz_dob_label;
                        VeriffTextView veriffTextView2 = (VeriffTextView) view.findViewById(i);
                        if (veriffTextView2 != null) {
                            i = R$id.mrz_document_number;
                            EditText editText = (EditText) view.findViewById(i);
                            if (editText != null) {
                                i = R$id.mrz_document_number_label;
                                VeriffTextView veriffTextView3 = (VeriffTextView) view.findViewById(i);
                                if (veriffTextView3 != null) {
                                    i = R$id.mrz_doe;
                                    DropdownButton dropdownButton2 = (DropdownButton) view.findViewById(i);
                                    if (dropdownButton2 != null) {
                                        i = R$id.mrz_doe_label;
                                        VeriffTextView veriffTextView4 = (VeriffTextView) view.findViewById(i);
                                        if (veriffTextView4 != null) {
                                            i = R$id.mrz_info_continue;
                                            VeriffButton veriffButton = (VeriffButton) view.findViewById(i);
                                            if (veriffButton != null) {
                                                i = R$id.mrz_info_skip;
                                                VeriffButton veriffButton2 = (VeriffButton) view.findViewById(i);
                                                if (veriffButton2 != null) {
                                                    i = R$id.mrz_mode_description;
                                                    VeriffTextView veriffTextView5 = (VeriffTextView) view.findViewById(i);
                                                    if (veriffTextView5 != null) {
                                                        return new C22651wf(view, barrier, imageView, veriffTextView, dropdownButton, veriffTextView2, editText, veriffTextView3, dropdownButton2, veriffTextView4, veriffButton, veriffButton2, veriffTextView5);
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
