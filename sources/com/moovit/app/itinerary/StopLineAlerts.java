package com.moovit.app.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class StopLineAlerts implements Parcelable {
    public static final Parcelable.Creator<StopLineAlerts> CREATOR = new C15032a();

    /* renamed from: d */
    public static final C15033b f38523d = new C15033b();

    /* renamed from: e */
    public static final C15034c f38524e = new C15034c(StopLineAlerts.class);

    /* renamed from: b */
    public final String f38525b;

    /* renamed from: c */
    public final String f38526c;

    /* renamed from: com.moovit.app.itinerary.StopLineAlerts$a */
    public class C15032a implements Parcelable.Creator<StopLineAlerts> {
        public final Object createFromParcel(Parcel parcel) {
            return (StopLineAlerts) C19612n.m46981v(parcel, StopLineAlerts.f38524e);
        }

        public final Object[] newArray(int i) {
            return new StopLineAlerts[i];
        }
    }

    /* renamed from: com.moovit.app.itinerary.StopLineAlerts$b */
    public class C15033b extends C19621u<StopLineAlerts> {
        public C15033b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            StopLineAlerts stopLineAlerts = (StopLineAlerts) obj;
            qVar.mo51955t(stopLineAlerts.f38525b);
            qVar.mo51955t(stopLineAlerts.f38526c);
        }
    }

    /* renamed from: com.moovit.app.itinerary.StopLineAlerts$c */
    public class C15034c extends C19620t<StopLineAlerts> {
        public C15034c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new StopLineAlerts(pVar.mo51948t(), pVar.mo51948t());
        }
    }

    public StopLineAlerts(String str, String str2) {
        this.f38525b = str;
        this.f38526c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38523d);
    }
}
