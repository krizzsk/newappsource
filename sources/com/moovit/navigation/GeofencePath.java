package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import c00.C13717b;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class GeofencePath implements Parcelable {
    public static final Parcelable.Creator<GeofencePath> CREATOR = new C4204a();

    /* renamed from: d */
    public static final C4205b f15033d = new C4205b();

    /* renamed from: e */
    public static final C4206c f15034e = new C4206c(GeofencePath.class);

    /* renamed from: b */
    public final ArrayList<NavigationGeofence> f15035b;

    /* renamed from: c */
    public final SparseIntArray f15036c;

    /* renamed from: com.moovit.navigation.GeofencePath$a */
    public class C4204a implements Parcelable.Creator<GeofencePath> {
        public final Object createFromParcel(Parcel parcel) {
            return (GeofencePath) C19612n.m46981v(parcel, GeofencePath.f15034e);
        }

        public final Object[] newArray(int i) {
            return new GeofencePath[i];
        }
    }

    /* renamed from: com.moovit.navigation.GeofencePath$b */
    public class C4205b extends C19621u<GeofencePath> {
        public C4205b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((GeofencePath) obj).f15035b, NavigationGeofence.f15044h);
        }
    }

    /* renamed from: com.moovit.navigation.GeofencePath$c */
    public class C4206c extends C19620t<GeofencePath> {
        public C4206c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new GeofencePath(pVar.mo51959g(NavigationGeofence.f15045i));
        }
    }

    public GeofencePath(ArrayList<NavigationGeofence> arrayList) {
        if (!C13717b.m34258e(arrayList)) {
            this.f15035b = arrayList;
            this.f15036c = new SparseIntArray(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                this.f15036c.put(arrayList.get(i).f15047c.f15142b, i);
            }
            return;
        }
        throw new IllegalArgumentException("geofenceList may not be null or empty");
    }

    /* renamed from: b */
    public final NavigationGeofence mo19625b(NavigationGeofence navigationGeofence) {
        NavigationGeofence navigationGeofence2;
        int i = navigationGeofence.f15050f;
        do {
            i++;
            if (i >= this.f15035b.size()) {
                return null;
            }
            navigationGeofence2 = this.f15035b.get(i);
        } while (navigationGeofence2.f15051g.f15028f);
        return navigationGeofence2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15033d);
    }
}
