package b40;

import aa0.C7543n;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.micromobility.wallet.MicroMobilityHistoryUserWalletStore;
import com.moovit.micromobility.wallet.MicroMobilityUserWalletStore;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p786rz.C19387a;
import w40.C25761d;

/* renamed from: b40.c */
public final class C1475c implements Callable<Void> {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f5357b;

    /* renamed from: c */
    public final AtomicReference<?> f5358c;

    /* renamed from: d */
    public final AtomicReference<?> f5359d;

    public C1475c(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<?> atomicReference, AtomicReference<?> atomicReference2) {
        C21100e.m49373x(moovitApplication, "application");
        this.f5357b = moovitApplication;
        C21100e.m49373x(atomicReference, "userWallet");
        this.f5358c = atomicReference;
        C21100e.m49373x(atomicReference2, "historyUserWallet");
        this.f5359d = atomicReference2;
    }

    public final Object call() throws Exception {
        if (!C25761d.m64299a().mo83590e()) {
            MoovitApplication<?, ?, ?> moovitApplication = this.f5357b;
            C7543n<MicroMobilityUserWalletStore> nVar = MicroMobilityUserWalletStore.f15012c;
            C19387a.m46676h(new File(new File(moovitApplication.getFilesDir(), "stores"), "micro_mobility_user_wallet_store"));
            MoovitApplication<?, ?, ?> moovitApplication2 = this.f5357b;
            C7543n<MicroMobilityHistoryUserWalletStore> nVar2 = MicroMobilityHistoryUserWalletStore.f15009c;
            C19387a.m46676h(new File(new File(moovitApplication2.getFilesDir(), "stores"), "micro_mobility_history_user_wallet_store"));
        }
        this.f5358c.set((Object) null);
        this.f5359d.set((Object) null);
        return null;
    }
}
