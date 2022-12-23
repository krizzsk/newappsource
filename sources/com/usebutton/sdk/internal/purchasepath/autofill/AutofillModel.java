package com.usebutton.sdk.internal.purchasepath.autofill;

public class AutofillModel {
    public static final String ADDRESS_LINE_ONE = "AddressDetails.PostalAddress.AddressLine1";
    public static final String ADDRESS_LINE_TWO = "AddressDetails.PostalAddress.AddressLine2";
    public static final String BILLING_ADDRESS_LINE_ONE = "AddressDetails.BillingAddress.AddressLine1";
    public static final String BILLING_ADDRESS_LINE_TWO = "AddressDetails.BillingAddress.AddressLine2";
    public static final String BILLING_CITY = "AddressDetails.BillingAddress.Suburb";
    public static final String BILLING_COUNTRY = "AddressDetails.BillingAddress.Country";
    public static final String BILLING_POSTAL_CODE = "AddressDetails.BillingAddress.PostalCode";
    public static final String BILLING_STATE = "AddressDetails.BillingAddress.AdministrativeArea";
    public static final String CITY = "AddressDetails.PostalAddress.Suburb";
    public static final String COUNTRY = "AddressDetails.PostalAddress.Country";
    public static final String CREDIT_CARD_CVV = "CreditCards.CreditCard.CCV";
    public static final String CREDIT_CARD_EXPIRATION_MONTH = "CreditCards.CreditCard.Expiry.Month";
    public static final String CREDIT_CARD_EXPIRATION_YEAR = "CreditCards.CreditCard.Expiry.Year";
    public static final String CREDIT_CARD_NAME_ON_CARD = "CreditCards.CreditCard.NameOnCard";
    public static final String CREDIT_CARD_NUMBER = "CreditCards.CreditCard.Number";
    public static final String EMAIL = "ContactDetails.Emails.Email.Address";
    public static final String FIRST_NAME = "PersonalDetails.FirstName";
    public static final String FULL_NAME = "PersonalDetails.FullName";
    public static final String LAST_NAME = "PersonalDetails.LastName";
    public static final String PHONE_NUMBER = "ContactDetails.CellPhones.CellPhone.Number";
    public static final String POSTAL_CODE = "AddressDetails.PostalAddress.PostalCode";
    public static final String STATE = "AddressDetails.PostalAddress.AdministrativeArea";

    public static boolean isBillingParam(String str) {
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -995260991:
                if (str.equals(BILLING_COUNTRY)) {
                    c = 0;
                    break;
                }
                break;
            case -326150192:
                if (str.equals(BILLING_STATE)) {
                    c = 1;
                    break;
                }
                break;
            case 421990366:
                if (str.equals(BILLING_ADDRESS_LINE_ONE)) {
                    c = 2;
                    break;
                }
                break;
            case 421990367:
                if (str.equals(BILLING_ADDRESS_LINE_TWO)) {
                    c = 3;
                    break;
                }
                break;
            case 1367760717:
                if (str.equals(BILLING_POSTAL_CODE)) {
                    c = 4;
                    break;
                }
                break;
            case 1677868954:
                if (str.equals(BILLING_CITY)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static boolean isCreditCardParam(String str) {
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1611295499:
                if (str.equals(CREDIT_CARD_CVV)) {
                    c = 0;
                    break;
                }
                break;
            case -1424619973:
                if (str.equals(CREDIT_CARD_NAME_ON_CARD)) {
                    c = 1;
                    break;
                }
                break;
            case -1187831286:
                if (str.equals(CREDIT_CARD_NUMBER)) {
                    c = 2;
                    break;
                }
                break;
            case -609903642:
                if (str.equals(CREDIT_CARD_EXPIRATION_MONTH)) {
                    c = 3;
                    break;
                }
                break;
            case 396315159:
                if (str.equals(CREDIT_CARD_EXPIRATION_YEAR)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }
}
