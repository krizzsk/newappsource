package com.moovit.sdk.profilers.places.config;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.config.ConfigType;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class PlacesConfig extends BaseConfig {
    public static final Parcelable.Creator<PlacesConfig> CREATOR = new C16459a();

    /* renamed from: j */
    public static final C16460b f43038j = new C16460b();

    /* renamed from: k */
    public static final C16461c f43039k = new C16461c(PlacesConfig.class);

    /* renamed from: e */
    public final PlacesProfilerType f43040e;

    /* renamed from: f */
    public final int f43041f;

    /* renamed from: g */
    public final int f43042g;

    /* renamed from: h */
    public final int f43043h;

    /* renamed from: i */
    public final int f43044i;

    /* renamed from: com.moovit.sdk.profilers.places.config.PlacesConfig$a */
    public class C16459a implements Parcelable.Creator<PlacesConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (PlacesConfig) C19612n.m46981v(parcel, PlacesConfig.f43039k);
        }

        public final Object[] newArray(int i) {
            return new PlacesConfig[i];
        }
    }

    /* renamed from: com.moovit.sdk.profilers.places.config.PlacesConfig$b */
    public class C16460b extends C19621u<PlacesConfig> {
        public C16460b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            PlacesConfig placesConfig = (PlacesConfig) obj;
            Parcelable.Creator<PlacesConfig> creator = PlacesConfig.CREATOR;
            qVar.mo51940m(placesConfig.f43033c);
            qVar.mo51939l(placesConfig.f43032b);
            PlacesProfilerType.CODER.write(placesConfig.f43040e, qVar);
            qVar.mo51939l(placesConfig.f43041f);
            qVar.mo51939l(placesConfig.f43042g);
            qVar.mo51939l(placesConfig.f43043h);
            qVar.mo51939l(placesConfig.f43044i);
        }
    }

    /* renamed from: com.moovit.sdk.profilers.places.config.PlacesConfig$c */
    public class C16461c extends C19620t<PlacesConfig> {
        public C16461c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new PlacesConfig(pVar.mo51925m(), pVar.mo51924l(), PlacesProfilerType.CODER.read(pVar), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }
    }

    /* renamed from: com.moovit.sdk.profilers.places.config.PlacesConfig$d */
    public static /* synthetic */ class C16462d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.sdk.profilers.places.config.PlacesProfilerType[] r0 = com.moovit.sdk.profilers.places.config.PlacesProfilerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43045a = r0
                com.moovit.sdk.profilers.places.config.PlacesProfilerType r1 = com.moovit.sdk.profilers.places.config.PlacesProfilerType.PRIORITY_HIGH_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43045a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.sdk.profilers.places.config.PlacesProfilerType r1 = com.moovit.sdk.profilers.places.config.PlacesProfilerType.PRIORITY_BALANCED_POWER_ACCURACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43045a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.sdk.profilers.places.config.PlacesProfilerType r1 = com.moovit.sdk.profilers.places.config.PlacesProfilerType.PRIORITY_LOW_POWER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43045a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.sdk.profilers.places.config.PlacesProfilerType r1 = com.moovit.sdk.profilers.places.config.PlacesProfilerType.PRIORITY_NO_POWER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.places.config.PlacesConfig.C16462d.<clinit>():void");
        }
    }

    public PlacesConfig(long j, int i, PlacesProfilerType placesProfilerType, int i2, int i3, int i4, int i5) {
        super(j, i, ConfigType.PLACES_CONFIG);
        C21100e.m49373x(placesProfilerType, "placesProfilerType");
        this.f43040e = placesProfilerType;
        this.f43041f = i2;
        this.f43042g = i3;
        this.f43043h = i4;
        this.f43044i = i5;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PlacesConfig{");
        k.append(super.toString());
        k.append(",placesProfilerType=");
        k.append(this.f43040e);
        k.append(", maxInterval=");
        k.append(this.f43041f);
        k.append(", minInterval=");
        k.append(this.f43042g);
        k.append(", smallestDisplacement=");
        k.append(this.f43043h);
        k.append(", bulkTime=");
        return C16530d.m42014g(k, this.f43044i, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f43038j);
    }
}
