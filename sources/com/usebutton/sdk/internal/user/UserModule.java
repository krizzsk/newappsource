package com.usebutton.sdk.internal.user;

import com.usebutton.sdk.autofill.PaymentMethodProvider;
import com.usebutton.sdk.autofill.PaymentMethodReceiver;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.configuration.ConfigurationModule;
import com.usebutton.sdk.internal.purchasepath.autofill.AutofillModel;
import com.usebutton.sdk.internal.secure.SecureStore;
import com.usebutton.sdk.user.User;
import java.util.Map;

public class UserModule implements User {
    public static final String USER_PROFILE_KEY = "btn_default_user_profile";
    public static UserModule instance;
    private UserProfile cachedUserProfile = new UserProfile();
    private final ConfigurationModule configurationModule;
    private PaymentMethodProvider paymentMethodProvider;
    private PaymentMethodReceiver paymentMethodReceiver;
    private String preConfigurationUserIdentifier;
    private SecureStore secureStore;

    public UserModule(ConfigurationModule configurationModule2) {
        this.configurationModule = configurationModule2;
    }

    public static synchronized UserModule getInstance(SecureStore secureStore2, ConfigurationModule configurationModule2) {
        UserModule userModule;
        synchronized (UserModule.class) {
            if (instance == null) {
                instance = new UserModule(configurationModule2);
            }
            UserModule userModule2 = instance;
            if (userModule2.secureStore == null && secureStore2 != null) {
                userModule2.secureStore = secureStore2;
                userModule2.saveCachedValues();
            }
            userModule = instance;
        }
        return userModule;
    }

