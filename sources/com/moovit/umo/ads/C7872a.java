package com.moovit.umo.ads;

import android.content.Context;
import p906wz.C20431c;
import w90.C13221a;

/* renamed from: com.moovit.umo.ads.a */
public final class C7872a extends C20431c<C7872a, C7873b> {
    public C7872a(int i, int i2, Context context, String str, String str2) {
        super(context, C13221a.server_path_cdn_server_url, C13221a.api_path_payment_umo_ads_connection_info, false, C7873b.class);
        mo52627p(i, "userTypeId");
        mo52629r("clientVersion", str);
        mo52627p(i2, "osTypeId");
        mo52629r("apiKey", str2);
    }
}
