package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C2593b;
import com.fyber.inneractive.sdk.network.C2900f0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2936u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.i */
public class C2668i {

    /* renamed from: a */
    public final Context f9336a;

    /* renamed from: b */
    public C2667h f9337b = new C2667h();

    /* renamed from: c */
    public List<C2670b> f9338c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public boolean f9339d = false;

    /* renamed from: e */
    public final C2593b f9340e = new C2593b();

    /* renamed from: com.fyber.inneractive.sdk.config.i$a */
    public class C2669a implements C2936u<C2667h> {
        public C2669a() {
        }

        /* renamed from: a */
        public void mo13154a(Object obj, Exception exc, boolean z) {
            C2667h hVar = (C2667h) obj;
            if (hVar != null) {
                C2668i iVar = C2668i.this;
                iVar.getClass();
                if (!hVar.equals(iVar.f9337b)) {
                    iVar.f9339d = true;
                    iVar.f9337b = hVar;
                    for (C2670b onGlobalConfigChanged : iVar.f9338c) {
                        onGlobalConfigChanged.onGlobalConfigChanged(iVar, iVar.f9337b);
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.i$b */
    public interface C2670b {
        void onGlobalConfigChanged(C2668i iVar, C2667h hVar);
    }

    public C2668i(Context context) {
        this.f9336a = context;
    }

    /* renamed from: a */
    public C2667h mo13276a() {
        return this.f9337b;
    }

    /* renamed from: b */
    public void mo13277b() {
        C2900f0 f0Var = new C2900f0(new C2669a(), this.f9336a, this.f9340e);
        IAConfigManager.f9202J.f9232t.f10064a.offer(f0Var);
        f0Var.mo13666a(C2916m0.QUEUED);
    }
}
