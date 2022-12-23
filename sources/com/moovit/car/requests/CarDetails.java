package com.moovit.car.requests;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CarDetails implements Parcelable {
    public static final Parcelable.Creator<CarDetails> CREATOR = new C15686a();

    /* renamed from: p */
    public static final C15687b f40837p = new C15687b();

    /* renamed from: q */
    public static final C15688c f40838q = new C15688c(CarDetails.class);

    /* renamed from: b */
    public final String f40839b;

    /* renamed from: c */
    public final String f40840c;

    /* renamed from: d */
    public final String f40841d;

    /* renamed from: e */
    public final String f40842e;

    /* renamed from: f */
    public final String f40843f;

    /* renamed from: g */
    public final String f40844g;

    /* renamed from: h */
    public final String f40845h;

    /* renamed from: i */
    public final String f40846i;

    /* renamed from: j */
    public final String f40847j;

    /* renamed from: k */
    public final int f40848k;

    /* renamed from: l */
    public final byte f40849l;

    /* renamed from: m */
    public final Byte f40850m;

    /* renamed from: n */
    public final double f40851n;

    /* renamed from: o */
    public final double f40852o;

    /* renamed from: com.moovit.car.requests.CarDetails$a */
    public class C15686a implements Parcelable.Creator<CarDetails> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarDetails) C19612n.m46981v(parcel, CarDetails.f40838q);
        }

        public final Object[] newArray(int i) {
            return new CarDetails[i];
        }
    }

    /* renamed from: com.moovit.car.requests.CarDetails$b */
    public class C15687b extends C19621u<CarDetails> {
        public C15687b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarDetails carDetails = (CarDetails) obj;
            qVar.mo51954p(carDetails.f40839b);
            qVar.mo51955t(carDetails.f40840c);
            qVar.mo51955t(carDetails.f40841d);
            qVar.mo51955t(carDetails.f40842e);
            qVar.mo51955t(carDetails.f40843f);
            qVar.mo51955t(carDetails.f40844g);
            qVar.mo51955t(carDetails.f40847j);
            qVar.mo51939l(carDetails.f40848k);
            qVar.mo51955t(carDetails.f40845h);
            qVar.mo51955t(carDetails.f40846i);
            qVar.mo51935c(carDetails.f40849l);
            qVar.mo51935c(carDetails.f40850m.byteValue());
            qVar.mo51937i(carDetails.f40851n);
            qVar.mo51937i(carDetails.f40852o);
        }
    }

    /* renamed from: com.moovit.car.requests.CarDetails$c */
    public class C15688c extends C19620t<CarDetails> {
        public C15688c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarDetails(pVar.mo51947p(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51920c(), Byte.valueOf(pVar.mo51920c()), pVar.mo51922i(), pVar.mo51922i());
        }
    }

    public CarDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, byte b, Byte b2, double d, double d2) {
        this.f40839b = str;
        this.f40840c = str2;
        this.f40841d = str3;
        this.f40842e = str4;
        this.f40843f = str5;
        this.f40844g = str6;
        this.f40847j = str7;
        this.f40848k = i;
        this.f40845h = str8;
        this.f40846i = str9;
        this.f40849l = b;
        this.f40850m = b2;
        this.f40851n = d;
        this.f40852o = d2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40837p);
    }
}
