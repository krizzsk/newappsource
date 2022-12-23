package w50;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.UUID;

/* renamed from: w50.e */
public final /* synthetic */ class C20281e implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ C20283g f51423b;

    /* renamed from: c */
    public final /* synthetic */ UUID f51424c;

    public /* synthetic */ C20281e(C20283g gVar, UUID uuid) {
        this.f51423b = gVar;
        this.f51424c = uuid;
    }

    public final void onComplete(Task task) {
        this.f51423b.mo52455g(this.f51424c, task);
    }
}
