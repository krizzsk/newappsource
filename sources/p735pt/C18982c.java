package p735pt;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.index.AppIndexingUpdateService;
import p435de.C16596f;

/* renamed from: pt.c */
public final /* synthetic */ class C18982c implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f48328b;

    public /* synthetic */ C18982c(int i) {
        this.f48328b = i;
    }

    public final void onComplete(Task task) {
        String str;
        switch (this.f48328b) {
            case 0:
                int i = AppIndexingUpdateService.f38434l;
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        str = task.getException().getLocalizedMessage();
                    } else {
                        str = "unknown";
                    }
                    C16596f.m42113a().mo49363b(C25541a.m63881k("periodic update app indexing - Failed update app index task: ", str));
                    return;
                }
                return;
            default:
                task.isSuccessful();
                return;
        }
    }
}
