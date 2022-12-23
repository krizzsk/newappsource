package z10;

import android.graphics.Bitmap;
import java.io.IOException;
import p810sz.C19600l;
import p810sz.C19616q;
import p810sz.C19621u;
import p834tz.C19794a;
import v10.C20065a;

/* renamed from: z10.b */
public final class C20797b extends C19621u<C20065a> {

    /* renamed from: v */
    public final C19600l<Bitmap> f52493v;

    public C20797b(C20799d dVar) {
        super(0);
        this.f52493v = dVar;
    }

    /* renamed from: a */
    public final void mo19622a(Object obj, C19616q qVar) throws IOException {
        C20065a aVar = (C20065a) obj;
        qVar.mo51967q(aVar.f50910b, C19794a.f50324b);
        this.f52493v.write(aVar.f50909a, qVar);
    }
}
