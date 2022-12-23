package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22295qc;
import he0.C23454a;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24429e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/document/ViewListener;", "Lcom/veriff/sdk/views/document/ui/DocumentView$Listener;", "Lbf0/d;", "onBackButtonPressed", "onCloseButtonPressed", "Lmobi/lab/veriff/data/UiDocument;", "doc", "onDocumentSelected", "onLanguageClicked", "Lhe0/a;", "Lcom/veriff/sdk/views/document/DocumentMVP$Presenter;", "presenter", "Lhe0/a;", "<init>", "(Lhe0/a;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qa */
public final class C22293qa implements C22295qc.C22299a {

    /* renamed from: a */
    private final C23454a<pr$b> f56251a;

    public C22293qa(C23454a<pr$b> aVar) {
        C24362h.m61211f(aVar, "presenter");
        this.f56251a = aVar;
    }

    /* renamed from: a */
    public void mo56299a() {
        this.f56251a.get().mo56278a(C21719gi.BACK_BUTTON);
    }

    /* renamed from: b */
    public void mo56301b() {
        this.f56251a.get().mo56280b();
    }

    /* renamed from: c */
    public void mo56302c() {
        this.f56251a.get().mo56281c();
    }

    /* renamed from: a */
    public void mo56300a(C24429e eVar) {
        C24362h.m61211f(eVar, "doc");
        this.f56251a.get().mo56279a(eVar);
    }
}
