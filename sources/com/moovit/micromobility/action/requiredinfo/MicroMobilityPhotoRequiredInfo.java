package com.moovit.micromobility.action.requiredinfo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16017c;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import m30.C5679b;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityPhotoRequiredInfo implements MicroMobilityRequiredInfo {
    public static final Parcelable.Creator<MicroMobilityPhotoRequiredInfo> CREATOR = new C4137a();

    /* renamed from: b */
    public static final C4138b f14849b = new C4138b(MicroMobilityPhotoRequiredInfo.class);

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityPhotoRequiredInfo$a */
    public class C4137a implements Parcelable.Creator<MicroMobilityPhotoRequiredInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityPhotoRequiredInfo) C19612n.m46981v(parcel, MicroMobilityPhotoRequiredInfo.f14849b);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityPhotoRequiredInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityPhotoRequiredInfo$b */
    public class C4138b extends C19619s<MicroMobilityPhotoRequiredInfo> {
        public C4138b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityPhotoRequiredInfo();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityPhotoRequiredInfo microMobilityPhotoRequiredInfo = (MicroMobilityPhotoRequiredInfo) obj;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e1 */
    public final void mo19450e1(ServerId serverId, MicroMobilityAction microMobilityAction, MicroMobilityRequiredInfo.C4143a aVar) {
        C16017c cVar = (C16017c) ((C5679b) aVar).getChildFragmentManager().mo3923A("capture");
        if (cVar != null) {
            cVar.mo48181u2(true, false, (Bundle) null);
            return;
        }
        throw new IllegalStateException("CaptureImageFragment may not be null!");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof MicroMobilityPhotoRequiredInfo;
    }

    public final int hashCode() {
        return C17884p.m44335F(getClass());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14849b);
    }
}
