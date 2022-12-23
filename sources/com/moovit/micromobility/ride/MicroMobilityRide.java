package com.moovit.micromobility.ride;

import a40.C0078a;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.micromobility.ride.C4193a;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;
import y60.C20707c;

public final class MicroMobilityRide implements C20707c {

    /* renamed from: k */
    public static final C4187a f14983k = new C4187a(MicroMobilityRide.class);

    /* renamed from: b */
    public final String f14984b;

    /* renamed from: c */
    public final String f14985c;

    /* renamed from: d */
    public final ServerId f14986d;

    /* renamed from: e */
    public final ServerId f14987e;

    /* renamed from: f */
    public final String f14988f;

    /* renamed from: g */
    public final Image f14989g;

    /* renamed from: h */
    public final long f14990h;

    /* renamed from: i */
    public final C4193a f14991i;

    /* renamed from: j */
    public final C0078a f14992j;

    public enum Status implements Parcelable {
        ACTIVE(1000),
        PAUSED(1001),
        RESERVED(4000),
        PENDING(4001),
        COMPLETED(7000),
        CANCELLED(7000),
        EXPIRED(7000);
        
        public static final C19577c<Status> CODER = null;
        public static final Parcelable.Creator<Status> CREATOR = null;
        public final int priority;

        /* renamed from: com.moovit.micromobility.ride.MicroMobilityRide$Status$a */
        public class C4185a implements Parcelable.Creator<Status> {
            public final Object createFromParcel(Parcel parcel) {
                return (Status) C19612n.m46981v(parcel, Status.CODER);
            }

            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Status status;
            Status status2;
            Status status3;
            Status status4;
            Status status5;
            Status status6;
            Status status7;
            CREATOR = new C4185a();
            CODER = new C19577c<>(Status.class, status, status3, status5, status6, status7, status2, status4);
        }

        private Status(int i) {
            this.priority = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum VehicleType implements Parcelable {
        BIKE,
        SCOOTER,
        MOPED,
        CAR;
        
        public static final C19577c<VehicleType> CODER = null;
        public static final Parcelable.Creator<VehicleType> CREATOR = null;

        /* renamed from: com.moovit.micromobility.ride.MicroMobilityRide$VehicleType$a */
        public class C4186a implements Parcelable.Creator<VehicleType> {
            public final Object createFromParcel(Parcel parcel) {
                return (VehicleType) C19612n.m46981v(parcel, VehicleType.CODER);
            }

            public final Object[] newArray(int i) {
                return new VehicleType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            VehicleType vehicleType;
            VehicleType vehicleType2;
            VehicleType vehicleType3;
            VehicleType vehicleType4;
            CREATOR = new C4186a();
            CODER = new C19577c<>(VehicleType.class, vehicleType, vehicleType2, vehicleType3, vehicleType4);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityRide$a */
    public class C4187a extends C19619s<MicroMobilityRide> {
        public C4187a(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityRide(pVar.mo51947p(), pVar.mo51947p(), new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51947p(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51925m(), (C4193a) C4193a.f15005d.read(pVar), (C0078a) C0078a.f195o.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
            qVar.mo51954p(microMobilityRide.f14984b);
            qVar.mo51954p(microMobilityRide.f14985c);
            qVar.mo51939l(microMobilityRide.f14986d.f15142b);
            qVar.mo51939l(microMobilityRide.f14987e.f15142b);
            qVar.mo51954p(microMobilityRide.f14988f);
            qVar.mo51967q(microMobilityRide.f14989g, C16019d.m40803a().f41718d);
            qVar.mo51940m(microMobilityRide.f14990h);
            C4193a aVar = microMobilityRide.f14991i;
            C4193a.C4194a aVar2 = C4193a.f15005d;
            qVar.mo51939l(aVar2.f49802v);
            aVar2.mo179c(aVar, qVar);
            C0078a aVar3 = microMobilityRide.f14992j;
            C0078a.C0079a aVar4 = C0078a.f195o;
            qVar.mo51939l(aVar4.f49802v);
            aVar4.mo179c(aVar3, qVar);
        }
    }

    public MicroMobilityRide(String str, String str2, ServerId serverId, ServerId serverId2, String str3, Image image, long j, C4193a aVar, C0078a aVar2) {
        C21100e.m49373x(str, "serviceId");
        this.f14984b = str;
        C21100e.m49373x(str2, "itemId");
        this.f14985c = str2;
        this.f14986d = serverId;
        this.f14987e = serverId2;
        C21100e.m49373x(str3, "vehicleTypeName");
        this.f14988f = str3;
        this.f14989g = image;
        Long valueOf = Long.valueOf(j);
        C21100e.m49373x(valueOf, "purchaseTime");
        this.f14990h = valueOf.longValue();
        C21100e.m49373x(aVar, "statusInfo");
        this.f14991i = aVar;
        C21100e.m49373x(aVar2, "rideInfo");
        this.f14992j = aVar2;
    }

    /* renamed from: T */
    public final long mo19565T() {
        return this.f14990h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityRide)) {
            return false;
        }
        MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
        if (!C20975x0.m49118e(this.f14984b, microMobilityRide.f14984b) || !C20975x0.m49118e(this.f14985c, microMobilityRide.f14985c) || !C20975x0.m49118e(this.f14986d, microMobilityRide.f14986d) || !C20975x0.m49118e(this.f14987e, microMobilityRide.f14987e) || !C20975x0.m49118e(this.f14988f, microMobilityRide.f14988f) || !C20975x0.m49118e(this.f14989g, microMobilityRide.f14989g) || this.f14990h != microMobilityRide.f14990h || !C20975x0.m49118e(this.f14991i, microMobilityRide.f14991i) || !C20975x0.m49118e(this.f14992j, microMobilityRide.f14992j)) {
            return false;
        }
        return true;
    }

    public final int getPriority() {
        return this.f14991i.f15007b.priority;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14984b), C17884p.m44335F(this.f14985c), C17884p.m44335F(this.f14986d), C17884p.m44335F(this.f14987e), C17884p.m44335F(this.f14988f), C17884p.m44335F(this.f14989g), C17884p.m44334E(this.f14990h), C17884p.m44335F(this.f14991i), C17884p.m44335F(this.f14992j));
    }

    /* renamed from: m1 */
    public final int compareTo(C20707c cVar) {
        int compare = Integer.compare(getPriority(), cVar.getPriority());
        if (compare == 0) {
            return -Long.compare(mo19565T(), cVar.mo19565T());
        }
        return compare;
    }
}
