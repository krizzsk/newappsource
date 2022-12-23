package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.core.log.DeviceLog;
import oc0.C12981a;
import oc0.C12982b;
import oc0.C12984d;
import rc0.C13061c;
import uc0.C13162c;
import xc0.C13255c;

public class ScarAdapterFactory {
    public static final int CODE_19_2 = 201604000;
    public static final int CODE_19_5 = 203404000;
    public static final int CODE_19_8 = 204890000;
    public static final int CODE_20_0 = 210402000;

    public C12984d createScarAdapter(long j, C12982b bVar) {
        if (j >= 210402000) {
            return new C13255c(bVar);
        }
        if (j >= 203404000 && j <= 204890000) {
            return new C13162c(bVar);
        }
        if (j >= 201604000) {
            return new C13061c(bVar);
        }
        String format = String.format("SCAR version %s is not supported.", new Object[]{Long.valueOf(j)});
        bVar.handleError(new C12981a(GMAEvent.SCAR_UNSUPPORTED, format, new Object[0]));
        DeviceLog.debug(format);
        return null;
    }
}
