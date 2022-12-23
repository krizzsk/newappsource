package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.veriff.sdk.internal.C21508cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.veriff.sdk.internal.bx */
class C21491bx {

    /* renamed from: b */
    public final Context f54058b;

    /* renamed from: c */
    public final ExecutorService f54059c;

    /* renamed from: d */
    public final C21496by f54060d;

    /* renamed from: e */
    public final Map<String, C21479br> f54061e = new LinkedHashMap();

    /* renamed from: f */
    public final Map<Object, C21476bp> f54062f = new WeakHashMap();

    /* renamed from: g */
    public final Map<Object, C21476bp> f54063g = new WeakHashMap();

    /* renamed from: h */
    public final Set<Object> f54064h = new LinkedHashSet();

    /* renamed from: i */
    public final Handler f54065i;

    /* renamed from: j */
    public final Handler f54066j;

    /* renamed from: k */
    public final C21486bs f54067k;

    /* renamed from: l */
    public final C21532cp f54068l;

    /* renamed from: m */
    public final List<C21479br> f54069m;

    /* renamed from: o */
    public final boolean f54070o;

    /* renamed from: p */
    public boolean f54071p;

    /* renamed from: com.veriff.sdk.internal.bx$a */
    public static class C21492a extends Handler {

        /* renamed from: a */
        private final C21491bx f54072a;

        public C21492a(Looper looper, C21491bx bxVar) {
            super(looper);
            this.f54072a = bxVar;
        }

