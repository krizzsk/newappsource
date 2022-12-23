package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p583jk.C17884p;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class StopRealTimeInformation implements Parcelable {
    public static final Parcelable.Creator<StopRealTimeInformation> CREATOR = new C7910a();

    /* renamed from: c */
    public static final C7911b f23897c = new C7911b(StopRealTimeInformation.class);

    /* renamed from: b */
    public final Map<String, StopRealTimeCongestion> f23898b;

    /* renamed from: com.moovit.util.time.StopRealTimeInformation$a */
    public class C7910a implements Parcelable.Creator<StopRealTimeInformation> {
        public final Object createFromParcel(Parcel parcel) {
            return (StopRealTimeInformation) C19612n.m46981v(parcel, StopRealTimeInformation.f23897c);
        }

        public final Object[] newArray(int i) {
            return new StopRealTimeInformation[i];
        }
    }

    /* renamed from: com.moovit.util.time.StopRealTimeInformation$b */
    public class C7911b extends C19619s<StopRealTimeInformation> {
        public C7911b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new StopRealTimeInformation(pVar.mo51961o(C19584i.f49770b, StopRealTimeCongestion.f23892f, new HashMap()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51966o(((StopRealTimeInformation) obj).f23898b, C19584i.f49770b, StopRealTimeCongestion.f23892f);
        }
    }

    public StopRealTimeInformation(Map<String, StopRealTimeCongestion> map) {
        C21100e.m49373x(map, "congestionInformation");
        this.f23898b = Collections.unmodifiableMap(map);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopRealTimeInformation)) {
            return false;
        }
        return this.f23898b.equals(((StopRealTimeInformation) obj).f23898b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f23898b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23897c);
    }
}
