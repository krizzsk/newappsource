package p146k6;

import android.graphics.Bitmap;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p311x6.C7176l;

/* renamed from: k6.v */
public final class C5518v implements C1493f<Bitmap, Bitmap> {

    /* renamed from: k6.v$a */
    public static final class C5519a implements C4397l<Bitmap> {

        /* renamed from: b */
        public final Bitmap f18076b;

        public C5519a(Bitmap bitmap) {
            this.f18076b = bitmap;
        }

        /* renamed from: a */
        public final void mo10979a() {
        }

        /* renamed from: b */
        public final Class<Bitmap> mo10980b() {
            return Bitmap.class;
        }

        /* renamed from: e */
        public final int mo10983e() {
            return C7176l.m16783c(this.f18076b);
        }

        public final Object get() {
            return this.f18076b;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        return new C5519a((Bitmap) obj);
    }
}
