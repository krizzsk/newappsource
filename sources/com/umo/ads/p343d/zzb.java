package com.umo.ads.p343d;

import java.io.IOException;
import mf0.C24362h;
import p026b7.C1502g;
import wb0.C13233c;

/* renamed from: com.umo.ads.d.zzb */
public final class zzb extends IOException {
    public final String getMessage() {
        String string = C13233c.m33333b().getString(C1502g.umoak_no_network_connection);
        C24362h.m61210e(string, "AKManager.appContext.get…ak_no_network_connection)");
        return string;
    }
}
