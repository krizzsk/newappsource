package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CarpoolRideRequest implements C5384a, Parcelable {
    public static final Parcelable.Creator<CarpoolRideRequest> CREATOR = new C15713a();

    /* renamed from: j */
    public static final C15714b f40926j = new C15714b();

    /* renamed from: k */
    public static final C15715c f40927k = new C15715c(CarpoolRideRequest.class);

    /* renamed from: b */
    public ServerId f40928b;

    /* renamed from: c */
    public LocationDescriptor f40929c;

    /* renamed from: d */
    public LocationDescriptor f40930d;

    /* renamed from: e */
    public long f40931e;

    /* renamed from: f */
    public long f40932f;

    /* renamed from: g */
    public int f40933g;

    /* renamed from: h */
    public CurrencyAmount f40934h;

    /* renamed from: i */
    public RideRequestStatus f40935i;

    /* renamed from: com.moovit.carpool.CarpoolRideRequest$a */
    public class C15713a implements Parcelable.Creator<CarpoolRideRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolRideRequest) C19612n.m46981v(parcel, CarpoolRideRequest.f40927k);
        }

        public final Object[] newArray(int i) {
            return new CarpoolRideRequest[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolRideRequest$b */
    public class C15714b extends C19621u<CarpoolRideRequest> {
        public C15714b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarpoolRideRequest carpoolRideRequest = (CarpoolRideRequest) obj;
            ServerId serverId = carpoolRideRequest.f40928b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            LocationDescriptor locationDescriptor = carpoolRideRequest.f40929c;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = carpoolRideRequest.f40930d;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor2, qVar);
            qVar.mo51940m(carpoolRideRequest.f40931e);
            qVar.mo51940m(carpoolRideRequest.f40932f);
            qVar.mo51939l(carpoolRideRequest.f40933g);
            CurrencyAmount currencyAmount = carpoolRideRequest.f40934h;
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(currencyAmount, qVar);
            RideRequestStatus.CODER.write(carpoolRideRequest.f40935i, qVar);
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolRideRequest$c */
    public class C15715c extends C19620t<CarpoolRideRequest> {
        public C15715c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            return new CarpoolRideRequest(serverId, (LocationDescriptor) cVar.read(pVar), (LocationDescriptor) cVar.read(pVar), pVar.mo51925m(), pVar.mo51925m(), pVar.mo51924l(), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar), (RideRequestStatus) C13555b.m33968g(RideRequestStatus.CODER, pVar));
        }
    }

    public CarpoolRideRequest(ServerId serverId, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, long j, long j2, int i, CurrencyAmount currencyAmount, RideRequestStatus rideRequestStatus) {
        this.f40928b = serverId;
        C21100e.m49373x(locationDescriptor, "pickup");
        this.f40929c = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "dropOff");
        this.f40930d = locationDescriptor2;
        this.f40931e = j;
        this.f40932f = j2;
        this.f40933g = i;
        C21100e.m49373x(currencyAmount, "recommendedPrice");
        this.f40934h = currencyAmount;
        C21100e.m49373x(rideRequestStatus, "rideRequestStatus");
        this.f40935i = rideRequestStatus;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f40928b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40926j);
    }
}
