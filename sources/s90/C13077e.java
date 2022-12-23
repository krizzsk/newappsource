package s90;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import m80.C12875k;
import p80.C12991b;
import p977zz.C20944i0;

/* renamed from: s90.e */
public final /* synthetic */ class C13077e implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C12991b f32352b;

    public /* synthetic */ C13077e(C12991b bVar) {
        this.f32352b = bVar;
    }

    public final Object then(Task task) {
        C13076d dVar;
        C12991b bVar = this.f32352b;
        HashSet hashSet = C13078f.f32353s;
        if (task.isSuccessful()) {
            dVar = (C13076d) task.getResult();
        } else {
            dVar = null;
        }
        return new C20944i0(dVar, C12875k.m32663c(bVar, C13078f.f32353s, dVar));
    }
}
