package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2643d;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.mraid.C2858a;
import com.fyber.inneractive.sdk.mraid.C2859a0;
import com.fyber.inneractive.sdk.mraid.C2865f;
import com.fyber.inneractive.sdk.mraid.C2878s;
import com.fyber.inneractive.sdk.mraid.C2879t;
import com.fyber.inneractive.sdk.mraid.C2880u;
import com.fyber.inneractive.sdk.mraid.C2881v;
import com.fyber.inneractive.sdk.mraid.C2883x;
import com.fyber.inneractive.sdk.mraid.C2884y;
import com.fyber.inneractive.sdk.network.C2907i0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.p051ui.IAcloseButton;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3685f0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.C3726r0;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3753a;
import com.fyber.inneractive.sdk.web.C3764d.C3770f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p001a0.C0017h;

/* renamed from: com.fyber.inneractive.sdk.web.d */
public abstract class C3764d<T extends C3770f> extends C3753a<T> {

    /* renamed from: X */
    public static final String[] f12996X = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* renamed from: A */
    public final C3772h f12997A;

    /* renamed from: B */
    public C3771g f12998B;

    /* renamed from: C */
    public ViewGroup f12999C;

    /* renamed from: D */
    public C3762c f13000D;

    /* renamed from: E */
    public boolean f13001E = false;

    /* renamed from: F */
    public int f13002F;

    /* renamed from: G */
    public C3764d<T>.i f13003G;

    /* renamed from: H */
    public IAcloseButton f13004H;

    /* renamed from: I */
    public boolean f13005I;

    /* renamed from: J */
    public float f13006J;

    /* renamed from: K */
    public int f13007K = -1;

    /* renamed from: L */
    public int f13008L = -1;

    /* renamed from: M */
    public int f13009M = -1;

    /* renamed from: N */
    public int f13010N = -1;

    /* renamed from: O */
    public int f13011O = -1;

    /* renamed from: P */
    public int f13012P = -1;

    /* renamed from: Q */
    public Orientation f13013Q = Orientation.NONE;

    /* renamed from: R */
    public int f13014R;

    /* renamed from: S */
    public FrameLayout f13015S;

    /* renamed from: T */
    public FrameLayout f13016T;

    /* renamed from: U */
    public RelativeLayout f13017U;

    /* renamed from: V */
    public int f13018V;

    /* renamed from: W */
    public int f13019W;

    /* renamed from: w */
    public final C2816a f13020w;

    /* renamed from: x */
    public C2816a.C2817a f13021x = null;

    /* renamed from: y */
    public C2859a0 f13022y = C2859a0.HIDDEN;

    /* renamed from: z */
    public final C3768d f13023z;

    /* renamed from: com.fyber.inneractive.sdk.web.d$a */
    public class C3765a implements View.OnClickListener {
        public C3765a() {
        }

        public void onClick(View view) {
            C3764d.this.mo15459f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$b */
    public class C3766b implements View.OnKeyListener {
        public C3766b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4 || !C3764d.this.mo15461h()) {
                return false;
            }
            IAlog.m9905d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            C3764d.this.mo15459f();
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$c */
    public class C3767c implements C2936u<String> {
        public C3767c() {
        }

        /* renamed from: a */
        public void mo13154a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            if (exc != null || TextUtils.isEmpty(str)) {
                C3714n.f12902b.post(new C3781j(this));
                return;
            }
            C3764d dVar = C3764d.this;
            if (dVar.mo15460g() != null) {
                C3769e eVar = new C3769e(dVar, str, (String) null);
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.mo15460g().getApplicationContext(), eVar);
                eVar.f13031b = mediaScannerConnection;
                mediaScannerConnection.connect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$d */
    public enum C3768d {
        ENABLED,
        DISABLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$e */
    public class C3769e implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        public final String f13030a;

        /* renamed from: b */
        public MediaScannerConnection f13031b;

        public C3769e(C3764d dVar, String str, String str2) {
            this.f13030a = str;
        }

        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f13031b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f13030a, (String) null);
            }
        }

        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f13031b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$f */
    public interface C3770f extends C3793u {
        /* renamed from: a */
        void mo13912a(InneractiveUnitController.AdDisplayError adDisplayError);

        /* renamed from: a */
        void mo13913a(C3764d dVar);

