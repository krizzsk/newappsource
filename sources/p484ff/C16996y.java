package p484ff;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: ff.y */
public final /* synthetic */ class C16996y implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ C16997z f44111b;

    /* renamed from: c */
    public final /* synthetic */ String f44112c;

    public /* synthetic */ C16996y(C16997z zVar, String str) {
        this.f44111b = zVar;
        this.f44112c = str;
    }

    public final Object then(Task task) {
        C16997z zVar = this.f44111b;
        String str = this.f44112c;
        synchronized (zVar) {
            zVar.f44114b.remove(str);
        }
        return task;
    }
}
