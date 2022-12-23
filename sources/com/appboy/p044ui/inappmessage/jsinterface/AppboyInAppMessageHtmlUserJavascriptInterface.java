package com.appboy.p044ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.events.SimpleValueCallback;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;
import com.braze.BrazeUser;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appboy.ui.inappmessage.jsinterface.AppboyInAppMessageHtmlUserJavascriptInterface */
public class AppboyInAppMessageHtmlUserJavascriptInterface {
    public static final String JS_BRIDGE_GENDER_FEMALE = Gender.FEMALE.forJsonPut();
    public static final String JS_BRIDGE_GENDER_MALE = Gender.MALE.forJsonPut();
    public static final String JS_BRIDGE_GENDER_NOT_APPLICABLE = Gender.NOT_APPLICABLE.forJsonPut();
    public static final String JS_BRIDGE_GENDER_OTHER = Gender.OTHER.forJsonPut();
    public static final String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY = Gender.PREFER_NOT_TO_SAY.forJsonPut();
    public static final String JS_BRIDGE_GENDER_UNKNOWN = Gender.UNKNOWN.forJsonPut();
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageHtmlUserJavascriptInterface.class);
    private final Context mContext;

    public AppboyInAppMessageHtmlUserJavascriptInterface(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void addAlias(final String str, final String str2) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.addAlias(str, str2);
            }
        });
    }

    @JavascriptInterface
    public void addToCustomAttributeArray(final String str, final String str2) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.addToCustomAttributeArray(str, str2);
            }
        });
    }

    @JavascriptInterface
    public void incrementCustomUserAttribute(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.incrementCustomUserAttribute(str);
            }
        });
    }

    public Month monthFromInt(int i) {
        if (i < 1 || i > 12) {
            return null;
        }
        return Month.getMonth(i - 1);
    }

    public Gender parseGender(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals(JS_BRIDGE_GENDER_MALE)) {
            return Gender.MALE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_FEMALE)) {
            return Gender.FEMALE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_OTHER)) {
            return Gender.OTHER;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_UNKNOWN)) {
            return Gender.UNKNOWN;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_NOT_APPLICABLE)) {
            return Gender.NOT_APPLICABLE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY)) {
            return Gender.PREFER_NOT_TO_SAY;
        }
        return null;
    }

    public String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to parse custom attribute array", e);
            return null;
        }
    }

    @JavascriptInterface
    public void removeFromCustomAttributeArray(final String str, final String str2) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.removeFromCustomAttributeArray(str, str2);
            }
        });
    }

    @JavascriptInterface
    public void setCountry(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setCountry(str);
            }
        });
    }

    public void setCustomAttribute(BrazeUser brazeUser, String str, String str2) {
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                brazeUser.setCustomUserAttribute(str, (String) obj);
            } else if (obj instanceof Boolean) {
                brazeUser.setCustomUserAttribute(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                brazeUser.setCustomUserAttribute(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                brazeUser.setCustomUserAttribute(str, ((Double) obj).doubleValue());
            } else {
                String str3 = TAG;
                AppboyLogger.m5459w(str3, "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, C25541a.m63882l("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2), e);
        }
    }

    @JavascriptInterface
    public void setCustomLocationAttribute(String str, double d, double d2) {
        final String str2 = str;
        final double d3 = d;
        final double d4 = d2;
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setLocationCustomAttribute(str2, d3, d4);
            }
        });
    }

    @JavascriptInterface
    public void setCustomUserAttributeArray(final String str, String str2) {
        final String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(str2);
        if (parseStringArrayFromJsonString == null) {
            String str3 = TAG;
            AppboyLogger.m5459w(str3, "Failed to set custom attribute array for key " + str);
            return;
        }
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setCustomAttributeArray(str, parseStringArrayFromJsonString);
            }
        });
    }

    @JavascriptInterface
    public void setCustomUserAttributeJSON(final String str, final String str2) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>() {
            public void onSuccess(BrazeUser brazeUser) {
                AppboyInAppMessageHtmlUserJavascriptInterface.this.setCustomAttribute(brazeUser, str, str2);
            }
        });
    }

    @JavascriptInterface
    public void setDateOfBirth(final int i, int i2, final int i3) {
        final Month monthFromInt = monthFromInt(i2);
        if (monthFromInt == null) {
            String str = TAG;
            AppboyLogger.m5459w(str, "Failed to parse month for value " + i2);
            return;
        }
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setDateOfBirth(i, monthFromInt, i3);
            }
        });
    }

    @JavascriptInterface
    public void setEmail(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setEmail(str);
            }
        });
    }

    @JavascriptInterface
    public void setEmailNotificationSubscriptionType(String str) {
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str);
            return;
        }
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setEmailNotificationSubscriptionType(subscriptionTypeFromJavascriptString);
            }
        });
    }

    @JavascriptInterface
    public void setFirstName(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setFirstName(str);
            }
        });
    }

    @JavascriptInterface
    public void setGender(String str) {
        final Gender parseGender = parseGender(str);
        if (parseGender == null) {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str);
            return;
        }
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setGender(parseGender);
            }
        });
    }

    @JavascriptInterface
    public void setHomeCity(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setHomeCity(str);
            }
        });
    }

    @JavascriptInterface
    public void setLanguage(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setLanguage(str);
            }
        });
    }

    @JavascriptInterface
    public void setLastName(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setLastName(str);
            }
        });
    }

    @JavascriptInterface
    public void setPhoneNumber(final String str) {
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setPhoneNumber(str);
            }
        });
    }

    @JavascriptInterface
    public void setPushNotificationSubscriptionType(String str) {
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str);
            return;
        }
        Braze.getInstance(this.mContext).getCurrentUser(new SimpleValueCallback<BrazeUser>(this) {
            public void onSuccess(BrazeUser brazeUser) {
                brazeUser.setPushNotificationSubscriptionType(subscriptionTypeFromJavascriptString);
            }
        });
    }

    public NotificationSubscriptionType subscriptionTypeFromJavascriptString(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1219769254:
                if (lowerCase.equals("subscribed")) {
                    c = 0;
                    break;
                }
                break;
            case -83053070:
                if (lowerCase.equals("opted_in")) {
                    c = 1;
                    break;
                }
                break;
            case 901853107:
                if (lowerCase.equals("unsubscribed")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NotificationSubscriptionType.SUBSCRIBED;
            case 1:
                return NotificationSubscriptionType.OPTED_IN;
            case 2:
                return NotificationSubscriptionType.UNSUBSCRIBED;
            default:
                return null;
        }
    }
}
