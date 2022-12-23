package p927xw;

import aa0.C7540l;
import android.content.Context;
import b00.C13556a;
import c70.C13752e;
import c70.C13756i;
import com.moovit.request.RequestOptions;
import p502fx.C17122g;
import p596jx.C17972t;
import p596jx.C17973u;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: xw.i */
public abstract class C20641i extends C7540l {

    /* renamed from: d */
    public final C20642a f52203d = new C20642a();

    /* renamed from: e */
    public Context f52204e = null;

    /* renamed from: f */
    public String f52205f = null;

    /* renamed from: g */
    public C17122g f52206g = null;

    /* renamed from: h */
    public C13556a f52207h = null;

    /* renamed from: xw.i$a */
    public class C20642a extends C20438i<C17972t, C17973u> {
        public C20642a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17972t tVar = (C17972t) cVar;
            C20641i iVar = C20641i.this;
            iVar.f52207h = null;
            if (iVar.f52204e != null && iVar.f52205f != null) {
                iVar.mo23802c();
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17972t tVar = (C17972t) cVar;
            C17973u uVar = (C17973u) gVar;
            String str = uVar.f46056n;
            if (str != null) {
                C20641i.this.mo46190g(str);
            } else {
                C20641i.this.mo52823h(uVar.f46055m);
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17972t tVar = (C17972t) cVar;
            String str = C20641i.this.f52205f;
            return true;
        }
    }

    public C20641i() {
        super(2000);
    }

    /* renamed from: a */
    public final void mo19433a() {
        String str;
        Context context = this.f52204e;
        if (context != null && (str = this.f52205f) != null) {
            C13756i iVar = (C13756i) context.getSystemService("request_manager");
            C13752e b = iVar.mo40679b();
            if (b != null) {
                C17972t tVar = new C17972t(b, str);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C17972t.class, sb, "_");
                sb.append(tVar.f46054w);
                String sb2 = sb.toString();
                RequestOptions c = iVar.mo40680c();
                c.f42909f = true;
                this.f52207h = iVar.mo40684g(sb2, tVar, c, this.f52203d);
                return;
            }
            mo23802c();
        }
    }

    /* renamed from: b */
    public final void mo21414b() {
        C13556a aVar = this.f52207h;
        if (aVar != null) {
            aVar.cancel(true);
            this.f52207h = null;
        }
    }

    /* renamed from: f */
    public abstract void mo46189f(C17122g gVar);

    /* renamed from: g */
    public abstract void mo46190g(String str);

    /* renamed from: h */
    public final void mo52823h(C17122g gVar) {
        String str = this.f52205f;
        if (str != null && str.equals(gVar.f44313a)) {
            this.f52206g = gVar;
            mo46189f(gVar);
        }
    }
}
