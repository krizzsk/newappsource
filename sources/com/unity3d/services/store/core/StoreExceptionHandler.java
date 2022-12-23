package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import oc0.C12988h;
import org.json.JSONException;

public class StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public StoreExceptionHandler(WebViewErrorHandler webViewErrorHandler) {
        this._webViewErrorHandler = webViewErrorHandler;
    }

    private StoreError getStoreError(Exception exc) {
        StoreError storeError = StoreError.UNKNOWN_ERROR;
        if (exc instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        if (exc instanceof ClassNotFoundException) {
            return StoreError.CLASS_NOT_FOUND;
        }
        return storeError;
    }

    private void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i, Exception exc) {
        this._webViewErrorHandler.handleError((C12988h) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i), storeError, exc.getMessage()));
    }

    public void handleStoreException(StoreEvent storeEvent, int i, Exception exc) {
        sendErrorToWebView(storeEvent, getStoreError(exc), i, exc);
    }
}
