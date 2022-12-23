package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.metrics.C2827a;
import com.fyber.inneractive.sdk.response.C3648e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.b */
public class C2762b<T extends C3648e> extends C2827a {

    /* renamed from: e */
    public static final String f9542e = String.valueOf(24);

    /* renamed from: f */
    public static final String f9543f = String.valueOf(1);

    /* renamed from: b */
    public final T f9544b;

    /* renamed from: c */
    public final InneractiveAdRequest f9545c;

    /* renamed from: d */
    public final JSONArray f9546d;

    public C2762b(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f9544b = t;
        this.f9545c = inneractiveAdRequest;
        this.f9546d = jSONArray;
    }
}
