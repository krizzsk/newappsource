package s90;

import aa0.C7543n;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.ticketing.wallet.HistoryUserWalletStore;
import com.moovit.ticketing.wallet.UserWalletStore;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import w40.C25761d;

/* renamed from: s90.c */
public final class C13075c implements Callable<Void> {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f32341b;

    /* renamed from: c */
    public final AtomicReference<?> f32342c;

    /* renamed from: d */
    public final AtomicReference<?> f32343d;

    public C13075c(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<?> atomicReference, AtomicReference<?> atomicReference2) {
        C21100e.m49373x(moovitApplication, "application");
        this.f32341b = moovitApplication;
        C21100e.m49373x(atomicReference, "userWalletReference");
        this.f32342c = atomicReference;
        C21100e.m49373x(atomicReference2, "historyUserWalletReference");
        this.f32343d = atomicReference2;
    }

    public final Object call() throws Exception {
        if (!C25761d.m64299a().mo83590e()) {
            MoovitApplication<?, ?, ?> moovitApplication = this.f32341b;
            C7543n<UserWalletStore> nVar = UserWalletStore.f23620f;
            moovitApplication.deleteFile("ticketing_user_wallet_store");
            MoovitApplication<?, ?, ?> moovitApplication2 = this.f32341b;
            C7543n<HistoryUserWalletStore> nVar2 = HistoryUserWalletStore.f23609c;
            moovitApplication2.deleteFile("ticketing_history_user_wallet_store");
        }
        this.f32342c.set((Object) null);
        this.f32343d.set((Object) null);
        return null;
    }
}
