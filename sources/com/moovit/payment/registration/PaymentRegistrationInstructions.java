package com.moovit.payment.registration;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.email.EmailInstructions;
import com.moovit.payment.registration.steps.external.ExternalAccountInstructions;
import com.moovit.payment.registration.steps.input.InputInstructions;
import com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep;
import com.moovit.payment.registration.steps.phone.PhoneInstructions;
import com.moovit.payment.registration.steps.profile.ProfilesInstructions;
import com.moovit.payment.registration.steps.question.QuestionInstructions;
import com.moovit.payment.registration.steps.reconnect.ReconnectInstructions;
import com.moovit.payment.registration.steps.terms.TermsOfUseInstructions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentRegistrationInstructions implements Parcelable {
    public static final Parcelable.Creator<PaymentRegistrationInstructions> CREATOR = new C16359a();

    /* renamed from: b */
    public final String f42758b;

    /* renamed from: c */
    public final List<PaymentRegistrationStep> f42759c;

    /* renamed from: d */
    public final CreditCardInstructions f42760d;

    /* renamed from: e */
    public final MotPaymentMethodInstructions f42761e;

    /* renamed from: f */
    public final TermsOfUseInstructions f42762f;

    /* renamed from: g */
    public final ProfilesInstructions f42763g;

    /* renamed from: h */
    public final ExternalAccountInstructions f42764h;

    /* renamed from: i */
    public final ReconnectInstructions f42765i;

    /* renamed from: j */
    public final PhoneInstructions f42766j;

    /* renamed from: k */
    public final EmailInstructions f42767k;

    /* renamed from: l */
    public final QuestionInstructions f42768l;

    /* renamed from: m */
    public final InputInstructions f42769m;

    /* renamed from: com.moovit.payment.registration.PaymentRegistrationInstructions$a */
    public class C16359a implements Parcelable.Creator<PaymentRegistrationInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentRegistrationInstructions(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentRegistrationInstructions[i];
        }
    }

    public PaymentRegistrationInstructions(String str, ArrayList arrayList, CreditCardInstructions creditCardInstructions, MotPaymentMethodInstructions motPaymentMethodInstructions, TermsOfUseInstructions termsOfUseInstructions, ProfilesInstructions profilesInstructions, ExternalAccountInstructions externalAccountInstructions, ReconnectInstructions reconnectInstructions, PhoneInstructions phoneInstructions, EmailInstructions emailInstructions, QuestionInstructions questionInstructions, InputInstructions inputInstructions) {
        C21100e.m49373x(str, "paymentContext");
        this.f42758b = str;
        this.f42759c = Collections.unmodifiableList(arrayList);
        this.f42760d = creditCardInstructions;
        this.f42761e = motPaymentMethodInstructions;
        this.f42762f = termsOfUseInstructions;
        this.f42763g = profilesInstructions;
        this.f42764h = externalAccountInstructions;
        this.f42765i = reconnectInstructions;
        this.f42766j = phoneInstructions;
        this.f42767k = emailInstructions;
        this.f42768l = questionInstructions;
        this.f42769m = inputInstructions;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42758b);
        parcel.writeTypedList(this.f42759c);
        parcel.writeParcelable(this.f42760d, i);
        parcel.writeParcelable(this.f42761e, i);
        parcel.writeParcelable(this.f42762f, i);
        parcel.writeParcelable(this.f42763g, i);
        parcel.writeParcelable(this.f42764h, i);
        parcel.writeParcelable(this.f42765i, i);
        parcel.writeParcelable(this.f42766j, i);
        parcel.writeParcelable(this.f42767k, i);
        parcel.writeParcelable(this.f42768l, i);
        parcel.writeParcelable(this.f42769m, i);
    }

    public PaymentRegistrationInstructions(Parcel parcel) {
        this.f42758b = parcel.readString();
        this.f42759c = parcel.createTypedArrayList(PaymentRegistrationStep.CREATOR);
        this.f42760d = (CreditCardInstructions) parcel.readParcelable(CreditCardInstructions.class.getClassLoader());
        this.f42761e = (MotPaymentMethodInstructions) parcel.readParcelable(MotPaymentMethodInstructions.class.getClassLoader());
        this.f42762f = (TermsOfUseInstructions) parcel.readParcelable(TermsOfUseInstructions.class.getClassLoader());
        this.f42763g = (ProfilesInstructions) parcel.readParcelable(ProfilesInstructions.class.getClassLoader());
        this.f42764h = (ExternalAccountInstructions) parcel.readParcelable(ExternalAccountInstructions.class.getClassLoader());
        this.f42765i = (ReconnectInstructions) parcel.readParcelable(ReconnectInstructions.class.getClassLoader());
        this.f42766j = (PhoneInstructions) parcel.readParcelable(PhoneInstructions.class.getClassLoader());
        this.f42767k = (EmailInstructions) parcel.readParcelable(EmailInstructions.class.getClassLoader());
        this.f42768l = (QuestionInstructions) parcel.readParcelable(QuestionInstructions.class.getClassLoader());
        this.f42769m = (InputInstructions) parcel.readParcelable(InputInstructions.class.getClassLoader());
    }
}
