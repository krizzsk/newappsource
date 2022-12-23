package com.fyber.inneractive.sdk.network;

import com.appboy.models.outgoing.TwitterUser;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.r */
public class C2931r {
    /* renamed from: a */
    public static void m7253a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, C3648e eVar) {
        C2924p pVar = C2924p.CAUGHT_EXCEPTION;
        C2926q.C2927a aVar = new C2926q.C2927a(eVar);
        aVar.f10042c = pVar;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put(TwitterUser.DESCRIPTION_KEY, str2);
        } catch (Exception unused2) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", TwitterUser.DESCRIPTION_KEY, str2);
        }
        aVar.f10045f.put(jSONObject);
        aVar.mo13717a((String) null);
    }

    /* renamed from: a */
    public static void m7254a(Throwable th, InneractiveAdRequest inneractiveAdRequest, C3648e eVar) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        C2924p pVar = C2924p.CAUGHT_EXCEPTION;
        C2926q.C2927a aVar = new C2926q.C2927a(eVar);
        aVar.f10042c = pVar;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = null;
        JSONObject jSONObject = new JSONObject();
        String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (Exception unused) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        String message = th.getMessage();
        try {
            jSONObject.put(TwitterUser.DESCRIPTION_KEY, message);
        } catch (Exception unused2) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", TwitterUser.DESCRIPTION_KEY, message);
        }
        try {
            jSONObject.put("stack_trace", stringBuffer);
        } catch (Exception unused3) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "stack_trace", stringBuffer);
        }
        aVar.f10045f.put(jSONObject);
        aVar.mo13717a((String) null);
    }
}
