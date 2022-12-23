package l30;

import a20.C13387a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;

/* renamed from: l30.m */
public final /* synthetic */ class C5582m implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C5585p f18289b;

    public /* synthetic */ C5582m(C5585p pVar) {
        this.f18289b = pVar;
    }

    public final Object then(Task task) {
        boolean z;
        int i;
        C5585p pVar = this.f18289b;
        pVar.getClass();
        if (!task.isSuccessful() || task.getResult() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(pVar.f18305d);
        arrayList.add(pVar.f18306e);
        if (z) {
            arrayList.add((C13387a) task.getResult());
        }
        return arrayList;
    }
}
