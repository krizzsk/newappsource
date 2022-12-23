package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationRegion;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationRegionFare implements Parcelable {
    public static final Parcelable.Creator<MotActivationRegionFare> CREATOR = new C15149a();

    /* renamed from: d */
    public static final C15150b f39012d = new C15150b(MotActivationRegionFare.class);

    /* renamed from: b */
    public final MotActivationRegion f39013b;

    /* renamed from: c */
    public final MotActivationPrice f39014c;

    /* renamed from: com.moovit.app.mot.model.MotActivationRegionFare$a */
    public class C15149a implements Parcelable.Creator<MotActivationRegionFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationRegionFare) C19612n.m46981v(parcel, MotActivationRegionFare.f39012d);
        }

        public final Object[] newArray(int i) {
            return new MotActivationRegionFare[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationRegionFare$b */
    public class C15150b extends C19619s<MotActivationRegionFare> {
        public C15150b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            MotActivationRegion.C15148b bVar = MotActivationRegion.f39008e;
            pVar.getClass();
            return new MotActivationRegionFare((MotActivationRegion) bVar.read(pVar), (MotActivationPrice) MotActivationPrice.f39004e.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationRegionFare motActivationRegionFare = (MotActivationRegionFare) obj;
            MotActivationRegion motActivationRegion = motActivationRegionFare.f39013b;
            MotActivationRegion.C15148b bVar = MotActivationRegion.f39008e;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(motActivationRegion, qVar);
            MotActivationPrice motActivationPrice = motActivationRegionFare.f39014c;
            MotActivationPrice.C15146b bVar2 = MotActivationPrice.f39004e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(motActivationPrice, qVar);
        }
    }

    public MotActivationRegionFare(MotActivationRegion motActivationRegion, MotActivationPrice motActivationPrice) {
        C21100e.m49373x(motActivationRegion, "region");
        this.f39013b = motActivationRegion;
        C21100e.m49373x(motActivationPrice, InAppPurchaseMetaData.KEY_PRICE);
        this.f39014c = motActivationPrice;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivationRegionFare)) {
            return false;
        }
        MotActivationRegionFare motActivationRegionFare = (MotActivationRegionFare) obj;
        if (!this.f39013b.equals(motActivationRegionFare.f39013b) || !this.f39014c.equals(motActivationRegionFare.f39014c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f39013b), C17884p.m44335F(this.f39014c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39012d);
    }
}
