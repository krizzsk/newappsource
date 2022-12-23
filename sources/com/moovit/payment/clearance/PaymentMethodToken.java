package com.moovit.payment.clearance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodNoInfo;
import e50.C25719a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PaymentMethodToken implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new C16300a();

    /* renamed from: c */
    public static final C16301b f42597c = new C16301b(PaymentMethodToken.class);

    /* renamed from: b */
    public final String f42598b;

    /* renamed from: com.moovit.payment.clearance.PaymentMethodToken$a */
    public class C16300a implements Parcelable.Creator<PaymentMethodToken> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentMethodToken) C19612n.m46981v(parcel, PaymentMethodToken.f42597c);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodToken[i];
        }
    }

    /* renamed from: com.moovit.payment.clearance.PaymentMethodToken$b */
    public class C16301b extends C19619s<PaymentMethodToken> {
        public C16301b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PaymentMethodToken(pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((PaymentMethodToken) obj).f42598b);
        }
    }

    /* renamed from: com.moovit.payment.clearance.PaymentMethodToken$c */
    public interface C16302c<V, R> {
    }

    public PaymentMethodToken(String str) {
        C21100e.m49373x(str, FirebaseMessagingService.EXTRA_TOKEN);
        this.f42598b = str;
    }

    /* renamed from: b */
    public MVAddPaymentMethodInfo mo48853b(C16302c cVar) {
        ((C25719a) cVar).getClass();
        MVPaymentMethodNoInfo mVPaymentMethodNoInfo = new MVPaymentMethodNoInfo();
        MVAddPaymentMethodInfo mVAddPaymentMethodInfo = new MVAddPaymentMethodInfo();
        mVAddPaymentMethodInfo.setField_ = MVAddPaymentMethodInfo._Fields.NO_INFO;
        mVAddPaymentMethodInfo.value_ = mVPaymentMethodNoInfo;
        return mVAddPaymentMethodInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42597c);
    }
}
