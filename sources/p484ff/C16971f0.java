package p484ff;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: ff.f0 */
public final /* synthetic */ class C16971f0 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ Context f44045b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledExecutorService f44046c;

    /* renamed from: d */
    public final /* synthetic */ FirebaseMessaging f44047d;

    /* renamed from: e */
    public final /* synthetic */ C16990s f44048e;

    /* renamed from: f */
    public final /* synthetic */ C16987p f44049f;

    public /* synthetic */ C16971f0(Context context, FirebaseMessaging firebaseMessaging, C16987p pVar, C16990s sVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f44045b = context;
        this.f44046c = scheduledThreadPoolExecutor;
        this.f44047d = firebaseMessaging;
        this.f44048e = sVar;
        this.f44049f = pVar;
    }

    public final Object call() {
        C16969e0 e0Var;
        Context context = this.f44045b;
        ScheduledExecutorService scheduledExecutorService = this.f44046c;
        FirebaseMessaging firebaseMessaging = this.f44047d;
        C16990s sVar = this.f44048e;
        C16987p pVar = this.f44049f;
        synchronized (C16969e0.class) {
            WeakReference<C16969e0> weakReference = C16969e0.f44041c;
            if (weakReference != null) {
                e0Var = weakReference.get();
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                C16969e0 e0Var2 = new C16969e0(sharedPreferences, scheduledExecutorService);
                synchronized (e0Var2) {
                    e0Var2.f44042a = C16960b0.m42798a(sharedPreferences, scheduledExecutorService);
                }
                C16969e0.f44041c = new WeakReference<>(e0Var2);
                e0Var = e0Var2;
            }
        }
        return new C16973g0(firebaseMessaging, sVar, e0Var, pVar, context, scheduledExecutorService);
    }
}
