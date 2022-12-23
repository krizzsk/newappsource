package p105h3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.C1385a;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p081f3.C4656h;
import p092g3.C4753b;
import p092g3.C4757e;
import p092g3.C4763k;
import p143k3.C5464c;
import p143k3.C5465d;
import p192o3.C5956p;
import p205p3.C6044i;
import p218q3.C6166b;

/* renamed from: h3.c */
public final class C5046c implements C4757e, C5464c, C4753b {

    /* renamed from: b */
    public final Context f17033b;

    /* renamed from: c */
    public final C4763k f17034c;

    /* renamed from: d */
    public final C5465d f17035d;

    /* renamed from: e */
    public final HashSet f17036e = new HashSet();

    /* renamed from: f */
    public C5045b f17037f;

    /* renamed from: g */
    public boolean f17038g;

    /* renamed from: h */
    public final Object f17039h;

    /* renamed from: i */
    public Boolean f17040i;

    static {
        C4656h.m11961e("GreedyScheduler");
    }

    public C5046c(Context context, C1385a aVar, C6166b bVar, C4763k kVar) {
        this.f17033b = context;
        this.f17034c = kVar;
        this.f17035d = new C5465d(context, bVar, this);
        this.f17037f = new C5045b(this, aVar.f5147e);
        this.f17039h = new Object();
    }

    /* renamed from: a */
    public final void mo20270a(C5956p... pVarArr) {
        boolean z;
        if (this.f17040i == null) {
            this.f17040i = Boolean.valueOf(C6044i.m14530a(this.f17033b, this.f17034c.f16071b));
        }
        if (!this.f17040i.booleanValue()) {
            C4656h.m11960c().mo20178d(new Throwable[0]);
            return;
        }
        if (!this.f17038g) {
            this.f17034c.f16075f.mo20262a(this);
            this.f17038g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C5956p pVar : pVarArr) {
            long a = pVar.mo21934a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f19083b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C5045b bVar = this.f17037f;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f17032c.remove(pVar.f19082a);
                        if (runnable != null) {
                            ((Handler) bVar.f17031b.f16037a).removeCallbacks(runnable);
                        }
                        C5044a aVar = new C5044a(bVar, pVar);
                        bVar.f17032c.put(pVar.f19082a, aVar);
                        ((Handler) bVar.f17031b.f16037a).postDelayed(aVar, pVar.mo21934a() - System.currentTimeMillis());
                    }
                } else if (pVar.mo21935b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 23 || !pVar.f19091j.f15879c) {
                        if (i >= 24) {
                            if (pVar.f19091j.f15884h.f15892a.size() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C4656h c = C4656h.m11960c();
                                String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar});
                                c.mo20176a(new Throwable[0]);
                            }
                        }
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f19082a);
                    } else {
                        C4656h c2 = C4656h.m11960c();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar});
                        c2.mo20176a(new Throwable[0]);
                    }
                } else {
                    C4656h c3 = C4656h.m11960c();
                    String.format("Starting work for %s", new Object[]{pVar.f19082a});
                    c3.mo20176a(new Throwable[0]);
                    this.f17034c.mo20279k(pVar.f19082a, (WorkerParameters.C1384a) null);
                }
            }
        }
        synchronized (this.f17039h) {
            if (!hashSet.isEmpty()) {
                C4656h c4 = C4656h.m11960c();
                String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, hashSet2)});
                c4.mo20176a(new Throwable[0]);
                this.f17036e.addAll(hashSet);
                this.f17035d.mo21354b(this.f17036e);
            }
        }
    }

    /* renamed from: b */
    public final void mo20271b(String str) {
        Runnable runnable;
        if (this.f17040i == null) {
            this.f17040i = Boolean.valueOf(C6044i.m14530a(this.f17033b, this.f17034c.f16071b));
        }
        if (!this.f17040i.booleanValue()) {
            C4656h.m11960c().mo20178d(new Throwable[0]);
            return;
        }
        if (!this.f17038g) {
            this.f17034c.f16075f.mo20262a(this);
            this.f17038g = true;
        }
        C4656h c = C4656h.m11960c();
        String.format("Cancelling work ID %s", new Object[]{str});
        c.mo20176a(new Throwable[0]);
        C5045b bVar = this.f17037f;
        if (!(bVar == null || (runnable = (Runnable) bVar.f17032c.remove(str)) == null)) {
            ((Handler) bVar.f17031b.f16037a).removeCallbacks(runnable);
        }
        this.f17034c.mo20280l(str);
    }

    /* renamed from: c */
    public final void mo5714c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4656h c = C4656h.m11960c();
            String.format("Constraints not met: Cancelling work ID %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            this.f17034c.mo20280l(str);
        }
    }

    /* renamed from: d */
    public final boolean mo20272d() {
        return false;
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        synchronized (this.f17039h) {
            Iterator it = this.f17036e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5956p pVar = (C5956p) it.next();
                if (pVar.f19082a.equals(str)) {
                    C4656h c = C4656h.m11960c();
                    String.format("Stopping tracking for %s", new Object[]{str});
                    c.mo20176a(new Throwable[0]);
                    this.f17036e.remove(pVar);
                    this.f17035d.mo21354b(this.f17036e);
                    break;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo5716f(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4656h c = C4656h.m11960c();
            String.format("Constraints met: Scheduling work ID %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            this.f17034c.mo20279k(str, (WorkerParameters.C1384a) null);
        }
    }
}
