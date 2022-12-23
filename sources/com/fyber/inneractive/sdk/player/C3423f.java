package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import android.view.View;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C2769g;
import com.fyber.inneractive.sdk.flow.C2775i;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.measurement.C2824h;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.player.C2945a;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.player.controller.C2990c;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3024a;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3722q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.media.Position;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p723ph.C18923a;
import p723ph.C18924b;

/* renamed from: com.fyber.inneractive.sdk.player.f */
public class C3423f extends C2948c implements C2945a.C2946a {

    /* renamed from: D */
    public static final HashMap<String, C3427b> f12236D = new C3424a();

    /* renamed from: A */
    public C2703z f12237A;

    /* renamed from: B */
    public C2769g f12238B;

    /* renamed from: C */
    public boolean f12239C;

    /* renamed from: x */
    public C2835b f12240x;

    /* renamed from: y */
    public C3024a f12241y;

    /* renamed from: z */
    public boolean f12242z;

    /* renamed from: com.fyber.inneractive.sdk.player.f$a */
    public class C3424a extends HashMap<String, C3427b> {

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$a */
        public class C3425a implements C3427b {
            public C3425a(C3424a aVar) {
            }

            /* renamed from: a */
            public String mo14624a(C2997g gVar, VideoClickOrigin videoClickOrigin) {
                return videoClickOrigin.name().toLowerCase();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$b */
        public class C3426b implements C3427b {
            public C3426b(C3424a aVar) {
            }

            /* renamed from: a */
            public String mo14624a(C2997g gVar, VideoClickOrigin videoClickOrigin) {
                int c;
                if (gVar == null || (c = gVar.mo13813c()) <= 0) {
                    return "00:00:00.000";
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = (long) c;
                long hours = timeUnit.toHours(j);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
                return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)))});
            }
        }

        public C3424a() {
            put("[CLICKAREA]", new C3425a(this));
            put("[ADPLAYHEAD]", new C3426b(this));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.f$b */
    public interface C3427b {
        /* renamed from: a */
        String mo14624a(C2997g gVar, VideoClickOrigin videoClickOrigin);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3423f(android.content.Context r9, com.fyber.inneractive.sdk.response.C3650g r10, com.fyber.inneractive.sdk.config.C2703z r11, com.fyber.inneractive.sdk.external.InneractiveAdRequest r12, com.fyber.inneractive.sdk.flow.C2807y r13, com.fyber.inneractive.sdk.measurement.C2816a r14) {
        /*
            r8 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0010
        L_0x0005:
            r1 = r11
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.c0 r1 = r1.mo13288b()
            java.util.Set r1 = r1.mo13204c()
        L_0x0010:
            if (r13 != 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            com.fyber.inneractive.sdk.config.global.s r0 = r13.mo13542b()
        L_0x0017:
            r8.<init>(r9, r1, r0)
            com.fyber.inneractive.sdk.player.enums.a r0 = com.fyber.inneractive.sdk.player.enums.C3024a.Uninitialized
            r8.f12241y = r0
            r0 = 0
            r8.f12239C = r0
            if (r10 == 0) goto L_0x00f6
            com.fyber.inneractive.sdk.model.vast.b r1 = r10.mo15298f()
            if (r1 == 0) goto L_0x00f6
            r8.f10089h = r14
            r8.f10087f = r13
            com.fyber.inneractive.sdk.model.vast.b r14 = r10.mo15298f()
            r8.f12240x = r14
            com.fyber.inneractive.sdk.flow.g r14 = new com.fyber.inneractive.sdk.flow.g
            com.fyber.inneractive.sdk.flow.y r1 = r8.f10087f
            com.fyber.inneractive.sdk.config.global.s r1 = r1.mo13542b()
            r14.<init>(r9, r10, r12, r1)
            r8.f12238B = r14
            r8.f10088g = r12
            int r9 = com.fyber.inneractive.sdk.util.IAlog.f12814a
            r14 = 3
            r1 = 1
            if (r9 > r14) goto L_0x007f
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r14 = "IAVastMediaPlayerFlowManager:ctor - got media files: "
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r14, r9)
            r9 = 0
        L_0x0050:
            com.fyber.inneractive.sdk.model.vast.b r14 = r8.f12240x
            int r14 = r14.mo13632a()
            if (r9 >= r14) goto L_0x007f
            com.fyber.inneractive.sdk.model.vast.b r14 = r8.f12240x
            java.util.List r14 = r14.mo13634b()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r9)
            com.fyber.inneractive.sdk.model.vast.m r14 = (com.fyber.inneractive.sdk.model.vast.C2846m) r14
            if (r14 == 0) goto L_0x007c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2[r0] = r3
            java.lang.String r14 = r14.mo13643a()
            r2[r1] = r14
            java.lang.String r14 = "IAVastMediaPlayerFlowManager(%d): %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r14, r2)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0050
        L_0x007f:
            if (r11 == 0) goto L_0x009e
            r8.mo14622a((com.fyber.inneractive.sdk.config.C2703z) r11)
            r9 = r11
            com.fyber.inneractive.sdk.config.y r9 = (com.fyber.inneractive.sdk.config.C2702y) r9
            com.fyber.inneractive.sdk.config.b0 r14 = r9.mo13287a()
            if (r14 == 0) goto L_0x009e
            com.fyber.inneractive.sdk.config.b0 r9 = r9.mo13287a()
            com.fyber.inneractive.sdk.config.a0 r9 = (com.fyber.inneractive.sdk.config.C2619a0) r9
            java.lang.Boolean r9 = r9.mo13190b()
            boolean r9 = r9.booleanValue()
            r8.mo13744b(r9)
        L_0x009e:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = r10.mo15294b()
            if (r12 == 0) goto L_0x00ad
            boolean r9 = r12.getAllowFullscreen()
            if (r9 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r4 = 0
            goto L_0x00ae
        L_0x00ad:
            r4 = 1
        L_0x00ae:
            int r5 = r10.mo15295c()
            int r6 = r10.mo15293a()
            r2 = r8
            r7 = r11
            r2.mo14621a(r3, r4, r5, r6, r7)
            com.fyber.inneractive.sdk.config.global.s r9 = r13.mo13542b()
            if (r9 == 0) goto L_0x00d8
            com.fyber.inneractive.sdk.config.global.s r9 = r13.mo13542b()
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r11 = com.fyber.inneractive.sdk.config.global.features.C2649j.class
            com.fyber.inneractive.sdk.config.global.features.e r9 = r9.mo13264a(r11)
            com.fyber.inneractive.sdk.config.global.features.j r9 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r9
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = r10.mo15294b()
            int r9 = r9.mo13245a(r10)
            r8.f10102u = r9
            goto L_0x00f5
        L_0x00d8:
            com.fyber.inneractive.sdk.config.i r9 = com.fyber.inneractive.sdk.config.IAConfigManager.m6632b()
            com.fyber.inneractive.sdk.config.h r9 = r9.mo13276a()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10 = r10.mo15294b()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r11 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r10 != r11) goto L_0x00eb
            java.lang.String r10 = "prebuffer_interstitial"
            goto L_0x00ed
        L_0x00eb:
            java.lang.String r10 = "prebuffer_rewarded"
        L_0x00ed:
            r11 = 10
            int r9 = r9.mo13271a(r10, r11, r0)
            r8.f10102u = r9
        L_0x00f5:
            return
        L_0x00f6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "IAVastMediaPlayerFlowManager ctor - vastData can't be null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3423f.<init>(android.content.Context, com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.config.z, com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.flow.y, com.fyber.inneractive.sdk.measurement.a):void");
    }

    /* renamed from: a */
    public void mo13864a(C3025b bVar) {
        boolean z;
        JSONArray jSONArray;
        String str;
        int i;
        String str2;
        T t;
        C18924b bVar2;
        C3025b bVar3 = bVar;
        int i2 = 0;
        IAlog.m9902a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar3);
        C3428g gVar = this.f10091j;
        if (gVar != null && bVar3 != C3025b.Prepared) {
            gVar.mo13864a(bVar3);
        } else if (bVar3 == C3025b.Prepared && gVar != null) {
            gVar.f12246d = true;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            IAlog.m9902a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f10097p) {
                IAlog.m9902a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                if (this.f10083b.mo13810a() && this.f10083b.mo13816e() != null) {
                    mo13738a(this.f10083b.mo13816e());
                }
                this.f10096o = true;
                mo13736a();
                if (!(this.f10090i == null || this.f10087f == null)) {
                    int intValue = ((C2702y) this.f12237A).f9427f.f9254h.value().intValue();
                    boolean a = C2948c.m7273a(this.f10083b.mo13814d(), this.f12237A, ((C3650g) this.f10087f.f9591b).f12765w);
                    boolean booleanValue = ((C2702y) this.f12237A).f9427f.f9247a.booleanValue();
                    C2823g gVar2 = this.f10090i;
                    if (!a) {
                        intValue = 0;
                    }
                    if (gVar2.f9691b != null) {
                        if (a) {
                            float f = (float) intValue;
                            try {
                                Position position = Position.STANDALONE;
                                C14226d.m35346l0(position, "Position is null");
                                bVar2 = new C18924b(true, Float.valueOf(f), booleanValue, position);
                            } catch (Throwable th) {
                                gVar2.mo13612a(th);
                            }
                        } else {
                            Position position2 = Position.STANDALONE;
                            C14226d.m35346l0(position2, "Position is null");
                            bVar2 = new C18924b(false, (Float) null, booleanValue, position2);
                        }
                        gVar2.f9691b.mo51248c(bVar2);
                    }
                }
                if (this.f10101t != null) {
                    C2807y yVar = this.f10087f;
                    if (yVar == null || yVar.f9591b == null || this.f10088g == null) {
                        z = false;
                    } else {
                        z = C2948c.m7273a(this.f10083b.mo13814d(), this.f12237A, ((C3650g) this.f10087f.f9591b).f12765w) && this.f10088g.getAllowFullscreen();
                        ((C3650g) this.f10087f.f9591b).f12760r.setVideo(new ImpressionData.Video(z, (long) ((int) TimeUnit.MILLISECONDS.toSeconds((long) this.f10083b.mo13814d()))));
                    }
                    try {
                        C2807y yVar2 = this.f10087f;
                        C3650g gVar3 = yVar2 != null ? (C3650g) yVar2.f9591b : null;
                        C2924p pVar = C2924p.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f10088g;
                        C2807y yVar3 = this.f10087f;
                        if (yVar3 == null) {
                            jSONArray = null;
                        } else {
                            jSONArray = yVar3.f9592c.mo13268c();
                        }
                        C2926q.C2927a aVar = new C2926q.C2927a(gVar3);
                        aVar.f10042c = pVar;
                        aVar.f10040a = inneractiveAdRequest;
                        aVar.f10043d = jSONArray;
                        if (!(this.f10103v == null || gVar3 == null)) {
                            IAlog.m9902a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar3.f12770B) + " msec", new Object[0]);
                            C2807y yVar4 = this.f10087f;
                            if (yVar4 == null || (t = yVar4.f9591b) == null || ((C3650g) t).f12771C == null) {
                                str = "";
                                i = 0;
                            } else {
                                i2 = ((C3650g) t).f12771C.f9744h;
                                i = ((C3650g) t).f12771C.f9745i;
                                str = ((C3650g) t).f12771C.f9737a;
                            }
                            C2926q.C2929b a2 = new C2926q.C2929b().mo13719a(InAppMessageBase.DURATION, Integer.valueOf(this.f10083b.mo13814d() / 1000)).mo13719a("url", this.f10103v.f9794g).mo13719a("bitrate", this.f10103v.f9792e);
                            if (TextUtils.isEmpty(this.f10103v.f9791d)) {
                                str2 = "na";
                            } else {
                                str2 = this.f10103v.f9791d;
                            }
                            aVar.f10045f.put(a2.mo13719a("mime", str2).mo13719a("delivery", this.f10103v.f9788a).mo13719a("load_time", Long.valueOf(System.currentTimeMillis() - gVar3.f12770B)).mo13719a("media_file_index", Integer.valueOf(this.f10100s)).mo13719a("player", this.f10083b.mo13817f()).mo13719a("is_video_skippable", Boolean.valueOf(z)).mo13719a("supported_media_files", Integer.valueOf(i2)).mo13719a("total_media_files", Integer.valueOf(i)).mo13719a("vast_version", str).f10055a);
                        }
                        aVar.mo13717a((String) null);
                    } catch (Exception unused) {
                    }
                    C3430i iVar = (C3430i) this.f10101t;
                    if (!iVar.f12253g) {
                        iVar.f12253g = true;
                        C3430i.C3432b bVar4 = iVar.f12250d;
                        if (bVar4 != null) {
                            ((C2775i) bVar4).mo13520d();
                        }
                    }
                }
            }
            mo13736a();
        } else if (ordinal != 3) {
            if (ordinal == 6) {
                this.f10083b.mo13813c();
                mo13736a();
            } else if (ordinal == 7) {
                mo13736a();
            } else if (ordinal == 8) {
                mo13736a();
            }
        } else if (this.f10086e == null) {
            C3705k.m9951m();
            mo13737a((long) (IAConfigManager.f9202J.f9221i.f9358a * 1000));
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 6) {
            if (ordinal2 == 8) {
                mo14623a(C3024a.Completed);
            }
        } else if (this.f12241y.equals(C3024a.Completed)) {
            mo14623a(C3024a.Restarted);
        }
    }

    /* renamed from: c */
    public View mo13745c() {
        C2769g gVar = this.f12238B;
        if (gVar == null || !gVar.f9569f) {
            return null;
        }
        return gVar.f9570g;
    }

    /* renamed from: d */
    public C2990c mo13746d() {
        C2769g gVar = this.f12238B;
        if (gVar != null) {
            return gVar.f9572i;
        }
        return null;
    }

    /* renamed from: e */
    public void mo13865e() {
    }

    /* renamed from: f */
    public C2836c mo13748f() {
        C2835b bVar = this.f12240x;
        if (bVar != null) {
            return bVar.f9743g;
        }
        return null;
    }

    /* renamed from: a */
    public void mo13742a(boolean z) {
        C2666s sVar;
        if (z) {
            if (!this.f12239C) {
                C2924p pVar = C2924p.VAST_DEFAULT_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest = this.f10088g;
                C2807y yVar = this.f10087f;
                C3650g gVar = yVar != null ? (C3650g) yVar.f9591b : null;
                JSONArray c = (yVar == null || (sVar = yVar.f9592c) == null) ? null : sVar.mo13268c();
                C2926q.C2927a aVar = new C2926q.C2927a(gVar);
                aVar.f10042c = pVar;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = c;
                aVar.mo13717a((String) null);
                this.f12239C = true;
            }
        } else if (mo13745c() != null && !this.f12238B.f9573j) {
            mo13740a(this.f12240x.f9743g, VideoClickOrigin.COMPANION, C2850q.EVENT_CREATIVE_VIEW);
            C2769g gVar2 = this.f12238B;
            if (!gVar2.f9573j) {
                C2924p pVar2 = C2924p.VAST_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest2 = gVar2.f9565b;
                C3650g gVar3 = gVar2.f9566c;
                C2666s sVar2 = gVar2.f9567d;
                JSONArray c2 = sVar2 == null ? null : sVar2.mo13268c();
                C2926q.C2927a aVar2 = new C2926q.C2927a(gVar3);
                aVar2.f10042c = pVar2;
                aVar2.f10040a = inneractiveAdRequest2;
                aVar2.f10043d = c2;
                aVar2.mo13716a("companion_data", gVar2.f9568e.f9743g.mo13636a());
                aVar2.mo13717a((String) null);
            }
            gVar2.f9573j = true;
        }
    }

    /* renamed from: a */
    public final void mo14621a(UnitDisplayType unitDisplayType, boolean z, int i, int i2, C2703z zVar) {
        C2769g gVar = this.f12238B;
        gVar.f9575l = unitDisplayType;
        gVar.f9576m = z;
        gVar.f9577n = i;
        gVar.f9578o = i2;
        gVar.f9579p = zVar;
    }

    /* renamed from: a */
    public void mo13863a(int i) {
        int d = this.f10083b.mo13814d();
        int ordinal = this.f12241y.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 4 && i > (d / 4) * 3) {
                        mo14623a(C3024a.ThirdPQuarter);
                        C2823g gVar = this.f10090i;
                        if (gVar != null && gVar.f9692c != null) {
                            IAlog.m9902a("%s thirdQuartile", "OMVideo");
                            try {
                                C18923a aVar = gVar.f9692c;
                                C14226d.m35351r0(aVar.f48164a);
                                aVar.f48164a.f47714e.mo44187b("thirdQuartile");
                            } catch (Throwable th) {
                                gVar.mo13612a(th);
                            }
                        }
                    }
                } else if (i > d / 2) {
                    mo14623a(C3024a.MidPoint);
                    C2823g gVar2 = this.f10090i;
                    if (gVar2 != null && gVar2.f9692c != null) {
                        IAlog.m9902a("%s midpoint", "OMVideo");
                        try {
                            C18923a aVar2 = gVar2.f9692c;
                            C14226d.m35351r0(aVar2.f48164a);
                            aVar2.f48164a.f47714e.mo44187b("midpoint");
                        } catch (Throwable th2) {
                            gVar2.mo13612a(th2);
                        }
                    }
                }
            } else if (i > d / 4) {
                mo14623a(C3024a.FirstQuarter);
                C2823g gVar3 = this.f10090i;
                if (gVar3 != null && gVar3.f9692c != null) {
                    IAlog.m9902a("%s firstQuartile", "OMVideo");
                    try {
                        C18923a aVar3 = gVar3.f9692c;
                        C14226d.m35351r0(aVar3.f48164a);
                        aVar3.f48164a.f47714e.mo44187b("firstQuartile");
                    } catch (Throwable th3) {
                        gVar3.mo13612a(th3);
                    }
                }
            }
        } else if (this.f10083b.f10260e != C3025b.Buffering) {
            mo14623a(C3024a.Started);
            C2823g gVar4 = this.f10090i;
            if (gVar4 != null) {
                if (gVar4.f9691b != null && !gVar4.f9694e) {
                    IAlog.m9902a("%s impression", "OMVideo");
                    gVar4.f9694e = true;
                    try {
                        gVar4.f9691b.mo51247b();
                    } catch (Throwable th4) {
                        gVar4.mo13612a(th4);
                    }
                }
                C2823g gVar5 = this.f10090i;
                long d2 = (long) this.f10083b.mo13814d();
                float f = this.f10083b.mo13820i() ? BitmapDescriptorFactory.HUE_RED : 1.0f;
                if (gVar5.f9692c != null && !gVar5.f9693d) {
                    gVar5.f9693d = true;
                    IAlog.m9902a("%s start", "OMVideo");
                    try {
                        gVar5.f9692c.mo51436b((float) d2, f);
                    } catch (Throwable th5) {
                        gVar5.mo13612a(th5);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13739a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!(this.f10103v == null || inneractiveVideoError.getPlayerError() == InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES)) {
                jSONObject.put("url", this.f10103v.f9794g);
                jSONObject.put("bitrate", this.f10103v.f9792e);
                jSONObject.put("mime", this.f10103v.f9791d);
                jSONObject.put("delivery", this.f10103v.f9788a);
            }
            C2997g gVar = this.f10083b;
            jSONObject.put("player", gVar != null ? gVar.mo13817f() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put(InAppMessageBase.MESSAGE, inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.m9902a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        IAlog.m9906e("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        C3429h hVar = this.f10101t;
        if (hVar != null) {
            try {
                ((C3430i) hVar).mo14627a(inneractiveVideoError, (InneractiveErrorCode) null, jSONObject, this.f10099r);
            } catch (Exception e) {
                if (IAlog.f12814a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        C3722q qVar = this.f10094m;
        if (qVar != null) {
            qVar.cancel(true);
            qVar.f12911b = null;
            this.f10095n = null;
        }
        mo13736a();
    }

    /* renamed from: a */
    public void mo13740a(C3652i iVar, VideoClickOrigin videoClickOrigin, C2850q... qVarArr) {
        if (qVarArr.length == 0) {
            IAlog.m9906e("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.m9906e("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C2850q qVar : qVarArr) {
                String str = qVar.f9827a;
                IAlog.m9902a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a = iVar.mo13613a(qVar);
                if (a == null || a.size() == 0) {
                    IAlog.m9902a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                } else {
                    arrayList.addAll(a);
                    IAlog.m9902a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                    m8637a(a, qVar);
                }
                if (qVar == C2850q.EVENT_CLICK) {
                    for (Map.Entry next : f12236D.entrySet()) {
                        String str2 = (String) next.getKey();
                        String a2 = ((C3427b) next.getValue()).mo14624a(this.f10083b, videoClickOrigin);
                        for (int i = 0; i < arrayList.size(); i++) {
                            String str3 = (String) arrayList.get(i);
                            if (str3.contains(str2)) {
                                arrayList.set(i, str3.replace(str2, a2));
                            }
                        }
                    }
                }
            }
            C2948c.m7272a((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    public static void m8636a(C3652i iVar, C2850q... qVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C2850q qVar : qVarArr) {
            String str = qVar.f9827a;
            IAlog.m9902a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
            List<String> a = ((C2824h) iVar).mo13613a(qVar);
            if (a == null || a.size() == 0) {
                IAlog.m9902a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
            } else {
                arrayList.addAll(a);
                IAlog.m9902a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                m8637a(a, qVar);
            }
        }
        C2948c.m7272a((List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m8637a(List<String> list, C2850q qVar) {
        for (String next : list) {
            IAlog.m9902a("   event url: %s", next);
            if (!TextUtils.isEmpty(next)) {
                IAlog.m9900a(1, (Exception) null, "%s %s %s", "VAST_EVENT", qVar.f9827a, next);
                IAlog.m9900a(1, (Exception) null, "Tracking URLs array: %s", "VPAID", next);
            }
        }
    }

    /* renamed from: a */
    public final void mo14623a(C3024a aVar) {
        if (this.f12241y != aVar) {
            if (aVar == C3024a.Started) {
                this.f12242z = false;
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_IMPRESSION, C2850q.EVENT_START);
            } else if (aVar == C3024a.FirstQuarter) {
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_FIRSTQ);
            } else if (aVar == C3024a.MidPoint) {
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_MID);
            } else if (aVar == C3024a.ThirdPQuarter) {
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_THIRDQ);
            } else if (aVar == C3024a.Completed && !this.f12242z) {
                this.f12242z = true;
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_COMPLETE);
            } else if (aVar == C3024a.Restarted) {
                mo13740a(this.f12240x, VideoClickOrigin.InvalidOrigin, C2850q.EVENT_REWIND);
            }
            this.f12241y = aVar;
        }
    }

    /* renamed from: a */
    public void mo14622a(C2703z zVar) {
        this.f12237A = zVar;
    }
}
