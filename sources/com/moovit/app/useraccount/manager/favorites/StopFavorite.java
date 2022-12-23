package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public final class StopFavorite extends Favorite<ServerId> implements C5384a {
    public static final Parcelable.Creator<StopFavorite> CREATOR = new C15613a();

    /* renamed from: c */
    public static final C15614b f40603c = new C15614b();

    /* renamed from: d */
    public static final C15615c f40604d = new C15615c(StopFavorite.class);

    /* renamed from: com.moovit.app.useraccount.manager.favorites.StopFavorite$a */
    public class C15613a implements Parcelable.Creator<StopFavorite> {
        public final Object createFromParcel(Parcel parcel) {
            return (StopFavorite) C19612n.m46981v(parcel, StopFavorite.f40604d);
        }

        public final Object[] newArray(int i) {
            return new StopFavorite[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.StopFavorite$b */
    public class C15614b extends C19621u<StopFavorite> {
        public C15614b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.getClass();
            qVar.mo51939l(((ServerId) ((StopFavorite) obj).f52687b).f15142b);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.StopFavorite$c */
    public class C15615c extends C19620t<StopFavorite> {
        public C15615c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new StopFavorite(new ServerId(pVar.mo51924l()));
        }
    }

    public StopFavorite(ServerId serverId) {
        super(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return (ServerId) this.f52687b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40603c);
    }
}
