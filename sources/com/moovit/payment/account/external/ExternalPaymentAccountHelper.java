package com.moovit.payment.account.external;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.moovit.payment.account.model.PaymentAccountContextStatus;

public interface ExternalPaymentAccountHelper extends Parcelable {

    /* renamed from: com.moovit.payment.account.external.ExternalPaymentAccountHelper$a */
    public static class C25647a {

        /* renamed from: a */
        public final int f63972a;

        /* renamed from: b */
        public final Intent f63973b;

        public C25647a(int i, Intent intent) {
            this.f63972a = i;
            this.f63973b = intent;
        }
    }

    /* renamed from: M1 */
    boolean mo44688M1(PaymentAccountContextStatus paymentAccountContextStatus);

    /* renamed from: R */
    void mo44689R(Context context);

    /* renamed from: e */
    int mo44691e(PaymentAccountContextStatus paymentAccountContextStatus);

    int getIconResId();

    int getNameResId();

    /* renamed from: i1 */
    int mo44694i1(PaymentAccountContextStatus paymentAccountContextStatus);

    /* renamed from: u1 */
    C25647a mo44695u1(Context context, PaymentAccountContextStatus paymentAccountContextStatus);
}
