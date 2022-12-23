package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.d */
public class C2831d implements C2833f {

    /* renamed from: a */
    public Long f9725a = null;

    /* renamed from: b */
    public Long f9726b = null;

    /* renamed from: c */
    public Long f9727c = null;

    /* renamed from: d */
    public Long f9728d = null;

    /* renamed from: e */
    public Long f9729e = null;

    /* renamed from: f */
    public Long f9730f = null;

    /* renamed from: g */
    public Long f9731g = null;

    /* renamed from: h */
    public Long f9732h = null;

    /* renamed from: a */
    public boolean mo13621a() {
        return true;
    }

    /* renamed from: b */
    public Long mo13622b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9731g = valueOf;
        return valueOf;
    }

    /* renamed from: c */
    public Long mo13623c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9725a = valueOf;
        return valueOf;
    }

    /* renamed from: d */
    public Long mo13624d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9728d = valueOf;
        return valueOf;
    }

    /* renamed from: e */
    public Long mo13625e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9730f = valueOf;
        return valueOf;
    }

    /* renamed from: f */
    public Long mo13626f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9726b = valueOf;
        return valueOf;
    }

    /* renamed from: g */
    public Long mo13627g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9727c = valueOf;
        return valueOf;
    }

    /* renamed from: h */
    public Long mo13628h() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9732h = valueOf;
        return valueOf;
    }

    /* renamed from: i */
    public Long mo13629i() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f9729e = valueOf;
        return valueOf;
    }

    /* renamed from: j */
    public Map<String, Long> mo13630j() {
        HashMap hashMap = new HashMap();
        Long l = this.f9726b;
        if (!(l == null || this.f9725a == null)) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f9725a.longValue()));
        }
        Long l2 = this.f9732h;
        if (!(l2 == null || this.f9726b == null)) {
            hashMap.put("sdk_got_response_from_markup_url", Long.valueOf(l2.longValue() - this.f9726b.longValue()));
        }
        Long l3 = this.f9728d;
        if (!(l3 == null || this.f9732h == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f9732h.longValue()));
        }
        Long l4 = this.f9727c;
        if (!(l4 == null || this.f9726b == null)) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l4.longValue() - this.f9726b.longValue()));
        }
        Long l5 = this.f9728d;
        if (!(l5 == null || this.f9727c == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l5.longValue() - this.f9727c.longValue()));
        }
        Long l6 = this.f9729e;
        if (!(l6 == null || this.f9728d == null)) {
            hashMap.put("ad_loaded_result", Long.valueOf(l6.longValue() - this.f9728d.longValue()));
        }
        Long l7 = this.f9730f;
        if (!(l7 == null || this.f9729e == null)) {
            hashMap.put("publisher_notified", Long.valueOf(l7.longValue() - this.f9729e.longValue()));
        }
        Long l8 = this.f9731g;
        if (!(l8 == null || this.f9725a == null)) {
            hashMap.put("roundtrip", Long.valueOf(l8.longValue() - this.f9725a.longValue()));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("MetricsCollectorData{");
        if (!(this.f9725a == null || this.f9726b == null)) {
            k.append(" sdk_init_network_req=");
            k.append(this.f9726b.longValue() - this.f9725a.longValue());
        }
        if (!(this.f9732h == null || this.f9726b == null)) {
            k.append(", sdk_got_response_from_markup_url=");
            k.append(this.f9732h.longValue() - this.f9726b.longValue());
        }
        if (!(this.f9727c == null || this.f9726b == null)) {
            k.append(", sdk_got_server_res=");
            k.append(this.f9727c.longValue() - this.f9726b.longValue());
        }
        if (!(this.f9728d == null || this.f9727c == null)) {
            k.append(", sdk_parsed_res=");
            k.append(this.f9728d.longValue() - this.f9727c.longValue());
        }
        if (!(this.f9729e == null || this.f9728d == null)) {
            k.append(", ad_loaded_result=");
            k.append(this.f9729e.longValue() - this.f9728d.longValue());
        }
        if (!(this.f9730f == null || this.f9729e == null)) {
            k.append(", publisher_notified=");
            k.append(this.f9730f.longValue() - this.f9729e.longValue());
        }
        if (!(this.f9731g == null || this.f9725a == null)) {
            k.append(", roundtrip=");
            k.append(this.f9731g.longValue() - this.f9725a.longValue());
        }
        k.append(" }");
        return k.toString();
    }
}
