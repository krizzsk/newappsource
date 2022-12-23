package p144k4;

import p070e4.C4549d;
import p296w4.C6986d;

/* renamed from: k4.a */
public final class C5475a extends C5476b {

    /* renamed from: f */
    public static final C6986d f17992f = new C6986d((long) 0.0d);

    /* renamed from: e */
    public C6986d f17993e = f17992f;

    public final void run() {
        if (this.f17993e.f21756a > 0) {
            StringBuilder k = C13555b.m33972k("Sleeping for ");
            k.append(this.f17993e);
            mo22865i(k.toString());
            try {
                Thread.sleep(this.f17993e.f21756a);
            } catch (InterruptedException unused) {
            }
        }
        mo22865i("Logback context being closed via shutdown hook");
        C4549d dVar = this.f20771c;
        if (dVar instanceof C4549d) {
            dVar.stop();
        }
    }
}
