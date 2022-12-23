package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/Document;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component2", "country", "type", "copy", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tm */
public final class C22556tm implements Parcelable {
    public static final Parcelable.Creator<C22556tm> CREATOR = new C22557a();

    /* renamed from: a */
    private final String f56920a;

    /* renamed from: b */
    private final String f56921b;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.tm$a */
    public static class C22557a implements Parcelable.Creator<C22556tm> {
        /* renamed from: a */
        public final C22556tm createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22556tm(parcel.readString(), parcel.readString());
        }

        /* renamed from: a */
        public final C22556tm[] newArray(int i) {
            return new C22556tm[i];
        }
    }

    public C22556tm() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public C22556tm(String str, String str2) {
        this.f56920a = str;
        this.f56921b = str2;
    }

    /* renamed from: a */
    public final C22556tm mo56739a(String str, String str2) {
        return new C22556tm(str, str2);
    }

    /* renamed from: a */
    public final String mo56740a() {
        return this.f56920a;
    }

    /* renamed from: b */
    public final String mo56741b() {
        return this.f56921b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22556tm)) {
            return false;
        }
        C22556tm tmVar = (C22556tm) obj;
        return C24362h.m61206a(this.f56920a, tmVar.f56920a) && C24362h.m61206a(this.f56921b, tmVar.f56921b);
    }

    public int hashCode() {
        String str = this.f56920a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56921b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Document(country=");
        k.append(this.f56920a);
        k.append(", type=");
        return C0016g.m31o(k, this.f56921b, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f56920a);
        parcel.writeString(this.f56921b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22556tm(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
