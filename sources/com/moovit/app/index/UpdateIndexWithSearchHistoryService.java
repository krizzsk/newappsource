package com.moovit.app.index;

import android.content.Context;
import android.content.Intent;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.internal.zzc;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppJobIntentService;
import com.moovit.app.search.locations.SearchLocationItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p066e0.C4454r0;
import p435de.C16596f;
import p638lr.C18267n;
import p735pt.C18981b;
import p735pt.C18985f;
import p735pt.C18991h;
import p878vv.C20236c;

public class UpdateIndexWithSearchHistoryService extends MoovitAppJobIntentService {

    /* renamed from: l */
    public static final /* synthetic */ int f38435l = 0;

    /* renamed from: h */
    public final void mo44581h(Intent intent) {
        ArrayList arrayList;
        Task<Void> c;
        C20236c f = C20236c.m47804f(this);
        f.mo51499b();
        List<T> e = f.f48438c.mo40647e();
        if (e == null || e.isEmpty()) {
            arrayList = null;
        } else {
            e.size();
            arrayList = new ArrayList();
            for (T g : e) {
                arrayList.add(SearchLocationItem.m39103g(g));
            }
        }
        if (!C13717b.m34258e(arrayList)) {
            arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            try {
                C13720d.m34276f(arrayList, (C13722f) null, new C18267n(3), arrayList2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            ArrayList arrayList3 = new ArrayList();
            try {
                C13720d.m34276f(arrayList, (C13722f) null, new C4454r0(2), arrayList3);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            Context applicationContext = getApplicationContext();
            boolean z = false;
            if (!C13717b.m34258e(arrayList2) && !C13717b.m34258e(arrayList3) && arrayList2.size() == arrayList3.size() && (c = C18985f.m46097c(applicationContext, arrayList2)) != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    zzc b = C18985f.m46096b((C18991h) it.next());
                    ExecutorService executorService = MoovitExecutors.f37327IO;
                    arrayList4.add(c.continueWithTask(executorService, new C18985f.C18988c(applicationContext, b)).continueWithTask(executorService, new C18985f.C18987b(applicationContext, b)));
                }
                try {
                    Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) arrayList4));
                    z = true;
                } catch (Exception unused) {
                }
            }
            if (z) {
                C18981b f2 = C18981b.m46094f(this);
                f2.mo51499b();
                f2.f48438c.mo40646d(arrayList2);
                f2.mo51500c();
                return;
            }
            C16596f.m42113a().mo49363b("Failed index search location history from upgrader");
        }
    }
}
