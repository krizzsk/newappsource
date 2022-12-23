package z10;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import ce0.C21100e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import com.moovit.image.glide.ImageDataException;
import com.moovit.image.glide.data.ImageData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import p025b6.C1489d;
import p025b6.C1492e;
import p072e6.C4566d;
import p146k6.C5498d;
import p311x6.C7160a;
import p977zz.C20938f0;

/* renamed from: z10.g */
public final class C20803g {

    /* renamed from: a */
    public final Resources f52501a;

    /* renamed from: b */
    public final C4566d f52502b;

    /* renamed from: c */
    public final C2205a f52503c;

    /* renamed from: d */
    public final C1492e f52504d;

    /* renamed from: e */
    public final Rect f52505e = new Rect();

    /* renamed from: f */
    public final Rect f52506f = new Rect();

    /* renamed from: g */
    public final Rect f52507g = new Rect();

    /* renamed from: h */
    public final Rect f52508h = new Rect();

    /* renamed from: i */
    public final ByteBuffer f52509i = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());

    /* renamed from: j */
    public final Paint f52510j = new Paint();

    /* renamed from: k */
    public final C20938f0<NinePatchDrawable, Bitmap> f52511k = new C20938f0<>();

    public C20803g(Resources resources, C4566d dVar, C2205a aVar) {
        C21100e.m49373x(resources, "resources");
        this.f52501a = resources;
        C21100e.m49373x(dVar, "bitmapPool");
        this.f52502b = dVar;
        C21100e.m49373x(aVar, "downsampler");
        this.f52503c = aVar;
        C1492e eVar = new C1492e();
        this.f52504d = eVar;
        eVar.f5396b.put(C2205a.f7169f, DecodeFormat.PREFER_ARGB_8888);
    }

    /* renamed from: a */
    public final C20938f0<NinePatchDrawable, Bitmap> mo52923a(Bitmap bitmap) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect rect = this.f52505e;
        Rect rect2 = this.f52506f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 3 || height < 3) {
            throw new IllegalArgumentException("The given bitmap is too small to be a nine-patch");
        }
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        if (rect != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= width) {
                    i5 = 0;
                    break;
                } else if (iArr[i7] == -16777216) {
                    i5 = i7 - 1;
                    break;
                } else {
                    i7++;
                }
            }
            int i8 = width - 1;
            while (true) {
                if (i8 < 0) {
                    i8 = 0;
                    break;
                } else if (iArr[i8] == -16777216) {
                    break;
                } else {
                    i8--;
                }
            }
            int i9 = 0;
            while (true) {
                if (i9 >= height) {
                    i6 = 0;
                    break;
                } else if (iArr[i9 * width] == -16777216) {
                    i6 = i9 - 1;
                    break;
                } else {
                    i9++;
                }
            }
            int i11 = height - 1;
            while (true) {
                if (i11 < 0) {
                    i11 = 0;
                    break;
                } else if (iArr[i11 * width] == -16777216) {
                    break;
                } else {
                    i11--;
                }
            }
            rect.set(i5, i6, i8, i11);
        }
        if (rect2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= width) {
                    i = 0;
                    break;
                } else if (iArr[((height - 1) * width) + i12] == -16777216) {
                    i = i12 - 1;
                    break;
                } else {
                    i12++;
                }
            }
            int i13 = width - 1;
            int i14 = i13;
            while (true) {
                if (i14 < 0) {
                    i2 = 0;
                    break;
                } else if (iArr[((height - 1) * width) + i14] == -16777216) {
                    i2 = i14 + 1;
                    break;
                } else {
                    i14--;
                }
            }
            int i15 = i13 - i2;
            int i16 = 0;
            while (true) {
                if (i16 >= height) {
                    i3 = 0;
                    break;
                } else if (iArr[C16530d.m42021o(i16, width, width, -1)] == -16777216) {
                    i3 = i16 - 1;
                    break;
                } else {
                    i16++;
                }
            }
            int i17 = height - 1;
            int i18 = i17;
            while (true) {
                if (i18 < 0) {
                    i4 = 0;
                    break;
                } else if (iArr[C16530d.m42021o(i18, width, width, -1)] == -16777216) {
                    i4 = i18 + 1;
                    break;
                } else {
                    i18--;
                }
            }
            rect2.set(i, i3, i15, i17 - i4);
        }
        ByteBuffer byteBuffer = this.f52509i;
        Rect rect3 = this.f52505e;
        Rect rect4 = this.f52506f;
        byteBuffer.clear();
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) 9);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(rect4.left);
        byteBuffer.putInt(rect4.right);
        byteBuffer.putInt(rect4.top);
        byteBuffer.putInt(rect4.bottom);
        byteBuffer.putInt(0);
        byteBuffer.putInt(rect3.left);
        byteBuffer.putInt(rect3.right);
        byteBuffer.putInt(rect3.top);
        byteBuffer.putInt(rect3.bottom);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byteBuffer.putInt(1);
        byte[] array = byteBuffer.array();
        S e = this.f52502b.mo20087e(bitmap.getWidth() - 2, bitmap.getHeight() - 2, bitmap.getConfig());
        this.f52507g.set(1, 1, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
        this.f52508h.set(0, 0, bitmap.getWidth() - 2, bitmap.getHeight() - 2);
        new Canvas(e).drawBitmap(bitmap, this.f52507g, this.f52508h, this.f52510j);
        this.f52511k.f52685a = new NinePatchDrawable(this.f52501a, e, array, this.f52506f, (String) null);
        C20938f0<NinePatchDrawable, Bitmap> f0Var = this.f52511k;
        f0Var.f52686b = e;
        return f0Var;
    }

    /* renamed from: b */
    public final C20938f0<NinePatchDrawable, Bitmap> mo52924b(ImageData imageData, C1492e eVar) throws IOException {
        C1492e eVar2 = this.f52504d;
        C1489d dVar = C2205a.f7172i;
        eVar2.f5396b.put(dVar, Boolean.valueOf(Boolean.TRUE.equals(eVar.mo5848c(dVar))));
        ByteBuffer wrap = ByteBuffer.wrap(imageData.f41741d);
        AtomicReference<byte[]> atomicReference = C7160a.f22239a;
        C7160a.C7161a aVar = new C7160a.C7161a(wrap);
        C2205a aVar2 = this.f52503c;
        C5498d a = aVar2.mo11005a(new C2208b.C2210b(aVar2.f7178c, aVar, aVar2.f7179d), Integer.MIN_VALUE, Integer.MIN_VALUE, this.f52504d, C2205a.f7174k);
        if (a != null) {
            try {
                return mo52923a(a.f18042b);
            } finally {
                a.mo10979a();
            }
        } else {
            StringBuilder k = C13555b.m33972k("Image id: ");
            k.append(imageData.f41739b);
            throw new ImageDataException(k.toString());
        }
    }
}
