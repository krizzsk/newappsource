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

public class HistoricalCarpoolRide implements C5384a, HasCarpoolRide, HasPassengerRideStops {
    public static final Parcelable.Creator<HistoricalCarpoolRide> CREATOR = new C15718a();

    /* renamed from: g */
    public static final C15719b f40941g = new C15719b(HistoricalCarpoolRide.class);

    /* renamed from: b */
    public final CarpoolRide f40942b;

    /* renamed from: c */
    public boolean f40943c;

    /* renamed from: d */
    public final boolean f40944d;

    /* renamed from: e */
    public final boolean f40945e;

    /* renamed from: f */
    public final PassengerRideStops f40946f;

    /* renamed from: com.moovit.carpool.HistoricalCarpoolRide$a */
    public class C15718a implements Parcelable.Creator<HistoricalCarpoolRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (HistoricalCarpoolRide) C19612n.m46981v(parcel, HistoricalCarpoolRide.f40941g);
        }

        public final Object[] newArray(int i) {
            return new HistoricalCarpoolRide[i];
        }
    }

    /* renamed from: com.moovit.carpool.HistoricalCarpoolRide$b */
    public class C15719b extends C19619s<HistoricalCarpoolRide> {
        public C15719b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PassengerRideStops passengerRideStops;
            CarpoolRide.C15710b bVar = CarpoolRide.f40909k;
            pVar.getClass();
            CarpoolRide carpoolRide = (CarpoolRide) bVar.read(pVar);
            boolean b = pVar.mo51919b();
            boolean b2 = pVar.mo51919b();
            boolean b3 = pVar.mo51919b();
            if (i >= 1) {
                passengerRideStops = (PassengerRideStops) PassengerRideStops.f40950f.read(pVar);
            } else {
                passengerRideStops = PassengerRideStops.m40150b();
            }
            return new HistoricalCarpoolRide(carpoolRide, b, b2, b3, passengerRideStops);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            HistoricalCarpoolRide historicalCarpoolRide = (HistoricalCarpoolRide) obj;
            CarpoolRide carpoolRide = historicalCarpoolRide.f40942b;
            CarpoolRide.C15710b bVar = CarpoolRide.f40909k;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(carpoolRide, qVar);
            qVar.mo51934b(historicalCarpoolRide.f40943c);
            qVar.mo51934b(historicalCarpoolRide.f40944d);
            qVar.mo51934b(historicalCarpoolRide.f40945e);
            PassengerRideStops passengerRideStops = historicalCarpoolRide.f40946f;
            PassengerRideStops.C15723b bVar2 = PassengerRideStops.f40950f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(passengerRideStops, qVar);
        }
    }

    public HistoricalCarpoolRide(CarpoolRide carpoolRide, boolean z, boolean z2, boolean z3, PassengerRideStops passengerRideStops) {
        this.f40946f = passengerRideStops;
        C21100e.m49373x(carpoolRide, "ride");
        this.f40942b = carpoolRide;
        this.f40943c = z;
        this.f40944d = z2;
        this.f40945e = z3;
    }

    /* renamed from: a0 */
    public final CarpoolRide mo46811a0() {
        return this.f40942b;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f40942b.f40910b;
    }

    /* renamed from: q0 */
    public final PassengerRideStops mo46813q0() {
        return this.f40946f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40941g);
    }
}
