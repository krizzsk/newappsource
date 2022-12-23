package p453dw;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.StopDetailActivity;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import w50.C20283g;

/* renamed from: dw.e */
public final /* synthetic */ class C16729e implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f43570b;

    /* renamed from: c */
    public final /* synthetic */ Object f43571c;

    /* renamed from: d */
    public final /* synthetic */ Object f43572d;

    public /* synthetic */ C16729e(int i, Object obj, Object obj2) {
        this.f43570b = i;
        this.f43571c = obj;
        this.f43572d = obj2;
    }

    public final void onComplete(Task task) {
        switch (this.f43570b) {
            case 0:
                StopDetailActivity stopDetailActivity = (StopDetailActivity) this.f43571c;
                C15340c cVar = (C15340c) this.f43572d;
                int i = StopDetailActivity.f39653z0;
                stopDetailActivity.getClass();
                if (task.isSuccessful()) {
                    cVar.f39706k = (Map) task.getResult();
                    cVar.notifyDataSetChanged();
                    return;
                }
                int i2 = stopDetailActivity.f39657Z.f15142b;
                return;
            default:
                BigDecimal bigDecimal = C20283g.f51427r;
                ((C20283g) this.f43571c).mo52455g((UUID) this.f43572d, task);
                return;
        }
    }
}
