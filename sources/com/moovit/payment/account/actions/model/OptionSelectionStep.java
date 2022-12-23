package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import je0.C23715f;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/OptionSelectionStep;", "Lje0/f;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class OptionSelectionStep extends C23715f implements Parcelable {
    public static final Parcelable.Creator<OptionSelectionStep> CREATOR = new C25620a();

    /* renamed from: b */
    public final String f63893b;

    /* renamed from: c */
    public final String f63894c;

    /* renamed from: d */
    public final String f63895d;

    /* renamed from: e */
    public final List<SelectionOption> f63896e;

    /* renamed from: f */
    public final String f63897f;

    /* renamed from: g */
    public final String f63898g;

    /* renamed from: h */
    public final String f63899h;

    /* renamed from: i */
    public final int f63900i;

    /* renamed from: j */
    public final PresentationType f63901j;

    /* renamed from: com.moovit.payment.account.actions.model.OptionSelectionStep$a */
    public static final class C25620a implements Parcelable.Creator<OptionSelectionStep> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(SelectionOption.CREATOR.createFromParcel(parcel));
            }
            return new OptionSelectionStep(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), PresentationType.valueOf(parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new OptionSelectionStep[i];
        }
    }

    public OptionSelectionStep(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, int i, PresentationType presentationType) {
        C24362h.m61211f(str, "contextId");
        C24362h.m61211f(str2, "analyticKey");
        C24362h.m61211f(str3, "type");
        C24362h.m61211f(str6, "buttonText");
        C24362h.m61211f(presentationType, "presentationType");
        this.f63893b = str;
        this.f63894c = str2;
        this.f63895d = str3;
        this.f63896e = arrayList;
        this.f63897f = str4;
        this.f63898g = str5;
        this.f63899h = str6;
        this.f63900i = i;
        this.f63901j = presentationType;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionSelectionStep)) {
            return false;
        }
        OptionSelectionStep optionSelectionStep = (OptionSelectionStep) obj;
        if (C24362h.m61206a(this.f63893b, optionSelectionStep.f63893b) && C24362h.m61206a(this.f63894c, optionSelectionStep.f63894c) && C24362h.m61206a(this.f63895d, optionSelectionStep.f63895d) && C24362h.m61206a(this.f63896e, optionSelectionStep.f63896e) && C24362h.m61206a(this.f63897f, optionSelectionStep.f63897f) && C24362h.m61206a(this.f63898g, optionSelectionStep.f63898g) && C24362h.m61206a(this.f63899h, optionSelectionStep.f63899h) && this.f63900i == optionSelectionStep.f63900i && this.f63901j == optionSelectionStep.f63901j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f63896e.hashCode() + C13715c.m34238d(this.f63895d, C13715c.m34238d(this.f63894c, this.f63893b.hashCode() * 31, 31), 31)) * 31;
        String str = this.f63897f;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f63898g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        String str3 = this.f63899h;
        return this.f63901j.hashCode() + ((C13715c.m34238d(str3, (i3 + i2) * 31, 31) + this.f63900i) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OptionSelectionStep(contextId=");
        k.append(this.f63893b);
        k.append(", analyticKey=");
        k.append(this.f63894c);
        k.append(", type=");
        k.append(this.f63895d);
        k.append(", options=");
        k.append(this.f63896e);
        k.append(", title=");
        k.append(this.f63897f);
        k.append(", instructions=");
        k.append(this.f63898g);
        k.append(", buttonText=");
        k.append(this.f63899h);
        k.append(", selectedIndex=");
        k.append(this.f63900i);
        k.append(", presentationType=");
        k.append(this.f63901j);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63893b);
        parcel.writeString(this.f63894c);
        parcel.writeString(this.f63895d);
        List<SelectionOption> list = this.f63896e;
        parcel.writeInt(list.size());
        for (SelectionOption writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f63897f);
        parcel.writeString(this.f63898g);
        parcel.writeString(this.f63899h);
        parcel.writeInt(this.f63900i);
        parcel.writeString(this.f63901j.name());
    }
}
