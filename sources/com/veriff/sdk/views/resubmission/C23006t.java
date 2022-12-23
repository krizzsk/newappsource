package com.veriff.sdk.views.resubmission;

import com.veriff.sdk.internal.C21616ex;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BE\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JI\u0010\u0014\u001a\u00020\u00002\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuideSet;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "component1", "component2", "", "Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuide;", "component3", "guideSetTitle", "guideSetDescription", "guides", "copy", "Llf0/l;", "getGuideSetDescription", "()Llf0/l;", "getGuideSetTitle", "Ljava/util/List;", "getGuides", "()Ljava/util/List;", "<init>", "(Llf0/l;Llf0/l;Ljava/util/List;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.t */
public final class C23006t {

    /* renamed from: a */
    private final C24236l<C21616ex, CharSequence> f58337a;

    /* renamed from: b */
    private final C24236l<C21616ex, CharSequence> f58338b;

    /* renamed from: c */
    private final List<C23004s> f58339c;

    public C23006t(C24236l<? super C21616ex, ? extends CharSequence> lVar, C24236l<? super C21616ex, ? extends CharSequence> lVar2, List<C23004s> list) {
        C24362h.m61211f(lVar, "guideSetTitle");
        C24362h.m61211f(lVar2, "guideSetDescription");
        C24362h.m61211f(list, "guides");
        this.f58337a = lVar;
        this.f58338b = lVar2;
        this.f58339c = list;
    }

    /* renamed from: a */
    public final C24236l<C21616ex, CharSequence> mo57923a() {
        return this.f58337a;
    }

    /* renamed from: b */
    public final C24236l<C21616ex, CharSequence> mo57924b() {
        return this.f58338b;
    }

    /* renamed from: c */
    public final List<C23004s> mo57925c() {
        return this.f58339c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23006t)) {
            return false;
        }
        C23006t tVar = (C23006t) obj;
        return C24362h.m61206a(this.f58337a, tVar.f58337a) && C24362h.m61206a(this.f58338b, tVar.f58338b) && C24362h.m61206a(this.f58339c, tVar.f58339c);
    }

    public int hashCode() {
        C24236l<C21616ex, CharSequence> lVar = this.f58337a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C24236l<C21616ex, CharSequence> lVar2 = this.f58338b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        List<C23004s> list = this.f58339c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ResubmissionReasonGuideSet(guideSetTitle=");
        k.append(this.f58337a);
        k.append(", guideSetDescription=");
        k.append(this.f58338b);
        k.append(", guides=");
        k.append(this.f58339c);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23006t(C24236l lVar, C24236l lVar2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C230071.f58340a : lVar, (i & 2) != 0 ? C230082.f58341a : lVar2, list);
    }
}
