package p946ys;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1043v;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.C2341k;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection;
import com.zendesk.service.ZendeskException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0112l;
import p102h0.C5021e;
import p115i0.C5227c;
import p241s0.C6302b;
import p693nz.C18659h;
import p874vr.C20199a;
import p970zs.C20887a;
import p970zs.C20889c;
import p977zz.C20961r;
import p977zz.C20963s;
import q00.C19047a;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpRequest;
import zendesk.support.ProviderStore;
import zendesk.support.SimpleArticle;
import zendesk.support.SuggestedArticleSearch;

/* renamed from: ys.e */
public final class C20764e extends C0989a {

    /* renamed from: c */
    public final C1043v<C20961r<List<HelpCenterSimpleSection>>> f52394c = new C1043v<>();

    /* renamed from: d */
    public final C6302b f52395d = new C6302b();

    /* renamed from: e */
    public final C6302b f52396e = new C6302b();

    /* renamed from: f */
    public final AtomicReference<UUID> f52397f = new AtomicReference<>();

    /* renamed from: g */
    public final C18659h<String, C20765a> f52398g = new C18659h<>(100);

    /* renamed from: h */
    public C1043v<C20765a> f52399h;

    public C20764e(Application application) {
        super(application);
    }

    /* renamed from: a */
    public final void mo52900a(Long l, String str) {
        Task task;
        C1043v<C20765a> vVar = this.f52399h;
        if (vVar != null) {
            UUID randomUUID = UUID.randomUUID();
            this.f52397f.set(randomUUID);
            String str2 = str + "_" + l;
            C20765a aVar = this.f52398g.get(str2);
            if (aVar != null) {
                vVar.postValue(aVar);
                return;
            }
            ProviderStore b = C20889c.m48881b(this.f3907b);
            if (b == null) {
                task = Tasks.forException(new ZendeskException());
            } else {
                HelpCenterProvider helpCenterProvider = b.helpCenterProvider();
                SuggestedArticleSearch build = new SuggestedArticleSearch.Builder().withQuery(str).withSectionId(l).withLabelNames(ServerParameters.ANDROID_SDK_INT).build();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                helpCenterProvider.getSuggestedArticles(build, new C20889c.C20890a(taskCompletionSource));
                task = taskCompletionSource.getTask().onSuccessTask(MoovitExecutors.COMPUTATION, new C0112l(12));
            }
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            task.continueWith(executorService, new C5021e(str, 2)).addOnSuccessListener((Executor) executorService, new C20762c(this, randomUUID, str2, (C1043v) vVar));
        }
    }

    /* renamed from: b */
    public final void mo52901b(long j) {
        Task task;
        C1043v vVar = (C1043v) this.f52396e.getOrDefault(Long.valueOf(j), null);
        if (vVar != null) {
            ProviderStore b = C20889c.m48881b(this.f3907b);
            if (b == null) {
                task = Tasks.forException(new ZendeskException());
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                b.helpCenterProvider().getArticle(Long.valueOf(j), new C20889c.C20890a(taskCompletionSource));
                task = taskCompletionSource.getTask().onSuccessTask(MoovitExecutors.COMPUTATION, new C5227c(13));
            }
            task.addOnCompleteListener((Executor) MoovitExecutors.COMPUTATION, new C20963s(vVar));
        }
    }

    /* renamed from: c */
    public final void mo52902c(long j) {
        Task task;
        C1043v vVar = (C1043v) this.f52395d.getOrDefault(Long.valueOf(j), null);
        if (vVar != null) {
            ProviderStore b = C20889c.m48881b(this.f3907b);
            if (b == null) {
                task = Tasks.forException(new ZendeskException());
            } else {
                HelpCenterProvider helpCenterProvider = b.helpCenterProvider();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                helpCenterProvider.getSection(Long.valueOf(j), new C20889c.C20890a(taskCompletionSource));
                Task task2 = taskCompletionSource.getTask();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                helpCenterProvider.getArticles(Long.valueOf(j), new C20889c.C20890a(taskCompletionSource2));
                Task task3 = taskCompletionSource2.getTask();
                task = Tasks.whenAllSuccess(task2, task3).onSuccessTask(MoovitExecutors.COMPUTATION, new C20887a(task2, task3, j));
            }
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            task.addOnSuccessListener((Executor) executorService, new C20763d(this, 0)).addOnCompleteListener((Executor) executorService, new C20963s(vVar));
        }
    }

    /* renamed from: d */
    public final void mo52903d() {
        Task task;
        Application application = this.f3907b;
        ProviderStore b = C20889c.m48881b(application);
        if (b == null) {
            task = Tasks.forException(new ZendeskException());
        } else {
            C19047a.C19048a aVar = C19047a.f48441d;
            HelpRequest build = new HelpRequest.Builder().withCategoryIds((List) ((C19047a) application.getSystemService("user_configuration")).mo51505b(C20199a.f51240B0)).withLabelNames(ServerParameters.ANDROID_SDK_INT).build();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            b.helpCenterProvider().getHelp(build, new C20889c.C20890a(taskCompletionSource));
            task = taskCompletionSource.getTask().onSuccessTask(MoovitExecutors.COMPUTATION, new C2341k(6));
        }
        task.addOnCompleteListener((Executor) MoovitExecutors.COMPUTATION, new C20963s(this.f52394c));
    }

    /* renamed from: ys.e$a */
    public static class C20765a {

        /* renamed from: a */
        public final String f52400a;

        /* renamed from: b */
        public final List<SimpleArticle> f52401b;

        /* renamed from: c */
        public final Exception f52402c;

        public C20765a() {
            throw null;
        }

        public C20765a(String str, List list) {
            C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
            this.f52400a = str;
            this.f52401b = Collections.unmodifiableList(list);
            this.f52402c = null;
        }

        public C20765a(String str, Exception exc) {
            C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
            this.f52400a = str;
            this.f52401b = Collections.emptyList();
            this.f52402c = exc;
        }
    }
}
