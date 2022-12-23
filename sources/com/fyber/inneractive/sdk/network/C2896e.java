package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.network.e */
public class C2896e implements C2936u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f9897a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f9898b;

    /* renamed from: c */
    public final /* synthetic */ long f9899c;

    public C2896e(C2891c cVar, String str, JSONArray jSONArray, long j) {
        this.f9897a = str;
        this.f9898b = jSONArray;
        this.f9899c = j;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m9902a("Event Request: Hitting URL finished: %s, body: %s", this.f9897a, this.f9898b);
        if (exc == null) {
            IAlog.m9902a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m9902a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.m9902a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f9899c));
    }
}
