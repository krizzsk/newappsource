package com.usebutton.sdk.autofill;

import java.util.regex.Pattern;

public class PaymentMethod {
    /* access modifiers changed from: private */
    public static final Pattern AMERICAN_EXPRESS_PATTERN = Pattern.compile("^3[47][0-9]{13}$");
    /* access modifiers changed from: private */
    public static final Pattern DINERS_CLUB_PATTERN = Pattern.compile("^3(?:0[0-5]|[68][0-9])[0-9]{11}$");
    /* access modifiers changed from: private */
    public static final Pattern DISCOVER_PATTERN = Pattern.compile("^6(?:011|5[0-9]{2})[0-9]{12}$");
    /* access modifiers changed from: private */
    public static final Pattern JCB_PATTERN = Pattern.compile("^(?:2131|1800|35\\d{3})\\d{11}$");
    /* access modifiers changed from: private */
    public static final Pattern MASTERCARD_PATTERN = Pattern.compile("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$");
    /* access modifiers changed from: private */
    public static final Pattern VISA_PATTERN = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
    private String cardNumber;
    private String cvv;
    private String expirationMonth;
    private String expirationYear;
    private String fullName;

    public enum CardType {
        VISA("Visa", PaymentMethod.VISA_PATTERN),
        MASTERCARD("Mastercard", PaymentMethod.MASTERCARD_PATTERN),
        AMERICAN_EXPRESS("Amex", PaymentMethod.AMERICAN_EXPRESS_PATTERN),
        DINERS_CLUB("Diners", PaymentMethod.DINERS_CLUB_PATTERN),
        DISCOVER("Discover", PaymentMethod.DISCOVER_PATTERN),
        JCB("JCB", PaymentMethod.JCB_PATTERN);
        
        private final String name;
        private final Pattern pattern;

        private CardType(String str, Pattern pattern2) {
            this.name = str;
            this.pattern = pattern2;
        }

        public static CardType fromCardNumber(String str) {
            if (str == null) {
                return null;
            }
            for (CardType cardType : values()) {
                if (cardType.pattern.matcher(str).matches()) {
                    return cardType;
                }
            }
            return null;
        }

        public String getName() {
            return this.name;
        }
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpirationMonth() {
        return this.expirationMonth;
    }

    public String getExpirationYear() {
        return this.expirationYear;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setCvv(String str) {
        this.cvv = str;
    }

    public void setExpirationMonth(String str) {
        this.expirationMonth = str;
    }

    public void setExpirationYear(String str) {
        this.expirationYear = str;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }
}
