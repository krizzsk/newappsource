package com.moovit.payment.account.actions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputField;
import java.util.ArrayList;
import java.util.List;
import je0.C23715f;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/model/InputStep;", "Lje0/f;", "Landroid/os/Parcelable;", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class InputStep extends C23715f implements Parcelable {
    public static final Parcelable.Creator<InputStep> CREATOR = new C25618a();

    /* renamed from: b */
    public final String f63880b;

    /* renamed from: c */
    public final String f63881c;

    /* renamed from: d */
    public final String f63882d;

    /* renamed from: e */
    public final Image f63883e;

    /* renamed from: f */
    public final String f63884f;

    /* renamed from: g */
    public final String f63885g;

    /* renamed from: h */
    public final String f63886h;

    /* renamed from: i */
    public final List<InputField> f63887i;

    /* renamed from: com.moovit.payment.account.actions.model.InputStep$a */
    public static final class C25618a implements Parcelable.Creator<InputStep> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(InputStep.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(InputStep.class.getClassLoader()));
            }
            return new InputStep(readString, readString2, readString3, image, readString4, readString5, readString6, arrayList);
        }

        public final Object[] newArray(int i) {
            return new InputStep[i];
        }
    }

    public InputStep(String str, String str2, String str3, Image image, String str4, String str5, String str6, ArrayList arrayList) {
        C24362h.m61211f(str, "contextId");
        C24362h.m61211f(str2, "analyticKey");
        C24362h.m61211f(str3, "handlerIdentifier");
        C24362h.m61211f(str6, "actionText");
        this.f63880b = str;
        this.f63881c = str2;
        this.f63882d = str3;
        this.f63883e = image;
        this.f63884f = str4;
        this.f63885g = str5;
        this.f63886h = str6;
        this.f63887i = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputStep)) {
            return false;
        }
        InputStep inputStep = (InputStep) obj;
        if (C24362h.m61206a(this.f63880b, inputStep.f63880b) && C24362h.m61206a(this.f63881c, inputStep.f63881c) && C24362h.m61206a(this.f63882d, inputStep.f63882d) && C24362h.m61206a(this.f63883e, inputStep.f63883e) && C24362h.m61206a(this.f63884f, inputStep.f63884f) && C24362h.m61206a(this.f63885g, inputStep.f63885g) && C24362h.m61206a(this.f63886h, inputStep.f63886h) && C24362h.m61206a(this.f63887i, inputStep.f63887i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int d = C13715c.m34238d(this.f63882d, C13715c.m34238d(this.f63881c, this.f63880b.hashCode() * 31, 31), 31);
        Image image = this.f63883e;
        int i3 = 0;
        if (image == null) {
            i = 0;
        } else {
            i = image.hashCode();
        }
        int i4 = (d + i) * 31;
        String str = this.f63884f;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.f63885g;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return this.f63887i.hashCode() + C13715c.m34238d(this.f63886h, (i5 + i3) * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InputStep(contextId=");
        k.append(this.f63880b);
        k.append(", analyticKey=");
        k.append(this.f63881c);
        k.append(", handlerIdentifier=");
        k.append(this.f63882d);
        k.append(", logo=");
        k.append(this.f63883e);
        k.append(", title=");
        k.append(this.f63884f);
        k.append(", subtitle=");
        k.append(this.f63885g);
        k.append(", actionText=");
        k.append(this.f63886h);
        k.append(", inputFields=");
        return C13555b.m33970i(k, this.f63887i, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f63880b);
        parcel.writeString(this.f63881c);
        parcel.writeString(this.f63882d);
        parcel.writeParcelable(this.f63883e, i);
        parcel.writeString(this.f63884f);
        parcel.writeString(this.f63885g);
        parcel.writeString(this.f63886h);
        List<InputField> list = this.f63887i;
        parcel.writeInt(list.size());
        for (InputField writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
