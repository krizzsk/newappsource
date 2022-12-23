package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.b0 */
public final class C0995b0 extends Fragment {

    /* renamed from: c */
    public static final /* synthetic */ int f3915c = 0;

    /* renamed from: b */
    public C0996a f3916b;

    /* renamed from: androidx.lifecycle.b0$a */
    public interface C0996a {
    }

    /* renamed from: androidx.lifecycle.b0$b */
    public static class C0997b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0997b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0995b0.m2859a(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m2859a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof C1038r) {
            ((C1038r) activity).getLifecycle().mo4319f(event);
        } else if (activity instanceof C1033p) {
            Lifecycle lifecycle = ((C1033p) activity).getLifecycle();
            if (lifecycle instanceof C1035q) {
                ((C1035q) lifecycle).mo4319f(event);
            }
        }
    }

    /* renamed from: c */
    public static void m2860c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0997b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0995b0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo4270b(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            m2859a(getActivity(), event);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo4270b(Lifecycle.Event.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        mo4270b(Lifecycle.Event.ON_DESTROY);
        this.f3916b = null;
    }

    public final void onPause() {
        super.onPause();
        mo4270b(Lifecycle.Event.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        C0996a aVar = this.f3916b;
        if (aVar != null) {
            C1047z.this.mo4337a();
        }
        mo4270b(Lifecycle.Event.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        C0996a aVar = this.f3916b;
        if (aVar != null) {
            C1047z zVar = C1047z.this;
            int i = zVar.f3988b + 1;
            zVar.f3988b = i;
            if (i == 1 && zVar.f3991e) {
                zVar.f3993g.mo4319f(Lifecycle.Event.ON_START);
                zVar.f3991e = false;
            }
        }
        mo4270b(Lifecycle.Event.ON_START);
    }

    public final void onStop() {
        super.onStop();
        mo4270b(Lifecycle.Event.ON_STOP);
    }
}
