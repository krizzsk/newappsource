package com.moovit.micromobility.purchase.step.pincode;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t30.C6575o;

public class MicroMobilityPinCodeStepResult extends MicroMobilityPurchaseStepResult {
    public static final Parcelable.Creator<MicroMobilityPinCodeStepResult> CREATOR = new C4180a();

    /* renamed from: d */
    public static final C4181b f14977d = new C4181b(MicroMobilityPinCodeStepResult.class);

    /* renamed from: c */
    public final String f14978c;

    /* renamed from: com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStepResult$a */
    public class C4180a implements Parcelable.Creator<MicroMobilityPinCodeStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityPinCodeStepResult) C19612n.m46981v(parcel, MicroMobilityPinCodeStepResult.f14977d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPinCodeStepResult[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStepResult$b */
    public class C4181b extends C19619s<MicroMobilityPinCodeStepResult> {
        public C4181b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityPinCodeStepResult(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityPinCodeStepResult microMobilityPinCodeStepResult = (MicroMobilityPinCodeStepResult) obj;
            qVar.mo51954p(microMobilityPinCodeStepResult.f14923b);
            qVar.mo51954p(microMobilityPinCodeStepResult.f14978c);
        }
    }

    public MicroMobilityPinCodeStepResult(String str, String str2) {
        super(str);
        this.f14978c = str2;
    }

    /* renamed from: b */
    public final void mo19524b(MicroMobilityPurchaseStepResult.C4162a aVar) {
        C6575o oVar = (C6575o) aVar;
        oVar.getClass();
        String str = this.f14978c;
        MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = new MVMicroMobilityPurchasePinCodeStepResult();
        mVMicroMobilityPurchasePinCodeStepResult.digitCode = str;
        String str2 = this.f14923b;
        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
        mVMicroMobilityPurchaseStepResult.setField_ = MVMicroMobilityPurchaseStepResult._Fields.PIN_CODE;
        mVMicroMobilityPurchaseStepResult.value_ = mVMicroMobilityPurchasePinCodeStepResult;
        oVar.f33922v = new MVMicroMobilityPurchaseCompleteStepRequest(str2, mVMicroMobilityPurchaseStepResult);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14977d);
    }
}
