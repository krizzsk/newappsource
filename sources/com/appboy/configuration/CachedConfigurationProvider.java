package com.appboy.configuration;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p001a0.C0017h;
import p988j$.util.DesugarCollections;

@Keep
public class CachedConfigurationProvider {
    public static final String TAG = AppboyLogger.getBrazeLogTag(CachedConfigurationProvider.class);
    public final Map<String, Object> mConfigurationCache;
    public final Context mContext;
    public final RuntimeAppConfigurationProvider mRuntimeAppConfigurationProvider;
    public final boolean mUseConfigurationCache;

    public CachedConfigurationProvider(Context context) {
        this(context, true);
    }

    public boolean getBooleanValue(String str, boolean z) {
        if (this.mUseConfigurationCache && this.mConfigurationCache.containsKey(str)) {
            return ((Boolean) this.mConfigurationCache.get(str)).booleanValue();
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            boolean booleanValue = this.mRuntimeAppConfigurationProvider.getBooleanValue(str, z);
            this.mConfigurationCache.put(str, Boolean.valueOf(booleanValue));
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Using runtime override value for key: " + str + " and value: " + booleanValue);
            return booleanValue;
        }
        boolean readBooleanResourceValue = readBooleanResourceValue(str, z);
        this.mConfigurationCache.put(str, Boolean.valueOf(readBooleanResourceValue));
        String str3 = TAG;
        AppboyLogger.m5448d(str3, "Defaulting to using xml value for key: " + str + " and value: " + readBooleanResourceValue);
        return readBooleanResourceValue;
    }

    public Integer getColorValue(String str) {
        if (this.mUseConfigurationCache && this.mConfigurationCache.containsKey(str)) {
            return (Integer) this.mConfigurationCache.get(str);
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            int intValue = this.mRuntimeAppConfigurationProvider.getIntValue(str, 0);
            this.mConfigurationCache.put(str, Integer.valueOf(intValue));
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Using runtime override value for key: " + str + " and value: " + intValue);
            return Integer.valueOf(intValue);
        }
        Integer readColorResourceValue = readColorResourceValue(str);
        if (readColorResourceValue != null) {
            this.mConfigurationCache.put(str, readColorResourceValue);
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Defaulting to using xml value for key: " + str + " and value: " + readColorResourceValue);
        }
        return readColorResourceValue;
    }

    public int getIntValue(String str, int i) {
        if (this.mUseConfigurationCache && this.mConfigurationCache.containsKey(str)) {
            return ((Integer) this.mConfigurationCache.get(str)).intValue();
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            int intValue = this.mRuntimeAppConfigurationProvider.getIntValue(str, i);
            this.mConfigurationCache.put(str, Integer.valueOf(intValue));
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Using runtime override value for key: " + str + " and value: " + intValue);
            return intValue;
        }
        int readIntegerResourceValue = readIntegerResourceValue(str, i);
        this.mConfigurationCache.put(str, Integer.valueOf(readIntegerResourceValue));
        String str3 = TAG;
        AppboyLogger.m5448d(str3, "Defaulting to using xml value for key: " + str + " and value: " + readIntegerResourceValue);
        return readIntegerResourceValue;
    }

    public Set<String> getStringSetValue(String str, Set<String> set) {
        if (this.mUseConfigurationCache && this.mConfigurationCache.containsKey(str)) {
            return (Set) this.mConfigurationCache.get(str);
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            Set<String> stringSetValue = this.mRuntimeAppConfigurationProvider.getStringSetValue(str, set);
            this.mConfigurationCache.put(str, stringSetValue);
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Using runtime override value for key: " + str + " and value: " + stringSetValue);
            return stringSetValue;
        }
        String[] readStringArrayResourceValue = readStringArrayResourceValue(str, new String[0]);
        if (readStringArrayResourceValue.length != 0) {
            set = new HashSet<>(Arrays.asList(readStringArrayResourceValue));
        }
        this.mConfigurationCache.put(str, set);
        String str3 = TAG;
        AppboyLogger.m5448d(str3, "Defaulting to using xml value for key: " + str + " and value: " + set);
        return set;
    }

