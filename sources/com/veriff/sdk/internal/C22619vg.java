package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015HÆ\u0001R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "component2", "Lmobi/lab/veriff/data/api/request/response/Document;", "component3", "Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "component4", "id", "status", "document", "verificationRejectionCategory", "copy", "Lmobi/lab/veriff/data/api/request/response/Document;", "getDocument", "()Lmobi/lab/veriff/data/api/request/response/Document;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "getStatus", "()Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "getVerificationRejectionCategory", "()Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;", "<init>", "(Ljava/lang/String;Lmobi/lab/veriff/data/api/request/response/VerificationStatus;Lmobi/lab/veriff/data/api/request/response/Document;Lmobi/lab/veriff/data/api/request/response/VerificationRejectionCategory;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.vg */
public final class C22619vg implements Parcelable {
    public static final Parcelable.Creator<C22619vg> CREATOR = new C22620a();

    /* renamed from: a */
    private final String f57047a;

    /* renamed from: b */
    private final C22621vh f57048b;

    /* renamed from: c */
    private final C22556tm f57049c;

    /* renamed from: d */
    private final C22617vf f57050d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.vg$a */
    public static class C22620a implements Parcelable.Creator<C22619vg> {
        /* renamed from: a */
        public final C22619vg createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            String readString = parcel.readString();
            C22617vf vfVar = null;
            C22621vh vhVar = parcel.readInt() != 0 ? (C22621vh) Enum.valueOf(C22621vh.class, parcel.readString()) : null;
            C22556tm createFromParcel = parcel.readInt() != 0 ? C22556tm.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                vfVar = C22617vf.CREATOR.createFromParcel(parcel);
            }
            return new C22619vg(readString, vhVar, createFromParcel, vfVar);
        }

        /* renamed from: a */
        public final C22619vg[] newArray(int i) {
            return new C22619vg[i];
        }
    }

    public C22619vg() {
        this((String) null, (C22621vh) null, (C22556tm) null, (C22617vf) null, 15, (DefaultConstructorMarker) null);
    }

    public C22619vg(String str, C22621vh vhVar, C22556tm tmVar, C22617vf vfVar) {
        this.f57047a = str;
        this.f57048b = vhVar;
        this.f57049c = tmVar;
        this.f57050d = vfVar;
    }

    /* renamed from: a */
    public final C22619vg mo56956a(String str, C22621vh vhVar, C22556tm tmVar, C22617vf vfVar) {
        return new C22619vg(str, vhVar, tmVar, vfVar);
    }

    /* renamed from: a */
    public final String mo56957a() {
        return this.f57047a;
    }

    /* renamed from: b */
    public final C22621vh mo56958b() {
        return this.f57048b;
    }

    /* renamed from: c */
    public final C22556tm mo56959c() {
        return this.f57049c;
    }

    /* renamed from: d */
    public final C22617vf mo56960d() {
        return this.f57050d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22619vg)) {
            return false;
        }
        C22619vg vgVar = (C22619vg) obj;
        return C24362h.m61206a(this.f57047a, vgVar.f57047a) && C24362h.m61206a(this.f57048b, vgVar.f57048b) && C24362h.m61206a(this.f57049c, vgVar.f57049c) && C24362h.m61206a(this.f57050d, vgVar.f57050d);
    }

    public int hashCode() {
        String str = this.f57047a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C22621vh vhVar = this.f57048b;
        int hashCode2 = (hashCode + (vhVar != null ? vhVar.hashCode() : 0)) * 31;
        C22556tm tmVar = this.f57049c;
        int hashCode3 = (hashCode2 + (tmVar != null ? tmVar.hashCode() : 0)) * 31;
        C22617vf vfVar = this.f57050d;
        if (vfVar != null) {
            i = vfVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VerificationSession(id=");
        k.append(this.f57047a);
        k.append(", status=");
        k.append(this.f57048b);
        k.append(", document=");
        k.append(this.f57049c);
        k.append(", verificationRejectionCategory=");
        k.append(this.f57050d);
        k.append(")");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f57047a);
        C22621vh vhVar = this.f57048b;
        if (vhVar != null) {
            parcel.writeInt(1);
            parcel.writeString(vhVar.name());
        } else {
            parcel.writeInt(0);
        }
        C22556tm tmVar = this.f57049c;
        if (tmVar != null) {
            parcel.writeInt(1);
            tmVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        C22617vf vfVar = this.f57050d;
        if (vfVar != null) {
            parcel.writeInt(1);
            vfVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22619vg(String str, C22621vh vhVar, C22556tm tmVar, C22617vf vfVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : vhVar, (i & 4) != 0 ? null : tmVar, (i & 8) != 0 ? null : vfVar);
    }
}
