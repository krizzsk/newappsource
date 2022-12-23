package com.moovit.app.carpool.referral;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CarpoolReferralCouponDetails implements Parcelable {
    public static final Parcelable.Creator<CarpoolReferralCouponDetails> CREATOR = new C14819a();

    /* renamed from: g */
    public static final C14820b f37810g = new C14820b(CarpoolReferralCouponDetails.class);

    /* renamed from: b */
    public String f37811b;

    /* renamed from: c */
    public String f37812c;

    /* renamed from: d */
    public short f37813d;

    /* renamed from: e */
    public CurrencyAmount f37814e;

    /* renamed from: f */
    public CurrencyAmount f37815f;

    /* renamed from: com.moovit.app.carpool.referral.CarpoolReferralCouponDetails$a */
    public class C14819a implements Parcelable.Creator<CarpoolReferralCouponDetails> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolReferralCouponDetails) C19612n.m46981v(parcel, CarpoolReferralCouponDetails.f37810g);
        }

        public final Object[] newArray(int i) {
            return new CarpoolReferralCouponDetails[i];
        }
    }

    /* renamed from: com.moovit.app.carpool.referral.CarpoolReferralCouponDetails$b */
    public class C14820b extends C19619s<CarpoolReferralCouponDetails> {
        public C14820b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            short r = pVar.mo51926r();
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            return new CarpoolReferralCouponDetails(p, p2, r, (CurrencyAmount) bVar.read(pVar), (CurrencyAmount) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolReferralCouponDetails carpoolReferralCouponDetails = (CarpoolReferralCouponDetails) obj;
            qVar.mo51954p(carpoolReferralCouponDetails.f37811b);
            qVar.mo51954p(carpoolReferralCouponDetails.f37812c);
            qVar.mo51941r(carpoolReferralCouponDetails.f37813d);
            CurrencyAmount currencyAmount = carpoolReferralCouponDetails.f37814e;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = carpoolReferralCouponDetails.f37815f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount2, qVar);
        }
    }

    public CarpoolReferralCouponDetails(String str, String str2, short s, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        this.f37811b = str;
        this.f37812c = str2;
        this.f37813d = s;
        this.f37814e = currencyAmount;
        this.f37815f = currencyAmount2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37810g);
    }
}
