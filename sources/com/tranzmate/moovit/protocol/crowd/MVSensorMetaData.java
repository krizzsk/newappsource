package com.tranzmate.moovit.protocol.crowd;

import com.appboy.models.outgoing.FacebookUser;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVSensorMetaData extends TUnion<MVSensorMetaData, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f25417c = new C17394d0("MVSensorMetaData");

    /* renamed from: d */
    public static final C25113c f25418d = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f25419e = new C25113c("vector", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f25420f = new C25113c("activityRecognition", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f25421g = new C25113c("appState", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f25422h = new C25113c("battery", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f25423i = new C25113c("bluetooth", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f25424j = new C25113c("clockOffset", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f25425k = new C25113c("connectivity", (byte) 12, 8);

    /* renamed from: l */
    public static final C25113c f25426l = new C25113c("wifi", (byte) 12, 9);

    /* renamed from: m */
    public static final C25113c f25427m = new C25113c("deviceMotion", (byte) 12, 10);

    /* renamed from: n */
    public static final C25113c f25428n = new C25113c("wifiConnectivity", (byte) 12, 11);

    /* renamed from: o */
    public static final C25113c f25429o = new C25113c("bluetoothConnectivity", (byte) 12, 12);

    /* renamed from: p */
    public static final C25113c f25430p = new C25113c("powerSource", (byte) 12, 13);

    /* renamed from: q */
    public static final C25113c f25431q = new C25113c("stepCounter", (byte) 12, 14);

    /* renamed from: r */
    public static final C25113c f25432r = new C25113c("visit", (byte) 12, 15);

    /* renamed from: s */
    public static final C25113c f25433s = new C25113c("homeProfiler", (byte) 12, 16);

    /* renamed from: t */
    public static final C25113c f25434t = new C25113c("triggerSensor", (byte) 12, 17);

    /* renamed from: u */
    public static final C25113c f25435u = new C25113c("beaconScan", (byte) 12, 18);

    /* renamed from: v */
    public static final C25113c f25436v = new C25113c("activityTransitionRecognition", (byte) 12, 19);

    /* renamed from: w */
    public static final Map<_Fields, FieldMetaData> f25437w;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        VECTOR(2, "vector"),
        ACTIVITY_RECOGNITION(3, "activityRecognition"),
        APP_STATE(4, "appState"),
        BATTERY(5, "battery"),
        BLUETOOTH(6, "bluetooth"),
        CLOCK_OFFSET(7, "clockOffset"),
        CONNECTIVITY(8, "connectivity"),
        WIFI(9, "wifi"),
        DEVICE_MOTION(10, "deviceMotion"),
        WIFI_CONNECTIVITY(11, "wifiConnectivity"),
        BLUETOOTH_CONNECTIVITY(12, "bluetoothConnectivity"),
        POWER_SOURCE(13, "powerSource"),
        STEP_COUNTER(14, "stepCounter"),
        VISIT(15, "visit"),
        HOME_PROFILER(16, "homeProfiler"),
        TRIGGER_SENSOR(17, "triggerSensor"),
        BEACON_SCAN(18, "beaconScan"),
        ACTIVITY_TRANSITION_RECOGNITION(19, "activityTransitionRecognition");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            switch (i) {
                case 1:
                    return LOCATION;
                case 2:
                    return VECTOR;
                case 3:
                    return ACTIVITY_RECOGNITION;
                case 4:
                    return APP_STATE;
                case 5:
                    return BATTERY;
                case 6:
                    return BLUETOOTH;
                case 7:
                    return CLOCK_OFFSET;
                case 8:
                    return CONNECTIVITY;
                case 9:
                    return WIFI;
                case 10:
                    return DEVICE_MOTION;
                case 11:
                    return WIFI_CONNECTIVITY;
                case 12:
                    return BLUETOOTH_CONNECTIVITY;
                case 13:
                    return POWER_SOURCE;
                case 14:
                    return STEP_COUNTER;
                case 15:
                    return VISIT;
                case 16:
                    return HOME_PROFILER;
                case 17:
                    return TRIGGER_SENSOR;
                case 18:
                    return BEACON_SCAN;
                case 19:
                    return ACTIVITY_TRANSITION_RECOGNITION;
                default:
                    return null;
            }
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$a */
    public static /* synthetic */ class C8598a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25438a;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields[] r0 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25438a = r0
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.LOCATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.VECTOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.ACTIVITY_RECOGNITION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.APP_STATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.BATTERY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.BLUETOOTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.CLOCK_OFFSET     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.CONNECTIVITY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.WIFI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.DEVICE_MOTION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.WIFI_CONNECTIVITY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.BLUETOOTH_CONNECTIVITY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.POWER_SOURCE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.STEP_COUNTER     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.VISIT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.HOME_PROFILER     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.TRIGGER_SENSOR     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.BEACON_SCAN     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f25438a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.tranzmate.moovit.protocol.crowd.MVSensorMetaData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVSensorMetaData._Fields.ACTIVITY_TRANSITION_RECOGNITION     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.crowd.MVSensorMetaData.C8598a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVDeviceLocation.class)));
        enumMap.put(_Fields.VECTOR, new FieldMetaData("vector", (byte) 3, new StructMetaData(MVDeviceVector.class)));
        enumMap.put(_Fields.ACTIVITY_RECOGNITION, new FieldMetaData("activityRecognition", (byte) 3, new StructMetaData(MVActivityRecognition.class)));
        enumMap.put(_Fields.APP_STATE, new FieldMetaData("appState", (byte) 3, new StructMetaData(MVAppState.class)));
        enumMap.put(_Fields.BATTERY, new FieldMetaData("battery", (byte) 3, new StructMetaData(MVBattery.class)));
        enumMap.put(_Fields.BLUETOOTH, new FieldMetaData("bluetooth", (byte) 3, new StructMetaData(MVBluetooth.class)));
        enumMap.put(_Fields.CLOCK_OFFSET, new FieldMetaData("clockOffset", (byte) 3, new StructMetaData(MVClockOffset.class)));
        enumMap.put(_Fields.CONNECTIVITY, new FieldMetaData("connectivity", (byte) 3, new StructMetaData(MVConnectivity.class)));
        enumMap.put(_Fields.WIFI, new FieldMetaData("wifi", (byte) 3, new StructMetaData(MVWifi.class)));
        enumMap.put(_Fields.DEVICE_MOTION, new FieldMetaData("deviceMotion", (byte) 3, new StructMetaData(MVDeviceMotion.class)));
        enumMap.put(_Fields.WIFI_CONNECTIVITY, new FieldMetaData("wifiConnectivity", (byte) 3, new StructMetaData(MVWifiConnectivity.class)));
        enumMap.put(_Fields.BLUETOOTH_CONNECTIVITY, new FieldMetaData("bluetoothConnectivity", (byte) 3, new StructMetaData(MVBluetoothConnectivity.class)));
        enumMap.put(_Fields.POWER_SOURCE, new FieldMetaData("powerSource", (byte) 3, new StructMetaData(MVPowerSource.class)));
        enumMap.put(_Fields.STEP_COUNTER, new FieldMetaData("stepCounter", (byte) 3, new StructMetaData(MVStepCounter.class)));
        enumMap.put(_Fields.VISIT, new FieldMetaData("visit", (byte) 3, new StructMetaData(MVVisit.class)));
        enumMap.put(_Fields.HOME_PROFILER, new FieldMetaData("homeProfiler", (byte) 3, new StructMetaData(MVHomeProfiler.class)));
        enumMap.put(_Fields.TRIGGER_SENSOR, new FieldMetaData("triggerSensor", (byte) 3, new StructMetaData(MVTriggerSensor.class)));
        enumMap.put(_Fields.BEACON_SCAN, new FieldMetaData("beaconScan", (byte) 3, new StructMetaData(MVBeaconScan.class)));
        enumMap.put(_Fields.ACTIVITY_TRANSITION_RECOGNITION, new FieldMetaData("activityTransitionRecognition", (byte) 3, new StructMetaData(MVActivityTransitionRecognition.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25437w = unmodifiableMap;
        FieldMetaData.m61947a(MVSensorMetaData.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final C25113c mo25505b(C25085c cVar) {
        _Fields _fields = (_Fields) cVar;
        switch (C8598a.f25438a[_fields.ordinal()]) {
            case 1:
                return f25418d;
            case 2:
                return f25419e;
            case 3:
                return f25420f;
            case 4:
                return f25421g;
            case 5:
                return f25422h;
            case 6:
                return f25423i;
            case 7:
                return f25424j;
            case 8:
                return f25425k;
            case 9:
                return f25426l;
            case 10:
                return f25427m;
            case 11:
                return f25428n;
            case 12:
                return f25429o;
            case 13:
                return f25430p;
            case 14:
                return f25431q;
            case 15:
                return f25432r;
            case 16:
                return f25433s;
            case 17:
                return f25434t;
            case 18:
                return f25435u;
            case 19:
                return f25436v;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
    }

    public final int compareTo(Object obj) {
        MVSensorMetaData mVSensorMetaData = (MVSensorMetaData) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVSensorMetaData.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVSensorMetaData.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVSensorMetaData mVSensorMetaData;
        if (!(obj instanceof MVSensorMetaData) || (mVSensorMetaData = (MVSensorMetaData) obj) == null || this.setField_ != mVSensorMetaData.setField_ || !this.value_.equals(mVSensorMetaData.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f25417c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C8598a.f25438a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                        mVDeviceLocation.mo25201C1(gVar);
                        return mVDeviceLocation;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVDeviceVector mVDeviceVector = new MVDeviceVector();
                        mVDeviceVector.mo25201C1(gVar);
                        return mVDeviceVector;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVActivityRecognition mVActivityRecognition = new MVActivityRecognition();
                        mVActivityRecognition.mo25201C1(gVar);
                        return mVActivityRecognition;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVAppState mVAppState = new MVAppState();
                        mVAppState.mo25201C1(gVar);
                        return mVAppState;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVBattery mVBattery = new MVBattery();
                        mVBattery.mo25201C1(gVar);
                        return mVBattery;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVBluetooth mVBluetooth = new MVBluetooth();
                        mVBluetooth.mo25201C1(gVar);
                        return mVBluetooth;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVClockOffset mVClockOffset = new MVClockOffset();
                        mVClockOffset.mo25201C1(gVar);
                        return mVClockOffset;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVConnectivity mVConnectivity = new MVConnectivity();
                        mVConnectivity.mo25201C1(gVar);
                        return mVConnectivity;
                    }
                    C25122h.m63098a(gVar, b8);
                    return null;
                case 9:
                    byte b9 = cVar.f63356b;
                    if (b9 == 12) {
                        MVWifi mVWifi = new MVWifi();
                        mVWifi.mo25201C1(gVar);
                        return mVWifi;
                    }
                    C25122h.m63098a(gVar, b9);
                    return null;
                case 10:
                    byte b11 = cVar.f63356b;
                    if (b11 == 12) {
                        MVDeviceMotion mVDeviceMotion = new MVDeviceMotion();
                        mVDeviceMotion.mo25201C1(gVar);
                        return mVDeviceMotion;
                    }
                    C25122h.m63098a(gVar, b11);
                    return null;
                case 11:
                    byte b12 = cVar.f63356b;
                    if (b12 == 12) {
                        MVWifiConnectivity mVWifiConnectivity = new MVWifiConnectivity();
                        mVWifiConnectivity.mo25201C1(gVar);
                        return mVWifiConnectivity;
                    }
                    C25122h.m63098a(gVar, b12);
                    return null;
                case 12:
                    byte b13 = cVar.f63356b;
                    if (b13 == 12) {
                        MVBluetoothConnectivity mVBluetoothConnectivity = new MVBluetoothConnectivity();
                        mVBluetoothConnectivity.mo25201C1(gVar);
                        return mVBluetoothConnectivity;
                    }
                    C25122h.m63098a(gVar, b13);
                    return null;
                case 13:
                    byte b14 = cVar.f63356b;
                    if (b14 == 12) {
                        MVPowerSource mVPowerSource = new MVPowerSource();
                        mVPowerSource.mo25201C1(gVar);
                        return mVPowerSource;
                    }
                    C25122h.m63098a(gVar, b14);
                    return null;
                case 14:
                    byte b15 = cVar.f63356b;
                    if (b15 == 12) {
                        MVStepCounter mVStepCounter = new MVStepCounter();
                        mVStepCounter.mo25201C1(gVar);
                        return mVStepCounter;
                    }
                    C25122h.m63098a(gVar, b15);
                    return null;
                case 15:
                    byte b16 = cVar.f63356b;
                    if (b16 == 12) {
                        MVVisit mVVisit = new MVVisit();
                        mVVisit.mo25201C1(gVar);
                        return mVVisit;
                    }
                    C25122h.m63098a(gVar, b16);
                    return null;
                case 16:
                    byte b17 = cVar.f63356b;
                    if (b17 == 12) {
                        MVHomeProfiler mVHomeProfiler = new MVHomeProfiler();
                        mVHomeProfiler.mo25201C1(gVar);
                        return mVHomeProfiler;
                    }
                    C25122h.m63098a(gVar, b17);
                    return null;
                case 17:
                    byte b18 = cVar.f63356b;
                    if (b18 == 12) {
                        MVTriggerSensor mVTriggerSensor = new MVTriggerSensor();
                        mVTriggerSensor.mo25201C1(gVar);
                        return mVTriggerSensor;
                    }
                    C25122h.m63098a(gVar, b18);
                    return null;
                case 18:
                    byte b19 = cVar.f63356b;
                    if (b19 == 12) {
                        MVBeaconScan mVBeaconScan = new MVBeaconScan();
                        mVBeaconScan.mo25201C1(gVar);
                        return mVBeaconScan;
                    }
                    C25122h.m63098a(gVar, b19);
                    return null;
                case 19:
                    byte b21 = cVar.f63356b;
                    if (b21 == 12) {
                        MVActivityTransitionRecognition mVActivityTransitionRecognition = new MVActivityTransitionRecognition();
                        mVActivityTransitionRecognition.mo25201C1(gVar);
                        return mVActivityTransitionRecognition;
                    }
                    C25122h.m63098a(gVar, b21);
                    return null;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        switch (C8598a.f25438a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVDeviceLocation) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVDeviceVector) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVActivityRecognition) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVAppState) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVBattery) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVBluetooth) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVClockOffset) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVWifi) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVDeviceMotion) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVWifiConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVBluetoothConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVPowerSource) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVStepCounter) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVVisit) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVHomeProfiler) this.value_).mo25202X0(gVar);
                return;
            case 17:
                ((MVTriggerSensor) this.value_).mo25202X0(gVar);
                return;
            case 18:
                ((MVBeaconScan) this.value_).mo25202X0(gVar);
                return;
            case 19:
                ((MVActivityTransitionRecognition) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            switch (C8598a.f25438a[findByThriftId.ordinal()]) {
                case 1:
                    MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                    mVDeviceLocation.mo25201C1(gVar);
                    return mVDeviceLocation;
                case 2:
                    MVDeviceVector mVDeviceVector = new MVDeviceVector();
                    mVDeviceVector.mo25201C1(gVar);
                    return mVDeviceVector;
                case 3:
                    MVActivityRecognition mVActivityRecognition = new MVActivityRecognition();
                    mVActivityRecognition.mo25201C1(gVar);
                    return mVActivityRecognition;
                case 4:
                    MVAppState mVAppState = new MVAppState();
                    mVAppState.mo25201C1(gVar);
                    return mVAppState;
                case 5:
                    MVBattery mVBattery = new MVBattery();
                    mVBattery.mo25201C1(gVar);
                    return mVBattery;
                case 6:
                    MVBluetooth mVBluetooth = new MVBluetooth();
                    mVBluetooth.mo25201C1(gVar);
                    return mVBluetooth;
                case 7:
                    MVClockOffset mVClockOffset = new MVClockOffset();
                    mVClockOffset.mo25201C1(gVar);
                    return mVClockOffset;
                case 8:
                    MVConnectivity mVConnectivity = new MVConnectivity();
                    mVConnectivity.mo25201C1(gVar);
                    return mVConnectivity;
                case 9:
                    MVWifi mVWifi = new MVWifi();
                    mVWifi.mo25201C1(gVar);
                    return mVWifi;
                case 10:
                    MVDeviceMotion mVDeviceMotion = new MVDeviceMotion();
                    mVDeviceMotion.mo25201C1(gVar);
                    return mVDeviceMotion;
                case 11:
                    MVWifiConnectivity mVWifiConnectivity = new MVWifiConnectivity();
                    mVWifiConnectivity.mo25201C1(gVar);
                    return mVWifiConnectivity;
                case 12:
                    MVBluetoothConnectivity mVBluetoothConnectivity = new MVBluetoothConnectivity();
                    mVBluetoothConnectivity.mo25201C1(gVar);
                    return mVBluetoothConnectivity;
                case 13:
                    MVPowerSource mVPowerSource = new MVPowerSource();
                    mVPowerSource.mo25201C1(gVar);
                    return mVPowerSource;
                case 14:
                    MVStepCounter mVStepCounter = new MVStepCounter();
                    mVStepCounter.mo25201C1(gVar);
                    return mVStepCounter;
                case 15:
                    MVVisit mVVisit = new MVVisit();
                    mVVisit.mo25201C1(gVar);
                    return mVVisit;
                case 16:
                    MVHomeProfiler mVHomeProfiler = new MVHomeProfiler();
                    mVHomeProfiler.mo25201C1(gVar);
                    return mVHomeProfiler;
                case 17:
                    MVTriggerSensor mVTriggerSensor = new MVTriggerSensor();
                    mVTriggerSensor.mo25201C1(gVar);
                    return mVTriggerSensor;
                case 18:
                    MVBeaconScan mVBeaconScan = new MVBeaconScan();
                    mVBeaconScan.mo25201C1(gVar);
                    return mVBeaconScan;
                case 19:
                    MVActivityTransitionRecognition mVActivityTransitionRecognition = new MVActivityTransitionRecognition();
                    mVActivityTransitionRecognition.mo25201C1(gVar);
                    return mVActivityTransitionRecognition;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C8598a.f25438a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVDeviceLocation) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVDeviceVector) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVActivityRecognition) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVAppState) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVBattery) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVBluetooth) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVClockOffset) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVWifi) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVDeviceMotion) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVWifiConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVBluetoothConnectivity) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVPowerSource) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVStepCounter) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVVisit) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVHomeProfiler) this.value_).mo25202X0(gVar);
                return;
            case 17:
                ((MVTriggerSensor) this.value_).mo25202X0(gVar);
                return;
            case 18:
                ((MVBeaconScan) this.value_).mo25202X0(gVar);
                return;
            case 19:
                ((MVActivityTransitionRecognition) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }
}
