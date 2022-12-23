package com.google.ads.mediation.unity;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p172m9.C5719a;
import p294w2.C6970b;

@Keep
public class ForegroundActivityInitializer implements C6970b<Boolean> {
    public List<Class<? extends C6970b<?>>> dependencies() {
        return Collections.emptyList();
    }

    public Boolean create(Context context) {
        AtomicBoolean atomicBoolean = C5719a.f18543c;
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof Application) && C5719a.f18543c.compareAndSet(false, true)) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C5719a.f18544d);
        }
        return Boolean.valueOf(C5719a.f18543c.get());
    }
}
