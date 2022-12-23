package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationPrice implements Parcelable {
    public static final Parcelable.Creator<MotActivationPrice> CREATOR = new C15145a();

    /* renamed from: e */
    public static final C15146b f39004e = new C15146b(MotActivationPrice.class);

    /* renamed from: b */
    public final CurrencyAmount f39005b;

    /* renamed from: c */
    public final CurrencyAmount f39006c;

    /* renamed from: d */
    public final List<String> f39007d;

    /* renamed from: com.moovit.app.mot.model.MotActivationPrice$a */
    public class C15145a implements Parcelable.Creator<MotActivationPrice> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationPrice) C19612n.m46981v(parcel, MotActivationPrice.f39004e);
        }

        public final Object[] newArray(int i) {
            return new MotActivationPrice[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationPrice$b */
    public class C15146b extends C19619s<MotActivationPrice> {
        public C15146b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            pVar.getClass();
            CurrencyAmount currencyAmount = (CurrencyAmount) bVar.read(pVar);
            CurrencyAmount currencyAmount2 = (CurrencyAmount) bVar.read(pVar);
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(pVar.mo51948t());
                }
                arrayList = arrayList2;
            }
            return new MotActivationPrice(currencyAmount, currencyAmount2, arrayList);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationPrice motActivationPrice = (MotActivationPrice) obj;
            CurrencyAmount currencyAmount = motActivationPrice.f39005b;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = motActivationPrice.f39006c;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount2, qVar);
            List<String> list = motActivationPrice.f39007d;
            if (list == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(list.size());
            for (String t : list) {
                qVar.mo51955t(t);
            }
        }
    }

    public MotActivationPrice(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, List<String> list) {
        C21100e.m49373x(currencyAmount, "priceAmount");
        this.f39005b = currencyAmount;
        C21100e.m49373x(currencyAmount2, "fullPriceAmount");
        this.f39006c = currencyAmount2;
        C21100e.m49373x(list, "discountReasons");
        this.f39007d = Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public final CurrencyAmount mo45548b(int i) {
        if (i == 1) {
            return this.f39005b;
        }
        return CurrencyAmount.m17926b(this.f39005b, CurrencyAmount.m17929f(i - 1, this.f39006c));
    }

    /* renamed from: c */
    public final boolean mo45549c() {
        if (this.f39005b.f23845c.compareTo(this.f39006c.f23845c) < 0) {
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivationPrice)) {
            return false;
        }
        MotActivationPrice motActivationPrice = (MotActivationPrice) obj;
        if (!this.f39005b.equals(motActivationPrice.f39005b) || !this.f39006c.equals(motActivationPrice.f39006c) || !this.f39007d.equals(motActivationPrice.f39007d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f39005b), C17884p.m44335F(this.f39006c), C17884p.m44335F(this.f39007d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39004e);
    }
}
