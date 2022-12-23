package be0;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import be0.C21012c;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.ViewUtility;
import java.io.File;
import java.util.Locale;
import od0.C24568o;
import p358af.C13437d;
import xd0.C25242a;
import xd0.C25246d;
import yd0.C25287b;
import yd0.C25289c;
import zd0.C25330a;

/* renamed from: be0.j */
public final class C21026j extends C21007a<C25330a> implements C25289c, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: h */
    public C25330a f52803h;

    /* renamed from: i */
    public boolean f52804i = false;

    /* renamed from: j */
    public MediaPlayer f52805j;

    /* renamed from: k */
    public boolean f52806k = false;

    /* renamed from: l */
    public C21029k f52807l;

    /* renamed from: m */
    public Handler f52808m = new Handler(Looper.getMainLooper());

    /* renamed from: be0.j$a */
    public class C21027a implements C21012c.C21019g {
        public C21027a() {
        }
    }

    /* renamed from: be0.j$b */
    public class C21028b implements MediaPlayer.OnCompletionListener {
        public C21028b() {
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            C21026j jVar = C21026j.this;
            String str = jVar.f52762d;
            C21029k kVar = jVar.f52807l;
            if (kVar != null) {
                jVar.f52808m.removeCallbacks(kVar);
            }
            C21026j.this.f52803h.mo61917r((float) mediaPlayer.getDuration(), mediaPlayer.getDuration());
        }
    }

    public C21026j(Context context, C21012c cVar, C25246d dVar, C25242a aVar) {
        super(context, cVar, dVar, aVar);
        this.f52763e.setOnItemClickListener(new C21027a());
        this.f52763e.setOnPreparedListener(this);
        this.f52763e.setOnErrorListener(this);
    }

    /* renamed from: c */
    public final int mo53131c() {
        return this.f52763e.getCurrentVideoPosition();
    }

    public final void close() {
        super.close();
        this.f52808m.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    public final boolean mo53132e() {
        return this.f52763e.f52774d.isPlaying();
    }

    /* renamed from: h */
    public final void mo53133h(File file, boolean z, int i) {
        boolean z2;
        if (this.f52804i || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f52804i = z2;
        C21029k kVar = new C21029k(this);
        this.f52807l = kVar;
        this.f52808m.post(kVar);
        C21012c cVar = this.f52763e;
        Uri fromFile = Uri.fromFile(file);
        cVar.f52775e.setVisibility(0);
        cVar.f52774d.setVideoURI(fromFile);
        cVar.f52781k.setImageBitmap(ViewUtility.m57277b(ViewUtility.Asset.privacy, cVar.getContext()));
        cVar.f52781k.setVisibility(0);
        cVar.f52777g.setVisibility(0);
        cVar.f52777g.setMax(cVar.f52774d.getDuration());
        if (!cVar.f52774d.isPlaying()) {
            cVar.f52774d.requestFocus();
            cVar.f52787q = i;
            if (Build.VERSION.SDK_INT < 26) {
                cVar.f52774d.seekTo(i);
            }
            cVar.f52774d.start();
        }
        cVar.f52774d.isPlaying();
        this.f52763e.setMuted(this.f52804i);
        boolean z3 = this.f52804i;
        if (z3) {
            C25330a aVar = this.f52803h;
            aVar.f63649k = z3;
            if (z3) {
                aVar.mo61919t("mute", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            } else {
                aVar.mo61919t("unmute", "false");
            }
        }
    }

    /* renamed from: j */
    public final void mo53134j(String str) {
        this.f52763e.f52774d.stopPlayback();
        this.f52763e.mo53108d(str);
        this.f52808m.removeCallbacks(this.f52807l);
        this.f52805j = null;
    }

    /* renamed from: k */
    public final void mo53135k(boolean z, boolean z2) {
        boolean z3;
        this.f52806k = z2;
        C21012c cVar = this.f52763e;
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        cVar.setCtaEnabled(z3);
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(30);
        if (i == 1) {
            sb.append("MEDIA_ERROR_UNKNOWN");
        } else if (i != 100) {
            sb.append("UNKNOWN");
        } else {
            sb.append("MEDIA_ERROR_SERVER_DIED");
        }
        sb.append(':');
        if (i2 == -1010) {
            sb.append("MEDIA_ERROR_UNSUPPORTED");
        } else if (i2 == -1007) {
            sb.append("MEDIA_ERROR_MALFORMED");
        } else if (i2 == -1004) {
            sb.append("MEDIA_ERROR_IO");
        } else if (i2 == -110) {
            sb.append("MEDIA_ERROR_TIMED_OUT");
        } else if (i2 != 200) {
            sb.append("MEDIA_ERROR_SYSTEM");
        } else {
            sb.append("MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
        }
        C25330a aVar = this.f52803h;
        String sb2 = sb.toString();
        C24568o oVar = aVar.f63646h;
        synchronized (oVar) {
            oVar.f62285q.add(sb2);
        }
        aVar.f63647i.mo58289x(aVar.f63646h, aVar.f63664z, true);
        aVar.mo61916q(27);
        if (aVar.f63651m || !(!TextUtils.isEmpty(aVar.f63645g.f62219r))) {
            aVar.mo61916q(10);
            aVar.f63652n.close();
        } else {
            aVar.mo61918s();
        }
        String j = C13437d.m33705j(C25330a.class, new StringBuilder(), "#onMediaError");
        VungleLogger.m57029b(j, "Media Error: " + sb2);
        return true;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        float f;
        this.f52805j = mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (this.f52804i) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = 1.0f;
                }
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
        this.f52763e.setOnCompletionListener(new C21028b());
        C25330a aVar = this.f52803h;
        mo53131c();
        aVar.getClass();
        aVar.mo61919t("videoLength", String.format(Locale.ENGLISH, "%d", new Object[]{Integer.valueOf((int) ((float) mediaPlayer.getDuration()))}));
        C21029k kVar = new C21029k(this);
        this.f52807l = kVar;
        this.f52808m.post(kVar);
    }

    public final void pauseVideo() {
        this.f52763e.f52774d.pause();
        C21029k kVar = this.f52807l;
        if (kVar != null) {
            this.f52808m.removeCallbacks(kVar);
        }
    }

    public final void setPresenter(C25287b bVar) {
        this.f52803h = (C25330a) bVar;
    }
}
