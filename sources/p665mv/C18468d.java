package p665mv;

import aa0.C7540l;
import android.content.Context;
import b00.C13556a;
import c70.C13752e;
import c70.C13756i;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.EventRequest;
import p011aa.C0141e;
import p737pv.C19022m;
import p737pv.C19023n;
import p737pv.C19025o;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: mv.d */
public abstract class C18468d extends C7540l {

    /* renamed from: d */
    public C18469a f47069d = new C18469a();

    /* renamed from: e */
    public Context f47070e = null;

    /* renamed from: f */
    public EventRequest f47071f = null;

    /* renamed from: g */
    public C13556a f47072g = null;

    /* renamed from: mv.d$a */
    public class C18469a extends C0141e {
        public C18469a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19022m mVar = (C19022m) cVar;
            C18468d dVar = C18468d.this;
            dVar.f47072g = null;
            if (dVar.f47070e != null && dVar.f47071f != null) {
                dVar.mo23802c();
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19022m mVar = (C19022m) cVar;
            C19023n nVar = (C19023n) gVar;
            EventRequest eventRequest = nVar.f48384m;
            EventRequest eventRequest2 = C18468d.this.f47071f;
            if (eventRequest2 != null && eventRequest2.equals(eventRequest)) {
                C18468d.this.mo45736f(nVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo19433a() {
        EventRequest eventRequest;
        Context context = this.f47070e;
        if (context != null && (eventRequest = this.f47071f) != null) {
            C13756i iVar = (C13756i) context.getSystemService("request_manager");
            C13752e b = iVar.mo40679b();
            if (b != null) {
                C19022m mVar = new C19022m(b, eventRequest);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C19025o.class, sb, "_");
                sb.append(mVar.f48383w.f42959i);
                String sb2 = sb.toString();
                RequestOptions c = iVar.mo40680c();
                c.f42909f = true;
                this.f47072g = iVar.mo40684g(sb2, mVar, c, this.f47069d);
                return;
            }
            mo23802c();
        }
    }

    /* renamed from: b */
    public final void mo21414b() {
        C13556a aVar = this.f47072g;
        if (aVar != null) {
            aVar.cancel(true);
            this.f47072g = null;
        }
    }

    /* renamed from: f */
    public abstract void mo45736f(C19023n nVar);
}
