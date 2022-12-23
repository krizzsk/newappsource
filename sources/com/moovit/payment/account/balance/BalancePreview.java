package com.moovit.payment.account.balance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

public class BalancePreview implements Parcelable {
    public static final Parcelable.Creator<BalancePreview> CREATOR = new C25629a();

    /* renamed from: e */
    public static final C25630b f63927e = new C25630b(BalancePreview.class);

    /* renamed from: b */
    public final Image f63928b;

    /* renamed from: c */
    public final String f63929c;

    /* renamed from: d */
    public final CurrencyAmount f63930d;

    /* renamed from: com.moovit.payment.account.balance.BalancePreview$a */
    public class C25629a implements Parcelable.Creator<BalancePreview> {
        public final Object createFromParcel(Parcel parcel) {
            return (BalancePreview) C19612n.m46981v(parcel, BalancePreview.f63927e);
        }

        public final Object[] newArray(int i) {
            return new BalancePreview[i];
        }
    }

    /* renamed from: com.moovit.payment.account.balance.BalancePreview$b */
    public class C25630b extends C19619s<BalancePreview> {
        public C25630b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19617r rVar = C16019d.m40803a().f41718d;
            pVar.getClass();
            return new BalancePreview((Image) rVar.read(pVar), pVar.mo51947p(), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BalancePreview balancePreview = (BalancePreview) obj;
            Image image = balancePreview.f63928b;
            C19617r rVar = C16019d.m40803a().f41718d;
            qVar.getClass();
            rVar.write(image, qVar);
            qVar.mo51954p(balancePreview.f63929c);
            CurrencyAmount currencyAmount = balancePreview.f63930d;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
        }
    }

    public BalancePreview(Image image, String str, CurrencyAmount currencyAmount) {
        C21100e.m49373x(image, "icon");
        this.f63928b = image;
        C21100e.m49373x(str, "caption");
        this.f63929c = str;
        C21100e.m49373x(currencyAmount, "balance");
        this.f63930d = currencyAmount;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63927e);
    }
}
