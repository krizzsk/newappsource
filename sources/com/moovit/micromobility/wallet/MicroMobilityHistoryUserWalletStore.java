package com.moovit.micromobility.wallet;

import aa0.C7543n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.io.IOException;
import java.util.List;
import p435de.C16596f;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityHistoryUserWalletStore implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityHistoryUserWalletStore> CREATOR = new C4195a();

    /* renamed from: c */
    public static volatile C7543n<MicroMobilityHistoryUserWalletStore> f15009c;

    /* renamed from: d */
    public static final C4196b f15010d = new C4196b(MicroMobilityHistoryUserWalletStore.class);

    /* renamed from: b */
    public final List<MicroMobilityRide> f15011b;

    /* renamed from: com.moovit.micromobility.wallet.MicroMobilityHistoryUserWalletStore$a */
    public class C4195a implements Parcelable.Creator<MicroMobilityHistoryUserWalletStore> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityHistoryUserWalletStore) C19612n.m46981v(parcel, MicroMobilityHistoryUserWalletStore.f15010d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityHistoryUserWalletStore[i];
        }
    }

    /* renamed from: com.moovit.micromobility.wallet.MicroMobilityHistoryUserWalletStore$b */
    public class C4196b extends C19619s<MicroMobilityHistoryUserWalletStore> {
        public C4196b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityHistoryUserWalletStore(pVar.mo51959g(MicroMobilityRide.f14983k));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((MicroMobilityHistoryUserWalletStore) obj).f15011b, MicroMobilityRide.f14983k);
        }
    }

    public MicroMobilityHistoryUserWalletStore(List<MicroMobilityRide> list) {
        C21100e.m49373x(list, "moovitServerRides");
        this.f15011b = list;
    }

    /* renamed from: b */
    public static C7543n<MicroMobilityHistoryUserWalletStore> m11245b(Context context) {
        if (f15009c == null) {
            synchronized (MicroMobilityHistoryUserWalletStore.class) {
                if (f15009c == null) {
                    Context applicationContext = context.getApplicationContext();
                    C4196b bVar = f15010d;
                    C7543n<MicroMobilityHistoryUserWalletStore> q = C7543n.m17285q(applicationContext, bVar, bVar, "micro_mobility_history_user_wallet_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize micro-mobility user wallet store!", e));
                        q = null;
                    }
                    f15009c = q;
                }
            }
        }
        return f15009c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15010d);
    }
}
