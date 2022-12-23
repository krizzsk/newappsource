package p146k6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: k6.a */
public final class C5495a<DataType> implements C1493f<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final C1493f<DataType, Bitmap> f18036a;

    /* renamed from: b */
    public final Resources f18037b;

    public C5495a(Resources resources, C1493f<DataType, Bitmap> fVar) {
        this.f18037b = resources;
        this.f18036a = fVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(DataType datatype, C1492e eVar) throws IOException {
        return this.f18036a.mo5850a(datatype, eVar);
    }

    /* renamed from: b */
    public final C4397l<BitmapDrawable> mo5851b(DataType datatype, int i, int i2, C1492e eVar) throws IOException {
        C4397l<Bitmap> b = this.f18036a.mo5851b(datatype, i, i2, eVar);
        Resources resources = this.f18037b;
        if (b == null) {
            return null;
        }
        return new C5512q(resources, b);
    }
}
