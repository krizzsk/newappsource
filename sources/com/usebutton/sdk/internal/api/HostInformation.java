package com.usebutton.sdk.internal.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.usebutton.sdk.BuildConfig;
import com.usebutton.sdk.internal.ConfigurationOverride;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.ReflectionUtils;
import java.util.Locale;

public class HostInformation {
    private static final ConfigurationOverride DEFAULT_CONFIGURATION = new ConfigurationOverride() {
        public String getBaseUrl() {
            return BuildConfig.BASE_URL_DLC;
        }
    };
    private String mApplicationId;
    private final ConfigurationOverride mConfigurationOverride = ((ConfigurationOverride) ReflectionUtils.instantiate("com.usebutton.sdk.ButtonConfig", ConfigurationOverride.class));
    private final float mDensity;
    private final PackageInfo mHostApplication;
    private final String mUserAgent;

    public HostInformation(Context context, String str) {
        this.mHostApplication = ButtonUtil.getPackageInfo(context, 0);
        this.mDensity = context.getResources().getDisplayMetrics().density;
        this.mUserAgent = new ApiUtil(this).getUserAgent();
        this.mApplicationId = str;
    }

    public String getAndroidVersionName() {
        return Build.VERSION.RELEASE;
    }

    public String getApplicationId() {
        return this.mApplicationId;
    }

    public ConfigurationOverride getConfiguration() {
        ConfigurationOverride configurationOverride = this.mConfigurationOverride;
        return configurationOverride != null ? configurationOverride : DEFAULT_CONFIGURATION;
    }

    public String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getDeviceModel() {
        return Build.MODEL;
    }

    public Locale getLocale() {
        return Locale.getDefault();
    }

    public String getPackageName() {
        return this.mHostApplication.packageName;
    }

    public float getScreenDensity() {
        return this.mDensity;
    }

    public String getSdkGitHash() {
        return "";
    }

    public int getSdkVersionCode() {
        return 1;
    }

    public String getSdkVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public String getUserAgent() {
        return this.mUserAgent;
    }

    public int getVersionCode() {
        return this.mHostApplication.versionCode;
    }

    public String getVersionName() {
        return this.mHostApplication.versionName;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("HostInformation{mHostApplication=");
        k.append(this.mHostApplication);
        k.append(", mConfigurationOverride=");
        k.append(this.mConfigurationOverride);
        k.append(", mUserAgent='");
        C25541a.m63890u(k, this.mUserAgent, '\'', ", mApplicationId='");
        C25541a.m63890u(k, this.mApplicationId, '\'', ", mDensity='");
        k.append(this.mDensity);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
