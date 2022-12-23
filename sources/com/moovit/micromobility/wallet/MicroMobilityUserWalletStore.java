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

public class MicroMobilityUserWalletStore implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityUserWalletStore> CREATOR = new C4197a();

    /* renamed from: c */
    public static volatile C7543n<MicroMobilityUserWalletStore> f15012c;

    /* renamed from: d */
    public static final C4198b f15013d = new C4198b(MicroMobilityUserWalletStore.class);

    /* renamed from: b */
    public final List<MicroMobilityRide> f15014b;

    /* renamed from: com.moovit.micromobility.wallet.MicroMobilityUserWalletStore$a */
    public class C4197a implements Parcelable.Creator<MicroMobilityUserWalletStore> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityUserWalletStore) C19612n.m46981v(parcel, MicroMobilityUserWalletStore.f15013d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityUserWalletStore[i];
        }
    }

    /* renamed from: com.moovit.micromobility.wallet.MicroMobilityUserWalletStore$b */
    public class C4198b extends C19619s<MicroMobilityUserWalletStore> {
        public C4198b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityUserWalletStore(pVar.mo51959g(MicroMobilityRide.f14983k));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((MicroMobilityUserWalletStore) obj).f15014b, MicroMobilityRide.f14983k);
        }
    }

    public MicroMobilityUserWalletStore(List<MicroMobilityRide> list) {
        C21100e.m49373x(list, "moovitServerRides");
        this.f15014b = list;
    }

    /* renamed from: b */
    public static C7543n<MicroMobilityUserWalletStore> m11249b(Context context) {
        if (f15012c == null) {
            synchronized (MicroMobilityUserWalletStore.class) {
                if (f15012c == null) {
                    Context applicationContext = context.getApplicationContext();
                    C4198b bVar = f15013d;
                    C7543n<MicroMobilityUserWalletStore> q = C7543n.m17285q(applicationContext, bVar, bVar, "micro_mobility_user_wallet_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize micro-mobility user wallet store!", e));
                        q = null;
                    }
                    f15012c = q;
                }
            }
        }
        return f15012c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15013d);
    }
}
