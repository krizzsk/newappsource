package p543hq;

import c00.C13717b;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.network.model.ServerId;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import p583jk.C17884p;
import p988j$.util.DesugarTimeZone;

/* renamed from: hq.b */
public final class C17474b {

    /* renamed from: a */
    public final AnalyticsEventKey f44993a;

    /* renamed from: b */
    public final long f44994b;

    /* renamed from: c */
    public final Map<AnalyticsAttributeKey, String> f44995c;

    /* renamed from: hq.b$a */
    public static class C17475a {

        /* renamed from: c */
        public static final SimpleDateFormat f44996c;

        /* renamed from: a */
        public final AnalyticsEventKey f44997a;

        /* renamed from: b */
        public final EnumMap f44998b = new EnumMap(AnalyticsAttributeKey.class);

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss", Locale.ENGLISH);
            f44996c = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public C17475a(AnalyticsEventKey analyticsEventKey) {
            C21100e.m49373x(analyticsEventKey, "eventKey");
            this.f44997a = analyticsEventKey;
        }

        /* renamed from: a */
        public final C17474b mo49933a() {
            return new C17474b(this.f44997a, this.f44998b);
        }

        /* renamed from: b */
        public final void mo49934b(AnalyticsAttributeKey analyticsAttributeKey, float f) {
            mo49939g(analyticsAttributeKey, Float.toString(f));
        }

        /* renamed from: c */
        public final void mo49935c(AnalyticsAttributeKey analyticsAttributeKey, int i) {
            mo49939g(analyticsAttributeKey, Integer.toString(i));
        }

        /* renamed from: d */
        public final void mo49936d(AnalyticsAttributeKey analyticsAttributeKey, long j) {
            mo49939g(analyticsAttributeKey, Long.toString(j));
        }

        /* renamed from: e */
        public final void mo49937e(AnalyticsAttributeKey analyticsAttributeKey, ServerId serverId) {
            mo49939g(analyticsAttributeKey, serverId == null ? null : serverId.mo19751c());
        }

        /* renamed from: f */
        public final void mo49938f(AnalyticsAttributeKey analyticsAttributeKey, Object obj) {
            mo49939g(analyticsAttributeKey, obj == null ? null : obj.toString());
        }

        /* renamed from: g */
        public final void mo49939g(AnalyticsAttributeKey analyticsAttributeKey, String str) {
            this.f44998b.put(analyticsAttributeKey, str);
        }

        /* renamed from: h */
        public final void mo49940h(AnalyticsAttributeKey analyticsAttributeKey, short s) {
            mo49939g(analyticsAttributeKey, Short.toString(s));
        }

        /* renamed from: i */
        public final void mo49941i(AnalyticsAttributeKey analyticsAttributeKey, boolean z) {
            mo49939g(analyticsAttributeKey, Boolean.toString(z));
        }

        /* renamed from: j */
        public final void mo49942j(AnalyticsAttributeKey analyticsAttributeKey, int i) {
            mo49939g(analyticsAttributeKey, String.format(Locale.ENGLISH, "%32s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0'));
        }

        /* renamed from: k */
        public final void mo49943k(AnalyticsAttributeKey analyticsAttributeKey, ServerId serverId) {
            mo49945m(analyticsAttributeKey, serverId == null ? null : serverId.mo19751c());
        }

        /* renamed from: l */
        public final void mo49944l(AnalyticsAttributeKey analyticsAttributeKey, Object obj) {
            mo49945m(analyticsAttributeKey, obj == null ? null : obj.toString());
        }

        /* renamed from: m */
        public final void mo49945m(AnalyticsAttributeKey analyticsAttributeKey, String str) {
            if (str != null) {
                this.f44998b.put(analyticsAttributeKey, str);
            }
        }

        /* renamed from: n */
        public final void mo49946n(AnalyticsAttributeKey analyticsAttributeKey, long j) {
            mo49939g(analyticsAttributeKey, f44996c.format(Long.valueOf(j)));
        }
    }

    public C17474b(AnalyticsEventKey analyticsEventKey, Map<AnalyticsAttributeKey, String> map) {
        C21100e.m49373x(analyticsEventKey, "eventKey");
        this.f44993a = analyticsEventKey;
        this.f44994b = System.currentTimeMillis();
        C21100e.m49373x(map, "attributes");
        this.f44995c = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17474b)) {
            return false;
        }
        C17474b bVar = (C17474b) obj;
        if (!this.f44993a.equals(bVar.f44993a) || this.f44994b != bVar.f44994b || !this.f44995c.equals(bVar.f44995c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f44993a), C17884p.m44334E(this.f44994b), C17884p.m44335F(this.f44995c));
    }

    public final String toString() {
        return this.f44993a.name() + " Attr: " + C13717b.m34270q(this.f44995c);
    }

    public C17474b(AnalyticsEventKey analyticsEventKey) {
        this(analyticsEventKey, Collections.emptyMap());
    }
}
