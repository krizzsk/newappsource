package com.moovit.map.collections.category.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.car.requests.CarDetails;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CarSharingMetadata implements Parcelable {
    public static final Parcelable.Creator<CarSharingMetadata> CREATOR = new C16259a();

    /* renamed from: f */
    public static final C16260b f42481f = new C16260b();

    /* renamed from: g */
    public static final C16261c f42482g = new C16261c(CarSharingMetadata.class);

    /* renamed from: b */
    public LocationDescriptor f42483b;

    /* renamed from: c */
    public String f42484c;

    /* renamed from: d */
    public String f42485d;

    /* renamed from: e */
    public CarDetails f42486e;

    /* renamed from: com.moovit.map.collections.category.types.CarSharingMetadata$a */
    public class C16259a implements Parcelable.Creator<CarSharingMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarSharingMetadata) C19612n.m46981v(parcel, CarSharingMetadata.f42482g);
        }

        public final Object[] newArray(int i) {
            return new CarSharingMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.CarSharingMetadata$b */
    public class C16260b extends C19621u<CarSharingMetadata> {
        public C16260b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarSharingMetadata carSharingMetadata = (CarSharingMetadata) obj;
            qVar.mo51955t(carSharingMetadata.f42485d);
            qVar.mo51967q(carSharingMetadata.f42483b, LocationDescriptor.f23645l);
            qVar.mo51955t(carSharingMetadata.f42484c);
            qVar.mo51967q(carSharingMetadata.f42486e, CarDetails.f40837p);
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.CarSharingMetadata$c */
    public class C16261c extends C19620t<CarSharingMetadata> {
        public C16261c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarSharingMetadata(pVar.mo51948t(), (LocationDescriptor) pVar.mo51962q(LocationDescriptor.f23646m), pVar.mo51948t(), (CarDetails) pVar.mo51962q(CarDetails.f40838q));
        }
    }

    public CarSharingMetadata(String str, LocationDescriptor locationDescriptor, String str2, CarDetails carDetails) {
        this.f42485d = str;
        this.f42483b = locationDescriptor;
        this.f42484c = str2;
        this.f42486e = carDetails;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42481f);
    }
}
