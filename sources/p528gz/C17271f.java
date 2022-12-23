package p528gz;

import com.appboy.events.IValueCallback;
import com.braze.BrazeUser;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: gz.f */
public final class C17271f implements IValueCallback<BrazeUser> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f44641a;

    public C17271f(TaskCompletionSource taskCompletionSource) {
        this.f44641a = taskCompletionSource;
    }

    public final void onError() {
        this.f44641a.setException(new RuntimeException("Failed retrieving BrazeUser"));
    }

    public final void onSuccess(Object obj) {
        this.f44641a.setResult((BrazeUser) obj);
    }
}
