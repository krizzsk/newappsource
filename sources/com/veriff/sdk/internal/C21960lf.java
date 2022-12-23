package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;
import p358af.C13437d;
import rf0.C24805g;
import rf0.C24806h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrzInfo;", "", "documentNumber", "", "dateOfBirth", "dateOfExpiry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getDateOfExpiry", "getDocumentNumber", "component1", "component2", "component3", "copy", "createMrzLine", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lf */
public final class C21960lf {

    /* renamed from: a */
    private final String f55473a;

    /* renamed from: b */
    private final String f55474b;

    /* renamed from: c */
    private final String f55475c;

    public C21960lf(String str, String str2, String str3) {
        C13437d.m33711q(str, "documentNumber", str2, "dateOfBirth", str3, "dateOfExpiry");
        this.f55473a = str;
        this.f55474b = str2;
        this.f55475c = str3;
    }

    /* renamed from: a */
    public final String mo55783a() {
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder();
        String str = this.f55473a;
        C24362h.m61211f(str, "<this>");
        if (9 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(9);
            sb2.append(str);
            C24805g p = new C24806h(1, 9 - str.length()).iterator();
            while (p.f62733d) {
                p.nextInt();
                sb2.append('<');
            }
            charSequence = sb2;
        }
        String obj = charSequence.toString();
        sb.append(obj);
        sb.append(C21961lg.m53586a(obj));
        sb.append(this.f55474b);
        sb.append(C21961lg.m53586a(this.f55474b));
        sb.append(this.f55475c);
        sb.append(C21961lg.m53586a(this.f55475c));
        String sb3 = sb.toString();
        C24362h.m61210e(sb3, "StringBuilder().apply {\n…git)\n        }.toString()");
        return sb3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21960lf)) {
            return false;
        }
        C21960lf lfVar = (C21960lf) obj;
        return C24362h.m61206a(this.f55473a, lfVar.f55473a) && C24362h.m61206a(this.f55474b, lfVar.f55474b) && C24362h.m61206a(this.f55475c, lfVar.f55475c);
    }

    public int hashCode() {
        String str = this.f55473a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55474b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55475c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("MrzInfo(documentNumber=");
        k.append(this.f55473a);
        k.append(", dateOfBirth=");
        k.append(this.f55474b);
        k.append(", dateOfExpiry=");
        return C0016g.m31o(k, this.f55475c, ")");
    }
}
