package com.moovit.view.p340cc;

import ce0.C21100e;
import com.moovit.view.address.Address;

/* renamed from: com.moovit.view.cc.a */
public final class C7959a {

    /* renamed from: a */
    public final CreditCardType f24092a;

    /* renamed from: b */
    public final String f24093b;

    /* renamed from: c */
    public final String f24094c;

    /* renamed from: d */
    public final String f24095d;

    /* renamed from: e */
    public final String f24096e;

    /* renamed from: f */
    public final String f24097f;

    /* renamed from: g */
    public final String f24098g;

    /* renamed from: h */
    public final String f24099h;

    /* renamed from: i */
    public final String f24100i;

    /* renamed from: j */
    public final Address f24101j;

    public C7959a(CreditCardType creditCardType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Address address) {
        C21100e.m49373x(creditCardType, "type");
        this.f24092a = creditCardType;
        C21100e.m49373x(str, "number");
        this.f24093b = str;
        C21100e.m49373x(str2, "expirationMonth");
        this.f24094c = str2;
        C21100e.m49373x(str3, "expirationYear");
        this.f24095d = str3;
        C21100e.m49373x(str4, "cvv");
        this.f24096e = str4;
        C21100e.m49373x(str5, "cardHolderName");
        this.f24097f = str5;
        this.f24098g = str6;
        this.f24099h = str7;
        this.f24100i = str8;
        this.f24101j = address;
    }

    /* renamed from: a */
    public final String mo24845a() {
        int length = this.f24093b.length();
        if (length <= 4) {
            return this.f24093b;
        }
        return this.f24093b.substring(length - 4, length);
    }
}
