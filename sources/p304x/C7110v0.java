package p304x;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.List;
import p316y.C7197a0;

/* renamed from: x.v0 */
public final class C7110v0 {
    /* renamed from: a */
    public static String m16650a(C7197a0 a0Var, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains("0") || !list.contains(DiskLruCache.VERSION_1)) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) a0Var.mo23499b("0").mo23532a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return DiskLruCache.VERSION_1;
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) a0Var.mo23499b(DiskLruCache.VERSION_1).mo23532a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }
}
