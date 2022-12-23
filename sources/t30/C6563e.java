package t30;

import aa0.C7543n;
import android.content.Context;
import b40.C1472a;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.micromobility.wallet.MicroMobilityHistoryUserWalletStore;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l30.C5570c0;
import p190o1.C5909d;

/* renamed from: t30.e */
public final class C6563e extends C13746a<C6563e, C6564f> {
    public C6563e(C13752e eVar) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_history_user_wallet, false, C6564f.class);
        this.f51770m = new C14291m0(eVar, "micro_mobility_history_wallet");
    }

    /* renamed from: F */
    public final List<C6564f> mo22677F() {
        try {
            C6564f O = mo22678O();
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: O */
    public final C6564f mo22678O() {
        MicroMobilityHistoryUserWalletStore microMobilityHistoryUserWalletStore;
        ServerId serverId = this.f33829q.f33853b.f50160a.f32927c;
        Context context = this.f51759b;
        C7543n<MicroMobilityHistoryUserWalletStore> nVar = MicroMobilityHistoryUserWalletStore.f15009c;
        C21100e.m49355o();
        C7543n<MicroMobilityHistoryUserWalletStore> b = MicroMobilityHistoryUserWalletStore.m11245b(context);
        if (b != null) {
            microMobilityHistoryUserWalletStore = b.get(serverId.mo19751c());
        } else {
            microMobilityHistoryUserWalletStore = null;
        }
        if (microMobilityHistoryUserWalletStore == null) {
            microMobilityHistoryUserWalletStore = new MicroMobilityHistoryUserWalletStore(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList(microMobilityHistoryUserWalletStore.f15011b);
        Collections.sort(arrayList, new C5909d(3));
        return new C6564f(new C1472a(arrayList));
    }
}
