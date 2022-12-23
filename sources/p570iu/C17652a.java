package p570iu;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import c00.C13717b;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import h20.C17296a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import n20.C18514d;
import p081f3.C4648b;
import p081f3.C4665k;
import p824tp.C19722a0;
import p824tp.C19728f;
import p977zz.C20932c0;
import p977zz.C20950l0;
import p988j$.util.DesugarTimeZone;
import q00.C19047a;

/* renamed from: iu.a */
public final class C17652a implements C18322a {

    /* renamed from: a */
    public static final C20950l0<Integer> f45374a = new C20950l0<>(-1, 3);

    /* renamed from: iu.a$a */
    public static class C17653a implements Callable<Void> {

        /* renamed from: b */
        public final C17296a f45375b;

        public C17653a(C17296a aVar) {
            this.f45375b = aVar;
        }

        public final Object call() throws Exception {
            this.f45375b.mo52626J();
            return null;
        }
    }

    /* renamed from: a */
    public final String mo50104a() {
        return "line_group_trips_fetcher";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        C4665k.C4666a b = C16530d.m42009b(this, 1, TimeUnit.DAYS, 12, TimeUnit.HOURS);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.UNMETERED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) {
        boolean z;
        Context context2 = context;
        if (Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(12) == 0) {
            return new ListenableWorker.C1379a.C1381b();
        }
        List<ServerId> list = (List) MoovitAppApplication.m37038x().f37321e.mo50695h("SYNCABLE_TRANSIT_LINE_GROUP_IDS", true);
        if (C13717b.m34258e(list)) {
            return new ListenableWorker.C1379a.C1382c();
        }
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        C20950l0<Integer> l0Var = f45374a;
        instance.add(5, ((Integer) l0Var.f52695a).intValue());
        for (int intValue = ((Integer) l0Var.f52695a).intValue(); intValue <= ((Integer) f45374a.f52696b).intValue(); intValue++) {
            arrayList.add(new Time(instance.getTimeInMillis()));
            instance.add(5, 1);
        }
        list.size();
        C7925b.m18015c(context2, ((Time) arrayList.get(0)).mo24631g());
        C7925b.m18015c(context2, ((Time) arrayList.get(arrayList.size() - 1)).mo24631g());
        C19722a0 a0Var = (C19722a0) MoovitAppApplication.m37038x().f37321e.mo50695h("USER_CONTEXT", true);
        if (a0Var == null) {
            return new ListenableWorker.C1379a.C1380a();
        }
        C19728f fVar = (C19728f) MoovitAppApplication.m37038x().f37321e.mo50695h("METRO_CONTEXT", true);
        if (fVar == null) {
            return new ListenableWorker.C1379a.C1380a();
        }
        C19047a aVar = (C19047a) MoovitAppApplication.m37038x().f37321e.mo50695h("CONFIGURATION", true);
        if (aVar == null) {
            return new ListenableWorker.C1379a.C1380a();
        }
        if (!C18514d.m45390d()) {
            return new ListenableWorker.C1379a.C1380a();
        }
        C13752e eVar = new C13752e(context2, a0Var, (AnalyticsFlowKey) null);
        ArrayList arrayList2 = new ArrayList(arrayList.size() * list.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Time time = (Time) it.next();
            for (ServerId aVar2 : list) {
                C17296a aVar3 = r8;
                C17296a aVar4 = new C17296a(eVar, fVar, aVar, aVar2, time, true);
                arrayList2.add(new C17653a(aVar3));
            }
        }
        arrayList2.size();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5, C20932c0.m49025a("LineDetailFetcherJob"));
        try {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Tasks.call(newFixedThreadPool, (C17653a) it2.next()));
            }
            Task<Void> whenAll = Tasks.whenAll((Collection<? extends Task<?>>) arrayList3);
            Tasks.await(whenAll);
            z = whenAll.isSuccessful();
            newFixedThreadPool.shutdown();
        } catch (Exception unused) {
            newFixedThreadPool.shutdown();
            z = false;
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
        if (z) {
            return new ListenableWorker.C1379a.C1382c();
        }
        return new ListenableWorker.C1379a.C1380a();
    }
}
