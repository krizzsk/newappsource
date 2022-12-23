package com.moovit.sdk.profilers.activitytransition.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.config.ConfigType;
import com.moovit.sdk.protocol.ProtocolEnums$ActivityRecognitionType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class ActivityTransitionConfig extends BaseConfig {
    public static final Parcelable.Creator<ActivityTransitionConfig> CREATOR = new C16456a();

    /* renamed from: f */
    public static final C19577c<ProtocolEnums$ActivityRecognitionType> f43028f = new C19577c<>(ProtocolEnums$ActivityRecognitionType.class, ProtocolEnums$ActivityRecognitionType.STILL, ProtocolEnums$ActivityRecognitionType.WALKING, ProtocolEnums$ActivityRecognitionType.RUNNING, ProtocolEnums$ActivityRecognitionType.IN_VEHICLE, ProtocolEnums$ActivityRecognitionType.ON_BICYCLE, ProtocolEnums$ActivityRecognitionType.ON_FOOT, ProtocolEnums$ActivityRecognitionType.TILTING);

    /* renamed from: g */
    public static final C16457b f43029g = new C16457b();

    /* renamed from: h */
    public static final C16458c f43030h = new C16458c(ActivityTransitionConfig.class);

    /* renamed from: e */
    public final Map<ProtocolEnums$ActivityRecognitionType, Integer> f43031e;

    /* renamed from: com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig$a */
    public class C16456a implements Parcelable.Creator<ActivityTransitionConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (ActivityTransitionConfig) C19612n.m46981v(parcel, ActivityTransitionConfig.f43030h);
        }

        public final Object[] newArray(int i) {
            return new ActivityTransitionConfig[i];
        }
    }

    /* renamed from: com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig$b */
    public class C16457b extends C19621u<ActivityTransitionConfig> {
        public C16457b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ActivityTransitionConfig activityTransitionConfig = (ActivityTransitionConfig) obj;
            C19577c<ProtocolEnums$ActivityRecognitionType> cVar = ActivityTransitionConfig.f43028f;
            qVar.mo51940m(activityTransitionConfig.f43033c);
            qVar.mo51939l(activityTransitionConfig.f43032b);
            qVar.mo51966o(activityTransitionConfig.f43031e, ActivityTransitionConfig.f43028f, C19584i.f49769a);
        }
    }

    /* renamed from: com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig$c */
    public class C16458c extends C19620t<ActivityTransitionConfig> {
        public C16458c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new ActivityTransitionConfig(pVar.mo51925m(), pVar.mo51924l(), pVar.mo51961o(ActivityTransitionConfig.f43028f, C19584i.f49769a, new HashMap()));
        }
    }

    public ActivityTransitionConfig(long j, int i, Map<ProtocolEnums$ActivityRecognitionType, Integer> map) {
        super(j, i, ConfigType.ACTIVITY_TRANSITION_CONFIG);
        this.f43031e = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ActivityTransitionConfig{");
        k.append(super.toString());
        k.append(",types=");
        k.append(this.f43031e);
        k.append("}");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f43029g);
    }
}
