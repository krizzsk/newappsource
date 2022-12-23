package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.m */
public class C2872m extends C2858a {
    public C2872m(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        String str = this.f9840b.get("uri");
        if (str == null || "".equals(str)) {
            this.f9841c.mo15451a(C2865f.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        L l = ((IAmraidWebViewController) this.f9841c).f12962g;
        if (l != null) {
            ((C3764d.C3770f) l).mo13918a(str);
        }
    }

    /* renamed from: c */
    public String mo13656c() {
        return this.f9840b.get("uri");
    }
}
