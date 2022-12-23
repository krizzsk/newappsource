package v10;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.moovit.image.model.QrCodeImage;
import java.io.IOException;
import java.util.Map;
import p025b6.C1492e;
import p025b6.C1493f;
import p043ch.C13831b;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;
import p935yg.C20721d;

/* renamed from: v10.f */
public final class C20071f implements C1493f<QrCodeImage, Bitmap> {

    /* renamed from: a */
    public final C20721d f50918a = new C20721d();

    /* renamed from: b */
    public final C4566d f50919b;

    public C20071f(C4566d dVar) {
        this.f50919b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        QrCodeImage qrCodeImage = (QrCodeImage) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        int i3;
        int i4;
        int i5;
        QrCodeImage qrCodeImage = (QrCodeImage) obj;
        BarcodeFormat barcodeFormat = (BarcodeFormat) eVar.mo5848c(QrCodeImage.f41816f);
        if (barcodeFormat == null) {
            barcodeFormat = BarcodeFormat.QR_CODE;
        }
        BarcodeFormat barcodeFormat2 = barcodeFormat;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i == Integer.MIN_VALUE) {
            i = displayMetrics.widthPixels;
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = displayMetrics.heightPixels;
        }
        if (barcodeFormat2 == BarcodeFormat.QR_CODE) {
            i4 = Math.min(i, i2);
            i3 = i4;
        } else {
            i4 = i;
            i3 = i2;
        }
        try {
            C13831b i6 = this.f50918a.mo22696i((String) qrCodeImage.f41804c, barcodeFormat2, i4, i3, (Map<EncodeHintType, ?>) null);
            int i7 = i6.f34027b;
            int i8 = i6.f34028c;
            int[] iArr = new int[(i7 * i8)];
            for (int i9 = 0; i9 < i8; i9++) {
                int i11 = i9 * i7;
                for (int i12 = 0; i12 < i7; i12++) {
                    int i13 = i11 + i12;
                    if (i6.mo40764b(i12, i9)) {
                        i5 = -16777216;
                    } else {
                        i5 = -1;
                    }
                    iArr[i13] = i5;
                }
            }
            Bitmap e = this.f50919b.mo20087e(i4, i3, Bitmap.Config.RGB_565);
            e.setPixels(iArr, 0, i4, 0, 0, i4, i3);
            return C5498d.m13681c(e, this.f50919b);
        } catch (WriterException e2) {
            throw new IOException("Failed to encode QR code", e2);
        }
    }
}
