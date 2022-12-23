package p568ir;

import android.widget.TimePicker;
import com.moovit.app.carpool.fastbooking.C14810b;
import com.moovit.util.time.C7925b;

/* renamed from: ir.l */
public final /* synthetic */ class C17650l implements TimePicker.OnTimeChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C14810b f45372a;

    public /* synthetic */ C17650l(C14810b bVar) {
        this.f45372a = bVar;
    }

    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        C14810b bVar = this.f45372a;
        if (bVar.f37774k.isChecked()) {
            bVar.f37771h.set(11, i);
            bVar.f37771h.set(12, i2);
            bVar.f37774k.setText(C7925b.m18024l(bVar.f40792c, bVar.f37771h.getTimeInMillis()));
            if (bVar.f37771h.getTimeInMillis() + bVar.f37773j > bVar.f37772i.getTimeInMillis()) {
                long timeInMillis = bVar.f37771h.getTimeInMillis() + bVar.f37773j;
                bVar.f37772i.setTimeInMillis(timeInMillis);
                bVar.f37775l.setText(C7925b.m18024l(bVar.f40792c, timeInMillis));
                return;
            }
            return;
        }
        bVar.f37772i.set(11, i);
        bVar.f37772i.set(12, i2);
        bVar.f37775l.setText(C7925b.m18024l(bVar.f40792c, bVar.f37772i.getTimeInMillis()));
        if (bVar.f37771h.getTimeInMillis() + 900000 > bVar.f37772i.getTimeInMillis()) {
            long timeInMillis2 = bVar.f37772i.getTimeInMillis() - 900000;
            bVar.f37771h.setTimeInMillis(timeInMillis2);
            bVar.f37774k.setText(C7925b.m18024l(bVar.f40792c, timeInMillis2));
            bVar.f37773j = 900000;
            return;
        }
        bVar.f37773j = bVar.f37772i.getTimeInMillis() - bVar.f37771h.getTimeInMillis();
    }
}
