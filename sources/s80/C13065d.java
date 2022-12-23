package s80;

import a30.C0068a;
import a30.C0072d;
import android.content.Context;
import android.util.SparseArray;
import c00.C13717b;
import c00.C13729j;
import c00.C13733n;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.ticketing.providers.masabi.MasabiTicketingException;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine;
import g60.C17168a;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m90.C12890b;
import n10.C18505b;
import n80.C12916c;
import o90.C12957a;
import p009a8.C0111k;
import p373au.C13533e;
import p394br.C13672m;
import p540hn.C17459a;
import p584jl.C17885a;
import p641lu.C18277b;
import p714ow.C18847a;
import p798sn.C19493a;
import p798sn.C19494b;
import p80.C12989a;
import p80.C12991b;
import p810sz.C19617r;
import p977zz.C20936e0;
import p977zz.C20943i;
import p977zz.C20964s0;
import q80.C13011b;
import q80.C13017f;
import q80.C13019h;
import q80.C13036y;
import r80.C13047a;
import t80.C13116c;
import t80.C13117d;
import v80.C13184b;

/* renamed from: s80.d */
public final class C13065d implements C13047a {

    /* renamed from: d */
    public static final ServerId f32318d;

    /* renamed from: b */
    public final C13064c f32319b = new C13064c();

    /* renamed from: c */
    public C13116c f32320c = null;

    /* renamed from: s80.d$a */
    public static class C13066a implements Iterable<C19493a> {

        /* renamed from: b */
        public final Iterable<C19493a> f32321b;

        /* renamed from: c */
        public final long f32322c;

        /* renamed from: s80.d$a$a */
        public static class C13067a extends C13729j<C19493a> {

            /* renamed from: c */
            public final long f32323c;

            /* renamed from: d */
            public C19493a f32324d;

            public C13067a(Iterator it, long j) {
                super(it);
                this.f32323c = j;
            }

            public final boolean hasNext() {
                C19493a aVar;
                if (this.f32324d != null) {
                    return true;
                }
                do {
                    if (!super.hasNext()) {
                        return false;
                    }
                    C19493a aVar2 = (C19493a) super.next();
                    aVar = null;
                    if (aVar2 != null) {
                        long[] jArr = {C13070g.m33011c(C17885a.m44394D(aVar2.f49565j)), C13070g.m33011c(C17885a.m44446k0(aVar2.f49567l)), C13070g.m33011c(C17885a.m44446k0(aVar2.f49566k)), C13070g.m33011c(C17885a.m44446k0(aVar2.f49557b)), C13070g.m33011c(C17885a.m44394D(aVar2.f49558c))};
                        int i = C20936e0.f52684d;
                        long j = Long.MIN_VALUE;
                        for (int i2 = 0; i2 < 5; i2++) {
                            j = Math.max(j, jArr[i2]);
                        }
                        if (j < this.f32323c) {
                            aVar2 = null;
                        }
                        aVar = aVar2;
                    }
                    this.f32324d = aVar;
                } while (aVar == null);
                return true;
            }

            public final Object next() {
                C19493a aVar = this.f32324d;
                this.f32324d = null;
                return aVar;
            }
        }

        public C13066a(List list, long j) {
            C21100e.m49373x(list, "decorated");
            this.f32321b = list;
            this.f32322c = j;
        }

        public final Iterator<C19493a> iterator() {
            return new C13067a(this.f32321b.iterator(), this.f32322c);
        }
    }

    static {
        MVTicketClinetEngine mVTicketClinetEngine = MVTicketClinetEngine.MASABI;
        C19617r rVar = C13036y.f32248a;
        f32318d = new ServerId(mVTicketClinetEngine.getValue());
    }

