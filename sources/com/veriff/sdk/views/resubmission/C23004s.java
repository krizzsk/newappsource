package com.veriff.sdk.views.resubmission;

import com.veriff.sdk.internal.C21616ex;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u000f\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0001R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuide;", "", "", "toString", "", "hashCode", "other", "", "equals", "component1", "component2", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "component3", "image", "icon", "reason", "copy", "I", "getIcon", "()I", "getImage", "Llf0/l;", "getReason", "()Llf0/l;", "<init>", "(IILlf0/l;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.resubmission.s */
public final class C23004s {

    /* renamed from: a */
    private final int f58333a;

    /* renamed from: b */
    private final int f58334b;

    /* renamed from: c */
    private final C24236l<C21616ex, CharSequence> f58335c;

    public C23004s(int i, int i2, C24236l<? super C21616ex, ? extends CharSequence> lVar) {
        C24362h.m61211f(lVar, "reason");
        this.f58333a = i;
        this.f58334b = i2;
        this.f58335c = lVar;
    }

    /* renamed from: a */
    public final int mo57916a() {
        return this.f58333a;
    }

    /* renamed from: b */
    public final int mo57917b() {
        return this.f58334b;
    }

    /* renamed from: c */
    public final C24236l<C21616ex, CharSequence> mo57918c() {
        return this.f58335c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23004s)) {
            return false;
        }
        C23004s sVar = (C23004s) obj;
        return this.f58333a == sVar.f58333a && this.f58334b == sVar.f58334b && C24362h.m61206a(this.f58335c, sVar.f58335c);
    }

    public int hashCode() {
        int i = ((this.f58333a * 31) + this.f58334b) * 31;
        C24236l<C21616ex, CharSequence> lVar = this.f58335c;
        return i + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ResubmissionReasonGuide(image=");
        k.append(this.f58333a);
        k.append(", icon=");
        k.append(this.f58334b);
        k.append(", reason=");
        k.append(this.f58335c);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23004s(int i, int i2, C24236l lVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? C230051.f58336a : lVar);
    }
}
