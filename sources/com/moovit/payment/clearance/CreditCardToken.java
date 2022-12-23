package com.moovit.payment.clearance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.view.p340cc.CreditCardPreview;
import com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodCardInfo;
import e50.C25719a;
import h60.C17353s0;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

public class CreditCardToken extends PaymentMethodToken {
    public static final Parcelable.Creator<CreditCardToken> CREATOR = new C16298a();

    /* renamed from: e */
    public static final C16299b f42595e = new C16299b(CreditCardToken.class);

    /* renamed from: d */
    public final CreditCardPreview f42596d;

    /* renamed from: com.moovit.payment.clearance.CreditCardToken$a */
    public class C16298a implements Parcelable.Creator<CreditCardToken> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardToken) C19612n.m46981v(parcel, CreditCardToken.f42595e);
        }

        public final Object[] newArray(int i) {
            return new CreditCardToken[i];
        }
    }

    /* renamed from: com.moovit.payment.clearance.CreditCardToken$b */
    public class C16299b extends C19619s<CreditCardToken> {
        public C16299b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CreditCardToken(pVar.mo51947p(), (CreditCardPreview) CreditCardPreview.f24081f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardToken creditCardToken = (CreditCardToken) obj;
            qVar.mo51954p(creditCardToken.f42598b);
            CreditCardPreview creditCardPreview = creditCardToken.f42596d;
            CreditCardPreview.C7956b bVar = CreditCardPreview.f24081f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(creditCardPreview, qVar);
        }
    }

    public CreditCardToken(String str, CreditCardPreview creditCardPreview) {
        super(str);
        C21100e.m49373x(creditCardPreview, "preview");
        this.f42596d = creditCardPreview;
    }

    /* renamed from: b */
    public final MVAddPaymentMethodInfo mo48853b(PaymentMethodToken.C16302c cVar) {
        ((C25719a) cVar).getClass();
        CreditCardPreview creditCardPreview = this.f42596d;
        C19617r rVar = C17353s0.f44739a;
        String str = creditCardPreview.f24083c;
        MVPaymentMethodCardInfo mVPaymentMethodCardInfo = new MVPaymentMethodCardInfo();
        mVPaymentMethodCardInfo.lastDigits = str;
        mVPaymentMethodCardInfo.cardType = C17353s0.m43404r(creditCardPreview.f24082b);
        mVPaymentMethodCardInfo.cardMonthExpiration = creditCardPreview.f24084d;
        mVPaymentMethodCardInfo.cardYearExpiration = creditCardPreview.f24085e;
        MVAddPaymentMethodInfo mVAddPaymentMethodInfo = new MVAddPaymentMethodInfo();
        mVAddPaymentMethodInfo.setField_ = MVAddPaymentMethodInfo._Fields.CARD_PREVIEW;
        mVAddPaymentMethodInfo.value_ = mVPaymentMethodCardInfo;
        return mVAddPaymentMethodInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42595e);
    }
}
