package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import mobi.lab.veriff.util.C24465j;
import p034c2.C1759a;

/* renamed from: com.veriff.sdk.internal.xl */
class C22693xl {

    /* renamed from: a */
    private static final C24465j f57346a = C24465j.m61538a("xl");

    /* renamed from: b */
    private final byte[] f57347b;

    /* renamed from: c */
    private final C21910kf f57348c;

    public C22693xl(byte[] bArr, C21910kf kfVar) {
        this.f57347b = bArr;
        this.f57348c = kfVar;
    }

    /* renamed from: b */
    private Bitmap m55316b() {
        return BitmapFactory.decodeStream(new ByteArrayInputStream(this.f57347b));
    }

    /* renamed from: c */
    private C1759a m55318c() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(this.f57347b);
            C1759a aVar = new C1759a((InputStream) byteArrayInputStream);
            byteArrayInputStream.close();
            return aVar;
        } catch (IOException e) {
            this.f57348c.mo55690a(e, "ImageRotator.getExifInterface", C21720gj.camera);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    public Integer mo57079a() {
        C1759a c = m55318c();
        if (c != null) {
            return Integer.valueOf(m55314a(c));
        }
        f57346a.mo60705d("failed to create exif interface...aborting optimization...");
        return null;
    }

    /* renamed from: b */
    private Matrix m55317b(int i) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        return matrix;
    }

    /* renamed from: a */
    public Bitmap mo57078a(int i) {
        Bitmap b = m55316b();
        if (b == null) {
            f57346a.mo60705d("failed to decode Bitmap from InputStream...aborting rotating...");
            return null;
        } else if (i == 0) {
            return b;
        } else {
            return m55315a(b, i);
        }
    }

    /* renamed from: a */
    private int m55314a(C1759a aVar) {
        int g = aVar.mo6534g(1, "Orientation");
        int i = g != 3 ? g != 6 ? g != 8 ? 0 : 270 : 90 : 180;
        C24465j jVar = f57346a;
        jVar.mo60705d("Needed rotation: " + i);
        return i;
    }

    /* renamed from: a */
    private Bitmap m55315a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m55317b(i), true);
        bitmap.recycle();
        return createBitmap;
    }
}
