package p526gx;

import android.content.Context;
import android.location.Location;
import b00.C13556a;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.request.RequestOptions;
import java.util.Collections;
import java.util.List;
import p269u2.C6677a;
import p396bt.C13681a;
import p501fw.C17104c;
import p502fx.C17122g;
import p502fx.C17123h;
import p502fx.C17124i;
import p583jk.C17884p;
import p596jx.C17960i;
import p977zz.C20975x0;

/* renamed from: gx.c */
public abstract class C17250c {

    /* renamed from: a */
    public C6677a f44580a = null;

    /* renamed from: b */
    public C13556a f44581b = null;

    /* renamed from: a */
    public static List<C17124i> m43254a(C17122g gVar) {
        C17123h hVar = gVar.f44319g;
        TodJourneyStatus todJourneyStatus = gVar.f44315c;
        boolean isPickedUp = todJourneyStatus.isPickedUp();
        if (todJourneyStatus.equals(TodJourneyStatus.ARRIVED_DROP_OFF)) {
            return Collections.emptyList();
        }
        if (isPickedUp) {
            int i = hVar.f44326b;
            if (i == -1) {
                return hVar.f44325a;
            }
            List<C17124i> list = hVar.f44325a;
            return list.subList(i, list.size());
        }
        int i2 = hVar.f44326b;
        if (i2 == -1) {
            return Collections.emptyList();
        }
        return hVar.f44325a.subList(0, i2 + 1);
    }

    /* renamed from: b */
    public final void mo49801b(Context context, C17122g gVar) {
        boolean z;
        C21100e.m49369v(1);
        C6677a aVar = this.f44580a;
        List<C17124i> a = m43254a(gVar);
        if (a.isEmpty()) {
            C21100e.m49369v(1);
            C13556a aVar2 = this.f44581b;
            if (aVar2 != null) {
                aVar2.cancel(true);
                this.f44581b = null;
            }
            this.f44580a = null;
            z = false;
        } else if (aVar == null) {
            z = true;
        } else {
            z = !C20975x0.m49118e(((C17252e) aVar.f20758b).f44588c, a);
        }
        if (z) {
            C13556a aVar3 = this.f44581b;
            if (aVar3 != null) {
                aVar3.cancel(true);
                this.f44581b = null;
            }
            C13756i iVar = (C13756i) context.getSystemService("request_manager");
            RequestOptions c = iVar.mo40680c();
            c.f42909f = true;
            C13752e b = iVar.mo40679b();
            if (b != null) {
                Location location = gVar.f44316d;
                List<C17124i> a2 = m43254a(gVar);
                if (!a2.isEmpty()) {
                    C17960i iVar2 = new C17960i(b, gVar.f44313a, location, a2);
                    StringBuilder sb = new StringBuilder();
                    C13715c.m34249o(C17960i.class, sb, "_");
                    sb.append(C17884p.m44335F(iVar2.f46029w));
                    sb.append("_");
                    sb.append(C17884p.m44335F(iVar2.f46030x));
                    sb.append("_");
                    sb.append(C17884p.m44335F(iVar2.f46031y));
                    sb.append("_");
                    sb.append(iVar2.f46032z ? 1 : 0);
                    this.f44581b = iVar.mo40684g(sb.toString(), iVar2, c, new C17249b(this, gVar));
                    return;
                }
                return;
            }
            return;
        }
        mo49802c(context, aVar, gVar);
    }

    /* renamed from: c */
    public final void mo49802c(Context context, C6677a aVar, C17122g gVar) {
        Tasks.call(MoovitExecutors.COMPUTATION, new C13681a(1, aVar, gVar)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C17104c(this, context, aVar, gVar, 1));
    }
}
