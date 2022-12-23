package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.serverapi.C3658c;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.d0 */
public class C2895d0 {

    /* renamed from: a */
    public final InneractiveAdRequest f9894a;

    /* renamed from: b */
    public final C3658c f9895b;

    /* renamed from: c */
    public Map<String, String> f9896c;

    public C2895d0(InneractiveAdRequest inneractiveAdRequest, C3658c cVar) {
        this.f9894a = inneractiveAdRequest;
        this.f9895b = cVar;
    }

    /* renamed from: a */
    public final void mo13694a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f9896c.put(str, str2);
        }
    }
}
