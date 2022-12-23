package com.cubic.umo.p045ad.types;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJQ\u0010\b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¨\u0006\u000b"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKTrackers;", "Landroid/os/Parcelable;", "", "", "impression", "click", "view", "viewability", "copy", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKTrackers */
public final class AKTrackers implements Parcelable {
    public static final Parcelable.Creator<AKTrackers> CREATOR = new C2229a();

    /* renamed from: b */
    public final List<String> f7594b;

    /* renamed from: c */
    public final List<String> f7595c;

    /* renamed from: d */
    public final List<String> f7596d;

    /* renamed from: e */
    public final List<String> f7597e;

    /* renamed from: com.cubic.umo.ad.types.AKTrackers$a */
    public static final class C2229a implements Parcelable.Creator<AKTrackers> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AKTrackers(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new AKTrackers[i];
        }
    }

    public AKTrackers() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public AKTrackers(@C12943g(name = "impression") List<String> list, @C12943g(name = "click") List<String> list2, @C12943g(name = "view") List<String> list3, @C12943g(name = "viewability") List<String> list4) {
        this.f7594b = list;
        this.f7595c = list2;
        this.f7596d = list3;
        this.f7597e = list4;
    }

    public final AKTrackers copy(@C12943g(name = "impression") List<String> list, @C12943g(name = "click") List<String> list2, @C12943g(name = "view") List<String> list3, @C12943g(name = "viewability") List<String> list4) {
        return new AKTrackers(list, list2, list3, list4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKTrackers)) {
            return false;
        }
        AKTrackers aKTrackers = (AKTrackers) obj;
        return C24362h.m61206a(this.f7594b, aKTrackers.f7594b) && C24362h.m61206a(this.f7595c, aKTrackers.f7595c) && C24362h.m61206a(this.f7596d, aKTrackers.f7596d) && C24362h.m61206a(this.f7597e, aKTrackers.f7597e);
    }

    public final int hashCode() {
        List<String> list = this.f7594b;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f7595c;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f7596d;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f7597e;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKTrackers(impression=");
        J0.append(this.f7594b);
        J0.append(", click=");
        J0.append(this.f7595c);
        J0.append(", view=");
        J0.append(this.f7596d);
        J0.append(", viewability=");
        return C13555b.m33970i(J0, this.f7597e, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeStringList(this.f7594b);
        parcel.writeStringList(this.f7595c);
        parcel.writeStringList(this.f7596d);
        parcel.writeStringList(this.f7597e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKTrackers(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
