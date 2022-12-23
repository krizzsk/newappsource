package com.moovit.app.carpool.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PassengerCredit implements Parcelable {
    public static final Parcelable.Creator<PassengerCredit> CREATOR = new C14817a();

    /* renamed from: e */
    public static final C14818b f37806e = new C14818b(PassengerCredit.class);

    /* renamed from: b */
    public CurrencyAmount f37807b;

    /* renamed from: c */
    public CurrencyAmount f37808c;

    /* renamed from: d */
    public long f37809d;

    /* renamed from: com.moovit.app.carpool.payment.PassengerCredit$a */
    public class C14817a implements Parcelable.Creator<PassengerCredit> {
        public final Object createFromParcel(Parcel parcel) {
            return (PassengerCredit) C19612n.m46981v(parcel, PassengerCredit.f37806e);
        }

        public final Object[] newArray(int i) {
            return new PassengerCredit[i];
        }
    }

    /* renamed from: com.moovit.app.carpool.payment.PassengerCredit$b */
    public class C14818b extends C19619s<PassengerCredit> {
        public C14818b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0 || i == 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            long j;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            pVar.getClass();
            CurrencyAmount currencyAmount = (CurrencyAmount) bVar.read(pVar);
            CurrencyAmount currencyAmount2 = (CurrencyAmount) bVar.read(pVar);
            if (i > 0) {
                j = pVar.mo51925m();
            } else {
                j = 0;
            }
            return new PassengerCredit(currencyAmount, currencyAmount2, j);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PassengerCredit passengerCredit = (PassengerCredit) obj;
            CurrencyAmount currencyAmount = passengerCredit.f37807b;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = passengerCredit.f37808c;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount2, qVar);
            qVar.mo51940m(passengerCredit.f37809d);
        }
    }

    public PassengerCredit(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, long j) {
        this.f37807b = currencyAmount;
        this.f37808c = currencyAmount2;
        this.f37809d = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37806e);
    }
}
