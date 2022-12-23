package com.appboy.support;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import p030bo.app.C1558d4;

@Keep
public final class ValidationUtils {
    public static final int APPBOY_STRING_MAX_LENGTH = 255;
    public static final int EMAIL_ADDRESS_MAX_LENGTH = 256;
    public static final Pattern EMAIL_ADDRESS_REGEX = Pattern.compile(".+@.+\\..+");
    public static final String PHONE_NUMBER_REGEX = "^[0-9 .\\(\\)\\+\\-]+$";
    public static final String TAG = AppboyLogger.getBrazeLogTag(ValidationUtils.class);
    public static final Set<String> VALID_CURRENCY_CODES = new HashSet(Arrays.asList(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"}));

    public static String ensureBrazeFieldLength(String str) {
        String trim = str.trim();
        if (trim.length() <= 255) {
            return trim;
        }
        String str2 = TAG;
        StringBuilder k = C13555b.m33972k("Provided string field is too long [");
        k.append(trim.length());
        k.append("]. The max length is ");
        k.append(APPBOY_STRING_MAX_LENGTH);
        k.append(", truncating provided field.");
        AppboyLogger.m5459w(str2, k.toString());
        return trim.substring(0, APPBOY_STRING_MAX_LENGTH);
    }

    public static boolean isValidEmailAddress(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.length() >= 256) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.matcher(lowerCase).matches();
    }

    public static boolean isValidLocation(double d, double d2) {
        return d < 90.0d && d > -90.0d && d2 < 180.0d && d2 > -180.0d;
    }

    public static boolean isValidLogCustomEventInput(String str, C1558d4 d4Var) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "The custom event name cannot be null or contain only whitespaces. Invalid custom event.");
            return false;
        } else if (!d4Var.mo6007c().contains(str)) {
            return true;
        } else {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "The custom event is a blocklisted custom event: " + str + ". Invalid custom event.");
            return false;
        }
    }

    public static boolean isValidLogPurchaseInput(String str, String str2, BigDecimal bigDecimal, int i, C1558d4 d4Var) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "The productId is empty, not logging in-app purchase to Appboy.");
            return false;
        } else if (d4Var.mo6008d().contains(str)) {
            String str3 = TAG;
            AppboyLogger.m5459w(str3, "The productId is a blocklisted productId: " + str);
            return false;
        } else if (StringUtils.isNullOrBlank(str2)) {
            String str4 = TAG;
            StringBuilder k = C13555b.m33972k("The currencyCode is empty. Expected one of ");
            k.append(VALID_CURRENCY_CODES);
            AppboyLogger.m5459w(str4, k.toString());
            return false;
        } else {
            String upperCase = str2.trim().toUpperCase(Locale.US);
            Set<String> set = VALID_CURRENCY_CODES;
            if (!set.contains(upperCase)) {
                String str5 = TAG;
                AppboyLogger.m5459w(str5, "The currencyCode " + upperCase + " is invalid. Expected one of " + set);
                return false;
            } else if (bigDecimal == null) {
                AppboyLogger.m5459w(TAG, "The price is null.");
                return false;
            } else if (i <= 0) {
                String str6 = TAG;
                AppboyLogger.m5459w(str6, "The requested purchase quantity of " + i + " is less than one. Invalid purchase");
                return false;
            } else if (i <= 100) {
                return true;
            } else {
                String str7 = TAG;
                AppboyLogger.m5459w(str7, "The requested purchase quantity of " + i + " is greater than the maximum of " + 100);
                return false;
            }
        }
    }

    public static boolean isValidPhoneNumber(String str) {
        return str != null && str.matches(PHONE_NUMBER_REGEX);
    }

    public static boolean isValidPushStoryClickInput(String str, String str2) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "Campaign ID cannot be null or blank");
            return false;
        } else if (!StringUtils.isNullOrBlank(str2)) {
            return true;
        } else {
            AppboyLogger.m5459w(TAG, "Push story page ID cannot be null or blank");
            return false;
        }
    }
}
