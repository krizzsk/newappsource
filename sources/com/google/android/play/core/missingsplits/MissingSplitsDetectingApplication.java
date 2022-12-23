package com.google.android.play.core.missingsplits;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import p482fd.C16950a;
import p482fd.C16951b;
import p482fd.C16952c;

@Deprecated
public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: b */
    public boolean f36150b = false;

    public final void onCreate() {
        if (!this.f36150b) {
            this.f36150b = true;
            AtomicReference atomicReference = C16950a.f43984a;
            if (!new C16952c(this, Runtime.getRuntime(), new C16951b(this, getPackageManager()), C16950a.f43984a).mo49578a()) {
                super.onCreate();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
