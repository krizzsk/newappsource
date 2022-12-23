package r90;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: r90.b */
public final /* synthetic */ class C13051b implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C13052c f32277b;

    /* renamed from: c */
    public final /* synthetic */ int f32278c;

    /* renamed from: d */
    public final /* synthetic */ int f32279d;

    public /* synthetic */ C13051b(C13052c cVar, int i, int i2) {
        this.f32277b = cVar;
        this.f32278c = i;
        this.f32279d = i2;
    }

    public final Task then(Object obj) {
        C13052c cVar = this.f32277b;
        int i = this.f32278c;
        int i2 = this.f32279d;
        return Tasks.forResult(cVar.f32283r.mo40456a((String) obj, i, i2, (Map<EncodeHintType, ?>) null));
    }
}
