package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001:\u0001=Bq\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003Jy\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010 \u001a\u00020\u00132\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0001R\u0017\u0010 \u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b/\u00100R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b5\u00103R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b6\u00103R\u0019\u0010$\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b8\u00109R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b:\u00103¨\u0006>"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/StartSessionData;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "component1", "component2", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "component3", "component4", "component5", "component6", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "component7", "component8", "", "Lmobi/lab/veriff/data/api/request/response/TranslatedString;", "component9", "idvSession", "poaSession", "featureFlags", "vendorName", "preselectedCountry", "preselectedDocument", "resubmittedSession", "introsLanguage", "intros", "copy", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getFeatureFlags", "()Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "getIdvSession", "()Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "Ljava/util/List;", "getIntros", "()Ljava/util/List;", "Ljava/lang/String;", "getIntrosLanguage", "()Ljava/lang/String;", "getPoaSession", "getPreselectedCountry", "getPreselectedDocument", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "getResubmittedSession", "()Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "getVendorName", "<init>", "(Lmobi/lab/veriff/data/api/request/response/VerificationSession;Lmobi/lab/veriff/data/api/request/response/VerificationSession;Lcom/veriff/sdk/internal/data/FeatureFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;Ljava/lang/String;Ljava/util/List;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jw */
public final class C21895jw implements Parcelable {
    public static final Parcelable.Creator<C21895jw> CREATOR = new C21897b();

    /* renamed from: b */
    private final C22619vg f55358b;

    /* renamed from: c */
    private final C22619vg f55359c;

    /* renamed from: d */
    private final C21789ix f55360d;

    /* renamed from: e */
    private final String f55361e;

    /* renamed from: f */
    private final String f55362f;

    /* renamed from: g */
    private final String f55363g;

    /* renamed from: h */
    private final C22607uy f55364h;

    /* renamed from: i */
    private final String f55365i;

    /* renamed from: j */
    private final List<C22614vd> f55366j;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/StartSessionData$Companion;", "", "()V", "create", "Lcom/veriff/sdk/internal/data/StartSessionData;", "status", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "featureFlags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jw$a */
    public static final class C21896a {
        private C21896a() {
        }

        public /* synthetic */ C21896a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jw$b */
    public static class C21897b implements Parcelable.Creator<C21895jw> {
        /* renamed from: a */
        public final C21895jw createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            ArrayList arrayList = null;
            C22619vg createFromParcel = parcel.readInt() != 0 ? C22619vg.CREATOR.createFromParcel(parcel) : null;
            C22619vg createFromParcel2 = parcel.readInt() != 0 ? C22619vg.CREATOR.createFromParcel(parcel) : null;
            C21789ix createFromParcel3 = C21789ix.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            C22607uy createFromParcel4 = parcel.readInt() != 0 ? C22607uy.CREATOR.createFromParcel(parcel) : null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(C22614vd.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new C21895jw(createFromParcel, createFromParcel2, createFromParcel3, readString, readString2, readString3, createFromParcel4, readString4, arrayList);
        }

        /* renamed from: a */
        public final C21895jw[] newArray(int i) {
            return new C21895jw[i];
        }
    }

    static {
        new C21896a((DefaultConstructorMarker) null);
    }

    public C21895jw(C22619vg vgVar, C22619vg vgVar2, C21789ix ixVar, String str, String str2, String str3, C22607uy uyVar, String str4, List<C22614vd> list) {
        C24362h.m61211f(ixVar, "featureFlags");
        this.f55358b = vgVar;
        this.f55359c = vgVar2;
        this.f55360d = ixVar;
        this.f55361e = str;
        this.f55362f = str2;
        this.f55363g = str3;
        this.f55364h = uyVar;
        this.f55365i = str4;
        this.f55366j = list;
    }

    /* renamed from: a */
    public static /* synthetic */ C21895jw m53424a(C21895jw jwVar, C22619vg vgVar, C22619vg vgVar2, C21789ix ixVar, String str, String str2, String str3, C22607uy uyVar, String str4, List list, int i, Object obj) {
        C21895jw jwVar2 = jwVar;
        int i2 = i;
        return jwVar.mo55637a((i2 & 1) != 0 ? jwVar2.f55358b : vgVar, (i2 & 2) != 0 ? jwVar2.f55359c : vgVar2, (i2 & 4) != 0 ? jwVar2.f55360d : ixVar, (i2 & 8) != 0 ? jwVar2.f55361e : str, (i2 & 16) != 0 ? jwVar2.f55362f : str2, (i2 & 32) != 0 ? jwVar2.f55363g : str3, (i2 & 64) != 0 ? jwVar2.f55364h : uyVar, (i2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? jwVar2.f55365i : str4, (i2 & 256) != 0 ? jwVar2.f55366j : list);
    }

    /* renamed from: a */
    public final C21895jw mo55637a(C22619vg vgVar, C22619vg vgVar2, C21789ix ixVar, String str, String str2, String str3, C22607uy uyVar, String str4, List<C22614vd> list) {
        C24362h.m61211f(ixVar, "featureFlags");
        return new C21895jw(vgVar, vgVar2, ixVar, str, str2, str3, uyVar, str4, list);
    }

    /* renamed from: a */
    public final C22619vg mo55638a() {
        return this.f55358b;
    }

    /* renamed from: b */
    public final C22619vg mo55639b() {
        return this.f55359c;
    }

    /* renamed from: c */
    public final C21789ix mo55640c() {
        return this.f55360d;
    }

    /* renamed from: d */
    public final String mo55641d() {
        return this.f55361e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo55643e() {
        return this.f55362f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21895jw)) {
            return false;
        }
        C21895jw jwVar = (C21895jw) obj;
        return C24362h.m61206a(this.f55358b, jwVar.f55358b) && C24362h.m61206a(this.f55359c, jwVar.f55359c) && C24362h.m61206a(this.f55360d, jwVar.f55360d) && C24362h.m61206a(this.f55361e, jwVar.f55361e) && C24362h.m61206a(this.f55362f, jwVar.f55362f) && C24362h.m61206a(this.f55363g, jwVar.f55363g) && C24362h.m61206a(this.f55364h, jwVar.f55364h) && C24362h.m61206a(this.f55365i, jwVar.f55365i) && C24362h.m61206a(this.f55366j, jwVar.f55366j);
    }

    /* renamed from: f */
    public final String mo55645f() {
        return this.f55363g;
    }

    /* renamed from: g */
    public final C22607uy mo55646g() {
        return this.f55364h;
    }

    /* renamed from: h */
    public final String mo55647h() {
        return this.f55365i;
    }

    public int hashCode() {
        C22619vg vgVar = this.f55358b;
        int i = 0;
        int hashCode = (vgVar != null ? vgVar.hashCode() : 0) * 31;
        C22619vg vgVar2 = this.f55359c;
        int hashCode2 = (hashCode + (vgVar2 != null ? vgVar2.hashCode() : 0)) * 31;
        C21789ix ixVar = this.f55360d;
        int hashCode3 = (hashCode2 + (ixVar != null ? ixVar.hashCode() : 0)) * 31;
        String str = this.f55361e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55362f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55363g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C22607uy uyVar = this.f55364h;
        int hashCode7 = (hashCode6 + (uyVar != null ? uyVar.hashCode() : 0)) * 31;
        String str4 = this.f55365i;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<C22614vd> list = this.f55366j;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final List<C22614vd> mo55649i() {
        return this.f55366j;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("StartSessionData(idvSession=");
        k.append(this.f55358b);
        k.append(", poaSession=");
        k.append(this.f55359c);
        k.append(", featureFlags=");
        k.append(this.f55360d);
        k.append(", vendorName=");
        k.append(this.f55361e);
        k.append(", preselectedCountry=");
        k.append(this.f55362f);
        k.append(", preselectedDocument=");
        k.append(this.f55363g);
        k.append(", resubmittedSession=");
        k.append(this.f55364h);
        k.append(", introsLanguage=");
        k.append(this.f55365i);
        k.append(", intros=");
        k.append(this.f55366j);
        k.append(")");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        C22619vg vgVar = this.f55358b;
        if (vgVar != null) {
            parcel.writeInt(1);
            vgVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        C22619vg vgVar2 = this.f55359c;
        if (vgVar2 != null) {
            parcel.writeInt(1);
            vgVar2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        this.f55360d.writeToParcel(parcel, 0);
        parcel.writeString(this.f55361e);
        parcel.writeString(this.f55362f);
        parcel.writeString(this.f55363g);
        C22607uy uyVar = this.f55364h;
        if (uyVar != null) {
            parcel.writeInt(1);
            uyVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f55365i);
        List<C22614vd> list = this.f55366j;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (C22614vd writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21895jw(com.veriff.sdk.internal.C22619vg r14, com.veriff.sdk.internal.C22619vg r15, com.veriff.sdk.internal.C21789ix r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.veriff.sdk.internal.C22607uy r20, java.lang.String r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r19
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r20
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r21
        L_0x002b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r22
        L_0x0033:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21895jw.<init>(com.veriff.sdk.internal.vg, com.veriff.sdk.internal.vg, com.veriff.sdk.internal.ix, java.lang.String, java.lang.String, java.lang.String, com.veriff.sdk.internal.uy, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
