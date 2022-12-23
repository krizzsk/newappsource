package gc0;

import ac0.C7557a;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.C0199g;
import androidx.appcompat.widget.C0416i1;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p347l.zze;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzr;
import com.umo.ads.p350u.zzs;
import com.usebutton.sdk.internal.models.Widget;
import hc0.C12755c;
import kotlin.NoWhenBranchMatchedException;
import lc0.C12856a;
import lc0.C12860c;
import mf0.C24362h;
import nc0.C12950a;
import p001a0.C0016g;
import p043ch.qos.logback.classic.Logger;
import p304x.C7073m;
import wb0.C13233c;

/* renamed from: gc0.b */
public final class C12724b implements zze.C12092a {

    /* renamed from: b */
    public final zzr f31425b;

    /* renamed from: c */
    public final C12856a.C12857a f31426c;

    /* renamed from: d */
    public Context f31427d;

    /* renamed from: e */
    public boolean f31428e;

    /* renamed from: f */
    public boolean f31429f;

    /* renamed from: g */
    public boolean f31430g;

    /* renamed from: h */
    public FrameLayout f31431h;

    /* renamed from: i */
    public FrameLayout f31432i;

    /* renamed from: j */
    public FrameLayout f31433j;

    /* renamed from: k */
    public RelativeLayout f31434k;

    /* renamed from: l */
    public ImageView f31435l;

    /* renamed from: m */
    public boolean f31436m;

    /* renamed from: n */
    public zze f31437n;

    /* renamed from: o */
    public boolean f31438o;

    /* renamed from: p */
    public C12725a f31439p;

    /* renamed from: q */
    public C12856a.C12857a f31440q;

    /* renamed from: r */
    public C12860c f31441r;

    /* renamed from: s */
    public C12856a f31442s;

    /* renamed from: t */
    public boolean f31443t;

    /* renamed from: u */
    public final FrameLayout.LayoutParams f31444u = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: v */
    public ViewGroup f31445v;

    /* renamed from: w */
    public String f31446w = "";

    /* renamed from: gc0.b$a */
    public final class C12725a implements C12860c.C12864d {

        /* renamed from: a */
        public final /* synthetic */ C12724b f31447a;

        public C12725a(C12724b bVar) {
            C24362h.m61211f(bVar, "this$0");
            this.f31447a = bVar;
        }
    }

    /* renamed from: gc0.b$b */
    public /* synthetic */ class C12726b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31448a;

