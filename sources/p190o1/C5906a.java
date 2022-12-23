package p190o1;

import android.graphics.Typeface;
import p116i1.C5247f;
import p129j1.C5355e;
import p609km.C18097c;

/* renamed from: o1.a */
public final class C5906a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18097c f18978b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f18979c;

    public C5906a(C18097c cVar, Typeface typeface) {
        this.f18978b = cVar;
        this.f18979c = typeface;
    }

    public final void run() {
        C18097c cVar = this.f18978b;
        Typeface typeface = this.f18979c;
        C5247f.C5252e eVar = ((C5355e.C5356a) cVar).f17655g;
        if (eVar != null) {
            eVar.mo2200d(typeface);
        }
    }
}
