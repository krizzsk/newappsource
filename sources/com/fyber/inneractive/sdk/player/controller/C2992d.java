package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.braze.models.BrazeGeofence;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.player.cache.C2964d;
import com.fyber.inneractive.sdk.player.cache.C2971h;
import com.fyber.inneractive.sdk.player.cache.C2986n;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3053c;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3220g;
import com.fyber.inneractive.sdk.player.exoplayer2.C3268n;
import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3065c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3066d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3358k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.d */
public class C2992d extends C2997g implements C2964d.C2966b, C2964d.C2967c {

    /* renamed from: A */
    public boolean f10230A;

    /* renamed from: B */
    public final boolean f10231B;

    /* renamed from: C */
    public Bitmap f10232C;

    /* renamed from: D */
    public int f10233D;

    /* renamed from: E */
    public String f10234E;

    /* renamed from: F */
    public final List<C2971h> f10235F;

    /* renamed from: G */
    public C3299n f10236G;

    /* renamed from: H */
    public boolean f10237H;

    /* renamed from: I */
    public int f10238I;

    /* renamed from: p */
    public final int f10239p;

    /* renamed from: q */
    public final C2666s f10240q;

    /* renamed from: r */
    public final int f10241r;

    /* renamed from: s */
    public C3067e f10242s;

    /* renamed from: t */
    public int f10243t = 0;

    /* renamed from: u */
    public int f10244u = 0;

    /* renamed from: v */
    public boolean f10245v = false;

    /* renamed from: w */
    public Surface f10246w;

    /* renamed from: x */
    public C3268n[] f10247x;

    /* renamed from: y */
    public Handler f10248y;

    /* renamed from: z */
    public C3019r f10249z;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.d$a */
    public class C2993a implements Runnable {
        public C2993a() {
        }

