package com.moovit.view.p340cc;

import p241s0.C6302b;
import p977zz.C20944i0;

/* renamed from: com.moovit.view.cc.e */
public final class C7963e {

    /* renamed from: a */
    public static final C6302b f24109a;

    static {
        C6302b bVar = new C6302b(21);
        f24109a = bVar;
        C20944i0 p = C13555b.m33976p(bVar, new C20944i0("4", "4"), CreditCardConfig.VISA, "2221", "2720");
        CreditCardConfig creditCardConfig = CreditCardConfig.MASTERCARD;
        C20944i0 p2 = C13555b.m33976p(bVar, C13555b.m33976p(bVar, p, creditCardConfig, "51", "55"), creditCardConfig, "34", "34");
        CreditCardConfig creditCardConfig2 = CreditCardConfig.AMERICAN_EXPRESS;
        C20944i0 p3 = C13555b.m33976p(bVar, C13555b.m33976p(bVar, p2, creditCardConfig2, "37", "37"), creditCardConfig2, "300", "305");
        CreditCardConfig creditCardConfig3 = CreditCardConfig.DINERS_CLUB;
        C20944i0 p4 = C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, p3, creditCardConfig3, "309", "309"), creditCardConfig3, "36", "36"), creditCardConfig3, "38", "39"), creditCardConfig3, "6011", "6011");
        CreditCardConfig creditCardConfig4 = CreditCardConfig.DISCOVER;
        C20944i0 p5 = C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, p4, creditCardConfig4, "62", "62"), creditCardConfig4, "644", "649"), creditCardConfig4, "65", "65"), creditCardConfig4, "88", "88"), creditCardConfig4, "3528", "3589"), CreditCardConfig.JCB, "50", "50");
        CreditCardConfig creditCardConfig5 = CreditCardConfig.MAESTRO;
        bVar.put(C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, C13555b.m33976p(bVar, p5, creditCardConfig5, "56", "59"), creditCardConfig5, "61", "61"), creditCardConfig5, "63", "63"), creditCardConfig5, "66", "69"), creditCardConfig5, "62", "62"), CreditCardConfig.UNIONPAY);
    }

    /* renamed from: a */
    public static boolean m18150a(CharSequence charSequence) {
        int length = charSequence != null ? charSequence.length() : 0;
        return 3 <= length && length <= 4;
    }
}
