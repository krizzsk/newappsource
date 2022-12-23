package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class Amenities implements Parcelable {
    public static final Parcelable.Creator<Amenities> CREATOR = new C7784a();

    /* renamed from: c */
    public static C7785b f23626c = new C7785b(Amenities.class);

    /* renamed from: b */
    public final int f23627b;

    /* renamed from: com.moovit.transit.Amenities$a */
    public class C7784a implements Parcelable.Creator<Amenities> {
        public final Object createFromParcel(Parcel parcel) {
            return (Amenities) C19612n.m46981v(parcel, Amenities.f23626c);
        }

        public final Object[] newArray(int i) {
            return new Amenities[i];
        }
    }

    /* renamed from: com.moovit.transit.Amenities$b */
    public class C7785b extends C19619s<Amenities> {
        public C7785b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new Amenities(pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51939l(((Amenities) obj).f23627b);
        }
    }

    public Amenities(int i) {
        this.f23627b = i;
    }

    /* renamed from: b */
    public static Amenities m17753b() {
        return new Amenities(0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Amenities) && this.f23627b == ((Amenities) obj).f23627b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23627b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23626c);
    }
}
