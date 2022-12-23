package com.moovit.micromobility.purchase.step.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import t30.C6575o;

public class MicroMobilityFilterSelectionStepResult extends MicroMobilityPurchaseStepResult {
    public static final Parcelable.Creator<MicroMobilityFilterSelectionStepResult> CREATOR = new C4169a();

    /* renamed from: e */
    public static final C4170b f14947e = new C4170b(MicroMobilityFilterSelectionStepResult.class);

    /* renamed from: c */
    public final String f14948c;

    /* renamed from: d */
    public final String f14949d;

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStepResult$a */
    public class C4169a implements Parcelable.Creator<MicroMobilityFilterSelectionStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityFilterSelectionStepResult) C19612n.m46981v(parcel, MicroMobilityFilterSelectionStepResult.f14947e);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityFilterSelectionStepResult[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStepResult$b */
    public class C4170b extends C19619s<MicroMobilityFilterSelectionStepResult> {
        public C4170b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityFilterSelectionStepResult(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityFilterSelectionStepResult microMobilityFilterSelectionStepResult = (MicroMobilityFilterSelectionStepResult) obj;
            qVar.mo51954p(microMobilityFilterSelectionStepResult.f14923b);
            qVar.mo51954p(microMobilityFilterSelectionStepResult.f14948c);
            qVar.mo51954p(microMobilityFilterSelectionStepResult.f14949d);
        }
    }

    public MicroMobilityFilterSelectionStepResult(String str, String str2, String str3) {
        super(str);
        C21100e.m49373x(str2, "type");
        this.f14948c = str2;
        C21100e.m49373x(str3, "selectedFilterId");
        this.f14949d = str3;
    }

    /* renamed from: b */
    public final void mo19524b(MicroMobilityPurchaseStepResult.C4162a aVar) {
        C6575o oVar = (C6575o) aVar;
        oVar.getClass();
        String str = this.f14948c;
        String str2 = this.f14949d;
        MVMicroMobilityPurchaseOptionSelectionStepResult mVMicroMobilityPurchaseOptionSelectionStepResult = new MVMicroMobilityPurchaseOptionSelectionStepResult();
        mVMicroMobilityPurchaseOptionSelectionStepResult.type = str;
        mVMicroMobilityPurchaseOptionSelectionStepResult.selectedOptionId = str2;
        String str3 = this.f14923b;
        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
        mVMicroMobilityPurchaseStepResult.setField_ = MVMicroMobilityPurchaseStepResult._Fields.OPTION_RESULT;
        mVMicroMobilityPurchaseStepResult.value_ = mVMicroMobilityPurchaseOptionSelectionStepResult;
        oVar.f33922v = new MVMicroMobilityPurchaseCompleteStepRequest(str3, mVMicroMobilityPurchaseStepResult);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14947e);
    }
}
