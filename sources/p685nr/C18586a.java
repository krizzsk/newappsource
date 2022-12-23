package p685nr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.registration.CarpoolRegistrationActivity;

/* renamed from: nr.a */
public abstract class C18586a extends Fragment {
    /* renamed from: H1 */
    public abstract int mo50979H1();

    /* renamed from: I1 */
    public final CarpoolRegistrationActivity mo50980I1() {
        FragmentActivity activity = getActivity();
        if (activity instanceof CarpoolRegistrationActivity) {
            return (CarpoolRegistrationActivity) activity;
        }
        return null;
    }

    /* renamed from: J1 */
    public abstract AnalyticsEventKey mo50981J1();
}
