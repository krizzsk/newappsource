package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class LocationsGroup extends FavoriteGroup<Void, LocationFavorite> {
    public static final Parcelable.Creator<LocationsGroup> CREATOR = new C15610a();

    /* renamed from: d */
    public static final C15611b f40601d = new C15611b();

    /* renamed from: e */
    public static final C15612c f40602e = new C15612c(LocationsGroup.class);

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationsGroup$a */
    public class C15610a implements Parcelable.Creator<LocationsGroup> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocationsGroup) C19612n.m46981v(parcel, LocationsGroup.f40602e);
        }

        public final Object[] newArray(int i) {
            return new LocationsGroup[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationsGroup$b */
    public class C15611b extends C19621u<LocationsGroup> {
        public C15611b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((LocationsGroup) obj).mo46585b(), LocationFavorite.f40597e);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationsGroup$c */
    public class C15612c extends C19620t<LocationsGroup> {
        public C15612c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ArrayList g = pVar.mo51959g(LocationFavorite.f40598f);
            LocationsGroup locationsGroup = new LocationsGroup();
            locationsGroup.f40592c.addAll(g);
            return locationsGroup;
        }
    }

    public LocationsGroup() {
        super(null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40601d);
    }
}
