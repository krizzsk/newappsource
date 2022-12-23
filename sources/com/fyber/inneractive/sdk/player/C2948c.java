package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.network.C2904h0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.player.controller.C2988a;
import com.fyber.inneractive.sdk.player.controller.C2990c;
import com.fyber.inneractive.sdk.player.controller.C2992d;
import com.fyber.inneractive.sdk.player.controller.C2997g;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3722q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.c */
public abstract class C2948c implements C2997g.C3003f, C2997g.C3002e {

    /* renamed from: a */
    public Context f10082a;

    /* renamed from: b */
    public C2997g f10083b;

    /* renamed from: c */
    public String f10084c;

    /* renamed from: d */
    public final C2666s f10085d;

    /* renamed from: e */
    public Runnable f10086e;

    /* renamed from: f */
    public C2807y f10087f;

    /* renamed from: g */
    public InneractiveAdRequest f10088g;

    /* renamed from: h */
    public C2816a f10089h;

    /* renamed from: i */
    public C2823g f10090i;

    /* renamed from: j */
    public C3428g f10091j = null;

    /* renamed from: k */
    public boolean f10092k = true;

    /* renamed from: l */
    public Bitmap f10093l;

    /* renamed from: m */
    public C3722q f10094m;

    /* renamed from: n */
    public C3722q.C3723a f10095n;

    /* renamed from: o */
    public boolean f10096o = false;

    /* renamed from: p */
    public volatile boolean f10097p = false;

    /* renamed from: q */
    public boolean f10098q = false;

    /* renamed from: r */
    public boolean f10099r = false;

    /* renamed from: s */
    public int f10100s = 0;

    /* renamed from: t */
    public C3429h f10101t;

    /* renamed from: u */
    public int f10102u;

    /* renamed from: v */
    public C2846m f10103v;

    /* renamed from: w */
    public C2997g.C3001d f10104w = new C2950b();

    /* renamed from: com.fyber.inneractive.sdk.player.c$a */
    public class C2949a implements Runnable {
        public C2949a() {
        }

