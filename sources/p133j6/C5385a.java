package p133j6;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p025b6.C1489d;
import p025b6.C1492e;
import p146k6.C5510o;

/* renamed from: j6.a */
public final class C5385a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final C5510o f17700a;

    /* renamed from: b */
    public final int f17701b;

    /* renamed from: c */
    public final int f17702c;

    /* renamed from: d */
    public final DecodeFormat f17703d;

    /* renamed from: e */
    public final DownsampleStrategy f17704e;

    /* renamed from: f */
    public final boolean f17705f;

    /* renamed from: g */
    public final PreferredColorSpace f17706g;

    /* renamed from: j6.a$a */
    public class C5386a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C5385a(int i, int i2, C1492e eVar) {
        boolean z;
        if (C5510o.f18056j == null) {
            synchronized (C5510o.class) {
                if (C5510o.f18056j == null) {
                    C5510o.f18056j = new C5510o();
                }
            }
        }
        this.f17700a = C5510o.f18056j;
        this.f17701b = i;
        this.f17702c = i2;
        this.f17703d = (DecodeFormat) eVar.mo5848c(C2205a.f7169f);
        this.f17704e = (DownsampleStrategy) eVar.mo5848c(DownsampleStrategy.f7153f);
        C1489d dVar = C2205a.f7172i;
        if (eVar.mo5848c(dVar) == null || !((Boolean) eVar.mo5848c(dVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f17705f = z;
        this.f17706g = (PreferredColorSpace) eVar.mo5848c(C2205a.f7170g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z = false;
        if (this.f17700a.mo21382a(this.f17701b, this.f17702c, this.f17705f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f17703d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C5386a());
        Size size = imageInfo.getSize();
        int i = this.f17701b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f17702c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.f17704e.mo10993b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(((float) size.getWidth()) * b);
        int round2 = Math.round(b * ((float) size.getHeight()));
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f17706g;
        if (preferredColorSpace != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
