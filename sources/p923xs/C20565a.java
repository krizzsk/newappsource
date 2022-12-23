package p923xs;

import android.content.Context;
import android.content.UriMatcher;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import com.zendesk.service.ZendeskException;
import p543hq.C17474b;
import p970zs.C20889c;
import zendesk.support.ProviderStore;

/* renamed from: xs.a */
public final /* synthetic */ class C20565a implements MaterialButtonToggleGroup.C13933d {

    /* renamed from: a */
    public final /* synthetic */ C20568d f52019a;

    public /* synthetic */ C20565a(C20568d dVar) {
        this.f52019a = dVar;
    }

    /* renamed from: a */
    public final void mo41163a(int i) {
        C20568d dVar = this.f52019a;
        UriMatcher uriMatcher = C20568d.f52024u;
        dVar.getClass();
        if (i == R.id.vote_up_button) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_up_vote_clicked");
            dVar.mo46797j2(aVar.mo49933a());
            Context requireContext = dVar.requireContext();
            long j = dVar.f52025n;
            ProviderStore b = C20889c.m48881b(requireContext);
            if (b == null) {
                Tasks.forException(new ZendeskException());
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                b.helpCenterProvider().upvoteArticle(Long.valueOf(j), new C20889c.C20890a(taskCompletionSource));
                taskCompletionSource.getTask();
            }
            dVar.mo52780n2();
            return;
        }
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_down_vote_clicked");
        dVar.mo46797j2(aVar2.mo49933a());
        Context requireContext2 = dVar.requireContext();
        long j2 = dVar.f52025n;
        ProviderStore b2 = C20889c.m48881b(requireContext2);
        if (b2 == null) {
            Tasks.forException(new ZendeskException());
        } else {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            b2.helpCenterProvider().downvoteArticle(Long.valueOf(j2), new C20889c.C20890a(taskCompletionSource2));
            taskCompletionSource2.getTask();
        }
        dVar.mo52780n2();
    }
}