    public String getStringValue(String str, String str2) {
        if (this.mUseConfigurationCache && this.mConfigurationCache.containsKey(str)) {
            return (String) this.mConfigurationCache.get(str);
        }
        if (this.mRuntimeAppConfigurationProvider.containsKey(str)) {
            String stringValue = this.mRuntimeAppConfigurationProvider.getStringValue(str, str2);
            this.mConfigurationCache.put(str, stringValue);
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Using runtime override value for key: " + str + " and value: " + stringValue);
            return stringValue;
        }
        String readStringResourceValue = readStringResourceValue(str, str2);
        this.mConfigurationCache.put(str, readStringResourceValue);
        String str4 = TAG;
        AppboyLogger.m5448d(str4, "Defaulting to using xml value for key: " + str + " and value: " + readStringResourceValue);
        return readStringResourceValue;
    }

    public boolean readBooleanResourceValue(String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            int identifier = this.mContext.getResources().getIdentifier(str, "bool", PackageUtils.getResourcePackageName(this.mContext));
            if (identifier != 0) {
                return this.mContext.getResources().getBoolean(identifier);
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Unable to find the xml boolean configuration value with key " + str + ". Using default value '" + z + "'.");
            return z;
        } catch (Exception unused) {
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Unexpected exception retrieving the xml boolean configuration value with key " + str + ". Using default value " + z + "'.");
            return z;
        }
    }

    public Integer readColorResourceValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            int identifier = this.mContext.getResources().getIdentifier(str, "color", PackageUtils.getResourcePackageName(this.mContext));
            if (identifier != 0) {
                return Integer.valueOf(this.mContext.getResources().getColor(identifier));
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Unable to find the xml color configuration value with key " + str);
            return null;
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5452e(str3, "Unexpected exception retrieving the xml color configuration value with key " + str + ".", e);
            return null;
        }
    }

    public int readIntegerResourceValue(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            int identifier = this.mContext.getResources().getIdentifier(str, "integer", PackageUtils.getResourcePackageName(this.mContext));
            if (identifier != 0) {
                return this.mContext.getResources().getInteger(identifier);
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Unable to find the xml integer configuration value with key " + str + ". Using default value '" + i + "'.");
            return i;
        } catch (Exception unused) {
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Unexpected exception retrieving the xml integer configuration value with key " + str + ". Using default value " + i + "'.");
            return i;
        }
    }

    public String[] readStringArrayResourceValue(String str, String[] strArr) {
        if (str == null) {
            return strArr;
        }
        try {
            int identifier = this.mContext.getResources().getIdentifier(str, "array", PackageUtils.getResourcePackageName(this.mContext));
            if (identifier != 0) {
                return this.mContext.getResources().getStringArray(identifier);
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Unable to find the xml string array configuration value with key " + str + ". Using default value '" + Arrays.toString(strArr) + "'.");
            return strArr;
        } catch (Exception unused) {
            String str3 = TAG;
            StringBuilder l = C13555b.m33973l("Unexpected exception retrieving the xml string array configuration value with key ", str, ". Using default value ");
            l.append(Arrays.toString(strArr));
            l.append("'.");
            AppboyLogger.m5448d(str3, l.toString());
            return strArr;
        }
    }

    public String readStringResourceValue(String str, String str2) {
        if (str == null) {
            return str2;
        }
        try {
            int identifier = this.mContext.getResources().getIdentifier(str, "string", PackageUtils.getResourcePackageName(this.mContext));
            if (identifier != 0) {
                return this.mContext.getResources().getString(identifier);
            }
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Unable to find the xml string configuration value with key " + str + ". Using default value '" + str2 + "'.");
            return str2;
        } catch (Exception unused) {
            AppboyLogger.m5448d(TAG, C0017h.m56M("Unexpected exception retrieving the xml string configuration value with key ", str, ". Using default value ", str2, "'."));
            return str2;
        }
    }

    public CachedConfigurationProvider(Context context, boolean z) {
        this.mUseConfigurationCache = z;
        this.mContext = context;
        this.mConfigurationCache = DesugarCollections.synchronizedMap(new HashMap());
        this.mRuntimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(context);
    }
}
