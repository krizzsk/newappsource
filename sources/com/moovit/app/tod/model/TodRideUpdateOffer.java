package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodRideUpdateOffer implements Parcelable {
    public static final Parcelable.Creator<TodRideUpdateOffer> CREATOR = new C15513a();

    /* renamed from: i */
    public static final C15514b f40293i = new C15514b(TodRideUpdateOffer.class);

    /* renamed from: b */
    public final String f40294b;

    /* renamed from: c */
    public final LocationDescriptor f40295c;

    /* renamed from: d */
    public final LocationDescriptor f40296d;

    /* renamed from: e */
    public final long f40297e;

    /* renamed from: f */
    public final long f40298f;

    /* renamed from: g */
    public final CurrencyAmount f40299g;

    /* renamed from: h */
    public final CurrencyAmount f40300h;

    /* renamed from: com.moovit.app.tod.model.TodRideUpdateOffer$a */
    public class C15513a implements Parcelable.Creator<TodRideUpdateOffer> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodRideUpdateOffer) C19612n.m46981v(parcel, TodRideUpdateOffer.f40293i);
        }

        public final Object[] newArray(int i) {
            return new TodRideUpdateOffer[i];
        }
    }

    /* renamed from: com.moovit.app.tod.model.TodRideUpdateOffer$b */
    public class C15514b extends C19619s<TodRideUpdateOffer> {
        public C15514b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            long m = pVar.mo51925m();
            long m2 = pVar.mo51925m();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new TodRideUpdateOffer(p, (LocationDescriptor) cVar.read(pVar), (LocationDescriptor) cVar.read(pVar), m, m2, (CurrencyAmount) pVar.mo51962q(bVar), (CurrencyAmount) pVar.mo51962q(bVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodRideUpdateOffer todRideUpdateOffer = (TodRideUpdateOffer) obj;
            qVar.mo51954p(todRideUpdateOffer.f40294b);
            LocationDescriptor locationDescriptor = todRideUpdateOffer.f40295c;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = todRideUpdateOffer.f40296d;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor2, qVar);
            qVar.mo51940m(todRideUpdateOffer.f40297e);
            qVar.mo51940m(todRideUpdateOffer.f40298f);
            CurrencyAmount currencyAmount = todRideUpdateOffer.f40299g;
            CurrencyAmount.C7881b bVar2 = CurrencyAmount.f23843f;
            qVar.mo51967q(currencyAmount, bVar2);
            qVar.mo51967q(todRideUpdateOffer.f40300h, bVar2);
        }
    }

    public TodRideUpdateOffer(String str, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, long j, long j2, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        C21100e.m49373x(str, "offerId");
        this.f40294b = str;
        C21100e.m49373x(locationDescriptor, "dropOff");
        this.f40295c = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f40296d = locationDescriptor2;
        this.f40297e = j;
        this.f40298f = j2;
        this.f40299g = currencyAmount;
        this.f40300h = currencyAmount2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40293i);
    }
}
