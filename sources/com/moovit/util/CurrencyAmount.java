package com.moovit.util;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.AppsFlyerProperties;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Currency;
import p583jk.C17884p;
import p693nz.C18659h;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class CurrencyAmount implements Parcelable {
    public static final Parcelable.Creator<CurrencyAmount> CREATOR = new C7880a();

    /* renamed from: e */
    public static final C18659h<String, Format> f23842e = new C18659h<>(3);

    /* renamed from: f */
    public static final C7881b f23843f = new C7881b(CurrencyAmount.class);

    /* renamed from: b */
    public final String f23844b;

    /* renamed from: c */
    public final BigDecimal f23845c;

    /* renamed from: d */
    public final Format f23846d;

    public static class EmptyFormat extends NumberFormat {
        private final StringBuffer emptyStringBuffer;

        private EmptyFormat() {
            this.emptyStringBuffer = new StringBuffer(0);
        }

        public final StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            return this.emptyStringBuffer;
        }

        public final Number parse(String str, ParsePosition parsePosition) {
            return null;
        }

        public final StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            return this.emptyStringBuffer;
        }

        public /* synthetic */ EmptyFormat(int i) {
            this();
        }
    }

    /* renamed from: com.moovit.util.CurrencyAmount$a */
    public class C7880a implements Parcelable.Creator<CurrencyAmount> {
        public final Object createFromParcel(Parcel parcel) {
            return (CurrencyAmount) C19612n.m46981v(parcel, CurrencyAmount.f23843f);
        }

        public final Object[] newArray(int i) {
            return new CurrencyAmount[i];
        }
    }

    /* renamed from: com.moovit.util.CurrencyAmount$b */
    public class C7881b extends C19619s<CurrencyAmount> {
        public C7881b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new CurrencyAmount(pVar.mo51947p(), (BigDecimal) C19794a.f50328f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            qVar.mo51954p(currencyAmount.f23844b);
            C19794a.f50328f.write(currencyAmount.f23845c, qVar);
        }
    }

    public CurrencyAmount(String str, BigDecimal bigDecimal) {
        C21100e.m49373x(str, AppsFlyerProperties.CURRENCY_CODE);
        this.f23844b = str;
        C21100e.m49373x(bigDecimal, "amount");
        this.f23845c = bigDecimal;
        Format d = m17928d(str);
        C21100e.m49373x(d, "formatter");
        this.f23846d = d;
    }

    /* renamed from: b */
    public static CurrencyAmount m17926b(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        if (currencyAmount.f23844b.equals(currencyAmount2.f23844b)) {
            return new CurrencyAmount(currencyAmount.f23844b, currencyAmount.f23845c.add(currencyAmount2.f23845c));
        }
        StringBuilder k = C13555b.m33972k("Currencies mismatch: ca1=");
        k.append(currencyAmount.f23844b);
        k.append(", ca2=");
        k.append(currencyAmount2.f23844b);
        throw new ApplicationBugException(k.toString());
    }

    /* renamed from: c */
    public static NumberFormat m17927c(String str) {
        str.getClass();
        if (str.equals("M:K")) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            if (!(currencyInstance instanceof DecimalFormat)) {
                return NumberFormat.getIntegerInstance();
            }
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            decimalFormat.setMaximumFractionDigits(0);
            decimalFormat.setPositiveSuffix(" kintos");
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol("");
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            return currencyInstance;
        } else if (str.equals("M:Empty")) {
            return new EmptyFormat(0);
        } else {
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance();
            currencyInstance2.setCurrency(Currency.getInstance(str));
            return currencyInstance2;
        }
    }

    /* renamed from: d */
    public static Format m17928d(String str) {
        C18659h<String, Format> hVar = f23842e;
        Format format = hVar.get(str);
        if (format == null) {
            synchronized (hVar) {
                format = hVar.get(str);
                if (format == null) {
                    format = m17927c(str);
                    hVar.put(str, format);
                }
            }
        }
        return format;
    }

    /* renamed from: f */
    public static CurrencyAmount m17929f(int i, CurrencyAmount currencyAmount) {
        return new CurrencyAmount(currencyAmount.f23844b, currencyAmount.f23845c.multiply(new BigDecimal(i)));
    }

    /* renamed from: g */
    public static CurrencyAmount m17930g(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        if (currencyAmount.f23844b.equals(currencyAmount2.f23844b)) {
            return new CurrencyAmount(currencyAmount.f23844b, currencyAmount.f23845c.subtract(currencyAmount2.f23845c));
        }
        StringBuilder k = C13555b.m33972k("Currencies mismatch: ca1=");
        k.append(currencyAmount.f23844b);
        k.append(", ca2=");
        k.append(currencyAmount2.f23844b);
        throw new ApplicationBugException(k.toString());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyAmount)) {
            return false;
        }
        CurrencyAmount currencyAmount = (CurrencyAmount) obj;
        if (!this.f23844b.equals(currencyAmount.f23844b) || !this.f23845c.equals(currencyAmount.f23845c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23844b), C17884p.m44335F(this.f23845c));
    }

    public final String toString() {
        return this.f23846d.format(this.f23845c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23843f);
    }
}
