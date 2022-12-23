package t80;

import a30.C0068a;
import android.content.Context;
import android.util.SparseArray;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.app.home.dashboard.C14948l;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DbEntityRef;
import com.moovit.ticketing.providers.masabi.MasabiTicketingException;
import com.moovit.ticketing.purchase.fare.PurchaseFareStep;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m80.C12873i;
import p001a0.C0016g;
import p563im.C17622a;
import p572iw.C17661d;
import p634ln.C18247a;
import p705on.C18801i;
import p705on.C18805l;
import p796sl.C19472c;
import p796sl.C19474d;
import p828tt.C19759a;
import p977zz.C20944i0;
import q80.C13019h;
import q80.C13035x;
import s80.C13063b;
import s80.C13070g;
import v80.C13184b;

/* renamed from: t80.f */
public final class C13119f extends C13116c {

    /* renamed from: e */
    public final SparseArray<C18247a> f32576e = new SparseArray<>();

    /* renamed from: f */
    public volatile String f32577f = null;

    public C13119f(Context context, TicketAgency ticketAgency, String str) {
        super(context, ticketAgency, str);
    }

    /* renamed from: t */
    public static void m33132t(SparseArray<C18247a> sparseArray, List<C18247a> list) {
        if (list != null) {
            for (C18247a next : list) {
                sparseArray.put(next.f46552a.intValue(), next);
            }
        }
    }

