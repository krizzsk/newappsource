package p664mu;

import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;

/* renamed from: mu.r */
public final class C18464r {
    /* renamed from: a */
    public static boolean m45324a(MotActivation motActivation) {
        MotActivationStationInfo motActivationStationInfo = motActivation.f38997n;
        if (!motActivation.f38990g.equals(MotActivation.Status.ACTIVE) || !motActivation.f38994k.equals(MotActivation.ActivationType.ENTRANCE_AND_EXIT) || motActivationStationInfo == null || motActivationStationInfo.mo45574b() != null) {
            return false;
        }
        return true;
    }
}
