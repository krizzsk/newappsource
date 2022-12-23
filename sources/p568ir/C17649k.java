package p568ir;

import android.widget.RadioGroup;
import com.moovit.app.carpool.fastbooking.C14810b;
import com.tranzmate.R;

/* renamed from: ir.k */
public final /* synthetic */ class C17649k implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C14810b f45371a;

    public /* synthetic */ C17649k(C14810b bVar) {
        this.f45371a = bVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C14810b bVar = this.f45371a;
        if (i == R.id.from_radio_button) {
            bVar.mo44865S1(bVar.f37771h);
        } else {
            bVar.mo44865S1(bVar.f37772i);
        }
    }
}