    /* renamed from: b */
    public final Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        List list;
        PurchaseStationSelectionStepResult purchaseStationSelectionStepResult2 = purchaseStationSelectionStepResult;
        if ("com.masabi.stations.origin".equals(purchaseStationSelectionStepResult2.f23427c)) {
            Integer valueOf = Integer.valueOf(Integer.parseInt(purchaseStationSelectionStepResult2.f23428d));
            C0068a l = mo40015l();
            synchronized (l) {
                C14333w2 w2Var = new C14333w2(new C19472c(((C19472c.C19473a) l.mo161d().f46175e.f46191a.mo49505a(C19472c.C19473a.class, (String) null)).f49520a, valueOf).mo40394C());
                l.mo168k(w2Var, "Failed to get destination stations!");
                list = (List) w2Var.f36107c;
            }
            if (!C13717b.m34258e(list)) {
                m33132t(this.f32576e, list);
                StringBuilder t = C0016g.m36t("com.masabi.purchase.stations.destination", ".");
                t.append(Integer.toString(valueOf.intValue()));
                return new PurchaseStationSelectionStep(t.toString(), "masabi_stations_destination_filter", this.f32570b.getString(C12873i.masabi_title_filter_destination), "com.masabi.stations.destination", C13720d.m34273c(list, (C13722f) null, new C19759a(20)), (DbEntityRef) null);
            }
            throw new MasabiTicketingException("Empty destination stations");
        } else if ("com.masabi.stations.destination".equals(purchaseStationSelectionStepResult2.f23427c)) {
            String str = purchaseStationSelectionStepResult2.f23249b;
            Integer valueOf2 = Integer.valueOf(Integer.parseInt(str.substring(str.lastIndexOf(46) + 1)));
            Integer valueOf3 = Integer.valueOf(Integer.parseInt(purchaseStationSelectionStepResult2.f23428d));
            C18247a aVar = this.f32576e.get(valueOf2.intValue());
            if (aVar != null) {
                C18247a aVar2 = this.f32576e.get(valueOf3.intValue());
                if (aVar2 != null) {
                    C18801i s = mo40022s(aVar, aVar2);
                    SparseArray<String> i = C13070g.m33017i(new C13063b(this.f32572d, (List<String>) null, 2, new C20944i0(valueOf2, valueOf3)));
                    ArrayList<O> c = C13720d.m34273c(s.f47874b, new C14948l(1), new C13035x(1, this.f32571c, i));
                    Context context = this.f32570b;
                    return new PurchaseTicketFareSelectionStep("com.masabi.purchase.stations.purchase", "masabi_stations_purchase_filter", c, (String) null, new PurchaseFilters(Arrays.asList(new String[]{context.getString(C12873i.masabi_filter_origin_station), context.getString(C12873i.masabi_filter_destination_station)}), Arrays.asList(new String[]{aVar.f46553b, aVar2.f46553b})), this.f32570b.getString(C12873i.purchase_ticket_selection_select_ticket));
                }
                throw new MasabiTicketingException("Missing destination station: " + valueOf3);
            }
            throw new MasabiTicketingException("Missing origin station: " + valueOf2);
        } else {
            StringBuilder k = C13555b.m33972k("Unknown step context: ");
            k.append(purchaseStationSelectionStepResult2.f23249b);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: e */
    public final Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception {
        SparseArray<String> sparseArray;
        C20944i0<Integer, Integer> i0Var;
        SuggestedTicketFare suggestedTicketFare = suggestedTicketFareSelectionStepResult.f23324c;
        if (suggestedTicketFare == null || (sparseArray = suggestedTicketFare.f23320i) == null) {
            mo40018q(suggestedTicketFare);
            throw null;
        }
        C13063b e = C13070g.m33013e(sparseArray);
        if (e == null || (i0Var = e.f32316d) == null || i0Var.f52692a == null || i0Var.f52693b == null) {
            mo40018q(suggestedTicketFare);
            throw null;
        }
        C18247a e2 = mo40015l().mo162e((Integer) e.f32316d.f52692a);
        if (e2 != null) {
            C18247a e3 = mo40015l().mo162e((Integer) e.f32316d.f52693b);
            if (e3 != null) {
                C18805l lVar = (C18805l) C13723g.m34286g(mo40022s(e2, e3).f47874b, new C17661d(Integer.valueOf(Integer.parseInt(suggestedTicketFare.f23315d)), 2));
                if (lVar != null) {
                    mo40019r(lVar);
                    return new PurchaseFareStep("com.masabi.purchase.stations.suggestion", "masabi_stations_purchase_filter", C13070g.m33012d(suggestedTicketFare.f23317f, suggestedTicketFare.f23320i, lVar), suggestedTicketFare.f23319h, (String) null);
                }
                mo40018q(suggestedTicketFare);
                throw null;
            }
            mo40018q(suggestedTicketFare);
            throw null;
        }
        mo40018q(suggestedTicketFare);
        throw null;
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, Stations step does not supported leg selection result!");
    }

    /* renamed from: i */
    public final String mo40013i() {
        return "com.masabi.purchase.stations";
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception {
        List list;
        C0068a l = mo40015l();
        synchronized (l) {
            C14333w2 w2Var = new C14333w2(((C19474d) l.mo161d().f46175e.f46191a.mo49505a(C19474d.class, (String) null)).mo40394C());
            l.mo168k(w2Var, "Failed to get origin stations!");
            list = (List) w2Var.f36107c;
        }
        if (!C13717b.m34258e(list)) {
            m33132t(this.f32576e, list);
            return new PurchaseStationSelectionStep("com.masabi.purchase.stations.origin", "masabi_stations_origin_filter", this.f32570b.getString(C12873i.masabi_title_filter_origin), "com.masabi.stations.origin", C13720d.m34273c(list, (C13722f) null, new C19759a(20)), (DbEntityRef) null);
        }
        throw new MasabiTicketingException("Empty origin stations");
    }

    /* renamed from: m */
    public final Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, Stations step does not supported filter result!");
    }

    /* renamed from: o */
    public final C13019h mo40016o(C13752e eVar, C13184b bVar, String str) throws ServerException {
        String str2 = this.f32577f;
        if (str2 != null) {
            return mo40017p(eVar, str, bVar, str2);
        }
        throw new MasabiTicketingException("Missing active order id!");
    }

    /* renamed from: s */
    public final C18801i mo40022s(C18247a aVar, C18247a aVar2) throws ServerException {
        C18801i iVar;
        C0068a l = mo40015l();
        synchronized (l) {
            C14333w2 w2Var = new C14333w2(((C17622a) l.mo161d().f46174d.f46192a.mo49505a(C17622a.class, (String) null)).mo50078a(aVar, aVar2, (List<String>) null));
            l.mo168k(w2Var, "Failed to create Order");
            iVar = (C18801i) w2Var.f36107c;
        }
        this.f32577f = iVar.f47873a;
        return iVar;
    }
}
