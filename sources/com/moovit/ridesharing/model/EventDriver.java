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

public class EventDriver implements Parcelable {
    public static final Parcelable.Creator<EventDriver> CREATOR = new C16426a();

    /* renamed from: g */
    public static C16427b f42936g = new C16427b(EventDriver.class);

    /* renamed from: b */
    public final String f42937b;

    /* renamed from: c */
    public final String f42938c;

    /* renamed from: d */
    public final String f42939d;

    /* renamed from: e */
    public final String f42940e;

    /* renamed from: f */
    public final EventVehicle f42941f;

    /* renamed from: com.moovit.ridesharing.model.EventDriver$a */
    public class C16426a implements Parcelable.Creator<EventDriver> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventDriver) C19612n.m46981v(parcel, EventDriver.f42936g);
        }

        public final Object[] newArray(int i) {
            return new EventDriver[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventDriver$b */
    public class C16427b extends C19619s<EventDriver> {
        public C16427b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new EventDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (EventVehicle) pVar.mo51962q(EventVehicle.f42974c));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventDriver eventDriver = (EventDriver) obj;
            qVar.mo51954p(eventDriver.f42937b);
            qVar.mo51954p(eventDriver.f42938c);
            qVar.mo51954p(eventDriver.f42939d);
            qVar.mo51955t(eventDriver.f42940e);
            qVar.mo51967q(eventDriver.f42941f, EventVehicle.f42974c);
        }
    }

    public EventDriver(String str, String str2, String str3, String str4, EventVehicle eventVehicle) {
        C21100e.m49373x(str, "id");
        this.f42937b = str;
        C21100e.m49373x(str2, "firstName");
        this.f42938c = str2;
        C21100e.m49373x(str3, "lastName");
        this.f42939d = str3;
        this.f42940e = str4;
        this.f42941f = eventVehicle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42936g);
    }
}
