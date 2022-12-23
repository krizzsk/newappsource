package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24465j;

/* renamed from: com.veriff.sdk.internal.xn */
public class C22695xn {

    /* renamed from: a */
    private static final C24465j f57353a = C24465j.m61536a(C22695xn.class);

    /* renamed from: c */
    private final boolean f57354c;

    /* renamed from: d */
    private final C22047nb f57355d;

    /* renamed from: e */
    private final String f57356e;

    public C22695xn(C22047nb nbVar, String str, boolean z) {
        this.f57355d = nbVar;
        this.f57356e = str;
        this.f57354c = z;
    }

    /* renamed from: b */
    private File m55324b(byte[] bArr) throws IOException {
        if (!C21641fr.m52541b()) {
            return this.f57355d.mo55864a(bArr, this.f57356e);
        }
        throw new IOException("Cant run write on main thread");
    }

    /* renamed from: a */
    public File mo57081a(Bitmap bitmap) throws IOException {
        f57353a.mo60705d("Start compressing Bitmap to file");
        if (!C21641fr.m52541b()) {
            try {
                if (this.f57354c) {
                    return m55324b(C24452e.m61505a(bitmap, 90, Bitmap.CompressFormat.WEBP));
                }
                File b = m55324b(C24452e.m61505a(bitmap, 90, Bitmap.CompressFormat.JPEG));
                bitmap.recycle();
                return b;
            } finally {
                bitmap.recycle();
            }
        } else {
            throw new IOException("Cant run write on main thread");
        }
    }

    /* renamed from: a */
    public File mo57082a(byte[] bArr) throws IOException {
        return m55324b(bArr);
    }
}
