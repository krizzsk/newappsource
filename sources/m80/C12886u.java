package m80;

import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import y80.C13262a;

/* renamed from: m80.u */
public final /* synthetic */ class C12886u implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ String f31890b;

    /* renamed from: c */
    public final /* synthetic */ String f31891c;

    /* renamed from: d */
    public final /* synthetic */ int f31892d = 0;

    public /* synthetic */ C12886u(String str, String str2) {
        this.f31890b = str;
        this.f31891c = str2;
    }

    public final Task then(Object obj) {
        return Tasks.call(MoovitExecutors.f37327IO, new C13262a(this.f31892d, (C13752e) obj, this.f31890b, this.f31891c));
    }
}
