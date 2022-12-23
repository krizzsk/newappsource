package t80;

import a30.C0068a;
import android.content.Context;
import android.util.SparseArray;
import c00.C13717b;
import c00.C13723g;
import c70.C13752e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.fare.PurchaseFareStep;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.ticket.TicketAgency;
import java.util.Collections;
import java.util.List;
import p563im.C17622a;
import p589jq.C17917i;
import p634ln.C18247a;
import p705on.C18801i;
import p705on.C18805l;
import q80.C13019h;
import s80.C13070g;
import v80.C13184b;

/* renamed from: t80.e */
public abstract class C13118e extends C13116c {

    /* renamed from: e */
    public final List<String> f32574e;

    /* renamed from: f */
    public String f32575f = null;

    public C13118e(Context context, TicketAgency ticketAgency, String str, List<String> list) {
        super(context, ticketAgency, str);
        List<String> list2 = null;
        this.f32574e = list != null ? Collections.unmodifiableList(list) : list2;
    }

    /* renamed from: e */
    public final Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception {
        SparseArray<String> sparseArray;
        SuggestedTicketFare suggestedTicketFare = suggestedTicketFareSelectionStepResult.f23324c;
        if (suggestedTicketFare == null || (sparseArray = suggestedTicketFare.f23320i) == null) {
            mo40018q(suggestedTicketFare);
            throw null;
        } else if (C13070g.m33013e(sparseArray) != null) {
            C18805l lVar = (C18805l) C13723g.m34286g(mo40021t().f47874b, new C17917i(Integer.valueOf(Integer.parseInt(suggestedTicketFare.f23315d)), 3));
            if (lVar != null) {
                mo40019r(lVar);
                TicketFare d = C13070g.m33012d(suggestedTicketFare.f23317f, suggestedTicketFare.f23320i, lVar);
                return new PurchaseFareStep(mo40013i() + ".suggestion", "masabi_suggestion_purchase", d, suggestedTicketFare.f23319h, (String) null);
            }
            mo40018q(suggestedTicketFare);
            throw null;
        } else {
            mo40018q(suggestedTicketFare);
            throw null;
        }
    }

    /* renamed from: o */
    public final C13019h mo40016o(C13752e eVar, C13184b bVar, String str) throws ServerException {
        if (this.f32575f == null) {
            synchronized (this) {
                if (this.f32575f == null) {
                    this.f32575f = mo40020s().f47873a;
                }
            }
        }
        return mo40017p(eVar, str, bVar, this.f32575f);
    }

    /* renamed from: s */
    public final C18801i mo40020s() throws ServerException {
        C18801i iVar;
        Class cls = C17622a.class;
        if (C13717b.m34258e(this.f32574e)) {
            C0068a l = mo40015l();
            synchronized (l) {
                C14333w2 w2Var = new C14333w2(((C17622a) l.mo161d().f46174d.f46192a.mo49505a(cls, (String) null)).mo50078a((C18247a) null, (C18247a) null, (List<String>) null));
                l.mo168k(w2Var, "Failed to create Order");
                iVar = (C18801i) w2Var.f36107c;
            }
        } else {
            C0068a l2 = mo40015l();
            List<String> list = this.f32574e;
            synchronized (l2) {
                C14333w2 w2Var2 = new C14333w2(((C17622a) l2.mo161d().f46174d.f46192a.mo49505a(cls, (String) null)).mo50078a((C18247a) null, (C18247a) null, list));
                l2.mo168k(w2Var2, "Failed to create Order");
                iVar = (C18801i) w2Var2.f36107c;
            }
        }
        return iVar;
    }

    /* renamed from: t */
    public final C18801i mo40021t() throws ServerException {
        C18801i iVar;
        C0068a l = mo40015l();
        if (this.f32575f == null) {
            synchronized (this) {
                if (this.f32575f == null) {
                    this.f32575f = mo40020s().f47873a;
                }
            }
        }
        String str = this.f32575f;
        synchronized (l) {
            C14333w2 e = l.mo161d().f46174d.mo50532e(str);
            l.mo168k(e, "Failed to order with id " + str);
            iVar = (C18801i) e.f36107c;
        }
        return iVar;
    }
}
