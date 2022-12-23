package q80;

import aa0.C7543n;
import android.content.Context;
import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.wallet.HistoryUserWalletStore;
import com.tranzmate.moovit.protocol.ticketingV2.MVUserHistoryTicketsResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.thrift.TBase;
import p252sb.C6501a;
import r80.C13048b;
import s90.C13072a;

/* renamed from: q80.d */
public final class C13015d extends C13780t<C13013c, C13015d, MVUserHistoryTicketsResponse> {

    /* renamed from: m */
    public C13072a f32209m;

    /* renamed from: n */
    public boolean f32210n;

    public C13015d() {
        super(MVUserHistoryTicketsResponse.class);
    }

    /* renamed from: q */
    public static C13072a m32908q(C13013c cVar, HistoryUserWalletStore historyUserWalletStore, boolean z) {
        ArrayList arrayList = new ArrayList(historyUserWalletStore.f23611b);
        C13048b.f32272c.populateHistoryUserTickets(cVar.f33829q, cVar.f32205v, arrayList, z);
        Collections.sort(arrayList, new C6501a(4));
        return new C13072a(arrayList);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13013c cVar = (C13013c) aVar;
        ServerId serverId = cVar.f33829q.f33853b.f50160a.f32927c;
        HistoryUserWalletStore historyUserWalletStore = new HistoryUserWalletStore(C13036y.m32956h(cVar.f32205v, ((MVUserHistoryTicketsResponse) tBase).tickets));
        Context context = this.f51773b.f51759b;
        C21100e.m49355o();
        C7543n<HistoryUserWalletStore> b = HistoryUserWalletStore.m17740b(context);
        if (b != null) {
            b.put(serverId.mo19751c(), historyUserWalletStore);
        }
        this.f32209m = m32908q(cVar, historyUserWalletStore, cVar.f32206w);
        this.f32210n = false;
    }

    public C13015d(C13072a aVar) {
        super(MVUserHistoryTicketsResponse.class);
        this.f32209m = aVar;
        this.f32210n = true;
    }
}
