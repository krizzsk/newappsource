package p815tg;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import p791sg.C19459a;

@KeepForSdk
/* renamed from: tg.c */
public final class C19673c {
    @KeepForSdk
    /* renamed from: a */
    public static ByteBuffer m47159a(C19459a aVar) throws MlKitException {
        boolean z;
        int i;
        C19459a aVar2 = aVar;
        int i2 = aVar2.f49484f;
        if (i2 == -1) {
            Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(aVar2.f49479a);
            if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
            Bitmap bitmap2 = bitmap;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i3 = width * height;
            int[] iArr = new int[i3];
            bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(((double) height) / 2.0d);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(((double) width) / 2.0d))) + i3);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = 0;
                while (i7 < width) {
                    int i8 = iArr[i4];
                    int i9 = (i8 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    int i11 = (i8 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    int i12 = i8 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    int o = (C16530d.m42021o(i12, 112, (i9 * -38) - (i11 * 74), RecyclerView.C1119a0.FLAG_IGNORE) >> 8) + RecyclerView.C1119a0.FLAG_IGNORE;
                    int i13 = (((((i9 * 112) - (i11 * 94)) - (i12 * 18)) + RecyclerView.C1119a0.FLAG_IGNORE) >> 8) + RecyclerView.C1119a0.FLAG_IGNORE;
                    int i14 = i5 + 1;
                    allocateDirect.put(i5, (byte) Math.min(ValidationUtils.APPBOY_STRING_MAX_LENGTH, (C16530d.m42021o(i12, 25, (i11 * 129) + (i9 * 66), RecyclerView.C1119a0.FLAG_IGNORE) >> 8) + 16));
                    if (i6 % 2 == 0 && i4 % 2 == 0) {
                        int i15 = i3 + 1;
                        allocateDirect.put(i3, (byte) Math.min(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i13));
                        i3 = i15 + 1;
                        allocateDirect.put(i15, (byte) Math.min(ValidationUtils.APPBOY_STRING_MAX_LENGTH, o));
                    }
                    i4++;
                    i7++;
                    i5 = i14;
                }
            }
            return allocateDirect;
        } else if (i2 == 17) {
            return (ByteBuffer) Preconditions.checkNotNull(null);
        } else {
            if (i2 == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.mo51864b());
                int i16 = aVar2.f49481c;
                int i17 = aVar2.f49482d;
                int i18 = i16 * i17;
                int i19 = i18 / 4;
                byte[] bArr = new byte[(i19 + i19 + i18)];
                ByteBuffer buffer = planeArr[1].getBuffer();
                ByteBuffer buffer2 = planeArr[2].getBuffer();
                int position = buffer2.position();
                int limit = buffer.limit();
                buffer2.position(position + 1);
                buffer.limit(limit - 1);
                int i21 = (i18 + i18) / 4;
                if (buffer2.remaining() == i21 - 2 && buffer2.compareTo(buffer) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                buffer2.position(position);
                buffer.limit(limit);
                if (z) {
                    planeArr[0].getBuffer().get(bArr, 0, i18);
                    ByteBuffer buffer3 = planeArr[1].getBuffer();
                    planeArr[2].getBuffer().get(bArr, i18, 1);
                    buffer3.get(bArr, i18 + 1, i21 - 1);
                } else {
                    int i22 = i16;
                    int i23 = i17;
                    byte[] bArr2 = bArr;
                    m47160b(planeArr[0], i22, i23, bArr2, 0, 1);
                    m47160b(planeArr[1], i22, i23, bArr2, i18 + 1, 2);
                    m47160b(planeArr[2], i22, i23, bArr2, i18, 2);
                }
                return ByteBuffer.wrap(bArr);
            } else if (i2 == 842094169) {
                ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(null);
                byteBuffer.rewind();
                int limit2 = byteBuffer.limit();
                int i24 = limit2 / 6;
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(limit2);
                int i25 = 0;
                while (true) {
                    i = i24 * 4;
                    if (i25 >= i) {
                        break;
                    }
                    allocateDirect2.put(i25, byteBuffer.get(i25));
                    i25++;
                }
                for (int i26 = 0; i26 < i24 + i24; i26++) {
                    allocateDirect2.put(i + i26, byteBuffer.get((i26 / 2) + ((i26 % 2) * i24) + i));
                }
                return allocateDirect2;
            } else {
                throw new MlKitException("Unsupported image format", 13);
            }
        }
    }

    /* renamed from: b */
    public static final void m47160b(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride != 0) {
            int i5 = i / (i2 / rowStride);
            int i6 = 0;
            for (int i7 = 0; i7 < rowStride; i7++) {
                int i8 = i6;
                for (int i9 = 0; i9 < i5; i9++) {
                    bArr[i3] = buffer.get(i8);
                    i3 += i4;
                    i8 += plane.getPixelStride();
                }
                i6 += plane.getRowStride();
            }
        }
    }
}
