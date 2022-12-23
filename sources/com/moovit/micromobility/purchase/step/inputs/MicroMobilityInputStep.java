package com.moovit.micromobility.purchase.step.inputs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputField;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x30.C7154a;

public class MicroMobilityInputStep extends MicroMobilityPurchaseStep {
    public static final Parcelable.Creator<MicroMobilityInputStep> CREATOR = new C4176a();

    /* renamed from: e */
    public final String f14965e;

    /* renamed from: f */
    public final Image f14966f;

    /* renamed from: g */
    public final String f14967g;

    /* renamed from: h */
    public final String f14968h;

    /* renamed from: i */
    public final String f14969i;

    /* renamed from: j */
    public final List<InputField> f14970j;

    /* renamed from: com.moovit.micromobility.purchase.step.inputs.MicroMobilityInputStep$a */
    public class C4176a implements Parcelable.Creator<MicroMobilityInputStep> {
        public final Object createFromParcel(Parcel parcel) {
            return new MicroMobilityInputStep(parcel);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityInputStep[i];
        }
    }

    public MicroMobilityInputStep(String str, String str2, String str3, Image image, String str4, String str5, String str6, ArrayList arrayList) {
        super(str, str2, (String) null);
        C21100e.m49373x(str3, "id");
        this.f14965e = str3;
        this.f14966f = image;
        this.f14967g = str4;
        this.f14968h = str5;
        C21100e.m49373x(str6, "actionText");
        this.f14969i = str6;
        this.f14970j = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public final void mo19519b(MicroMobilityPurchaseStep.C4161a aVar, String str) {
        MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar;
        microMobilityPurchaseActivity.getClass();
        int i = C7154a.f22224r;
        Bundle b = C25541a.m63872b("stepId", str);
        C7154a aVar2 = new C7154a();
        aVar2.setArguments(b);
        microMobilityPurchaseActivity.mo19508y2(aVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14965e);
        parcel.writeParcelable(this.f14966f, i);
        parcel.writeString(this.f14967g);
        parcel.writeString(this.f14968h);
        parcel.writeString(this.f14969i);
        parcel.writeList(this.f14970j);
    }

    public MicroMobilityInputStep(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C21100e.m49373x(readString, "id");
        this.f14965e = readString;
        this.f14966f = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f14967g = parcel.readString();
        this.f14968h = parcel.readString();
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "actionText");
        this.f14969i = readString2;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, InputField.class.getClassLoader());
        this.f14970j = Collections.unmodifiableList(arrayList);
    }
}
