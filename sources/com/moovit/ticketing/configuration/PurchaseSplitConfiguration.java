package com.moovit.ticketing.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.math.BigDecimal;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class PurchaseSplitConfiguration implements Parcelable {
    public static final Parcelable.Creator<PurchaseSplitConfiguration> CREATOR = new C7636a();

    /* renamed from: c */
    public static final C7637b f23239c = new C7637b(PurchaseSplitConfiguration.class);

    /* renamed from: b */
    public final BigDecimal f23240b;

    /* renamed from: com.moovit.ticketing.configuration.PurchaseSplitConfiguration$a */
    public class C7636a implements Parcelable.Creator<PurchaseSplitConfiguration> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseSplitConfiguration) C19612n.m46981v(parcel, PurchaseSplitConfiguration.f23239c);
        }

        public final Object[] newArray(int i) {
            return new PurchaseSplitConfiguration[i];
        }
    }

    /* renamed from: com.moovit.ticketing.configuration.PurchaseSplitConfiguration$b */
    public class C7637b extends C19619s<PurchaseSplitConfiguration> {
        public C7637b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PurchaseSplitConfiguration((BigDecimal) pVar.mo51962q(C19794a.f50328f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51967q(((PurchaseSplitConfiguration) obj).f23240b, C19794a.f50328f);
        }
    }

    public PurchaseSplitConfiguration(BigDecimal bigDecimal) {
        this.f23240b = bigDecimal;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23239c);
    }
}
