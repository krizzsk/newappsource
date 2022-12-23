package com.moovit.payment.account.external.accessibletaxi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import ce0.C21100e;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import v40.C25749d;
import v40.C25754i;

public class AccessibleTaxiExternalPaymentAccountHelper implements ExternalPaymentAccountHelper {
    public static final Parcelable.Creator<AccessibleTaxiExternalPaymentAccountHelper> CREATOR = new C25653a();

    /* renamed from: b */
    public final String f63994b;

    /* renamed from: com.moovit.payment.account.external.accessibletaxi.AccessibleTaxiExternalPaymentAccountHelper$a */
    public class C25653a implements Parcelable.Creator<AccessibleTaxiExternalPaymentAccountHelper> {
        public final Object createFromParcel(Parcel parcel) {
            return new AccessibleTaxiExternalPaymentAccountHelper(parcel);
        }

        public final Object[] newArray(int i) {
            return new AccessibleTaxiExternalPaymentAccountHelper[i];
        }
    }

    /* renamed from: com.moovit.payment.account.external.accessibletaxi.AccessibleTaxiExternalPaymentAccountHelper$b */
    public static /* synthetic */ class C25654b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63995a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.payment.account.model.PaymentAccountContextStatus[] r0 = com.moovit.payment.account.model.PaymentAccountContextStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63995a = r0
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f63995a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.BLACKLIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f63995a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f63995a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.INCOMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.external.accessibletaxi.AccessibleTaxiExternalPaymentAccountHelper.C25654b.<clinit>():void");
        }
    }

    public AccessibleTaxiExternalPaymentAccountHelper(String str) {
        C21100e.m49373x(str, "paymentContext");
        this.f63994b = str;
    }

    /* renamed from: M1 */
    public final /* synthetic */ boolean mo44688M1(PaymentAccountContextStatus paymentAccountContextStatus) {
        return true;
    }

    /* renamed from: R */
    public final void mo44689R(Context context) {
        Toast.makeText(context, C25754i.payment_accessible_vehicle_eligibility_success, 1).show();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo44691e(PaymentAccountContextStatus paymentAccountContextStatus) {
        if (PaymentAccountContextStatus.DISCONNECTED.equals(paymentAccountContextStatus)) {
            return C25749d.ic_alert_ring_16_critical;
        }
        return 0;
    }

    public final int getIconResId() {
        return C25749d.img_accessible_taxi_24;
    }

    public final int getNameResId() {
        return C25754i.payment_accesible_vehicle_title;
    }

    /* renamed from: i1 */
    public final /* synthetic */ int mo44694i1(PaymentAccountContextStatus paymentAccountContextStatus) {
        return 0;
    }

    /* renamed from: u1 */
    public final ExternalPaymentAccountHelper.C25647a mo44695u1(Context context, PaymentAccountContextStatus paymentAccountContextStatus) {
        int i;
        int i2;
        Intent intent;
        int i3 = C25654b.f63995a[paymentAccountContextStatus.ordinal()];
        Intent intent2 = null;
        if (i3 == 1) {
            i = C25754i.payment_accesible_vehicle_subtitle_eligability_success;
        } else if (i3 != 2) {
            if (i3 == 3) {
                i2 = C25754i.payment_accesible_vehicle_subtitle_eligability_fail;
                intent = PaymentRegistrationActivity.m41717A2(context, PaymentRegistrationType.PURCHASE, this.f63994b);
            } else if (i3 != 4) {
                i = 0;
            } else {
                i2 = C25754i.payment_accesible_vehicle_subtitle_check_eligability;
                intent = PaymentRegistrationActivity.m41717A2(context, PaymentRegistrationType.PURCHASE, this.f63994b);
            }
            intent2 = intent;
            i = i2;
        } else {
            i = C25754i.payment_my_account_services_blacklist_not_tappable;
        }
        return new ExternalPaymentAccountHelper.C25647a(i, intent2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63994b);
    }

    public AccessibleTaxiExternalPaymentAccountHelper(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentContext");
        this.f63994b = readString;
    }
}
