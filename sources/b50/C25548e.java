package b50;

import android.widget.Toast;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import com.moovit.payment.account.deposit.DepositActivity;
import v40.C25754i;

/* renamed from: b50.e */
public final class C25548e implements C1044w<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ LiveData f63803a;

    /* renamed from: b */
    public final /* synthetic */ DepositActivity f63804b;

    public C25548e(DepositActivity depositActivity, C1043v vVar) {
        this.f63804b = depositActivity;
        this.f63803a = vVar;
    }

    public final void onChanged(Object obj) {
        this.f63803a.removeObserver(this);
        if (Boolean.TRUE.equals((Boolean) obj)) {
            Toast.makeText(this.f63804b, C25754i.payment_change_card_success, 0).show();
        }
    }
}
