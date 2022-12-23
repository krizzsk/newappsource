package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CreditCard;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CreditCard {

    /* renamed from: a */
    public final String f8044a;

    /* renamed from: b */
    public final String f8045b;

    /* renamed from: c */
    public final String f8046c;

    /* renamed from: d */
    public final String f8047d;

    /* renamed from: e */
    public final CreditCardType f8048e;

    public CreditCard(String str, String str2, String str3, String str4, CreditCardType creditCardType) {
        C24362h.m61211f(str, "cardNumber");
        C24362h.m61211f(str2, "cardholderName");
        C24362h.m61211f(str3, "expiration");
        C24362h.m61211f(str4, "cvv");
        C24362h.m61211f(creditCardType, "type");
        this.f8044a = str;
        this.f8045b = str2;
        this.f8046c = str3;
        this.f8047d = str4;
        this.f8048e = creditCardType;
    }
}
