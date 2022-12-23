package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k */
public abstract class C2911k {

    /* renamed from: a */
    public String f9928a;

    /* renamed from: b */
    public Map<String, Object> f9929b;

    /* renamed from: c */
    public String f9930c = null;

    public C2911k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9929b = new HashMap();
            this.f9928a = str;
            return;
        }
        throw new InvalidParameterException();
    }

    /* renamed from: a */
    public void mo13710a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f9929b.put(str, obj);
        }
    }
}
