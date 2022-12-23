package com.vungle.warren;

import com.vungle.warren.model.admarkup.AdMarkup;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public final class AdRequest implements Serializable {
    private final long adCount;
    private final AdMarkup adMarkup;
    private final boolean isExplicit;
    private final String placementId;
    public AtomicLong timeStamp = new AtomicLong(0);
    private final int type;

    public AdRequest(String str, int i, long j, boolean z) {
        this.placementId = str;
        this.adMarkup = null;
        this.type = i;
        this.adCount = j;
        this.isExplicit = z;
    }

    /* renamed from: a */
    public final long mo58035a() {
        return this.adCount;
    }

    /* renamed from: b */
    public final AdMarkup mo58036b() {
        return this.adMarkup;
    }

    /* renamed from: c */
    public final String mo58037c() {
        AdMarkup adMarkup2 = this.adMarkup;
        if (adMarkup2 == null) {
            return null;
        }
        return adMarkup2.mo58243a();
    }

    /* renamed from: d */
    public final String[] mo58038d() {
        AdMarkup adMarkup2 = this.adMarkup;
        if (adMarkup2 != null) {
            return adMarkup2.impressions;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo58039e() {
        return this.isExplicit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (this.type != adRequest.type || !this.placementId.equals(adRequest.placementId)) {
            return false;
        }
        AdMarkup adMarkup2 = this.adMarkup;
        AdMarkup adMarkup3 = adRequest.adMarkup;
        if (adMarkup2 != null) {
            return adMarkup2.equals(adMarkup3);
        }
        if (adMarkup3 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo58041f() {
        return this.placementId;
    }

    /* renamed from: g */
    public final int mo58042g() {
        return this.type;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.placementId.hashCode() * 31;
        AdMarkup adMarkup2 = this.adMarkup;
        if (adMarkup2 != null) {
            i = adMarkup2.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.type;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AdRequest{placementId='");
        C25541a.m63890u(k, this.placementId, '\'', ", adMarkup=");
        k.append(this.adMarkup);
        k.append(", type=");
        k.append(this.type);
        k.append(", adCount=");
        k.append(this.adCount);
        k.append(", isExplicit=");
        return C13715c.m34247m(k, this.isExplicit, '}');
    }

    public AdRequest(String str, AdMarkup adMarkup2, boolean z) {
        this.placementId = str;
        this.adMarkup = adMarkup2;
        this.type = 0;
        this.adCount = 1;
        this.isExplicit = z;
    }
}
