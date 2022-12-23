package com.veriff.sdk.views.resubmission;

import com.veriff.sdk.internal.C21616ex;
import java.util.List;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionReason;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "component1", "component2", "", "Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuideSet;", "component3", "resubmissionReasonTitle", "resubmissionReasonDescription", "guideSet", "copy", "Ljava/util/List;", "getGuideSet", "()Ljava/util/List;", "Llf0/l;", "getResubmissionReasonDescription", "()Llf0/l;", "getResubmissionReasonTitle", "<init>", "(Llf0/l;Llf0/l;Ljava/util/List;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.d */
public final class C22953d {

    /* renamed from: a */
    private final C24236l<C21616ex, CharSequence> f58269a;

    /* renamed from: b */
    private final C24236l<C21616ex, CharSequence> f58270b;

    /* renamed from: c */
    private final List<C23006t> f58271c;

    public C22953d(C24236l<? super C21616ex, ? extends CharSequence> lVar, C24236l<? super C21616ex, ? extends CharSequence> lVar2, List<C23006t> list) {
        C24362h.m61211f(lVar, "resubmissionReasonTitle");
        C24362h.m61211f(lVar2, "resubmissionReasonDescription");
        C24362h.m61211f(list, "guideSet");
        this.f58269a = lVar;
        this.f58270b = lVar2;
        this.f58271c = list;
    }

    /* renamed from: a */
    public final C24236l<C21616ex, CharSequence> mo57871a() {
        return this.f58269a;
    }

    /* renamed from: b */
    public final C24236l<C21616ex, CharSequence> mo57872b() {
        return this.f58270b;
    }

    /* renamed from: c */
    public final List<C23006t> mo57873c() {
        return this.f58271c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22953d)) {
            return false;
        }
        C22953d dVar = (C22953d) obj;
        return C24362h.m61206a(this.f58269a, dVar.f58269a) && C24362h.m61206a(this.f58270b, dVar.f58270b) && C24362h.m61206a(this.f58271c, dVar.f58271c);
    }

    public int hashCode() {
        C24236l<C21616ex, CharSequence> lVar = this.f58269a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C24236l<C21616ex, CharSequence> lVar2 = this.f58270b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        List<C23006t> list = this.f58271c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ResubmissionReason(resubmissionReasonTitle=");
        k.append(this.f58269a);
        k.append(", resubmissionReasonDescription=");
        k.append(this.f58270b);
        k.append(", guideSet=");
        k.append(this.f58271c);
        k.append(")");
        return k.toString();
    }
}
