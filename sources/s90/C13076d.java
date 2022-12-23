package s90;

import c00.C13717b;
import c00.C13720d;
import ce0.C21100e;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.ticket.C7755c;
import com.moovit.ticketing.ticket.Ticket;
import h90.C12739a;
import j90.C12789b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p009a8.C0112l;
import p054d0.C4303q;
import p693nz.C18659h;
import p977zz.C20944i0;

/* renamed from: s90.d */
public final class C13076d {

    /* renamed from: g */
    public static final Set<Ticket.Status> f32344g;

    /* renamed from: h */
    public static final Set<Ticket.Status> f32345h;

    /* renamed from: a */
    public final List<Ticket> f32346a;

    /* renamed from: b */
    public final Map<Ticket.Status, List<Ticket>> f32347b;

    /* renamed from: c */
    public final List<C12789b> f32348c;

    /* renamed from: d */
    public final List<C12739a> f32349d;

    /* renamed from: e */
    public final Map<String, List<TicketAgencyMessage>> f32350e;

    /* renamed from: f */
    public final C18659h<Object, List<Ticket>> f32351f = new C18659h<>(5);

    static {
        Ticket.Status status = Ticket.Status.NOT_YET_VALID;
        Ticket.Status status2 = Ticket.Status.VALID;
        Ticket.Status status3 = Ticket.Status.VALID_AUTO_ACTIVATE;
        f32344g = Collections.unmodifiableSet(EnumSet.of(status, status2, status3));
        f32345h = Collections.unmodifiableSet(EnumSet.of(status, status2, status3, Ticket.Status.ACTIVE));
    }

    public C13076d(ArrayList arrayList, List list, List list2, Map map) {
        this.f32346a = Collections.unmodifiableList(arrayList);
        this.f32347b = Collections.unmodifiableMap(C13720d.m34278h(arrayList, new C25541a(), new C0112l(22), C13720d.f33796a, new C4303q(24)));
        C21100e.m49373x(list, "validations");
        this.f32348c = Collections.unmodifiableList(list);
        C21100e.m49373x(list2, "storedValues");
        this.f32349d = Collections.unmodifiableList(list2);
        this.f32350e = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final List<Ticket> mo39943a(Ticket.Status status) {
        List<Ticket> list = this.f32347b.get(status);
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    public final List<Ticket> mo39944b(Set<Ticket.Status> set, Collection<Ticket.Status> collection) {
        if (collection.size() == 1 && set.isEmpty()) {
            return mo39943a((Ticket.Status) C13717b.m34256c(collection));
        }
        C20944i0 i0Var = new C20944i0(collection, set);
        List<Ticket> list = this.f32351f.get(i0Var);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Ticket next : this.f32346a) {
            Ticket.Status status = next.f23475d;
            if (collection.contains(status)) {
                C7755c cVar = next.f23487p;
                if (cVar == null || !set.contains(status)) {
                    arrayList.add(next);
                } else if (!hashSet.contains(cVar.f23533a)) {
                    arrayList.add(next);
                    hashSet.add(cVar.f23533a);
                }
            }
        }
        List<Ticket> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f32351f.put(i0Var, unmodifiableList);
        return unmodifiableList;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("UserWallet{tickets=");
        k.append(C13717b.m34269p(this.f32346a));
        k.append(", validations=");
        k.append(C13717b.m34269p(this.f32348c));
        k.append(", storedValues=");
        k.append(C13717b.m34269p(this.f32349d));
        k.append(", agencyMessages=");
        k.append(C13717b.m34270q(this.f32350e));
        k.append('}');
        return k.toString();
    }
}
