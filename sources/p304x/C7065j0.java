package p304x;

import aa0.C7527d;
import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.C0475w0;
import androidx.camera.core.impl.C0578e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import com.facebook.internal.C2429s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.home.lines.search.C16002a;
import com.moovit.home.lines.search.C16004b;
import com.moovit.home.lines.search.C16007c;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import e90.C12618b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import mf0.C24362h;
import n10.C18508e;
import o00.C18676l;
import p009a8.C0098d0;
import p009a8.C0114n;
import p009a8.C0115o;
import p074e8.C4599b;
import p074e8.C4612g;
import p262t8.C6606a;
import p304x.C7045f0;
import p543hq.C17474b;
import p757qu.C19180c;
import p757qu.C19185h;
import p80.C12991b;
import p824tp.C19740r;
import p977zz.C20949l;
import p977zz.C20964s0;
import q80.C13016e;

/* renamed from: x.j0 */
public final /* synthetic */ class C7065j0 implements CallbackToFutureAdapter.C0674b, C4612g.C4613a, C20949l, C0475w0.C0476a, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f21966b;

    /* renamed from: c */
    public final /* synthetic */ Object f21967c;

    /* renamed from: d */
    public final /* synthetic */ Object f21968d;

    public /* synthetic */ C7065j0(int i, Object obj, Object obj2) {
        this.f21966b = i;
        this.f21967c = obj;
        this.f21968d = obj2;
    }

    /* renamed from: a */
    public final void mo23308a() {
        boolean z;
        boolean z2;
        Class<C0098d0> cls;
        C2429s sVar = (C2429s) this.f21967c;
        String str = (String) this.f21968d;
        C4599b bVar = C4599b.f15801a;
        Class<C4599b> cls2 = C4599b.class;
        if (!C6606a.m15601b(cls2)) {
            try {
                C24362h.m61211f(str, "$appId");
                z = false;
                if (sVar == null || !sVar.f8715h) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C0115o oVar = C0115o.f331a;
                C0098d0 d0Var = C0098d0.f291a;
                cls = C0098d0.class;
                if (!C6606a.m15601b(cls)) {
                    C0098d0.f291a.mo205d();
                    z = C0098d0.f297g.mo212a();
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls2, th);
                return;
            }
            if (z2 && z) {
                C4599b bVar2 = C4599b.f15801a;
                bVar2.getClass();
                if (!C6606a.m15601b(bVar2)) {
                    try {
                        if (!C4599b.f15808h) {
                            C4599b.f15808h = true;
                            C0115o.m212c().execute(new C7082o(str, 4));
                        }
                    } catch (Throwable th2) {
                        C6606a.m15600a(bVar2, th2);
                    }
                }
            }
        }
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        ((C7045f0.C7048c) this.f21967c).getClass();
        ((C0578e.C0579a) this.f21968d).mo2480b(new C7068k0(aVar));
        return "submitStillCapture";
    }

    public final boolean invoke(Object obj) {
        C19180c cVar = (C19180c) this.f21967c;
        int i = C19180c.f48766i;
        cVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_exit_station_explanation_confirm_clicked");
        cVar.mo22564R1(aVar.mo49933a());
        ((C19185h) obj).mo51610o2((LatLonE6) this.f21968d);
        return true;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C16004b bVar = (C16004b) this.f21967c;
        Context context = (Context) this.f21968d;
        bVar.getClass();
        if (menuItem.getItemId() != C19740r.action_delete) {
            return false;
        }
        C16002a aVar = bVar.f41661l;
        if (aVar != null) {
            C16007c.C16008a aVar2 = aVar.f41654b;
            if (!aVar2.f41683f.isEmpty()) {
                ArrayList<O> c = C13720d.m34273c(aVar2.f41683f, (C13722f) null, new C0114n(0));
                C18508e f = C18508e.m45375f(context);
                f.mo51499b();
                if (f.f48438c.mo40648f(c)) {
                    f.mo51498a();
                }
            }
        }
        return true;
    }

    public final Task then(Object obj) {
        String str;
        List<C18676l.C18678b<PurchaseStation>> list;
        switch (this.f21966b) {
            case 4:
                C13752e eVar = (C13752e) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return Tasks.call(MoovitExecutors.f37327IO, new C13016e(eVar, (C12991b) this.f21967c, (PurchaseStepResult) this.f21968d));
            default:
                C12618b bVar = (C12618b) this.f21967c;
                String str2 = (String) this.f21968d;
                C12618b.C12621c cVar = (C12618b.C12621c) obj;
                if (cVar != null) {
                    C7527d<PurchaseStation> dVar = bVar.f31184r;
                    if (!C20964s0.m49090h(str2)) {
                        str = str2.trim();
                    } else {
                        str = "";
                    }
                    if (!str.isEmpty()) {
                        synchronized (cVar.f31193b) {
                            try {
                                List<C18676l.C18678b<PurchaseStation>> list2 = (List) cVar.f31193b.get(str);
                                ArrayList arrayList = list2;
                                if (list2 == null) {
                                    dVar.mo23793a(str);
                                    ArrayList arrayList2 = new ArrayList(cVar.f31192a.size());
                                    for (C18676l.C18678b next : cVar.f31192a) {
                                        List list3 = (List) C13723g.m34283d(next, new ArrayList(next.size()), dVar);
                                        if (!list3.isEmpty()) {
                                            arrayList2.add(new C18676l.C18678b(next.f47556c, list3));
                                        }
                                    }
                                    cVar.f31193b.put(str, arrayList2);
                                    arrayList = arrayList2;
                                }
                                list = arrayList;
                            } finally {
                                while (true) {
                                    break;
                                }
                            }
                        }
                    } else {
                        list = cVar.f31192a;
                    }
                    return Tasks.forResult(list);
                }
                int i = C12618b.f31181w;
                bVar.getClass();
                return Tasks.forException(new ApplicationBugException("Unable to build sections state!"));
        }
    }
}
