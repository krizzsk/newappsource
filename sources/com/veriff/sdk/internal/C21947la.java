package com.veriff.sdk.internal;

import cf0.C21132f;
import com.appboy.models.InAppMessageImmersiveBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/DataObject;", "", "tag", "", "contents", "", "(I[B)V", "header", "Lcom/veriff/sdk/internal/nfc/DataObjectHeader;", "(Lcom/veriff/sdk/internal/nfc/DataObjectHeader;[B)V", "getContents", "()[B", "getHeader", "()Lcom/veriff/sdk/internal/nfc/DataObjectHeader;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toByteArray", "toString", "", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.la */
public final class C21947la {

    /* renamed from: a */
    public static final C21948a f55450a = new C21948a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C21949lb f55451b;

    /* renamed from: c */
    private final byte[] f55452c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/DataObject$Companion;", "", "()V", "readAll", "", "Lcom/veriff/sdk/internal/nfc/DataObject;", "input", "", "offset", "", "length", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.la$a */
    public static final class C21948a {
        private C21948a() {
        }

        public /* synthetic */ C21948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ List m53567a(C21948a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo55759a(bArr, i, i2);
        }

        /* renamed from: a */
        public final List<C21947la> mo55759a(byte[] bArr, int i, int i2) {
            C24362h.m61211f(bArr, "input");
            ArrayList arrayList = new ArrayList();
            while (i < i2) {
                C21949lb a = C21949lb.f55453a.mo55767a(bArr, i);
                int a2 = a.mo55760a() + i;
                arrayList.add(new C21947la(a.mo55762c(), C23816b.m58448d1(bArr, C17885a.m44393C0(a2, a.mo55763d() + a2))));
                i = a.mo55763d() + a2;
            }
            return arrayList;
        }
    }

    public C21947la(C21949lb lbVar, byte[] bArr) {
        C24362h.m61211f(lbVar, InAppMessageImmersiveBase.HEADER);
        C24362h.m61211f(bArr, "contents");
        this.f55451b = lbVar;
        this.f55452c = bArr;
    }

    /* renamed from: a */
    public final byte[] mo55753a() {
        if (this.f55452c.length <= 65535) {
            return C21132f.m49434Q0(this.f55451b.mo55761b(), this.f55452c);
        }
        throw new IllegalStateException("Content too large for TLV DO");
    }

    /* renamed from: b */
    public final C21949lb mo55754b() {
        return this.f55451b;
    }

    /* renamed from: c */
    public final byte[] mo55755c() {
        return this.f55452c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21947la)) {
            return false;
        }
        C21947la laVar = (C21947la) obj;
        return C24362h.m61206a(this.f55451b, laVar.f55451b) && C24362h.m61206a(this.f55452c, laVar.f55452c);
    }

    public int hashCode() {
        C21949lb lbVar = this.f55451b;
        int i = 0;
        int hashCode = (lbVar != null ? lbVar.hashCode() : 0) * 31;
        byte[] bArr = this.f55452c;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode + i;
    }

    public String toString() {
        return C13555b.m33971j(new Object[]{Integer.valueOf(this.f55451b.mo55762c()), C21941kx.m53557f(this.f55452c)}, 2, "DO(tag=%02x contents=[%s])", "java.lang.String.format(this, *args)");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21947la(int i, byte[] bArr) {
        this(new C21949lb(i, bArr.length), bArr);
        C24362h.m61211f(bArr, "contents");
    }
}
