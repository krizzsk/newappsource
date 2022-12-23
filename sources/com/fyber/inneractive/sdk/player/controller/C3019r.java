package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.cache.C2986n;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3054d;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3220g;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3231m;
import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3295l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3323f;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.player.mediaplayer.C3433a;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.controller.r */
public class C3019r implements C3295l.C3296a, VideoRendererEventListener, C3067e.C3068a, C3283f {

    /* renamed from: a */
    public final WeakReference<C2992d> f10316a;

    /* renamed from: b */
    public boolean f10317b = false;

    public C3019r(C2992d dVar) {
        this.f10316a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public void mo13923a() {
    }

    /* renamed from: a */
    public void mo13925a(C3231m mVar) {
    }

    /* renamed from: a */
    public void mo13926a(C3270p pVar, Object obj) {
    }

    /* renamed from: a */
    public void mo13927a(C3305s sVar, C3323f fVar) {
    }

    /* renamed from: a */
    public void mo13928a(boolean z) {
    }

    /* renamed from: a */
    public void mo13929a(boolean z, int i) {
        C3067e eVar;
        IAlog.m9902a("%sonPlayerStateChanged called with pwr = %s state = %d", mo13930b(), Boolean.valueOf(z), Integer.valueOf(i));
        WeakReference<C2992d> weakReference = this.f10316a;
        C3226i iVar = null;
        C2992d dVar = weakReference == null ? null : weakReference.get();
        if (dVar != null && (eVar = dVar.f10242s) != null && !dVar.f10230A) {
            if (i == 3) {
                if (z) {
                    dVar.mo13856a(C3025b.Playing);
                } else if (dVar.f10260e == C3025b.Preparing) {
                    C3323f fVar = ((C3220g) eVar).f11560r;
                    if (fVar != null && fVar.f11909a > 0) {
                        C3321e eVar2 = fVar.f11910b[0];
                        if (eVar2 != null) {
                            iVar = eVar2.mo14445c();
                        }
                        if (iVar != null) {
                            int i2 = iVar.f11637j;
                            int i3 = iVar.f11638k;
                            dVar.f10243t = i2;
                            dVar.f10244u = i3;
                        }
                    }
                    this.f10317b = true;
                    dVar.mo13856a(C3025b.Prepared);
                }
            } else if (i == 2) {
                if (dVar.f10260e == C3025b.Playing) {
                    dVar.mo13856a(C3025b.Buffering);
                }
            } else if (i == 4) {
                dVar.mo13856a(C3025b.Completed);
            }
        }
    }

    /* renamed from: b */
    public final String mo13930b() {
        C2992d dVar;
        WeakReference<C2992d> weakReference = this.f10316a;
        if (weakReference == null) {
            dVar = null;
        } else {
            dVar = weakReference.get();
        }
        if (dVar == null) {
            return C3019r.class.getName();
        }
        return IAlog.m9899a((Object) dVar);
    }

    public void onDroppedFrames(int i, long j) {
    }

    public void onRenderedFirstFrame(Surface surface) {
    }

    public void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    public void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    public void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    public void onVideoInputFormatChanged(C3226i iVar) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        C2992d dVar;
        WeakReference<C2992d> weakReference = this.f10316a;
        if (weakReference == null) {
            dVar = null;
        } else {
            dVar = weakReference.get();
        }
        if (dVar != null) {
            dVar.f10243t = i;
            dVar.f10244u = i2;
        }
    }

    /* renamed from: a */
    public void mo13924a(C3054d dVar) {
        String str;
        C2992d dVar2 = this.f10316a.get();
        if (dVar2 != null && dVar2.f10237H && dVar2.f10231B && !this.f10317b && (dVar.getCause() instanceof C3038c.C3043e)) {
            dVar2.f10245v = true;
            C3067e eVar = dVar2.f10242s;
            if (eVar != null) {
                ((C3220g) eVar).mo14279b();
                dVar2.f10242s = null;
            }
            dVar2.mo13809a(false);
            dVar2.mo13835a(dVar2.f10236G);
            dVar2.f10264i.post(new C3005h(dVar2, false));
        } else if (dVar2 == null || !dVar2.f10231B || this.f10317b || !C2986n.f10211f.mo13802a() || dVar2.f10238I >= dVar2.f10239p) {
            if (dVar.getCause() == null) {
                str = "empty";
            } else {
                str = dVar.getCause().getMessage();
            }
            C3433a.C3446m mVar = new C3433a.C3446m(dVar, str);
            IAlog.m9902a("%sonPlayerError called with %s for sendErrorState", mo13930b(), mVar);
            C2992d dVar3 = (C2992d) C3727s.m9987a(this.f10316a);
            if (dVar3 != null) {
                dVar3.mo13857a((Exception) mVar);
            }
        } else {
            C3067e eVar2 = dVar2.f10242s;
            if (eVar2 != null) {
                ((C3220g) eVar2).mo14279b();
                dVar2.f10242s = null;
            }
            dVar2.mo13809a(true);
            dVar2.mo13835a(dVar2.f10236G);
            dVar2.f10238I++;
            dVar2.f10264i.post(new C3005h(dVar2, true));
        }
    }
}
