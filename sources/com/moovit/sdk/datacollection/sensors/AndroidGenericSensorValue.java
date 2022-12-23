package com.moovit.sdk.datacollection.sensors;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class AndroidGenericSensorValue implements SensorValue {
    public static final Parcelable.Creator<AndroidGenericSensorValue> CREATOR = new C16442a();

    /* renamed from: e */
    public static final C16443b f42981e = new C16443b(AndroidGenericSensorValue.class);

    /* renamed from: b */
    public final int f42982b;

    /* renamed from: c */
    public final long f42983c;

    /* renamed from: d */
    public final float[] f42984d;

    /* renamed from: com.moovit.sdk.datacollection.sensors.AndroidGenericSensorValue$a */
    public class C16442a implements Parcelable.Creator<AndroidGenericSensorValue> {
        public final Object createFromParcel(Parcel parcel) {
            return (AndroidGenericSensorValue) C19612n.m46981v(parcel, AndroidGenericSensorValue.f42981e);
        }

        public final Object[] newArray(int i) {
            return new AndroidGenericSensorValue[i];
        }
    }

    /* renamed from: com.moovit.sdk.datacollection.sensors.AndroidGenericSensorValue$b */
    public class C16443b extends C19619s<AndroidGenericSensorValue> {
        public C16443b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new AndroidGenericSensorValue(pVar.mo51924l(), pVar.mo51925m(), pVar.mo51945k());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            AndroidGenericSensorValue androidGenericSensorValue = (AndroidGenericSensorValue) obj;
            qVar.mo51939l(androidGenericSensorValue.f42982b);
            qVar.mo51940m(androidGenericSensorValue.f42983c);
            qVar.mo51952k(androidGenericSensorValue.f42984d);
        }
    }

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.append(1, SensorType.Accelerometer);
        sparseArray.append(4, SensorType.Gyro);
        sparseArray.append(2, SensorType.Magnetic);
        sparseArray.append(19, SensorType.StepsCounter);
    }

    public AndroidGenericSensorValue(int i, long j, float[] fArr) {
        this.f42982b = i;
        this.f42983c = j;
        this.f42984d = (float[]) fArr.clone();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42981e);
    }
}
