package com.masabi.justride.sdk.internal.models.ticket;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p891wk.C20361p;

public final class TicketDisplayConfiguration {

    /* renamed from: a */
    public final Map<String, Integer> f37084a;

    /* renamed from: b */
    public final String f37085b;

    /* renamed from: c */
    public final String f37086c;

    /* renamed from: d */
    public final String f37087d;

    /* renamed from: e */
    public final int f37088e;

    /* renamed from: f */
    public final int f37089f;

    /* renamed from: g */
    public final long f37090g;

    /* renamed from: h */
    public final Map<String, String> f37091h;

    /* renamed from: i */
    public final String f37092i;

    /* renamed from: j */
    public final int f37093j;

    /* renamed from: k */
    public final float f37094k;

    /* renamed from: l */
    public final int f37095l;

    /* renamed from: m */
    public final int f37096m;

    /* renamed from: n */
    public final int f37097n;

    /* renamed from: o */
    public final boolean f37098o;

    /* renamed from: p */
    public final C20361p f37099p;

    public static class BuilderException extends Exception {
        public BuilderException() {
            super("Layout preset required");
        }
    }

    /* renamed from: com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration$a */
    public static class C14652a {

        /* renamed from: a */
        public Map<String, Integer> f37100a;

        /* renamed from: b */
        public String f37101b;

        /* renamed from: c */
        public String f37102c;

        /* renamed from: d */
        public String f37103d;

        /* renamed from: e */
        public Integer f37104e;

        /* renamed from: f */
        public Integer f37105f;

        /* renamed from: g */
        public Long f37106g;

        /* renamed from: h */
        public Map<String, String> f37107h;

        /* renamed from: i */
        public String f37108i;

        /* renamed from: j */
        public Integer f37109j;

        /* renamed from: k */
        public Float f37110k;

        /* renamed from: l */
        public Integer f37111l;

        /* renamed from: m */
        public Integer f37112m;

        /* renamed from: n */
        public Integer f37113n;

        /* renamed from: o */
        public C20361p f37114o;

        /* renamed from: p */
        public Boolean f37115p;

        /* renamed from: a */
        public final TicketDisplayConfiguration mo44337a() throws BuilderException {
            int i;
            int i2;
            long j;
            int i3;
            float f;
            int i4;
            int i5;
            int i6;
            C20361p pVar;
            String str;
            float f2;
            int i7;
            int i8;
            boolean z;
            if (this.f37108i != null) {
                Map<String, Integer> map = this.f37100a;
                if (map == null) {
                    map = Collections.emptyMap();
                }
                Map<String, Integer> map2 = map;
                String str2 = this.f37101b;
                String str3 = this.f37102c;
                String str4 = this.f37103d;
                Integer num = this.f37104e;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1776412;
                }
                Integer num2 = this.f37105f;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = -4321521;
                }
                Long l = this.f37106g;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 60;
                }
                Map<String, String> map3 = this.f37107h;
                if (map3 == null) {
                    map3 = Collections.emptyMap();
                }
                Map<String, String> map4 = map3;
                String str5 = this.f37108i;
                Integer num3 = this.f37109j;
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    i3 = -14242039;
                }
                Float f3 = this.f37110k;
                if (f3 != null) {
                    f = f3.floatValue();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                Integer num4 = this.f37111l;
                if (num4 != null) {
                    i4 = num4.intValue();
                } else {
                    i4 = -526345;
                }
                Integer num5 = this.f37112m;
                if (num5 != null) {
                    i5 = num5.intValue();
                } else {
                    i5 = -16678993;
                }
                Integer num6 = this.f37113n;
                if (num6 != null) {
                    i6 = num6.intValue();
                } else {
                    i6 = -15000805;
                }
                C20361p pVar2 = this.f37114o;
                if (pVar2 != null) {
                    pVar = pVar2;
                    str = str5;
                    i7 = i3;
                    f2 = f;
                    i8 = i4;
                } else {
                    i8 = i4;
                    i7 = i3;
                    f2 = f;
                    str = str5;
                    pVar = new C20361p(0, -546789, false);
                }
                Boolean bool = this.f37115p;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                return new TicketDisplayConfiguration(map2, str2, str3, str4, i, i2, j, map4, str, i7, f2, i8, i5, i6, pVar, z);
            }
            throw new BuilderException();
        }
    }

    public TicketDisplayConfiguration() {
        throw null;
    }

    public TicketDisplayConfiguration(Map map, String str, String str2, String str3, int i, int i2, long j, Map map2, String str4, int i3, float f, int i4, int i5, int i6, C20361p pVar, boolean z) {
        this.f37084a = map;
        this.f37085b = str;
        this.f37086c = str2;
        this.f37087d = str3;
        this.f37088e = i;
        this.f37089f = i2;
        this.f37090g = j;
        this.f37091h = map2;
        this.f37092i = str4;
        this.f37093j = i3;
        this.f37094k = f;
        this.f37095l = i4;
        this.f37096m = i5;
        this.f37097n = i6;
        this.f37099p = pVar;
        this.f37098o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TicketDisplayConfiguration.class != obj.getClass()) {
            return false;
        }
        TicketDisplayConfiguration ticketDisplayConfiguration = (TicketDisplayConfiguration) obj;
        if (this.f37088e == ticketDisplayConfiguration.f37088e && this.f37089f == ticketDisplayConfiguration.f37089f && this.f37090g == ticketDisplayConfiguration.f37090g && this.f37093j == ticketDisplayConfiguration.f37093j && Float.compare(ticketDisplayConfiguration.f37094k, this.f37094k) == 0 && this.f37095l == ticketDisplayConfiguration.f37095l && this.f37096m == ticketDisplayConfiguration.f37096m && this.f37097n == ticketDisplayConfiguration.f37097n && this.f37098o == ticketDisplayConfiguration.f37098o && this.f37084a.equals(ticketDisplayConfiguration.f37084a) && Objects.equals(this.f37085b, ticketDisplayConfiguration.f37085b) && Objects.equals(this.f37086c, ticketDisplayConfiguration.f37086c) && Objects.equals(this.f37087d, ticketDisplayConfiguration.f37087d) && this.f37091h.equals(ticketDisplayConfiguration.f37091h) && this.f37092i.equals(ticketDisplayConfiguration.f37092i) && this.f37099p.equals(ticketDisplayConfiguration.f37099p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f37084a, this.f37085b, this.f37086c, this.f37087d, Integer.valueOf(this.f37088e), Integer.valueOf(this.f37089f), Long.valueOf(this.f37090g), this.f37091h, this.f37092i, Integer.valueOf(this.f37093j), Float.valueOf(this.f37094k), Integer.valueOf(this.f37095l), Integer.valueOf(this.f37096m), Integer.valueOf(this.f37097n), Boolean.valueOf(this.f37098o), this.f37099p});
    }
}
