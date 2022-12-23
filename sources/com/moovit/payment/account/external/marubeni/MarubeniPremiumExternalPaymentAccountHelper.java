package com.moovit.payment.account.external.marubeni;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import v40.C25749d;
import v40.C25754i;

public class MarubeniPremiumExternalPaymentAccountHelper implements ExternalPaymentAccountHelper {
    public static final Parcelable.Creator<MarubeniPremiumExternalPaymentAccountHelper> CREATOR = new C25662a();

    /* renamed from: com.moovit.payment.account.external.marubeni.MarubeniPremiumExternalPaymentAccountHelper$a */
    public class C25662a implements Parcelable.Creator<MarubeniPremiumExternalPaymentAccountHelper> {
        public final Object createFromParcel(Parcel parcel) {
            return new MarubeniPremiumExternalPaymentAccountHelper();
        }

        public final Object[] newArray(int i) {
            return new MarubeniPremiumExternalPaymentAccountHelper[i];
        }
    }

    /* renamed from: M1 */
    public final boolean mo44688M1(PaymentAccountContextStatus paymentAccountContextStatus) {
        return PaymentAccountContextStatus.CONNECTED.equals(paymentAccountContextStatus);
    }

    /* renamed from: R */
    public final /* synthetic */ void mo44689R(Context context) {
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo44691e(PaymentAccountContextStatus paymentAccountContextStatus) {
        if (PaymentAccountContextStatus.BLACKLIST.equals(paymentAccountContextStatus)) {
            return C25749d.ic_alert_ring_16_critical;
        }
        return 0;
    }

    public final int getIconResId() {
        return C25749d.img_logo_marubeni_24;
    }

    public final int getNameResId() {
        return C25754i.payment_my_account_services_marubeni_payment;
    }

    /* renamed from: i1 */
    public final /* synthetic */ int mo44694i1(PaymentAccountContextStatus paymentAccountContextStatus) {
        return 0;
    }

    /* renamed from: u1 */
    public final ExternalPaymentAccountHelper.C25647a mo44695u1(Context context, PaymentAccountContextStatus paymentAccountContextStatus) {
        return new ExternalPaymentAccountHelper.C25647a(C25754i.payment_my_account_services_connected, (Intent) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
