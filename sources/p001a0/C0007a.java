package p001a0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import p066e0.C4433i0;
import p316y.C7225s;

/* renamed from: a0.a */
public final class C0007a implements C4433i0 {

    /* renamed from: a */
    public final Range<Integer> f4a;

    public C0007a(C7225s sVar) {
        Range[] rangeArr = (Range[]) sVar.mo23532a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.f4a = range;
    }
}
