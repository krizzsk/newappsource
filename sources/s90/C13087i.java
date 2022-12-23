package s90;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0928f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.ticketing.ticket.C7753a;
import com.moovit.ticketing.ticket.C7754b;
import com.moovit.ticketing.wallet.UserWalletTab;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h90.C12740b;
import java.util.List;
import k90.C12820b;
import m80.C12868d;
import m80.C12873i;

/* renamed from: s90.i */
public final class C13087i extends C0928f0 {

    /* renamed from: h */
    public final Context f32372h;

    /* renamed from: i */
    public final List<UserWalletTab> f32373i;

    /* renamed from: s90.i$a */
    public static /* synthetic */ class C13088a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32374a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.ticketing.wallet.UserWalletTab[] r0 = com.moovit.ticketing.wallet.UserWalletTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32374a = r0
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.VALIDATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32374a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.STORED_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32374a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32374a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s90.C13087i.C13088a.<clinit>():void");
        }
    }

    public C13087i(Context context, FragmentManager fragmentManager, List<UserWalletTab> list) {
        super(fragmentManager, 1);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f32372h = context;
        C21100e.m49373x(list, "tabs");
        this.f32373i = list;
    }

    /* renamed from: a */
    public final Fragment mo4098a(int i) {
        UserWalletTab userWalletTab = this.f32373i.get(i);
        int i2 = C13088a.f32374a[userWalletTab.ordinal()];
        if (i2 == 1) {
            int i3 = C12820b.f31687v;
            Bundle bundle = new Bundle();
            bundle.putParcelable("providerId", (Parcelable) null);
            C12820b bVar = new C12820b();
            bVar.setArguments(bundle);
            return bVar;
        } else if (i2 == 2) {
            return new C12740b();
        } else {
            if (i2 == 3) {
                C7753a aVar = new C7753a();
                int i4 = C12873i.tickets_center_empty_valid_title;
                int i5 = C12873i.tickets_center_empty_valid_subtitle;
                int i6 = C12868d.img_tickets_center_empty_valid;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("empty_state_title", i4);
                bundle2.putInt("empty_state_subtitle", i5);
                bundle2.putInt("empty_state_drawable", i6);
                aVar.setArguments(bundle2);
                return aVar;
            } else if (i2 == 4) {
                C7754b bVar2 = new C7754b();
                int i7 = C12873i.tickets_center_empty_expired_title;
                int i8 = C12873i.tickets_center_empty_expired_subtitle;
                int i9 = C12868d.img_tickets_center_empty_expired;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("empty_state_title", i7);
                bundle3.putInt("empty_state_subtitle", i8);
                bundle3.putInt("empty_state_drawable", i9);
                bVar2.setArguments(bundle3);
                return bVar2;
            } else {
                throw new IllegalStateException("Unknown tab: " + userWalletTab);
            }
        }
    }

    public final int getCount() {
        return this.f32373i.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.f32372h.getString(this.f32373i.get(i).titleResId);
    }
}
