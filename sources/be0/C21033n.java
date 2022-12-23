package be0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcessClient;
import ce0.C21104i;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdRequest;
import com.vungle.warren.C23094b;
import com.vungle.warren.C23157i0;
import com.vungle.warren.C23181n1;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p979ui.PresenterAdOpenCallback;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.util.concurrent.atomic.AtomicReference;
import od0.C24573q;
import p130j2.C5367a;
import p358af.C13437d;
import p359ag.C13452i;
import xd0.C25247e;
import yd0.C25287b;
import yd0.C25290d;
import yd0.C25291e;

/* renamed from: be0.n */
public final class C21033n extends WebView implements C25291e {

    /* renamed from: b */
    public C25290d f52815b;

    /* renamed from: c */
    public C21037d f52816c;

    /* renamed from: d */
    public final C25287b.C25288a f52817d;

    /* renamed from: e */
    public final AdRequest f52818e;

    /* renamed from: f */
    public final AdConfig f52819f;

    /* renamed from: g */
    public C23157i0 f52820g;

    /* renamed from: h */
    public AtomicReference<Boolean> f52821h = new AtomicReference<>();

    /* renamed from: i */
    public boolean f52822i;

    /* renamed from: j */
    public C21034a f52823j = new C21034a();

    /* renamed from: be0.n$a */
    public class C21034a implements C21032m {
        public C21034a() {
        }

        /* renamed from: a */
        public final void mo53144a(MotionEvent motionEvent) {
            C25290d dVar = C21033n.this.f52815b;
            if (dVar != null) {
                dVar.mo61894a(motionEvent);
            }
        }
    }

    /* renamed from: be0.n$b */
    public class C21035b implements Runnable {
        public C21035b() {
        }

        public final void run() {
            C21033n.this.stopLoading();
            C21033n.this.setWebViewClient((WebViewClient) null);
            if (Build.VERSION.SDK_INT >= 29) {
                C21033n.this.setWebViewRenderProcessClient((WebViewRenderProcessClient) null);
            }
            C21033n.this.loadUrl("about:blank");
        }
    }

    /* renamed from: be0.n$c */
    public class C21036c implements C23157i0.C23159b {
        public C21036c() {
        }
    }

    /* renamed from: be0.n$d */
    public class C21037d extends BroadcastReceiver {
        public C21037d() {
        }

        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("command");
            if ("stopAll".equalsIgnoreCase(stringExtra)) {
                C21033n.this.mo53150r(false);
                return;
            }
            VungleLogger.m57032e(C13437d.m33705j(C21033n.class, new StringBuilder(), "#onAttachedToWindow"), String.format("Receiving Invalid Broadcast: %1$s", new Object[]{stringExtra}));
        }
    }

    static {
        Class<C21033n> cls = C21033n.class;
    }

    public C21033n(Context context, AdRequest adRequest, AdConfig adConfig, C23157i0 i0Var, C23094b bVar) {
        super(context);
        this.f52817d = bVar;
        this.f52818e = adRequest;
        this.f52819f = adConfig;
        this.f52820g = i0Var;
        setLayerType(2, (Paint) null);
        setBackgroundColor(0);
        setOnTouchListener(new C21038o(this));
    }

    /* renamed from: b */
    public final void mo53088b(String str, String str2, C25247e eVar, PresenterAdOpenCallback presenterAdOpenCallback) {
        C21104i.m49395b(str, str2, getContext(), eVar, true, presenterAdOpenCallback);
    }

    public final void close() {
        if (this.f52815b != null) {
            mo53150r(false);
            return;
        }
        C23157i0 i0Var = this.f52820g;
        if (i0Var != null) {
            i0Var.destroy();
            this.f52820g = null;
            C25287b.C25288a aVar = this.f52817d;
            C23094b bVar = (C23094b) aVar;
            bVar.mo58094b(this.f52818e.mo58041f(), new VungleException(25));
        }
    }

    /* renamed from: d */
    public final void mo53090d() {
        onResume();
    }

    /* renamed from: g */
    public final void mo53142g() {
    }

    public String getWebsiteUrl() {
        return getUrl();
    }

    /* renamed from: i */
    public final boolean mo53093i() {
        return true;
    }

    /* renamed from: j */
    public final void mo53134j(String str) {
        loadUrl(str);
    }

    /* renamed from: l */
    public final void mo53094l() {
        onPause();
    }

    /* renamed from: n */
    public final void mo53096n() {
        ViewParent parent = getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(this);
        }
    }

    /* renamed from: o */
    public final void mo53097o() {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23157i0 i0Var = this.f52820g;
        if (i0Var != null && this.f52815b == null) {
            i0Var.mo58228b(getContext(), this.f52818e, this.f52819f, new C21036c());
        }
        this.f52816c = new C21037d();
        C5367a.m13473a(getContext()).mo21146b(this.f52816c, new IntentFilter("AdvertisementBus"));
        onResume();
    }

    public final void onDetachedFromWindow() {
        C5367a.m13473a(getContext()).mo21148d(this.f52816c);
        super.onDetachedFromWindow();
        C23157i0 i0Var = this.f52820g;
        if (i0Var != null) {
            i0Var.destroy();
        }
        onPause();
    }

    public final void onPause() {
        super.onPause();
        setAdVisibility(false);
    }

    public final void onResume() {
        super.onResume();
        setAdVisibility(true);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        setAdVisibility(z);
    }

    /* renamed from: p */
    public final void mo53098p(long j) {
        if (!this.f52822i) {
            this.f52822i = true;
            this.f52815b = null;
            this.f52820g = null;
            removeJavascriptInterface("Android");
            setWebChromeClient((WebChromeClient) null);
            C21035b bVar = new C21035b();
            if (j <= 0) {
                bVar.run();
            } else {
                new Handler(Looper.getMainLooper()).postAtTime(bVar, SystemClock.uptimeMillis() + j);
            }
        }
    }

    /* renamed from: r */
    public final void mo53150r(boolean z) {
        int i;
        C25290d dVar = this.f52815b;
        if (dVar != null) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            dVar.mo61889i(i | 2);
        } else {
            C23157i0 i0Var = this.f52820g;
            if (i0Var != null) {
                i0Var.destroy();
                this.f52820g = null;
                C25287b.C25288a aVar = this.f52817d;
                C23094b bVar = (C23094b) aVar;
                bVar.mo58094b(this.f52818e.mo58041f(), new VungleException(25));
            }
        }
        if (z) {
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.DISMISS_AD;
            iVar.mo40349F("event", sessionEvent.toString());
            AdRequest adRequest = this.f52818e;
            if (!(adRequest == null || adRequest.mo58037c() == null)) {
                SessionAttribute sessionAttribute = SessionAttribute.EVENT_ID;
                iVar.mo40349F(sessionAttribute.toString(), this.f52818e.mo58037c());
            }
            C23181n1.m57208b().mo58250d(new C24573q(sessionEvent, iVar));
        }
        mo53098p(0);
    }

    public void setAdVisibility(boolean z) {
        C25290d dVar = this.f52815b;
        if (dVar != null) {
            dVar.mo61895l(z);
        } else {
            this.f52821h.set(Boolean.valueOf(z));
        }
    }

    public void setOrientation(int i) {
    }

    public void setPresenter(C25290d dVar) {
    }

    public void setVisibility(boolean z) {
        setVisibility(z ? 0 : 4);
    }
}
