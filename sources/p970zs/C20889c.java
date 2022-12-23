package p970zs;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.util.Text;
import com.moovit.util.TextFormat;
import com.zendesk.service.ZendeskException;
import fe0.C23341a;
import fe0.C23345c;
import org.json.JSONObject;
import p946ys.C20760a;
import p977zz.C20930c;
import p977zz.C20964s0;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
import zendesk.support.Article;
import zendesk.support.ProviderStore;
import zendesk.support.Support;

/* renamed from: zs.c */
public final class C20889c {

    /* renamed from: zs.c$a */
    public static class C20890a<R> extends C23345c<R> {

        /* renamed from: a */
        public final TaskCompletionSource<R> f52634a;

        public C20890a(TaskCompletionSource<R> taskCompletionSource) {
            this.f52634a = taskCompletionSource;
        }

        public final void onError(C23341a aVar) {
            this.f52634a.setException(new ZendeskException(aVar));
        }

        public final void onSuccess(R r) {
            this.f52634a.setResult(r);
        }
    }

    /* renamed from: a */
    public static C20760a m48880a(Article article) {
        return new C20760a(article.getId().longValue(), C20964s0.m49106x(article.getTitle()), new Text(article.getBody(), TextFormat.HTML, (String) null), article.getVoteCount(), article.getUpvoteCount());
    }

    /* renamed from: b */
    public static ProviderStore m48881b(Context context) {
        if (!m48882c(context)) {
            return null;
        }
        return Support.INSTANCE.provider();
    }

    /* renamed from: c */
    public static boolean m48882c(Context context) {
        boolean z;
        Zendesk zendesk2 = Zendesk.INSTANCE;
        if (!zendesk2.isInitialized() || !Support.INSTANCE.isInitialized()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(C20930c.m49021c(context.getApplicationContext()).getString("com.moovit.zendesk.config"));
            zendesk2.init(context.getApplicationContext(), jSONObject.getString("url"), jSONObject.getString("app_id"), jSONObject.getString("client_id"));
            if (zendesk2.getIdentity() == null) {
                zendesk2.setIdentity(new AnonymousIdentity());
            }
            Support support = Support.INSTANCE;
            support.init(zendesk2);
            if (!zendesk2.isInitialized() || !support.isInitialized()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
