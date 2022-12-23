package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a */
public final class C3106a extends C3110c {

    /* renamed from: b */
    public final List<C3107a> f10723b;

    /* renamed from: c */
    public final List<C3107a> f10724c;

    /* renamed from: d */
    public final List<C3107a> f10725d;

    /* renamed from: e */
    public final C3226i f10726e;

    /* renamed from: f */
    public final List<C3226i> f10727f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a */
    public static final class C3107a {

        /* renamed from: a */
        public final String f10728a;

        /* renamed from: b */
        public final C3226i f10729b;

        public C3107a(String str, C3226i iVar) {
            this.f10728a = str;
            this.f10729b = iVar;
        }
    }

    public C3106a(String str, List<C3107a> list, List<C3107a> list2, List<C3107a> list3, C3226i iVar, List<C3226i> list4) {
        super(str);
        List<C3226i> list5;
        this.f10723b = Collections.unmodifiableList(list);
        this.f10724c = Collections.unmodifiableList(list2);
        this.f10725d = Collections.unmodifiableList(list3);
        this.f10726e = iVar;
        if (list4 != null) {
            list5 = Collections.unmodifiableList(list4);
        } else {
            list5 = null;
        }
        this.f10727f = list5;
    }
}
