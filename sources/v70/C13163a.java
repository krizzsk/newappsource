package v70;

import android.content.Context;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import e70.C4590c;
import e70.C4591d;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p241s0.C6302b;
import p906wz.C20431c;
import p906wz.C20432d;
import p906wz.C20436g;
import p977zz.C20975x0;
import v70.C13163a;
import v70.C13164b;

/* renamed from: v70.a */
public class C13163a<RQ extends C13163a<RQ, RS>, RS extends C13164b<RQ, RS>> extends C20431c<RQ, RS> {

    /* renamed from: q */
    public final C13177m f32708q;

    public C13163a() {
        throw null;
    }

    public C13163a(C13177m mVar, int i, int i2, Class cls) {
        super(mVar.f32719a, i, i2, true, cls);
        this.f32708q = mVar;
    }

    /* renamed from: G */
    public final C20436g mo40051G() throws IOException, BadResponseException, ServerException {
        C13164b bVar = (C13164b) super.mo40051G();
        if (bVar != null) {
            Set emptySet = Collections.emptySet();
            if (!emptySet.isEmpty()) {
                C6302b bVar2 = new C6302b();
                Iterator it = emptySet.iterator();
                if (!it.hasNext()) {
                    new C13164b.C13165a(bVar2);
                } else {
                    ((C13178n) it.next()).getClass();
                    throw null;
                }
            }
        }
        return bVar;
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        Context context = this.f32708q.f32719a;
        dVar.mo52633b("x-client-version", "5.37.2.429");
        dVar.mo52633b("PHONE_TYPE", context.getString(C4590c.moovit_sdk_phone_type));
        dVar.mo52633b("x-os-unique-id", C20975x0.m49119f(context));
        this.f32708q.f32720b.getClass();
        if (C4591d.f15777f.f15778a != null) {
            dVar.mo52633b("x-user-key", C4591d.f15777f.f15778a);
        }
        if (C4591d.f15777f.f15780c != null) {
            dVar.mo52633b("x-ext-user-key", C4591d.f15777f.f15780c);
        }
        if (C4591d.f15777f.f15779b != null) {
            dVar.mo52633b("x-api-key", C4591d.f15777f.f15779b);
        }
    }
}