        public void handleMessage(final Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f54072a.mo54457c((C21476bp) message.obj);
                    return;
                case 2:
                    this.f54072a.mo54459d((C21476bp) message.obj);
                    return;
                case 4:
                    this.f54072a.mo54461e((C21479br) message.obj);
                    return;
                case 5:
                    this.f54072a.mo54460d((C21479br) message.obj);
                    return;
                case 6:
                    this.f54072a.mo54449a((C21479br) message.obj, false);
                    return;
                case 7:
                    this.f54072a.mo54444a();
                    return;
                case 9:
                    this.f54072a.mo54452b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C21491bx bxVar = this.f54072a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    bxVar.mo54456b(z);
                    return;
                case 11:
                    this.f54072a.mo54450a(message.obj);
                    return;
                case 12:
                    this.f54072a.mo54455b(message.obj);
                    return;
                default:
                    C21512ci.f54109a.post(new Runnable(this) {
                        public void run() {
                            StringBuilder k = C13555b.m33972k("Unknown handler message received: ");
                            k.append(message.what);
                            throw new AssertionError(k.toString());
                        }
                    });
                    return;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.bx$b */
    public static class C21494b extends HandlerThread {
        public C21494b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.veriff.sdk.internal.bx$c */
    public static class C21495c extends BroadcastReceiver {

        /* renamed from: a */
        private final C21491bx f54074a;

        public C21495c(C21491bx bxVar) {
            this.f54074a = bxVar;
        }

        /* renamed from: a */
        public void mo54464a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f54074a.f54070o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f54074a.f54058b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f54074a.mo54451a(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f54074a.mo54445a(((ConnectivityManager) C21537cs.m51497a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    public C21491bx(Context context, ExecutorService executorService, Handler handler, C21496by byVar, C21486bs bsVar, C21532cp cpVar) {
        C21494b bVar = new C21494b();
        bVar.start();
        C21537cs.m51504a(bVar.getLooper());
        this.f54058b = context;
        this.f54059c = executorService;
        this.f54065i = new C21492a(bVar.getLooper(), this);
        this.f54060d = byVar;
        this.f54066j = handler;
        this.f54067k = bsVar;
        this.f54068l = cpVar;
        this.f54069m = new ArrayList(4);
        this.f54071p = C21537cs.m51511c(context);
        this.f54070o = C21537cs.m51510b(context, "android.permission.ACCESS_NETWORK_STATE");
        new C21495c(this).mo54464a();
    }

    /* renamed from: f */
    private void m51362f(C21479br brVar) {
        C21476bp i = brVar.mo54420i();
        if (i != null) {
            m51361e(i);
        }
        List<C21476bp> k = brVar.mo54422k();
        if (k != null) {
            int size = k.size();
            for (int i2 = 0; i2 < size; i2++) {
                m51361e(k.get(i2));
            }
        }
    }

    /* renamed from: g */
    private void m51363g(C21479br brVar) {
        if (!brVar.mo54414c()) {
            Bitmap bitmap = brVar.f54041m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f54069m.add(brVar);
            if (!this.f54065i.hasMessages(7)) {
                this.f54065i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: a */
    public void mo54446a(C21476bp bpVar) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(1, bpVar));
    }

    /* renamed from: b */
    public void mo54453b(C21476bp bpVar) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(2, bpVar));
    }

    /* renamed from: c */
    public void mo54458c(C21479br brVar) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(6, brVar));
    }

    /* renamed from: d */
    public void mo54459d(C21476bp bpVar) {
        String d = bpVar.mo54399d();
        C21479br brVar = this.f54061e.get(d);
        if (brVar != null) {
            brVar.mo54412b(bpVar);
            if (brVar.mo54413b()) {
                this.f54061e.remove(d);
                if (bpVar.mo54404i().f54119l) {
                    C21537cs.m51505a("Dispatcher", "canceled", bpVar.mo54397b().mo54512a());
                }
            }
        }
        if (this.f54064h.contains(bpVar.mo54406k())) {
            this.f54063g.remove(bpVar.mo54398c());
            if (bpVar.mo54404i().f54119l) {
                C21537cs.m51506a("Dispatcher", "canceled", bpVar.mo54397b().mo54512a(), "because paused request got canceled");
            }
        }
        C21476bp remove = this.f54062f.remove(bpVar.mo54398c());
        if (remove != null && remove.mo54404i().f54119l) {
            C21537cs.m51506a("Dispatcher", "canceled", remove.mo54397b().mo54512a(), "from replaying");
        }
    }

    /* renamed from: e */
    public void mo54461e(C21479br brVar) {
        if (C21506ce.m51405b(brVar.mo54418g())) {
            this.f54067k.mo54435a(brVar.mo54417f(), brVar.mo54416e());
        }
        this.f54061e.remove(brVar.mo54417f());
        m51363g(brVar);
        if (brVar.mo54421j().f54119l) {
            C21537cs.m51506a("Dispatcher", "batched", C21537cs.m51499a(brVar), "for completion");
        }
    }

    /* renamed from: a */
    public void mo54448a(C21479br brVar) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(4, brVar));
    }

    /* renamed from: b */
    public void mo54454b(C21479br brVar) {
        Handler handler = this.f54065i;
        handler.sendMessageDelayed(handler.obtainMessage(5, brVar), 500);
    }

    /* renamed from: c */
    public void mo54457c(C21476bp bpVar) {
        mo54447a(bpVar, true);
    }

    /* renamed from: a */
    public void mo54445a(NetworkInfo networkInfo) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* renamed from: b */
    public void mo54455b(Object obj) {
        if (this.f54064h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<C21476bp> it = this.f54063g.values().iterator();
            while (it.hasNext()) {
                C21476bp next = it.next();
                if (next.mo54406k().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f54066j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* renamed from: a */
    public void mo54451a(boolean z) {
        Handler handler = this.f54065i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* renamed from: a */
    public void mo54447a(C21476bp bpVar, boolean z) {
        if (this.f54064h.contains(bpVar.mo54406k())) {
            this.f54063g.put(bpVar.mo54398c(), bpVar);
            if (bpVar.mo54404i().f54119l) {
                C21537cs.m51506a("Dispatcher", "paused", bpVar.f54009b.mo54512a(), C16530d.m42015h(C13555b.m33972k("because tag '"), bpVar.mo54406k(), "' is paused"));
                return;
            }
            return;
        }
        C21479br brVar = this.f54061e.get(bpVar.mo54399d());
        if (brVar != null) {
            brVar.mo54410a(bpVar);
        } else if (!this.f54059c.isShutdown()) {
            C21479br a = C21479br.m51321a(bpVar.mo54404i(), this, this.f54067k, this.f54068l, bpVar);
            a.f54042n = this.f54059c.submit(a);
            this.f54061e.put(bpVar.mo54399d(), a);
            if (z) {
                this.f54062f.remove(bpVar.mo54398c());
            }
            if (bpVar.mo54404i().f54119l) {
                C21537cs.m51505a("Dispatcher", "enqueued", bpVar.f54009b.mo54512a());
            }
        } else if (bpVar.mo54404i().f54119l) {
            C21537cs.m51506a("Dispatcher", "ignored", bpVar.f54009b.mo54512a(), "because shut down");
        }
    }

    /* renamed from: e */
    private void m51361e(C21476bp bpVar) {
        Object c = bpVar.mo54398c();
        if (c != null) {
            bpVar.f54018k = true;
            this.f54062f.put(c, bpVar);
        }
    }

    /* renamed from: b */
    public void mo54456b(boolean z) {
        this.f54071p = z;
    }

    /* renamed from: b */
    public void mo54452b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f54059c;
        if (executorService instanceof C21523ck) {
            ((C21523ck) executorService).mo54508a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m51360b();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public void mo54460d(C21479br brVar) {
        if (!brVar.mo54414c()) {
            boolean z = false;
            if (this.f54059c.isShutdown()) {
                mo54449a(brVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f54070o) {
                networkInfo = ((ConnectivityManager) C21537cs.m51497a(this.f54058b, "connectivity")).getActiveNetworkInfo();
            }
            if (brVar.mo54411a(this.f54071p, networkInfo)) {
                if (brVar.mo54421j().f54119l) {
                    C21537cs.m51505a("Dispatcher", "retrying", C21537cs.m51499a(brVar));
                }
                if (brVar.mo54423l() instanceof C21508cg.C21509a) {
                    brVar.f54037i |= C21507cf.NO_CACHE.f54103d;
                }
                brVar.f54042n = this.f54059c.submit(brVar);
                return;
            }
            if (this.f54070o && brVar.mo54415d()) {
                z = true;
            }
            mo54449a(brVar, z);
            if (z) {
                m51362f(brVar);
            }
        }
    }

    /* renamed from: b */
    private void m51360b() {
        if (!this.f54062f.isEmpty()) {
            Iterator<C21476bp> it = this.f54062f.values().iterator();
            while (it.hasNext()) {
                C21476bp next = it.next();
                it.remove();
                if (next.mo54404i().f54119l) {
                    C21537cs.m51505a("Dispatcher", "replaying", next.mo54397b().mo54512a());
                }
                mo54447a(next, false);
            }
        }
    }

    /* renamed from: a */
    public void mo54450a(Object obj) {
        if (this.f54064h.add(obj)) {
            Iterator<C21479br> it = this.f54061e.values().iterator();
            while (it.hasNext()) {
                C21479br next = it.next();
                boolean z = next.mo54421j().f54119l;
                C21476bp i = next.mo54420i();
                List<C21476bp> k = next.mo54422k();
                boolean z2 = k != null && !k.isEmpty();
                if (i != null || z2) {
                    if (i != null && i.mo54406k().equals(obj)) {
                        next.mo54412b(i);
                        this.f54063g.put(i.mo54398c(), i);
                        if (z) {
                            C21537cs.m51506a("Dispatcher", "paused", i.f54009b.mo54512a(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = k.size() - 1; size >= 0; size--) {
                            C21476bp bpVar = k.get(size);
                            if (bpVar.mo54406k().equals(obj)) {
                                next.mo54412b(bpVar);
                                this.f54063g.put(bpVar.mo54398c(), bpVar);
                                if (z) {
                                    C21537cs.m51506a("Dispatcher", "paused", bpVar.f54009b.mo54512a(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo54413b()) {
                        it.remove();
                        if (z) {
                            C21537cs.m51506a("Dispatcher", "canceled", C21537cs.m51499a(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo54444a() {
        ArrayList arrayList = new ArrayList(this.f54069m);
        this.f54069m.clear();
        Handler handler = this.f54066j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m51359a((List<C21479br>) arrayList);
    }

    /* renamed from: a */
    public void mo54449a(C21479br brVar, boolean z) {
        if (brVar.mo54421j().f54119l) {
            String a = C21537cs.m51499a(brVar);
            StringBuilder k = C13555b.m33972k("for error");
            k.append(z ? " (will replay)" : "");
            C21537cs.m51506a("Dispatcher", "batched", a, k.toString());
        }
        this.f54061e.remove(brVar.mo54417f());
        m51363g(brVar);
    }

    /* renamed from: a */
    private void m51359a(List<C21479br> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo54421j().f54119l) {
            StringBuilder sb = new StringBuilder();
            for (C21479br next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C21537cs.m51499a(next));
            }
            C21537cs.m51505a("Dispatcher", "delivered", sb.toString());
        }
    }
}
