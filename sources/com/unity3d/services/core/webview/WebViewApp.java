package com.unity3d.services.core.webview;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.support.WebContentUtils;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import p001a0.C0017h;

public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    /* access modifiers changed from: private */
    public static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private static AtomicReference<Boolean> _initialized = new AtomicReference<>(Boolean.FALSE);
    private static AtomicReference<Integer> _webAppFailureCode = new AtomicReference<>();
    private static AtomicReference<String> _webAppFailureMessage = new AtomicReference<>();
    private Configuration _configuration;
    private HashMap<String, NativeCallback> _nativeCallbacks;
    private boolean _webAppLoaded;
    private WebView _webView;

    public class WebAppChromeClient extends WebChromeClient {
        private WebAppChromeClient() {
        }

        public void onConsoleMessage(String str, int i, String str2) {
            File file;
            try {
                file = new File(str2);
            } catch (Exception e) {
                DeviceLog.exception("Could not handle sourceId", e);
                file = null;
            }
            if (file != null) {
                file.getName();
            }
        }
    }

    public class WebAppClient extends WebViewClient {
        private WebAppClient() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            DeviceLog.debug("onPageFinished url: " + str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView != null) {
                StringBuilder k = C13555b.m33972k("WEBVIEW_ERROR: ");
                k.append(webView.toString());
                DeviceLog.error(k.toString());
            }
            if (webResourceRequest != null) {
                StringBuilder k2 = C13555b.m33972k("WEBVIEW_ERROR: ");
                k2.append(webResourceRequest.toString());
                DeviceLog.error(k2.toString());
            }
            if (webResourceError != null) {
                StringBuilder k3 = C13555b.m33972k("WEBVIEW_ERROR: ");
                k3.append(webResourceError.toString());
                DeviceLog.error(k3.toString());
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    if (AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if (!(WebViewApp.getCurrentApp() == null || WebViewApp.getCurrentApp().getWebView() == null)) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error("UnityAds Sdk WebView onRenderProcessGone : " + renderProcessGoneDetail.toString());
            SDKMetrics.getInstance().sendEvent("native_webview_render_process_gone", new HashMap<String, String>(renderProcessGoneDetail) {
                public final /* synthetic */ RenderProcessGoneDetail val$detail;

                {
                    this.val$detail = r4;
                    if (Build.VERSION.SDK_INT >= 26) {
                        StringBuilder k = C13555b.m33972k("");
                        k.append(r4.didCrash());
                        put("dc", k.toString());
                        put("pae", "" + r4.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            DeviceLog.debug("Trying to load url: " + str);
            return false;
        }
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) throws JSONException {
        String jSONArray2 = jSONArray.toString();
        return C13715c.m34245k(C0017h.m58O(jSONArray2.length() + str2.length() + str.length() + 22, "javascript:window.", str, ".", str2), "(", jSONArray2, ");");
    }

    public static boolean create(final Configuration configuration) throws IllegalThreadStateException {
        boolean z;
        boolean z2;
        DeviceLog.entered();
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        WebViewApp webViewApp = new WebViewApp(configuration);
                        StringBuilder k = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
                        k.append(SdkProperties.getLocalWebViewFile());
                        String urlWithQueryString = new WebViewUrlBuilder(k.toString(), configuration).getUrlWithQueryString();
                        if (urlWithQueryString == null) {
                            String str = "?platform=android";
                            try {
                                if (configuration.getWebViewUrl() != null) {
                                    str = str + "&origin=" + URLEncoder.encode(configuration.getWebViewUrl(), "UTF-8");
                                }
                            } catch (UnsupportedEncodingException e) {
                                DeviceLog.exception("Unsupported charset when encoding origin url", e);
                            }
                            try {
                                if (configuration.getWebViewVersion() != null) {
                                    str = str + "&version=" + URLEncoder.encode(configuration.getWebViewVersion(), "UTF-8");
                                }
                            } catch (UnsupportedEncodingException e2) {
                                DeviceLog.exception("Unsupported charset when encoding webview version", e2);
                            }
                            WebView webView = webViewApp.getWebView();
                            StringBuilder k2 = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
                            k2.append(SdkProperties.getLocalWebViewFile());
                            k2.append(str);
                            webView.loadDataWithBaseURL(k2.toString(), configuration.getWebViewData(), "text/html", "UTF-8", (String) null);
                        } else {
                            webViewApp.getWebView().loadDataWithBaseURL(urlWithQueryString, configuration.getWebViewData(), "text/html", "UTF-8", (String) null);
                        }
                        WebViewApp.setCurrentApp(webViewApp);
                    } catch (Exception unused) {
                        DeviceLog.error("Couldn't construct WebViewApp");
                        WebViewApp._conditionVariable.open();
                    }
                }
            });
            ConditionVariable conditionVariable = new ConditionVariable();
            _conditionVariable = conditionVariable;
            boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z3 = true;
            if (getCurrentApp() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !getCurrentApp().isWebAppInitialized()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!block || !z || !z2) {
                z3 = false;
            }
            if (!z3) {
                SDKMetrics.getInstance().sendEvent("native_webview_creation_failed", new HashMap<String, String>(block, z, z2) {
                    public final /* synthetic */ boolean val$webAppDefined;
                    public final /* synthetic */ boolean val$webAppInitialized;
                    public final /* synthetic */ boolean val$webViewCreateDidNotTimeout;

                    {
                        this.val$webViewCreateDidNotTimeout = r3;
                        this.val$webAppDefined = r4;
                        this.val$webAppInitialized = r5;
                        StringBuilder k = C13555b.m33972k("");
                        k.append(!r3);
                        put("wto", k.toString());
                        put("wad", "" + r4);
                        put("wai", "" + r5);
                    }
                });
            }
            return z3;
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) throws JSONException {
        String buildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", buildInvokeJavascript);
        getWebView().invokeJavascript(buildInvokeJavascript);
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public void addCallback(NativeCallback nativeCallback) {
        if (this._nativeCallbacks == null) {
            this._nativeCallbacks = new HashMap<>();
        }
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            Iterator<ArrayList<Object>> it = responses.iterator();
            while (it.hasNext()) {
                ArrayList next = it.next();
                Enum enumR = (Enum) next.get(1);
                Object[] objArr = (Object[]) next.get(2);
                Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[0]);
                arrayList.add(((CallbackStatus) next.get(0)).toString());
                JSONArray jSONArray2 = new JSONArray();
                if (enumR != null) {
                    jSONArray2.put(enumR.name());
                }
                for (Object put : copyOfRange) {
                    jSONArray2.put(put);
                }
                arrayList.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Exception e) {
            DeviceLog.exception("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object put : objArr) {
                jSONArray.put(put);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Exception e) {
            DeviceLog.exception("Error invoking javascript method", e);
            return false;
        }
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback) {
        HashMap<String, NativeCallback> hashMap = this._nativeCallbacks;
        if (hashMap != null) {
            synchronized (hashMap) {
                this._nativeCallbacks.remove(nativeCallback.getId());
            }
        }
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(Boolean.FALSE);
    }

    public boolean sendEvent(Enum enumR, Enum enumR2, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(enumR.name());
        jSONArray.put(enumR2.name());
        for (Object put : objArr) {
            jSONArray.put(put);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Exception e) {
            DeviceLog.exception("Error while sending event to WebView", e);
            return false;
        }
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    public void setWebAppFailureCode(int i) {
        _webAppFailureCode.set(Integer.valueOf(i));
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppInitialized(boolean z) {
        _initialized.set(Boolean.valueOf(z));
        _conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    private WebViewApp(Configuration configuration) {
        this._webAppLoaded = false;
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        WebView webView = new WebView(ClientProperties.getApplicationContext());
        this._webView = webView;
        webView.setWebViewClient(new WebAppClient());
        this._webView.setWebChromeClient(new WebAppChromeClient());
    }

    public WebViewApp() {
        this._webAppLoaded = false;
    }
}
