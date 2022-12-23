package com.unity3d.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.appboy.support.StringUtils;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;

public class UnityServices {

    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private static String createExpectedParametersString(String str, Object obj, Object obj2) {
        String str2;
        String str3 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        if (obj == null) {
            str2 = str3;
        } else {
            str2 = obj.toString();
        }
        if (obj2 != null) {
            str3 = obj2.toString();
        }
        StringBuilder h = C16759e.m42352h("\n - ", str, " Current: ", str2, " | Received: ");
        h.append(str3);
        return h.toString();
    }

    public static boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static String getVersion() {
        return SdkProperties.getVersionName();
    }

    public static void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        if (SdkProperties.getCurrentInitializationState() != SdkProperties.InitializationState.NOT_INITIALIZED) {
            String str2 = "";
            String gameId = ClientProperties.getGameId();
            if (gameId != null && !gameId.equals(str)) {
                StringBuilder k = C13555b.m33972k(str2);
                k.append(createExpectedParametersString("Game ID", ClientProperties.getGameId(), str));
                str2 = k.toString();
            }
            boolean isTestMode = SdkProperties.isTestMode();
            if (isTestMode != z) {
                StringBuilder k2 = C13555b.m33972k(str2);
                k2.append(createExpectedParametersString("Test Mode", Boolean.valueOf(isTestMode), Boolean.valueOf(z)));
                str2 = k2.toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                String str3 = "Unity Ads SDK failed to initialize due to already being initialized with different parameters" + str2;
                DeviceLog.warning(str3);
                if (iUnityAdsInitializationListener != null) {
                    iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, str3);
                    return;
                }
                return;
            }
        }
        SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
        if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY) {
            SdkProperties.notifyInitializationComplete();
        } else if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_FAILED) {
            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
        } else {
            SdkProperties.InitializationState currentInitializationState = SdkProperties.getCurrentInitializationState();
            SdkProperties.InitializationState initializationState = SdkProperties.InitializationState.INITIALIZING;
            if (currentInitializationState != initializationState) {
                SdkProperties.setInitializeState(initializationState);
                ClientProperties.setGameId(str);
                SdkProperties.setTestMode(z);
                if (!isSupported()) {
                    DeviceLog.error("Error while initializing Unity Services: device is not supported");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to device is not supported");
                    return;
                }
                SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                if (str == null || str.length() == 0) {
                    DeviceLog.error("Error while initializing Unity Services: empty game ID, halting Unity Ads init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to empty game ID");
                } else if (context == null) {
                    DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to null context");
                } else {
                    if (context instanceof Application) {
                        ClientProperties.setApplication((Application) context);
                    } else if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.getApplication() != null) {
                            ClientProperties.setApplication(activity.getApplication());
                        } else {
                            DeviceLog.error("Error while initializing Unity Services: cannot retrieve application from context, halting Unity Ads init");
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application from context");
                            return;
                        }
                    } else {
                        DeviceLog.error("Error while initializing Unity Services: invalid context, halting Unity Ads init");
                        SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
                        return;
                    }
                    if (z) {
                        StringBuilder k3 = C13555b.m33972k("Initializing Unity Services ");
                        k3.append(SdkProperties.getVersionName());
                        k3.append(" (");
                        k3.append(SdkProperties.getVersionCode());
                        k3.append(") with game id ");
                        k3.append(str);
                        k3.append(" in test mode");
                        DeviceLog.info(k3.toString());
                    } else {
                        StringBuilder k4 = C13555b.m33972k("Initializing Unity Services ");
                        k4.append(SdkProperties.getVersionName());
                        k4.append(" (");
                        k4.append(SdkProperties.getVersionCode());
                        k4.append(") with game id ");
                        k4.append(str);
                        k4.append(" in production mode");
                        DeviceLog.info(k4.toString());
                    }
                    SdkProperties.setDebugMode(SdkProperties.getDebugMode());
                    if (context.getApplicationContext() != null) {
                        ClientProperties.setApplicationContext(context.getApplicationContext());
                        if (!EnvironmentCheck.isEnvironmentOk()) {
                            DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                            return;
                        }
                        DeviceLog.info("Unity Services environment check OK");
                        InitializeThread.initialize(new Configuration());
                        return;
                    }
                    DeviceLog.error("Error while initializing Unity Services: cannot retrieve application context, halting Unity Ads init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application context");
                }
            }
        }
    }

    public static boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static boolean isSupported() {
        return true;
    }

    public static void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }
}
