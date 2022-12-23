package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24457h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0001'B%\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0014HÆ\u0001J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "", "Lcom/veriff/sdk/views/base/navigation/NavigationStep;", "component1", "component2", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "component3", "steps", "currentStep", "language", "copy", "Lcom/veriff/sdk/views/base/navigation/DisplayState;", "toDisplayState", "I", "getCurrentStep", "()I", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "getLanguage", "()Lmobi/lab/veriff/util/LanguageCountryLocale;", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "<init>", "(Ljava/util/List;ILmobi/lab/veriff/util/LanguageCountryLocale;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pc */
public final class C22247pc implements Parcelable {
    public static final Parcelable.Creator<C22247pc> CREATOR = new C22249b();

    /* renamed from: a */
    public static final C22248a f56098a = new C22248a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C22247pc f56099e = new C22247pc(EmptyList.f60173b, -1, C24457h.f61897a.mo60701a());

    /* renamed from: b */
    private final List<C22250pd> f56100b;

    /* renamed from: c */
    private final int f56101c;

    /* renamed from: d */
    private final C24454g f56102d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState$Companion;", "", "()V", "EMPTY", "Lcom/veriff/sdk/views/base/navigation/NavigationState;", "getEMPTY", "()Lcom/veriff/sdk/views/base/navigation/NavigationState;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pc$a */
    public static final class C22248a {
        private C22248a() {
        }

        public /* synthetic */ C22248a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22247pc mo56194a() {
            return C22247pc.f56099e;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pc$b */
    public static class C22249b implements Parcelable.Creator<C22247pc> {
        /* renamed from: a */
        public final C22247pc createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((C22250pd) Enum.valueOf(C22250pd.class, parcel.readString()));
                readInt--;
            }
            return new C22247pc(arrayList, parcel.readInt(), C24454g.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: a */
        public final C22247pc[] newArray(int i) {
            return new C22247pc[i];
        }
    }

    public C22247pc(List<? extends C22250pd> list, int i, C24454g gVar) {
        C24362h.m61211f(list, "steps");
        C24362h.m61211f(gVar, "language");
        this.f56100b = list;
        this.f56101c = i;
        this.f56102d = gVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C22247pc m54156a(C22247pc pcVar, List<C22250pd> list, int i, C24454g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = pcVar.f56100b;
        }
        if ((i2 & 2) != 0) {
            i = pcVar.f56101c;
        }
        if ((i2 & 4) != 0) {
            gVar = pcVar.f56102d;
        }
        return pcVar.mo56186a(list, i, gVar);
    }

    /* renamed from: a */
    public final C22241oz mo56185a() {
        Integer valueOf = Integer.valueOf(this.f56101c);
        int intValue = valueOf.intValue();
        if (!(intValue >= 0 && this.f56100b.size() > intValue)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return new C22241oz(this.f56100b.get(valueOf.intValue()), this.f56102d);
    }

    /* renamed from: a */
    public final C22247pc mo56186a(List<? extends C22250pd> list, int i, C24454g gVar) {
        C24362h.m61211f(list, "steps");
        C24362h.m61211f(gVar, "language");
        return new C22247pc(list, i, gVar);
    }

    /* renamed from: b */
    public final List<C22250pd> mo56187b() {
        return this.f56100b;
    }

    /* renamed from: c */
    public final int mo56188c() {
        return this.f56101c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22247pc)) {
            return false;
        }
        C22247pc pcVar = (C22247pc) obj;
        return C24362h.m61206a(this.f56100b, pcVar.f56100b) && this.f56101c == pcVar.f56101c && C24362h.m61206a(this.f56102d, pcVar.f56102d);
    }

    public int hashCode() {
        List<C22250pd> list = this.f56100b;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f56101c) * 31;
        C24454g gVar = this.f56102d;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("NavigationState(steps=");
        k.append(this.f56100b);
        k.append(", currentStep=");
        k.append(this.f56101c);
        k.append(", language=");
        k.append(this.f56102d);
        k.append(")");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        List<C22250pd> list = this.f56100b;
        parcel.writeInt(list.size());
        for (C22250pd name : list) {
            parcel.writeString(name.name());
        }
        parcel.writeInt(this.f56101c);
        this.f56102d.writeToParcel(parcel, 0);
    }
}
