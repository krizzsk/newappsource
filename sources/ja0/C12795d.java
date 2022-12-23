package ja0;

import androidx.appcompat.widget.C0436m1;
import androidx.lifecycle.C1033p;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.design.view.AlertMessageView;
import com.moovit.payment.invoices.AccountInvoicesActivity;
import o00.C18671h;
import p761qy.C19201a;
import p824tp.C19742t;
import p824tp.C19746x;

/* renamed from: ja0.d */
public final class C12795d extends C18671h {

    /* renamed from: h */
    public final C1033p f31617h;

    /* renamed from: i */
    public final String f31618i;

    /* renamed from: j */
    public final String f31619j;

    /* renamed from: k */
    public final Runnable f31620k;

    public C12795d(AccountInvoicesActivity accountInvoicesActivity, String str, String str2, C0436m1 m1Var) {
        super(C19742t.general_error_view);
        this.f31617h = accountInvoicesActivity;
        this.f31618i = str;
        this.f31619j = str2;
        this.f31620k = m1Var;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        AlertMessageView alertMessageView = (AlertMessageView) a0Var.itemView;
        String str = this.f31618i;
        if (str != null) {
            alertMessageView.setTitle((CharSequence) str);
        }
        String str2 = this.f31619j;
        if (str2 != null) {
            alertMessageView.setSubtitle((CharSequence) str2);
        }
        if (this.f31620k != null) {
            alertMessageView.setNegativeButton(C19746x.retry_connect);
            alertMessageView.setNegativeButtonClickListener(new C19201a(this, 15));
            return;
        }
        alertMessageView.setNegativeButton((CharSequence) null);
    }
}
