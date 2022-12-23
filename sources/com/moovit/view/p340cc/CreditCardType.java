package com.moovit.view.p340cc;

import android.os.Parcel;
import android.os.Parcelable;
import p622kz.C18161c;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

/* renamed from: com.moovit.view.cc.CreditCardType */
public enum CreditCardType implements Parcelable {
    VISA(C18161c.ic_credit_card_visa),
    MASTERCARD(C18161c.ic_credit_card_mastercard),
    AMERICAN_EXPRESS(C18161c.ic_credit_card_american_express),
    DINERS_CLUB(C18161c.ic_credit_card_diners_club),
    DISCOVER(C18161c.ic_credit_card_discover),
    JCB(C18161c.ic_credit_card_jcb),
    MAESTRO(C18161c.ic_credit_card_maestro),
    UNIONPAY(C18161c.ic_credit_card_unionpay),
    ISRACARD(C18161c.ic_credit_card_isracard),
    BANCONTACT(C18161c.ic_credit_card_bancontact),
    UNKNOWN(C18161c.ic_credit_card_unknown);
    
    public static C19577c<CreditCardType> CODER;
    public static final Parcelable.Creator<CreditCardType> CREATOR = null;
    public final int iconResId;

    /* renamed from: com.moovit.view.cc.CreditCardType$a */
    public class C7957a implements Parcelable.Creator<CreditCardType> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardType) C19612n.m46981v(parcel, CreditCardType.CODER);
        }

        public final Object[] newArray(int i) {
            return new CreditCardType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CreditCardType creditCardType;
        CreditCardType creditCardType2;
        CreditCardType creditCardType3;
        CreditCardType creditCardType4;
        CreditCardType creditCardType5;
        CreditCardType creditCardType6;
        CreditCardType creditCardType7;
        CreditCardType creditCardType8;
        CreditCardType creditCardType9;
        CreditCardType creditCardType10;
        CreditCardType creditCardType11;
        CREATOR = new C7957a();
        CODER = new C19577c<>(CreditCardType.class, creditCardType, creditCardType2, creditCardType3, creditCardType4, creditCardType5, creditCardType6, creditCardType7, creditCardType8, creditCardType11, creditCardType9, creditCardType10);
    }

    private CreditCardType(int i) {
        this.iconResId = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
