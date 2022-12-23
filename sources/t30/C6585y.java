package t30;

import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import java.util.concurrent.Callable;
import l30.C5570c0;

/* renamed from: t30.y */
public final class C6585y extends C13746a<C6585y, C6586z> implements Callable<C6586z> {
    public C6585y(C13752e eVar, String str) {
        super(eVar, C5570c0.server_path_cdn_server_url, C5570c0.api_path_micro_mobility_zones, false, C6586z.class);
        C21100e.m49373x(str, "serviceId");
        mo52629r("serviceId", str);
    }

    public final Object call() throws Exception {
        return (C6586z) mo52626J();
    }
}
