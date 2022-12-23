package com.moovit.view.p340cc;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mf0.C24361g;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

/* renamed from: com.moovit.view.cc.CreditCardConfig */
enum CreditCardConfig implements Parcelable {
    VISA(CreditCardType.VISA, 16, 16, 3, 4, 8, 12),
    MASTERCARD(CreditCardType.MASTERCARD, 16, 16, 3, 4, 8, 12),
    AMERICAN_EXPRESS(CreditCardType.AMERICAN_EXPRESS, 15, 15, 4, 4, 10),
    DINERS_CLUB(CreditCardType.DINERS_CLUB, 14, 14, 3, 4, 10),
    DISCOVER(CreditCardType.DISCOVER, 16, 16, 3, 4, 8, 12),
    JCB(CreditCardType.JCB, 16, 16, 3, 4, 8, 12),
    MAESTRO(CreditCardType.MAESTRO, 12, 16, 3, 4, 8, 12),
    UNIONPAY(CreditCardType.UNIONPAY, 16, 19, 3, 4, 8, 12),
    ISRACARD(CreditCardType.ISRACARD, 8, 9, 3, new Integer[0]),
    UNKNOWN(CreditCardType.UNKNOWN, -1, -1, -1, new Integer[0]);
    
    public static C19577c<CreditCardConfig> CODER;
    public static final Parcelable.Creator<CreditCardConfig> CREATOR = null;
    public final Set<Integer> cardNumberSpacingPattern;
    public final int cvvLength;
    public final int maxCardLength;
    public final int minCardLength;
    public final CreditCardType type;

    /* renamed from: com.moovit.view.cc.CreditCardConfig$a */
    public class C7941a implements Parcelable.Creator<CreditCardConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardConfig) C19612n.m46981v(parcel, CreditCardConfig.CODER);
        }

        public final Object[] newArray(int i) {
            return new CreditCardConfig[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CreditCardConfig creditCardConfig;
        CreditCardConfig creditCardConfig2;
        CreditCardConfig creditCardConfig3;
        CreditCardConfig creditCardConfig4;
        CreditCardConfig creditCardConfig5;
        CreditCardConfig creditCardConfig6;
        CreditCardConfig creditCardConfig7;
        CreditCardConfig creditCardConfig8;
        CreditCardConfig creditCardConfig9;
        CreditCardConfig creditCardConfig10;
        CREATOR = new C7941a();
        CODER = new C19577c<>(CreditCardConfig.class, creditCardConfig, creditCardConfig2, creditCardConfig3, creditCardConfig4, creditCardConfig5, creditCardConfig6, creditCardConfig7, creditCardConfig8, creditCardConfig10, creditCardConfig9);
    }

    private CreditCardConfig(CreditCardType creditCardType, int i, int i2, int i3, Integer... numArr) {
        Set<Integer> set;
        C21100e.m49373x(creditCardType, "type");
        this.type = creditCardType;
        this.minCardLength = i;
        this.maxCardLength = i2;
        this.cvvLength = i3;
        if (C24361g.m61154X(numArr)) {
            set = Collections.emptySet();
        } else {
            set = Collections.unmodifiableSet(new HashSet(Arrays.asList(numArr)));
        }
        this.cardNumberSpacingPattern = set;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
