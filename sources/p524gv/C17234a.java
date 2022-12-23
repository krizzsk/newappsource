package p524gv;

import android.text.Editable;
import android.widget.Button;
import i00.C17522a;

/* renamed from: gv.a */
public final class C17234a extends C17522a {

    /* renamed from: b */
    public final /* synthetic */ C17237d f44555b;

    public C17234a(C17237d dVar) {
        this.f44555b = dVar;
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        C17237d dVar = this.f44555b;
        Button button = dVar.f44562q;
        boolean z2 = true;
        if (dVar.f44559n.getText().toString().trim().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.f44555b.mo49798o2()) {
            z2 = false;
        }
        button.setEnabled(z2);
    }
}
