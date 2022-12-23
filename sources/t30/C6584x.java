package t30;

import aa0.C7543n;
import android.content.Context;
import b40.C1476d;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.micromobility.wallet.MicroMobilityUserWalletStore;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.thrift.TBase;
import p252sb.C6501a;
import p828tt.C19759a;

/* renamed from: t30.x */
public final class C6584x extends C13780t<C6583w, C6584x, MVMicroMobilityWalletResponse> {

    /* renamed from: m */
    public C1476d f20401m;

    /* renamed from: n */
    public boolean f20402n;

    public C6584x() {
        super(MVMicroMobilityWalletResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        ServerId serverId = ((C6583w) aVar).f33829q.f33853b.f50160a.f32927c;
        MicroMobilityUserWalletStore microMobilityUserWalletStore = new MicroMobilityUserWalletStore(C13720d.m34273c(((MVMicroMobilityWalletResponse) tBase).rides, (C13722f) null, new C19759a(15)));
        Context context = this.f51773b.f51759b;
        C21100e.m49355o();
        C7543n<MicroMobilityUserWalletStore> b = MicroMobilityUserWalletStore.m11249b(context);
        if (b != null) {
            b.put(serverId.mo19751c(), microMobilityUserWalletStore);
        }
        ArrayList arrayList = new ArrayList(microMobilityUserWalletStore.f15014b);
        Collections.sort(arrayList, new C6501a(3));
        this.f20401m = new C1476d(arrayList);
        this.f20402n = false;
    }

    public C6584x(C1476d dVar) {
        super(MVMicroMobilityWalletResponse.class);
        this.f20401m = dVar;
        this.f20402n = true;
    }
}
