package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component2", "key", "value", "copy", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.vd */
public final class C22614vd implements Parcelable {
    public static final Parcelable.Creator<C22614vd> CREATOR = new C22615a();

    /* renamed from: a */
    private final String f57037a;

    /* renamed from: b */
    private final String f57038b;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.vd$a */
    public static class C22615a implements Parcelable.Creator<C22614vd> {
        /* renamed from: a */
        public final C22614vd createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22614vd(parcel.readString(), parcel.readString());
        }

        /* renamed from: a */
        public final C22614vd[] newArray(int i) {
            return new C22614vd[i];
        }
    }

    public C22614vd(String str, String str2) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(str2, "value");
        this.f57037a = str;
        this.f57038b = str2;
    }

    /* renamed from: a */
    public final String mo56923a() {
        return this.f57037a;
    }

    /* renamed from: b */
    public final String mo56924b() {
        return this.f57038b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22614vd)) {
            return false;
        }
        C22614vd vdVar = (C22614vd) obj;
        return C24362h.m61206a(this.f57037a, vdVar.f57037a) && C24362h.m61206a(this.f57038b, vdVar.f57038b);
    }

    public int hashCode() {
        String str = this.f57037a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57038b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("TranslatedString(key=");
        k.append(this.f57037a);
        k.append(", value=");
        return C0016g.m31o(k, this.f57038b, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f57037a);
        parcel.writeString(this.f57038b);
    }
}
