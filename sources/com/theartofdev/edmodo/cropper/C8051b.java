package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.C8053c;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p034c2.C1759a;

/* renamed from: com.theartofdev.edmodo.cropper.b */
public final class C8051b extends AsyncTask<Void, Void, C8052a> {

    /* renamed from: a */
    public final WeakReference<CropImageView> f24470a;

    /* renamed from: b */
    public final Uri f24471b;

    /* renamed from: c */
    public final Context f24472c;

    /* renamed from: d */
    public final int f24473d;

    /* renamed from: e */
    public final int f24474e;

    public C8051b(CropImageView cropImageView, Uri uri) {
        double d;
        this.f24471b = uri;
        this.f24470a = new WeakReference<>(cropImageView);
        this.f24472c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        if (f > 1.0f) {
            d = (double) (1.0f / f);
        } else {
            d = 1.0d;
        }
        this.f24473d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f24474e = (int) (((double) displayMetrics.heightPixels) * d);
    }

    public final Object doInBackground(Object[] objArr) {
        C8053c.C8055b bVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            C1759a aVar = null;
            if (isCancelled()) {
                return null;
            }
            C8053c.C8054a j = C8053c.m18380j(this.f24472c, this.f24471b, this.f24473d, this.f24474e);
            if (isCancelled()) {
                return null;
            }
            Bitmap bitmap = j.f24487a;
            Context context = this.f24472c;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(this.f24471b);
                if (openInputStream != null) {
                    C1759a aVar2 = new C1759a(openInputStream);
                    try {
                        openInputStream.close();
                    } catch (Exception unused) {
                    }
                    aVar = aVar2;
                }
            } catch (Exception unused2) {
            }
            int i = 0;
            if (aVar != null) {
                int g = aVar.mo6534g(1, "Orientation");
                if (g == 3) {
                    i = 180;
                } else if (g == 6) {
                    i = 90;
                } else if (g == 8) {
                    i = 270;
                }
                bVar = new C8053c.C8055b(bitmap, i);
            } else {
                bVar = new C8053c.C8055b(bitmap, 0);
            }
            return new C8052a(this.f24471b, bVar.f24489a, j.f24488b, bVar.f24490b);
        } catch (Exception e) {
            return new C8052a(this.f24471b, e);
        }
    }

    public final void onPostExecute(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        C8052a aVar = (C8052a) obj;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f24470a.get()) != null) {
                cropImageView.f24374I = null;
                cropImageView.mo25132h();
                if (aVar.f24479e == null) {
                    int i = aVar.f24478d;
                    cropImageView.f24385k = i;
                    cropImageView.mo25116f(aVar.f24476b, 0, aVar.f24475a, aVar.f24477c, i);
                }
                CropImageView.C8045g gVar = cropImageView.f24398x;
                if (gVar != null) {
                    Exception exc = aVar.f24479e;
                    CropImageActivity cropImageActivity = (CropImageActivity) gVar;
                    if (exc == null) {
                        Rect rect = cropImageActivity.f24316z.f24330N;
                        if (rect != null) {
                            cropImageActivity.f24314x.setCropRect(rect);
                        }
                        int i2 = cropImageActivity.f24316z.f24331O;
                        if (i2 > -1) {
                            cropImageActivity.f24314x.setRotatedDegrees(i2);
                        }
                    } else {
                        cropImageActivity.mo25103b1((Uri) null, exc, 1);
                    }
                }
                z = true;
            }
            if (!z && (bitmap = aVar.f24476b) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    public static final class C8052a {

        /* renamed from: a */
        public final Uri f24475a;

        /* renamed from: b */
        public final Bitmap f24476b;

        /* renamed from: c */
        public final int f24477c;

        /* renamed from: d */
        public final int f24478d;

        /* renamed from: e */
        public final Exception f24479e;

        public C8052a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f24475a = uri;
            this.f24476b = bitmap;
            this.f24477c = i;
            this.f24478d = i2;
            this.f24479e = null;
        }

        public C8052a(Uri uri, Exception exc) {
            this.f24475a = uri;
            this.f24476b = null;
            this.f24477c = 0;
            this.f24478d = 0;
            this.f24479e = exc;
        }
    }
}
