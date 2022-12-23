package y60;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.wallet.WalletTab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p130j2.C5367a;
import w40.C25760c;

/* renamed from: y60.e */
public final class C20709e {

    /* renamed from: g */
    public static volatile C20709e f52293g;

    /* renamed from: a */
    public final Application f52294a;

    /* renamed from: b */
    public final C20706b f52295b;

    /* renamed from: c */
    public final ArrayList f52296c;

    /* renamed from: d */
    public final SparseArray<C20710f<?>> f52297d;

    /* renamed from: e */
    public final EnumMap f52298e = new EnumMap(WalletTab.class);

    /* renamed from: f */
    public final SparseArray<List<C20705a>> f52299f = new SparseArray<>();

    public C20709e(Application application, C20706b bVar) {
        ArrayList arrayList = new ArrayList(WalletTab.values().length);
        this.f52296c = arrayList;
        SparseArray<C20710f<?>> sparseArray = new SparseArray<>();
        this.f52297d = sparseArray;
        C21100e.m49373x(application, "application");
        this.f52294a = application;
        this.f52295b = bVar;
        Iterator<C20710f<?>> it = bVar.f52291a.iterator();
        if (it.hasNext()) {
            C20710f next = it.next();
            C21100e.m49369v(1);
            next.getClass();
            sparseArray.append(0, next);
            if (!arrayList.contains((Object) null)) {
                arrayList.add((Object) null);
            }
            new C20708d(this);
            throw null;
        }
    }

    /* renamed from: a */
    public static C20709e m48682a() {
        C20709e eVar = f52293g;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: c */
    public static synchronized void m48683c(Application application, C20706b bVar) {
        synchronized (C20709e.class) {
            if (f52293g == null) {
                if (bVar == null) {
                    bVar = new C20706b(Collections.emptyList());
                }
                f52293g = new C20709e(application, bVar);
            }
        }
    }

    /* renamed from: d */
    public static void m48684d(Context context, BroadcastReceiver broadcastReceiver, WalletTab... walletTabArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (WalletTab name : walletTabArr) {
            StringBuilder k = C13555b.m33972k("com.moovit.payment.wallet.updated.");
            k.append(name.name());
            intentFilter.addAction(k.toString());
        }
        C5367a.m13473a(context).mo21146b(broadcastReceiver, intentFilter);
    }

    /* renamed from: b */
    public final Task<List<C20705a>> mo52853b(WalletTab walletTab, boolean z) {
        C21100e.m49369v(1);
        List list = (List) this.f52298e.get(walletTab);
        if (!z && list != null) {
            return Tasks.forResult(list);
        }
        int size = this.f52297d.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f52297d.get(this.f52297d.keyAt(i)).getClass();
            if (walletTab == null) {
                C21100e.m49369v(1);
                List list2 = this.f52299f.get(0);
                if (z || list2 == null) {
                    throw null;
                }
                arrayList.add(Tasks.forResult(list2));
            }
        }
        return Tasks.whenAllSuccess((Collection<? extends Task>) arrayList).onSuccessTask(MoovitExecutors.COMPUTATION, new C25760c(3, this, walletTab));
    }
}
