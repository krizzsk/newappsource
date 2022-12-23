package p837ue;

import java.io.IOException;
import java.io.Writer;

/* renamed from: ue.d */
public final class C19895d {

    /* renamed from: a */
    public final /* synthetic */ C19896e f50518a;

    public C19895d(C19896e eVar) {
        this.f50518a = eVar;
    }

    /* renamed from: a */
    public final void mo52175a(Writer writer, Object obj) throws IOException {
        C19896e eVar = this.f50518a;
        C19898f fVar = new C19898f(writer, eVar.f50523a, eVar.f50524b, eVar.f50525c, eVar.f50526d);
        fVar.mo52176a(obj);
        fVar.mo52178c();
        fVar.f50529b.flush();
    }
}
