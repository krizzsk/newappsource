package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.cache.session.C2603c;
import com.fyber.inneractive.sdk.cache.session.C2604d;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2668i;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3741w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.config.b */
public class C2620b implements C2668i.C2670b {

    /* renamed from: a */
    public final AtomicBoolean f9258a = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean f9259b = false;

    /* renamed from: c */
    public C3741w0 f9260c;

    /* renamed from: d */
    public final C2631e0 f9261d;

    /* renamed from: e */
    public final Handler f9262e = new Handler(Looper.getMainLooper(), new C2621a());

    /* renamed from: f */
    public final C3741w0.C3743b f9263f;

    /* renamed from: com.fyber.inneractive.sdk.config.b$a */
    public class C2621a implements Handler.Callback {
        public C2621a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 123) {
                return false;
            }
            C2620b bVar = C2620b.this;
            if (bVar.f9258a.compareAndSet(false, true)) {
                if (bVar.f9258a.get() && bVar.f9260c != null) {
                    IAlog.m9902a("startCounting", new Object[0]);
                    bVar.f9260c.mo15392c();
                }
                IAlog.m9902a("Pause signal", new Object[0]);
            }
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$b */
    public class C2622b implements Application.ActivityLifecycleCallbacks {
        public C2622b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (!C2620b.this.f9262e.hasMessages(123) && !C2620b.this.f9258a.get()) {
                C2620b.this.f9262e.sendEmptyMessageDelayed(123, 3000);
            }
        }

        public void onActivityResumed(Activity activity) {
            C2620b.this.f9262e.removeMessages(123);
            C2620b bVar = C2620b.this;
            if (bVar.f9258a.compareAndSet(true, false)) {
                if (bVar.f9259b) {
                    IAlog.m9902a("onActivityResumed: restartSession", new Object[0]);
                    bVar.f9259b = false;
                    C2631e0 e0Var = bVar.f9261d;
                    if (e0Var != null) {
                        C2604d dVar = ((C2628d0) e0Var).f9278a;
                        if (dVar != null) {
                            dVar.mo13178a(dVar.f9175a);
                            C3714n.m9976a(new C2603c(dVar, C2607a.NEW_SESSION, C2608b.NONE));
                        }
                        C2631e0 e0Var2 = bVar.f9261d;
                        ((C2628d0) e0Var2).f9280c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        ((C2628d0) bVar.f9261d).f9279b.clear();
                    }
                }
                C3741w0 w0Var = bVar.f9260c;
                if (w0Var != null) {
                    w0Var.f12942d = false;
                    w0Var.f12944f = 0;
                    Handler handler = w0Var.f12941c;
                    if (handler != null) {
                        handler.removeMessages(1932593528);
                    }
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$c */
    public class C2623c implements C3741w0.C3743b {
        public C2623c() {
        }

        /* renamed from: a */
        public void mo13200a(C3741w0 w0Var) {
            IAlog.m9902a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            boolean unused = C2620b.this.f9259b = true;
        }
    }

    public C2620b(C2631e0 e0Var) {
        C2622b bVar = new C2622b();
        this.f9263f = new C2623c();
        this.f9261d = e0Var;
        Application a = C3707l.m9957a();
        if (a != null) {
            a.registerActivityLifecycleCallbacks(bVar);
        }
    }

    public void onGlobalConfigChanged(C2668i iVar, C2667h hVar) {
        C3741w0 w0Var = this.f9260c;
        if (w0Var != null) {
            w0Var.f12942d = false;
            w0Var.f12944f = 0;
            Handler handler = w0Var.f12941c;
            if (handler != null) {
                handler.removeMessages(1932593528);
            }
            C3741w0 w0Var2 = new C3741w0(TimeUnit.MINUTES, (long) hVar.mo13271a("session_duration", 30, 1), this.f9260c.f12944f);
            this.f9260c = w0Var2;
            w0Var2.f12943e = this.f9263f;
        }
        iVar.f9338c.remove(this);
    }
}
