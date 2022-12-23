package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21947la;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u0000 \u00172\u00020\u0001:\u0003\u0015\u0016\u0017B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/AtrInfo;", "", "capabilities", "Lcom/veriff/sdk/internal/nfc/AtrInfo$Capabilities;", "bufferSpec", "Lcom/veriff/sdk/internal/nfc/AtrInfo$BufferSpec;", "(Lcom/veriff/sdk/internal/nfc/AtrInfo$Capabilities;Lcom/veriff/sdk/internal/nfc/AtrInfo$BufferSpec;)V", "getBufferSpec", "()Lcom/veriff/sdk/internal/nfc/AtrInfo$BufferSpec;", "getCapabilities", "()Lcom/veriff/sdk/internal/nfc/AtrInfo$Capabilities;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BufferSpec", "Capabilities", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kq */
public final class C21931kq {

    /* renamed from: a */
    public static final C21934c f55435a = new C21934c((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C21933b f55436b;

    /* renamed from: c */
    private final C21932a f55437c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/AtrInfo$BufferSpec;", "", "maxApduSize", "", "maxRapduSize", "(II)V", "getMaxApduSize", "()I", "getMaxRapduSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kq$a */
    public static final class C21932a {

        /* renamed from: a */
        private final int f55438a;

        /* renamed from: b */
        private final int f55439b;

        public C21932a(int i, int i2) {
            this.f55438a = i;
            this.f55439b = i2;
        }

        /* renamed from: a */
        public final int mo55739a() {
            return this.f55439b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21932a)) {
                return false;
            }
            C21932a aVar = (C21932a) obj;
            return this.f55438a == aVar.f55438a && this.f55439b == aVar.f55439b;
        }

        public int hashCode() {
            return (this.f55438a * 31) + this.f55439b;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("BufferSpec(maxApduSize=");
            k.append(this.f55438a);
            k.append(", maxRapduSize=");
            return C13437d.m33707l(k, this.f55439b, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/AtrInfo$Capabilities;", "", "selectionMethod", "", "codingMethod", "misc", "(BBB)V", "getCodingMethod", "()B", "getMisc", "getSelectionMethod", "supportsExtendedLcLe", "", "getSupportsExtendedLcLe", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kq$b */
    public static final class C21933b {

        /* renamed from: a */
        private final boolean f55440a;

        /* renamed from: b */
        private final byte f55441b;

        /* renamed from: c */
        private final byte f55442c;

        /* renamed from: d */
        private final byte f55443d;

        public C21933b(byte b, byte b2, byte b3) {
            boolean z;
            this.f55441b = b;
            this.f55442c = b2;
            this.f55443d = b3;
            if ((b3 & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f55440a = z;
        }

        /* renamed from: a */
        public final boolean mo55743a() {
            return this.f55440a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21933b)) {
                return false;
            }
            C21933b bVar = (C21933b) obj;
            return this.f55441b == bVar.f55441b && this.f55442c == bVar.f55442c && this.f55443d == bVar.f55443d;
        }

        public int hashCode() {
            return (((this.f55441b * 31) + this.f55442c) * 31) + this.f55443d;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Capabilities(selectionMethod=");
            k.append(this.f55441b);
            k.append(", codingMethod=");
            k.append(this.f55442c);
            k.append(", misc=");
            return C13437d.m33707l(k, this.f55443d, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/AtrInfo$Companion;", "", "()V", "parse", "Lcom/veriff/sdk/internal/nfc/AtrInfo;", "input", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kq$c */
    public static final class C21934c {
        private C21934c() {
        }

        public /* synthetic */ C21934c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21931kq mo55747a(byte[] bArr) {
            C24362h.m61211f(bArr, "input");
            C21933b bVar = null;
            C21932a aVar = null;
            for (C21947la laVar : C21947la.C21948a.m53567a(C21947la.f55450a, bArr, 0, 0, 6, (Object) null)) {
                if (laVar.mo55754b().mo55762c() == 71) {
                    if (laVar.mo55755c().length >= 3) {
                        bVar = new C21933b(laVar.mo55755c()[0], laVar.mo55755c()[1], laVar.mo55755c()[2]);
                    }
                } else if (laVar.mo55754b().mo55762c() == 32614) {
                    List a = C21947la.C21948a.m53567a(C21947la.f55450a, laVar.mo55755c(), 0, 0, 6, (Object) null);
                    if (a.size() == 2) {
                        aVar = new C21932a(C21935kr.m53532b(((C21947la) a.get(0)).mo55755c()), C21935kr.m53532b(((C21947la) a.get(1)).mo55755c()));
                    }
                }
            }
            return new C21931kq(bVar, aVar);
        }
    }

    public C21931kq(C21933b bVar, C21932a aVar) {
        this.f55436b = bVar;
        this.f55437c = aVar;
    }

    /* renamed from: a */
    public final C21933b mo55734a() {
        return this.f55436b;
    }

    /* renamed from: b */
    public final C21932a mo55735b() {
        return this.f55437c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21931kq)) {
            return false;
        }
        C21931kq kqVar = (C21931kq) obj;
        return C24362h.m61206a(this.f55436b, kqVar.f55436b) && C24362h.m61206a(this.f55437c, kqVar.f55437c);
    }

    public int hashCode() {
        C21933b bVar = this.f55436b;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C21932a aVar = this.f55437c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AtrInfo(capabilities=");
        k.append(this.f55436b);
        k.append(", bufferSpec=");
        k.append(this.f55437c);
        k.append(")");
        return k.toString();
    }
}
