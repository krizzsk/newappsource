package com.usebutton.sdk.internal.user;

import com.usebutton.sdk.internal.purchasepath.autofill.AutofillModel;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class UserProfile {
    private static final String PHONE_NUMBER_REGEX = "[^0-9]";
    private static final String TAG = "UserProfile";
    private String addressLineOne;
    private String addressLineTwo;
    private String billingAddressLineOne;
    private String billingAddressLineTwo;
    private String billingCity;
    private String billingCountry;
    private String billingPostalCode;
    private String billingState;
    private String city;
    private String country;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String postalCode;
    private String state;

    public static UserProfile fromJson(String str) {
        String str2 = AutofillModel.BILLING_COUNTRY;
        try {
            String str3 = AutofillModel.BILLING_POSTAL_CODE;
            JSONObject jSONObject = new JSONObject(str);
            UserProfile userProfile = new UserProfile();
            if (jSONObject.has(AutofillModel.FIRST_NAME)) {
                userProfile.setFirstName(jSONObject.getString(AutofillModel.FIRST_NAME));
            }
            if (jSONObject.has(AutofillModel.LAST_NAME)) {
                userProfile.setLastName(jSONObject.getString(AutofillModel.LAST_NAME));
            }
            if (jSONObject.has(AutofillModel.EMAIL)) {
                userProfile.setEmail(jSONObject.getString(AutofillModel.EMAIL));
            }
            if (jSONObject.has(AutofillModel.PHONE_NUMBER)) {
                userProfile.setPhoneNumber(jSONObject.getString(AutofillModel.PHONE_NUMBER));
            }
            if (jSONObject.has(AutofillModel.ADDRESS_LINE_ONE)) {
                userProfile.setAddressLineOne(jSONObject.getString(AutofillModel.ADDRESS_LINE_ONE));
            }
            if (jSONObject.has(AutofillModel.ADDRESS_LINE_TWO)) {
                userProfile.setAddressLineTwo(jSONObject.getString(AutofillModel.ADDRESS_LINE_TWO));
            }
            if (jSONObject.has(AutofillModel.CITY)) {
                userProfile.setCity(jSONObject.getString(AutofillModel.CITY));
            }
            if (jSONObject.has(AutofillModel.STATE)) {
                userProfile.setState(jSONObject.getString(AutofillModel.STATE));
            }
            if (jSONObject.has(AutofillModel.POSTAL_CODE)) {
                userProfile.setPostalCode(jSONObject.getString(AutofillModel.POSTAL_CODE));
            }
            if (jSONObject.has(AutofillModel.COUNTRY)) {
                userProfile.setCountry(jSONObject.getString(AutofillModel.COUNTRY));
            }
            if (jSONObject.has(AutofillModel.BILLING_ADDRESS_LINE_ONE)) {
                userProfile.setBillingAddressLineOne(jSONObject.getString(AutofillModel.BILLING_ADDRESS_LINE_ONE));
            }
            if (jSONObject.has(AutofillModel.BILLING_ADDRESS_LINE_TWO)) {
                userProfile.setBillingAddressLineTwo(jSONObject.getString(AutofillModel.BILLING_ADDRESS_LINE_TWO));
            }
            if (jSONObject.has(AutofillModel.BILLING_CITY)) {
                userProfile.setBillingCity(jSONObject.getString(AutofillModel.BILLING_CITY));
            }
            if (jSONObject.has(AutofillModel.BILLING_STATE)) {
                userProfile.setBillingState(jSONObject.getString(AutofillModel.BILLING_STATE));
            }
            String str4 = str3;
            if (jSONObject.has(str4)) {
                userProfile.setBillingPostalCode(jSONObject.getString(str4));
            }
            String str5 = str2;
            if (jSONObject.has(str5)) {
                userProfile.setBillingCountry(jSONObject.getString(str5));
            }
            return userProfile;
        } catch (JSONException e) {
            String str6 = TAG;
            StringBuilder k = C13555b.m33972k("Unable to convert JSON String into a UserProfile: ");
            k.append(e.getMessage());
            ButtonLog.warn(str6, k.toString());
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        if (!Objects.equals(this.firstName, userProfile.firstName) || !Objects.equals(this.lastName, userProfile.lastName) || !Objects.equals(this.email, userProfile.email) || !Objects.equals(this.addressLineOne, userProfile.addressLineOne) || !Objects.equals(this.addressLineTwo, userProfile.addressLineTwo) || !Objects.equals(this.city, userProfile.city) || !Objects.equals(this.state, userProfile.state) || !Objects.equals(this.postalCode, userProfile.postalCode) || !Objects.equals(this.country, userProfile.country) || !Objects.equals(this.billingAddressLineOne, userProfile.billingAddressLineOne) || !Objects.equals(this.billingAddressLineTwo, userProfile.billingAddressLineTwo) || !Objects.equals(this.billingCity, userProfile.billingCity) || !Objects.equals(this.billingState, userProfile.billingState) || !Objects.equals(this.billingPostalCode, userProfile.billingPostalCode) || !Objects.equals(this.billingCountry, userProfile.billingCountry)) {
            return false;
        }
        return true;
    }

    public String getAddressLineOne() {
        return this.addressLineOne;
    }

    public String getAddressLineTwo() {
        return this.addressLineTwo;
    }

    public String getBillingAddressLineOne() {
        return this.billingAddressLineOne;
    }

    public String getBillingAddressLineTwo() {
        return this.billingAddressLineTwo;
    }

    public String getBillingCity() {
        return this.billingCity;
    }

    public String getBillingCountry() {
        return this.billingCountry;
    }

    public String getBillingPostalCode() {
        return this.billingPostalCode;
    }

    public String getBillingState() {
        return this.billingState;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName() {
        String str = this.firstName;
        if (str == null && this.lastName == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        objArr[0] = str;
        String str3 = this.lastName;
        if (str3 != null) {
            str2 = str3;
        }
        objArr[1] = str2;
        return String.format("%s %s", objArr).trim();
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getParamValue(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2064598499:
                if (str.equals(AutofillModel.POSTAL_CODE)) {
                    c = 0;
                    break;
                }
                break;
            case -1667636576:
                if (str.equals(AutofillModel.STATE)) {
                    c = 1;
                    break;
                }
                break;
            case -1427632506:
                if (str.equals(AutofillModel.FULL_NAME)) {
                    c = 2;
                    break;
                }
                break;
            case -995260991:
                if (str.equals(AutofillModel.BILLING_COUNTRY)) {
                    c = 3;
                    break;
                }
                break;
            case -617926938:
                if (str.equals(AutofillModel.PHONE_NUMBER)) {
                    c = 4;
                    break;
                }
                break;
            case -326150192:
                if (str.equals(AutofillModel.BILLING_STATE)) {
                    c = 5;
                    break;
                }
                break;
            case 76882701:
                if (str.equals(AutofillModel.LAST_NAME)) {
                    c = 6;
                    break;
                }
                break;
            case 421990366:
                if (str.equals(AutofillModel.BILLING_ADDRESS_LINE_ONE)) {
                    c = 7;
                    break;
                }
                break;
            case 421990367:
                if (str.equals(AutofillModel.BILLING_ADDRESS_LINE_TWO)) {
                    c = 8;
                    break;
                }
                break;
            case 459667118:
                if (str.equals(AutofillModel.ADDRESS_LINE_ONE)) {
                    c = 9;
                    break;
                }
                break;
            case 459667119:
                if (str.equals(AutofillModel.ADDRESS_LINE_TWO)) {
                    c = 10;
                    break;
                }
                break;
            case 501908074:
                if (str.equals(AutofillModel.CITY)) {
                    c = 11;
                    break;
                }
                break;
            case 519153167:
                if (str.equals(AutofillModel.FIRST_NAME)) {
                    c = 12;
                    break;
                }
                break;
            case 681012855:
                if (str.equals(AutofillModel.EMAIL)) {
                    c = 13;
                    break;
                }
                break;
            case 1204657393:
                if (str.equals(AutofillModel.COUNTRY)) {
                    c = 14;
                    break;
                }
                break;
            case 1367760717:
                if (str.equals(AutofillModel.BILLING_POSTAL_CODE)) {
                    c = 15;
                    break;
                }
                break;
            case 1677868954:
                if (str.equals(AutofillModel.BILLING_CITY)) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return getPostalCode();
            case 1:
                return getState();
            case 2:
                return getFullName();
            case 3:
                return getBillingCountry();
            case 4:
                return getPhoneNumber();
            case 5:
                return getBillingState();
            case 6:
                return getLastName();
            case 7:
                return getBillingAddressLineOne();
            case 8:
                return getBillingAddressLineTwo();
            case 9:
                return getAddressLineOne();
            case 10:
                return getAddressLineTwo();
            case 11:
                return getCity();
            case 12:
                return getFirstName();
            case 13:
                return getEmail();
            case 14:
                return getCountry();
            case 15:
                return getBillingPostalCode();
            case 16:
                return getBillingCity();
            default:
                return null;
        }
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getState() {
        return this.state;
    }

    public boolean hasUserDataForFillCard() {
        String str;
        String str2;
        String str3;
        String str4 = this.firstName;
        if ((str4 == null || str4.isEmpty()) && (((str = this.lastName) == null || str.isEmpty()) && (((str2 = this.email) == null || str2.isEmpty()) && ((str3 = this.addressLineOne) == null || str3.isEmpty())))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.firstName, this.lastName, this.email, this.addressLineOne, this.addressLineTwo, this.city, this.state, this.postalCode, this.billingAddressLineOne, this.billingAddressLineTwo, this.billingCity, this.billingState, this.billingPostalCode, this.billingCountry});
    }

    public void setAddressLineOne(String str) {
        this.addressLineOne = str;
    }

    public void setAddressLineTwo(String str) {
        this.addressLineTwo = str;
    }

    public void setBillingAddressLineOne(String str) {
        this.billingAddressLineOne = str;
    }

    public void setBillingAddressLineTwo(String str) {
        this.billingAddressLineTwo = str;
    }

    public void setBillingCity(String str) {
        this.billingCity = str;
    }

    public void setBillingCountry(String str) {
        this.billingCountry = str;
    }

    public void setBillingPostalCode(String str) {
        this.billingPostalCode = str;
    }

    public void setBillingState(String str) {
        this.billingState = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setPhoneNumber(String str) {
        if (str != null) {
            this.phoneNumber = str.replaceAll(PHONE_NUMBER_REGEX, "");
        } else {
            this.phoneNumber = null;
        }
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(AutofillModel.FIRST_NAME, getFirstName());
            jSONObject.putOpt(AutofillModel.LAST_NAME, getLastName());
            jSONObject.putOpt(AutofillModel.EMAIL, getEmail());
            jSONObject.putOpt(AutofillModel.PHONE_NUMBER, getPhoneNumber());
            jSONObject.putOpt(AutofillModel.ADDRESS_LINE_ONE, getAddressLineOne());
            jSONObject.putOpt(AutofillModel.ADDRESS_LINE_TWO, getAddressLineTwo());
            jSONObject.putOpt(AutofillModel.CITY, getCity());
            jSONObject.putOpt(AutofillModel.STATE, getState());
            jSONObject.putOpt(AutofillModel.POSTAL_CODE, getPostalCode());
            jSONObject.putOpt(AutofillModel.COUNTRY, getCountry());
            jSONObject.putOpt(AutofillModel.BILLING_ADDRESS_LINE_ONE, getBillingAddressLineOne());
            jSONObject.putOpt(AutofillModel.BILLING_ADDRESS_LINE_TWO, getBillingAddressLineTwo());
            jSONObject.putOpt(AutofillModel.BILLING_CITY, getBillingCity());
            jSONObject.putOpt(AutofillModel.BILLING_STATE, getBillingState());
            jSONObject.putOpt(AutofillModel.BILLING_POSTAL_CODE, getBillingPostalCode());
            jSONObject.putOpt(AutofillModel.BILLING_COUNTRY, getBillingCountry());
            return jSONObject.toString();
        } catch (JSONException e) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Unable to convert UserProfile into JSON String: ");
            k.append(e.getMessage());
            ButtonLog.warn(str, k.toString());
            return "";
        }
    }
}
