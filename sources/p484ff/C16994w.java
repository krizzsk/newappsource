package p484ff;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* renamed from: ff.w */
public final class C16994w {
    @TargetApi(29)
    /* renamed from: a */
    public static Task m42843a(Context context, Executor executor, boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new C16993v(context, z, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
