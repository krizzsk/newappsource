package com.veriff.sdk.internal;

import com.appboy.models.MessageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BM\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003JS\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0003\u0010\u0013\u001a\u00020\u00042\b\b\u0003\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0007HÆ\u0001R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/InstructionGuideAssets;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "component1", "component2", "component3", "component4", "component5", "title", "text", "illustration", "illustrationEnd", "shouldAnimate", "copy", "I", "getIllustration", "()I", "getIllustrationEnd", "Z", "getShouldAnimate", "()Z", "Llf0/l;", "getText", "()Llf0/l;", "getTitle", "<init>", "(Llf0/l;Llf0/l;IIZ)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jc */
public final class C21869jc {

    /* renamed from: a */
    private final C24236l<C21616ex, CharSequence> f55279a;

    /* renamed from: b */
    private final C24236l<C21616ex, CharSequence> f55280b;

    /* renamed from: c */
    private final int f55281c;

    /* renamed from: d */
    private final int f55282d;

    /* renamed from: e */
    private final boolean f55283e;

    public C21869jc(C24236l<? super C21616ex, ? extends CharSequence> lVar, C24236l<? super C21616ex, ? extends CharSequence> lVar2, int i, int i2, boolean z) {
        C24362h.m61211f(lVar, "title");
        C24362h.m61211f(lVar2, MessageButton.TEXT);
        this.f55279a = lVar;
        this.f55280b = lVar2;
        this.f55281c = i;
        this.f55282d = i2;
        this.f55283e = z;
    }

    /* renamed from: a */
    public final C24236l<C21616ex, CharSequence> mo55567a() {
        return this.f55279a;
    }

    /* renamed from: b */
    public final C24236l<C21616ex, CharSequence> mo55568b() {
        return this.f55280b;
    }

    /* renamed from: c */
    public final int mo55569c() {
        return this.f55281c;
    }

    /* renamed from: d */
    public final int mo55570d() {
        return this.f55282d;
    }

    /* renamed from: e */
    public final boolean mo55571e() {
        return this.f55283e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21869jc)) {
            return false;
        }
        C21869jc jcVar = (C21869jc) obj;
        return C24362h.m61206a(this.f55279a, jcVar.f55279a) && C24362h.m61206a(this.f55280b, jcVar.f55280b) && this.f55281c == jcVar.f55281c && this.f55282d == jcVar.f55282d && this.f55283e == jcVar.f55283e;
    }

    public int hashCode() {
        C24236l<C21616ex, CharSequence> lVar = this.f55279a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C24236l<C21616ex, CharSequence> lVar2 = this.f55280b;
        if (lVar2 != null) {
            i = lVar2.hashCode();
        }
        int i2 = (((((hashCode + i) * 31) + this.f55281c) * 31) + this.f55282d) * 31;
        boolean z = this.f55283e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("InstructionGuideAssets(title=");
        k.append(this.f55279a);
        k.append(", text=");
        k.append(this.f55280b);
        k.append(", illustration=");
        k.append(this.f55281c);
        k.append(", illustrationEnd=");
        k.append(this.f55282d);
        k.append(", shouldAnimate=");
        return C25541a.m63885p(k, this.f55283e, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21869jc(C24236l lVar, C24236l lVar2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, i, (i3 & 8) != 0 ? i : i2, (i3 & 16) != 0 ? false : z);
    }
}