    private boolean hasProfileFieldSet(String str) {
        UserProfile profile;
        if (!hasProfileData() || (profile = getProfile()) == null) {
            return false;
        }
        str.getClass();
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
            case -617926938:
                if (str.equals(AutofillModel.PHONE_NUMBER)) {
                    c = 2;
                    break;
                }
                break;
            case 76882701:
                if (str.equals(AutofillModel.LAST_NAME)) {
                    c = 3;
                    break;
                }
                break;
            case 459667118:
                if (str.equals(AutofillModel.ADDRESS_LINE_ONE)) {
                    c = 4;
                    break;
                }
                break;
            case 459667119:
                if (str.equals(AutofillModel.ADDRESS_LINE_TWO)) {
                    c = 5;
                    break;
                }
                break;
            case 501908074:
                if (str.equals(AutofillModel.CITY)) {
                    c = 6;
                    break;
                }
                break;
            case 519153167:
                if (str.equals(AutofillModel.FIRST_NAME)) {
                    c = 7;
                    break;
                }
                break;
            case 681012855:
                if (str.equals(AutofillModel.EMAIL)) {
                    c = 8;
                    break;
                }
                break;
            case 1204657393:
                if (str.equals(AutofillModel.COUNTRY)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (profile.getPostalCode() != null) {
                    return true;
                }
                return false;
            case 1:
                if (profile.getState() != null) {
                    return true;
                }
                return false;
            case 2:
                if (profile.getPhoneNumber() != null) {
                    return true;
                }
                return false;
            case 3:
                if (profile.getLastName() != null) {
                    return true;
                }
                return false;
            case 4:
                if (profile.getAddressLineOne() != null) {
                    return true;
                }
                return false;
            case 5:
                if (profile.getAddressLineTwo() != null) {
                    return true;
                }
                return false;
            case 6:
                if (profile.getCity() != null) {
                    return true;
                }
                return false;
            case 7:
                if (profile.getFirstName() != null) {
                    return true;
                }
                return false;
            case 8:
                if (profile.getEmail() != null) {
                    return true;
                }
                return false;
            case 9:
                if (profile.getCountry() != null) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void saveCachedValues() {
        if (this.cachedUserProfile.getFirstName() != null) {
            setFirstName(this.cachedUserProfile.getFirstName());
        }
        if (this.cachedUserProfile.getLastName() != null) {
            setLastName(this.cachedUserProfile.getLastName());
        }
        if (this.cachedUserProfile.getEmail() != null) {
            setEmail(this.cachedUserProfile.getEmail());
        }
        if (this.cachedUserProfile.getPhoneNumber() != null) {
            setPhoneNumber(this.cachedUserProfile.getPhoneNumber());
        }
        if (this.cachedUserProfile.getAddressLineOne() != null) {
            setAddressLineOne(this.cachedUserProfile.getAddressLineOne());
        }
        if (this.cachedUserProfile.getAddressLineTwo() != null) {
            setAddressLineTwo(this.cachedUserProfile.getAddressLineTwo());
        }
        if (this.cachedUserProfile.getCity() != null) {
            setCity(this.cachedUserProfile.getCity());
        }
        if (this.cachedUserProfile.getState() != null) {
            setState(this.cachedUserProfile.getState());
        }
        if (this.cachedUserProfile.getPostalCode() != null) {
            setPostalCode(this.cachedUserProfile.getPostalCode());
        }
    }

    private void setJsonFieldValue(UserProfile userProfile, String str, String str2) {
        str.getClass();
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
            case -617926938:
                if (str.equals(AutofillModel.PHONE_NUMBER)) {
                    c = 2;
                    break;
                }
                break;
            case 76882701:
                if (str.equals(AutofillModel.LAST_NAME)) {
                    c = 3;
                    break;
                }
                break;
            case 459667118:
                if (str.equals(AutofillModel.ADDRESS_LINE_ONE)) {
                    c = 4;
                    break;
                }
                break;
            case 459667119:
                if (str.equals(AutofillModel.ADDRESS_LINE_TWO)) {
                    c = 5;
                    break;
                }
                break;
            case 501908074:
                if (str.equals(AutofillModel.CITY)) {
                    c = 6;
                    break;
                }
                break;
            case 519153167:
                if (str.equals(AutofillModel.FIRST_NAME)) {
                    c = 7;
                    break;
                }
                break;
            case 681012855:
                if (str.equals(AutofillModel.EMAIL)) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                userProfile.setPostalCode(str2);
                return;
            case 1:
                userProfile.setState(str2);
                return;
            case 2:
                userProfile.setPhoneNumber(str2);
                return;
            case 3:
                userProfile.setLastName(str2);
                return;
            case 4:
                userProfile.setAddressLineOne(str2);
                return;
            case 5:
                userProfile.setAddressLineTwo(str2);
                return;
            case 6:
                userProfile.setCity(str2);
                return;
            case 7:
                userProfile.setFirstName(str2);
                return;
            case 8:
                userProfile.setEmail(str2);
                return;
            default:
                return;
        }
    }

    public static void setTestInstance(UserModule userModule) {
        instance = userModule;
    }

    private void updateUserProfile(String str, String str2) {
        UserProfile userProfile;
        UserProfile userProfile2;
        if (str2 != null) {
            str2 = str2.trim();
        }
        SecureStore secureStore2 = this.secureStore;
        if (secureStore2 == null) {
            setJsonFieldValue(this.cachedUserProfile, str, str2);
            return;
        }
        String retrieve = secureStore2.retrieve(USER_PROFILE_KEY);
        if (retrieve == null || retrieve.isEmpty()) {
            userProfile = new UserProfile();
        } else {
            userProfile = UserProfile.fromJson(retrieve);
        }
        if (userProfile != null) {
            userProfile2 = userProfile;
        } else {
            userProfile2 = new UserProfile();
        }
        setJsonFieldValue(userProfile2, str, str2);
        this.secureStore.save(USER_PROFILE_KEY, userProfile.toJson());
    }

    public void clear() {
        this.cachedUserProfile = new UserProfile();
        this.paymentMethodProvider = null;
        this.paymentMethodReceiver = null;
    }

    public PaymentMethodProvider getPaymentMethodProvider() {
        return this.paymentMethodProvider;
    }

    public PaymentMethodReceiver getPaymentMethodReceiver() {
        return this.paymentMethodReceiver;
    }

    public String getPreConfigurationUserIdentifier() {
        return this.preConfigurationUserIdentifier;
    }

    public UserProfile getProfile() {
        SecureStore secureStore2 = this.secureStore;
        if (secureStore2 == null) {
            return this.cachedUserProfile;
        }
        String retrieve = secureStore2.retrieve(USER_PROFILE_KEY);
        if (retrieve == null || retrieve.isEmpty()) {
            return this.cachedUserProfile;
        }
        return UserProfile.fromJson(retrieve);
    }

    public boolean hasProfileData() {
        SecureStore secureStore2 = this.secureStore;
        return secureStore2 != null && secureStore2.has(USER_PROFILE_KEY);
    }

    @Deprecated
    public boolean isAutofillEnabled() {
        return this.configurationModule.isAutofillEnabled();
    }

    public void saveProfileData(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        UserProfile userProfile = new UserProfile();
        UserProfile userProfile2 = new UserProfile();
        if (hasProfileData()) {
            userProfile2 = UserProfile.fromJson(this.secureStore.retrieve(USER_PROFILE_KEY));
        }
        if (userProfile2 == null) {
            userProfile2 = new UserProfile();
        }
        if (map.containsKey(AutofillModel.FIRST_NAME)) {
            str = map.get(AutofillModel.FIRST_NAME);
        } else {
            str = userProfile2.getFirstName();
        }
        userProfile.setFirstName(str);
        if (map.containsKey(AutofillModel.LAST_NAME)) {
            str2 = map.get(AutofillModel.LAST_NAME);
        } else {
            str2 = userProfile2.getLastName();
        }
        userProfile.setLastName(str2);
        if (map.containsKey(AutofillModel.EMAIL)) {
            str3 = map.get(AutofillModel.EMAIL);
        } else {
            str3 = userProfile2.getEmail();
        }
        userProfile.setEmail(str3);
        if (map.containsKey(AutofillModel.PHONE_NUMBER)) {
            str4 = map.get(AutofillModel.PHONE_NUMBER);
        } else {
            str4 = userProfile2.getPhoneNumber();
        }
        userProfile.setPhoneNumber(str4);
        if (map.containsKey(AutofillModel.ADDRESS_LINE_ONE)) {
            str5 = map.get(AutofillModel.ADDRESS_LINE_ONE);
        } else {
            str5 = userProfile2.getAddressLineOne();
        }
        userProfile.setAddressLineOne(str5);
        if (map.containsKey(AutofillModel.ADDRESS_LINE_TWO)) {
            str6 = map.get(AutofillModel.ADDRESS_LINE_TWO);
        } else {
            str6 = userProfile2.getAddressLineTwo();
        }
        userProfile.setAddressLineTwo(str6);
        if (map.containsKey(AutofillModel.CITY)) {
            str7 = map.get(AutofillModel.CITY);
        } else {
            str7 = userProfile2.getCity();
        }
        userProfile.setCity(str7);
        if (map.containsKey(AutofillModel.STATE)) {
            str8 = map.get(AutofillModel.STATE);
        } else {
            str8 = userProfile2.getState();
        }
        userProfile.setState(str8);
        if (map.containsKey(AutofillModel.POSTAL_CODE)) {
            str9 = map.get(AutofillModel.POSTAL_CODE);
        } else {
            str9 = userProfile2.getPostalCode();
        }
        userProfile.setPostalCode(str9);
        if (map.containsKey(AutofillModel.COUNTRY)) {
            str10 = map.get(AutofillModel.COUNTRY);
        } else {
            str10 = userProfile2.getCountry();
        }
        userProfile.setCountry(str10);
        if (map.containsKey(AutofillModel.BILLING_ADDRESS_LINE_ONE)) {
            str11 = map.get(AutofillModel.BILLING_ADDRESS_LINE_ONE);
        } else {
            str11 = userProfile2.getBillingAddressLineOne();
        }
        userProfile.setBillingAddressLineOne(str11);
        if (map.containsKey(AutofillModel.BILLING_ADDRESS_LINE_TWO)) {
            str12 = map.get(AutofillModel.BILLING_ADDRESS_LINE_TWO);
        } else {
            str12 = userProfile2.getBillingAddressLineTwo();
        }
        userProfile.setBillingAddressLineTwo(str12);
        if (map.containsKey(AutofillModel.BILLING_CITY)) {
            str13 = map.get(AutofillModel.BILLING_CITY);
        } else {
            str13 = userProfile2.getBillingCity();
        }
        userProfile.setBillingCity(str13);
        if (map.containsKey(AutofillModel.BILLING_STATE)) {
            str14 = map.get(AutofillModel.BILLING_STATE);
        } else {
            str14 = userProfile2.getBillingState();
        }
        userProfile.setBillingState(str14);
        if (map.containsKey(AutofillModel.BILLING_POSTAL_CODE)) {
            str15 = map.get(AutofillModel.BILLING_POSTAL_CODE);
        } else {
            str15 = userProfile2.getBillingPostalCode();
        }
        userProfile.setBillingPostalCode(str15);
        if (map.containsKey(AutofillModel.BILLING_COUNTRY)) {
            str16 = map.get(AutofillModel.BILLING_COUNTRY);
        } else {
            str16 = userProfile2.getBillingCountry();
        }
        userProfile.setBillingCountry(str16);
        this.secureStore.save(USER_PROFILE_KEY, userProfile.toJson());
    }

    public void setAddressLineOne(String str) {
        if (!hasProfileFieldSet(AutofillModel.ADDRESS_LINE_ONE)) {
            updateUserProfile(AutofillModel.ADDRESS_LINE_ONE, str);
        }
    }

    public void setAddressLineTwo(String str) {
        if (!hasProfileFieldSet(AutofillModel.ADDRESS_LINE_TWO)) {
            updateUserProfile(AutofillModel.ADDRESS_LINE_TWO, str);
        }
    }

    public void setAutofillEnabled(boolean z) {
        this.configurationModule.setAutofillEnabled(z);
    }

    public void setCity(String str) {
        if (!hasProfileFieldSet(AutofillModel.CITY)) {
            updateUserProfile(AutofillModel.CITY, str);
        }
    }

    public void setEmail(String str) {
        if (!hasProfileFieldSet(AutofillModel.EMAIL)) {
            updateUserProfile(AutofillModel.EMAIL, str);
        }
    }

    public void setFirstName(String str) {
        if (!hasProfileFieldSet(AutofillModel.FIRST_NAME)) {
            updateUserProfile(AutofillModel.FIRST_NAME, str);
        }
    }

    public void setIdentifier(String str) {
        ButtonPrivate button = ButtonPrivate.getButton();
        if (button != null) {
            button.setUserIdentifier(str);
        } else {
            this.preConfigurationUserIdentifier = str;
        }
    }

    public void setLastName(String str) {
        if (!hasProfileFieldSet(AutofillModel.LAST_NAME)) {
            updateUserProfile(AutofillModel.LAST_NAME, str);
        }
    }

    public void setPaymentMethodProvider(PaymentMethodProvider paymentMethodProvider2) {
        this.paymentMethodProvider = paymentMethodProvider2;
    }

    public void setPaymentMethodReceiver(PaymentMethodReceiver paymentMethodReceiver2) {
        this.paymentMethodReceiver = paymentMethodReceiver2;
    }

    public void setPhoneNumber(String str) {
        if (!hasProfileFieldSet(AutofillModel.PHONE_NUMBER)) {
            updateUserProfile(AutofillModel.PHONE_NUMBER, str);
        }
    }

    public void setPostalCode(String str) {
        if (!hasProfileFieldSet(AutofillModel.POSTAL_CODE)) {
            updateUserProfile(AutofillModel.POSTAL_CODE, str);
        }
    }

    public void setPreConfigurationUserIdentifier(String str) {
        this.preConfigurationUserIdentifier = str;
    }

    public void setState(String str) {
        if (!hasProfileFieldSet(AutofillModel.STATE)) {
            updateUserProfile(AutofillModel.STATE, str);
        }
    }
}
