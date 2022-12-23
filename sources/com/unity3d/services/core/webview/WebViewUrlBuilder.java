package com.unity3d.services.core.webview;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebViewUrlBuilder {
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder k = C13555b.m33972k("?platform=android");
        k.append(buildQueryParam(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, configuration.getWebViewUrl()));
        StringBuilder k2 = C13555b.m33972k(k.toString());
        k2.append(buildQueryParam(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion()));
        String sb = k2.toString();
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            StringBuilder k3 = C13555b.m33972k(sb);
            k3.append(buildQueryParam("experiments", configuration.getExperiments().getExperimentData().toString()));
            sb = k3.toString();
        }
        this._urlWithQueryString = C25541a.m63881k(str, sb);
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "" + "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            DeviceLog.exception(String.format("Unsupported charset when encoding %s", new Object[]{str}), e);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
