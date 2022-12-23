package com.moovit.sdk.datacollection.sensors;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class LocationSensorValue implements SensorValue {
    public static final Parcelable.Creator<LocationSensorValue> CREATOR = new C16444a();

    /* renamed from: d */
    public static final C16445b f42985d = new C16445b(LocationSensorValue.class);

    /* renamed from: b */
    public final Location f42986b;

    /* renamed from: c */
    public final SensorType f42987c;

    /* renamed from: com.moovit.sdk.datacollection.sensors.LocationSensorValue$a */
    public class C16444a implements Parcelable.Creator<LocationSensorValue> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocationSensorValue) C19612n.m46981v(parcel, LocationSensorValue.f42985d);
        }

        public final Object[] newArray(int i) {
            return new LocationSensorValue[i];
        }
    }

    /* renamed from: com.moovit.sdk.datacollection.sensors.LocationSensorValue$b */
    public class C16445b extends C19619s<LocationSensorValue> {
        public C16445b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 1;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo178b(p810sz.C19615p r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                tz.a$h r0 = p834tz.C19794a.f50329g
                java.lang.Object r0 = r4.mo51962q(r0)
                android.location.Location r0 = (android.location.Location) r0
                com.moovit.sdk.datacollection.sensors.SensorType r1 = com.moovit.sdk.datacollection.sensors.SensorType.Location
                r2 = 1
                if (r5 != r2) goto L_0x0016
                sz.c<com.moovit.sdk.datacollection.sensors.SensorType> r5 = com.moovit.sdk.datacollection.sensors.Sensor.f42988b
                java.lang.Enum r4 = p379.C13555b.m33968g(r5, r4)
                r1 = r4
                com.moovit.sdk.datacollection.sensors.SensorType r1 = (com.moovit.sdk.datacollection.sensors.SensorType) r1
            L_0x0016:
                com.moovit.sdk.datacollection.sensors.LocationSensorValue r4 = new com.moovit.sdk.datacollection.sensors.LocationSensorValue
                r4.<init>(r0, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.datacollection.sensors.LocationSensorValue.C16445b.mo178b(sz.p, int):java.lang.Object");
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            LocationSensorValue locationSensorValue = (LocationSensorValue) obj;
            qVar.mo51967q(locationSensorValue.f42986b, C19794a.f50329g);
            Sensor.f42988b.write(locationSensorValue.f42987c, qVar);
        }
    }

    public LocationSensorValue(Location location, SensorType sensorType) {
        this.f42986b = location;
        this.f42987c = sensorType;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42985d);
    }
}
