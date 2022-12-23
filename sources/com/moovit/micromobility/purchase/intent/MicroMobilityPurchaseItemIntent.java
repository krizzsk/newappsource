package com.moovit.micromobility.purchase.intent;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseIntent;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntent;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseItemIntent;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t30.C6565g;
import t30.C6573m;

public class MicroMobilityPurchaseItemIntent implements MicroMobilityPurchaseIntent {
    public static final Parcelable.Creator<MicroMobilityPurchaseItemIntent> CREATOR = new C4159a();

    /* renamed from: e */
    public static final C4160b f14916e = new C4160b(MicroMobilityPurchaseItemIntent.class);

    /* renamed from: b */
    public final String f14917b;

    /* renamed from: c */
    public final String f14918c;

    /* renamed from: d */
    public final MicroMobilityIntegrationFlow f14919d;

    /* renamed from: com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseItemIntent$a */
    public class C4159a implements Parcelable.Creator<MicroMobilityPurchaseItemIntent> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityPurchaseItemIntent) C19612n.m46981v(parcel, MicroMobilityPurchaseItemIntent.f14916e);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPurchaseItemIntent[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseItemIntent$b */
    public class C4160b extends C19619s<MicroMobilityPurchaseItemIntent> {
        public C4160b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityPurchaseItemIntent(pVar.mo51947p(), pVar.mo51947p(), MicroMobilityIntegrationFlow.CODER.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityPurchaseItemIntent microMobilityPurchaseItemIntent = (MicroMobilityPurchaseItemIntent) obj;
            qVar.mo51954p(microMobilityPurchaseItemIntent.f14917b);
            qVar.mo51954p(microMobilityPurchaseItemIntent.f14918c);
            MicroMobilityIntegrationFlow.CODER.write(microMobilityPurchaseItemIntent.f14919d, qVar);
        }
    }

    public MicroMobilityPurchaseItemIntent(String str, String str2, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        C21100e.m49373x(str, "serviceId");
        this.f14917b = str;
        C21100e.m49373x(str2, "itemId");
        this.f14918c = str2;
        C21100e.m49373x(microMobilityIntegrationFlow, "integrationFlow");
        this.f14919d = microMobilityIntegrationFlow;
    }

    /* renamed from: P0 */
    public final MVMicroMobilityPurchaseIntent mo19510P0(MicroMobilityPurchaseIntent.C4158a aVar) {
        MVMicroMobilityIntegrationFlow mVMicroMobilityIntegrationFlow;
        ((C6573m) aVar).getClass();
        String str = this.f14917b;
        String str2 = this.f14918c;
        int i = C6565g.C6566a.f20378a[this.f14919d.ordinal()];
        if (i == 1) {
            mVMicroMobilityIntegrationFlow = MVMicroMobilityIntegrationFlow.DEEP_LINK;
        } else if (i == 2) {
            mVMicroMobilityIntegrationFlow = MVMicroMobilityIntegrationFlow.RESERVE;
        } else if (i == 3) {
            mVMicroMobilityIntegrationFlow = MVMicroMobilityIntegrationFlow.UNLOCK;
        } else {
            throw new IllegalStateException("failed to encode micro-mobility integration flow");
        }
        MVMicroMobilityPurchaseItemIntent mVMicroMobilityPurchaseItemIntent = new MVMicroMobilityPurchaseItemIntent();
        mVMicroMobilityPurchaseItemIntent.serviceId = str;
        mVMicroMobilityPurchaseItemIntent.itemId = str2;
        mVMicroMobilityPurchaseItemIntent.flow = mVMicroMobilityIntegrationFlow;
        MVMicroMobilityPurchaseIntent mVMicroMobilityPurchaseIntent = new MVMicroMobilityPurchaseIntent();
        mVMicroMobilityPurchaseIntent.setField_ = MVMicroMobilityPurchaseIntent._Fields.ITEM;
        mVMicroMobilityPurchaseIntent.value_ = mVMicroMobilityPurchaseItemIntent;
        return mVMicroMobilityPurchaseIntent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14916e);
    }
}
