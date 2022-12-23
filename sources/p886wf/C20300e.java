package p886wf;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.google.firebase.remoteconfig.internal.C14537b;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p028ba.C1512f;

/* renamed from: wf.e */
public final /* synthetic */ class C20300e implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C14535a f51474b;

    /* renamed from: c */
    public final /* synthetic */ long f51475c;

    public /* synthetic */ C20300e(C14535a aVar, long j) {
        this.f51474b = aVar;
        this.f51475c = j;
    }

    public final Object then(Task task) {
        Task<TContinuationResult> task2;
        boolean z;
        C14535a aVar = this.f51474b;
        long j = this.f51475c;
        aVar.getClass();
        Date date = new Date(aVar.f36689d.currentTimeMillis());
        Date date2 = null;
        if (task.isSuccessful()) {
            C14537b bVar = aVar.f36693h;
            bVar.getClass();
            Date date3 = new Date(bVar.f36700a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(C14537b.f36698d)) {
                z = false;
            } else {
                z = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date3.getTime()));
            }
            if (z) {
                return Tasks.forResult(new C14535a.C14536a(2, (C20299d) null, (String) null));
            }
        }
        Date date4 = aVar.f36693h.mo43595a().f36704b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            task2 = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))}), date2.getTime()));
        } else {
            Task<String> id = aVar.f36686a.getId();
            Task token = aVar.f36686a.getToken();
            task2 = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(aVar.f36688c, new C20301f(aVar, id, token, date));
        }
        return task2.continueWithTask(aVar.f36688c, new C1512f(1, aVar, date));
    }
}
