package p627lg;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbb;
import com.google.android.play.core.assetpacks.C14332w1;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* renamed from: lg.h */
public final class C18209h extends zzbb {

    /* renamed from: c */
    public static final ThreadLocal f46467c = new ThreadLocal();

    /* renamed from: b */
    public final ThreadPoolExecutor f46468b;

    public C18209h() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C18219r(defaultThreadFactory));
        this.f46468b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f46467c.get();
        if (deque == null || deque.size() > 1) {
            this.f46468b.execute(new C14332w1(runnable, 2));
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    public final /* synthetic */ Object zza() {
        return this.f46468b;
    }

    public final ExecutorService zzb() {
        return this.f46468b;
    }
}
