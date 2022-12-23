package p906wz;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.util.SparseArray;
import c70.C13751d;
import ce0.C21100e;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moovit.MoovitApplication;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g30.C4776h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import p329z1.C7418c;
import p638lr.C18268o;
import p786rz.C19387a;
import p824tp.C19721a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20434f;
import p906wz.C20436g;
import p977zz.C20944i0;
import p977zz.C20975x0;

/* renamed from: wz.c */
public abstract class C20431c<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> {

    /* renamed from: n */
    public static volatile C20433e f51756n;

    /* renamed from: o */
    public static volatile C7418c f51757o;

    /* renamed from: p */
    public static volatile SparseArray<String> f51758p;

    /* renamed from: b */
    public final Context f51759b;

    /* renamed from: c */
    public final Uri f51760c;

    /* renamed from: d */
    public final boolean f51761d;

    /* renamed from: e */
    public final Class<RS> f51762e;

    /* renamed from: f */
    public LinkedList f51763f = null;

    /* renamed from: g */
    public List<RS> f51764g;

    /* renamed from: h */
    public boolean f51765h = false;

    /* renamed from: i */
    public int f51766i = 0;

    /* renamed from: j */
    public HttpURLConnection f51767j = null;

    /* renamed from: k */
    public int f51768k = -1;

    /* renamed from: l */
    public BufferedInputStream f51769l = null;

    /* renamed from: m */
    public C20433e f51770m = f51756n;

