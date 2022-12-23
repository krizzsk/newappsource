package t30;

import aa0.C7543n;
import android.content.Context;
import b40.C1476d;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.micromobility.wallet.MicroMobilityUserWalletStore;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l30.C5570c0;
import p252sb.C6501a;

/* renamed from: t30.w */
public final class C6583w extends C13746a<C6583w, C6584x> {
    public C6583w(C13752e eVar) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_user_wallet, false, C6584x.class);
        this.f51770m = new C14291m0(eVar, "micro_mobility_wallet");
    }

    /* renamed from: F */
    public final List<C6584x> mo22677F() {
        try {
            C6584x O = mo22688O();
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: O */
    public final C6584x mo22688O() {
        MicroMobilityUserWalletStore microMobilityUserWalletStore;
        ServerId serverId = this.f33829q.f33853b.f50160a.f32927c;
        Context context = this.f51759b;
        C7543n<MicroMobilityUserWalletStore> nVar = MicroMobilityUserWalletStore.f15012c;
        C21100e.m49355o();
        C7543n<MicroMobilityUserWalletStore> b = MicroMobilityUserWalletStore.m11249b(context);
        if (b != null) {
            microMobilityUserWalletStore = b.get(serverId.mo19751c());
        } else {
            microMobilityUserWalletStore = null;
        }
        if (microMobilityUserWalletStore == null) {
            microMobilityUserWalletStore = new MicroMobilityUserWalletStore(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList(microMobilityUserWalletStore.f15014b);
        Collections.sort(arrayList, new C6501a(3));
        return new C6584x(new C1476d(arrayList));
    }
}
