package q80;

import aa0.C7543n;
import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.wallet.UserWalletStore;
import com.tranzmate.moovit.protocol.ticketingV2.MVUserActiveTicketsResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.apache.thrift.TBase;
import p304x.C7072l1;
import p523gu.C17230b;
import p543hq.C17478e;
import p638lr.C18267n;
import p80.C12991b;
import p828tt.C19759a;
import r80.C13048b;
import s90.C13076d;

/* renamed from: q80.c0 */
public final class C13014c0 extends C13780t<C13012b0, C13014c0, MVUserActiveTicketsResponse> {

    /* renamed from: m */
    public C13076d f32207m;

    /* renamed from: n */
    public boolean f32208n;

    public C13014c0() {
        super(MVUserActiveTicketsResponse.class);
    }

    /* renamed from: q */
    public static C13076d m32906q(C13012b0 b0Var, UserWalletStore userWalletStore, boolean z) {
        ArrayList arrayList = new ArrayList(userWalletStore.f23622b);
        C13048b.f32272c.populateUserTickets(b0Var.f33829q, b0Var.f32203v, arrayList, z);
        Collections.sort(arrayList, new C7072l1(8));
        return new C13076d(arrayList, userWalletStore.f23623c, userWalletStore.f23624d, userWalletStore.f23625e);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        Map map;
        C13012b0 b0Var = (C13012b0) aVar;
        MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) tBase;
        ServerId serverId = b0Var.f33829q.f33853b.f50160a.f32927c;
        C12991b bVar = b0Var.f32203v;
        ArrayList h = C13036y.m32956h(bVar, mVUserActiveTicketsResponse.tickets);
        ArrayList<O> c = C13720d.m34273c(mVUserActiveTicketsResponse.validations, (C13722f) null, new C18267n(25));
        ArrayList<O> c2 = C13720d.m34273c(mVUserActiveTicketsResponse.storedValues, (C13722f) null, new C17230b(bVar, 1));
        if (mVUserActiveTicketsResponse.mo33258f()) {
            map = C13720d.m34274d(mVUserActiveTicketsResponse.agencyMessages, new C17478e(20), new C19759a(19));
        } else {
            map = Collections.emptyMap();
        }
        UserWalletStore userWalletStore = new UserWalletStore(h, c, c2, map);
        Context context = this.f51773b.f51759b;
        C21100e.m49355o();
        C7543n<UserWalletStore> b = UserWalletStore.m17749b(context);
        if (b != null) {
            b.put(serverId.mo19751c(), userWalletStore);
        }
        this.f32207m = m32906q(b0Var, userWalletStore, b0Var.f32204w);
        this.f32208n = false;
    }

    public C13014c0(C13076d dVar) {
        super(MVUserActiveTicketsResponse.class);
        this.f32207m = dVar;
        this.f32208n = true;
    }
}
