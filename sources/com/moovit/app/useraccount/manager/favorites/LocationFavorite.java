package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20964s0;
import p977zz.C20975x0;
import x00.C20440a;

public final class LocationFavorite extends Favorite<LocationDescriptor> {
    public static final Parcelable.Creator<LocationFavorite> CREATOR = new C15607a();

    /* renamed from: e */
    public static final C15608b f40597e = new C15608b();

    /* renamed from: f */
    public static final C15609c f40598f = new C15609c(LocationFavorite.class);

    /* renamed from: c */
    public final String f40599c;

    /* renamed from: d */
    public LocationDescriptor f40600d;

    public enum FavoriteType {
        HOME(R.drawable.ic_home_24_on_surface_emphasis_low, R.string.dashboard_favorites_home),
        WORK(R.drawable.ic_work_24_on_surface_emphasis_low, R.string.dashboard_favorites_work),
        DEFAULT(R.drawable.ic_pin_24_on_surface_emphasis_low, 0);
        
        public static C19584i<FavoriteType> CODER;
        private final int defaultTitleResId;
        private final int iconResId;

        /* access modifiers changed from: public */
        static {
            FavoriteType favoriteType;
            FavoriteType favoriteType2;
            FavoriteType favoriteType3;
            CODER = new C19577c(FavoriteType.class, favoriteType, favoriteType2, favoriteType3);
        }

        private FavoriteType(int i, int i2) {
            this.iconResId = i;
            this.defaultTitleResId = i2;
        }

        public int getDefaultTitleResId() {
            return this.defaultTitleResId;
        }

        public int getIconResId() {
            return this.iconResId;
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationFavorite$a */
    public class C15607a implements Parcelable.Creator<LocationFavorite> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocationFavorite) C19612n.m46981v(parcel, LocationFavorite.f40598f);
        }

        public final Object[] newArray(int i) {
            return new LocationFavorite[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationFavorite$b */
    public class C15608b extends C19621u<LocationFavorite> {
        public C15608b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LocationFavorite locationFavorite = (LocationFavorite) obj;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.getClass();
            qVar.mo51939l(3);
            bVar.mo19622a((LocationDescriptor) locationFavorite.f52687b, qVar);
            qVar.mo51955t(locationFavorite.f40599c);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LocationFavorite$c */
    public class C15609c extends C19620t<LocationFavorite> {
        public C15609c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            pVar.getClass();
            return new LocationFavorite((LocationDescriptor) cVar.read(pVar), pVar.mo51948t());
        }
    }

    public LocationFavorite(LocationDescriptor locationDescriptor, String str) {
        super(locationDescriptor);
        this.f40599c = str;
        if (!C20964s0.m49090h(str)) {
            LocationDescriptor.LocationType locationType = locationDescriptor.f23647b;
            LocationDescriptor.SourceType sourceType = locationDescriptor.f23648c;
            ServerId serverId = locationDescriptor.f23649d;
            String str2 = locationDescriptor.f23650e;
            String str3 = locationDescriptor.f23651f;
            List<C20440a> list = locationDescriptor.f23652g;
            ArrayList arrayList = null;
            if (!(str3 == null && list == null)) {
                if (str3 == null) {
                    arrayList = list;
                } else if (list == null) {
                    arrayList = Collections.singletonList(new C20440a((CharSequence) str3, (String) null));
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size() + 2);
                    arrayList2.add(new C20440a((CharSequence) str3, (String) null));
                    arrayList2.add(new C20440a((CharSequence) ", ", (String) null));
                    arrayList2.addAll(list);
                    arrayList = arrayList2;
                }
            }
            locationDescriptor = new LocationDescriptor(locationType, sourceType, serverId, str2, str, arrayList, locationDescriptor.f23653h, locationDescriptor.f23654i, locationDescriptor.f23655j, locationDescriptor.f23656k);
        }
        this.f40600d = locationDescriptor;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationFavorite)) {
            return false;
        }
        LocationFavorite locationFavorite = (LocationFavorite) obj;
        if (!super.equals(locationFavorite) || !C20975x0.m49118e(this.f40599c, locationFavorite.f40599c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (super.hashCode() * 37) + C17884p.m44335F(this.f40599c);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[[NAME,");
        k.append(this.f40599c);
        k.append("][LOCATION,");
        k.append((LocationDescriptor) this.f52687b);
        k.append("]]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40597e);
    }
}
