package s60;

import c00.C13717b;
import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.utils.ApplicationBugException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p732pq.C18947h;
import p977zz.C20949l;
import s60.C19438d;
import s90.C13072a;

/* renamed from: s60.c */
public final /* synthetic */ class C19437c implements C20949l, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ List f49440b;

    public /* synthetic */ C19437c(List list) {
        this.f49440b = list;
    }

    public final boolean invoke(Object obj) {
        List list = this.f49440b;
        String str = C19438d.f49441x;
        ((C19438d.C19439a) obj).mo51847t(list);
        return true;
    }

    public final Task then(Object obj) {
        List list = this.f49440b;
        ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
        ArrayList<T> c = C13723g.m34282c(((C13072a) obj).f32332a, new C18947h(list, 4));
        if (!C13717b.m34258e(c)) {
            return Tasks.forResult(c);
        }
        StringBuilder k = C13555b.m33972k("Couldn't find any history user wallet tickets with ids: ");
        k.append(C13717b.m34269p(list));
        return Tasks.forException(new ApplicationBugException(k.toString()));
    }
}