        static {
            int[] iArr = new int[UMOAdKitInlineVideoPlayMode.values().length];
            iArr[UMOAdKitInlineVideoPlayMode.AUTOPLAY_AUDIO_ON.ordinal()] = 1;
            iArr[UMOAdKitInlineVideoPlayMode.AUTOPLAY_AUDIO_OFF.ordinal()] = 2;
            iArr[UMOAdKitInlineVideoPlayMode.NONE.ordinal()] = 3;
            iArr[UMOAdKitInlineVideoPlayMode.CLICKTOPLAY_AUDIO_ON.ordinal()] = 4;
            iArr[UMOAdKitInlineVideoPlayMode.CLICKTOPLAY_AUDIO_OFF.ordinal()] = 5;
            f31448a = iArr;
        }
    }

    public C12724b(zzr zzr, C12755c cVar) {
        this.f31425b = zzr;
        this.f31426c = cVar;
    }

    /* renamed from: h */
    public static void m32486h(C12724b bVar) {
        if (bVar.mo39529j()) {
            zze zze = bVar.f31437n;
            if (zze != null) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("Unregistering VPAID Orientation Broadcast Receiver");
                J0.append(bVar.f31446w);
                J0.append("...");
                logger.mo6666c(J0.toString());
                zze.f30826a.unregisterReceiver(zze);
            }
            bVar.f31437n = null;
        }
        bVar.f31429f = false;
        bVar.f31430g = false;
        bVar.f31428e = false;
        bVar.f31443t = false;
    }

    /* renamed from: a */
    public final void mo39521a(ViewGroup.LayoutParams layoutParams, zzs zzs) {
        String str;
        C12856a aVar = this.f31442s;
        if (aVar != null) {
            int i = layoutParams.width;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
            int i2 = (int) ((((float) i) / displayMetrics.density) + 0.5f);
            int i3 = layoutParams.height;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
            int i4 = (int) ((((float) i3) / displayMetrics2.density) + 0.5f);
            C24362h.m61211f(zzs, "viewMode");
            int ordinal = zzs.ordinal();
            if (ordinal == 0) {
                str = "normal";
            } else if (ordinal == 1) {
                str = "thumbnail";
            } else if (ordinal == 2) {
                str = Widget.VIEW_TYPE_FULLSCREEN;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder s = C0016g.m35s("VPAIDWrapper.resizeAd('", i2, "', '", i4, "', '");
            s.append(str);
            s.append("');");
            aVar.mo39712b(s.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0052  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39522b(lc0.C12856a r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            monitor-enter(r7)
            lc0.a r0 = r6.f31442s     // Catch:{ all -> 0x008f }
            if (r7 != r0) goto L_0x000e
            boolean r0 = r6.f31438o     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r7)
            return
        L_0x000e:
            lc0.c r0 = r7.f31787b     // Catch:{ all -> 0x008f }
            boolean r0 = r0.f31803e     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r7)
            return
        L_0x0016:
            int r0 = r7.f31790e     // Catch:{ all -> 0x008f }
            r1 = 2
            if (r0 == r1) goto L_0x001d
            monitor-exit(r7)
            return
        L_0x001d:
            boolean r0 = r6.mo39529j()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0026
            com.umo.ads.u.zzs r0 = com.umo.ads.p350u.zzs.THUMBNAIL     // Catch:{ all -> 0x008f }
            goto L_0x0028
        L_0x0026:
            com.umo.ads.u.zzs r0 = com.umo.ads.p350u.zzs.FULLSCREEN     // Catch:{ all -> 0x008f }
        L_0x0028:
            lc0.c r1 = r6.f31441r     // Catch:{ all -> 0x008f }
            r2 = 0
            if (r1 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0038
        L_0x0036:
            int r1 = r1.width     // Catch:{ all -> 0x008f }
        L_0x0038:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x008f }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r3, r4)     // Catch:{ all -> 0x008f }
            float r1 = (float) r1     // Catch:{ all -> 0x008f }
            float r3 = r3.density     // Catch:{ all -> 0x008f }
            float r1 = r1 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1     // Catch:{ all -> 0x008f }
            lc0.c r4 = r6.f31441r     // Catch:{ all -> 0x008f }
            if (r4 != 0) goto L_0x0052
            goto L_0x005b
        L_0x0052:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()     // Catch:{ all -> 0x008f }
            if (r4 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            int r2 = r4.height     // Catch:{ all -> 0x008f }
        L_0x005b:
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x008f }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ all -> 0x008f }
            float r2 = (float) r2     // Catch:{ all -> 0x008f }
            float r4 = r4.density     // Catch:{ all -> 0x008f }
            float r2 = r2 / r4
            float r2 = r2 + r3
            int r2 = (int) r2     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r3.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "{ AdParameters: "
            r3.append(r4)     // Catch:{ all -> 0x008f }
            com.umo.ads.u.zzr r4 = r6.f31425b     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r4.f30882e     // Catch:{ all -> 0x008f }
            r3.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = " }"
            r3.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008f }
            r7.mo39711a(r1, r2, r0, r3)     // Catch:{ all -> 0x008f }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ all -> 0x008f }
            monitor-exit(r7)
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.C12724b.mo39522b(lc0.a):void");
    }

    /* renamed from: c */
    public final void mo39523c(boolean z) {
        if (this.f31428e && !this.f31436m) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID_PLAYER: Pausing VPAID Ad Playback");
            J0.append(this.f31446w);
            J0.append("...");
            logger.mo6672i(J0.toString());
            this.f31436m = true;
            C12856a aVar = this.f31442s;
            if (aVar != null) {
                aVar.mo39712b("VPAIDWrapper.pauseAd();");
            }
        }
    }

    /* renamed from: d */
    public final void mo39524d(boolean z, boolean z2) {
        if (this.f31428e && this.f31436m) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID_PLAYER: Resuming VPAID Ad Playback");
            J0.append(this.f31446w);
            J0.append("...");
            logger.mo6672i(J0.toString());
            C12856a aVar = this.f31442s;
            if (aVar != null) {
                aVar.mo39712b("VPAIDWrapper.resumeAd();");
            }
            this.f31436m = false;
        }
    }

    /* renamed from: e */
    public final void mo39525e(boolean z) {
        C13233c.f32843b.post(new C12950a(this.f31433j, z));
    }

    /* renamed from: f */
    public final void mo39526f(boolean z) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VPAID_PLAYER: Stopping VPAID Ad Playback");
        J0.append(this.f31446w);
        J0.append(": NotifyEvent: ");
        J0.append(z);
        J0.append("...");
        logger.mo6672i(J0.toString());
        if (!z) {
            C12856a aVar = this.f31442s;
            if (aVar != null) {
                aVar.f31791f = true;
            }
        } else {
            C12856a.C12857a aVar2 = this.f31426c;
            if (aVar2 != null) {
                ((C12755c) aVar2).mo39608d(this.f31442s, true);
            }
            C12856a aVar3 = this.f31442s;
            if (aVar3 != null) {
                aVar3.f31791f = true;
            }
        }
        C13233c.f32843b.post(new C7073m(this, 14));
        mo39532m();
        m32486h(this);
    }

    /* renamed from: g */
    public final void mo39527g() {
        C12856a.C12857a aVar = this.f31426c;
        if (aVar != null) {
            ((C12755c) aVar).mo39607c(this.f31442s, zzd.NONE);
        }
        mo39532m();
        m32486h(this);
    }

    /* renamed from: i */
    public final boolean mo39528i() {
        int i = C12726b.f31448a[this.f31425b.f30883f.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public final boolean mo39529j() {
        if (this.f31425b.f30884g == zzc.INLINE) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cubic.umo.p045ad.ext.types.UMOAdKitError mo39530k() {
        /*
            r15 = this;
            com.umo.ads.u.zzr r0 = r15.f31425b
            java.lang.String r0 = r0.f30879b
            boolean r1 = nc0.C12954d.m32800c(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = p584jl.C17885a.m44403H0(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            r15.f31446w = r0
            android.content.Context r0 = wb0.C13233c.f32842a
            com.umo.ads.u.zzr r0 = r15.f31425b
            java.lang.String r0 = r0.f30879b
            android.view.ViewGroup r0 = wb0.C13233c.m33334c(r0)
            if (r0 != 0) goto L_0x0030
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = r15.f31446w
            java.lang.String r2 = "VPAID_PLAYER: Invalid VPAID Container"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r2)
            r0.mo6667d(r1)
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_AD_VIEW
            return r0
        L_0x0030:
            r15.f31445v = r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "containerView.context"
            mf0.C24362h.m61210e(r0, r1)
            r15.f31427d = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = p026b7.C1501f.umoak_layout_vpaid_player_container
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3)
            if (r0 == 0) goto L_0x0332
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r15.f31431h = r0
            int r1 = p026b7.C1500e.layout_vpaid_player
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r15.f31432i = r0
            android.view.ViewGroup r0 = r15.f31445v
            if (r0 == 0) goto L_0x032c
            android.widget.FrameLayout r1 = r15.f31431h
            r0.addView(r1)
            lc0.c r0 = r15.f31441r
            java.lang.String r1 = "..."
            java.lang.String r4 = "context"
            r5 = 0
            if (r0 != 0) goto L_0x0120
            lc0.c r0 = new lc0.c
            com.umo.ads.u.zzr r6 = r15.f31425b
            java.lang.String r6 = r6.f30879b
            android.content.Context r7 = r15.f31427d
            if (r7 == 0) goto L_0x011c
            r0.<init>(r7, r6)
            r15.f31441r = r0
            boolean r0 = r15.mo39529j()
            if (r0 == 0) goto L_0x0099
            android.widget.FrameLayout r0 = r15.f31432i
            if (r0 != 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            gc0.a r6 = new gc0.a
            r6.<init>(r15, r0, r5)
            r0.post(r6)
        L_0x008c:
            android.widget.FrameLayout r0 = r15.f31432i
            if (r0 != 0) goto L_0x0091
            goto L_0x00c1
        L_0x0091:
            lc0.c r6 = r15.f31441r
            android.widget.FrameLayout$LayoutParams r7 = r15.f31444u
            r0.addView(r6, r7)
            goto L_0x00c1
        L_0x0099:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r6 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r0, r6)
            lc0.c r6 = r15.f31441r
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b7
        L_0x00ab:
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            int r8 = r0.widthPixels
            int r0 = r0.heightPixels
            r7.<init>(r8, r0)
            r6.setLayoutParams(r7)
        L_0x00b7:
            android.widget.FrameLayout r0 = r15.f31432i
            if (r0 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            lc0.c r6 = r15.f31441r
            r0.addView(r6)
        L_0x00c1:
            gc0.b$a r0 = r15.f31439p
            if (r0 != 0) goto L_0x00cc
            gc0.b$a r0 = new gc0.b$a
            r0.<init>(r15)
            r15.f31439p = r0
        L_0x00cc:
            lc0.a$a r0 = r15.f31440q
            if (r0 != 0) goto L_0x00d4
            lc0.a$a r0 = r15.f31426c
            r15.f31440q = r0
        L_0x00d4:
            lc0.c r0 = r15.f31441r
            if (r0 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            gc0.b$a r6 = r15.f31439p
            r0.setHandler(r6)
        L_0x00de:
            boolean r0 = r15.mo39529j()
            if (r0 != 0) goto L_0x00e5
            goto L_0x0120
        L_0x00e5:
            com.umo.ads.l.zze r0 = r15.f31437n
            if (r0 == 0) goto L_0x00ea
            goto L_0x0120
        L_0x00ea:
            android.content.Context r0 = r15.f31427d
            if (r0 == 0) goto L_0x0118
            boolean r6 = r0 instanceof android.app.Activity
            if (r6 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r0 = r3
        L_0x00f4:
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x00f9
            goto L_0x0120
        L_0x00f9:
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.String r7 = "Registering VPAID Orientation Broadcast Receiver"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            java.lang.String r8 = r15.f31446w
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.mo6666c(r7)
            com.umo.ads.l.zze r6 = new com.umo.ads.l.zze
            r6.<init>(r0, r15)
            r15.f31437n = r6
            goto L_0x0120
        L_0x0118:
            mf0.C24362h.m61217l(r4)
            throw r3
        L_0x011c:
            mf0.C24362h.m61217l(r4)
            throw r3
        L_0x0120:
            boolean r0 = r15.mo39529j()
            java.lang.String r6 = ": "
            r7 = 1
            if (r0 == 0) goto L_0x023c
            com.umo.ads.u.zzr r0 = r15.f31425b
            java.lang.String r0 = r0.f30879b
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            if (r0 != 0) goto L_0x0134
            goto L_0x0138
        L_0x0134:
            android.widget.FrameLayout r8 = r15.f31431h
            r0.f31973i = r8
        L_0x0138:
            android.content.Context r0 = r15.f31427d
            if (r0 == 0) goto L_0x0238
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r8 = p026b7.C1501f.umoak_layout_vast_player_controls
            android.view.View r0 = r0.inflate(r8, r3)
            if (r0 == 0) goto L_0x0230
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r15.f31434k = r0
            int r8 = p026b7.C1500e.iv_play
            android.view.View r0 = r0.findViewById(r8)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0228
            r15.f31435l = r0
            android.widget.FrameLayout r0 = r15.f31432i
            if (r0 != 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            android.widget.RelativeLayout r8 = r15.f31434k
            r0.addView(r8)
        L_0x0162:
            com.cubic.umo.ad.types.AKUmoVideoAdUIConfig r0 = wb0.C13233c.m33351t()
            if (r0 != 0) goto L_0x016a
            goto L_0x0206
        L_0x016a:
            java.lang.String r0 = r0.getPlayIconUrl()
            if (r0 != 0) goto L_0x0172
            goto L_0x0206
        L_0x0172:
            android.widget.ImageView r8 = r15.f31435l
            if (r8 != 0) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r8.setImageDrawable(r3)
        L_0x017a:
            java.lang.CharSequence r0 = kotlin.text.C24179b.m60585g0(r0)
            java.lang.String r0 = r0.toString()
            android.widget.ImageView r8 = r15.f31435l
            int r9 = p026b7.C1499d.umoak_ic_play
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r10 = nc0.C12954d.m32800c(r0)
            if (r10 != 0) goto L_0x019e
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = r15.f31446w
            java.lang.String r4 = "VPAID_PLAYER: Invalid Image Url for loading into ImageView"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r4)
            r0.mo6667d(r1)
            goto L_0x0206
        L_0x019e:
            t6.g r10 = new t6.g
            r10.<init>()
            d6.f$a r11 = p060d6.C4385f.f15420a
            t6.a r10 = r10.mo22726i(r11)
            java.lang.String r11 = "RequestOptions().diskCac…gy(DiskCacheStrategy.ALL)"
            mf0.C24362h.m61210e(r10, r11)
            t6.g r10 = (p260t6.C6602g) r10
            if (r9 != 0) goto L_0x01b4
            r9 = r3
            goto L_0x01be
        L_0x01b4:
            int r9 = r9.intValue()
            t6.a r9 = r10.mo22738w(r9)
            t6.g r9 = (p260t6.C6602g) r9
        L_0x01be:
            if (r9 != 0) goto L_0x01c6
            t6.a r9 = r10.mo22739x(r3)
            t6.g r9 = (p260t6.C6602g) r9
        L_0x01c6:
            if (r8 != 0) goto L_0x01c9
            goto L_0x0206
        L_0x01c9:
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r11 = "VPAID_PLAYER: Loading Image"
            java.lang.StringBuilder r11 = ce0.C21100e.m49315J0(r11)
            java.lang.String r12 = r15.f31446w
            r11.append(r12)
            r11.append(r6)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            r9.mo6666c(r1)
            android.content.Context r1 = r15.f31427d
            if (r1 == 0) goto L_0x0224
            q6.m r4 = com.bumptech.glide.C2116c.m5521c(r1)
            com.bumptech.glide.j r1 = r4.mo22193f(r1)
            gc0.c r4 = new gc0.c
            r4.<init>(r15)
            com.bumptech.glide.j r1 = r1.mo10867f(r4)
            com.bumptech.glide.j r1 = r1.mo10868g(r10)
            com.bumptech.glide.i r0 = r1.mo10880p(r0)
            r0.mo10850T(r8)
        L_0x0206:
            boolean r0 = r15.mo39528i()
            if (r0 != 0) goto L_0x023c
            android.widget.ImageView r0 = r15.f31435l
            if (r0 != 0) goto L_0x0211
            goto L_0x0214
        L_0x0211:
            r0.setVisibility(r5)
        L_0x0214:
            android.widget.ImageView r0 = r15.f31435l
            mf0.C24362h.m61208c(r0)
            android.os.Handler r1 = wb0.C13233c.f32843b
            ia.i r4 = new ia.i
            r4.<init>(r7, r0, r5)
            r1.post(r4)
            goto L_0x023c
        L_0x0224:
            mf0.C24362h.m61217l(r4)
            throw r3
        L_0x0228:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.ImageView"
            r0.<init>(r1)
            throw r0
        L_0x0230:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            r0.<init>(r1)
            throw r0
        L_0x0238:
            mf0.C24362h.m61217l(r4)
            throw r3
        L_0x023c:
            android.widget.FrameLayout r0 = r15.f31431h
            if (r0 != 0) goto L_0x0242
            r0 = r3
            goto L_0x024a
        L_0x0242:
            int r1 = p026b7.C1500e.progress_bar_layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        L_0x024a:
            r15.f31433j = r0
            if (r0 != 0) goto L_0x024f
            goto L_0x0252
        L_0x024f:
            nc0.C12952c.m32795e(r0)
        L_0x0252:
            r15.mo39525e(r7)
            boolean r0 = r15.mo39529j()
            if (r0 == 0) goto L_0x026a
            android.widget.ImageView r0 = r15.f31435l
            if (r0 != 0) goto L_0x0260
            goto L_0x026a
        L_0x0260:
            iw.e r1 = new iw.e
            r4 = 17
            r1.<init>(r15, r4)
            r0.setOnClickListener(r1)
        L_0x026a:
            lc0.c r0 = r15.f31441r
            if (r0 != 0) goto L_0x026f
            goto L_0x0272
        L_0x026f:
            r0.stopLoading()
        L_0x0272:
            r15.f31438o = r5
            lc0.a r0 = new lc0.a
            com.umo.ads.u.zzr r1 = r15.f31425b
            java.lang.String r1 = r1.f30879b
            lc0.c r4 = r15.f31441r
            mf0.C24362h.m61208c(r4)
            lc0.a$a r8 = r15.f31440q
            mf0.C24362h.m61208c(r8)
            r0.<init>(r1, r4, r8)
            r15.f31442s = r0
            lc0.c r1 = r15.f31441r
            if (r1 != 0) goto L_0x028f
            goto L_0x0324
        L_0x028f:
            com.umo.ads.u.zzr r4 = r15.f31425b
            java.lang.String r4 = r4.f30881d
            java.lang.String r8 = r1.f31804f
            r1.addJavascriptInterface(r0, r8)
            com.umo.ads.u.zzd r0 = com.umo.ads.p350u.zzd.VPAID_AD_TEMPLATE
            java.lang.String r8 = "templateName"
            mf0.C24362h.m61211f(r0, r8)
            j$.util.concurrent.ConcurrentHashMap r0 = p389bl.C13637c.f33649p
            if (r0 != 0) goto L_0x02a4
            goto L_0x02ad
        L_0x02a4:
            java.lang.String r3 = "VPAID_AD_TEMPLATE"
            java.lang.Object r0 = r0.get(r3)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x02ad:
            boolean r0 = nc0.C12954d.m32800c(r3)
            if (r0 == 0) goto L_0x02b7
            mf0.C24362h.m61208c(r3)
            r2 = r3
        L_0x02b7:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x02fa }
            r3 = 2
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ IllegalFormatException -> 0x02fa }
            r8[r5] = r4     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r4 = r1.f31805g     // Catch:{ IllegalFormatException -> 0x02fa }
            r8[r7] = r4     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r8, r3)     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r11 = java.lang.String.format(r0, r2, r3)     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r0 = "format(locale, this, *args)"
            mf0.C24362h.m61210e(r11, r0)     // Catch:{ IllegalFormatException -> 0x02fa }
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalFormatException -> 0x02fa }
            r2.<init>()     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r3 = "VPAID Load Content"
            r2.append(r3)     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r3 = r1.f31806h     // Catch:{ IllegalFormatException -> 0x02fa }
            r2.append(r3)     // Catch:{ IllegalFormatException -> 0x02fa }
            r2.append(r6)     // Catch:{ IllegalFormatException -> 0x02fa }
            r2.append(r11)     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalFormatException -> 0x02fa }
            r0.mo6666c(r2)     // Catch:{ IllegalFormatException -> 0x02fa }
            java.lang.String r10 = ""
            java.lang.String r12 = "text/html"
            java.lang.String r13 = "UTF-8"
            r14 = 0
            r9 = r1
            r9.loadDataWithBaseURL(r10, r11, r12, r13, r14)     // Catch:{ IllegalFormatException -> 0x02fa }
            r0 = 1
            goto L_0x0321
        L_0x02fa:
            r0 = move-exception
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "IllegalFormatException while templatizing VPAID Ad Content"
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r1 = r1.f31806h
            r3.append(r1)
            java.lang.String r1 = " (Exception: "
            r3.append(r1)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            r0 = 41
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.mo6667d(r0)
            r0 = 0
        L_0x0321:
            if (r0 != 0) goto L_0x0324
            r5 = 1
        L_0x0324:
            if (r5 == 0) goto L_0x0329
            r15.mo39527g()
        L_0x0329:
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            return r0
        L_0x032c:
            java.lang.String r0 = "containerView"
            mf0.C24362h.m61217l(r0)
            throw r3
        L_0x0332:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.C12724b.mo39530k():com.cubic.umo.ad.ext.types.UMOAdKitError");
    }

    /* renamed from: l */
    public final void mo39531l() {
        C13233c.f32843b.post(new C0416i1(this, 15));
    }

    /* renamed from: m */
    public final void mo39532m() {
        C12856a aVar = this.f31442s;
        if (aVar != null) {
            aVar.mo39712b("VPAIDWrapper.stopAd();");
            C12856a aVar2 = this.f31442s;
            if (aVar2 != null) {
                aVar2.mo39713c("", false);
            }
            this.f31442s = null;
        }
        C12860c cVar = this.f31441r;
        if (cVar != null) {
            C13233c.f32843b.post(new C0199g(cVar, 20));
        }
        mo39531l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39533n() {
        /*
            r4 = this;
            boolean r0 = r4.f31443t
            if (r0 == 0) goto L_0x005d
            r0 = 1
            r4.f31428e = r0
            lc0.a r1 = r4.f31442s
            if (r1 != 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            java.lang.String r2 = "START_AD"
            r1.mo39714d(r2)
            java.lang.String r2 = "VPAIDWrapper.startAd();"
            r1.mo39712b(r2)
        L_0x0016:
            com.umo.ads.u.zzr r1 = r4.f31425b
            com.cubic.umo.ad.ext.types.UMOAdKitInlineVideoPlayMode r1 = r1.f30883f
            int[] r2 = gc0.C12724b.C12726b.f31448a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            if (r1 == r0) goto L_0x0038
            r3 = 2
            if (r1 == r3) goto L_0x0039
            r3 = 3
            if (r1 == r3) goto L_0x0039
            r3 = 4
            if (r1 == r3) goto L_0x0038
            r3 = 5
            if (r1 != r3) goto L_0x0032
            goto L_0x0039
        L_0x0032:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x005d
            lc0.a r0 = r4.f31442s
            if (r0 != 0) goto L_0x0041
            r0 = 0
            goto L_0x0049
        L_0x0041:
            lc0.b r0 = r0.f31789d
            int r0 = r0.f31799c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0049:
            if (r0 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r0.intValue()
        L_0x004f:
            lc0.a r0 = r4.f31442s
            if (r0 != 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            lc0.b r1 = r0.f31789d
            r1.f31799c = r2
            java.lang.String r1 = "VPAIDWrapper.setAdVolume('0');"
            r0.mo39712b(r1)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.C12724b.mo39533n():void");
    }

    public final void zza() {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("ORIENTATION_RECEIVER: onOrientationChanged");
        J0.append(this.f31446w);
        J0.append("...");
        logger.mo6666c(J0.toString());
    }
}
