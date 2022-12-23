package com.moovit.taxi;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TaxiPrice implements Parcelable {
    public static final Parcelable.Creator<TaxiPrice> CREATOR = new C7627a();

    /* renamed from: g */
    public static final C7628b f23226g = new C7628b();

    /* renamed from: h */
    public static final C7629c f23227h = new C7629c(TaxiPrice.class);

    /* renamed from: b */
    public String f23228b;

    /* renamed from: c */
    public boolean f23229c;

    /* renamed from: d */
    public TaxiPriceType f23230d;

    /* renamed from: e */
    public boolean f23231e;

    /* renamed from: f */
    public String f23232f;

    public enum TaxiPriceType {
        RANGE,
        FIX,
        METERED;
        
        public static final C19584i<TaxiPriceType> CODER = null;

        /* access modifiers changed from: public */
        static {
            TaxiPriceType taxiPriceType;
            TaxiPriceType taxiPriceType2;
            TaxiPriceType taxiPriceType3;
            CODER = new C19577c(TaxiPriceType.class, taxiPriceType, taxiPriceType2, taxiPriceType3);
        }
    }

    /* renamed from: com.moovit.taxi.TaxiPrice$a */
    public class C7627a implements Parcelable.Creator<TaxiPrice> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiPrice) C19612n.m46981v(parcel, TaxiPrice.f23227h);
        }

        public final Object[] newArray(int i) {
            return new TaxiPrice[i];
        }
    }

    /* renamed from: com.moovit.taxi.TaxiPrice$b */
    public class C7628b extends C19621u<TaxiPrice> {
        public C7628b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TaxiPrice taxiPrice = (TaxiPrice) obj;
            qVar.mo51955t(taxiPrice.f23228b);
            qVar.mo51934b(taxiPrice.f23229c);
            qVar.mo51967q(taxiPrice.f23230d, TaxiPriceType.CODER);
            qVar.mo51934b(taxiPrice.f23231e);
            qVar.mo51955t(taxiPrice.f23232f);
        }
    }

    /* renamed from: com.moovit.taxi.TaxiPrice$c */
    public class C7629c extends C19620t<TaxiPrice> {
        public C7629c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0 || i == 1 || i == 2 || i == 3;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 3) {
                Parcelable.Creator<TaxiPrice> creator = TaxiPrice.CREATOR;
                return new TaxiPrice(pVar.mo51948t(), pVar.mo51919b(), (TaxiPriceType) pVar.mo51962q(TaxiPriceType.CODER), pVar.mo51919b(), pVar.mo51948t());
            } else if (i == 2) {
                Parcelable.Creator<TaxiPrice> creator2 = TaxiPrice.CREATOR;
                return new TaxiPrice(pVar.mo51948t(), pVar.mo51919b(), (TaxiPriceType) null, false, (String) null);
            } else if (i == 1) {
                Parcelable.Creator<TaxiPrice> creator3 = TaxiPrice.CREATOR;
                return new TaxiPrice(pVar.mo51948t(), false, (TaxiPriceType) null, false, (String) null);
            } else {
                Parcelable.Creator<TaxiPrice> creator4 = TaxiPrice.CREATOR;
                return new TaxiPrice(pVar.mo51947p(), false, (TaxiPriceType) null, false, (String) null);
            }
        }
    }

    public TaxiPrice(String str, boolean z, TaxiPriceType taxiPriceType, boolean z2, String str2) {
        this.f23228b = str;
        this.f23229c = z;
        this.f23230d = taxiPriceType;
        this.f23231e = z2;
        this.f23232f = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23226g);
    }
}
