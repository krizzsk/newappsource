package ce0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24361g;

/* renamed from: ce0.n */
public final class C21110n {

    /* renamed from: i */
    public static C21110n f52956i;

    /* renamed from: a */
    public final Context f52957a;

    /* renamed from: b */
    public final ConnectivityManager f52958b;

    /* renamed from: c */
    public final AtomicInteger f52959c;

    /* renamed from: d */
    public C21108l f52960d;

    /* renamed from: e */
    public final CopyOnWriteArraySet f52961e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f52962f;

    /* renamed from: g */
    public final Handler f52963g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public C21111a f52964h = new C21111a();

    /* renamed from: ce0.n$a */
    public class C21111a implements Runnable {
        public C21111a() {
        }

        public final void run() {
            if (!C21110n.this.f52961e.isEmpty()) {
                C21110n.this.mo53310a();
                C21110n nVar = C21110n.this;
                nVar.f52963g.postDelayed(nVar.f52964h, 30000);
            }
        }
    }

    /* renamed from: ce0.n$b */
    public interface C21112b {
        /* renamed from: a */
        void mo53313a();
    }

    public C21110n(Context context) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f52959c = atomicInteger;
        Context applicationContext = context.getApplicationContext();
        this.f52957a = applicationContext;
        this.f52958b = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        atomicInteger.set(mo53310a());
    }

    /* renamed from: b */
    public static synchronized C21110n m49402b(Context context) {
        C21110n nVar;
        synchronized (C21110n.class) {
            if (f52956i == null) {
                f52956i = new C21110n(context);
            }
            nVar = f52956i;
        }
        return nVar;
    }

    /* renamed from: a */
    public final int mo53310a() {
        int i = -1;
        if (this.f52958b == null || C24361g.m61183r(this.f52957a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            this.f52959c.set(-1);
            return -1;
        }
        NetworkInfo activeNetworkInfo = this.f52958b.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            i = activeNetworkInfo.getType();
        }
        if (i != this.f52959c.getAndSet(i)) {
            this.f52963g.post(new C21109m(this, i));
        }
        mo53311c(!this.f52961e.isEmpty());
        return i;
    }

    @SuppressLint({"newApi"})
    /* renamed from: c */
    public final synchronized void mo53311c(boolean z) {
        if (this.f52962f != z) {
            this.f52962f = z;
            ConnectivityManager connectivityManager = this.f52958b;
            if (connectivityManager != null) {
                if (z) {
                    try {
                        NetworkRequest.Builder builder = new NetworkRequest.Builder();
                        builder.addCapability(12);
                        ConnectivityManager connectivityManager2 = this.f52958b;
                        NetworkRequest build = builder.build();
                        C21108l lVar = this.f52960d;
                        if (lVar == null) {
                            lVar = new C21108l(this);
                            this.f52960d = lVar;
                        }
                        connectivityManager2.registerNetworkCallback(build, lVar);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                } else {
                    C21108l lVar2 = this.f52960d;
                    if (lVar2 == null) {
                        lVar2 = new C21108l(this);
                        this.f52960d = lVar2;
                    }
                    connectivityManager.unregisterNetworkCallback(lVar2);
                }
            }
        } else {
            return;
        }
        return;
    }
}
