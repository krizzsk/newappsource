package p80;

import ce0.C21100e;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.configuration.PurchaseSplitConfiguration;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.ticket.TicketAgency;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: p80.a */
public final class C12989a {

    /* renamed from: j */
    public static final C12990a f32148j = new C12990a();

    /* renamed from: a */
    public final ServerId f32149a;

    /* renamed from: b */
    public final TicketAgency f32150b;

    /* renamed from: c */
    public final String f32151c;

    /* renamed from: d */
    public final String f32152d;

    /* renamed from: e */
    public final Set<TicketingAgencyCapability> f32153e;

    /* renamed from: f */
    public final String f32154f;

    /* renamed from: g */
    public final PurchaseSplitConfiguration f32155g;

    /* renamed from: h */
    public final Set<Polygon> f32156h;

    /* renamed from: i */
    public final Map<String, String> f32157i;

    /* renamed from: p80.a$a */
    public class C12990a extends C19619s<C12989a> {
        public C12990a() {
            super(4, C12989a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 4;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            HashSet hashSet;
            PurchaseSplitConfiguration purchaseSplitConfiguration;
            HashSet hashSet2;
            Map map;
            String str;
            HashSet hashSet3;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            TicketAgency ticketAgency = (TicketAgency) TicketAgency.f23494g.read(pVar);
            String p = pVar.mo51947p();
            C19584i<TicketingAgencyCapability> iVar = TicketingAgencyCapability.CODER;
            int l = pVar.mo51924l();
            if (l == -1) {
                hashSet = null;
            } else {
                hashSet = new HashSet(l);
                for (int i2 = 0; i2 < l; i2++) {
                    hashSet.add(iVar.read(pVar));
                }
            }
            String t = pVar.mo51948t();
            if (i >= 1) {
                purchaseSplitConfiguration = (PurchaseSplitConfiguration) PurchaseSplitConfiguration.f23239c.read(pVar);
            } else {
                purchaseSplitConfiguration = new PurchaseSplitConfiguration((BigDecimal) null);
            }
            PurchaseSplitConfiguration purchaseSplitConfiguration2 = purchaseSplitConfiguration;
            if (i >= 2) {
                Polylon.C15747c cVar = Polylon.f40985h;
                int l2 = pVar.mo51924l();
                if (l2 == -1) {
                    hashSet3 = null;
                } else {
                    hashSet3 = new HashSet(l2);
                    for (int i3 = 0; i3 < l2; i3++) {
                        hashSet3.add(pVar.mo51962q(cVar));
                    }
                }
                hashSet2 = hashSet3;
            } else {
                hashSet2 = null;
            }
            if (i >= 3) {
                C19589j.C19598i iVar2 = C19589j.f49779k;
                map = pVar.mo51961o(iVar2, iVar2, new HashMap(0));
            } else {
                map = null;
            }
            if (i >= 4) {
                str = pVar.mo51947p();
            } else {
                str = p;
            }
            return new C12989a(serverId, ticketAgency, p, str, hashSet, t, purchaseSplitConfiguration2, hashSet2, map);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12989a aVar = (C12989a) obj;
            ServerId serverId = aVar.f32149a;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            TicketAgency ticketAgency = aVar.f32150b;
            TicketAgency.C7744b bVar = TicketAgency.f23494g;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(ticketAgency, qVar);
            qVar.mo51954p(aVar.f32151c);
            qVar.mo51965h(aVar.f32153e, TicketingAgencyCapability.CODER);
            qVar.mo51955t(aVar.f32154f);
            PurchaseSplitConfiguration purchaseSplitConfiguration = aVar.f32155g;
            PurchaseSplitConfiguration.C7637b bVar2 = PurchaseSplitConfiguration.f23239c;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(purchaseSplitConfiguration, qVar);
            qVar.mo51964g(aVar.f32156h, Polylon.f40986i);
            Map<String, String> map = aVar.f32157i;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
            qVar.mo51954p(aVar.f32152d);
        }
    }

    public C12989a(ServerId serverId, TicketAgency ticketAgency, String str, String str2, Set set, String str3, PurchaseSplitConfiguration purchaseSplitConfiguration, HashSet hashSet, Map map) {
        Set<Polygon> set2;
        this.f32149a = serverId;
        C21100e.m49373x(ticketAgency, "ticketAgency");
        this.f32150b = ticketAgency;
        C21100e.m49373x(str, "purchasePaymentContext");
        this.f32151c = str;
        C21100e.m49373x(str2, "loginPaymentContext");
        this.f32152d = str2;
        C21100e.m49373x(set, AppActionRequest.KEY_CAPABILITIES);
        this.f32153e = Collections.unmodifiableSet(set);
        this.f32154f = str3;
        C21100e.m49373x(purchaseSplitConfiguration, "splitConfiguration");
        this.f32155g = purchaseSplitConfiguration;
        if (hashSet != null) {
            set2 = Collections.unmodifiableSet(hashSet);
        } else {
            set2 = null;
        }
        this.f32156h = set2;
        this.f32157i = map;
    }
}
