package com.fyber.inneractive.sdk.config.global;

import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* renamed from: com.fyber.inneractive.sdk.config.global.f */
public class C2639f implements C2637d {

    /* renamed from: a */
    public String f9299a;

    /* renamed from: b */
    public boolean f9300b;

    public C2639f(String str, boolean z) {
        this.f9299a = str;
        this.f9300b = z;
    }

    /* renamed from: a */
    public boolean mo13231a(C2638e eVar) {
        String str = this.f9299a;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) {
            return !this.f9300b;
        }
        return this.f9300b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"os", this.f9299a, Boolean.valueOf(this.f9300b)});
    }
}
