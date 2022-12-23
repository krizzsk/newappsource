package com.moovit.payment.registration.steps.p420id;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import v40.C25754i;

/* renamed from: com.moovit.payment.registration.steps.id.PaymentAccountId */
public class PaymentAccountId implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountId> CREATOR = new C16371a();

    /* renamed from: d */
    public static final C16372b f42786d = new C16372b(PaymentAccountId.class);

    /* renamed from: b */
    public final String f42787b;

    /* renamed from: c */
    public final IdType f42788c;

    /* renamed from: com.moovit.payment.registration.steps.id.PaymentAccountId$IdType */
    public enum IdType {
        SSN(C25754i.payment_registration_enter_id_number_hint, C25754i.payment_registration_enter_id_id_ticker),
        PASSPORT(C25754i.payment_registration_enter_id_number_passport_hint, C25754i.payment_registration_enter_id_passport_ticker);
        
        public static final C19577c<IdType> CODER = null;
        public final int description;
        public final int shortDescription;

        /* access modifiers changed from: public */
        static {
            IdType idType;
            IdType idType2;
            CODER = new C19577c<>(IdType.class, idType, idType2);
        }

        private IdType(int i, int i2) {
            this.description = i;
            this.shortDescription = i2;
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.id.PaymentAccountId$a */
    public class C16371a implements Parcelable.Creator<PaymentAccountId> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountId) C19612n.m46981v(parcel, PaymentAccountId.f42786d);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountId[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.id.PaymentAccountId$b */
    public class C16372b extends C19619s<PaymentAccountId> {
        public C16372b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PaymentAccountId(pVar.mo51948t(), (IdType) IdType.CODER.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentAccountId paymentAccountId = (PaymentAccountId) obj;
            qVar.mo51955t(paymentAccountId.f42787b);
            IdType.CODER.write(paymentAccountId.f42788c, qVar);
        }
    }

    public PaymentAccountId(String str, IdType idType) {
        C21100e.m49373x(str, "id");
        this.f42787b = str;
        C21100e.m49373x(idType, "type");
        this.f42788c = idType;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42786d);
    }
}
