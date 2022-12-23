package com.moovit.sdk.datacollection.sensors;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import j70.C17712a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class WifiSensorValue implements SensorValue {
    public static final Parcelable.Creator<WifiSensorValue> CREATOR = new C16446a();

    /* renamed from: e */
    public static final C16447b f42989e = new C16447b(WifiSensorValue.class);

    /* renamed from: b */
    public ArrayList f42990b;

    /* renamed from: c */
    public Location f42991c;

    /* renamed from: d */
    public boolean f42992d;

    /* renamed from: com.moovit.sdk.datacollection.sensors.WifiSensorValue$a */
    public class C16446a implements Parcelable.Creator<WifiSensorValue> {
        public final Object createFromParcel(Parcel parcel) {
            return (WifiSensorValue) C19612n.m46981v(parcel, WifiSensorValue.f42989e);
        }

        public final Object[] newArray(int i) {
            return new WifiSensorValue[i];
        }
    }

    /* renamed from: com.moovit.sdk.datacollection.sensors.WifiSensorValue$b */
    public class C16447b extends C19619s<WifiSensorValue> {
        public C16447b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            boolean z;
            ArrayList f = pVar.mo51958f(C17712a.f45463j);
            if (i == 1) {
                z = pVar.mo51919b();
            } else {
                z = false;
            }
            return new WifiSensorValue(f, z, (Location) null);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            WifiSensorValue wifiSensorValue = (WifiSensorValue) obj;
            qVar.mo51964g(wifiSensorValue.f42990b, C17712a.f45463j);
            qVar.mo51934b(wifiSensorValue.f42992d);
        }
    }

    public WifiSensorValue() {
        throw null;
    }

    public WifiSensorValue(List<C17712a> list, boolean z, Location location) {
        this.f42992d = z;
        this.f42990b = new ArrayList(list);
        this.f42991c = location;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42989e);
    }
}
