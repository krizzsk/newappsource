package v70;

import com.amazonaws.http.HttpHeader;
import e70.C4591d;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20432d;
import v70.C13175k;

/* renamed from: v70.j */
public class C13174j<RS extends C13175k<RS, ?>> extends C13179o<RS> {
    public C13174j(C13177m mVar, int i, int i2) {
        super(mVar, C13179o.m33225L(mVar.f32719a, mVar.f32720b, i, i2, ""), C13169f.class);
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity;q=1");
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, "application/jsonx");
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        this.f32721q.f32720b.getClass();
        dVar.mo52633b("x-user-key", C4591d.f15777f.f15778a);
        dVar.mo52633b("x-client-version", "5.37.2.429");
    }

    public C13174j(C13177m mVar, int i, int i2, String str, Class cls) {
        super(mVar, C13179o.m33225L(mVar.f32719a, mVar.f32720b, i, i2, str), cls);
    }
}