        /* renamed from: a */
        void mo13914a(C3764d dVar, C2859a0 a0Var);

        /* renamed from: a */
        void mo13915a(C3764d dVar, boolean z);

        /* renamed from: a */
        void mo13916a(C3764d dVar, boolean z, Orientation orientation);

        /* renamed from: a */
        boolean mo13918a(String str);

        /* renamed from: b */
        void mo13919b();

        /* renamed from: b */
        void mo13920b(C3764d dVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$g */
    public enum C3771g {
        INLINE,
        INTERSTITIAL
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$h */
    public enum C3772h {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$i */
    public class C3773i extends BroadcastReceiver {

        /* renamed from: a */
        public Context f13039a;

        /* renamed from: b */
        public int f13040b = -1;

        public C3773i() {
        }

        /* renamed from: a */
        public void mo15472a() {
            try {
                C3764d dVar = C3764d.this;
                dVar.getClass();
                IAlog.m9902a("%sunregister screen broadcast receiver called", IAlog.m9899a((Object) dVar));
                if (this.f13039a != null) {
                    C3764d dVar2 = C3764d.this;
                    dVar2.getClass();
                    IAlog.m9902a("%sunregistering broadcast receiver", IAlog.m9899a((Object) dVar2));
                    this.f13039a.unregisterReceiver(this);
                    this.f13039a = null;
                }
            } catch (Throwable unused) {
            }
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            int rotation;
            if (this.f13039a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (rotation = ((WindowManager) C3707l.f12893a.getSystemService("window")).getDefaultDisplay().getRotation()) != this.f13040b) {
                this.f13040b = rotation;
                C3764d dVar = C3764d.this;
                C3762c cVar = dVar.f12957b;
                if (cVar != null) {
                    cVar.getViewTreeObserver().addOnPreDrawListener(new C3776e(dVar, context));
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$j */
    public class C3774j implements C3753a.C3758e {

        /* renamed from: a */
        public C2858a f13042a;

        public C3774j(C3764d dVar, C2858a aVar, C3721p0 p0Var) {
            this.f13042a = aVar;
        }

        /* renamed from: a */
        public String mo15424a() {
            return this.f13042a.mo13656c();
        }

        /* renamed from: b */
        public void mo15425b() {
            C2858a aVar = this.f13042a;
            if (aVar != null) {
                aVar.mo13657d();
            }
        }

        /* renamed from: c */
        public String mo15426c() {
            return this.f13042a.f9839a;
        }

        /* renamed from: d */
        public void mo15427d() {
            this.f13042a.mo13659a();
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("action = ");
            k.append(this.f13042a.f9839a);
            k.append(" url = ");
            k.append(this.f13042a.mo13656c());
            return k.toString();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$k */
    public static abstract class C3775k implements C3770f {
        /* renamed from: a */
        public void mo15267a(boolean z) {
        }
    }

    public C3764d(Context context, boolean z, boolean z2, C3771g gVar, C3768d dVar, C3772h hVar, C2816a aVar) {
        super(context, z, z2);
        this.f13020w = aVar;
        this.f12998B = gVar;
        this.f13023z = dVar;
        this.f12997A = hVar;
    }

    /* renamed from: a */
    public void mo15451a(C2865f fVar, String str) {
        String str2 = fVar.f9854a;
        C3762c cVar = this.f12957b;
        if (cVar != null) {
            cVar.mo15429a(C0017h.m56M("window.mraidbridge.fireErrorEvent('", str2, "', '", str, "');"));
        }
    }

    /* renamed from: a */
    public abstract boolean mo15323a(String str, C3721p0 p0Var);

    /* renamed from: b */
    public void mo15412b() {
        int i;
        int i2;
        int i3;
        boolean z;
        C2666s sVar;
        C2643d dVar;
        WebSettings settings = this.f12957b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        int i4 = 2;
        if (!IAConfigManager.f9202J.f9230r && C3725r.m9983a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f12960e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C3762c cVar = this.f12957b;
        cVar.setHorizontalScrollBarEnabled(false);
        cVar.setHorizontalScrollbarOverlay(false);
        cVar.setVerticalScrollBarEnabled(false);
        cVar.setVerticalScrollbarOverlay(false);
        cVar.getSettings().setSupportZoom(false);
        this.f12957b.getClass();
        this.f12957b.setFocusable(true);
        this.f12957b.setBackgroundColor(0);
        C3784m mVar = new C3784m();
        this.f12958c = mVar;
        this.f12957b.setWebChromeClient(mVar);
        C2776j jVar = this.f12977v;
        int i5 = 500;
        if (jVar == null || (sVar = jVar.f9592c) == null || (dVar = (C2643d) sVar.mo13264a(C2643d.class)) == null) {
            z = false;
            i3 = 500;
            i2 = 500;
            i = 2;
        } else {
            boolean a = dVar.mo13239a("agg_res", false);
            Integer b = dVar.mo13240b("agg_res_ct");
            int max = Math.max(b != null ? b.intValue() : 500, 50);
            Integer b2 = dVar.mo13240b("agg_res_rt");
            if (b2 != null) {
                i5 = b2.intValue();
            }
            int max2 = Math.max(i5, 50);
            Integer b3 = dVar.mo13240b("agg_res_retries");
            if (b3 != null) {
                i4 = b3.intValue();
            }
            i2 = max2;
            i = Math.max(i4, 1);
            z = a;
            i3 = max;
        }
        C3785n nVar = new C3785n(this, z, i3, i2, i);
        this.f12959d = nVar;
        this.f12957b.setWebViewClient(nVar);
        try {
            WebView.setWebContentsDebuggingEnabled(true);
        } catch (Exception unused) {
            IAlog.m9902a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f12957b.setListener(this);
        this.f13022y = C2859a0.LOADING;
        Context g = mo15460g();
        this.f13002F = g instanceof Activity ? ((Activity) g).getRequestedOrientation() : -1;
        this.f13016T = new FrameLayout(mo15460g());
        this.f13017U = new RelativeLayout(mo15460g());
        FrameLayout frameLayout = new FrameLayout(mo15460g());
        frameLayout.setBackgroundColor(-858993460);
        this.f13015S = frameLayout;
        mo15450a(g, false);
        this.f12957b.setOnKeyListener(new C3766b());
    }

    /* renamed from: c */
    public final Date mo15456c(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = f12996X;
            if (i >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: d */
    public final void mo15458d(boolean z) {
        try {
            Activity activity = (Activity) mo15460g();
            if (activity == null) {
                return;
            }
            if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                activity.setRequestedOrientation(this.f13002F);
            } else {
                activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
            }
        } catch (Exception unused) {
            IAlog.m9902a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo15459f() {
        this.f13001E = false;
        C2859a0 a0Var = this.f13022y;
        C2859a0 a0Var2 = C2859a0.EXPANDED;
        if (a0Var == a0Var2 || a0Var == C2859a0.RESIZED) {
            mo15457c(false);
            C3762c cVar = this.f12957b;
            if (cVar != null) {
                C2859a0 a0Var3 = this.f13022y;
                if (a0Var3 == a0Var2) {
                    mo15463j();
                    ViewGroup viewGroup = (ViewGroup) this.f13015S.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.f12957b, this.f13014R, new FrameLayout.LayoutParams(this.f13018V, this.f13019W, 17));
                        viewGroup.removeView(this.f13015S);
                        viewGroup.invalidate();
                        this.f12957b.requestLayout();
                    }
                    this.f13011O = this.f13018V;
                    this.f13012P = this.f13019W;
                } else if (a0Var3 == C2859a0.RESIZED) {
                    this.f13011O = this.f13018V;
                    this.f13012P = this.f13019W;
                    cVar.setLayoutParams(new FrameLayout.LayoutParams(this.f13018V, this.f13019W, 17));
                }
            }
            this.f13022y = C2859a0.DEFAULT;
            mo15458d(false);
            mo15452a((C2879t) new C2884y(this.f13022y));
        } else if (a0Var == C2859a0.DEFAULT) {
            C3762c cVar2 = this.f12957b;
            if (cVar2 != null) {
                cVar2.setVisibility(4);
            }
            C2859a0 a0Var4 = C2859a0.HIDDEN;
            this.f13022y = a0Var4;
            mo15452a((C2879t) new C2884y(a0Var4));
        }
        L l = this.f12962g;
        if (l != null) {
            ((C3770f) l).mo13914a(this, this.f13022y);
        }
    }

    /* renamed from: g */
    public final Context mo15460g() {
        C3762c cVar = this.f12957b;
        if (cVar != null) {
            return cVar.getContext();
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo15461h() {
        return this.f13022y == C2859a0.EXPANDED;
    }

    /* renamed from: i */
    public boolean mo15462i() {
        return this.f13022y == C2859a0.RESIZED;
    }

    /* renamed from: j */
    public final void mo15463j() {
        FrameLayout frameLayout = this.f13016T;
        if (frameLayout != null && this.f13017U != null) {
            frameLayout.removeAllViewsInLayout();
            this.f13017U.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f12999C;
            if (viewGroup != null) {
                viewGroup.removeView(this.f13017U);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.fyber.inneractive.sdk.measurement.C2822f) r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15464k() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.measurement.a$a r0 = r5.f13021x
            if (r0 == 0) goto L_0x0023
            com.fyber.inneractive.sdk.measurement.f r0 = (com.fyber.inneractive.sdk.measurement.C2822f) r0
            oh.b r1 = r0.f9685b
            if (r1 == 0) goto L_0x0023
            r1.mo51250c()     // Catch:{ all -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r1 = move-exception
            r0.mo13610a(r1)
        L_0x0012:
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C3714n.f12902b
            com.fyber.inneractive.sdk.measurement.e r2 = new com.fyber.inneractive.sdk.measurement.e
            r2.<init>(r0)
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.postDelayed(r2, r3)
            r1 = 0
            r0.f9685b = r1
            r0.f9686c = r1
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C3764d.mo15464k():void");
    }

    public void setAdDefaultSize(int i, int i2) {
        this.f13018V = i;
        this.f13019W = i2;
        this.f13011O = i;
        this.f13012P = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.f13013Q = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f13013Q = Orientation.LANDSCAPE;
        } else {
            this.f13013Q = Orientation.NONE;
        }
        L l = this.f12962g;
        if (l != null) {
            ((C3770f) l).mo13916a(this, z, this.f13013Q);
        }
    }

    public void setResizeProperties() {
    }

    /* renamed from: c */
    public void mo15457c(boolean z) {
        if (this.f12999C != null) {
            if (z) {
                int b = C3707l.m9963b(35);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C3707l.m9963b(10);
                layoutParams.topMargin = C3707l.m9963b(10);
                if (this.f13004H == null) {
                    IAcloseButton iAcloseButton = new IAcloseButton(mo15460g(), b, true);
                    this.f13004H = iAcloseButton;
                    iAcloseButton.setOnClickListener(new C3765a());
                }
                C3727s.m9992a((View) this.f13004H);
                this.f13017U.addView(this.f13004H, layoutParams);
            } else {
                this.f13017U.removeView(this.f13004H);
            }
            L l = this.f12962g;
            if (l != null) {
                ((C3770f) l).mo13915a(this, z);
            }
            this.f13005I = !z;
        }
    }

    /* renamed from: a */
    public void mo15410a(boolean z) {
        Handler handler = C3714n.f12902b;
        handler.post(new C3778g(this));
        C3762c cVar = this.f13000D;
        if (!(cVar == null || cVar.getParent() == null || !(this.f13000D.getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.f13000D.getParent()).removeView(this.f13000D);
            this.f13000D = null;
        }
        mo15463j();
        this.f12956a = false;
        AsyncTask<Void, Void, String> asyncTask = this.f12973r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        C3762c cVar2 = this.f12957b;
        if (cVar2 != null) {
            C3685f0.C3689d.f12862a.mo15351a(cVar2);
            C3727s.m9992a((View) this.f12957b);
            this.f12957b.setWebChromeClient((WebChromeClient) null);
            this.f12957b.setWebViewClient((WebViewClient) null);
            if (((IAmraidWebViewController) this).f13021x == null) {
                this.f12957b.destroy();
            }
        }
        C3785n nVar = this.f12959d;
        if (nVar != null) {
            nVar.f13056e = null;
        }
        Runnable runnable = this.f12969n;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f12968m;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        this.f12962g = null;
        if (!z) {
            this.f12961f = null;
        }
        this.f12957b = null;
        this.f12958c = null;
        this.f12959d = null;
        this.f12977v = null;
        this.f12976u = null;
    }

    /* renamed from: a */
    public boolean mo15322a(WebView webView, String str) {
        C3721p0 p0Var;
        C3762c cVar;
        IAlog.m9902a("%shandle url for: %s webView = %s", IAlog.m9899a((Object) this), str, webView);
        C2859a0 a0Var = this.f13022y;
        C2859a0 a0Var2 = C2859a0.EXPANDED;
        if (a0Var != a0Var2 || TextUtils.isEmpty(str) || !webView.equals(this.f13000D) || this.f13001E) {
            IAlog.m9902a("%shandleUrl called with: %s", IAlog.m9899a((Object) this), str);
            if (this.f12957b == null) {
                IAlog.m9902a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
                return false;
            }
            if (C3726r0.m9985a(str)) {
                this.f12957b.loadUrl("chrome://crash");
            } else {
                if (this.f13022y != a0Var2 || (cVar = this.f13000D) == null) {
                    C3762c cVar2 = this.f12957b;
                    p0Var = cVar2 != null ? cVar2.getLastClickedLocation() : C3721p0.m9979a();
                } else {
                    p0Var = cVar.getLastClickedLocation();
                }
                if (!mo15323a(str, p0Var)) {
                    mo15411a((C3753a.C3758e) new C3753a.C3760g(str, p0Var));
                }
            }
            return true;
        }
        this.f13001E = true;
        return false;
    }

    /* renamed from: b */
    public void mo15455b(boolean z) {
        this.f13005I = z;
        L l = this.f12962g;
        if (l != null) {
            ((C3770f) l).mo13915a(this, z);
        }
    }

    /* renamed from: b */
    public void mo15454b(String str) {
        C3762c cVar = this.f12957b;
        if (cVar != null) {
            cVar.mo15429a("window.mraidbridge.nativeCallComplete('" + str + "');");
        }
    }

    /* renamed from: a */
    public final void mo15450a(Context context, boolean z) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f13006J = displayMetrics.density;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        double d = (double) i3;
        double d2 = 160.0d / ((double) displayMetrics.densityDpi);
        int i5 = (int) (d * d2);
        int i6 = (int) (((double) i4) * d2);
        int i7 = (i4 - i2) - i;
        if (this.f12957b.getScaleX() == 1.0f || this.f12957b.getScaleY() == 1.0f) {
            double d3 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f13009M = (int) (d * d3);
            this.f13010N = (int) (((double) i7) * d3);
        } else {
            i5 = this.f12957b.getWidthDp();
            i6 = this.f12957b.getHeightDp();
            int b = (C3707l.m9963b(this.f12957b.getHeightDp()) - i2) - i;
            this.f13009M = this.f13007K;
            this.f13010N = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) b));
        }
        if (this.f13007K != i5 || this.f13008L != i6) {
            this.f13007K = i5;
            this.f13008L = i6;
            if (z) {
                mo15452a((C2879t) new C2883x(i5, i6));
                mo15452a((C2879t) new C2881v(this.f13009M, this.f13010N));
                mo15452a((C2879t) new C2880u(0, 0, this.f13009M, this.f13010N));
                int i8 = this.f13011O;
                if (i8 <= 0 || this.f13012P <= 0) {
                    C3762c cVar = this.f12957b;
                    if (cVar != null && cVar.getWidth() > 0 && this.f12957b.getHeight() > 0) {
                        mo15452a((C2879t) new C2878s(C3707l.m9968c(this.f12957b.getWidth()), C3707l.m9968c(this.f12957b.getHeight())));
                        return;
                    }
                    return;
                }
                mo15452a((C2879t) new C2878s(C3707l.m9968c(i8), C3707l.m9968c(this.f13012P)));
            }
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo15449a(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (!map.containsKey(TwitterUser.DESCRIPTION_KEY) || !map.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashMap.put("title", map.get(TwitterUser.DESCRIPTION_KEY));
        if (!map.containsKey("start") || map.get("start") == null) {
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        Date c = mo15456c(map.get("start"));
        if (c != null) {
            hashMap.put("beginTime", Long.valueOf(c.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date c2 = mo15456c(map.get("end"));
                if (c2 != null) {
                    hashMap.put("endTime", Long.valueOf(c2.getTime()));
                } else {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
            }
            if (map.containsKey(FacebookUser.LOCATION_OUTER_OBJECT_KEY)) {
                hashMap.put("eventLocation", map.get(FacebookUser.LOCATION_OUTER_OBJECT_KEY));
            }
            if (map.containsKey("summary")) {
                hashMap.put(TwitterUser.DESCRIPTION_KEY, map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                hashMap.put("availability", Integer.valueOf("transparent".equals(map.get("transparency")) ? 1 : 0));
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                if ("daily".equals(str2)) {
                    sb.append("FREQ=DAILY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                } else {
                    if ("weekly".equals(str2)) {
                        sb.append("FREQ=WEEKLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInWeek")) {
                            StringBuilder sb2 = new StringBuilder();
                            boolean[] zArr = new boolean[7];
                            String[] split = map.get("daysInWeek").split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                            for (String parseInt2 : split) {
                                int parseInt3 = Integer.parseInt(parseInt2);
                                if (parseInt3 == 7) {
                                    parseInt3 = 0;
                                }
                                if (!zArr[parseInt3]) {
                                    StringBuilder sb3 = new StringBuilder();
                                    switch (parseInt3) {
                                        case 0:
                                            str = "SU";
                                            break;
                                        case 1:
                                            str = "MO";
                                            break;
                                        case 2:
                                            str = "TU";
                                            break;
                                        case 3:
                                            str = "WE";
                                            break;
                                        case 4:
                                            str = "TH";
                                            break;
                                        case 5:
                                            str = "FR";
                                            break;
                                        case 6:
                                            str = "SA";
                                            break;
                                        default:
                                            throw new IllegalArgumentException(C16759e.m42349e("invalid day of week ", parseInt3));
                                    }
                                    sb3.append(str);
                                    sb3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                                    sb2.append(sb3.toString());
                                    zArr[parseInt3] = true;
                                }
                            }
                            if (split.length != 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                                String sb4 = sb2.toString();
                                if (sb4 != null) {
                                    sb.append("BYDAY=" + sb4 + ";");
                                } else {
                                    throw new IllegalArgumentException("invalid ");
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                            }
                        }
                    } else if ("monthly".equals(str2)) {
                        sb.append("FREQ=MONTHLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInMonth")) {
                            StringBuilder sb5 = new StringBuilder();
                            boolean[] zArr2 = new boolean[63];
                            String[] split2 = map.get("daysInMonth").split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                            for (String parseInt4 : split2) {
                                int parseInt5 = Integer.parseInt(parseInt4);
                                int i = parseInt5 + 31;
                                if (!zArr2[i]) {
                                    StringBuilder sb6 = new StringBuilder();
                                    if (parseInt5 == 0 || parseInt5 < -31 || parseInt5 > 31) {
                                        throw new IllegalArgumentException(C16759e.m42349e("invalid day of month ", parseInt5));
                                    }
                                    sb6.append("" + parseInt5);
                                    sb6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                                    sb5.append(sb6.toString());
                                    zArr2[i] = true;
                                }
                            }
                            if (split2.length != 0) {
                                sb5.deleteCharAt(sb5.length() - 1);
                                String sb7 = sb5.toString();
                                if (sb7 != null) {
                                    sb.append("BYMONTHDAY=" + sb7 + ";");
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                }
            }
            String sb8 = sb.toString();
            if (!TextUtils.isEmpty(sb8)) {
                hashMap.put("rrule", sb8);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
    }

    /* renamed from: a */
    public final void mo15453a(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        C2907i0 i0Var = new C2907i0(new C3767c(), str);
        IAConfigManager.f9202J.f9232t.f10064a.offer(i0Var);
        i0Var.mo13666a(C2916m0.QUEUED);
    }

    /* renamed from: a */
    public void mo15452a(C2879t tVar) {
        if (this.f12957b != null) {
            StringBuilder k = C13555b.m33972k("{");
            k.append(tVar.toString());
            k.append("}");
            String sb = k.toString();
            C3762c cVar = this.f12957b;
            cVar.mo15429a("window.mraidbridge.fireChangeEvent(" + sb + ");");
            IAlog.m9905d("Fire changes: %s", sb);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo15448a(URI uri) throws UnsupportedEncodingException {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }
}
