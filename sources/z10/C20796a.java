package z10;

import android.graphics.Bitmap;
import android.graphics.PointF;
import ce0.C21100e;
import java.io.IOException;
import java.io.InputStream;
import p025b6.C1492e;
import p025b6.C1493f;
import p810sz.C19615p;
import p810sz.C19620t;
import p834tz.C19794a;
import v10.C20067c;

/* renamed from: z10.a */
public final class C20796a extends C19620t<C20067c> {

    /* renamed from: v */
    public final C1493f<InputStream, Bitmap> f52489v;

    /* renamed from: w */
    public final int f52490w;

    /* renamed from: x */
    public final int f52491x;

    /* renamed from: y */
    public final C1492e f52492y;

    public C20796a(C1493f<InputStream, Bitmap> fVar, int i, int i2, C1492e eVar) {
        super(C20067c.class);
        C21100e.m49373x(fVar, "bitmapDecoder");
        this.f52489v = fVar;
        this.f52490w = i;
        this.f52491x = i2;
        C21100e.m49373x(eVar, "options");
        this.f52492y = eVar;
    }

    /* renamed from: a */
    public final boolean mo19623a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    public final Object mo19624b(C19615p pVar, int i) throws IOException {
        return C20067c.m47570c(this.f52489v.mo5851b(pVar.mo51918a(), this.f52490w, this.f52491x, this.f52492y), (PointF) pVar.mo51962q(C19794a.f50324b));
    }
}
