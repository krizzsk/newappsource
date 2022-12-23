package com.moovit.micromobility.action.requiredinfo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import m30.C5679b;
import m30.C5682e;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityRatingRequiredInfo implements MicroMobilityRequiredInfo {
    public static final Parcelable.Creator<MicroMobilityRatingRequiredInfo> CREATOR = new C4141a();

    /* renamed from: b */
    public static final C4142b f14853b = new C4142b(MicroMobilityRatingRequiredInfo.class);

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityRatingRequiredInfo$a */
    public class C4141a implements Parcelable.Creator<MicroMobilityRatingRequiredInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityRatingRequiredInfo) C19612n.m46981v(parcel, MicroMobilityRatingRequiredInfo.f14853b);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityRatingRequiredInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityRatingRequiredInfo$b */
    public class C4142b extends C19619s<MicroMobilityRatingRequiredInfo> {
        public C4142b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityRatingRequiredInfo();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityRatingRequiredInfo microMobilityRatingRequiredInfo = (MicroMobilityRatingRequiredInfo) obj;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e1 */
    public final void mo19450e1(ServerId serverId, MicroMobilityAction microMobilityAction, MicroMobilityRequiredInfo.C4143a aVar) {
        C5679b bVar = (C5679b) aVar;
        FragmentManager childFragmentManager = bVar.getChildFragmentManager();
        String str = C5682e.f18466k;
        if (childFragmentManager.mo3923A(str) == null) {
            ServerId serverId2 = bVar.f18461n;
            Bundle bundle = new Bundle();
            bundle.putParcelable("rideId", serverId2);
            C5682e eVar = new C5682e();
            eVar.setArguments(bundle);
            eVar.show(childFragmentManager, str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof MicroMobilityRatingRequiredInfo;
    }

    public final int hashCode() {
        return C17884p.m44335F(getClass());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14853b);
    }
}
