package p169m6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C2137a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4564b;
import p133j6.C5385a;
import p311x6.C7160a;
import p311x6.C7176l;

/* renamed from: m6.a */
public final class C5704a {

    /* renamed from: a */
    public final List<ImageHeaderParser> f18509a;

    /* renamed from: b */
    public final C4564b f18510b;

    /* renamed from: m6.a$a */
    public static final class C5705a implements C4397l<Drawable> {

        /* renamed from: b */
        public final AnimatedImageDrawable f18511b;

        public C5705a(AnimatedImageDrawable animatedImageDrawable) {
            this.f18511b = animatedImageDrawable;
        }

        /* renamed from: a */
        public final void mo10979a() {
            this.f18511b.stop();
            this.f18511b.clearAnimationCallbacks();
        }

        /* renamed from: b */
        public final Class<Drawable> mo10980b() {
            return Drawable.class;
        }

        /* renamed from: e */
        public final int mo10983e() {
            return C7176l.m16784d(Bitmap.Config.ARGB_8888) * this.f18511b.getIntrinsicHeight() * this.f18511b.getIntrinsicWidth() * 2;
        }

        public final Object get() {
            return this.f18511b;
        }
    }

    /* renamed from: m6.a$b */
    public static final class C5706b implements C1493f<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final C5704a f18512a;

        public C5706b(C5704a aVar) {
            this.f18512a = aVar;
        }

        /* renamed from: a */
        public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
            if (C2137a.m5568c(this.f18512a.f18509a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
            ImageDecoder.Source createSource = ImageDecoder.createSource((ByteBuffer) obj);
            this.f18512a.getClass();
            return C5704a.m14012a(createSource, i, i2, eVar);
        }
    }

    /* renamed from: m6.a$c */
    public static final class C5707c implements C1493f<InputStream, Drawable> {

        /* renamed from: a */
        public final C5704a f18513a;

        public C5707c(C5704a aVar) {
            this.f18513a = aVar;
        }

        /* renamed from: a */
        public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
            C5704a aVar = this.f18513a;
            List<ImageHeaderParser> list = aVar.f18509a;
            if (C2137a.m5567b(aVar.f18510b, (InputStream) obj, list) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
            ImageDecoder.Source createSource = ImageDecoder.createSource(C7160a.m16768b((InputStream) obj));
            this.f18513a.getClass();
            return C5704a.m14012a(createSource, i, i2, eVar);
        }
    }

    public C5704a(List<ImageHeaderParser> list, C4564b bVar) {
        this.f18509a = list;
        this.f18510b = bVar;
    }

    /* renamed from: a */
    public static C5705a m14012a(ImageDecoder.Source source, int i, int i2, C1492e eVar) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new C5385a(i, i2, eVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C5705a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
