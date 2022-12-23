package com.moovit.micromobility.purchase.step;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import p583jk.C17884p;

public abstract class MicroMobilityPurchaseStep implements Parcelable {

    /* renamed from: b */
    public final String f14920b;

    /* renamed from: c */
    public final String f14921c;

    /* renamed from: d */
    public final String f14922d;

    /* renamed from: com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep$a */
    public interface C4161a {
    }

    public MicroMobilityPurchaseStep(String str, String str2, String str3) {
        C21100e.m49373x(str, "contextId");
        this.f14920b = str;
        C21100e.m49373x(str2, "analyticKey");
        this.f14921c = str2;
        this.f14922d = str3;
    }

    /* renamed from: b */
    public abstract void mo19519b(C4161a aVar, String str);

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityPurchaseStep)) {
            return false;
        }
        MicroMobilityPurchaseStep microMobilityPurchaseStep = (MicroMobilityPurchaseStep) obj;
        if (getClass() != microMobilityPurchaseStep.getClass()) {
            return false;
        }
        return this.f14920b.equals(microMobilityPurchaseStep.f14920b);
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(getClass()), C17884p.m44335F(this.f14920b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14920b);
        parcel.writeString(this.f14921c);
        parcel.writeString(this.f14922d);
    }

    public MicroMobilityPurchaseStep(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "contextId");
        this.f14920b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "analyticKey");
        this.f14921c = readString2;
        this.f14922d = parcel.readString();
    }
}
