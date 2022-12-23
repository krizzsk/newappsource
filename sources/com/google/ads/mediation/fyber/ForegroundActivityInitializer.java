package com.google.ads.mediation.fyber;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p160l9.C5641a;
import p294w2.C6970b;

@Keep
public class ForegroundActivityInitializer implements C6970b<Boolean> {
    public List<Class<? extends C6970b<?>>> dependencies() {
        return Collections.emptyList();
    }

    public Boolean create(Context context) {
        AtomicBoolean atomicBoolean = C5641a.f18391c;
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof Application) && C5641a.f18391c.compareAndSet(false, true)) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C5641a.f18392d);
        }
        return Boolean.valueOf(C5641a.f18391c.get());
    }
}
