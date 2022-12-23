package com.moovit.ticketing.purchase;

import android.os.Parcelable;
import ce0.C21100e;
import p583jk.C17884p;

public abstract class PurchaseStep implements Parcelable {

    /* renamed from: b */
    public final String f23246b;

    /* renamed from: c */
    public final String f23247c;

    /* renamed from: d */
    public final String f23248d;

    /* renamed from: com.moovit.ticketing.purchase.PurchaseStep$a */
    public interface C7645a {
    }

    public PurchaseStep(String str, String str2, String str3) {
        C21100e.m49373x(str, "contextId");
        this.f23246b = str;
        C21100e.m49373x(str2, "analyticKey");
        this.f23247c = str2;
        this.f23248d = str3;
    }

    /* renamed from: b */
    public abstract void mo24015b(C7645a aVar, String str);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseStep)) {
            return false;
        }
        PurchaseStep purchaseStep = (PurchaseStep) obj;
        if (getClass() != purchaseStep.getClass()) {
            return false;
        }
        return this.f23246b.equals(purchaseStep.f23246b);
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(getClass()), C17884p.m44335F(this.f23246b));
    }
}
