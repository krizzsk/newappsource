package p893wm;

import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import p364al.C13487h;
import p445do.C16690b;
import p752qn.C19151i;
import p891wk.C20344a;
import p891wk.C20362q;
import p916xl.C20536b;
import p939yl.C20740a;
import p940ym.C20745a;

/* renamed from: wm.a */
public final class C20374a {

    /* renamed from: a */
    public final C16690b f51670a;

    /* renamed from: b */
    public final C20745a f51671b;

    /* renamed from: c */
    public final C20536b f51672c;

    /* renamed from: d */
    public final C20740a f51673d;

    public C20374a(C16690b bVar, C20745a aVar, C20536b bVar2, C20740a aVar2) {
        this.f51670a = bVar;
        this.f51671b = aVar;
        this.f51672c = bVar2;
        this.f51673d = aVar2;
    }

    /* renamed from: a */
    public final TicketState mo52603a(C20362q qVar) {
        TicketState ticketState;
        boolean z;
        Long l;
        boolean z2;
        boolean z3;
        TicketState ticketState2 = qVar.f51582D;
        if (ticketState2.isFinalized() || ticketState2 == (ticketState = TicketState.UNKNOWN)) {
            return ticketState2;
        }
        long a = this.f51670a.mo49402a();
        Long l2 = qVar.f51608n.f51509d;
        Long l3 = qVar.f51606l.f51514a;
        if (l2 != null) {
            l3 = Long.valueOf(l3.longValue() - 120000);
        }
        boolean z4 = true;
        if (a < l3.longValue()) {
            C20344a aVar = qVar.f51608n;
            Integer num = aVar.f51510e;
            Integer num2 = aVar.f51512g;
            if (num2 == null || num.intValue() < num2.intValue()) {
                z4 = false;
            }
            if (z4) {
                return TicketState.USED;
            }
            return TicketState.BEFORE_VP;
        } else if (a >= qVar.f51606l.f51515b.longValue()) {
            if (qVar.f51608n.f51510e.intValue() <= 0) {
                z4 = false;
            }
            if (z4) {
                return TicketState.USED;
            }
            return TicketState.EXPIRED;
        } else {
            C20344a aVar2 = qVar.f51608n;
            Integer num3 = aVar2.f51510e;
            Integer num4 = aVar2.f51512g;
            if (num4 == null || num3.intValue() <= num4.intValue()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return TicketState.USED;
            }
            Long l4 = qVar.f51608n.f51509d;
            if (l4 == null) {
                l = null;
            } else {
                l = Long.valueOf(l4.longValue() - 120000);
            }
            Long l5 = qVar.f51608n.f51513h;
            if (l == null || a < l.longValue() || a >= l5.longValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return TicketState.ACTIVE;
            }
            C20344a aVar3 = qVar.f51608n;
            Integer num5 = aVar3.f51510e;
            Integer num6 = aVar3.f51512g;
            if (num6 == null || num5.intValue() < num6.intValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return TicketState.USED;
            }
            C13487h<C19151i> a2 = this.f51671b.mo52890a(qVar);
            if (a2.mo40399a()) {
                this.f51672c.mo52737a(a2.f33366b);
                return ticketState;
            }
            C19151i iVar = (C19151i) a2.f33365a;
            if (!iVar.f48734a || iVar.f48735b) {
                this.f51673d.getClass();
                return TicketState.LIVE;
            }
            if (qVar.f51608n.f51510e.intValue() <= 0) {
                z4 = false;
            }
            if (z4) {
                return TicketState.USED;
            }
            return TicketState.LIVE_UNUSABLE;
        }
    }
}
