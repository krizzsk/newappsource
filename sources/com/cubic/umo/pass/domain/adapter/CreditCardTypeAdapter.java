package com.cubic.umo.pass.domain.adapter;

import android.text.TextUtils;
import com.cubic.umo.pass.model.CreditCardType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import nb0.C12942f;
import nb0.C12948l;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/cubic/umo/pass/domain/adapter/CreditCardTypeAdapter;", "", "()V", "fromJson", "Lcom/cubic/umo/pass/model/CreditCardType;", "creditCardType", "", "toJson", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class CreditCardTypeAdapter {

    /* renamed from: com.cubic.umo.pass.domain.adapter.CreditCardTypeAdapter$a */
    public /* synthetic */ class C2241a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7835a;

        static {
            int[] iArr = new int[CreditCardType.values().length];
            iArr[CreditCardType.VISA.ordinal()] = 1;
            iArr[CreditCardType.MASTERCARD.ordinal()] = 2;
            iArr[CreditCardType.JCB.ordinal()] = 3;
            iArr[CreditCardType.AMEX.ordinal()] = 4;
            iArr[CreditCardType.DISCOVER.ordinal()] = 5;
            f7835a = iArr;
        }
    }

    @C12942f
    public final CreditCardType fromJson(String str) {
        if (TextUtils.equals(str, "visa")) {
            return CreditCardType.VISA;
        }
        if (TextUtils.equals(str, "mastercard")) {
            return CreditCardType.MASTERCARD;
        }
        if (TextUtils.equals(str, "discover")) {
            return CreditCardType.DISCOVER;
        }
        if (TextUtils.equals(str, "american_express")) {
            return CreditCardType.AMEX;
        }
        if (TextUtils.equals(str, "jcb")) {
            return CreditCardType.JCB;
        }
        return null;
    }

    @C12948l
    public final String toJson(CreditCardType creditCardType) {
        if (creditCardType == null) {
            return null;
        }
        int i = C2241a.f7835a[creditCardType.ordinal()];
        if (i == 1) {
            return "visa";
        }
        if (i == 2) {
            return "mastercard";
        }
        if (i == 3) {
            return "jcb";
        }
        if (i == 4) {
            return "american_express";
        }
        if (i == 5) {
            return "discover";
        }
        throw new NoWhenBranchMatchedException();
    }
}
