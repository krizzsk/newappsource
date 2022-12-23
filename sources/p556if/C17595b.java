package p556if;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import p556if.C17592a;

/* renamed from: if.b */
public abstract class C17595b implements C17592a.C17594b {
    private final WeakReference<C17592a.C17594b> appStateCallback;
    private final C17592a appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public C17595b() {
        this(C17592a.m43719a());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<C17592a.C17594b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f45252i.addAndGet(i);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else if (applicationProcessState2 != applicationProcessState && applicationProcessState != applicationProcessState3) {
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            C17592a aVar = this.appStateMonitor;
            this.currentAppState = aVar.f45259p;
            WeakReference<C17592a.C17594b> weakReference = this.appStateCallback;
            synchronized (aVar.f45250g) {
                aVar.f45250g.add(weakReference);
            }
            this.isRegisteredForAppState = true;
        }
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            C17592a aVar = this.appStateMonitor;
            WeakReference<C17592a.C17594b> weakReference = this.appStateCallback;
            synchronized (aVar.f45250g) {
                aVar.f45250g.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public C17595b(C17592a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
