package z60;

import android.content.Context;
import androidx.fragment.app.C0921d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.payment.wallet.WalletTab;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import v40.C25749d;
import v40.C25754i;

/* renamed from: z60.c */
public final class C20813c extends C0921d0 {

    /* renamed from: f */
    public final Context f52538f;

    /* renamed from: g */
    public final List<WalletTab> f52539g;

    /* renamed from: z60.c$a */
    public static /* synthetic */ class C20814a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52540a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.payment.wallet.WalletTab[] r0 = com.moovit.payment.wallet.WalletTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52540a = r0
                com.moovit.payment.wallet.WalletTab r1 = com.moovit.payment.wallet.WalletTab.VALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52540a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.wallet.WalletTab r1 = com.moovit.payment.wallet.WalletTab.EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z60.C20813c.C20814a.<clinit>():void");
        }
    }

    public C20813c(Context context, FragmentManager fragmentManager, List<WalletTab> list) {
        super(fragmentManager, 1);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f52538f = context;
        C21100e.m49373x(list, "tabs");
        this.f52539g = list;
    }

    /* renamed from: a */
    public final Fragment mo4068a(int i) {
        WalletTab walletTab = this.f52539g.get(i);
        int i2 = C20814a.f52540a[walletTab.ordinal()];
        if (i2 == 1) {
            return C20811b.m48807m2(WalletTab.VALID, C25754i.wallet_rides_tab_empty_title, C25749d.img_empty_wallet);
        }
        if (i2 == 2) {
            return C20811b.m48807m2(WalletTab.EXPIRED, C25754i.wallet_rides_history_tab_empty_title, C25749d.img_empty_wallet);
        }
        throw new IllegalStateException("Unknown tab: " + walletTab);
    }

    public final int getCount() {
        return this.f52539g.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.f52538f.getString(this.f52539g.get(i).titleResId);
    }
}
