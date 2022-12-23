package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.C8053c;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.a */
public final class C8049a extends AsyncTask<Void, Void, C8050a> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f24447a;

    /* renamed from: b */
    public final Bitmap f24448b;

    /* renamed from: c */
    public final Uri f24449c;

    /* renamed from: d */
    public final Context f24450d;

    /* renamed from: e */
    public final float[] f24451e;

    /* renamed from: f */
    public final int f24452f;

    /* renamed from: g */
    public final int f24453g;

    /* renamed from: h */
    public final int f24454h;

    /* renamed from: i */
    public final boolean f24455i;

    /* renamed from: j */
    public final int f24456j;

    /* renamed from: k */
    public final int f24457k;

    /* renamed from: l */
    public final int f24458l;

    /* renamed from: m */
    public final int f24459m;

    /* renamed from: n */
    public final boolean f24460n;

    /* renamed from: o */
    public final boolean f24461o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f24462p;

    /* renamed from: q */
    public final Uri f24463q;

    /* renamed from: r */
    public final Bitmap.CompressFormat f24464r;

    /* renamed from: s */
    public final int f24465s;

    public C8049a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        CropImageView cropImageView2 = cropImageView;
        this.f24447a = new WeakReference<>(cropImageView);
        this.f24450d = cropImageView.getContext();
        this.f24448b = bitmap;
        this.f24451e = fArr;
        this.f24449c = null;
        this.f24452f = i;
        this.f24455i = z;
        this.f24456j = i2;
        this.f24457k = i3;
        this.f24458l = i4;
        this.f24459m = i5;
        this.f24460n = z2;
        this.f24461o = z3;
        this.f24462p = requestSizeOptions;
        this.f24463q = uri;
        this.f24464r = compressFormat;
        this.f24465s = i6;
        this.f24453g = 0;
        this.f24454h = 0;
    }

    public final Object doInBackground(Object[] objArr) {
        C8050a aVar;
        C8053c.C8054a aVar2;
        Void[] voidArr = (Void[]) objArr;
        OutputStream outputStream = null;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f24449c;
            if (uri != null) {
                aVar2 = C8053c.m18374d(this.f24450d, uri, this.f24451e, this.f24452f, this.f24453g, this.f24454h, this.f24455i, this.f24456j, this.f24457k, this.f24458l, this.f24459m, this.f24460n, this.f24461o);
            } else {
                Bitmap bitmap = this.f24448b;
                if (bitmap != null) {
                    aVar2 = C8053c.m18376f(bitmap, this.f24451e, this.f24452f, this.f24455i, this.f24456j, this.f24457k, this.f24460n, this.f24461o);
                } else {
                    aVar = new C8050a((Bitmap) null, 1);
                    return aVar;
                }
            }
            Bitmap r = C8053c.m18388r(aVar2.f24487a, this.f24458l, this.f24459m, this.f24462p);
            Uri uri2 = this.f24463q;
            if (uri2 == null) {
                return new C8050a(r, aVar2.f24488b);
            }
            Context context = this.f24450d;
            Bitmap.CompressFormat compressFormat = this.f24464r;
            int i = this.f24465s;
            outputStream = context.getContentResolver().openOutputStream(uri2);
            r.compress(compressFormat, i, outputStream);
            C8053c.m18373c(outputStream);
            r.recycle();
            return new C8050a(this.f24463q, aVar2.f24488b);
        } catch (Exception e) {
            aVar = new C8050a(e);
        } catch (Throwable th) {
            C8053c.m18373c(outputStream);
            throw th;
        }
    }

    public final void onPostExecute(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        C8050a aVar = (C8050a) obj;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f24447a.get()) != null) {
                z = true;
                cropImageView.f24375J = null;
                cropImageView.mo25132h();
                CropImageView.C8041c cVar = cropImageView.f24399y;
                if (cVar != null) {
                    Uri uri = aVar.f24467b;
                    Exception exc = aVar.f24468c;
                    cropImageView.getCropPoints();
                    cropImageView.getCropRect();
                    cropImageView.getWholeImageRect();
                    cropImageView.getRotatedDegrees();
                    ((CropImageActivity) cVar).mo25103b1(uri, exc, aVar.f24469d);
                }
            }
            if (!z && (bitmap = aVar.f24466a) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    public static final class C8050a {

        /* renamed from: a */
        public final Bitmap f24466a;

        /* renamed from: b */
        public final Uri f24467b;

        /* renamed from: c */
        public final Exception f24468c;

        /* renamed from: d */
        public final int f24469d;

        public C8050a(Bitmap bitmap, int i) {
            this.f24466a = bitmap;
            this.f24467b = null;
            this.f24468c = null;
            this.f24469d = i;
        }

        public C8050a(Uri uri, int i) {
            this.f24466a = null;
            this.f24467b = uri;
            this.f24468c = null;
            this.f24469d = i;
        }

        public C8050a(Exception exc) {
            this.f24466a = null;
            this.f24467b = null;
            this.f24468c = exc;
            this.f24469d = 1;
        }
    }

    public C8049a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        CropImageView cropImageView2 = cropImageView;
        this.f24447a = new WeakReference<>(cropImageView);
        this.f24450d = cropImageView.getContext();
        this.f24449c = uri;
        this.f24451e = fArr;
        this.f24452f = i;
        this.f24455i = z;
        this.f24456j = i4;
        this.f24457k = i5;
        this.f24453g = i2;
        this.f24454h = i3;
        this.f24458l = i6;
        this.f24459m = i7;
        this.f24460n = z2;
        this.f24461o = z3;
        this.f24462p = requestSizeOptions;
        this.f24463q = uri2;
        this.f24464r = compressFormat;
        this.f24465s = i8;
        this.f24448b = null;
    }
}