        public void run() {
            C3067e eVar = C2992d.this.f10242s;
            if (eVar != null) {
                C3220g gVar = (C3220g) eVar;
                gVar.mo14276a(gVar.mo14275a(), -9223372036854775807L);
                ((C3220g) C2992d.this.f10242s).f11547e.f11576f.sendEmptyMessage(5);
                ((C3220g) C2992d.this.f10242s).mo14279b();
                C2992d.this.f10242s = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2992d(android.content.Context r5, boolean r6, com.fyber.inneractive.sdk.config.global.C2666s r7) {
        /*
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.f10243t = r5
            r4.f10244u = r5
            r4.f10245v = r5
            r0 = 0
            r4.f10246w = r0
            r4.f10230A = r5
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.f10235F = r1
            r4.f10236G = r0
            r4.f10238I = r5
            r4.f10231B = r6
            r4.f10240q = r7
            com.fyber.inneractive.sdk.config.i r6 = com.fyber.inneractive.sdk.config.IAConfigManager.m6632b()
            com.fyber.inneractive.sdk.config.h r6 = r6.mo13276a()
            java.lang.String r1 = "extractor_source_retry_count"
            r2 = 6
            r3 = 3
            int r6 = r6.mo13271a(r1, r2, r3)
            r4.f10241r = r6
            if (r7 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C2649j.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r7.mo13264a(r6)
            r0 = r6
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r0
        L_0x003c:
            if (r0 != 0) goto L_0x0040
            r6 = 0
            goto L_0x0044
        L_0x0040:
            int r6 = r0.mo13251h()
        L_0x0044:
            r4.f10239p = r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Creating IAExoPlayer2Controller"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C2992d.<init>(android.content.Context, boolean, com.fyber.inneractive.sdk.config.global.s):void");
    }

    /* renamed from: a */
    public void mo13806a(int i, boolean z) {
        IAlog.m9902a("%sseekTo called with %d playAfterSeek = %s", IAlog.m9899a((Object) this), Integer.valueOf(i), Boolean.valueOf(z));
        C3067e eVar = this.f10242s;
        if (eVar != null && !this.f10230A) {
            ((C3220g) eVar).mo14277a(z);
            C3220g gVar = (C3220g) this.f10242s;
            gVar.mo14276a(gVar.mo14275a(), (long) i);
        }
    }

    /* renamed from: b */
    public void mo13812b(boolean z) {
        mo13858c(true);
        this.f10269n = z;
        C3067e eVar = this.f10242s;
        if (eVar != null && !this.f10230A) {
            C3268n[] nVarArr = this.f10247x;
            if (nVarArr.length >= 2) {
                ((C3220g) eVar).mo14278a(new C3067e.C3070c(nVarArr[1], 2, new Float(BitmapDescriptorFactory.HUE_RED)));
                this.f10245v = true;
            }
        }
    }

    /* renamed from: c */
    public int mo13813c() {
        long j;
        C3067e eVar = this.f10242s;
        if (eVar == null || this.f10230A) {
            return 0;
        }
        C3220g gVar = (C3220g) eVar;
        if (gVar.f11557o.mo14412c() || gVar.f11554l > 0) {
            j = gVar.f11564v;
        } else {
            gVar.f11557o.mo14408a(gVar.f11562t.f11616a, gVar.f11550h, false);
            j = C3052b.m7658b(gVar.f11562t.f11618c) + C3052b.m7658b(gVar.f11550h.f11758e);
        }
        return (int) j;
    }

    /* renamed from: d */
    public void mo13815d(boolean z) {
        mo13858c(false);
        this.f10269n = z;
        if (this.f10242s != null && !this.f10230A) {
            AudioManager audioManager = (AudioManager) this.f10256a.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            float f = ((float) streamVolume) / ((float) streamMaxVolume);
            IAlog.m9902a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
            if (f == BitmapDescriptorFactory.HUE_RED) {
                f = 0.1f;
            }
            C3268n[] nVarArr = this.f10247x;
            if (nVarArr.length >= 2) {
                C3067e eVar = this.f10242s;
                ((C3220g) eVar).mo14278a(new C3067e.C3070c(nVarArr[1], 2, new Float(f)));
            }
            this.f10245v = false;
        }
    }

    /* renamed from: e */
    public Bitmap mo13816e() {
        return this.f10232C;
    }

    /* renamed from: f */
    public String mo13817f() {
        return this.f10231B ? "exo_c" : "exo";
    }

    /* renamed from: g */
    public int mo13818g() {
        return this.f10244u;
    }

    /* renamed from: h */
    public int mo13819h() {
        return this.f10243t;
    }

    /* renamed from: i */
    public boolean mo13820i() {
        return this.f10245v;
    }

    /* renamed from: j */
    public boolean mo13837j() {
        if (this.f10242s == null || this.f10230A || this.f10260e != C3025b.Playing) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo13821k() {
        C3025b bVar;
        C3025b bVar2 = this.f10260e;
        if (bVar2 == C3025b.Idle || bVar2 == C3025b.Completed || bVar2 == (bVar = C3025b.Paused) || bVar2 == C3025b.Prepared) {
            IAlog.m9902a("%s paused called when player is in mState: %s ignoring", IAlog.m9899a((Object) this), bVar2);
            return;
        }
        C3067e eVar = this.f10242s;
        if (eVar != null && !this.f10230A) {
            ((C3220g) eVar).mo14277a(false);
        }
        mo13859m();
        mo13856a(bVar);
    }

    /* renamed from: l */
    public void mo13822l() {
        IAlog.m9902a("%sstart called", IAlog.m9899a((Object) this));
        if (this.f10242s != null && !this.f10230A) {
            mo13856a(C3025b.Start_in_progress);
            ((C3220g) this.f10242s).mo14277a(true);
        }
    }

    /* renamed from: b */
    public void mo13811b() {
        if (this.f10242s != null) {
            if (!this.f10230A) {
                this.f10230A = true;
                C3714n.m9976a(new C2993a());
            }
            C3019r rVar = this.f10249z;
            if (rVar != null) {
                rVar.f10316a.clear();
            }
            this.f10249z = null;
        }
        for (C2971h next : this.f10235F) {
            next.mo13791a(next.f10183o);
            C2986n nVar = C2986n.f10211f;
            nVar.f10215d.remove(next.mo13788a());
        }
        this.f10235F.clear();
        super.mo13811b();
    }

    /* renamed from: a */
    public void mo13807a(Surface surface) {
        IAlog.m9902a("%ssetSurface called with %s", IAlog.m9899a((Object) this), surface);
        this.f10246w = surface;
        C3067e eVar = this.f10242s;
        if (eVar != null && !this.f10230A) {
            ((C3220g) eVar).mo14278a(new C3067e.C3070c(this.f10247x[0], 1, surface));
        }
    }

    /* renamed from: a */
    public void mo13809a(boolean z) {
        boolean z2 = z;
        if (this.f10242s == null && !this.f10230A) {
            this.f10237H = z2;
            IAlog.m9902a("%sMediaPlayerController: creating media player", IAlog.m9899a((Object) this));
            C3019r rVar = this.f10249z;
            if (rVar != null) {
                rVar.f10316a.clear();
            }
            this.f10249z = new C3019r(this);
            this.f10248y = new Handler(Looper.getMainLooper());
            C3268n[] nVarArr = new C3268n[(z2 ? 2 : 1)];
            this.f10247x = nVarArr;
            Context context = this.f10256a;
            C3235c cVar = C3235c.f11703a;
            nVarArr[0] = new MediaCodecVideoRenderer(context, cVar, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS, (C3065c<C3066d>) null, false, this.f10248y, this.f10249z, -1);
            if (z2) {
                this.f10247x[1] = new MediaCodecAudioRenderer(cVar, (C3065c<C3066d>) null, true, (Handler) null, (AudioRendererEventListener) null);
            }
            C3220g gVar = new C3220g(this.f10247x, new C3314b((C3321e.C3322a) null), new C3053c(new C3358k(true, SQLiteDatabase.OPEN_FULLMUTEX, 0), 15000, BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS, 2500, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS));
            this.f10242s = gVar;
            gVar.f11548f.add(this.f10249z);
        }
    }

    /* renamed from: d */
    public int mo13814d() {
        long j;
        C3067e eVar = this.f10242s;
        if (eVar == null || this.f10230A) {
            return 0;
        }
        C3220g gVar = (C3220g) eVar;
        if (gVar.f11557o.mo14412c()) {
            j = -9223372036854775807L;
        } else {
            j = C3052b.m7658b(gVar.f11557o.mo14409a(gVar.mo14275a(), gVar.f11549g).f11764f);
        }
        return (int) j;
    }

    /* renamed from: a */
    public void mo13808a(String str, int i) {
        mo13836a(str, i, this.f10231B);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.n] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.fyber.inneractive.sdk.player.cache.e] */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.fyber.inneractive.sdk.player.exoplayer2.source.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13836a(java.lang.String r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.fyber.inneractive.sdk.player.exoplayer2.e r3 = r0.f10242s
            if (r3 == 0) goto L_0x00d1
            boolean r3 = r0.f10230A
            if (r3 != 0) goto L_0x00d1
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r21)
            r4[r5] = r6
            r5 = 1
            r4[r5] = r1
            java.lang.String r5 = "%sloadMediaPlayerUri called with %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r5, r4)
            r0.f10234E = r1
            r0.f10233D = r2
            android.net.Uri r7 = android.net.Uri.parse(r22)
            r1 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x003e
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            java.lang.String r4 = r7.getPath()
            if (r4 != 0) goto L_0x0039
            r4 = 3
            goto L_0x0044
        L_0x0039:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8598b((java.lang.String) r4)
            goto L_0x0044
        L_0x003e:
            java.lang.String r4 = ".null"
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8598b((java.lang.String) r4)
        L_0x0044:
            boolean r5 = r0.f10231B
            if (r5 == 0) goto L_0x005a
            com.fyber.inneractive.sdk.player.cache.n r5 = com.fyber.inneractive.sdk.player.cache.C2986n.f10211f
            boolean r5 = r5.mo13802a()
            if (r5 == 0) goto L_0x005a
            if (r4 == r3) goto L_0x005a
            com.fyber.inneractive.sdk.player.cache.e r1 = new com.fyber.inneractive.sdk.player.cache.e
            com.fyber.inneractive.sdk.config.global.s r5 = r0.f10240q
            r1.<init>(r0, r0, r2, r5)
            goto L_0x00a9
        L_0x005a:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l
            r2.<init>(r1, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.p r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.p
            com.fyber.inneractive.sdk.config.IAConfigManager r6 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.util.u0 r6 = r6.f9237y
            java.lang.String r9 = r6.mo15375a()
            r11 = 2000(0x7d0, float:2.803E-42)
            r12 = 2000(0x7d0, float:2.803E-42)
            r13 = 1
            r8 = r5
            r10 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.n r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.n
            android.content.Context r8 = r0.f10256a
            r6.<init>(r8, r2, r5)
            android.content.Context r2 = r0.f10256a
            java.lang.String r5 = "ia-vid-cache-ex2"
            java.io.File r2 = com.fyber.inneractive.sdk.player.cache.C2986n.m7340a((android.content.Context) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j r5 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j
            r8 = 10485760(0xa00000, double:5.180654E-317)
            r5.<init>(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k r15 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k
            r15.<init>(r2, r5, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.r r17 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r
            r17.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c
            r2.<init>(r15, r8)
            r19 = 2
            r20 = 0
            r14 = r1
            r16 = r6
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x00a9:
            r8 = r1
            goto L_0x00ac
        L_0x00ab:
            r8 = r6
        L_0x00ac:
            if (r4 == r3) goto L_0x00c1
            com.fyber.inneractive.sdk.player.exoplayer2.source.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.l
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.c r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c
            r9.<init>()
            int r10 = r0.f10241r
            android.os.Handler r11 = r0.f10248y
            com.fyber.inneractive.sdk.player.controller.r r12 = r0.f10249z
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00cc
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h
            android.os.Handler r10 = r0.f10248y
            com.fyber.inneractive.sdk.player.controller.r r11 = r0.f10249z
            r9 = 3
            r6 = r1
            r6.<init>((android.net.Uri) r7, (com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g.C3354a) r8, (int) r9, (android.os.Handler) r10, (com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f) r11)
        L_0x00cc:
            r0.f10236G = r1
            r0.mo13835a((com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n) r1)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C2992d.mo13836a(java.lang.String, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo13835a(C3299n nVar) {
        C3067e eVar = this.f10242s;
        if (eVar != null && nVar != null) {
            C3220g gVar = (C3220g) eVar;
            if (!gVar.f11557o.mo14412c() || gVar.f11558p != null) {
                gVar.f11557o = C3270p.f11753a;
                gVar.f11558p = null;
                Iterator<C3067e.C3068a> it = gVar.f11548f.iterator();
                while (it.hasNext()) {
                    it.next().mo13926a(gVar.f11557o, gVar.f11558p);
                }
            }
            if (gVar.f11551i) {
                gVar.f11551i = false;
                gVar.f11559q = C3305s.f11874d;
                gVar.f11560r = gVar.f11545c;
                gVar.f11544b.mo14455a((Object) null);
                Iterator<C3067e.C3068a> it2 = gVar.f11548f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo13927a(gVar.f11559q, gVar.f11560r);
                }
            }
            gVar.f11555m++;
            gVar.f11547e.f11576f.obtainMessage(0, 1, 0, nVar).sendToTarget();
            mo13856a(C3025b.Preparing);
        }
    }

    /* renamed from: a */
    public boolean mo13810a() {
        return this.f10231B;
    }
}
