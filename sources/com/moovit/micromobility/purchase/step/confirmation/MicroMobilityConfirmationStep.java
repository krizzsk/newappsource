package com.moovit.micromobility.purchase.step.confirmation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.micromobility.purchase.step.filter.MicroMobilityAppliedFilters;
import com.moovit.micromobility.ride.MicroMobilityVehicleCondition;
import v30.C6855a;

public class MicroMobilityConfirmationStep extends MicroMobilityPurchaseStep {
    public static final Parcelable.Creator<MicroMobilityConfirmationStep> CREATOR = new C4163a();

    /* renamed from: e */
    public final String f14924e;

    /* renamed from: f */
    public final String f14925f;

    /* renamed from: g */
    public final String f14926g;

    /* renamed from: h */
    public final String f14927h;

    /* renamed from: i */
    public final MicroMobilityVehicleCondition f14928i;

    /* renamed from: j */
    public final MicroMobilityAppliedFilters f14929j;

    /* renamed from: k */
    public final MicroMobilityRideDisclaimer f14930k;

    /* renamed from: l */
    public final String f14931l;

    /* renamed from: m */
    public final String f14932m;

    /* renamed from: com.moovit.micromobility.purchase.step.confirmation.MicroMobilityConfirmationStep$a */
    public class C4163a implements Parcelable.Creator<MicroMobilityConfirmationStep> {
        public final Object createFromParcel(Parcel parcel) {
            return new MicroMobilityConfirmationStep(parcel);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityConfirmationStep[i];
        }
    }

    public MicroMobilityConfirmationStep(String str, String str2, String str3, String str4, String str5, String str6, String str7, MicroMobilityVehicleCondition microMobilityVehicleCondition, MicroMobilityAppliedFilters microMobilityAppliedFilters, MicroMobilityRideDisclaimer microMobilityRideDisclaimer, String str8, String str9) {
        super(str, str2, str3);
        C21100e.m49373x(str4, "actionText");
        this.f14924e = str4;
        C21100e.m49373x(str5, "rideTitle");
        this.f14925f = str5;
        this.f14926g = str6;
        this.f14927h = str7;
        this.f14928i = microMobilityVehicleCondition;
        this.f14929j = microMobilityAppliedFilters;
        this.f14930k = microMobilityRideDisclaimer;
        this.f14931l = str8;
        C21100e.m49373x(str9, "paymentContext");
        this.f14932m = str9;
    }

    /* renamed from: b */
    public final void mo19519b(MicroMobilityPurchaseStep.C4161a aVar, String str) {
        MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar;
        microMobilityPurchaseActivity.getClass();
        int i = C6855a.f21206q;
        Bundle bundle = new Bundle();
        bundle.putParcelable("step", this);
        C6855a aVar2 = new C6855a();
        aVar2.setArguments(bundle);
        microMobilityPurchaseActivity.mo19508y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14924e);
        parcel.writeString(this.f14925f);
        parcel.writeString(this.f14926g);
        parcel.writeString(this.f14927h);
        parcel.writeParcelable(this.f14928i, i);
        parcel.writeParcelable(this.f14929j, i);
        parcel.writeParcelable(this.f14930k, i);
        parcel.writeString(this.f14931l);
        parcel.writeString(this.f14932m);
    }

    public MicroMobilityConfirmationStep(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C21100e.m49373x(readString, "actionText");
        this.f14924e = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "rideTitle");
        this.f14925f = readString2;
        this.f14926g = parcel.readString();
        this.f14927h = parcel.readString();
        this.f14928i = (MicroMobilityVehicleCondition) parcel.readParcelable(MicroMobilityVehicleCondition.class.getClassLoader());
        this.f14929j = (MicroMobilityAppliedFilters) parcel.readParcelable(MicroMobilityAppliedFilters.class.getClassLoader());
        this.f14930k = (MicroMobilityRideDisclaimer) parcel.readParcelable(MicroMobilityRideDisclaimer.class.getClassLoader());
        this.f14931l = parcel.readString();
        String readString3 = parcel.readString();
        C21100e.m49373x(readString3, "paymentContext");
        this.f14932m = readString3;
    }
}
