package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1047z;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.a0 */
public final class C0990a0 extends C1004e {
    public final /* synthetic */ C1047z this$0;

    /* renamed from: androidx.lifecycle.a0$a */
    public class C0991a extends C1004e {
        public C0991a() {
        }

        public void onActivityPostResumed(Activity activity) {
            C0990a0.this.this$0.mo4337a();
        }

        public void onActivityPostStarted(Activity activity) {
            C1047z zVar = C0990a0.this.this$0;
            int i = zVar.f3988b + 1;
            zVar.f3988b = i;
            if (i == 1 && zVar.f3991e) {
                zVar.f3993g.mo4319f(Lifecycle.Event.ON_START);
                zVar.f3991e = false;
            }
        }
    }

    public C0990a0(C1047z zVar) {
        this.this$0 = zVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = C0995b0.f3915c;
            ((C0995b0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f3916b = this.this$0.f3995i;
        }
    }

    public void onActivityPaused(Activity activity) {
        C1047z zVar = this.this$0;
        int i = zVar.f3989c - 1;
        zVar.f3989c = i;
        if (i == 0) {
            zVar.f3992f.postDelayed(zVar.f3994h, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C1047z.C1050c.m2923a(activity, new C0991a());
    }

    public void onActivityStopped(Activity activity) {
        C1047z zVar = this.this$0;
        int i = zVar.f3988b - 1;
        zVar.f3988b = i;
        if (i == 0 && zVar.f3990d) {
            zVar.f3993g.mo4319f(Lifecycle.Event.ON_STOP);
            zVar.f3991e = true;
        }
    }
}
