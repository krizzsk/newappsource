package com.moovit.micromobility.purchase.step.pincode;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import y30.C7311a;

public class MicroMobilityPinCodeStep extends MicroMobilityPurchaseStep {
    public static final Parcelable.Creator<MicroMobilityPinCodeStep> CREATOR = new C4179a();

    /* renamed from: e */
    public final String f14973e;

    /* renamed from: f */
    public final String f14974f;

    /* renamed from: g */
    public final String f14975g;

    /* renamed from: h */
    public final int f14976h;

    /* renamed from: com.moovit.micromobility.purchase.step.pincode.MicroMobilityPinCodeStep$a */
    public class C4179a implements Parcelable.Creator<MicroMobilityPinCodeStep> {
        public final Object createFromParcel(Parcel parcel) {
            return new MicroMobilityPinCodeStep(parcel);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPinCodeStep[i];
        }
    }

    public MicroMobilityPinCodeStep(String str, String str2, String str3, String str4, int i, String str5) {
        super(str, str2, (String) null);
        C21100e.m49373x(str3, "title");
        this.f14973e = str3;
        C21100e.m49373x(str4, "instructions");
        this.f14974f = str4;
        C21100e.m49373x(str5, "actionText");
        this.f14975g = str5;
        this.f14976h = i;
    }

    /* renamed from: b */
    public final void mo19519b(MicroMobilityPurchaseStep.C4161a aVar, String str) {
        MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar;
        microMobilityPurchaseActivity.getClass();
        int i = C7311a.f22412r;
        Bundle b = C25541a.m63872b("stepId", str);
        C7311a aVar2 = new C7311a();
        aVar2.setArguments(b);
        microMobilityPurchaseActivity.mo19508y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14973e);
        parcel.writeString(this.f14974f);
        parcel.writeString(this.f14975g);
        parcel.writeInt(this.f14976h);
    }

    public MicroMobilityPinCodeStep(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C21100e.m49373x(readString, "title");
        this.f14973e = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "instructions");
        this.f14974f = readString2;
        String readString3 = parcel.readString();
        C21100e.m49373x(readString3, "actionText");
        this.f14975g = readString3;
        this.f14976h = parcel.readInt();
    }
}
