package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public final class LineFavorite extends Favorite<ServerId> implements C5384a {
    public static final Parcelable.Creator<LineFavorite> CREATOR = new C15601a();

    /* renamed from: c */
    public static final C15602b f40593c = new C15602b();

    /* renamed from: d */
    public static final C15603c f40594d = new C15603c(LineFavorite.class);

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LineFavorite$a */
    public class C15601a implements Parcelable.Creator<LineFavorite> {
        public final Object createFromParcel(Parcel parcel) {
            return (LineFavorite) C19612n.m46981v(parcel, LineFavorite.f40594d);
        }

        public final Object[] newArray(int i) {
            return new LineFavorite[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LineFavorite$b */
    public class C15602b extends C19621u<LineFavorite> {
        public C15602b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.getClass();
            qVar.mo51939l(((ServerId) ((LineFavorite) obj).f52687b).f15142b);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LineFavorite$c */
    public class C15603c extends C19620t<LineFavorite> {
        public C15603c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (i == 1) {
                pVar.getClass();
                serverId = new ServerId(pVar.mo51924l());
            } else {
                TransitLine.C7812c cVar = TransitLine.f23683i;
                pVar.getClass();
                serverId = ((TransitLine) cVar.read(pVar)).mo24369b().f23694b;
                TransitStop.f23729s.read(pVar);
            }
            return new LineFavorite(serverId);
        }
    }

    public LineFavorite(ServerId serverId) {
        super(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return (ServerId) this.f52687b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40593c);
    }
}
