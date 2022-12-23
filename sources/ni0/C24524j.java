package ni0;

import ii0.C23608b;
import java.io.IOException;
import ni0.C24510d;
import okhttp3.internal.http2.ErrorCode;
import pi0.C24721f;

/* renamed from: ni0.j */
public final class C24524j extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ C24531o f62099c;

    /* renamed from: d */
    public final /* synthetic */ C24510d.C24518g f62100d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24524j(C24510d.C24518g gVar, Object[] objArr, C24531o oVar) {
        super("OkHttp %s stream %d", objArr);
        this.f62100d = gVar;
        this.f62099c = oVar;
    }

    /* renamed from: a */
    public final void mo58724a() {
        try {
            C24510d.this.f62044c.mo59036b(this.f62099c);
        } catch (IOException e) {
            C24721f fVar = C24721f.f62584a;
            StringBuilder k = C13555b.m33972k("Http2Connection.Listener failure for ");
            k.append(C24510d.this.f62046e);
            fVar.mo61202m(4, k.toString(), e);
            try {
                this.f62099c.mo60779c(ErrorCode.PROTOCOL_ERROR, e);
            } catch (IOException unused) {
            }
        }
    }
}
