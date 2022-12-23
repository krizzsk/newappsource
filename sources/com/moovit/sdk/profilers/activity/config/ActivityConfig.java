package com.moovit.sdk.profilers.activity.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.config.ConfigType;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class ActivityConfig extends BaseConfig {
    public static final Parcelable.Creator<ActivityConfig> CREATOR = new C16453a();

    /* renamed from: f */
    public static final C16454b f43020f = new C16454b();

    /* renamed from: g */
    public static final C16455c f43021g = new C16455c(ActivityConfig.class);

    /* renamed from: e */
    public final long f43022e;

    /* renamed from: com.moovit.sdk.profilers.activity.config.ActivityConfig$a */
    public class C16453a implements Parcelable.Creator<ActivityConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (ActivityConfig) C19612n.m46981v(parcel, ActivityConfig.f43021g);
        }

        public final Object[] newArray(int i) {
            return new ActivityConfig[i];
        }
    }

    /* renamed from: com.moovit.sdk.profilers.activity.config.ActivityConfig$b */
    public class C16454b extends C19621u<ActivityConfig> {
        public C16454b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ActivityConfig activityConfig = (ActivityConfig) obj;
            Parcelable.Creator<ActivityConfig> creator = ActivityConfig.CREATOR;
            qVar.mo51940m(activityConfig.f43033c);
            qVar.mo51939l(activityConfig.f43032b);
            qVar.mo51940m(activityConfig.f43022e);
        }
    }

    /* renamed from: com.moovit.sdk.profilers.activity.config.ActivityConfig$c */
    public class C16455c extends C19620t<ActivityConfig> {
        public C16455c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new ActivityConfig(pVar.mo51925m(), pVar.mo51924l(), pVar.mo51925m());
        }
    }

    public ActivityConfig(long j, int i, long j2) {
        super(j, i, ConfigType.ACTIVITY_CONFIG);
        this.f43022e = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ActivityConfig{");
        k.append(super.toString());
        k.append(",detectionInterval=");
        return C25541a.m63884o(k, this.f43022e, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f43020f);
    }
}
