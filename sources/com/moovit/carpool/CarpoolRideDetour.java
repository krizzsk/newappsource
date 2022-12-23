package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolRideDetour implements Parcelable {
    public static final Parcelable.Creator<CarpoolRideDetour> CREATOR = new C15711a();

    /* renamed from: h */
    public static final C15712b f40919h = new C15712b(CarpoolRideDetour.class);

    /* renamed from: b */
    public final LocationDescriptor f40920b;

    /* renamed from: c */
    public final CurrencyAmount f40921c;

    /* renamed from: d */
    public final CurrencyAmount f40922d;

    /* renamed from: e */
    public final int f40923e;

    /* renamed from: f */
    public final int f40924f;

    /* renamed from: g */
    public final byte[] f40925g;

    /* renamed from: com.moovit.carpool.CarpoolRideDetour$a */
    public class C15711a implements Parcelable.Creator<CarpoolRideDetour> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolRideDetour) C19612n.m46981v(parcel, CarpoolRideDetour.f40919h);
        }

        public final Object[] newArray(int i) {
            return new CarpoolRideDetour[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolRideDetour$b */
    public class C15712b extends C19619s<CarpoolRideDetour> {
        public C15712b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            pVar.getClass();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new CarpoolRideDetour((LocationDescriptor) cVar.read(pVar), (CurrencyAmount) bVar.read(pVar), (CurrencyAmount) bVar.read(pVar), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51944d());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolRideDetour carpoolRideDetour = (CarpoolRideDetour) obj;
            LocationDescriptor locationDescriptor = carpoolRideDetour.f40920b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.getClass();
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            CurrencyAmount currencyAmount = carpoolRideDetour.f40921c;
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = carpoolRideDetour.f40922d;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(currencyAmount2, qVar);
            qVar.mo51939l(carpoolRideDetour.f40923e);
            qVar.mo51939l(carpoolRideDetour.f40924f);
            qVar.mo51951e(carpoolRideDetour.f40925g);
        }
    }

    public CarpoolRideDetour(LocationDescriptor locationDescriptor, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, int i, int i2, byte[] bArr) {
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f40920b = locationDescriptor;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f40921c = currencyAmount;
        C21100e.m49373x(currencyAmount2, "actualPrice");
        this.f40922d = currencyAmount2;
        C21100e.m49359q(i, "distance");
        this.f40923e = i;
        C21100e.m49359q(i2, "time");
        this.f40924f = i2;
        this.f40925g = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40919h);
    }
}