        public void run() {
            C2948c cVar = C2948c.this;
            IAlog.m9902a("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", cVar.f10086e, Boolean.valueOf(cVar.f10097p));
            if (cVar.f10086e != null && !cVar.f10097p) {
                cVar.f10099r = true;
                int c = cVar.f10083b.mo13813c();
                int d = cVar.f10083b.mo13814d();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(InAppMessageBase.DURATION, d);
                    jSONObject.put("position", c);
                } catch (JSONException unused) {
                }
                cVar.f10086e = null;
                if (!cVar.f10096o) {
                    C2997g gVar = cVar.f10083b;
                    if (gVar != null) {
                        gVar.mo13811b();
                        cVar.f10083b = null;
                        cVar.mo13743b();
                    }
                    cVar.mo13739a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
                    return;
                }
                cVar.mo13739a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$b */
    public class C2950b implements C2997g.C3001d {
        public C2950b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$c */
    public interface C2951c {
        /* renamed from: a */
        void mo13751a(C2948c cVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$d */
    public class C2952d extends Exception {
    }

    public C2948c(Context context, Set<Vendor> set, C2666s sVar) {
        this.f10082a = context;
        this.f10085d = sVar;
        mo13743b();
    }

    /* renamed from: a */
    public void mo13738a(Bitmap bitmap) {
        IAlog.m9902a("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.f10093l = bitmap;
    }

    /* renamed from: a */
    public abstract void mo13739a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo13740a(C3652i iVar, VideoClickOrigin videoClickOrigin, C2850q... qVarArr);

    /* renamed from: a */
    public abstract void mo13742a(boolean z);

    /* renamed from: b */
    public final void mo13743b() {
        C2997g gVar;
        boolean z;
        Context context = this.f10082a;
        C2666s sVar = this.f10085d;
        if (sVar != null) {
            try {
                z = ((C2649j) sVar.mo13264a(C2649j.class)).mo13239a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.f12814a <= 3) {
                    IAlog.m9902a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                gVar = null;
            }
        } else {
            z = false;
        }
        gVar = new C2992d(context, z, sVar);
        if (gVar == null) {
            gVar = new C2988a(context);
        }
        this.f10083b = gVar;
        List<C2997g.C3003f> list = gVar.f10257b;
        if (list != null && !list.contains(this)) {
            gVar.f10257b.add(this);
        }
        C2997g gVar2 = this.f10083b;
        List<C2997g.C3002e> list2 = gVar2.f10258c;
        if (list2 != null && !list2.contains(this)) {
            gVar2.f10258c.add(this);
        }
        this.f10083b.f10261f = this.f10104w;
    }

    /* renamed from: c */
    public abstract View mo13745c();

    /* renamed from: d */
    public abstract C2990c mo13746d();

    /* renamed from: e */
    public void mo13747e(boolean z) {
        C3650g gVar;
        JSONArray jSONArray;
        String str;
        try {
            C2807y yVar = this.f10087f;
            if (yVar != null) {
                gVar = (C3650g) yVar.f9591b;
            } else {
                gVar = null;
            }
            C2924p pVar = C2924p.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f10088g;
            C2807y yVar2 = this.f10087f;
            if (yVar2 == null) {
                jSONArray = null;
            } else {
                jSONArray = yVar2.f9592c.mo13268c();
            }
            C2926q.C2927a aVar = new C2926q.C2927a(gVar);
            aVar.f10042c = pVar;
            aVar.f10040a = inneractiveAdRequest;
            aVar.f10043d = jSONArray;
            if (!(this.f10103v == null || gVar == null)) {
                C2926q.C2929b a = new C2926q.C2929b().mo13719a("waudio", String.valueOf(z)).mo13719a("url", this.f10103v.f9794g).mo13719a("bitrate", this.f10103v.f9792e);
                if (TextUtils.isEmpty(this.f10103v.f9791d)) {
                    str = "na";
                } else {
                    str = this.f10103v.f9791d;
                }
                aVar.f10045f.put(a.mo13719a("mime", str).mo13719a("delivery", this.f10103v.f9788a).mo13719a("media_file_index", Integer.valueOf(this.f10100s)).mo13719a("player", this.f10083b.mo13817f()).f10055a);
            }
            aVar.mo13717a((String) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public abstract C2836c mo13748f();

    /* renamed from: g */
    public void mo13749g() {
        C2997g gVar = this.f10083b;
        if (gVar != null) {
            C3025b bVar = gVar.f10260e;
            if (bVar == C3025b.Completed || bVar == C3025b.Prepared) {
                gVar.mo13806a(1, true);
            } else {
                gVar.mo13822l();
            }
        }
    }

    /* renamed from: a */
    public void mo13741a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.m9902a("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        InneractiveVideoError inneractiveVideoError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc);
        if (exc instanceof C2952d) {
            ((C2952d) exc).getClass();
        }
        mo13739a(inneractiveVideoError, (JSONObject) null);
        if (this.f10096o) {
            IAlog.m9902a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            mo13739a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m7272a(List<String> list) {
        for (String next : list) {
            C2904h0 h0Var = new C2904h0(new C2947b(next, System.currentTimeMillis()), next);
            IAConfigManager.f9202J.f9232t.f10064a.offer(h0Var);
            h0Var.f9905f = C2916m0.QUEUED;
        }
    }

    /* renamed from: a */
    public void mo13736a() {
        Runnable runnable = this.f10086e;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
            this.f10086e = null;
            IAlog.m9902a("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo13744b(boolean z) {
        this.f10092k = z;
    }

    /* renamed from: a */
    public void mo13737a(long j) {
        mo13736a();
        C2949a aVar = new C2949a();
        this.f10086e = aVar;
        C3714n.f12902b.postDelayed(aVar, j);
        IAlog.m9902a("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    /* renamed from: a */
    public static int m7271a(C2948c cVar) {
        T t;
        C2807y yVar = cVar.f10087f;
        if (yVar == null || (t = yVar.f9591b) == null) {
            return -1;
        }
        return ((C3650g) t).f12765w;
    }

    /* renamed from: a */
    public static boolean m7273a(int i, C2703z zVar, int i2) {
        C2619a0 a0Var;
        if (i2 == 1) {
            return true;
        }
        if (i <= 15999 || (a0Var = ((C2702y) zVar).f9427f) == null || a0Var.f9254h == Skip.DEFAULT || a0Var.f9256j == UnitDisplayType.REWARDED) {
            return false;
        }
        return true;
    }
}
