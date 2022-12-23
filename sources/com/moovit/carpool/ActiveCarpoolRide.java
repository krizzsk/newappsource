package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ActiveCarpoolRide implements C5384a, HasCarpoolRide, HasPassengerRideStops {
    public static final Parcelable.Creator<ActiveCarpoolRide> CREATOR = new C15689a();

    /* renamed from: f */
    public static final C15690b f40853f = new C15690b(ActiveCarpoolRide.class);

    /* renamed from: b */
    public final CarpoolRide f40854b;

    /* renamed from: c */
    public final boolean f40855c;

    /* renamed from: d */
    public final boolean f40856d;

    /* renamed from: e */
    public final PassengerRideStops f40857e;

    /* renamed from: com.moovit.carpool.ActiveCarpoolRide$a */
    public class C15689a implements Parcelable.Creator<ActiveCarpoolRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (ActiveCarpoolRide) C19612n.m46981v(parcel, ActiveCarpoolRide.f40853f);
        }

        public final Object[] newArray(int i) {
            return new ActiveCarpoolRide[i];
        }
    }

    /* renamed from: com.moovit.carpool.ActiveCarpoolRide$b */
    public class C15690b extends C19619s<ActiveCarpoolRide> {
        public C15690b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PassengerRideStops passengerRideStops;
            CarpoolRide.C15710b bVar = CarpoolRide.f40909k;
            pVar.getClass();
            CarpoolRide carpoolRide = (CarpoolRide) bVar.read(pVar);
            boolean b = pVar.mo51919b();
            boolean b2 = pVar.mo51919b();
            if (i >= 1) {
                passengerRideStops = (PassengerRideStops) PassengerRideStops.f40950f.read(pVar);
            } else {
                passengerRideStops = PassengerRideStops.m40150b();
            }
            return new ActiveCarpoolRide(carpoolRide, b, b2, passengerRideStops);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ActiveCarpoolRide activeCarpoolRide = (ActiveCarpoolRide) obj;
            CarpoolRide carpoolRide = activeCarpoolRide.f40854b;
            CarpoolRide.C15710b bVar = CarpoolRide.f40909k;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(carpoolRide, qVar);
            qVar.mo51934b(activeCarpoolRide.f40855c);
            qVar.mo51934b(activeCarpoolRide.f40856d);
            PassengerRideStops passengerRideStops = activeCarpoolRide.f40857e;
            PassengerRideStops.C15723b bVar2 = PassengerRideStops.f40950f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(passengerRideStops, qVar);
        }
    }

    public ActiveCarpoolRide(CarpoolRide carpoolRide, boolean z, boolean z2, PassengerRideStops passengerRideStops) {
        C21100e.m49373x(passengerRideStops, "passengerRideStops");
        this.f40857e = passengerRideStops;
        C21100e.m49373x(carpoolRide, "ride");
        this.f40854b = carpoolRide;
        this.f40855c = z;
        this.f40856d = z2;
    }

    /* renamed from: a0 */
    public final CarpoolRide mo46811a0() {
        return this.f40854b;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f40854b.f40910b;
    }

    /* renamed from: q0 */
    public final PassengerRideStops mo46813q0() {
        return this.f40857e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40853f);
    }
}
