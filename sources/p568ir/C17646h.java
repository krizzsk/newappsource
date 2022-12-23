package p568ir;

import a00.C13382a;
import android.widget.SeekBar;
import com.moovit.app.carpool.fastbooking.C14808a;
import java.math.BigDecimal;

/* renamed from: ir.h */
public final class C17646h implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C14808a f45367a;

    public C17646h(C14808a aVar) {
        this.f45367a = aVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C14808a aVar = this.f45367a;
        int i2 = aVar.f37766q;
        long j = aVar.f37761l + (((long) ((((float) ((long) (((float) (i - aVar.f37763n)) * aVar.f37765p))) * 1.0f) / (((float) i2) * 1.0f))) * ((long) i2));
        aVar.f37764o = j;
        long j2 = aVar.f37767r;
        if (j > j2 || i == 100) {
            aVar.f37764o = j2;
        } else {
            long j3 = aVar.f37768s;
            if (j < j3 || i == 0) {
                aVar.f37764o = j3;
            }
        }
        String format = aVar.f37769t.format(BigDecimal.valueOf(aVar.f37764o).movePointLeft(2));
        aVar.f37757h.setText(format);
        C13382a.m33674j(aVar.f37757h, format, C13382a.m33670f(aVar.f37762m.f23844b));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
