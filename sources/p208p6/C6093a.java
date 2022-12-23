package p208p6;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p025b6.C1492e;
import p060d6.C4397l;
import p157l6.C5630b;

/* renamed from: p6.a */
public final class C6093a implements C6095c<Bitmap, byte[]> {

    /* renamed from: b */
    public final Bitmap.CompressFormat f19352b = Bitmap.CompressFormat.JPEG;

    /* renamed from: c */
    public final int f19353c = 100;

    /* renamed from: h */
    public final C4397l<byte[]> mo20049h(C4397l<Bitmap> lVar, C1492e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lVar.get().compress(this.f19352b, this.f19353c, byteArrayOutputStream);
        lVar.mo10979a();
        return new C5630b(byteArrayOutputStream.toByteArray());
    }
}
