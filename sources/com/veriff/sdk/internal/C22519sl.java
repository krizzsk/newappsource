package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.veriff.sdk.internal.C22517sk;
import hd0.C23449i;
import java.util.Objects;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.layouts.VeriffButton;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.sl */
public class C22519sl extends RelativeLayout implements C22517sk {

    /* renamed from: a */
    private final C22658wj f56817a;

    public C22519sl(Context context, C21616ex exVar, C22700xq xqVar, C22517sk.C22518a aVar) {
        super(context);
        C22658wj a = C22658wj.m55227a(LayoutInflater.from(context), this, true);
        this.f56817a = a;
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        a.f57308b.f57097a.setIndeterminateDrawable(xqVar.mo57124k());
        a.f57308b.f57099c.setText(exVar.mo54698ap());
        a.f57308b.f57098b.setText(exVar.mo54699aq());
        a.f57307a.f57095e.setText(exVar.mo54698ap());
        a.f57307a.f57092b.setText(exVar.mo54666aJ());
        a.f57307a.f57093c.setText(exVar.mo54667aK());
        a.f57307a.f57091a.setText(exVar.mo54715bE());
        a.f57307a.f57094d.setImageDrawable(xqVar.mo57112a(R$drawable.vrff_ic_error_network));
        VeriffButton veriffButton = a.f57307a.f57091a;
        Objects.requireNonNull(aVar);
        veriffButton.mo60628a(false, (VeriffButton.C24432a) new C23449i(aVar));
    }

    /* renamed from: a */
    public void mo56644a() {
        this.f56817a.f57308b.mo56987a().setVisibility(0);
        this.f56817a.f57307a.mo56986a().setVisibility(8);
    }

    /* renamed from: b */
    public void mo56645b() {
        this.f56817a.f57308b.mo56987a().setVisibility(8);
        this.f56817a.f57307a.mo56986a().setVisibility(0);
    }

    /* renamed from: c */
    public void mo56646c() {
    }

    public View getView() {
        return this;
    }

    public void setCurrentStep(int i) {
    }
}
