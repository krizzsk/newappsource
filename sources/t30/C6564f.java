package t30;

import aa0.C7543n;
import android.content.Context;
import b40.C1472a;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.micromobility.wallet.MicroMobilityHistoryUserWalletStore;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.thrift.TBase;
import p190o1.C5909d;
import p638lr.C18262i;

/* renamed from: t30.f */
public final class C6564f extends C13780t<C6563e, C6564f, MVMicroMobilityWalletResponse> {

    /* renamed from: m */
    public C1472a f20376m;

    /* renamed from: n */
    public boolean f20377n;

    public C6564f() {
        super(MVMicroMobilityWalletResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        ServerId serverId = ((C6563e) aVar).f33829q.f33853b.f50160a.f32927c;
        MicroMobilityHistoryUserWalletStore microMobilityHistoryUserWalletStore = new MicroMobilityHistoryUserWalletStore(C13720d.m34273c(((MVMicroMobilityWalletResponse) tBase).rides, (C13722f) null, new C18262i(17)));
        Context context = this.f51773b.f51759b;
        C21100e.m49355o();
        C7543n<MicroMobilityHistoryUserWalletStore> b = MicroMobilityHistoryUserWalletStore.m11245b(context);
        if (b != null) {
            b.put(serverId.mo19751c(), microMobilityHistoryUserWalletStore);
        }
        ArrayList arrayList = new ArrayList(microMobilityHistoryUserWalletStore.f15011b);
        Collections.sort(arrayList, new C5909d(3));
        this.f20376m = new C1472a(arrayList);
        this.f20377n = false;
    }

    public C6564f(C1472a aVar) {
        super(MVMicroMobilityWalletResponse.class);
        this.f20376m = aVar;
        this.f20377n = true;
    }
}
