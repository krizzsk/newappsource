package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "()Ljava/lang/Integer;", "component2", "code", "value", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "Ljava/lang/Integer;", "getCode", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.vf */
public final class C22617vf implements Parcelable {
    public static final Parcelable.Creator<C22617vf> CREATOR = new C22618a();

    /* renamed from: a */
    private final Integer f57045a;

    /* renamed from: b */
    private final String f57046b;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.vf$a */
    public static class C22618a implements Parcelable.Creator<C22617vf> {
        /* renamed from: a */
        public final C22617vf createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22617vf(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* renamed from: a */
        public final C22617vf[] newArray(int i) {
            return new C22617vf[i];
        }
    }

    public C22617vf() {
        this((Integer) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public C22617vf(Integer num, String str) {
        this.f57045a = num;
        this.f57046b = str;
    }

    /* renamed from: a */
    public final C22617vf mo56944a(Integer num, String str) {
        return new C22617vf(num, str);
    }

    /* renamed from: a */
    public final Integer mo56945a() {
        return this.f57045a;
    }

    /* renamed from: b */
    public final String mo56946b() {
        return this.f57046b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22617vf)) {
            return false;
        }
        C22617vf vfVar = (C22617vf) obj;
        return C24362h.m61206a(this.f57045a, vfVar.f57045a) && C24362h.m61206a(this.f57046b, vfVar.f57046b);
    }

    public int hashCode() {
        Integer num = this.f57045a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f57046b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VerificationRejectionCategory(code=");
        k.append(this.f57045a);
        k.append(", value=");
        return C0016g.m31o(k, this.f57046b, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C24362h.m61211f(parcel, "parcel");
        Integer num = this.f57045a;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f57046b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22617vf(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
