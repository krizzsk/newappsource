package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p048dv.C2721g;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.response.e */
public abstract class C3648e {

    /* renamed from: A */
    public boolean f12742A = false;

    /* renamed from: a */
    public long f12743a;

    /* renamed from: b */
    public long f12744b;

    /* renamed from: c */
    public long f12745c;

    /* renamed from: d */
    public String f12746d;

    /* renamed from: e */
    public int f12747e;

    /* renamed from: f */
    public int f12748f;

    /* renamed from: g */
    public int f12749g;

    /* renamed from: h */
    public String f12750h;

    /* renamed from: i */
    public String f12751i;

    /* renamed from: j */
    public String f12752j;

    /* renamed from: k */
    public String f12753k;

    /* renamed from: l */
    public String f12754l;

    /* renamed from: m */
    public String f12755m;

    /* renamed from: n */
    public UnitDisplayType f12756n;

    /* renamed from: o */
    public String f12757o;

    /* renamed from: p */
    public Map<String, String> f12758p;

    /* renamed from: q */
    public String f12759q;

    /* renamed from: r */
    public ImpressionData f12760r;

    /* renamed from: s */
    public C2721g f12761s;

    /* renamed from: t */
    public int f12762t = 0;

    /* renamed from: u */
    public float f12763u = -1.0f;

    /* renamed from: v */
    public String f12764v;

    /* renamed from: w */
    public int f12765w = -1;

    /* renamed from: x */
    public Exception f12766x;

    /* renamed from: y */
    public String f12767y;

    /* renamed from: z */
    public String f12768z;

    /* renamed from: a */
    public int mo15293a() {
        return this.f12748f;
    }

    /* renamed from: a */
    public abstract InneractiveErrorCode mo13326a(InneractiveAdRequest inneractiveAdRequest);

    /* renamed from: a */
    public abstract InneractiveErrorCode mo13327a(InneractiveAdRequest inneractiveAdRequest, C2666s sVar);

    /* renamed from: b */
    public UnitDisplayType mo15294b() {
        return this.f12756n;
    }

    /* renamed from: c */
    public int mo15295c() {
        return this.f12747e;
    }

    /* renamed from: d */
    public boolean mo15296d() {
        if (this.f12743a < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
