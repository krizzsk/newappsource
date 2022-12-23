package p886wf;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.C14535a;
import java.util.Date;
import p102h0.C5021e;
import p358af.C13440g;

/* renamed from: wf.f */
public final /* synthetic */ class C20301f implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C14535a f51476b;

    /* renamed from: c */
    public final /* synthetic */ Task f51477c;

    /* renamed from: d */
    public final /* synthetic */ Task f51478d;

    /* renamed from: e */
    public final /* synthetic */ Date f51479e;

    public /* synthetic */ C20301f(C14535a aVar, Task task, Task task2, Date date) {
        this.f51476b = aVar;
        this.f51477c = task;
        this.f51478d = task2;
        this.f51479e = date;
    }

    public final Object then(Task task) {
        C14535a aVar = this.f51476b;
        Task task2 = this.f51477c;
        Task task3 = this.f51478d;
        Date date = this.f51479e;
        aVar.getClass();
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            C14535a.C14536a a = aVar.mo43593a((String) task2.getResult(), ((C13440g) task3.getResult()).mo40308a(), date);
            if (a.f36695a != 0) {
                return Tasks.forResult(a);
            }
            C20297c cVar = aVar.f36691f;
            C20299d dVar = a.f36696b;
            return Tasks.call(cVar.f51464a, new C20295a(0, cVar, dVar)).onSuccessTask(cVar.f51464a, new C20296b(cVar, dVar)).onSuccessTask(aVar.f36688c, new C5021e(a, 4));
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }
}
