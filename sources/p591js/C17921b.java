package p591js;

import android.widget.Button;
import android.widget.CompoundButton;

/* renamed from: js.b */
public final /* synthetic */ class C17921b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C17923d f45976a;

    /* renamed from: b */
    public final /* synthetic */ int f45977b;

    /* renamed from: c */
    public final /* synthetic */ Button f45978c;

    public /* synthetic */ C17921b(C17923d dVar, int i, Button button) {
        this.f45976a = dVar;
        this.f45977b = i;
        this.f45978c = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C17923d dVar = this.f45976a;
        int i = this.f45977b;
        Button button = this.f45978c;
        if (z) {
            dVar.f45984h.add(Integer.valueOf(i));
        } else {
            dVar.f45984h.remove(Integer.valueOf(i));
        }
        button.setEnabled(!dVar.f45984h.isEmpty());
    }
}
