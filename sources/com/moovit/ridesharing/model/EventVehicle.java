package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EventVehicle implements Parcelable {
    public static final Parcelable.Creator<EventVehicle> CREATOR = new C16437a();

    /* renamed from: c */
    public static C16438b f42974c = new C16438b(EventVehicle.class);

    /* renamed from: b */
    public String f42975b;

    /* renamed from: com.moovit.ridesharing.model.EventVehicle$a */
    public class C16437a implements Parcelable.Creator<EventVehicle> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventVehicle) C19612n.m46981v(parcel, EventVehicle.f42974c);
        }

        public final Object[] newArray(int i) {
            return new EventVehicle[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventVehicle$b */
    public class C16438b extends C19619s<EventVehicle> {
        public C16438b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new EventVehicle(pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((EventVehicle) obj).f42975b);
        }
    }

    public EventVehicle(String str) {
        C21100e.m49373x(str, "licensePlate");
        this.f42975b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42974c);
    }
}
