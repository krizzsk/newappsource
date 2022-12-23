package com.unity3d.services.core.configuration;

import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressorWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderUrlEncoder;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

public class ConfigurationRequestFactory {
    private final String _configUrl;
    private final Configuration _configuration;
    private final IDeviceInfoReader _deviceInfoReader;

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoReader iDeviceInfoReader, String str) {
        this._configuration = configuration;
        this._deviceInfoReader = iDeviceInfoReader;
        this._configUrl = str;
    }

    private String buildCompressedQueryStringIfNeeded() {
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled() || experiments.isPOSTMethodInConfigRequestEnabled()) {
            return "";
        }
        return C25541a.m63881k("c=", new DeviceInfoReaderUrlEncoder(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments)).getUrlEncodedData());
    }

    private String buildQueryString() {
        StringBuilder k = C13555b.m33972k("?");
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled()) {
            k.append("ts=");
            k.append(System.currentTimeMillis());
            k.append("&sdkVersion=");
            k.append(SdkProperties.getVersionCode());
            k.append("&sdkVersionName=");
            k.append(SdkProperties.getVersionName());
            k.append("&gameId=");
            k.append(ClientProperties.getGameId());
        } else {
            k.append(buildCompressedQueryStringIfNeeded());
        }
        return k.toString();
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String str = this._configUrl + buildQueryString();
        DeviceLog.debug("Requesting configuration with: " + str);
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled() || !experiments.isPOSTMethodInConfigRequestEnabled()) {
            return new WebRequest(str, "GET");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
        WebRequest webRequest = new WebRequest(str, "POST", hashMap);
        webRequest.setBody(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments).getDeviceData());
        return webRequest;
    }
}
