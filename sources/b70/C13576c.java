package b70;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;
import p558ih.C17600b;

/* renamed from: b70.c */
public final class C13576c {

    /* renamed from: a */
    public final C17600b f33534a = new C17600b();

    /* renamed from: b */
    public volatile int[] f33535b = null;

    /* renamed from: c */
    public volatile Bitmap f33536c = null;

    /* renamed from: a */
    public final Bitmap mo40456a(String str, int i, int i2, Map<EncodeHintType, ?> map) {
        C13831b bVar;
        int[] iArr;
        int i3;
        try {
            bVar = this.f33534a.mo22696i(str, BarcodeFormat.QR_CODE, i, i2, map);
        } catch (WriterException unused) {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        int i4 = bVar.f34027b;
        int i5 = bVar.f34028c;
        int i6 = i4 * i5;
        int[] iArr2 = this.f33535b;
        if (iArr2 == null || iArr2.length != i6) {
            int[] iArr3 = new int[i6];
            this.f33535b = iArr3;
            iArr = iArr3;
        } else {
            iArr = iArr2;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = i7 * i4;
            for (int i9 = 0; i9 < i4; i9++) {
                int i11 = i8 + i9;
                if (bVar.mo40764b(i9, i7)) {
                    i3 = -16777216;
                } else {
                    i3 = -1;
                }
                iArr[i11] = i3;
            }
        }
        Bitmap bitmap = this.f33536c;
        if (!(bitmap != null && bitmap.getWidth() == i4 && bitmap.getHeight() == i5)) {
            bitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.RGB_565);
            this.f33536c = bitmap;
        }
        bitmap.setPixels(iArr, 0, i4, 0, 0, i4, i5);
        return bitmap;
    }
}
