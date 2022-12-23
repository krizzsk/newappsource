package com.moovit.payment.invoices.model;

import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

public final class Invoice {

    /* renamed from: a */
    public final CurrencyAmount f42734a;

    /* renamed from: b */
    public final String f42735b;

    /* renamed from: c */
    public final InvoicePeriod f42736c;

    /* renamed from: d */
    public final Status f42737d;

    /* renamed from: e */
    public final long f42738e;

    public enum Status {
        NOT_PROCESSED,
        PENDING_APPROVAL,
        APPROVED,
        CANCELLED,
        REJECTED
    }

    public Invoice(CurrencyAmount currencyAmount, String str, InvoicePeriod invoicePeriod, Status status, long j) {
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f42734a = currencyAmount;
        C21100e.m49373x(str, "documentUrl");
        this.f42735b = str;
        C21100e.m49373x(invoicePeriod, "period");
        this.f42736c = invoicePeriod;
        C21100e.m49373x(status, ServerParameters.STATUS);
        this.f42737d = status;
        this.f42738e = j;
    }
}
