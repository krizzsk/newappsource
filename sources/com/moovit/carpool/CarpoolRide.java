package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolLocationDescriptor;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolRide implements Parcelable, C5384a {
    public static final Parcelable.Creator<CarpoolRide> CREATOR = new C15709a();

    /* renamed from: k */
    public static final C15710b f40909k = new C15710b(CarpoolRide.class);

    /* renamed from: b */
    public final ServerId f40910b;

    /* renamed from: c */
    public final CarpoolDriver f40911c;

    /* renamed from: d */
    public final long f40912d;

    /* renamed from: e */
    public final CarpoolLocationDescriptor f40913e;

    /* renamed from: f */
    public final String f40914f;

    /* renamed from: g */
    public final CarpoolLocationDescriptor f40915g;

    /* renamed from: h */
    public final String f40916h;

    /* renamed from: i */
    public final CurrencyAmount f40917i;

    /* renamed from: j */
    public final CurrencyAmount f40918j;

    /* renamed from: com.moovit.carpool.CarpoolRide$a */
    public class C15709a implements Parcelable.Creator<CarpoolRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolRide) C19612n.m46981v(parcel, CarpoolRide.f40909k);
        }

        public final Object[] newArray(int i) {
            return new CarpoolRide[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolRide$b */
    public class C15710b extends C19619s<CarpoolRide> {
        public C15710b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            long m = pVar.mo51925m();
            CarpoolLocationDescriptor.C15704c cVar = CarpoolLocationDescriptor.f40893h;
            String t = pVar.mo51948t();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new CarpoolRide(new ServerId(pVar.mo51924l()), (CarpoolDriver) CarpoolDriver.f40874s.read(pVar), m, (CarpoolLocationDescriptor) cVar.read(pVar), pVar.mo51948t(), (CarpoolLocationDescriptor) cVar.read(pVar), t, (CurrencyAmount) bVar.read(pVar), (CurrencyAmount) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolRide carpoolRide = (CarpoolRide) obj;
            ServerId serverId = carpoolRide.f40910b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            CarpoolDriver carpoolDriver = carpoolRide.f40911c;
            CarpoolDriver.C15701b bVar = CarpoolDriver.f40874s;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(carpoolDriver, qVar);
            qVar.mo51940m(carpoolRide.f40912d);
            CarpoolLocationDescriptor carpoolLocationDescriptor = carpoolRide.f40913e;
            CarpoolLocationDescriptor.C15703b bVar2 = CarpoolLocationDescriptor.f40892g;
            qVar.mo51939l(0);
            bVar2.mo19622a(carpoolLocationDescriptor, qVar);
            qVar.mo51955t(carpoolRide.f40914f);
            CarpoolLocationDescriptor carpoolLocationDescriptor2 = carpoolRide.f40915g;
            qVar.mo51939l(0);
            bVar2.mo19622a(carpoolLocationDescriptor2, qVar);
            qVar.mo51955t(carpoolRide.f40916h);
            CurrencyAmount currencyAmount = carpoolRide.f40917i;
            CurrencyAmount.C7881b bVar3 = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = carpoolRide.f40918j;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(currencyAmount2, qVar);
        }
    }

    public CarpoolRide(ServerId serverId, CarpoolDriver carpoolDriver, long j, CarpoolLocationDescriptor carpoolLocationDescriptor, String str, CarpoolLocationDescriptor carpoolLocationDescriptor2, String str2, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        this.f40910b = serverId;
        C21100e.m49373x(carpoolDriver, "driver");
        this.f40911c = carpoolDriver;
        this.f40912d = j;
        C21100e.m49373x(carpoolLocationDescriptor, "pickupLocation");
        this.f40913e = carpoolLocationDescriptor;
        this.f40914f = str;
        C21100e.m49373x(carpoolLocationDescriptor2, "dropoffLocation");
        this.f40915g = carpoolLocationDescriptor2;
        this.f40916h = str2;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f40917i = currencyAmount;
        C21100e.m49373x(currencyAmount2, "actualPrice");
        this.f40918j = currencyAmount2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarpoolRide)) {
            return false;
        }
        return this.f40910b.equals(((CarpoolRide) obj).f40910b);
    }

    public final ServerId getServerId() {
        return this.f40910b;
    }

    public final int hashCode() {
        return this.f40910b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40909k);
    }
}
