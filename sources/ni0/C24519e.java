package ni0;

import ii0.C23608b;
import java.io.IOException;

/* renamed from: ni0.e */
public final class C24519e extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ C24510d f62086c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24519e(C24510d dVar, Object... objArr) {
        super("OkHttp %s ping", objArr);
        this.f62086c = dVar;
    }

    /* renamed from: a */
    public final void mo58724a() {
        C24510d dVar = this.f62086c;
        dVar.getClass();
        try {
            dVar.f62063v.mo60794g(2, 0, false);
        } catch (IOException e) {
            dVar.mo60759c(e);
        }
    }
}
