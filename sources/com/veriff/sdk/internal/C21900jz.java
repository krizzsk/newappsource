package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001R$\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/VerificationState;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "Lmobi/lab/veriff/data/Country;", "component1", "component2", "selectedCountry", "selectedDocument", "copy", "Lmobi/lab/veriff/data/Country;", "getSelectedCountry", "()Lmobi/lab/veriff/data/Country;", "setSelectedCountry", "(Lmobi/lab/veriff/data/Country;)V", "Ljava/lang/String;", "getSelectedDocument", "()Ljava/lang/String;", "setSelectedDocument", "(Ljava/lang/String;)V", "<init>", "(Lmobi/lab/veriff/data/Country;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jz */
public final class C21900jz implements Parcelable {
    public static final Parcelable.Creator<C21900jz> CREATOR = new C21901a();

    /* renamed from: a */
    private C24424c f55368a;

    /* renamed from: b */
    private String f55369b;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jz$a */
    public static class C21901a implements Parcelable.Creator<C21900jz> {
        /* renamed from: a */
        public final C21900jz createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C21900jz((C24424c) parcel.readParcelable(C21900jz.class.getClassLoader()), parcel.readString());
        }

        /* renamed from: a */
        public final C21900jz[] newArray(int i) {
            return new C21900jz[i];
        }
    }

    public C21900jz() {
        this((C24424c) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public C21900jz(C24424c cVar, String str) {
        this.f55368a = cVar;
        this.f55369b = str;
    }

    /* renamed from: a */
    public final C24424c mo55656a() {
        return this.f55368a;
    }

    /* renamed from: b */
    public final String mo55659b() {
        return this.f55369b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21900jz)) {
            return false;
        }
        C21900jz jzVar = (C21900jz) obj;
        return C24362h.m61206a(this.f55368a, jzVar.f55368a) && C24362h.m61206a(this.f55369b, jzVar.f55369b);
    }

    public int hashCode() {
        C24424c cVar = this.f55368a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f55369b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VerificationState(selectedCountry=");
        k.append(this.f55368a);
        k.append(", selectedDocument=");
        return C0016g.m31o(k, this.f55369b, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeParcelable(this.f55368a, i);
        parcel.writeString(this.f55369b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21900jz(C24424c cVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : str);
    }

    /* renamed from: a */
    public final void mo55658a(C24424c cVar) {
        this.f55368a = cVar;
    }

    /* renamed from: a */
    public final void mo55657a(String str) {
        this.f55369b = str;
    }
}
