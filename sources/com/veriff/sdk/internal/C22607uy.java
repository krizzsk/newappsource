package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\u0013¨\u0006$"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "id", "reason", "reasonCode", "documentType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "Ljava/lang/String;", "getDocumentType", "()Ljava/lang/String;", "getId", "getReason", "Ljava/lang/Integer;", "getReasonCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uy */
public final class C22607uy implements Parcelable {
    public static final Parcelable.Creator<C22607uy> CREATOR = new C22608a();

    /* renamed from: a */
    private final String f57016a;

    /* renamed from: b */
    private final String f57017b;

    /* renamed from: c */
    private final Integer f57018c;

    /* renamed from: d */
    private final String f57019d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.uy$a */
    public static class C22608a implements Parcelable.Creator<C22607uy> {
        /* renamed from: a */
        public final C22607uy createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22607uy(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* renamed from: a */
        public final C22607uy[] newArray(int i) {
            return new C22607uy[i];
        }
    }

    public C22607uy(String str, String str2, Integer num, String str3) {
        this.f57016a = str;
        this.f57017b = str2;
        this.f57018c = num;
        this.f57019d = str3;
    }

    /* renamed from: a */
    public final String mo56889a() {
        return this.f57016a;
    }

    /* renamed from: b */
    public final String mo56890b() {
        return this.f57017b;
    }

    /* renamed from: c */
    public final Integer mo56891c() {
        return this.f57018c;
    }

    /* renamed from: d */
    public final String mo56892d() {
        return this.f57019d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22607uy)) {
            return false;
        }
        C22607uy uyVar = (C22607uy) obj;
        return C24362h.m61206a(this.f57016a, uyVar.f57016a) && C24362h.m61206a(this.f57017b, uyVar.f57017b) && C24362h.m61206a(this.f57018c, uyVar.f57018c) && C24362h.m61206a(this.f57019d, uyVar.f57019d);
    }

    public int hashCode() {
        String str = this.f57016a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57017b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f57018c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f57019d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ResubmittedSession(id=");
        k.append(this.f57016a);
        k.append(", reason=");
        k.append(this.f57017b);
        k.append(", reasonCode=");
        k.append(this.f57018c);
        k.append(", documentType=");
        return C0016g.m31o(k, this.f57019d, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f57016a);
        parcel.writeString(this.f57017b);
        Integer num = this.f57018c;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f57019d);
    }
}
