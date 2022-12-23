package com.moovit.micromobility.purchase.step.qrcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t30.C6575o;

public class MicroMobilityQrCodeStepResult extends MicroMobilityPurchaseStepResult {
    public static final Parcelable.Creator<MicroMobilityQrCodeStepResult> CREATOR = new C4183a();

    /* renamed from: d */
    public static final C4184b f14981d = new C4184b(MicroMobilityQrCodeStepResult.class);

    /* renamed from: c */
    public final String f14982c;

    /* renamed from: com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStepResult$a */
    public class C4183a implements Parcelable.Creator<MicroMobilityQrCodeStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityQrCodeStepResult) C19612n.m46981v(parcel, MicroMobilityQrCodeStepResult.f14981d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityQrCodeStepResult[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStepResult$b */
    public class C4184b extends C19619s<MicroMobilityQrCodeStepResult> {
        public C4184b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityQrCodeStepResult(pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityQrCodeStepResult microMobilityQrCodeStepResult = (MicroMobilityQrCodeStepResult) obj;
            qVar.mo51954p(microMobilityQrCodeStepResult.f14923b);
            qVar.mo51955t(microMobilityQrCodeStepResult.f14982c);
        }
    }

    public MicroMobilityQrCodeStepResult(String str, String str2) {
        super(str);
        this.f14982c = str2;
    }

    /* renamed from: b */
    public final void mo19524b(MicroMobilityPurchaseStepResult.C4162a aVar) {
        C6575o oVar = (C6575o) aVar;
        oVar.getClass();
        MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = new MVMicroMobilityPurchaseQrCodeStepResult();
        String str = this.f14982c;
        if (str != null) {
            mVMicroMobilityPurchaseQrCodeStepResult.qrCode = str;
        }
        String str2 = this.f14923b;
        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
        mVMicroMobilityPurchaseStepResult.setField_ = MVMicroMobilityPurchaseStepResult._Fields.QR_CODE;
        mVMicroMobilityPurchaseStepResult.value_ = mVMicroMobilityPurchaseQrCodeStepResult;
        oVar.f33922v = new MVMicroMobilityPurchaseCompleteStepRequest(str2, mVMicroMobilityPurchaseStepResult);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14981d);
    }
}
