package com.moovit.sdk.profilers.steps.config;

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

public class StepsCounterConfig extends ScheduleConfig {
    public static final Parcelable.Creator<StepsCounterConfig> CREATOR = new C16463a();

    /* renamed from: g */
    public static final C16464b f43051g = new C16464b();

    /* renamed from: h */
    public static final C16465c f43052h = new C16465c(StepsCounterConfig.class);

    /* renamed from: f */
    public final int f43053f;

    /* renamed from: com.moovit.sdk.profilers.steps.config.StepsCounterConfig$a */
    public class C16463a implements Parcelable.Creator<StepsCounterConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (StepsCounterConfig) C19612n.m46981v(parcel, StepsCounterConfig.f43052h);
        }

        public final Object[] newArray(int i) {
            return new StepsCounterConfig[i];
        }
    }

    /* renamed from: com.moovit.sdk.profilers.steps.config.StepsCounterConfig$b */
    public class C16464b extends C19621u<StepsCounterConfig> {
        public C16464b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            StepsCounterConfig stepsCounterConfig = (StepsCounterConfig) obj;
            Parcelable.Creator<StepsCounterConfig> creator = StepsCounterConfig.CREATOR;
            qVar.mo51940m(stepsCounterConfig.f43033c);
            qVar.mo51939l(stepsCounterConfig.f43032b);
            qVar.mo51939l(stepsCounterConfig.f43053f);
            qVar.mo51965h(stepsCounterConfig.f43047e, C19639a.f49827d);
        }
    }

    /* renamed from: com.moovit.sdk.profilers.steps.config.StepsCounterConfig$c */
    public class C16465c extends C19620t<StepsCounterConfig> {
        public C16465c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new StepsCounterConfig(pVar.mo51925m(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51959g(C19639a.f49827d));
        }
    }

    public StepsCounterConfig(long j, int i, int i2, ArrayList arrayList) {
        super(j, i, ConfigType.STEPS_COUNTER_CONFIG, arrayList);
        this.f43053f = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("StepsCounterConfig{");
        k.append(super.toString());
        k.append(",sampleRateInMin=");
        return C16530d.m42014g(k, this.f43053f, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f43051g);
    }
}
