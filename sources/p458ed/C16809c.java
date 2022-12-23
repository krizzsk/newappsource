package p458ed;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.C0262r;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ed.c */
public abstract class C16809c {

    /* renamed from: a */
    public final C0262r f43762a;

    /* renamed from: b */
    public final IntentFilter f43763b;

    /* renamed from: c */
    public final Context f43764c;

    /* renamed from: d */
    public final HashSet f43765d = new HashSet();

    /* renamed from: e */
    public C16808b f43766e = null;

    /* renamed from: f */
    public volatile boolean f43767f = false;

    public C16809c(C0262r rVar, IntentFilter intentFilter, Context context) {
        this.f43762a = rVar;
        this.f43763b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f43764c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public abstract void mo42763a(Context context, Intent intent);

    /* renamed from: b */
    public final void mo49481b() {
        C16808b bVar;
        if ((this.f43767f || !this.f43765d.isEmpty()) && this.f43766e == null) {
            C16808b bVar2 = new C16808b(this);
            this.f43766e = bVar2;
            this.f43764c.registerReceiver(bVar2, this.f43763b);
        }
        if (!this.f43767f && this.f43765d.isEmpty() && (bVar = this.f43766e) != null) {
            this.f43764c.unregisterReceiver(bVar);
            this.f43766e = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo49482c(Object obj) {
        Iterator it = new HashSet(this.f43765d).iterator();
        while (it.hasNext()) {
            ((C16807a) it.next()).mo49479a(obj);
        }
    }
}
