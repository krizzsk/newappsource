package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p081f3.C4652d;
import p081f3.C4656h;
import p092g3.C4753b;
import p092g3.C4763k;
import p143k3.C5464c;
import p143k3.C5465d;
import p179n3.C5844c;
import p179n3.C5845d;
import p179n3.C5846e;
import p192o3.C5956p;
import p205p3.C6048l;
import p218q3.C6165a;
import p218q3.C6166b;

/* renamed from: androidx.work.impl.foreground.a */
public final class C1410a implements C5464c, C4753b {

    /* renamed from: l */
    public static final /* synthetic */ int f5221l = 0;

    /* renamed from: b */
    public Context f5222b;

    /* renamed from: c */
    public C4763k f5223c;

    /* renamed from: d */
    public final C6165a f5224d;

    /* renamed from: e */
    public final Object f5225e = new Object();

    /* renamed from: f */
    public String f5226f;

    /* renamed from: g */
    public final LinkedHashMap f5227g;

    /* renamed from: h */
    public final HashMap f5228h;

    /* renamed from: i */
    public final HashSet f5229i;

    /* renamed from: j */
    public final C5465d f5230j;

    /* renamed from: k */
    public C1411a f5231k;

    /* renamed from: androidx.work.impl.foreground.a$a */
    public interface C1411a {
    }

    static {
        C4656h.m11961e("SystemFgDispatcher");
    }

    public C1410a(Context context) {
        this.f5222b = context;
        C4763k g = C4763k.m12079g(context);
        this.f5223c = g;
        C6165a aVar = g.f16073d;
        this.f5224d = aVar;
        this.f5226f = null;
        this.f5227g = new LinkedHashMap();
        this.f5229i = new HashSet();
        this.f5228h = new HashMap();
        this.f5230j = new C5465d(this.f5222b, aVar, this);
        this.f5223c.f16075f.mo20262a(this);
    }

    /* renamed from: a */
    public static Intent m3772a(Context context, String str, C4652d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f15895a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f15896b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f15897c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m3773b(Context context, String str, C4652d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f15895a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f15896b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f15897c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public final void mo5714c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C4656h c = C4656h.m11960c();
                String.format("Constraints unmet for WorkSpec %s", new Object[]{str});
                c.mo20176a(new Throwable[0]);
                C4763k kVar = this.f5223c;
                ((C6166b) kVar.f16073d).mo22153a(new C6048l(kVar, str, true));
            }
        }
    }

    /* renamed from: d */
    public final void mo5732d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C4656h c = C4656h.m11960c();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)});
        c.mo20176a(new Throwable[0]);
        if (notification != null && this.f5231k != null) {
            this.f5227g.put(stringExtra, new C4652d(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty(this.f5226f)) {
                this.f5226f = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f5231k;
                systemForegroundService.f5217c.post(new C5844c(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f5231k;
            systemForegroundService2.f5217c.post(new C5845d(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f5227g.entrySet()) {
                    i |= ((C4652d) value.getValue()).f15896b;
                }
                C4652d dVar = (C4652d) this.f5227g.get(this.f5226f);
                if (dVar != null) {
                    C1411a aVar = this.f5231k;
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar;
                    systemForegroundService3.f5217c.post(new C5844c(systemForegroundService3, dVar.f15895a, dVar.f15897c, i));
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.f5225e) {
            try {
                C5956p pVar = (C5956p) this.f5228h.remove(str);
                if (pVar != null) {
                    z2 = this.f5229i.remove(pVar);
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.f5230j.mo21354b(this.f5229i);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C4652d dVar = (C4652d) this.f5227g.remove(str);
        if (str.equals(this.f5226f) && this.f5227g.size() > 0) {
            Iterator it = this.f5227g.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f5226f = (String) entry.getKey();
            if (this.f5231k != null) {
                C4652d dVar2 = (C4652d) entry.getValue();
                C1411a aVar = this.f5231k;
                int i = dVar2.f15895a;
                int i2 = dVar2.f15896b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                systemForegroundService.f5217c.post(new C5844c(systemForegroundService, i, dVar2.f15897c, i2));
                C1411a aVar2 = this.f5231k;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar2;
                systemForegroundService2.f5217c.post(new C5846e(systemForegroundService2, dVar2.f15895a));
            }
        }
        C1411a aVar3 = this.f5231k;
        if (dVar != null && aVar3 != null) {
            C4656h c = C4656h.m11960c();
            String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(dVar.f15895a), str, Integer.valueOf(dVar.f15896b)});
            c.mo20176a(new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar3;
            systemForegroundService3.f5217c.post(new C5846e(systemForegroundService3, dVar.f15895a));
        }
    }

    /* renamed from: f */
    public final void mo5716f(List<String> list) {
    }
}
