package com.moovit.ticketing.purchase.history;

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
import p810sz.C19619s;

public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new C7690a();

    /* renamed from: g */
    public static final C7691b f23366g = new C7691b(Transaction.class);

    /* renamed from: b */
    public final Image f23367b;

    /* renamed from: c */
    public final String f23368c;

    /* renamed from: d */
    public final long f23369d;

    /* renamed from: e */
    public final CurrencyAmount f23370e;

    /* renamed from: f */
    public final String f23371f;

    /* renamed from: com.moovit.ticketing.purchase.history.Transaction$a */
    public class C7690a implements Parcelable.Creator<Transaction> {
        public final Object createFromParcel(Parcel parcel) {
            return (Transaction) C19612n.m46981v(parcel, Transaction.f23366g);
        }

        public final Object[] newArray(int i) {
            return new Transaction[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.history.Transaction$b */
    public class C7691b extends C19619s<Transaction> {
        public C7691b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new Transaction((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51947p(), pVar.mo51925m(), (CurrencyAmount) CurrencyAmount.f23843f.read(pVar), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Transaction transaction = (Transaction) obj;
            qVar.mo51967q(transaction.f23367b, C16019d.m40803a().f41718d);
            qVar.mo51954p(transaction.f23368c);
            qVar.mo51940m(transaction.f23369d);
            CurrencyAmount currencyAmount = transaction.f23370e;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            qVar.mo51955t(transaction.f23371f);
        }
    }

    public Transaction(Image image, String str, long j, CurrencyAmount currencyAmount, String str2) {
        this.f23367b = image;
        C21100e.m49373x(str, "name");
        this.f23368c = str;
        this.f23369d = j;
        C21100e.m49373x(currencyAmount, "amount");
        this.f23370e = currencyAmount;
        this.f23371f = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23366g);
    }
}
