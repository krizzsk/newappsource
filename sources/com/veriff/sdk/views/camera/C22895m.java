package com.veriff.sdk.views.camera;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.m */
final class C22895m implements Executor {

    /* renamed from: a */
    private final /* synthetic */ C24236l f58136a;

    public C22895m(C24236l lVar) {
        this.f58136a = lVar;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        C24362h.m61210e(this.f58136a.invoke(runnable), "invoke(...)");
    }
}
