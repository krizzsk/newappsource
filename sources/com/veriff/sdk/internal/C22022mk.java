package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/ZxingPdf417Detector;", "Lcom/veriff/sdk/internal/ui/barcode/Pdf417Detector;", "", "luminanceBuffer", "", "width", "height", "", "readPdf417", "", "reader", "Ljava/lang/Object;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mk */
public final class C22022mk implements C22020mj {

    /* renamed from: a */
    private final C22765z f55562a = new C22765z();

    public String readPdf417(byte[] bArr, int i, int i2) {
        C24362h.m61211f(bArr, "luminanceBuffer");
        try {
            C22152o a = this.f55562a.mo57458a(new C21737h(new C22645w(new C21987m(bArr, i, i2, 0, 0, i, i2, false))));
            if (a != null) {
                return a.mo56074a();
            }
            return null;
        } catch (C22045n | ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }
}
