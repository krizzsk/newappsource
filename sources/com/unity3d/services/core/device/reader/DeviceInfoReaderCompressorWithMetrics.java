package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DeviceInfoReaderCompressorWithMetrics implements IDeviceInfoDataCompressor {
    private final IDeviceInfoDataCompressor _deviceInfoDataCompressor;
    private long _endTime;
    private final Experiments _experiments;
    private long _startTimeCompression;
    private long _startTimeInfo;

    public DeviceInfoReaderCompressorWithMetrics(IDeviceInfoDataCompressor iDeviceInfoDataCompressor, Experiments experiments) {
        this._deviceInfoDataCompressor = iDeviceInfoDataCompressor;
        this._experiments = experiments;
    }

    private long getCompressionDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._endTime - this._startTimeCompression);
    }

    private long getDeviceInfoCollectionDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._startTimeCompression - this._startTimeInfo);
    }

    private void sendDeviceInfoMetrics() {
        Map<String, String> map;
        Experiments experiments = this._experiments;
        if (experiments != null) {
            map = experiments.getExperimentTags();
        } else {
            map = null;
        }
        SDKMetrics.getInstance().sendMetric(TSIMetric.newDeviceInfoCollectionLatency(Long.valueOf(getDeviceInfoCollectionDuration()), map));
        SDKMetrics.getInstance().sendMetric(TSIMetric.newDeviceInfoCompressionLatency(Long.valueOf(getCompressionDuration()), map));
    }

    public byte[] compressDeviceInfo(Map<String, Object> map) {
        this._startTimeCompression = System.nanoTime();
        byte[] compressDeviceInfo = this._deviceInfoDataCompressor.compressDeviceInfo(map);
        this._endTime = System.nanoTime();
        return compressDeviceInfo;
    }

    public byte[] getDeviceData() {
        if (this._deviceInfoDataCompressor == null) {
            return new byte[0];
        }
        this._startTimeInfo = System.nanoTime();
        byte[] compressDeviceInfo = compressDeviceInfo(getDeviceInfo());
        sendDeviceInfoMetrics();
        return compressDeviceInfo;
    }

    public Map<String, Object> getDeviceInfo() {
        return this._deviceInfoDataCompressor.getDeviceInfo();
    }
}
