package c70;

import c70.C13756i;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.net.HttpURLConnection;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;

/* renamed from: c70.h */
public final class C13755h implements C13756i.C13768l {

    /* renamed from: a */
    public final /* synthetic */ C20437h f33866a;

    public C13755h(C20437h hVar) {
        this.f33866a = hVar;
    }

    /* renamed from: a */
    public final void mo40674a(C20431c<?, ?> cVar, boolean z) {
        C20437h hVar = this.f33866a;
        if (hVar != null) {
            hVar.mo313a(cVar, z);
        }
    }

    /* renamed from: c */
    public final void mo40675c(C20431c<?, ?> cVar, C20436g<?, ?> gVar) {
        C20437h hVar = this.f33866a;
        if (hVar != null) {
            hVar.mo21408k(cVar, gVar);
        }
    }

    /* renamed from: d */
    public final boolean mo40676d(C20431c<?, ?> cVar, IOException iOException) {
        C20437h hVar = this.f33866a;
        return hVar != null && hVar.mo316d(cVar, iOException);
    }

    /* renamed from: e */
    public final boolean mo40677e(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, ServerException serverException) {
        C20437h hVar = this.f33866a;
        return hVar != null && hVar.mo315c(cVar, serverException);
    }

    /* renamed from: f */
    public final boolean mo40678f(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, IOException iOException) {
        C20437h hVar = this.f33866a;
        return hVar != null && hVar.mo319i(cVar, iOException);
    }
}
