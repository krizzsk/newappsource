package com.moovit.micromobility.purchase.step.qrcode;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import z30.C7455a;

public class MicroMobilityQrCodeStep extends MicroMobilityPurchaseStep {
    public static final Parcelable.Creator<MicroMobilityQrCodeStep> CREATOR = new C4182a();

    /* renamed from: e */
    public final String f14979e;

    /* renamed from: f */
    public final String f14980f;

    /* renamed from: com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStep$a */
    public class C4182a implements Parcelable.Creator<MicroMobilityQrCodeStep> {
        public final Object createFromParcel(Parcel parcel) {
            return new MicroMobilityQrCodeStep(parcel);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityQrCodeStep[i];
        }
    }

    public MicroMobilityQrCodeStep(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.f14979e = str4;
        this.f14980f = str5;
    }

    /* renamed from: b */
    public final void mo19519b(MicroMobilityPurchaseStep.C4161a aVar, String str) {
        MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar;
        microMobilityPurchaseActivity.getClass();
        int i = C7455a.f22876p;
        Bundle b = C25541a.m63872b("stepId", str);
        C7455a aVar2 = new C7455a();
        aVar2.setArguments(b);
        microMobilityPurchaseActivity.mo19508y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14979e);
        parcel.writeString(this.f14980f);
    }

    public MicroMobilityQrCodeStep(Parcel parcel) {
        super(parcel);
        this.f14979e = parcel.readString();
        this.f14980f = parcel.readString();
    }
}
