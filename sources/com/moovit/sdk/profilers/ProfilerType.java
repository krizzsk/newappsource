package com.moovit.sdk.profilers;

import com.moovit.sdk.protocol.ProtocolEnums$MVProfilerType;
import com.moovit.sdk.protocol.ProtocolEnums$MVRecordingType;
import com.moovit.sdk.protocol.ProtocolEnums$MVSensorType;
import p810sz.C19577c;
import p810sz.C19584i;

public enum ProfilerType {
    LOCATION(ProtocolEnums$MVSensorType.LOW_POWER_LOCATION.getValue(), ProtocolEnums$MVRecordingType.LOCATIONS_PROFILER.getValue(), ProtocolEnums$MVProfilerType.LOCATIONS_PROFILER.getValue()),
    ACTIVITY_RECOGNITION(ProtocolEnums$MVSensorType.ACTIVITY_RECOGNITION.getValue(), ProtocolEnums$MVRecordingType.ACTIVITY_PROFILER.getValue(), ProtocolEnums$MVProfilerType.ACTIVITY_PROFILER.getValue()),
    WIFI_CONNECTIONS(ProtocolEnums$MVSensorType.WIFI_CONNECTIVITY.getValue(), ProtocolEnums$MVRecordingType.WIFI_PROFILER.getValue(), ProtocolEnums$MVProfilerType.WIFI_CONNECTIVITY_PROFILER.getValue()),
    BT_CONNECTIONS(ProtocolEnums$MVSensorType.BT_CONNECTIVITY.getValue(), ProtocolEnums$MVRecordingType.BT_PROFILER.getValue(), ProtocolEnums$MVProfilerType.BT_CONNECTIVITY_PROFILER.getValue()),
    DEVICE_CHARGE(ProtocolEnums$MVSensorType.POWER_SOURCE_CONNECTIVITY.getValue(), ProtocolEnums$MVRecordingType.CHARGE_PROFILER.getValue(), ProtocolEnums$MVProfilerType.POWER_SOURCE_CONNECTIVITY_PROFILER.getValue()),
    WIFI_SCANS(ProtocolEnums$MVSensorType.WIFI_EXTENDED.getValue(), ProtocolEnums$MVRecordingType.WIFI_SCAN_PROFILER.getValue(), ProtocolEnums$MVProfilerType.WIFI_SCANS_PROFILER.getValue()),
    BEACONS(ProtocolEnums$MVSensorType.BEACON.getValue(), ProtocolEnums$MVRecordingType.ANDROID_BEACONS_SCAN.getValue(), ProtocolEnums$MVProfilerType.ANDROID_BEACONS_SCAN.getValue()),
    STEPS_COUNTER(ProtocolEnums$MVSensorType.STEP_COUNTER.getValue(), ProtocolEnums$MVRecordingType.ANDROID_STEP_COUNTER.getValue(), ProtocolEnums$MVProfilerType.STEP_COUNTER.getValue()),
    ACTIVITY_TRANSITION_RECOGNITION(ProtocolEnums$MVSensorType.ACTIVITY_TRANSITION_RECOGNITION.getValue(), ProtocolEnums$MVRecordingType.ACTIVITY_TRANSITION_PROFILER.getValue(), ProtocolEnums$MVProfilerType.ACTIVITY_TRANSITION_PROFILER.getValue());
    
    public static final C19584i<ProfilerType> CODER = null;
    private final int recordingType;
    private final int sensorType;
    private final int visibilityMessagesType;

    /* access modifiers changed from: public */
    static {
        ProfilerType profilerType;
        ProfilerType profilerType2;
        ProfilerType profilerType3;
        ProfilerType profilerType4;
        ProfilerType profilerType5;
        ProfilerType profilerType6;
        ProfilerType profilerType7;
        ProfilerType profilerType8;
        ProfilerType profilerType9;
        CODER = new C19577c(ProfilerType.class, profilerType, profilerType2, profilerType3, profilerType4, profilerType5, profilerType6, profilerType7, profilerType8, profilerType9);
    }

    private ProfilerType(int i, int i2, int i3) {
        this.sensorType = i;
        this.recordingType = i2;
        this.visibilityMessagesType = i3;
    }

    public int getRecordingType() {
        return this.recordingType;
    }

    public int getSensorType() {
        return this.sensorType;
    }

    public int getVisibilityMessagesType() {
        return this.visibilityMessagesType;
    }
}
