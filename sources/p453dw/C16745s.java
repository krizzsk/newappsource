package p453dw;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import com.moovit.app.stopdetail.C15356f;
import com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity;
import com.tranzmate.R;

/* renamed from: dw.s */
public final /* synthetic */ class C16745s implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f43604a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f43605b;

    public /* synthetic */ C16745s(KeyEvent.Callback callback, int i) {
        this.f43604a = i;
        this.f43605b = callback;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        boolean z = true;
        switch (this.f43604a) {
            case 0:
                View view = (View) this.f43605b;
                String str = C15356f.f39753h;
                view.setTag(Integer.valueOf(i));
                view.setEnabled(true);
                return;
            default:
                WondoRewardDetailsActivity wondoRewardDetailsActivity = (WondoRewardDetailsActivity) this.f43605b;
                int i2 = WondoRewardDetailsActivity.f40769Z;
                Button button = (Button) wondoRewardDetailsActivity.findViewById(R.id.reward_action);
                if (wondoRewardDetailsActivity.mo46738y2() == null) {
                    z = false;
                }
                button.setEnabled(z);
                return;
        }
    }
}
