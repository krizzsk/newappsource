package p431cy;

import android.content.Context;
import android.graphics.Paint;
import ce0.C21100e;
import com.android.billingclient.api.C1954j;
import com.android.billingclient.api.C1967w;
import com.facebook.internal.C2435w;
import com.google.android.gms.internal.play_billing.zza;
import com.moovit.MoovitActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ib0.C12770a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import p009a8.C0110j;
import p009a8.C0115o;
import p471eq.C16851b;
import p519gq.C17215c;
import p776rp.C19309b;

/* renamed from: cy.b */
public class C16525b {

    /* renamed from: c */
    public static volatile C16525b f43142c;

    /* renamed from: a */
    public Object f43143a;

    /* renamed from: b */
    public Object f43144b;

    public /* synthetic */ C16525b(Context context, C1954j jVar) {
        this.f43143a = context;
        this.f43144b = new C1967w(this, jVar);
    }

    /* renamed from: a */
    public final void mo49314a(long j) {
        this.f43144b = new C17215c((MoovitActivity) this.f43143a, (C16851b) this.f43144b, j);
    }

    /* renamed from: b */
    public final void mo49315b() {
        C1967w wVar = (C1967w) this.f43144b;
        Context context = (Context) this.f43143a;
        if (wVar.f6809b) {
            context.unregisterReceiver((C1967w) wVar.f6810c.f43144b);
            wVar.f6809b = false;
            return;
        }
        zza.zzk("BillingBroadcastManager", "Receiver is not registered.");
    }

    public /* synthetic */ C16525b(Paint paint, C12770a aVar) {
        this.f43143a = paint;
        this.f43144b = aVar;
    }

    public /* synthetic */ C16525b() {
    }

    public /* synthetic */ C16525b(Object obj) {
        this.f43143a = obj;
        this.f43144b = Thread.currentThread();
    }

    public C16525b(Vector vector) {
        this.f43143a = new HashMap();
        this.f43144b = new HashMap();
        for (int i = 0; i < vector.size(); i++) {
            C19309b bVar = (C19309b) vector.get(i);
            ((HashMap) this.f43143a).put(new Integer(bVar.f49152a), bVar);
            ((HashMap) this.f43144b).put(new Integer(bVar.f49153b), bVar);
        }
    }

    public /* synthetic */ C16525b(C0110j jVar) {
        this.f43144b = new CountDownLatch(1);
        C0115o.m212c().execute(new FutureTask(new C2435w(0, this, jVar)));
    }

    public /* synthetic */ C16525b(MoovitActivity moovitActivity, C16851b bVar) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f43143a = moovitActivity;
        C21100e.m49373x(bVar, "condition");
        this.f43144b = bVar;
    }

    public /* synthetic */ C16525b(Context context) {
        this.f43144b = new ArrayList();
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f43143a = context.getApplicationContext();
    }
}
