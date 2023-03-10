package com.unity3d.services.core.request;

import android.os.Bundle;
import com.appboy.support.StringUtils;
import com.unity3d.services.core.log.DeviceLog;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebRequestRunnable implements Runnable {
    private final String _body;
    private boolean _canceled = false;
    private final int _connectTimeout;
    private WebRequest _currentRequest;
    private final Map<String, List<String>> _headers;
    private final IWebRequestListener _listener;
    private final int _readTimeout;
    private final String _type;
    private final String _url;

    public WebRequestRunnable(String str, String str2, String str3, int i, int i2, Map<String, List<String>> map, IWebRequestListener iWebRequestListener) {
        this._url = str;
        this._type = str2;
        this._body = str3;
        this._connectTimeout = i;
        this._readTimeout = i2;
        this._headers = map;
        this._listener = iWebRequestListener;
    }

    private Map<String, List<String>> getResponseHeaders(Bundle bundle) {
        if (bundle.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            String[] stringArray = bundle.getStringArray(next);
            if (stringArray != null) {
                hashMap.put(next, new ArrayList(Arrays.asList(stringArray)));
            }
        }
        return hashMap;
    }

    private void makeRequest(String str, String str2, Map<String, List<String>> map, String str3, int i, int i2) throws MalformedURLException {
        if (!this._canceled) {
            WebRequest webRequest = new WebRequest(str, str2, map, i, i2);
            this._currentRequest = webRequest;
            if (str3 != null) {
                webRequest.setBody(str3);
            }
            try {
                String makeRequest = this._currentRequest.makeRequest();
                if (!this._currentRequest.isCanceled()) {
                    Bundle bundle = new Bundle();
                    for (String next : this._currentRequest.getResponseHeaders().keySet()) {
                        if (next != null && !next.contentEquals(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING)) {
                            String[] strArr = new String[this._currentRequest.getResponseHeaders().get(next).size()];
                            for (int i3 = 0; i3 < this._currentRequest.getResponseHeaders().get(next).size(); i3++) {
                                strArr[i3] = (String) this._currentRequest.getResponseHeaders().get(next).get(i3);
                            }
                            bundle.putStringArray(next, strArr);
                        }
                    }
                    if (!this._currentRequest.isCanceled()) {
                        onSucceed(makeRequest, this._currentRequest.getResponseCode(), getResponseHeaders(bundle));
                    }
                }
            } catch (Exception e) {
                DeviceLog.exception("Error completing request", e);
                onFailed(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }

    private void onFailed(String str) {
        this._listener.onFailed(this._url, str);
    }

    private void onSucceed(String str, int i, Map<String, List<String>> map) {
        this._listener.onComplete(this._url, str, i, map);
    }

    public void run() {
        StringBuilder k = C13555b.m33972k("Handling request message: ");
        k.append(this._url);
        k.append(" type=");
        k.append(this._type);
        DeviceLog.debug(k.toString());
        try {
            makeRequest(this._url, this._type, this._headers, this._body, this._connectTimeout, this._readTimeout);
        } catch (MalformedURLException e) {
            DeviceLog.exception("Malformed URL", e);
            onFailed("Malformed URL");
        }
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (z && (webRequest = this._currentRequest) != null) {
            webRequest.cancel();
        }
    }
}
