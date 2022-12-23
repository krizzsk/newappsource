package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/DisplayState;", "", "step", "Lcom/veriff/sdk/views/base/navigation/NavigationStep;", "language", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "(Lcom/veriff/sdk/views/base/navigation/NavigationStep;Lmobi/lab/veriff/util/LanguageCountryLocale;)V", "getLanguage", "()Lmobi/lab/veriff/util/LanguageCountryLocale;", "getStep", "()Lcom/veriff/sdk/views/base/navigation/NavigationStep;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oz */
public final class C22241oz {

    /* renamed from: a */
    private final C22250pd f56079a;

    /* renamed from: b */
    private final C24454g f56080b;

    public C22241oz(C22250pd pdVar, C24454g gVar) {
        C24362h.m61211f(pdVar, "step");
        C24362h.m61211f(gVar, "language");
        this.f56079a = pdVar;
        this.f56080b = gVar;
    }

    /* renamed from: a */
    public final C22250pd mo56173a() {
        return this.f56079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22241oz)) {
            return false;
        }
        C22241oz ozVar = (C22241oz) obj;
        return C24362h.m61206a(this.f56079a, ozVar.f56079a) && C24362h.m61206a(this.f56080b, ozVar.f56080b);
    }

    public int hashCode() {
        C22250pd pdVar = this.f56079a;
        int i = 0;
        int hashCode = (pdVar != null ? pdVar.hashCode() : 0) * 31;
        C24454g gVar = this.f56080b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("DisplayState(step=");
        k.append(this.f56079a);
        k.append(", language=");
        k.append(this.f56080b);
        k.append(")");
        return k.toString();
    }
}
