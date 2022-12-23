package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.LocalTestingException;

/* renamed from: com.google.android.play.core.assetpacks.n1 */
public final /* synthetic */ class C14296n1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14304p1 f35954b;

    /* renamed from: c */
    public final /* synthetic */ int f35955c;

    /* renamed from: d */
    public final /* synthetic */ String f35956d;

    public /* synthetic */ C14296n1(C14304p1 p1Var, int i, String str) {
        this.f35954b = p1Var;
        this.f35955c = i;
        this.f35956d = str;
    }

    public final void run() {
        C14304p1 p1Var = this.f35954b;
        int i = this.f35955c;
        String str = this.f35956d;
        p1Var.getClass();
        try {
            p1Var.mo42877f(i, str);
        } catch (LocalTestingException e) {
            C14304p1.f35986g.mo978e("notifyModuleCompleted failed", e);
        }
    }
}
