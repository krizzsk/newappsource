package com.moovit.micromobility.purchase.intent;

import android.os.Parcel;
import android.os.Parcelable;
import c70.C13749c;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseIntent;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseGenericIntent;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntent;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t30.C6573m;

public class MicroMobilityPurchaseGenericIntent implements MicroMobilityPurchaseIntent {
    public static final Parcelable.Creator<MicroMobilityPurchaseGenericIntent> CREATOR = new C4156a();

    /* renamed from: c */
    public static final C4157b f14914c = new C4157b(MicroMobilityPurchaseGenericIntent.class);

    /* renamed from: b */
    public final LatLonE6 f14915b;

    /* renamed from: com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseGenericIntent$a */
    public class C4156a implements Parcelable.Creator<MicroMobilityPurchaseGenericIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityPurchaseGenericIntent) C19612n.m46981v(parcel, MicroMobilityPurchaseGenericIntent.f14914c);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPurchaseGenericIntent[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseGenericIntent$b */
    public class C4157b extends C19619s<MicroMobilityPurchaseGenericIntent> {
        public C4157b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityPurchaseGenericIntent((LatLonE6) pVar.mo51962q(LatLonE6.f40979g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51967q(((MicroMobilityPurchaseGenericIntent) obj).f14915b, LatLonE6.f40978f);
        }
    }

    public MicroMobilityPurchaseGenericIntent(LatLonE6 latLonE6) {
        this.f14915b = latLonE6;
    }

    /* renamed from: P0 */
    public final MVMicroMobilityPurchaseIntent mo19510P0(MicroMobilityPurchaseIntent.C4158a aVar) {
        ((C6573m) aVar).getClass();
        MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = new MVMicroMobilityPurchaseGenericIntent();
        LatLonE6 latLonE6 = this.f14915b;
        if (latLonE6 != null) {
            mVMicroMobilityPurchaseGenericIntent.userLocation = C13749c.m34332r(latLonE6);
        }
        MVMicroMobilityPurchaseIntent mVMicroMobilityPurchaseIntent = new MVMicroMobilityPurchaseIntent();
        mVMicroMobilityPurchaseIntent.setField_ = MVMicroMobilityPurchaseIntent._Fields.GENERIC;
        mVMicroMobilityPurchaseIntent.value_ = mVMicroMobilityPurchaseGenericIntent;
        return mVMicroMobilityPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14914c);
    }
}
