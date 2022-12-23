package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.xm */
public class C22694xm {

    /* renamed from: a */
    private static final C24465j f57349a = C24465j.m61538a("xm");

    /* renamed from: b */
    private final byte[] f57350b;

    /* renamed from: c */
    private final C22695xn f57351c;

    /* renamed from: d */
    private final C21910kf f57352d;

    public C22694xm(byte[] bArr, C22695xn xnVar, C21910kf kfVar) {
        this.f57350b = bArr;
        this.f57351c = xnVar;
        this.f57352d = kfVar;
    }

    /* renamed from: a */
    public File mo57080a(Integer num) throws IOException {
        Bitmap a;
        C22693xl xlVar = new C22693xl(this.f57350b, this.f57352d);
        if (num == null) {
            num = xlVar.mo57079a();
        }
        if (num == null || (a = xlVar.mo57078a(num.intValue())) == null) {
            return m55321a();
        }
        return m55322a(a);
    }

    /* renamed from: a */
    private File m55322a(Bitmap bitmap) throws IOException {
        try {
            return this.f57351c.mo57081a(bitmap);
        } catch (IOException e) {
            this.f57352d.mo55690a(e, "ImageSaver.tryToWriteOptimized", C21720gj.camera);
            f57349a.mo60705d("failed to compress Bitmap to file, try to write raw bytes");
            return m55321a();
        }
    }

    /* renamed from: a */
    private File m55321a() throws IOException {
        try {
            return this.f57351c.mo57082a(this.f57350b);
        } catch (IOException e) {
            this.f57352d.mo55690a(e, "ImageSaver.tryToWriteBytes", C21720gj.camera);
            f57349a.mo60705d("failed to write raw photo bytes to file");
            throw e;
        }
    }
}
