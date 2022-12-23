package q80;

import aa0.C7543n;
import android.content.Context;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.wallet.UserWalletStore;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import m80.C12873i;
import p80.C12991b;

/* renamed from: q80.b0 */
public final class C13012b0 extends C13746a<C13012b0, C13014c0> {

    /* renamed from: v */
    public final C12991b f32203v;

    /* renamed from: w */
    public final boolean f32204w;

    public C13012b0(C13752e eVar, C12991b bVar, boolean z) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_user_wallet, true, C13014c0.class);
        this.f32203v = bVar;
        this.f32204w = z;
        this.f51770m = new C14291m0(eVar, "ticketing_wallet");
    }

    /* renamed from: E */
    public final List<C13014c0> mo21059E() throws IOException, ServerException {
        if (!this.f32203v.f32161c) {
            return Collections.emptyList();
        }
        try {
            C13014c0 O = mo39899O(this.f32204w);
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (RuntimeException e) {
            throw new IOException("Failed to perform local user wallet!", e);
        }
    }

    /* renamed from: F */
    public final List<C13014c0> mo22677F() {
        try {
            C13014c0 O = mo39899O(false);
            this.f51765h = true;
            return Collections.singletonList(O);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: O */
    public final C13014c0 mo39899O(boolean z) {
        UserWalletStore userWalletStore;
        ServerId serverId = this.f33829q.f33853b.f50160a.f32927c;
        Context context = this.f51759b;
        C7543n<UserWalletStore> nVar = UserWalletStore.f23620f;
        C21100e.m49355o();
        C7543n<UserWalletStore> b = UserWalletStore.m17749b(context);
        if (b != null) {
            userWalletStore = b.get(serverId.mo19751c());
        } else {
            userWalletStore = null;
        }
        if (userWalletStore == null) {
            userWalletStore = new UserWalletStore(Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyMap());
        }
        return new C13014c0(C13014c0.m32906q(this, userWalletStore, z));
    }
}
