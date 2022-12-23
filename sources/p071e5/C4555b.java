package p071e5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C1863b;
import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1898n;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import com.airbnb.lottie.model.layer.Layer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import p006a5.C0081b;
import p107h5.C5055c;
import p107h5.C5059g;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7478q;

/* renamed from: e5.b */
public final class C4555b extends C1894a {

    /* renamed from: A */
    public final C7155a f15695A = new C7155a(3);

    /* renamed from: B */
    public final Rect f15696B = new Rect();

    /* renamed from: C */
    public final Rect f15697C = new Rect();

    /* renamed from: D */
    public C7478q f15698D;

    /* renamed from: E */
    public C7478q f15699E;

    public C4555b(C1876l lVar, Layer layer) {
        super(lVar, layer);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        Bitmap t = mo20067t();
        if (t != null) {
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, C5059g.m12910c() * ((float) t.getWidth()), C5059g.m12910c() * ((float) t.getHeight()));
            this.f6620l.mapRect(rectF);
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj == C1903q.f6673K) {
            if (cVar == null) {
                this.f15698D = null;
            } else {
                this.f15698D = new C7478q(cVar, null);
            }
        } else if (obj != C1903q.f6676N) {
        } else {
            if (cVar == null) {
                this.f15699E = null;
            } else {
                this.f15699E = new C7478q(cVar, null);
            }
        }
    }

    /* renamed from: j */
    public final void mo6811j(Canvas canvas, Matrix matrix, int i) {
        Bitmap t = mo20067t();
        if (t != null && !t.isRecycled()) {
            float c = C5059g.m12910c();
            this.f15695A.setAlpha(i);
            C7478q qVar = this.f15698D;
            if (qVar != null) {
                this.f15695A.setColorFilter((ColorFilter) qVar.mo23717f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f15696B.set(0, 0, t.getWidth(), t.getHeight());
            this.f15697C.set(0, 0, (int) (((float) t.getWidth()) * c), (int) (((float) t.getHeight()) * c));
            canvas.drawBitmap(t, this.f15696B, this.f15697C, this.f15695A);
            canvas.restore();
        }
    }

    /* renamed from: t */
    public final Bitmap mo20067t() {
        C0081b bVar;
        C1898n nVar;
        Context context;
        boolean z;
        Bitmap bitmap;
        C7478q qVar = this.f15699E;
        if (qVar != null && (bitmap = (Bitmap) qVar.mo23717f()) != null) {
            return bitmap;
        }
        String str = this.f6622n.f6591g;
        C1876l lVar = this.f6621m;
        if (lVar.getCallback() == null) {
            bVar = null;
        } else {
            C0081b bVar2 = lVar.f6489j;
            if (bVar2 != null) {
                Drawable.Callback callback = lVar.getCallback();
                if (callback != null && (callback instanceof View)) {
                    context = ((View) callback).getContext();
                } else {
                    context = null;
                }
                if (!(context == null && bVar2.f216a == null) && !bVar2.f216a.equals(context)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    lVar.f6489j = null;
                }
            }
            if (lVar.f6489j == null) {
                Drawable.Callback callback2 = lVar.getCallback();
                String str2 = lVar.f6490k;
                lVar.getClass();
                lVar.f6489j = new C0081b(callback2, str2, (C1863b) null, lVar.f6482c.f6452d);
            }
            bVar = lVar.f6489j;
        }
        if (bVar != null) {
            C1898n nVar2 = bVar.f218c.get(str);
            if (nVar2 == null) {
                return null;
            }
            Bitmap bitmap2 = nVar2.f6646d;
            if (bitmap2 != null) {
                return bitmap2;
            }
            bVar.getClass();
            String str3 = nVar2.f6645c;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                try {
                    if (!TextUtils.isEmpty(bVar.f217b)) {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(bVar.f216a.getAssets().open(bVar.f217b + str3), (Rect) null, options);
                            int i = nVar2.f6643a;
                            int i2 = nVar2.f6644b;
                            C5059g.C5060a aVar = C5059g.f17057a;
                            if (!(decodeStream.getWidth() == i && decodeStream.getHeight() == i2)) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, i2, true);
                                decodeStream.recycle();
                                decodeStream = createScaledBitmap;
                            }
                            bVar.mo180a(str, decodeStream);
                            return decodeStream;
                        } catch (IllegalArgumentException e) {
                            C5055c.m12897c("Unable to decode image.", e);
                            return null;
                        }
                    } else {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                } catch (IOException e2) {
                    C5055c.m12897c("Unable to open asset.", e2);
                    return null;
                }
            } else {
                try {
                    byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    bVar.mo180a(str, decodeByteArray);
                    return decodeByteArray;
                } catch (IllegalArgumentException e3) {
                    C5055c.m12897c("data URL did not have correct base64 format.", e3);
                    return null;
                }
            }
        } else {
            C1867f fVar = lVar.f6482c;
            if (fVar == null) {
                nVar = null;
            } else {
                nVar = fVar.f6452d.get(str);
            }
            if (nVar != null) {
                return nVar.f6646d;
            }
            return null;
        }
    }
}
