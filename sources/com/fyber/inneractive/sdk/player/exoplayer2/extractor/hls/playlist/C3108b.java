package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b */
public final class C3108b extends C3110c {

    /* renamed from: b */
    public final int f10730b;

    /* renamed from: c */
    public final long f10731c;

    /* renamed from: d */
    public final long f10732d;

    /* renamed from: e */
    public final boolean f10733e;

    /* renamed from: f */
    public final int f10734f;

    /* renamed from: g */
    public final int f10735g;

    /* renamed from: h */
    public final int f10736h;

    /* renamed from: i */
    public final long f10737i;

    /* renamed from: j */
    public final boolean f10738j;

    /* renamed from: k */
    public final boolean f10739k;

    /* renamed from: l */
    public final C3109a f10740l;

    /* renamed from: m */
    public final List<C3109a> f10741m;

    /* renamed from: n */
    public final List<String> f10742n;

    /* renamed from: o */
    public final long f10743o;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a */
    public static final class C3109a implements Comparable<Long> {

        /* renamed from: a */
        public final String f10744a;

        /* renamed from: b */
        public final long f10745b;

        /* renamed from: c */
        public final int f10746c;

        /* renamed from: d */
        public final long f10747d;

        /* renamed from: e */
        public final boolean f10748e;

        /* renamed from: f */
        public final String f10749f;

        /* renamed from: g */
        public final String f10750g;

        /* renamed from: h */
        public final long f10751h;

        /* renamed from: i */
        public final long f10752i;

        public C3109a(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
            this.f10744a = str;
            this.f10745b = j;
            this.f10746c = i;
            this.f10747d = j2;
            this.f10748e = z;
            this.f10749f = str2;
            this.f10750g = str3;
            this.f10751h = j3;
            this.f10752i = j4;
        }

        public int compareTo(Object obj) {
            Long l = (Long) obj;
            if (this.f10747d > l.longValue()) {
                return 1;
            }
            if (this.f10747d < l.longValue()) {
                return -1;
            }
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3108b(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, C3109a aVar, List<C3109a> list, List<String> list2) {
        super(str);
        long j4;
        String str2 = str;
        this.f10730b = i;
        this.f10732d = j2;
        this.f10733e = z;
        this.f10734f = i2;
        this.f10735g = i3;
        this.f10736h = i4;
        this.f10737i = j3;
        this.f10738j = z2;
        this.f10739k = z3;
        this.f10740l = aVar;
        this.f10741m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            C3109a aVar2 = list.get(list.size() - 1);
            this.f10743o = aVar2.f10747d + aVar2.f10745b;
        } else {
            this.f10743o = 0;
        }
        if (j == -9223372036854775807L) {
            j4 = -9223372036854775807L;
        } else if (j >= 0) {
            j4 = j;
        } else {
            j4 = this.f10743o + j;
        }
        this.f10731c = j4;
        this.f10742n = Collections.unmodifiableList(list2);
    }
}
