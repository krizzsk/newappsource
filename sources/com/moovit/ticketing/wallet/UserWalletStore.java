package com.moovit.ticketing.wallet;

import aa0.C7543n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.ticket.Ticket;
import h90.C12739a;
import j90.C12789b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p435de.C16596f;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import s90.C13083h;

public class UserWalletStore implements Parcelable {
    public static final Parcelable.Creator<UserWalletStore> CREATOR = new C7781a();

    /* renamed from: f */
    public static volatile C7543n<UserWalletStore> f23620f;

    /* renamed from: g */
    public static final C7782b f23621g = new C7782b(UserWalletStore.class);

    /* renamed from: b */
    public final List<Ticket> f23622b;

    /* renamed from: c */
    public final List<C12789b> f23623c;

    /* renamed from: d */
    public final List<C12739a> f23624d;

    /* renamed from: e */
    public final Map<String, List<TicketAgencyMessage>> f23625e;

    /* renamed from: com.moovit.ticketing.wallet.UserWalletStore$a */
    public class C7781a implements Parcelable.Creator<UserWalletStore> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserWalletStore) C19612n.m46981v(parcel, UserWalletStore.f23621g);
        }

        public final Object[] newArray(int i) {
            return new UserWalletStore[i];
        }
    }

    /* renamed from: com.moovit.ticketing.wallet.UserWalletStore$b */
    public class C7782b extends C19619s<UserWalletStore> {
        public C7782b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Map map;
            ArrayList g = pVar.mo51959g(C13083h.f32370b);
            ArrayList g2 = pVar.mo51959g(C13083h.f32369a);
            ArrayList g3 = pVar.mo51959g(C13083h.f32371c);
            if (i >= 1) {
                map = pVar.mo51961o(C19589j.f49779k, C19575a.m46957a(TicketAgencyMessage.f23241e, true), new HashMap());
            } else {
                map = Collections.emptyMap();
            }
            return new UserWalletStore(g, g2, g3, map);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            UserWalletStore userWalletStore = (UserWalletStore) obj;
            qVar.mo51965h(userWalletStore.f23622b, C13083h.f32370b);
            qVar.mo51965h(userWalletStore.f23623c, C13083h.f32369a);
            qVar.mo51965h(userWalletStore.f23624d, C13083h.f32371c);
            qVar.mo51966o(userWalletStore.f23625e, C19600l.f49790t, new C19576b(TicketAgencyMessage.f23241e, true));
        }
    }

    public UserWalletStore(List<Ticket> list, List<C12789b> list2, List<C12739a> list3, Map<String, List<TicketAgencyMessage>> map) {
        C21100e.m49373x(list, "moovitServerTickets");
        this.f23622b = list;
        C21100e.m49373x(list2, "validations");
        this.f23623c = list2;
        C21100e.m49373x(list3, "storedValues");
        this.f23624d = list3;
        C21100e.m49373x(map, "agencyMessagesByKey");
        this.f23625e = map;
    }

    /* renamed from: b */
    public static C7543n<UserWalletStore> m17749b(Context context) {
        if (f23620f == null) {
            synchronized (UserWalletStore.class) {
                if (f23620f == null) {
                    Context applicationContext = context.getApplicationContext();
                    C7782b bVar = f23621g;
                    C7543n<UserWalletStore> q = C7543n.m17285q(applicationContext, bVar, bVar, "ticketing_user_wallet_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize ticketing user wallet store!", e));
                        q = null;
                    }
                    f23620f = q;
                }
            }
        }
        return f23620f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23621g);
    }
}
