package com.moovit.payment.registration.steps.p419cc;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.registration.steps.p420id.C16373a;
import java.util.Arrays;
import java.util.List;
import k60.C17999a;
import k60.C18000b;
import k60.C18002c;
import k60.C18005d;
import k60.C18007e;
import k60.C18010f;
import l60.C18176a;
import m60.C18344c;
import n60.C18532c;
import o60.C18719a;
import p60.C18884b;
import q60.C19093d;
import r60.C19229a;
import r60.C19243h;
import s60.C19435b;
import u60.C19876a;
import v60.C20102a;
import w60.C20287b;
import x60.C20451a;

/* renamed from: com.moovit.payment.registration.steps.cc.PaymentRegistrationStep */
public enum PaymentRegistrationStep implements Parcelable {
    TERMS_OF_USE(C20287b.class),
    PHONE(C19229a.class, C19243h.class),
    NAME(C18007e.class),
    EMAIL(C18002c.class),
    BIRTH_DATE(C18000b.class),
    ID(C16373a.class),
    ID_VERIFICATION(C18005d.class),
    CREDIT_CARD(C18344c.class),
    MOT_PAYMENT_METHOD(C19093d.class),
    PROFILE(C19435b.class),
    EXTERNAL_ACCOUNT(C18719a.class),
    RECONNECT(C20102a.class, C19243h.class),
    VERIFF(C18010f.class),
    ADDRESS(C18176a.class),
    EMAIL_VERIFICATION(C18532c.class, C19243h.class),
    WEB(C20451a.class),
    QUESTION(C19876a.class),
    INPUT(C18884b.class);
    
    public static final Parcelable.Creator<PaymentRegistrationStep> CREATOR = null;
    public final List<Class<? extends C17999a>> fragmentClasses;

    /* renamed from: com.moovit.payment.registration.steps.cc.PaymentRegistrationStep$a */
    public class C16365a implements Parcelable.Creator<PaymentRegistrationStep> {
        public final Object createFromParcel(Parcel parcel) {
            return PaymentRegistrationStep.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new PaymentRegistrationStep[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C16365a();
    }

    @SafeVarargs
    private PaymentRegistrationStep(Class<? extends C17999a>... clsArr) {
        this.fragmentClasses = Arrays.asList(clsArr);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
