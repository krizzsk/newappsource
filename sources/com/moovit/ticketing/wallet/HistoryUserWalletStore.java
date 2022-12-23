package com.moovit.ticketing.wallet;

import aa0.C7543n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.ticketing.ticket.Ticket;
import java.io.IOException;
import java.util.List;
import p435de.C16596f;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import s90.C13083h;

public class HistoryUserWalletStore implements Parcelable {
    public static final Parcelable.Creator<HistoryUserWalletStore> CREATOR = new C7777a();

    /* renamed from: c */
    public static volatile C7543n<HistoryUserWalletStore> f23609c;

    /* renamed from: d */
    public static final C7778b f23610d = new C7778b(HistoryUserWalletStore.class);

    /* renamed from: b */
    public final List<Ticket> f23611b;

    /* renamed from: com.moovit.ticketing.wallet.HistoryUserWalletStore$a */
    public class C7777a implements Parcelable.Creator<HistoryUserWalletStore> {
        public final Object createFromParcel(Parcel parcel) {
            return (HistoryUserWalletStore) C19612n.m46981v(parcel, HistoryUserWalletStore.f23610d);
        }

        public final Object[] newArray(int i) {
            return new HistoryUserWalletStore[i];
        }
    }

    /* renamed from: com.moovit.ticketing.wallet.HistoryUserWalletStore$b */
    public class C7778b extends C19619s<HistoryUserWalletStore> {
        public C7778b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new HistoryUserWalletStore(pVar.mo51959g(C13083h.f32370b));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((HistoryUserWalletStore) obj).f23611b, C13083h.f32370b);
        }
    }

    public HistoryUserWalletStore(List<Ticket> list) {
        C21100e.m49373x(list, "moovitServerTickets");
        this.f23611b = list;
    }

    /* renamed from: b */
    public static C7543n<HistoryUserWalletStore> m17740b(Context context) {
        if (f23609c == null) {
            synchronized (HistoryUserWalletStore.class) {
                if (f23609c == null) {
                    Context applicationContext = context.getApplicationContext();
                    C7778b bVar = f23610d;
                    C7543n<HistoryUserWalletStore> q = C7543n.m17285q(applicationContext, bVar, bVar, "ticketing_history_user_wallet_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize ticketing user tickets history store!", e));
                        q = null;
                    }
                    f23609c = q;
                }
            }
        }
        return f23609c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23610d);
    }
}
