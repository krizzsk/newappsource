package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.C1022m;
import androidx.lifecycle.Lifecycle;
import java.util.Collections;
import java.util.List;
import p294w2.C6969a;
import p294w2.C6970b;

public final class ProcessLifecycleInitializer implements C6970b<C1033p> {
    public final Object create(Context context) {
        if (C6969a.m16442c(context).f21735b.contains(ProcessLifecycleInitializer.class)) {
            if (!C1022m.f3960a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1022m.C1023a());
            }
            C1047z zVar = C1047z.f3987j;
            zVar.getClass();
            zVar.f3992f = new Handler();
            zVar.f3993g.mo4319f(Lifecycle.Event.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0990a0(zVar));
            return zVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }

    public final List<Class<? extends C6970b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
