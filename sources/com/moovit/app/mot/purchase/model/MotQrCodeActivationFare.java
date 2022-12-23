package com.moovit.app.mot.purchase.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotQrCodeActivationFare implements Parcelable {
    public static final Parcelable.Creator<MotQrCodeActivationFare> CREATOR = new C15163a();

    /* renamed from: d */
    public static final C15164b f39054d = new C15164b(MotQrCodeActivationFare.class);

    /* renamed from: b */
    public final MotActivationRegionalFare f39055b;

    /* renamed from: c */
    public final MotActivationRegionFare f39056c;

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeActivationFare$a */
    public class C15163a implements Parcelable.Creator<MotQrCodeActivationFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotQrCodeActivationFare) C19612n.m46981v(parcel, MotQrCodeActivationFare.f39054d);
        }

        public final Object[] newArray(int i) {
            return new MotQrCodeActivationFare[i];
        }
    }

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeActivationFare$b */
    public class C15164b extends C19619s<MotQrCodeActivationFare> {
        public C15164b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            MotActivationRegionalFare.C15152b bVar = MotActivationRegionalFare.f39015f;
            pVar.getClass();
            return new MotQrCodeActivationFare((MotActivationRegionalFare) bVar.read(pVar), (MotActivationRegionFare) pVar.mo51962q(MotActivationRegionFare.f39012d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotQrCodeActivationFare motQrCodeActivationFare = (MotQrCodeActivationFare) obj;
            MotActivationRegionalFare motActivationRegionalFare = motQrCodeActivationFare.f39055b;
            MotActivationRegionalFare.C15152b bVar = MotActivationRegionalFare.f39015f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(motActivationRegionalFare, qVar);
            MotActivationRegionFare motActivationRegionFare = motQrCodeActivationFare.f39056c;
            MotActivationRegionFare.C15150b bVar2 = MotActivationRegionFare.f39012d;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(motActivationRegionFare, qVar);
        }
    }

    public MotQrCodeActivationFare(MotActivationRegionalFare motActivationRegionalFare, MotActivationRegionFare motActivationRegionFare) {
        C21100e.m49373x(motActivationRegionalFare, "fare");
        this.f39055b = motActivationRegionalFare;
        C21100e.m49373x(motActivationRegionFare, "regionFare");
        this.f39056c = motActivationRegionFare;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotQrCodeActivationFare)) {
            return false;
        }
        MotQrCodeActivationFare motQrCodeActivationFare = (MotQrCodeActivationFare) obj;
        if (!this.f39055b.equals(motQrCodeActivationFare.f39055b) || !this.f39056c.equals(motQrCodeActivationFare.f39056c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f39055b), C17884p.m44335F(this.f39056c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39054d);
    }
}
