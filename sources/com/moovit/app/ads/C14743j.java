package com.moovit.app.ads;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitApplication;

/* renamed from: com.moovit.app.ads.j */
public final /* synthetic */ class C14743j implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C14744k f37526b;

    /* renamed from: c */
    public final /* synthetic */ Application f37527c;

    /* renamed from: d */
    public final /* synthetic */ View f37528d;

    public /* synthetic */ C14743j(C14744k kVar, Application application, View view) {
        this.f37526b = kVar;
        this.f37527c = application;
        this.f37528d = view;
    }

    public final void onFailure(Exception exc) {
        C14744k kVar = this.f37526b;
        Application application = this.f37527c;
        View view = this.f37528d;
        AdSource adSource = C14744k.f37529p;
        kVar.getClass();
        kVar.mo44748n2((MoovitApplication) application, (ViewGroup) view, (String) null);
    }
}
