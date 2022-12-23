package p957zf;

import android.os.Trace;
import p404ce.C13784b;
import p404ce.C13791f;
import p404ce.C13806s;

/* renamed from: zf.a */
public final /* synthetic */ class C20840a implements C13791f {

    /* renamed from: b */
    public final /* synthetic */ String f52560b;

    /* renamed from: c */
    public final /* synthetic */ C13784b f52561c;

    public /* synthetic */ C20840a(String str, C13784b bVar) {
        this.f52560b = str;
        this.f52561c = bVar;
    }

    /* renamed from: m */
    public final Object mo15m(C13806s sVar) {
        String str = this.f52560b;
        C13784b bVar = this.f52561c;
        try {
            Trace.beginSection(str);
            return bVar.f33938f.mo15m(sVar);
        } finally {
            Trace.endSection();
        }
    }
}
