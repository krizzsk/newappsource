package p484ff;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ff.c0 */
public final class C16962c0 implements Runnable {

    /* renamed from: b */
    public final long f44028b;

    /* renamed from: c */
    public final PowerManager.WakeLock f44029c;

    /* renamed from: d */
    public final FirebaseMessaging f44030d;

    @VisibleForTesting
    /* renamed from: ff.c0$a */
    public static class C16963a extends BroadcastReceiver {

        /* renamed from: a */
        public C16962c0 f44031a;

        public C16963a(C16962c0 c0Var) {
            this.f44031a = c0Var;
        }

        public final void onReceive(Context context, Intent intent) {
            C16962c0 c0Var = this.f44031a;
            if (c0Var != null && c0Var.mo49584b()) {
                C16962c0 c0Var2 = this.f44031a;
                c0Var2.f44030d.enqueueTaskWithDelaySeconds(c0Var2, 0);
                this.f44031a.mo49583a().unregisterReceiver(this);
                this.f44031a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public C16962c0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f44030d = firebaseMessaging;
        this.f44028b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo49583a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f44029c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final Context mo49583a() {
        return this.f44030d.getApplicationContext();
    }

    /* renamed from: b */
    public final boolean mo49584b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo49583a().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final boolean mo49585c() throws IOException {
        boolean z = true;
        try {
            if (this.f44030d.blockingGetToken() == null) {
                return false;
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                e.getMessage();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        if (C16958a0.m42795a().mo49582c(mo49583a())) {
            this.f44029c.acquire();
        }
        try {
            this.f44030d.setSyncScheduledOrRunning(true);
            if (!this.f44030d.isGmsCorePresent()) {
                this.f44030d.setSyncScheduledOrRunning(false);
                if (C16958a0.m42795a().mo49582c(mo49583a())) {
                    this.f44029c.release();
                }
            } else if (!C16958a0.m42795a().mo49581b(mo49583a()) || mo49584b()) {
                if (mo49585c()) {
                    this.f44030d.setSyncScheduledOrRunning(false);
                } else {
                    this.f44030d.syncWithDelaySecondsInternal(this.f44028b);
                }
                if (!C16958a0.m42795a().mo49582c(mo49583a())) {
                    return;
                }
                this.f44029c.release();
            } else {
                C16963a aVar = new C16963a(this);
                aVar.f44031a.mo49583a().registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (C16958a0.m42795a().mo49582c(mo49583a())) {
                    this.f44029c.release();
                }
            }
        } catch (IOException e) {
            e.getMessage();
            this.f44030d.setSyncScheduledOrRunning(false);
            if (!C16958a0.m42795a().mo49582c(mo49583a())) {
            }
        } catch (Throwable th) {
            if (C16958a0.m42795a().mo49582c(mo49583a())) {
                this.f44029c.release();
            }
            throw th;
        }
    }
}