    /* renamed from: a */
    public static void m33008a(C13752e eVar, C12991b bVar, List list, boolean z, C13733n nVar) throws ServerException {
        boolean z2;
        C19494b bVar2;
        Ticket ticket;
        List<C12989a> list2 = bVar.f32159a.get(f32318d);
        if (!C13717b.m34258e(list2)) {
            HashSet hashSet = new HashSet(list2.size());
            for (C12989a aVar : list2) {
                String str = aVar.f32154f;
                if (!C20964s0.m49090h(str) && !hashSet.contains(str)) {
                    if (C17168a.f44402a.mo49750a(eVar, aVar.f32152d, str) == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        hashSet.add(str);
                        C0068a b = C0068a.m120b(str);
                        if (z) {
                            b.mo167j();
                        }
                        synchronized (b) {
                            if (!b.mo163f()) {
                                bVar2 = null;
                            } else {
                                C14333w2 w2Var = new C14333w2(((C17459a) b.mo161d().f46177g.f46231a.mo49505a(C17459a.class, (String) null)).mo40394C());
                                b.mo168k(w2Var, "Failed to get wallet contents purchased tickets");
                                bVar2 = (C19494b) w2Var.f36107c;
                            }
                        }
                        if (bVar2 != null) {
                            Iterable<C19493a> iterable = (Iterable) nVar.convert(bVar2);
                            IdentityHashMap a = C13036y.m32949a(iterable, new C0111k(6), new C18505b(7), new C18277b(6), new C13672m(2, b, b.f144b));
                            for (C19493a aVar2 : iterable) {
                                C12989a a2 = bVar.mo39880a(f32318d, C13070g.m33010b(b, aVar2));
                                if (a2 == null) {
                                    ticket = null;
                                } else {
                                    ticket = C13070g.m33014f(b, a2.f32150b, a, aVar2);
                                }
                                if (ticket != null) {
                                    list.add(ticket);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final C13011b activateTicket(C13752e eVar, C12991b bVar, C12916c cVar) throws ServerException {
        TicketId ticketId = cVar.f31981a.f23473b;
        if (!f32318d.equals(ticketId.f23511b)) {
            return null;
        }
        String str = cVar.f31981a.f23478g.f23495b;
        C12989a a = bVar.mo39880a(ticketId.f23511b, str);
        if (a != null) {
            if (C17168a.f44402a.mo49750a(eVar, a.f32152d, C0068a.m121c(ticketId.f23514e).f144b.get("conf")) == null) {
                return (C13011b) cVar.mo39783a(this.f32319b);
            }
            throw new MasabiTicketingException("Can not activate ticket to unregistered user!");
        }
        throw new MasabiTicketingException(C25541a.m63881k("No agency configuration found for agency ", str));
    }

    public final Map<String, String> createProperties(Context context, C12991b bVar, List<TicketItineraryLegFare> list) {
        return null;
    }

    public final C12890b getReceipt(C13752e eVar, TicketId ticketId) throws ServerException {
        C0072d dVar;
        if (!f32318d.equals(ticketId.f23511b)) {
            return null;
        }
        C0068a c = C0068a.m121c(ticketId.f23514e);
        String str = ticketId.f23513d;
        synchronized (c) {
            dVar = new C0072d(c.mo161d().mo50524c(), str);
        }
        return new C12957a(ticketId, dVar);
    }

    public final boolean isSupported(Context context) {
        return C20943i.m49051d(21);
    }

    public final Boolean isValid(Context context, SuggestedTicketFare suggestedTicketFare) {
        boolean z;
        if (!f32318d.equals(suggestedTicketFare.f23313b)) {
            return null;
        }
        SparseArray<String> sparseArray = suggestedTicketFare.f23320i;
        if (sparseArray == null) {
            return Boolean.FALSE;
        }
        if (C13070g.m33013e(sparseArray) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final C13017f perform(Context context, C12991b bVar, PurchaseStepResult purchaseStepResult) throws ServerException {
        if (!((Boolean) purchaseStepResult.mo24018b(new C13062a())).booleanValue()) {
            return null;
        }
        C13116c cVar = (C13116c) purchaseStepResult.mo24018b(new C13117d(context));
        if (cVar != null) {
            this.f32320c = cVar;
        } else {
            C13116c cVar2 = this.f32320c;
            if (cVar2 == null || !purchaseStepResult.f23249b.startsWith(cVar2.mo40013i())) {
                StringBuilder k = C13555b.m33972k("Illegal purchase helper: ");
                k.append(this.f32320c);
                k.append(", resultContextId: ");
                k.append(purchaseStepResult.f23249b);
                throw new MasabiTicketingException(k.toString());
            }
        }
        return new C13017f((PurchaseStep) purchaseStepResult.mo24018b(this.f32320c));
    }

    public final void populateHistoryUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException {
        m33008a(eVar, bVar, list, z, new C13533e(eVar, 2));
    }

    public final void populateUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException {
        m33008a(eVar, bVar, list, z, new C18847a(7));
    }

    public final C13019h purchaseTicket(C13752e eVar, C12991b bVar, C13184b bVar2) throws ServerException {
        if (!bVar2.f32729a.startsWith("com.masabi")) {
            return null;
        }
        if (this.f32320c != null) {
            TicketFare ticketFare = bVar2.f32730b;
            String str = ticketFare.f23333i.f23495b;
            C12989a a = bVar.mo39880a(ticketFare.f23327c, str);
            if (a != null) {
                PaymentRegistrationInstructions a2 = C17168a.f44402a.mo49750a(eVar, a.f32152d, this.f32320c.f32572d);
                if (a2 != null) {
                    return new C13019h(a2);
                }
                return this.f32320c.mo40016o(eVar, bVar2, a.f32151c);
            }
            throw new MasabiTicketingException(C25541a.m63881k("No agency configuration found for agency ", str));
        }
        throw new MasabiTicketingException("Purchase helper may not be null!");
    }
}
