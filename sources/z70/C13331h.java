package z70;

import android.os.SystemClock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.search.C7604a;

/* renamed from: z70.h */
public final /* synthetic */ class C13331h implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ C7604a f33094b;

    public /* synthetic */ C13331h(C7604a aVar, long j) {
        this.f33094b = aVar;
    }

    public final void onComplete(Task task) {
        String str = this.f33094b.f23153b;
        task.isSuccessful();
        SystemClock.elapsedRealtime();
    }
}
