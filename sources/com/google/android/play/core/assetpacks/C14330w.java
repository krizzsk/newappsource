package com.google.android.play.core.assetpacks;

import bf0.C21050d;
import kotlinx.coroutines.CoroutineDispatcher;
import p554id.C17562a;
import p554id.C17568g;
import p554id.C17576o;
import wh0.C25189k;

/* renamed from: com.google.android.play.core.assetpacks.w */
public final /* synthetic */ class C14330w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f36094b;

    /* renamed from: c */
    public final Object f36095c;

    /* renamed from: d */
    public final Object f36096d;

    public /* synthetic */ C14330w(int i, Object obj, Object obj2) {
        this.f36094b = i;
        this.f36095c = obj;
        this.f36096d = obj2;
    }

    public final void run() {
        Exception exc;
        switch (this.f36094b) {
            case 0:
                ((C14334x) this.f36095c).mo49482c((AssetPackState) this.f36096d);
                return;
            case 1:
                synchronized (((C17568g) this.f36096d).f45185b) {
                    C17562a aVar = ((C17568g) this.f36096d).f45186c;
                    if (aVar != null) {
                        C17576o oVar = (C17576o) this.f36095c;
                        synchronized (oVar.f45198a) {
                            exc = oVar.f45202e;
                        }
                        aVar.onFailure(exc);
                    }
                }
                return;
            default:
                ((C25189k) this.f36096d).mo61825z((CoroutineDispatcher) this.f36095c, C21050d.f52856a);
                return;
        }
    }

    public C14330w(C17568g gVar, C17576o oVar) {
        this.f36094b = 1;
        this.f36096d = gVar;
        this.f36095c = oVar;
    }
}
