package com.moovit.micromobility.action.requiredinfo;

import android.os.Parcelable;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityNoRequiredInfo;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityPhotoRequiredInfo;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityQrCodeRequiredInfo;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRatingRequiredInfo;
import com.moovit.network.model.ServerId;
import p810sz.C19617r;

public interface MicroMobilityRequiredInfo extends Parcelable {

    /* renamed from: c0 */
    public static final C19617r f14854c0;

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo$a */
    public interface C4143a {
    }

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        MicroMobilityNoRequiredInfo.C4136b bVar = MicroMobilityNoRequiredInfo.f14848b;
        aVar.mo51969a(1, MicroMobilityNoRequiredInfo.class, bVar, bVar);
        MicroMobilityPhotoRequiredInfo.C4138b bVar2 = MicroMobilityPhotoRequiredInfo.f14849b;
        aVar.mo51969a(2, MicroMobilityPhotoRequiredInfo.class, bVar2, bVar2);
        MicroMobilityQrCodeRequiredInfo.C4140b bVar3 = MicroMobilityQrCodeRequiredInfo.f14850d;
        aVar.mo51969a(3, MicroMobilityQrCodeRequiredInfo.class, bVar3, bVar3);
        MicroMobilityRatingRequiredInfo.C4142b bVar4 = MicroMobilityRatingRequiredInfo.f14853b;
        aVar.mo51969a(4, MicroMobilityRatingRequiredInfo.class, bVar4, bVar4);
        f14854c0 = aVar.mo51970b();
    }

    /* renamed from: e1 */
    void mo19450e1(ServerId serverId, MicroMobilityAction microMobilityAction, C4143a aVar);
}
