package q80;

import aa0.C7543n;
import android.content.Context;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.wallet.HistoryUserWalletStore;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import m80.C12873i;
import p80.C12991b;

/* renamed from: q80.c */
public final class C13013c extends C13746a<C13013c, C13015d> {

    /* renamed from: v */
    public final C12991b f32205v;

    /* renamed from: w */
    public final boolean f32206w;

    public C13013c(C13752e eVar, C12991b bVar, boolean z) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_history_user_wallet, true, C13015d.class);
        this.f32205v = bVar;
        this.f32206w = z;
        this.f51770m = new C14291m0(eVar, "ticketing_history_wallet");
    }

    /* renamed from: E */
    public final List<C13015d> mo21059E() throws IOException, ServerException {
        if (!this.f32205v.f32161c) {
            return Collections.emptyList();
        }
        try {
            C13015d O = mo39900O(this.f32206w);
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (RuntimeException e) {
            throw new IOException("Failed to perform local history user wallet!", e);
        }
    }

    /* renamed from: F */
    public final List<C13015d> mo22677F() {
        try {
            C13015d O = mo39900O(false);
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: O */
    public final C13015d mo39900O(boolean z) {
        HistoryUserWalletStore historyUserWalletStore;
        ServerId serverId = this.f33829q.f33853b.f50160a.f32927c;
        Context context = this.f51759b;
        C7543n<HistoryUserWalletStore> nVar = HistoryUserWalletStore.f23609c;
        C21100e.m49355o();
        C7543n<HistoryUserWalletStore> b = HistoryUserWalletStore.m17740b(context);
        if (b != null) {
            historyUserWalletStore = b.get(serverId.mo19751c());
        } else {
            historyUserWalletStore = null;
        }
        if (historyUserWalletStore == null) {
            historyUserWalletStore = new HistoryUserWalletStore(Collections.emptyList());
        }
        return new C13015d(C13015d.m32908q(this, historyUserWalletStore, z));
    }
}
