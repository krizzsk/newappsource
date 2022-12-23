package com.moovit.micromobility.action.requiredinfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import m30.C5679b;
import n30.C5847a;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityNoRequiredInfo implements MicroMobilityRequiredInfo {
    public static final Parcelable.Creator<MicroMobilityNoRequiredInfo> CREATOR = new C4135a();

    /* renamed from: b */
    public static final C4136b f14848b = new C4136b(MicroMobilityNoRequiredInfo.class);

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityNoRequiredInfo$a */
    public class C4135a implements Parcelable.Creator<MicroMobilityNoRequiredInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityNoRequiredInfo) C19612n.m46981v(parcel, MicroMobilityNoRequiredInfo.f14848b);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityNoRequiredInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityNoRequiredInfo$b */
    public class C4136b extends C19619s<MicroMobilityNoRequiredInfo> {
        public C4136b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityNoRequiredInfo();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityNoRequiredInfo microMobilityNoRequiredInfo = (MicroMobilityNoRequiredInfo) obj;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e1 */
    public final void mo19450e1(ServerId serverId, MicroMobilityAction microMobilityAction, MicroMobilityRequiredInfo.C4143a aVar) {
        ((C5679b) aVar).mo21529m2(serverId, microMobilityAction, (C5847a) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof MicroMobilityQrCodeRequiredInfo;
    }

    public final int hashCode() {
        return C17884p.m44335F(getClass());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14848b);
    }
}
