package p434dd;

import p554id.C17573l;

/* renamed from: dd.a */
public abstract class C16541a implements Runnable {

    /* renamed from: b */
    public final C17573l f43175b;

    public C16541a() {
        this.f43175b = null;
    }

    public C16541a(C17573l lVar) {
        this.f43175b = lVar;
    }

    /* renamed from: a */
    public abstract void mo42765a();

    public final void run() {
        try {
            mo42765a();
        } catch (Exception e) {
            C17573l lVar = this.f43175b;
            if (lVar != null) {
                lVar.mo50024a(e);
            }
        }
    }
}
