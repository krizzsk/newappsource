package com.moovit.sdk.profilers.wifiscan.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.sdk.profilers.config.ConfigType;
import com.moovit.sdk.profilers.schedule.ScheduleConfig;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import t70.C19639a;

public class WifiScansConfig extends ScheduleConfig {
    public static final Parcelable.Creator<WifiScansConfig> CREATOR = new C16466a();

    /* renamed from: g */
    public static final C16467b f43057g = new C16467b();

    /* renamed from: h */
    public static final C16468c f43058h = new C16468c(WifiScansConfig.class);

    /* renamed from: f */
    public final int f43059f;

    /* renamed from: com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig$a */
    public class C16466a implements Parcelable.Creator<WifiScansConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (WifiScansConfig) C19612n.m46981v(parcel, WifiScansConfig.f43058h);
        }

        public final Object[] newArray(int i) {
            return new WifiScansConfig[i];
        }
    }

    /* renamed from: com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig$b */
    public class C16467b extends C19621u<WifiScansConfig> {
        public C16467b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            WifiScansConfig wifiScansConfig = (WifiScansConfig) obj;
            Parcelable.Creator<WifiScansConfig> creator = WifiScansConfig.CREATOR;
            qVar.mo51940m(wifiScansConfig.f43033c);
            qVar.mo51939l(wifiScansConfig.f43032b);
            qVar.mo51939l(wifiScansConfig.f43059f);
            qVar.mo51965h(wifiScansConfig.f43047e, C19639a.f49827d);
        }
    }

    /* renamed from: com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig$c */
    public class C16468c extends C19620t<WifiScansConfig> {
        public C16468c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new WifiScansConfig(pVar.mo51925m(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51959g(C19639a.f49827d));
        }
    }

    public WifiScansConfig(long j, int i, int i2, ArrayList arrayList) {
        super(j, i, ConfigType.WIFI_SCANS_CONFIG, arrayList);
        this.f43059f = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("WifiScansConfig{");
        k.append(super.toString());
        k.append(",sampleRateInMin=");
        return C16530d.m42014g(k, this.f43059f, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f43057g);
    }
}
