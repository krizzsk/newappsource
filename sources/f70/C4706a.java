package f70;

import c00.C13717b;
import ce0.C21100e;
import com.moovit.sdk.analytics.SdkAnalyticsAttributeKey;
import com.moovit.sdk.analytics.SdkAnalyticsEventKey;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import p583jk.C17884p;

/* renamed from: f70.a */
public final class C4706a {

    /* renamed from: a */
    public final SdkAnalyticsEventKey f15982a;

    /* renamed from: b */
    public final long f15983b = System.currentTimeMillis();

    /* renamed from: c */
    public final Map<SdkAnalyticsAttributeKey, String> f15984c;

    public C4706a(SdkAnalyticsEventKey sdkAnalyticsEventKey, EnumMap enumMap) {
        C21100e.m49373x(sdkAnalyticsEventKey, "eventKey");
        this.f15982a = sdkAnalyticsEventKey;
        C21100e.m49373x(enumMap, "attributes");
        this.f15984c = Collections.unmodifiableMap(enumMap);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4706a)) {
            return false;
        }
        C4706a aVar = (C4706a) obj;
        if (!this.f15982a.equals(aVar.f15982a) || this.f15983b != aVar.f15983b || !this.f15984c.equals(aVar.f15984c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f15982a), C17884p.m44334E(this.f15983b), C17884p.m44335F(this.f15984c));
    }

    public final String toString() {
        return this.f15982a.name() + " Attr: " + C13717b.m34270q(this.f15984c);
    }
}
