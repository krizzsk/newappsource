package p733pr;

import com.tranzmate.R;
import java.util.Locale;

/* renamed from: pr.g */
public final class C18971g implements Runnable {

    /* renamed from: b */
    public int f48304b = 60;

    /* renamed from: c */
    public final /* synthetic */ C18964e f48305c;

    public C18971g(C18964e eVar) {
        this.f48305c = eVar;
    }

    public final void run() {
        this.f48305c.f48293k.setText(this.f48305c.getResources().getString(R.string.carpool_verification_code_resend_countdown, new Object[]{String.format(Locale.getDefault(), "%02d:%02d", new Object[]{0, Integer.valueOf(this.f48304b)})}));
        int i = this.f48304b - 1;
        this.f48304b = i;
        if (i > 0) {
            this.f48305c.f48296n.postDelayed(this, 1000);
            return;
        }
        C18964e eVar = this.f48305c;
        eVar.f48293k.setVisibility(8);
        eVar.f48294l.setVisibility(0);
    }
}
