package p146k6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import p169m6.C5709c;
import p169m6.C5712f;

/* renamed from: k6.s */
public final class C5514s implements C1493f<Uri, Bitmap> {

    /* renamed from: a */
    public final C5712f f18068a;

    /* renamed from: b */
    public final C4566d f18069b;

    public C5514s(C5712f fVar, C4566d dVar) {
        this.f18068a = fVar;
        this.f18069b = dVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        C4397l c = this.f18068a.mo21545c((Uri) obj);
        if (c == null) {
            return null;
        }
        return C5505k.m13697a(this.f18069b, (Drawable) ((C5709c) c).get(), i, i2);
    }
}
