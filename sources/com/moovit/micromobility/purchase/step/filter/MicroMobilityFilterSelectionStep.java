package com.moovit.micromobility.purchase.step.filter;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import java.util.ArrayList;
import java.util.List;

public class MicroMobilityFilterSelectionStep extends MicroMobilityPurchaseStep {
    public static final Parcelable.Creator<MicroMobilityFilterSelectionStep> CREATOR = new C4168a();

    /* renamed from: e */
    public final String f14941e;

    /* renamed from: f */
    public final FilterPresentationType f14942f;

    /* renamed from: g */
    public final List<MicroMobilityPurchaseFilter> f14943g;

    /* renamed from: h */
    public final String f14944h;

    /* renamed from: i */
    public final String f14945i;

    /* renamed from: j */
    public final int f14946j;

    public enum FilterPresentationType {
        INDICATORS,
        CARDS
    }

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep$a */
    public class C4168a implements Parcelable.Creator<MicroMobilityFilterSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            return new MicroMobilityFilterSelectionStep(parcel);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityFilterSelectionStep[i];
        }
    }

    public MicroMobilityFilterSelectionStep(String str, String str2, String str3, String str4, FilterPresentationType filterPresentationType, ArrayList arrayList, String str5, String str6, int i) {
        super(str, str2, str3);
        C21100e.m49373x(str4, "type");
        this.f14941e = str4;
        C21100e.m49373x(filterPresentationType, "presentationType");
        this.f14942f = filterPresentationType;
        this.f14943g = arrayList;
        this.f14944h = str5;
        C21100e.m49373x(str6, "buttonText");
        this.f14945i = str6;
        this.f14946j = i;
    }

    /* renamed from: b */
    public final void mo19519b(MicroMobilityPurchaseStep.C4161a aVar, String str) {
        MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar;
        microMobilityPurchaseActivity.getClass();
        int i = C4173a.f14956r;
        Bundle b = C25541a.m63872b("stepId", str);
        C4173a aVar2 = new C4173a();
        aVar2.setArguments(b);
        microMobilityPurchaseActivity.mo19508y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14941e);
        parcel.writeString(this.f14942f.name());
        parcel.writeList(this.f14943g);
        parcel.writeString(this.f14944h);
        parcel.writeString(this.f14945i);
        parcel.writeInt(this.f14946j);
    }

    public MicroMobilityFilterSelectionStep(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C21100e.m49373x(readString, "type");
        this.f14941e = readString;
        this.f14942f = FilterPresentationType.valueOf(parcel.readString());
        ArrayList arrayList = new ArrayList();
        this.f14943g = arrayList;
        parcel.readList(arrayList, MicroMobilityPurchaseFilter.class.getClassLoader());
        this.f14944h = parcel.readString();
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "buttonText");
        this.f14945i = readString2;
        this.f14946j = parcel.readInt();
    }
}
