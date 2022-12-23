package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.internal.Preconditions;
import p627lg.C18213l;

/* renamed from: com.google.android.play.core.assetpacks.h2 */
public final /* synthetic */ class C14273h2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f35893b;

    /* renamed from: c */
    public final /* synthetic */ Object f35894c;

    /* renamed from: d */
    public final /* synthetic */ Object f35895d;

    public /* synthetic */ C14273h2(int i, Object obj, Object obj2) {
        this.f35893b = i;
        this.f35894c = obj;
        this.f35895d = obj2;
    }

    public final void run() {
        boolean z;
        switch (this.f35893b) {
            case 0:
                C14269g2 g2Var = (C14269g2) this.f35895d;
                ((C14277i2) this.f35894c).f35911a.mo42787a(g2Var.f35880d, g2Var.f35881e, g2Var.f35934b);
                return;
            default:
                C18213l lVar = (C18213l) this.f35894c;
                Runnable runnable = (Runnable) this.f35895d;
                if (((Thread) lVar.f46477d.getAndSet(Thread.currentThread())) == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
                try {
                    runnable.run();
                    lVar.f46477d.set((Object) null);
                    lVar.mo50633b();
                    return;
                } catch (Throwable unused) {
                    break;
                }
        }
        throw th;
    }
}
