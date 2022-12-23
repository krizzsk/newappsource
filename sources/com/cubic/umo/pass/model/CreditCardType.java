package com.cubic.umo.pass.model;

import java.util.regex.Pattern;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CreditCardType;", "", "", "regExPattern", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "VISA", "MASTERCARD", "AMEX", "DISCOVER", "JCB", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public enum CreditCardType {
    VISA("^4(?:\\d{12}|\\d{15}|\\d{18})"),
    MASTERCARD("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$"),
    AMEX("^3[47][0-9]{13}$"),
    DISCOVER("^6((?:011|4[4-9][0-9]|5[0-9]{2})[0-9]{12,15}$)|(^6(?:2212[6-9]|221[3-9][0-9]|22[2-8][0-9]{2}|229[0-1][0-9]|2292[0-5])[0-9]{10,13}$)"),
    JCB("^35(?:[2][8-9]|[3-8][0-9])\\d{12,15}$");
    
    public static final C2249a Companion = null;
    /* access modifiers changed from: private */
    public final String regExPattern;

    /* renamed from: com.cubic.umo.pass.model.CreditCardType$a */
    public static final class C2249a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C2249a();
    }

    private CreditCardType(String str) {
        this.regExPattern = str;
    }

    public static final CreditCardType getCardNumberType(String str) {
        Companion.getClass();
        C24362h.m61211f(str, "creditCardNumber");
        CreditCardType[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            CreditCardType creditCardType = values[i];
            i++;
            if (Pattern.matches(creditCardType.regExPattern, str)) {
                return creditCardType;
            }
        }
        return null;
    }
}
