package com.moovit.micromobility.purchase.step.inputs;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13720d;
import c00.C13722f;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStepResult;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p900wt.C20415e;
import t30.C6575o;

public class MicroMobilityInputStepResult extends MicroMobilityPurchaseStepResult {
    public static final Parcelable.Creator<MicroMobilityInputStepResult> CREATOR = new C4177a();

    /* renamed from: d */
    public static final C4178b f14971d = new C4178b(MicroMobilityInputStepResult.class);

    /* renamed from: c */
    public final List<InputFieldValue> f14972c;

    /* renamed from: com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStepResult$a */
    public class C4177a implements Parcelable.Creator<MicroMobilityInputStepResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityInputStepResult) C19612n.m46981v(parcel, MicroMobilityInputStepResult.f14971d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityInputStepResult[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStepResult$b */
    public class C4178b extends C19619s<MicroMobilityInputStepResult> {
        public C4178b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityInputStepResult(pVar.mo51947p(), pVar.mo51959g(InputFieldValue.f41836d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityInputStepResult microMobilityInputStepResult = (MicroMobilityInputStepResult) obj;
            qVar.mo51954p(microMobilityInputStepResult.f14923b);
            qVar.mo51965h(microMobilityInputStepResult.f14972c, InputFieldValue.f41836d);
        }
    }

    public MicroMobilityInputStepResult(String str, ArrayList arrayList) {
        super(str);
        this.f14972c = arrayList;
    }

    /* renamed from: b */
    public final void mo19524b(MicroMobilityPurchaseStepResult.C4162a aVar) {
        C6575o oVar = (C6575o) aVar;
        oVar.getClass();
        ArrayList<O> c = C13720d.m34273c(this.f14972c, (C13722f) null, new C20415e(11));
        String str = this.f14923b;
        MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = new MVMicroMobilityPurchaseInputStepResult();
        mVMicroMobilityPurchaseInputStepResult.f26631id = str;
        mVMicroMobilityPurchaseInputStepResult.inputFieldsValues = c;
        String str2 = this.f14923b;
        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
        mVMicroMobilityPurchaseStepResult.setField_ = MVMicroMobilityPurchaseStepResult._Fields.INPUTS_RESULT;
        mVMicroMobilityPurchaseStepResult.value_ = mVMicroMobilityPurchaseInputStepResult;
        oVar.f33922v = new MVMicroMobilityPurchaseCompleteStepRequest(str2, mVMicroMobilityPurchaseStepResult);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14971d);
    }
}
