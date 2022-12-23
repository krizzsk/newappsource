package com.moovit.image.model;

import a20.C13387a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.image.C16019d;
import java.util.Arrays;
import p001a0.C0016g;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;

public abstract class Image implements C13387a, Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new C16048a();

    /* renamed from: b */
    public final String f41803b;

    /* renamed from: c */
    public final Object f41804c;

    /* renamed from: d */
    public final String[] f41805d;

    /* renamed from: e */
    public final boolean f41806e;

    /* renamed from: com.moovit.image.model.Image$a */
    public class C16048a implements Parcelable.Creator<Image> {
        public final Object createFromParcel(Parcel parcel) {
            return (Image) C19612n.m46981v(parcel, C16019d.m40803a().f41718d);
        }

        public final Object[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image(String str, Object obj, String[] strArr, boolean z) {
        this.f41803b = str;
        C21100e.m49373x(obj, "baseId");
        this.f41804c = obj;
        this.f41805d = strArr;
        this.f41806e = z;
    }

    /* renamed from: b */
    public final String[] mo48223b() {
        if (this.f41806e) {
            return this.f41805d;
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (!this.f41803b.equals(image.f41803b) || !this.f41804c.equals(image.f41804c) || !Arrays.equals(mo48223b(), image.mo48223b())) {
            return false;
        }
        return true;
    }

    public final Image getImage() {
        return this;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f41803b.hashCode(), this.f41804c.hashCode(), Arrays.hashCode(mo48223b()));
    }

    public final String toString() {
        String str;
        String str2;
        String[] strArr = this.f41805d;
        if (strArr == null) {
            str = "";
        } else {
            str = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, strArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41803b);
        sb.append("/");
        sb.append(this.f41804c);
        if (this.f41806e) {
            str2 = "#relevantParams:";
        } else {
            str2 = "#originalParams:";
        }
        return C0016g.m31o(sb, str2, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, C16019d.m40803a().f41718d);
    }
}
