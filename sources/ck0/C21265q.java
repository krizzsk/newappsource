package ck0;

import com.amazonaws.http.HttpHeader;
import hi0.C23521b0;
import hi0.C23553o;
import hi0.C23556q;
import hi0.C23558r;
import hi0.C23562t;
import hi0.C23563u;
import hi0.C23571x;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import si0.C24901h;

/* renamed from: ck0.q */
public final class C21265q {

    /* renamed from: k */
    public static final char[] f53216k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f53217a;

    /* renamed from: b */
    public final C23558r f53218b;

    /* renamed from: c */
    public String f53219c;

    /* renamed from: d */
    public C23558r.C23559a f53220d;

    /* renamed from: e */
    public final C23571x.C23572a f53221e;

    /* renamed from: f */
    public C23562t f53222f;

    /* renamed from: g */
    public final boolean f53223g;

    /* renamed from: h */
    public C23563u.C23564a f53224h;

    /* renamed from: i */
    public C23553o.C23554a f53225i;

    /* renamed from: j */
    public C23521b0 f53226j;

    /* renamed from: ck0.q$a */
    public static class C21266a extends C23521b0 {

        /* renamed from: a */
        public final C23521b0 f53227a;

        /* renamed from: b */
        public final C23562t f53228b;

        public C21266a(C23521b0 b0Var, C23562t tVar) {
            this.f53227a = b0Var;
            this.f53228b = tVar;
        }

        /* renamed from: a */
        public final long mo53612a() throws IOException {
            return this.f53227a.mo53612a();
        }

        /* renamed from: b */
        public final C23562t mo53613b() {
            return this.f53228b;
        }

        /* renamed from: e */
        public final void mo53614e(C24901h hVar) throws IOException {
            this.f53227a.mo53614e(hVar);
        }
    }

    public C21265q(String str, C23558r rVar, String str2, C23556q qVar, C23562t tVar, boolean z, boolean z2, boolean z3) {
        this.f53217a = str;
        this.f53218b = rVar;
        this.f53219c = str2;
        C23571x.C23572a aVar = new C23571x.C23572a();
        this.f53221e = aVar;
        this.f53222f = tVar;
        this.f53223g = z;
        if (qVar != null) {
            aVar.f59644c = qVar.mo58684e();
        }
        if (z2) {
            this.f53225i = new C23553o.C23554a();
        } else if (z3) {
            C23563u.C23564a aVar2 = new C23563u.C23564a();
            this.f53224h = aVar2;
            C23562t tVar2 = C23563u.f59557f;
            if (tVar2 == null) {
                throw new NullPointerException("type == null");
            } else if (tVar2.f59554b.equals("multipart")) {
                aVar2.f59566b = tVar2;
            } else {
                throw new IllegalArgumentException("multipart != " + tVar2);
            }
        }
    }

    /* renamed from: a */
    public final void mo53608a(String str, String str2, boolean z) {
        if (z) {
            C23553o.C23554a aVar = this.f53225i;
            aVar.getClass();
            if (str != null) {
                aVar.f59525a.add(C23558r.m57723c(str, true, (Charset) null));
                aVar.f59526b.add(C23558r.m57723c(str2, true, (Charset) null));
                return;
            }
            throw new NullPointerException("name == null");
        }
        this.f53225i.mo58678a(str, str2);
    }

    /* renamed from: b */
    public final void mo53609b(String str, String str2) {
        if (HttpHeader.CONTENT_TYPE.equalsIgnoreCase(str)) {
            C23562t c = C23562t.m57743c(str2);
            if (c != null) {
                this.f53222f = c;
                return;
            }
            throw new IllegalArgumentException(C25541a.m63881k("Malformed content type: ", str2));
        }
        this.f53221e.f59644c.mo58690a(str, str2);
    }

    /* renamed from: c */
    public final void mo53610c(C23556q qVar, C23521b0 b0Var) {
        C23563u.C23564a aVar = this.f53224h;
        aVar.getClass();
        if (b0Var == null) {
            throw new NullPointerException("body == null");
        } else if (qVar != null && qVar.mo58682c(HttpHeader.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (qVar == null || qVar.mo58682c(HttpHeader.CONTENT_LENGTH) == null) {
            aVar.f59567c.add(new C23563u.C23565b(qVar, b0Var));
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    /* renamed from: d */
    public final void mo53611d(String str, String str2, boolean z) {
        C23558r.C23559a aVar;
        String str3 = this.f53219c;
        String str4 = null;
        if (str3 != null) {
            C23558r rVar = this.f53218b;
            rVar.getClass();
            try {
                aVar = new C23558r.C23559a();
                aVar.mo58708c(rVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f53220d = aVar;
            if (aVar != null) {
                this.f53219c = null;
            } else {
                StringBuilder k = C13555b.m33972k("Malformed URL. Base: ");
                k.append(this.f53218b);
                k.append(", Relative: ");
                k.append(this.f53219c);
                throw new IllegalArgumentException(k.toString());
            }
        }
        if (z) {
            C23558r.C23559a aVar2 = this.f53220d;
            if (str != null) {
                if (aVar2.f59549g == null) {
                    aVar2.f59549g = new ArrayList();
                }
                aVar2.f59549g.add(C23558r.m57722b(str, " \"'<>#&=", true, false, true, true));
                ArrayList arrayList = aVar2.f59549g;
                if (str2 != null) {
                    str4 = C23558r.m57722b(str2, " \"'<>#&=", true, false, true, true);
                }
                arrayList.add(str4);
                return;
            }
            aVar2.getClass();
            throw new NullPointerException("encodedName == null");
        }
        this.f53220d.mo58706a(str, str2);
    }
}
