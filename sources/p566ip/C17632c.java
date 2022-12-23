package p566ip;

import android.view.View;
import android.widget.Button;
import mf0.C24362h;
import p701oj.C18767k;

/* renamed from: ip.c */
public final class C17632c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C17627a f45322b;

    public C17632c(C17627a aVar) {
        this.f45322b = aVar;
    }

    public final void onClick(View view) {
        C17627a aVar = this.f45322b;
        C17633d dVar = aVar.f45314d;
        if (dVar != null) {
            dVar.f45323a = 1;
            aVar.mo50085N1();
            C18767k kVar = aVar.f45313c;
            C24362h.m61208c(kVar);
            Button button = kVar.f47760d;
            C24362h.m61210e(button, "binding.secondaryBarcodeButton");
            aVar.mo50084M1(button);
            C18767k kVar2 = aVar.f45313c;
            C24362h.m61208c(kVar2);
            Button button2 = kVar2.f47759c;
            C24362h.m61210e(button2, "binding.primaryBarcodeButton");
            button2.setSelected(false);
            aVar.mo50086O1(button2, -1, -16777216);
        }
    }
}