    public C20431c(Context context, int i, int i2, boolean z, Class<RS> cls) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f51759b = context.getApplicationContext();
        Uri z2 = m48016z(i, context);
        this.f51760c = z2.buildUpon().appendEncodedPath(context.getResources().getString(i2)).build();
        this.f51761d = z;
        this.f51762e = cls;
    }

    /* renamed from: w */
    private void m48015w() throws IOException {
        BufferedInputStream bufferedInputStream = this.f51769l;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
            this.f51769l = null;
        }
        this.f51767j.disconnect();
        try {
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            if (installed != null) {
                installed.flush();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public static Uri m48016z(int i, Context context) {
        String str;
        Resources resources = context.getResources();
        if (f51758p != null) {
            str = f51758p.get(i);
        } else {
            str = null;
        }
        if (str == null) {
            str = resources.getString(i);
        }
        return Uri.parse(str);
    }

    /* renamed from: A */
    public final boolean mo52624A() {
        int i = this.f51768k;
        C20434f.C20435a aVar = C20434f.f51772a;
        if (i == -1 || i / 100 != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo21057B() {
        return this instanceof C18268o;
    }

    /* renamed from: C */
    public RS mo40056C() {
        try {
            RS rs = (C20436g) this.f51762e.newInstance();
            if (rs != null) {
                rs.f51773b = this;
            }
            return rs;
        } catch (InstantiationException e) {
            throw new IllegalStateException("Error creating response object", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Error creating response object", e2);
        }
    }

    /* renamed from: D */
    public void mo21058D() {
        C20433e eVar = this.f51770m;
        if (eVar != null) {
            eVar.mo22690a();
        }
    }

    /* renamed from: E */
    public List<RS> mo21059E() throws IOException, ServerException {
        return Collections.emptyList();
    }

    /* renamed from: F */
    public List<RS> mo22677F() {
        return Collections.emptyList();
    }

    /* renamed from: G */
    public RS mo40051G() throws IOException, BadResponseException, ServerException {
        if (this.f51766i < this.f51764g.size()) {
            if (!mo21057B()) {
                mo21058D();
            }
            RS rs = (C20436g) this.f51764g.get(this.f51766i);
            C20433e eVar = this.f51770m;
            if (eVar != null) {
                eVar.mo22699o(this, rs, true);
            }
            this.f51766i++;
            return rs;
        } else if (mo21057B() && this.f51765h) {
            mo21058D();
            C20433e eVar2 = this.f51770m;
            if (eVar2 != null) {
                eVar2.mo22699o(this, (C20436g) null, true);
            }
            return null;
        } else if (!this.f51765h && this.f51767j == null) {
            throw new IllegalStateException("Attempting to read a response before the request was sent");
        } else if (this.f51769l == null) {
            if (mo21057B()) {
                C20433e eVar3 = this.f51770m;
                if (eVar3 != null) {
                    eVar3.mo22699o(this, (C20436g) null, false);
                }
                return null;
            }
            throw new IllegalStateException("Attempting to read a 2nd response with a non-multi-response request");
        } else if (!mo21057B() || !C19387a.m46669a(this.f51769l)) {
            RS C = mo40056C();
            C.mo40052c(this, this.f51767j, this.f51769l);
            C20433e eVar4 = this.f51770m;
            if (eVar4 != null) {
                eVar4.mo22699o(this, C, false);
            }
            this.f51766i++;
            if (!mo21057B() || C19387a.m46669a(this.f51769l)) {
                m48015w();
                mo21058D();
            }
            return C;
        } else {
            m48015w();
            mo21058D();
            C20433e eVar5 = this.f51770m;
            if (eVar5 != null) {
                eVar5.mo22699o(this, (C20436g) null, false);
            }
            return null;
        }
    }

    /* renamed from: H */
    public void mo5818H() throws IOException, ServerException {
        C20433e eVar = this.f51770m;
        if (eVar != null) {
            eVar.mo22693d();
        }
        List<RS> E = mo21059E();
        for (RS rs : E) {
            rs.f51773b = this;
        }
        this.f51764g = E;
        E.size();
        boolean z = this.f51765h;
        C20433e eVar2 = this.f51770m;
        if (eVar2 != null) {
            eVar2.mo22692c(z);
        }
        if (!this.f51765h) {
            try {
                C20432d dVar = new C20432d();
                mo6590u(dVar);
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(mo49828s(this.f51760c).toString()).openConnection()));
                for (Map.Entry entry : dVar.f51771a.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                mo20116t(httpURLConnection);
                C20433e eVar3 = this.f51770m;
                if (eVar3 != null) {
                    eVar3.mo22694g(this, httpURLConnection);
                }
                if (this.f51761d) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    mo20115K(httpURLConnection, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
                this.f51767j = httpURLConnection;
                this.f51768k = httpURLConnection.getResponseCode();
                C20433e eVar4 = this.f51770m;
                if (eVar4 != null) {
                    eVar4.mo22697k();
                }
                ServerException y = mo40669y(httpURLConnection);
                if (y != null) {
                    C20433e eVar5 = this.f51770m;
                    if (eVar5 != null) {
                        eVar5.mo22698l();
                    }
                    C20433e eVar6 = this.f51770m;
                    if (eVar6 != null) {
                        eVar6.mo22690a();
                    }
                    throw y;
                }
                this.f51769l = mo52630v(httpURLConnection, false);
            } catch (IOException e) {
                List<RS> F = mo22677F();
                for (RS rs2 : F) {
                    rs2.f51773b = this;
                }
                this.f51764g = F;
                C20433e eVar7 = this.f51770m;
                if (eVar7 != null) {
                    eVar7.mo22691b();
                }
                if (this.f51767j != null) {
                    m48015w();
                }
                if (!this.f51765h) {
                    C20433e eVar8 = this.f51770m;
                    if (eVar8 != null) {
                        eVar8.mo22690a();
                    }
                    throw e;
                }
            }
        }
    }

    /* renamed from: I */
    public final ArrayList mo52625I() throws IOException, BadResponseException, ServerException {
        if (mo21057B()) {
            mo5818H();
            ArrayList arrayList = new ArrayList();
            while (true) {
                C20436g G = mo40051G();
                if (G == null) {
                    return arrayList;
                }
                arrayList.add(G);
            }
        } else {
            throw new IllegalStateException("Trying to read multi response in non multi response request");
        }
    }

    /* renamed from: J */
    public final RS mo52626J() throws IOException, BadResponseException, ServerException {
        mo5818H();
        return mo40051G();
    }

    /* renamed from: K */
    public void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
    }

    /* renamed from: p */
    public final void mo52627p(int i, String str) {
        mo52629r(str, String.valueOf(i));
    }

    /* renamed from: q */
    public final void mo52628q(long j) {
        mo52629r("metroRevisionNumber", String.valueOf(j));
    }

    /* renamed from: r */
    public final void mo52629r(String str, String str2) {
        if (this.f51767j == null) {
            C21100e.m49373x(str2, "value");
            if (this.f51763f == null) {
                this.f51763f = new LinkedList();
            }
            this.f51763f.add(new C20944i0(str, str2));
            return;
        }
        throw new IllegalStateException("Can't set a URL parameter after the connection has been opened");
    }

    /* renamed from: s */
    public Uri mo49828s(Uri uri) throws MalformedURLException {
        LinkedList linkedList = this.f51763f;
        if (linkedList == null || linkedList.isEmpty()) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        for (C20944i0 i0Var : this.f51763f) {
            buildUpon.appendQueryParameter((String) i0Var.f52692a, (String) i0Var.f52693b);
        }
        return buildUpon.build();
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setConnectTimeout(2500);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setDoOutput(this.f51761d);
        if (f51757o != null) {
            f51757o.getClass();
        }
    }

    public String toString() {
        return "";
    }

    /* renamed from: u */
    public void mo6590u(C20432d dVar) {
        boolean z;
        if (f51757o != null) {
            C7418c cVar = f51757o;
            cVar.getClass();
            int i = C13751d.f33851b;
            String host = this.f51760c.getHost();
            if (host == null || !host.endsWith("moovitapp.com")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C19721a aVar = ((MoovitApplication) cVar.f22801a).mo44558j().f50171a;
                dVar.mo52633b("CLIENT_VERSION", aVar.f50152c);
                dVar.mo52632a("PHONE_TYPE", aVar.f50159j);
                dVar.mo52633b("App-Id", String.valueOf(aVar.f50158i));
                dVar.mo52633b("API_KEY", aVar.f50155f);
                C19722a0 a0Var = (C19722a0) ((MoovitApplication) cVar.f22801a).mo44557i("USER_CONTEXT");
                if (a0Var != null) {
                    dVar.mo52633b("USER_KEY", a0Var.f50160a.f32925a);
                } else {
                    dVar.mo52633b("Android-Id", C20975x0.m49119f((MoovitApplication) cVar.f22801a));
                }
                C19728f fVar = (C19728f) ((MoovitApplication) cVar.f22801a).mo44557i("METRO_CONTEXT");
                if (fVar != null && a0Var != null && a0Var.f50160a.f32927c.equals(fVar.f50165a.f16126a)) {
                    C4776h hVar = fVar.f50165a;
                    dVar.mo52633b("Metro-Revision-Metro-Id", hVar.f16126a.mo19751c());
                    dVar.mo52633b("Metro-Revision-Number", Long.toString(hVar.f16127b));
                    dVar.mo52633b("Gtfs-Language", hVar.f16128c);
                }
            }
        }
    }

    /* renamed from: v */
    public final BufferedInputStream mo52630v(HttpURLConnection httpURLConnection, boolean z) throws IOException {
        GZIPInputStream gZIPInputStream;
        if (z) {
            gZIPInputStream = httpURLConnection.getErrorStream();
        } else {
            gZIPInputStream = httpURLConnection.getInputStream();
        }
        String contentEncoding = httpURLConnection.getContentEncoding();
        if (contentEncoding == null) {
            contentEncoding = "identity";
        }
        if (!contentEncoding.equals("identity")) {
            if (contentEncoding.equals("gzip")) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
            } else {
                throw new UnsupportedEncodingException(C25541a.m63881k(contentEncoding, " is unsupported"));
            }
        }
        C20433e eVar = f51756n;
        if (eVar != null) {
            eVar.mo22695h();
        }
        if (gZIPInputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) gZIPInputStream;
        }
        return new BufferedInputStream(gZIPInputStream);
    }

    /* renamed from: x */
    public final HttpURLConnection mo52631x() {
        HttpURLConnection httpURLConnection = this.f51767j;
        if (httpURLConnection != null) {
            return httpURLConnection;
        }
        throw new IllegalStateException("Attempting to retrieve the connection before the request has been sent");
    }

    /* renamed from: y */
    public ServerException mo40669y(HttpURLConnection httpURLConnection) throws IOException, ServerException {
        return null;
    }

    public C20431c(Context context, Uri uri, boolean z, Class<RS> cls) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f51759b = context.getApplicationContext();
        this.f51760c = uri;
        this.f51761d = z;
        this.f51762e = cls;
    }
}
