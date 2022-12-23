package p484ff;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C14475c;
import com.moovit.app.ads.loaders.LoadAdException;
import com.moovit.sdk.profilers.ProfilerLog;
import java.util.Objects;
import l30.C5577i;
import l90.C12852c;
import p435de.C16596f;

/* renamed from: ff.k0 */
public final /* synthetic */ class C16982k0 implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f44085b;

    /* renamed from: c */
    public final /* synthetic */ Object f44086c;

    public /* synthetic */ C16982k0(Object obj, int i) {
        this.f44085b = i;
        this.f44086c = obj;
    }

    public final void onComplete(Task task) {
        switch (this.f44085b) {
            case 0:
                ((C14475c.C14476a) this.f44086c).f36601b.trySetResult(null);
                return;
            case 1:
                CallbackToFutureAdapter.C0673a aVar = (CallbackToFutureAdapter.C0673a) this.f44086c;
                if (task.isSuccessful()) {
                    aVar.mo2697b(new ListenableWorker.C1379a.C1382c());
                    return;
                } else if (task.getException() == null) {
                    aVar.mo2697b(new ListenableWorker.C1379a.C1380a());
                    return;
                } else {
                    aVar.mo2698c(task.getException());
                    if (!(task.getException() instanceof LoadAdException)) {
                        C16596f.m42113a().mo49364c(task.getException());
                        return;
                    }
                    return;
                }
            case 2:
                C5577i iVar = C5577i.f18275d;
                ((C5577i) this.f44086c).mo21404f();
                return;
            case 3:
                Context context = (Context) this.f44086c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("ActivityRecognitionClientCommands", "requestActivityTransitionUpdates-completed successfully");
                    return;
                }
                ProfilerLog c = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("requestActivityTransitionUpdates-failed with error ");
                k.append(task.getException());
                c.mo49244b("ActivityRecognitionClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            default:
                ((C12852c) this.f44086c).f31779o.mo23802c();
                return;
        }
    }
}
