package com.moovit.payment.invoices;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.C0436m1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.invoices.C16352a;
import com.moovit.payment.invoices.model.Invoice;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import e60.C16800a;
import h60.C17337n;
import h60.C17340o;
import ja0.C12793c;
import ja0.C12795d;
import java.util.ArrayList;
import java.util.List;
import o00.C18665b;
import o00.C18671h;
import p221q6.C6198o;
import p826tr.C19752b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

public class AccountInvoicesActivity extends MoovitPaymentActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f42708l0 = 0;

    /* renamed from: U */
    public final C16348a f42709U = new C16348a();

    /* renamed from: X */
    public final C18671h f42710X = new C18671h(C25751f.invoices_empty_state);

    /* renamed from: Y */
    public C13556a f42711Y;

    /* renamed from: Z */
    public RecyclerView f42712Z;

    /* renamed from: com.moovit.payment.invoices.AccountInvoicesActivity$a */
    public class C16348a extends C20438i<C17337n, C17340o> {
        public C16348a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17337n nVar = (C17337n) cVar;
            AccountInvoicesActivity accountInvoicesActivity = AccountInvoicesActivity.this;
            C6198o oVar = ((C17340o) gVar).f44725m;
            int i = AccountInvoicesActivity.f42708l0;
            accountInvoicesActivity.getClass();
            List list = (List) oVar.f19598d;
            if (C13717b.m34258e(list)) {
                accountInvoicesActivity.f42712Z.mo4627l0(accountInvoicesActivity.f42710X);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size() + 1);
            if (oVar.f19596b) {
                arrayList.add(new C16352a.C16355c(1, (Invoice) null));
            }
            C13720d.m34276f(list, (C13722f) null, new C19752b(15), arrayList);
            accountInvoicesActivity.f42712Z.mo4627l0(new C16352a(accountInvoicesActivity, arrayList));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C12795d dVar;
            C17337n nVar = (C17337n) cVar;
            AccountInvoicesActivity accountInvoicesActivity = AccountInvoicesActivity.this;
            int i = AccountInvoicesActivity.f42708l0;
            accountInvoicesActivity.getClass();
            C0436m1 m1Var = new C0436m1(accountInvoicesActivity, 15);
            if (exc instanceof UserRequestError) {
                UserRequestError userRequestError = (UserRequestError) exc;
                dVar = new C12795d(accountInvoicesActivity, userRequestError.mo49162d(), userRequestError.mo49161c(), m1Var);
            } else {
                dVar = new C12795d(accountInvoicesActivity, (String) null, (String) null, m1Var);
            }
            accountInvoicesActivity.f42712Z.mo4627l0(dVar);
            return true;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.account_invoices_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(C25750e.recycler_view);
        this.f42712Z = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f42712Z.mo4593g(new C18665b(this, C25749d.divider_horizontal_full), -1);
        String string = getString(C25754i.payment_mot_my_bills_error_action);
        TextView textView = (TextView) findViewById(C25750e.support_view);
        textView.setText(getString(C25754i.payment_mot_my_bills_error, new Object[]{string}));
        C20964s0.m49104v(textView, string, new C16800a(this), new Object[0]);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo48999y2();
    }

    /* renamed from: y2 */
    public final void mo48999y2() {
        C13556a aVar = this.f42711Y;
        if (aVar != null) {
            aVar.cancel(true);
            this.f42711Y = null;
        }
        this.f42712Z.mo4627l0(new C12793c());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f42711Y = mo44527k2(C17337n.class.getName(), new C17337n(mo44548x1()), requestOptions, this.f42709U);
    }
}
