package com.unity3d.services.core.configuration;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EnvironmentCheck {
    private static boolean hasJavascriptInterface(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testCacheDirectory() {
        if (SdkProperties.getCacheDirectory() != null) {
            DeviceLog.debug("Unity Ads cache directory check OK");
            return true;
        }
        DeviceLog.error("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    public static boolean testProGuard() {
        Class<String> cls = String.class;
        Class<WebViewBridgeInterface> cls2 = WebViewBridgeInterface.class;
        try {
            Method method = cls2.getMethod("handleInvocation", new Class[]{cls});
            Method method2 = cls2.getMethod("handleCallback", new Class[]{cls, cls, cls});
            if (!hasJavascriptInterface(method) || !hasJavascriptInterface(method2)) {
                DeviceLog.error("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
                return false;
            }
            DeviceLog.debug("Unity Ads ProGuard check OK");
            return true;
        } catch (ClassNotFoundException e) {
            DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", e);
            return false;
        } catch (NoSuchMethodException e2) {
            DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", e2);
            return false;
        } catch (Exception e3) {
            StringBuilder k = C13555b.m33972k("Unknown exception during Unity Ads ProGuard check: ");
            k.append(e3.getMessage());
            DeviceLog.exception(k.toString(), e3);
            return true;
        }
    }
}
