package p429cw;

import android.widget.Chronometer;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import kotlin.time.DurationUnit;
import mf0.C24362h;
import rf0.C24809k;
import vh0.C25109a;
import vh0.C25110b;

/* renamed from: cw.b */
public final /* synthetic */ class C16512b implements Chronometer.OnChronometerTickListener {

    /* renamed from: a */
    public final /* synthetic */ StopArrivalsActivity.C15316a f43112a;

    public /* synthetic */ C16512b(StopArrivalsActivity.C15316a aVar) {
        this.f43112a = aVar;
    }

    public final void onChronometerTick(Chronometer chronometer) {
        int i;
        int i2;
        boolean z;
        long j;
        StopArrivalsActivity.C15316a aVar = this.f43112a;
        aVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(System.currentTimeMillis() - chronometer.getBase());
        if (minutes < 2) {
            i2 = aVar.f39613k;
            i = R.drawable.ic_clock_16_good;
        } else if (minutes < 5) {
            i2 = aVar.f39613k;
            i = R.drawable.ic_clock_16_on_surface_emphasis_medium;
        } else {
            i2 = aVar.f39614l;
            i = R.drawable.ic_clock_16_critical;
        }
        chronometer.setTextColor(i2);
        UiUtils.m40261t(chronometer, UiUtils.Edge.LEFT, C17988b.m44611b(i, chronometer.getContext()));
        long seconds = timeUnit.toSeconds(System.currentTimeMillis() - chronometer.getBase());
        int i3 = C25109a.f63332d;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        C24362h.m61211f(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        C24362h.m61211f(durationUnit2, "sourceUnit");
        long convert = durationUnit.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, durationUnit2.getTimeUnit$kotlin_stdlib());
        long j2 = -convert;
        C24809k kVar = new C24809k(j2, convert);
        if (j2 > seconds || seconds > kVar.f62737c) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            j = durationUnit2.getTimeUnit$kotlin_stdlib().convert(seconds, durationUnit.getTimeUnit$kotlin_stdlib()) << 1;
            int i4 = C25110b.f63333a;
        } else {
            DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
            C24362h.m61211f(durationUnit3, "targetUnit");
            long convert2 = durationUnit3.getTimeUnit$kotlin_stdlib().convert(seconds, durationUnit.getTimeUnit$kotlin_stdlib());
            if (convert2 < -4611686018427387903L) {
                convert2 = -4611686018427387903L;
            } else if (convert2 > 4611686018427387903L) {
                convert2 = 4611686018427387903L;
            }
            j = (convert2 << 1) + 1;
            int i5 = C25110b.f63333a;
        }
        chronometer.setText(C25109a.m62918d(j));
    }
}
