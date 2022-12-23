package com.appboy;

import androidx.annotation.Keep;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import p030bo.app.C1558d4;
import p030bo.app.C1587g4;
import p030bo.app.C1594h2;
import p030bo.app.C1604i4;
import p030bo.app.C1643n2;
import p030bo.app.C1687s2;
import p030bo.app.C1707v1;
import p030bo.app.C1735y1;

@Keep
public class AppboyUser {
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyUser.class);
    public final C1707v1 mBrazeManager;
    public final C1735y1 mLocationManager;
    public final C1558d4 mServerConfigStorageProvider;
    public final C1587g4 mUserCache;
    public volatile String mUserId;
    public final Object mUserIdLock = new Object();

    public AppboyUser(C1587g4 g4Var, C1707v1 v1Var, String str, C1735y1 y1Var, C1558d4 d4Var) {
        this.mUserId = str;
        this.mUserCache = g4Var;
        this.mLocationManager = y1Var;
        this.mServerConfigStorageProvider = d4Var;
        this.mBrazeManager = v1Var;
    }

    public boolean addAlias(String str, String str2) {
        if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.");
            return false;
        } else if (StringUtils.isNullOrBlank(str2)) {
            AppboyLogger.m5459w(TAG, "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.");
            return false;
        } else {
            try {
                return this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4714f(str, str2));
            } catch (Exception e) {
                String str3 = TAG;
                AppboyLogger.m5452e(str3, "Failed to set alias: " + str, e);
                return false;
            }
        }
    }

    public boolean addToCustomAttributeArray(String str, String str2) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                AppboyLogger.m5459w(TAG, "Custom attribute key was invalid. Not adding to attribute array.");
                return false;
            } else if (!C1604i4.m4314a(str2)) {
                return false;
            } else {
                return this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4696a(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2)));
            }
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5460w(str3, "Failed to add custom attribute with key '" + str + "'.", e);
            return false;
        }
    }

    public String getUserId() {
        String str;
        synchronized (this.mUserIdLock) {
            str = this.mUserId;
        }
        return str;
    }

    public boolean incrementCustomUserAttribute(String str) {
        return incrementCustomUserAttribute(str, 1);
    }

    public boolean removeFromCustomAttributeArray(String str, String str2) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                AppboyLogger.m5459w(TAG, "Custom attribute key was invalid. Not removing from attribute array.");
                return false;
            } else if (!C1604i4.m4314a(str2)) {
                return false;
            } else {
                return this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4712e(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength(str2)));
            }
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5460w(str3, "Failed to remove custom attribute with key '" + str + "'.", e);
            return false;
        }
    }

    public boolean setAttributionData(AttributionData attributionData) {
        try {
            this.mUserCache.mo6089a(attributionData);
            return true;
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to set attribution data.", e);
            return false;
        }
    }

    public boolean setAvatarImageUrl(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid avatar image URL parameter: avatar image URL is required to be non-empty. Not setting avatar image URL.");
                return false;
            }
            this.mUserCache.mo6092a(str);
            return true;
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to set the avatar image URL.", e);
            return false;
        }
    }

    public boolean setCountry(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid country parameter: country is required to be non-empty. Not setting country.");
                return false;
            }
            this.mUserCache.mo6100b(str);
            return true;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set country to: " + str, e);
            return false;
        }
    }

    public boolean setCustomAttributeArray(String str, String[] strArr) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                return false;
            }
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
            if (strArr != null) {
                strArr = C1604i4.m4316a(strArr);
            }
            return this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4698a(ensureBrazeFieldLength, strArr));
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "Failed to set custom attribute array with key: '" + str + "'.");
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, boolean z) {
        try {
            return this.mUserCache.mo6096a(str, (Object) Boolean.valueOf(z));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom boolean attribute " + str + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttributeToNow(String str) {
        try {
            return this.mUserCache.mo6095a(str, DateTimeUtils.nowInSeconds());
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom attribute " + str + " to now.", e);
            return false;
        }
    }

    public boolean setCustomUserAttributeToSecondsFromEpoch(String str, long j) {
        try {
            return this.mUserCache.mo6095a(str, j);
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom attribute " + str + " to " + j + " seconds from epoch.", e);
            return false;
        }
    }

    public boolean setDateOfBirth(int i, Month month, int i2) {
        try {
            return this.mUserCache.mo6094a(i, month, i2);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder r = C25541a.m63887r("Failed to set date of birth to: ", i, "-");
            r.append(month.getValue());
            r.append("-");
            r.append(i2);
            AppboyLogger.m5460w(str, r.toString(), e);
            return false;
        }
    }

    public boolean setEmail(String str) {
        try {
            if (!StringUtils.isBlank(str)) {
                return this.mUserCache.mo6104c(str);
            }
            AppboyLogger.m5459w(TAG, "Invalid email parameter: email is required to be non-empty. Not setting email.");
            return false;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set email to: " + str, e);
            return false;
        }
    }

    public boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        try {
            this.mUserCache.mo6088a(notificationSubscriptionType);
            return true;
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5460w(str, "Failed to set email notification subscription to: " + notificationSubscriptionType, e);
            return false;
        }
    }

    public boolean setFacebookData(FacebookUser facebookUser) {
        try {
            this.mUserCache.mo6090a(facebookUser);
            return true;
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to set Facebook user data.", e);
            return false;
        }
    }

    public boolean setFirstName(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid first name parameter: first name is required to be non-empty. Not setting first name.");
                return false;
            }
            this.mUserCache.mo6107d(str);
            return true;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set first name to: " + str, e);
            return false;
        }
    }

    public boolean setGender(Gender gender) {
        try {
            this.mUserCache.mo6087a(gender);
            return true;
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5460w(str, "Failed to set gender to: " + gender, e);
            return false;
        }
    }

    public boolean setHomeCity(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid home city parameter: home city is required to be non-empty. Not setting home city.");
                return false;
            }
            this.mUserCache.mo6109e(str);
            return true;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set home city to: " + str, e);
            return false;
        }
    }

    public boolean setLanguage(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid language parameter: language is required to be non-empty. Not setting language.");
                return false;
            }
            this.mUserCache.mo6111f(str);
            return true;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set language to: " + str, e);
            return false;
        }
    }

    public void setLastKnownLocation(double d, double d2, Double d3, Double d4) {
        try {
            this.mLocationManager.mo6221a(new C1643n2(d, d2, d3, d4));
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to manually set location.", e);
        }
    }

    public boolean setLastName(String str) {
        try {
            if (StringUtils.isBlank(str)) {
                AppboyLogger.m5459w(TAG, "Invalid last name parameter: last name is required to be non-empty. Not setting last name.");
                return false;
            }
            this.mUserCache.mo6113g(str);
            return true;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set last name to: " + str, e);
            return false;
        }
    }

    public void setLocationCustomAttribute(String str, double d, double d2) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                AppboyLogger.m5459w(TAG, "Custom location attribute key was invalid. Not setting attribute.");
            } else if (!ValidationUtils.isValidLocation(d, d2)) {
                String str2 = TAG;
                AppboyLogger.m5459w(str2, "Cannot set custom location attribute due with invalid latitude '" + d + " and longitude '" + d2 + "'");
            } else {
                this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4691a(ValidationUtils.ensureBrazeFieldLength(str), d, d2));
            }
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5460w(str3, "Failed to set custom location attribute with key '" + str + "' and latitude '" + d + "' and longitude '" + d2 + "'", e);
        }
    }

    public boolean setPhoneNumber(String str) {
        try {
            if (!StringUtils.isBlank(str)) {
                return this.mUserCache.mo6115h(str);
            }
            AppboyLogger.m5459w(TAG, "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.");
            return false;
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set phone number to: " + str, e);
            return false;
        }
    }

    public boolean setPushNotificationSubscriptionType(NotificationSubscriptionType notificationSubscriptionType) {
        try {
            this.mUserCache.mo6098b(notificationSubscriptionType);
            return true;
        } catch (Exception e) {
            String str = TAG;
            AppboyLogger.m5460w(str, "Failed to set push notification subscription to: " + notificationSubscriptionType, e);
            return false;
        }
    }

    public boolean setTwitterData(TwitterUser twitterUser) {
        try {
            this.mUserCache.mo6091a(twitterUser);
            return true;
        } catch (Exception e) {
            AppboyLogger.m5460w(TAG, "Failed to set Twitter user data.", e);
            return false;
        }
    }

    public void setUserId(String str) {
        synchronized (this.mUserIdLock) {
            if (!this.mUserId.equals("")) {
                if (!this.mUserId.equals(str)) {
                    throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.mUserId + "], tried to change to: [" + str + "]");
                }
            }
            this.mUserId = str;
            this.mUserCache.mo6116i(str);
        }
    }

    public boolean unsetCustomUserAttribute(String str) {
        try {
            return this.mUserCache.mo6117j(str);
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to unset custom attribute " + str + ".", e);
            return false;
        }
    }

    public void unsetLocationCustomAttribute(String str) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                AppboyLogger.m5459w(TAG, "Custom location attribute key was invalid. Not setting attribute.");
                return;
            }
            this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4720l(ValidationUtils.ensureBrazeFieldLength(str)));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to unset custom location attribute with key '" + str + "'", e);
        }
    }

    public boolean incrementCustomUserAttribute(String str, int i) {
        try {
            if (!C1604i4.m4315a(str, this.mServerConfigStorageProvider.mo6006b())) {
                return false;
            }
            return this.mBrazeManager.mo6243b((C1594h2) C1687s2.m4692a(ValidationUtils.ensureBrazeFieldLength(str), i));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to increment custom attribute " + str + " by " + i + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, int i) {
        try {
            return this.mUserCache.mo6096a(str, (Object) Integer.valueOf(i));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom integer attribute " + str + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, float f) {
        try {
            return this.mUserCache.mo6096a(str, (Object) Float.valueOf(f));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom float attribute " + str + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, long j) {
        try {
            return this.mUserCache.mo6096a(str, (Object) Long.valueOf(j));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom long attribute " + str + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, String str2) {
        try {
            return this.mUserCache.mo6096a(str, (Object) str2);
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5460w(str3, "Failed to set custom string attribute " + str + ".", e);
            return false;
        }
    }

    public boolean setCustomUserAttribute(String str, double d) {
        try {
            return this.mUserCache.mo6096a(str, (Object) Double.valueOf(d));
        } catch (Exception e) {
            String str2 = TAG;
            AppboyLogger.m5460w(str2, "Failed to set custom double attribute " + str + ".", e);
            return false;
        }
    }
}
