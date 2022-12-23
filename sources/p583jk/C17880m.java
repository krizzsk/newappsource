package p583jk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p752qn.C19148f;

/* renamed from: jk.m */
public final class C17880m {
    /* renamed from: a */
    public static String m44327a(C19148f fVar) {
        Locale locale = Locale.getDefault();
        BigInteger valueOf = BigInteger.valueOf((long) fVar.f48695b.intValue());
        Currency instance = Currency.getInstance(fVar.f48694a);
        int defaultFractionDigits = instance.getDefaultFractionDigits();
        double doubleValue = new BigDecimal(valueOf, defaultFractionDigits).doubleValue();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(instance);
        currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
        currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
        return currencyInstance.format(doubleValue);
    }
}
