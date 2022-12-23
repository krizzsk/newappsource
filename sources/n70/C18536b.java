package n70;

import android.content.Context;
import com.moovit.sdk.profilers.activity.ActivityProfiler;
import com.moovit.sdk.profilers.activitytransition.ActivityTransitionProfiler;
import com.moovit.sdk.profilers.places.PlacesProfiler;
import com.moovit.sdk.profilers.steps.StepsCounterProfiler;
import com.moovit.sdk.profilers.wifiscan.WifiScansProfiler;
import java.util.Arrays;
import java.util.List;

/* renamed from: n70.b */
public final class C18536b {

    /* renamed from: a */
    public static volatile C18536b f47199a;

    /* renamed from: a */
    public static C18536b m45451a() {
        if (f47199a == null) {
            synchronized (C18536b.class) {
                if (f47199a == null) {
                    f47199a = new C18536b();
                }
            }
        }
        return f47199a;
    }

    /* renamed from: b */
    public static List m45452b(Context context) {
        return Arrays.asList(new C18535a[]{ActivityTransitionProfiler.m41902w(context), ActivityProfiler.m41887w(context), PlacesProfiler.m41917v(context), WifiScansProfiler.m41951y(context), StepsCounterProfiler.m41939y(context)});
    }
}
