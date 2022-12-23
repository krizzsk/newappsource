package p733pr;

import android.text.Editable;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import p977zz.C20964s0;

/* renamed from: pr.d */
public class C18963d extends C18961c {

    /* renamed from: k */
    public static final /* synthetic */ int f48282k = 0;

    /* renamed from: J1 */
    public final AnalyticsEventKey mo50981J1() {
        return AnalyticsEventKey.STEP_ENTER_PHONE;
    }

    /* renamed from: K1 */
    public final String mo51471K1() {
        return getString(R.string.carpool_passenger_registration_phone_number_explanation);
    }

    /* renamed from: L1 */
    public final String mo51472L1() {
        return getString(R.string.carpool_registration_phone_number_input_hint);
    }

    /* renamed from: M1 */
    public final String mo51473M1() {
        return getString(R.string.carpool_registration_phone_number_input_hint);
    }

    /* renamed from: N1 */
    public final String mo51474N1() {
        return getString(R.string.carpool_registration_phone_number_input_hint);
    }

    /* renamed from: O1 */
    public final void mo51475O1() {
        Editable text = this.f48279h.getText();
        if (C20964s0.m49095m(text)) {
            mo50980I1().mo44889y2(text);
            return;
        }
        this.f48278g.setError(getString(R.string.carpool_passenger_registration_invalid_phone_number_message));
        this.f48279h.requestFocus();
    }

    /* renamed from: P1 */
    public final void mo51476P1(CharSequence charSequence) {
        this.f48277f.setEnabled(C20964s0.m49095m(charSequence));
        this.f48278g.setHelperText(getString(R.string.carpool_passenger_registration_phone_number_explanation));
        this.f48279h.requestFocus();
    }
}
