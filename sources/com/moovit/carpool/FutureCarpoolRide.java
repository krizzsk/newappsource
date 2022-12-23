package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class FutureCarpoolRide implements C5384a, HasCarpoolRide, HasPassengerRideStops {
    public static final Parcelable.Creator<FutureCarpoolRide> CREATOR = new C15716a();

    /* renamed from: f */
    public static final C15717b f40936f = new C15717b(FutureCarpoolRide.class);

    /* renamed from: b */
    public final CarpoolRide f40937b;

    /* renamed from: c */
    public final InvitationState f40938c;

    /* renamed from: d */
    public boolean f40939d;

    /* renamed from: e */
    public final PassengerRideStops f40940e;

    public enum InvitationState {
        INVITED,
        NOT_INTERESTED,
        INTERESTED,
        REJECTED_BY_DRIVER,
        APPROVED_BY_DRIVER,
        CANCELED_BY_PASSENGER,
        APPROVED_WITH_TIME_CHANGE_BY_DRIVER;
        
        public static C19584i<InvitationState> CODER;

        /* access modifiers changed from: public */
        static {
            InvitationState invitationState;
            InvitationState invitationState2;
            InvitationState invitationState3;
            InvitationState invitationState4;
            InvitationState invitationState5;
            InvitationState invitationState6;
            InvitationState invitationState7;
            CODER = new C19577c(InvitationState.class, invitationState, invitationState2, invitationState3, invitationState4, invitationState5, invitationState6, invitationState7);
        }
    }

    /* renamed from: com.moovit.carpool.FutureCarpoolRide$a */
    public class C15716a implements Parcelable.Creator<FutureCarpoolRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (FutureCarpoolRide) C19612n.m46981v(parcel, FutureCarpoolRide.f40936f);
        }

        public final Object[] newArray(int i) {
            return new FutureCarpoolRide[i];
        }
    }

    /* renamed from: com.moovit.carpool.FutureCarpoolRide$b */
    public class C15717b extends C19619s<FutureCarpoolRide> {
        public C15717b(Class cls) {
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
            InvitationState read = InvitationState.CODER.read(pVar);
            boolean b = pVar.mo51919b();
            if (i >= 1) {
                passengerRideStops = (PassengerRideStops) PassengerRideStops.f40950f.read(pVar);
            } else {
                passengerRideStops = PassengerRideStops.m40150b();
            }
            return new FutureCarpoolRide(carpoolRide, read, b, passengerRideStops);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            FutureCarpoolRide futureCarpoolRide = (FutureCarpoolRide) obj;
            CarpoolRide carpoolRide = futureCarpoolRide.f40937b;
            CarpoolRide.C15710b bVar = CarpoolRide.f40909k;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(carpoolRide, qVar);
            InvitationState.CODER.write(futureCarpoolRide.f40938c, qVar);
            qVar.mo51934b(futureCarpoolRide.f40939d);
            PassengerRideStops passengerRideStops = futureCarpoolRide.f40940e;
            PassengerRideStops.C15723b bVar2 = PassengerRideStops.f40950f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(passengerRideStops, qVar);
        }
    }

    public FutureCarpoolRide(CarpoolRide carpoolRide, InvitationState invitationState, boolean z, PassengerRideStops passengerRideStops) {
        C21100e.m49373x(passengerRideStops, "passengerRideStops");
        this.f40940e = passengerRideStops;
        C21100e.m49373x(carpoolRide, "ride");
        this.f40937b = carpoolRide;
        C21100e.m49373x(invitationState, "invitationState");
        this.f40938c = invitationState;
        this.f40939d = z;
    }

    /* renamed from: a0 */
    public final CarpoolRide mo46811a0() {
        return this.f40937b;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f40937b.f40910b;
    }

    /* renamed from: q0 */
    public final PassengerRideStops mo46813q0() {
        return this.f40940e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40936f);
    }
}
