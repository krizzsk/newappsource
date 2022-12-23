package com.usebutton.sdk.internal.web;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.purchasepath.BrowserPage;
import java.io.IOException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

public class ButtonJavascriptInterface {
    public static final String INJECTED_OBJECT = "ButtonSdk";
    public static final String NAV_JS_FILENAME = "nav.js";
    private static final String TAG = "ButtonJavascriptInterface";
    private String lastUrl = "";
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final Navigator navigator;
    /* access modifiers changed from: private */
    public final WebView webView;

    public static class DecodeAsyncTask extends AsyncTask<Void, Void, String> {
        private static final String TAG = DecodeAsyncTask.class.getSimpleName();
        private BrowserPage.DomResultListener listener;
        private String rawHtml;

        public DecodeAsyncTask(String str, BrowserPage.DomResultListener domResultListener) {
            this.rawHtml = str;
            this.listener = domResultListener;
        }

        public String doInBackground(Void... voidArr) {
            try {
                return URLDecoder.decode(this.rawHtml, "UTF-8");
            } catch (Exception unused) {
                String str = TAG;
                StringBuilder k = C13555b.m33972k("could not decode html: ");
                k.append(this.rawHtml);
                ButtonLog.warn(str, k.toString());
                return null;
            }
        }

        public void onPostExecute(String str) {
            this.listener.onResult(str);
        }
    }

    public interface Listener {
        void onAutofillFieldsDetected(JSONObject jSONObject);

        void onFieldFocusEvent(JSONObject jSONObject);

        void onNavigateJs(String str);

        void onPageFinishedJs(String str);
    }

    public ButtonJavascriptInterface(Listener listener2, WebView webView2, Navigator navigator2) {
        this.webView = webView2;
        this.listener = listener2;
        this.navigator = navigator2;
        webView2.addJavascriptInterface(this, "ButtonSdk");
    }

    public void fillFields(JSONObject jSONObject) {
        this.webView.evaluateJavascript(String.format("btnsdk.fillFields(%s)", new Object[]{jSONObject}), new ValueCallback<String>() {
            public void onReceiveValue(String str) {
            }
        });
    }

    public void getDom(final BrowserPage.DomResultListener domResultListener) {
        this.webView.evaluateJavascript("(function() { return encodeURI(document.documentElement.outerHTML); })();", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                new DecodeAsyncTask(str, domResultListener).execute(new Void[0]);
            }
        });
    }

    public void loadBtnSdkJs(final String str) {
        this.webView.post(new Runnable() {
            public void run() {
                ButtonJavascriptInterface.this.webView.evaluateJavascript(str, new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                    }
                });
            }
        });
    }

    public void loadNavJs(Context context) {
        String str;
        try {
            str = ButtonUtil.streamToString(context.getAssets().open(NAV_JS_FILENAME));
        } catch (IOException e) {
            ButtonLog.warn(TAG, "Error loading navigation JS", e);
            str = null;
        }
        if (str != null) {
            WebView webView2 = this.webView;
            webView2.loadUrl("javascript:" + str);
        }
    }

    public void observeFields(JSONObject jSONObject) {
        this.webView.evaluateJavascript(String.format("btnsdk.observeFields(%s)", new Object[]{jSONObject}), (ValueCallback) null);
    }

    @JavascriptInterface
    public void onAutofillFieldsDetected(String str) {
        try {
            this.listener.onAutofillFieldsDetected(new JSONObject(str));
        } catch (JSONException e) {
            ButtonLog.warn(TAG, "Error parsing autofill json", e);
        }
    }

    @JavascriptInterface
    public void onAutofillFieldsNotDetected(String str) {
    }

    @JavascriptInterface
    public void onFieldFocusEvent(String str) {
        try {
            this.listener.onFieldFocusEvent(new JSONObject(str));
        } catch (JSONException e) {
            ButtonLog.warnFormat(TAG, "Could not parse field focus event form fields", e);
        }
    }

    @JavascriptInterface
    public void onNavigation() {
        this.webView.post(new Runnable() {
            public void run() {
                String url = ButtonJavascriptInterface.this.webView.getUrl();
                if (url != null) {
                    ButtonJavascriptInterface.this.listener.onNavigateJs(url);
                    ButtonJavascriptInterface.this.navigator.onNavigation();
                }
            }
        });
    }

    @JavascriptInterface
    public void onPageFinished(String str) {
        if (Build.VERSION.SDK_INT < 23 && str != null && !str.isEmpty() && !str.equals("about:blank") && !str.equals(this.lastUrl)) {
            ButtonLog.verboseFormat(TAG, "onPageFinishedJs %s", str);
            this.listener.onPageFinishedJs(str);
            this.lastUrl = str;
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
