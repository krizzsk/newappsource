package p791sg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import java.nio.ByteBuffer;

/* renamed from: sg.a */
public final class C19459a {

    /* renamed from: a */
    public volatile Bitmap f49479a;

    /* renamed from: b */
    public volatile C19460b f49480b;

    /* renamed from: c */
    public final int f49481c;

    /* renamed from: d */
    public final int f49482d;

    /* renamed from: e */
    public final int f49483e;

    /* renamed from: f */
    public final int f49484f = -1;

    /* renamed from: g */
    public final Matrix f49485g = null;

    public C19459a(Bitmap bitmap, int i) {
        this.f49479a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f49481c = bitmap.getWidth();
        this.f49482d = bitmap.getHeight();
        this.f49483e = i;
    }

    /* renamed from: a */
    public static C19459a m46857a(Image image, int i) {
        int i2;
        boolean z;
        boolean z2;
        C19459a aVar;
        int i3;
        boolean z3;
        Bitmap bitmap;
        Image image2 = image;
        int i4 = i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image2, "Please provide a valid image");
        if (i4 == 0 || i4 == 90 || i4 == 180) {
            i2 = i4;
            z = true;
        } else if (i4 == 270) {
            z = true;
            i2 = 270;
        } else {
            i2 = i4;
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (image.getFormat() == 256 || image.getFormat() == 35) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            i3 = image.getPlanes()[0].getBuffer().limit();
            if (image.getFormat() == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            if (i2 == 0) {
                bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i2);
                bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix, true);
            }
            aVar = new C19459a(bitmap, 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new C19459a(image2, image.getWidth(), image.getHeight(), i2);
            i3 = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        C19459a aVar2 = aVar;
        zzke.zza(zzkc.zzb("vision-common"), image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i3, i2);
        return aVar2;
    }

    @KeepForSdk
    /* renamed from: b */
    public final Image.Plane[] mo51864b() {
        if (this.f49480b == null) {
            return null;
        }
        return this.f49480b.f49486a.getPlanes();
    }

    public C19459a(Image image, int i, int i2, int i3) {
        Preconditions.checkNotNull(image);
        this.f49480b = new C19460b(image);
        this.f49481c = i;
        this.f49482d = i2;
        this.f49483e = i3;
    }
}
