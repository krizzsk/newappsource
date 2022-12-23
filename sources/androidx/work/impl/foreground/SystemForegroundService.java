package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1410a;
import java.util.UUID;
import p081f3.C4656h;
import p092g3.C4755d;
import p092g3.C4763k;
import p179n3.C5843b;
import p205p3.C6036a;
import p218q3.C6166b;

public class SystemForegroundService extends LifecycleService implements C1410a.C1411a {

    /* renamed from: c */
    public Handler f5217c;

    /* renamed from: d */
    public boolean f5218d;

    /* renamed from: e */
    public C1410a f5219e;

    /* renamed from: f */
    public NotificationManager f5220f;

    static {
        C4656h.m11961e("SystemFgService");
    }

    /* renamed from: a */
    public final void mo5731a() {
        this.f5217c = new Handler(Looper.getMainLooper());
        this.f5220f = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1410a aVar = new C1410a(getApplicationContext());
        this.f5219e = aVar;
        if (aVar.f5231k != null) {
            C4656h.m11960c().mo20177b(new Throwable[0]);
        } else {
            aVar.f5231k = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        mo5731a();
    }

    public final void onDestroy() {
        super.onDestroy();
        C1410a aVar = this.f5219e;
        aVar.f5231k = null;
        synchronized (aVar.f5225e) {
            aVar.f5230j.mo21355c();
        }
        C4755d dVar = aVar.f5223c.f16075f;
        synchronized (dVar.f16051l) {
            dVar.f16050k.remove(aVar);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5218d) {
            C4656h.m11960c().mo20178d(new Throwable[0]);
            C1410a aVar = this.f5219e;
            aVar.f5231k = null;
            synchronized (aVar.f5225e) {
                aVar.f5230j.mo21355c();
            }
            C4755d dVar = aVar.f5223c.f16075f;
            synchronized (dVar.f16051l) {
                dVar.f16050k.remove(aVar);
            }
            mo5731a();
            this.f5218d = false;
        }
        if (intent == null) {
            return 3;
        }
        C1410a aVar2 = this.f5219e;
        aVar2.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C4656h c = C4656h.m11960c();
            int i3 = C1410a.f5221l;
            String.format("Started foreground service %s", new Object[]{intent});
            c.mo20178d(new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = aVar2.f5223c.f16072c;
            ((C6166b) aVar2.f5224d).mo22153a(new C5843b(aVar2, workDatabase, stringExtra));
            aVar2.mo5732d(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            aVar2.mo5732d(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            C4656h c2 = C4656h.m11960c();
            int i4 = C1410a.f5221l;
            String.format("Stopping foreground work for %s", new Object[]{intent});
            c2.mo20178d(new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            C4763k kVar = aVar2.f5223c;
            UUID fromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            ((C6166b) kVar.f16073d).mo22153a(new C6036a(kVar, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            C4656h c3 = C4656h.m11960c();
            int i5 = C1410a.f5221l;
            c3.mo20178d(new Throwable[0]);
            C1410a.C1411a aVar3 = aVar2.f5231k;
            if (aVar3 == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) aVar3;
            systemForegroundService.f5218d = true;
            C4656h.m11960c().mo20176a(new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
