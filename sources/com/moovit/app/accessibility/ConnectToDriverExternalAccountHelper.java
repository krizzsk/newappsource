package com.moovit.app.accessibility;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.tranzmate.R;

public class ConnectToDriverExternalAccountHelper implements ExternalPaymentAccountHelper {
    public static final Parcelable.Creator<ConnectToDriverExternalAccountHelper> CREATOR = new C14715a();

    /* renamed from: b */
    public final String f37417b;

    /* renamed from: com.moovit.app.accessibility.ConnectToDriverExternalAccountHelper$a */
    public class C14715a implements Parcelable.Creator<ConnectToDriverExternalAccountHelper> {
        public final Object createFromParcel(Parcel parcel) {
            return new ConnectToDriverExternalAccountHelper(parcel);
        }

        public final Object[] newArray(int i) {
            return new ConnectToDriverExternalAccountHelper[i];
        }
    }

    /* renamed from: com.moovit.app.accessibility.ConnectToDriverExternalAccountHelper$b */
    public static /* synthetic */ class C14716b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37418a;

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
                f37418a = r0
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37418a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.BLACKLIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.payment.account.model.PaymentAccountContextStatus r1 = com.moovit.payment.account.model.PaymentAccountContextStatus.INCOMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.accessibility.ConnectToDriverExternalAccountHelper.C14716b.<clinit>():void");
        }
    }

    public ConnectToDriverExternalAccountHelper(String str) {
        C21100e.m49373x(str, "paymentContext");
        this.f37417b = str;
    }

    /* renamed from: M1 */
    public final /* synthetic */ boolean mo44688M1(PaymentAccountContextStatus paymentAccountContextStatus) {
        return true;
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
            return R.drawable.ic_alert_ring_16_critical;
        }
        return 0;
    }

    public final int getIconResId() {
        return R.drawable.ic_bus_accessible_notify_24_on_sutface_emphasis_high;
    }

    public final int getNameResId() {
        return R.string.settings_accessibility_notify_driver_title;
    }

    /* renamed from: i1 */
    public final int mo44694i1(PaymentAccountContextStatus paymentAccountContextStatus) {
        int i = C14716b.f37418a[paymentAccountContextStatus.ordinal()];
        if (i == 3 || i == 4) {
            return R.string.voiceover_settings_accessibility_notify_driver_title;
        }
        return 0;
    }

    /* renamed from: u1 */
    public final ExternalPaymentAccountHelper.C25647a mo44695u1(Context context, PaymentAccountContextStatus paymentAccountContextStatus) {
        int i;
        int i2 = C14716b.f37418a[paymentAccountContextStatus.ordinal()];
        Intent intent = null;
        if (i2 == 1) {
            i = R.string.payment_my_account_services_connected;
        } else if (i2 == 2) {
            i = R.string.payment_my_account_services_blacklist_not_tappable;
        } else if (i2 == 3 || i2 == 4) {
            intent = PaymentRegistrationActivity.m41717A2(context, PaymentRegistrationType.REGISTRATION, this.f37417b);
            i = R.string.payment_my_account_services_join;
        } else {
            i = 0;
        }
        return new ExternalPaymentAccountHelper.C25647a(i, intent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37417b);
    }

    public ConnectToDriverExternalAccountHelper(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "paymentContext");
        this.f37417b = readString;
    }
}
