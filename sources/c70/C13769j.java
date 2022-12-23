package c70;

import c70.C13756i;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.LinkedList;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: c70.j */
public final class C13769j implements C13756i.C13768l {

    /* renamed from: a */
    public final /* synthetic */ LinkedList f33902a;

    /* renamed from: b */
    public final /* synthetic */ IOException[] f33903b;

    /* renamed from: c */
    public final /* synthetic */ ServerException[] f33904c;

    public C13769j(LinkedList linkedList, IOException[] iOExceptionArr, ServerException[] serverExceptionArr) {
        this.f33902a = linkedList;
        this.f33903b = iOExceptionArr;
        this.f33904c = serverExceptionArr;
    }

    /* renamed from: a */
    public final void mo40674a(C20431c<?, ?> cVar, boolean z) {
        synchronized (this.f33902a) {
            this.f33902a.notify();
        }
    }

    /* renamed from: c */
    public final void mo40675c(C20431c<?, ?> cVar, C20436g<?, ?> gVar) {
        synchronized (this.f33902a) {
            this.f33902a.add(gVar);
        }
    }

    /* renamed from: d */
    public final boolean mo40676d(C20431c<?, ?> cVar, IOException iOException) {
        this.f33903b[0] = iOException;
        return true;
    }

    /* renamed from: e */
    public final boolean mo40677e(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, ServerException serverException) {
        this.f33904c[0] = serverException;
        return true;
    }

    /* renamed from: f */
    public final boolean mo40678f(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, IOException iOException) {
        this.f33903b[0] = iOException;
        return true;
    }
}
