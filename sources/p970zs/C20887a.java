package p970zs;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p946ys.C20761b;
import zendesk.support.Article;
import zendesk.support.Section;

/* renamed from: zs.a */
public final /* synthetic */ class C20887a implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ Task f52630b;

    /* renamed from: c */
    public final /* synthetic */ Task f52631c;

    /* renamed from: d */
    public final /* synthetic */ long f52632d;

    public /* synthetic */ C20887a(Task task, Task task2, long j) {
        this.f52630b = task;
        this.f52631c = task2;
        this.f52632d = j;
    }

    public final Task then(Object obj) {
        String str;
        String str2;
        List<Article> list;
        Task task = this.f52630b;
        Task task2 = this.f52631c;
        long j = this.f52632d;
        List list2 = (List) obj;
        Section section = (Section) task.getResult();
        if (section != null) {
            str = section.getName();
        } else {
            str = null;
        }
        if (section != null) {
            str2 = section.getDescription();
        } else {
            str2 = null;
        }
        if (task2.getResult() != null) {
            list = (List) task2.getResult();
        } else {
            list = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Article article : list) {
            if (article.getId() != null) {
                if (article.getLabelNames().contains("regular")) {
                    arrayList.add(C20889c.m48880a(article));
                }
                if (article.getLabelNames().contains("troubleshooting")) {
                    arrayList2.add(C20889c.m48880a(article));
                }
            }
        }
        return Tasks.forResult(new C20761b(j, str, str2, arrayList, arrayList2));
    }
}
