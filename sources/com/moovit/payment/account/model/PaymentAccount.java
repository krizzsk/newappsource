package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.payment.account.model.PersonalDetails;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.settings.PaymentAccountSettings;
import d50.C25717a;
import h60.C17353s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p899ws.C20401a;

public class PaymentAccount implements Parcelable {
    public static final Parcelable.Creator<PaymentAccount> CREATOR = new C25672a();

    /* renamed from: k */
    public static final C25673b f64012k = new C25673b(PaymentAccount.class);

    /* renamed from: b */
    public final String f64013b;

    /* renamed from: c */
    public final List<PaymentAccountContext> f64014c;

    /* renamed from: d */
    public final PersonalDetails f64015d;

    /* renamed from: e */
    public final List<PaymentMethod> f64016e;

    /* renamed from: f */
    public final List<PaymentAccountProfile> f64017f;

    /* renamed from: g */
    public final List<PaymentAccountCertificatePreview> f64018g;

    /* renamed from: h */
    public final PaymentAccountBadgeType f64019h;

    /* renamed from: i */
    public final PaymentAccountSettings f64020i;

    /* renamed from: j */
    public final List<C25717a> f64021j;

    /* renamed from: com.moovit.payment.account.model.PaymentAccount$a */
    public class C25672a implements Parcelable.Creator<PaymentAccount> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccount) C19612n.m46981v(parcel, PaymentAccount.f64012k);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccount[i];
        }
    }

    /* renamed from: com.moovit.payment.account.model.PaymentAccount$b */
    public class C25673b extends C19619s<PaymentAccount> {
        public C25673b(Class cls) {
            super(4, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 4;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PaymentAccountBadgeType paymentAccountBadgeType;
            List list;
            PaymentAccountSettings paymentAccountSettings;
            List list2;
            String p = pVar.mo51947p();
            ArrayList g = pVar.mo51959g(PaymentAccountContext.f64029d);
            PersonalDetails personalDetails = (PersonalDetails) PersonalDetails.f64037i.read(pVar);
            ArrayList g2 = pVar.mo51959g(C17353s0.f44739a);
            ArrayList g3 = pVar.mo51959g(PaymentAccountProfile.f64032f);
            if (i >= 1) {
                paymentAccountBadgeType = (PaymentAccountBadgeType) pVar.mo51962q(PaymentAccountBadgeType.CODER);
            } else {
                paymentAccountBadgeType = null;
            }
            if (i >= 2) {
                list = pVar.mo51959g(PaymentAccountCertificatePreview.f64022h);
            } else {
                list = Collections.emptyList();
            }
            List list3 = list;
            if (i >= 3) {
                paymentAccountSettings = (PaymentAccountSettings) pVar.mo51962q(PaymentAccountSettings.f64112c);
            } else {
                paymentAccountSettings = new PaymentAccountSettings((Boolean) null);
            }
            PaymentAccountSettings paymentAccountSettings2 = paymentAccountSettings;
            if (i >= 4) {
                list2 = pVar.mo51959g(C25717a.f64143g);
            } else {
                list2 = Collections.emptyList();
            }
            return new PaymentAccount(p, g, personalDetails, g2, g3, list3, paymentAccountBadgeType, paymentAccountSettings2, list2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentAccount paymentAccount = (PaymentAccount) obj;
            qVar.mo51954p(paymentAccount.f64013b);
            qVar.mo51965h(paymentAccount.f64014c, PaymentAccountContext.f64029d);
            PersonalDetails personalDetails = paymentAccount.f64015d;
            PersonalDetails.C25684b bVar = PersonalDetails.f64037i;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(personalDetails, qVar);
            qVar.mo51965h(paymentAccount.f64016e, C17353s0.f44739a);
            qVar.mo51965h(paymentAccount.f64017f, PaymentAccountProfile.f64032f);
            qVar.mo51967q(paymentAccount.f64019h, PaymentAccountBadgeType.CODER);
            qVar.mo51965h(paymentAccount.f64018g, PaymentAccountCertificatePreview.f64022h);
            qVar.mo51967q(paymentAccount.f64020i, PaymentAccountSettings.f64112c);
            qVar.mo51965h(paymentAccount.f64021j, C25717a.f64143g);
        }
    }

    public PaymentAccount(String str, List<PaymentAccountContext> list, PersonalDetails personalDetails, List<PaymentMethod> list2, List<PaymentAccountProfile> list3, List<PaymentAccountCertificatePreview> list4, PaymentAccountBadgeType paymentAccountBadgeType, PaymentAccountSettings paymentAccountSettings, List<C25717a> list5) {
        C21100e.m49373x(str, "accountId");
        this.f64013b = str;
        C21100e.m49373x(list, "paymentAccountContexts");
        this.f64014c = Collections.unmodifiableList(list);
        C21100e.m49373x(personalDetails, "personalDetails");
        this.f64015d = personalDetails;
        C21100e.m49373x(list2, "paymentMethods");
        this.f64016e = Collections.unmodifiableList(list2);
        C21100e.m49373x(list3, "profiles");
        this.f64017f = Collections.unmodifiableList(list3);
        C21100e.m49373x(list4, "certificates");
        this.f64018g = Collections.unmodifiableList(list4);
        this.f64019h = paymentAccountBadgeType;
        C21100e.m49373x(paymentAccountSettings, "settings");
        this.f64020i = paymentAccountSettings;
        C21100e.m49373x(list5, "accountProducts");
        this.f64021j = Collections.unmodifiableList(list5);
    }

    /* renamed from: c */
    public static boolean m64175c(PaymentAccount paymentAccount, String str, PaymentAccountContextStatus... paymentAccountContextStatusArr) {
        if (paymentAccount == null) {
            return false;
        }
        return PaymentAccountContextStatus.isStatusOf(paymentAccount.mo83495b(str), paymentAccountContextStatusArr);
    }

    /* renamed from: b */
    public final PaymentAccountContextStatus mo83495b(String str) {
        PaymentAccountContext paymentAccountContext;
        if (str == null || (paymentAccountContext = (PaymentAccountContext) C13723g.m34286g(this.f64014c, new C20401a(str, 2))) == null) {
            return null;
        }
        return paymentAccountContext.f64031c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64012k);
    }
}
