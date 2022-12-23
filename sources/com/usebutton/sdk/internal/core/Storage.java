package com.usebutton.sdk.internal.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.usebutton.sdk.internal.ConfigurationUpdatePolicy;
import com.usebutton.sdk.internal.models.BrowserCardType;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.ButtonLog;
import org.json.JSONException;
import org.json.JSONObject;

public class Storage {
    private static final String KEY_CONFIGURATION = "configuration";
    private static final String KEY_CONFIG_TIME_OF_LAST_CHECK_IN_MS = "config-time-of-last-check-in-ms";
    private static final String KEY_EVENT_SEQ_NUMBER = "event-sequence-number";
    private static final String KEY_EXCEPTION = "exception";
    private static final String KEY_EXCEPTION_TIME = "exception-time";
    private static final String KEY_INSTANT_REWARD_CARD_DISPLAY_COUNT = "instant-reward-card-display-count";
    private static final String KEY_LAST_EVENT_REPORT_MS = "last-event-report-ms";
    private static final String KEY_PREFERRED_GROUP = "preferred-group";
    private static final String KEY_REWARD_ELIGIBLE_CARD_DISPLAY_COUNT = "reward-eligible-card-display-count";
    private static final String KEY_REWARD_INELIGIBLE_CARD_DISPLAY_COUNT = "reward-ineligible-card-display-count";
    private static final String KEY_SESSION_ID = "session-id";
    private static final String KEY_USER_IDENTIFIER = "user-identifier";
    private static final String KEY_WEB_VIEW_JS_VERSION = "web-view-js-version";
    private static final String TAG = "Storage";
    private final String applicationId;
    private final SharedPreferences prefs;

    /* renamed from: com.usebutton.sdk.internal.core.Storage$1 */
    public static /* synthetic */ class C123171 {
        public static final /* synthetic */ int[] $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.usebutton.sdk.internal.models.BrowserCardType[] r0 = com.usebutton.sdk.internal.models.BrowserCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType = r0
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.INSTANT_REWARDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.PREDICTABLE_REWARDS_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.PREDICTABLE_REWARDS_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.core.Storage.C123171.<clinit>():void");
        }
    }

    public Storage(Context context, String str) {
        this.prefs = context.getSharedPreferences("btnprefs", 0);
        this.applicationId = str;
    }

    private String getCardTypeKey(BrowserCardType browserCardType) {
        int i = C123171.$SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType[browserCardType.ordinal()];
        if (i == 1) {
            return KEY_INSTANT_REWARD_CARD_DISPLAY_COUNT;
        }
        if (i == 2) {
            return KEY_REWARD_INELIGIBLE_CARD_DISPLAY_COUNT;
        }
        if (i != 3) {
            return null;
        }
        return KEY_REWARD_ELIGIBLE_CARD_DISPLAY_COUNT;
    }

    private long getLong(String str) {
        return this.prefs.getLong(keyFor(str), 0);
    }

    private String getString(String str) {
        return this.prefs.getString(keyFor(str), (String) null);
    }

    private String keyFor(String str) {
        return String.format("%s.%s", new Object[]{this.applicationId, str});
    }

    private String promotionKey(String str, String str2) {
        return String.format("%s-%s", new Object[]{keyFor(str), str2});
    }

    private void putLong(String str, long j) {
        this.prefs.edit().putLong(keyFor(str), j).apply();
    }

    private void putString(String str, String str2) {
        this.prefs.edit().putString(keyFor(str), str2).apply();
    }

    public void clear() {
        this.prefs.edit().clear().apply();
    }

    public void clearException() {
        this.prefs.edit().remove(keyFor(KEY_EXCEPTION)).apply();
    }

    public int getAndIncrementEventSequenceNumber() {
        int i = this.prefs.getInt(KEY_EVENT_SEQ_NUMBER, 0);
        this.prefs.edit().putInt(KEY_EVENT_SEQ_NUMBER, i + 1).apply();
        return i;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public ConfigurationUpdatePolicy.State getConfigState() {
        return new ConfigurationUpdatePolicy.State(getLong(KEY_CONFIG_TIME_OF_LAST_CHECK_IN_MS));
    }

    public Configuration getConfiguration() {
        String string = getString(KEY_CONFIGURATION);
        if (string != null && !string.isEmpty()) {
            try {
                return new Configuration(new JSONObject(string));
            } catch (JSONException e) {
                ButtonLog.warn(TAG, "Could not restore configuration from " + string, e);
            }
        }
        return null;
    }

    public String getException() {
        return getString(KEY_EXCEPTION);
    }

    public long getExceptionTime() {
        return getLong(KEY_EXCEPTION_TIME);
    }

    public int getInternalRewardCardDisplayCount(BrowserCardType browserCardType) {
        String cardTypeKey = getCardTypeKey(browserCardType);
        if (cardTypeKey != null) {
            return this.prefs.getInt(keyFor(cardTypeKey), 0);
        }
        return 0;
    }

    public String getPreferredInventoryGroup(String str) {
        return this.prefs.getString(promotionKey(str, KEY_PREFERRED_GROUP), (String) null);
    }

    public String getSessionId() {
        return getString(KEY_SESSION_ID);
    }

    public long getTimeOfLastEventReport() {
        return getLong(KEY_LAST_EVENT_REPORT_MS);
    }

    public String getUserIdentifier() {
        return getString(KEY_USER_IDENTIFIER);
    }

    public String getWebViewJsVersion() {
        return getString(KEY_WEB_VIEW_JS_VERSION);
    }

    public void markDidRemoteLog() {
        putLong(KEY_EXCEPTION_TIME, System.currentTimeMillis());
    }

    public void setConfigState(ConfigurationUpdatePolicy.State state) {
        putLong(KEY_CONFIG_TIME_OF_LAST_CHECK_IN_MS, state.getTimeOfLastCheckInMs());
    }

    public void setConfiguration(Configuration configuration) {
        putString(KEY_CONFIGURATION, configuration.getJsonString());
    }

    public void setInternalRewardCardDisplayCount(BrowserCardType browserCardType, int i) {
        String cardTypeKey = getCardTypeKey(browserCardType);
        if (cardTypeKey != null) {
            this.prefs.edit().putInt(keyFor(cardTypeKey), i).apply();
        }
    }

    public void setPreferredInventoryGroup(String str, String str2) {
        this.prefs.edit().putString(promotionKey(str, KEY_PREFERRED_GROUP), str2).apply();
    }

    public void setSessionId(String str) {
        putString(KEY_SESSION_ID, str);
    }

    public void setTimeOfLastEventReport(long j) {
        putLong(KEY_LAST_EVENT_REPORT_MS, j);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setUserIdentifier(String str) {
        putString(KEY_USER_IDENTIFIER, str);
    }

    public void setWebViewJsVersion(String str) {
        putString(KEY_WEB_VIEW_JS_VERSION, str);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void storeException(String str) {
        this.prefs.edit().putString(keyFor(KEY_EXCEPTION), str).commit();
    }
}
