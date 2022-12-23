package com.moovit.payment.account.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.C0207b;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import b60.C13571b;
import c70.C13751d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.paymentmethod.C25692a;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import com.moovit.payment.clearance.CreditCard3DSException;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.CreditCardPreview;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l50.C18171b;
import p054d0.C4314v;
import p065e.C4413c;
import p115i0.C5227c;
import p176n0.C5789h;
import p304x.C7121y;
import p376ax.C13543e;
import p543hq.C17474b;
import p644lx.C18284b;
import p909xe.C20466c;
import p977zz.C20961r;
import p977zz.C20963s;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25752g;
import v40.C25754i;

public class DepositActivity extends MoovitPaymentActivity implements PaymentMethod.C25688a<Void, Void>, C25692a.C25693a, C18171b.C18172a, C13571b.C13573b {

    /* renamed from: m0 */
    public static final /* synthetic */ int f63947m0 = 0;

    /* renamed from: U */
    public final C0207b<Intent> f63948U = registerForActivityResult(new C4413c(), new C4314v(this, 13));

    /* renamed from: X */
    public C25643a f63949X;

    /* renamed from: Y */
    public ListItemView f63950Y;

    /* renamed from: Z */
    public TextView f63951Z;

    /* renamed from: l0 */
    public Button f63952l0;

    /* renamed from: com.moovit.payment.account.deposit.DepositActivity$a */
    public class C25639a implements C1044w<C20961r<C25643a.C25646c>> {

        /* renamed from: a */
        public final /* synthetic */ LiveData f63953a;

        public C25639a(C1043v vVar) {
            this.f63953a = vVar;
        }

        public final void onChanged(Object obj) {
            C20961r rVar = (C20961r) obj;
            this.f63953a.removeObserver(this);
            if (rVar.f52711a) {
                DepositActivity.m64083y2(DepositActivity.this, (C25643a.C25646c) rVar.f52712b);
            } else {
                DepositActivity.m64084z2(DepositActivity.this, rVar.f52713c);
            }
        }
    }

    /* renamed from: com.moovit.payment.account.deposit.DepositActivity$b */
    public class C25640b implements C1044w<C20961r<C25643a.C25646c>> {

        /* renamed from: a */
        public final /* synthetic */ LiveData f63955a;

        public C25640b(C1043v vVar) {
            this.f63955a = vVar;
        }

        public final void onChanged(Object obj) {
            C20961r rVar = (C20961r) obj;
            this.f63955a.removeObserver(this);
            if (rVar.f52711a) {
                DepositActivity.m64083y2(DepositActivity.this, (C25643a.C25646c) rVar.f52712b);
            } else {
                DepositActivity.m64084z2(DepositActivity.this, rVar.f52713c);
            }
        }
    }

    /* renamed from: y2 */
    public static void m64083y2(DepositActivity depositActivity, C25643a.C25646c cVar) {
        depositActivity.getClass();
        CreditCardPaymentMethod creditCardPaymentMethod = cVar.f63971a;
        if (creditCardPaymentMethod != null) {
            C13571b bVar = new C13571b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("paymentMethod", creditCardPaymentMethod);
            bVar.setArguments(bundle);
            bVar.show(depositActivity.getSupportFragmentManager(), "payment_extra_info_cvv");
            return;
        }
        depositActivity.finish();
    }

    /* renamed from: z2 */
    public static void m64084z2(DepositActivity depositActivity, Exception exc) {
        depositActivity.getClass();
        if (exc instanceof CreditCard3DSException) {
            ((CreditCard3DSException) exc).mo48844a().show(depositActivity.getSupportFragmentManager(), "3ds_verification_dialog");
        } else {
            depositActivity.mo44530n2(C13751d.m34341b(depositActivity, (String) null, exc));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.moovit.payment.account.deposit.a$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83440A2(java.lang.String r9) {
        /*
            r8 = this;
            com.moovit.payment.account.deposit.a r0 = r8.f63949X
            r0.getClass()
            androidx.lifecycle.v r1 = new androidx.lifecycle.v
            r1.<init>()
            androidx.lifecycle.v<com.moovit.payment.account.deposit.DepositInstructions> r2 = r0.f63965e
            java.lang.Object r2 = r2.getValue()
            com.moovit.payment.account.deposit.DepositInstructions r2 = (com.moovit.payment.account.deposit.DepositInstructions) r2
            if (r2 != 0) goto L_0x0024
            zz.r r9 = new zz.r
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing Deposit instructions."
            r0.<init>(r2)
            r9.<init>((java.lang.Exception) r0)
            r1.setValue(r9)
            goto L_0x008b
        L_0x0024:
            androidx.lifecycle.t<com.moovit.payment.account.paymentmethod.PaymentMethod> r3 = r0.f63969i
            java.lang.Object r3 = r3.getValue()
            com.moovit.payment.account.paymentmethod.PaymentMethod r3 = (com.moovit.payment.account.paymentmethod.PaymentMethod) r3
            if (r3 != 0) goto L_0x003e
            zz.r r9 = new zz.r
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing payment method."
            r0.<init>(r2)
            r9.<init>((java.lang.Exception) r0)
            r1.setValue(r9)
            goto L_0x008b
        L_0x003e:
            boolean r4 = r2.f63962f
            r5 = 0
            if (r4 == 0) goto L_0x004e
            if (r9 != 0) goto L_0x004e
            com.moovit.payment.account.deposit.a$b r4 = r0.f63964d
            java.lang.Object r4 = r3.mo83416b(r4, r5)
            r5 = r4
            com.moovit.payment.account.deposit.a$c r5 = (com.moovit.payment.account.deposit.C25643a.C25646c) r5
        L_0x004e:
            if (r5 == 0) goto L_0x0059
            zz.r r9 = new zz.r
            r9.<init>(r5)
            r1.setValue(r9)
            goto L_0x008b
        L_0x0059:
            java.lang.String r4 = "deposit"
            java.lang.String r5 = "3ds"
            com.moovit.payment.registration.steps.cc.WebInstruction r4 = com.moovit.payment.registration.steps.p419cc.WebInstruction.m41734b(r4, r5)
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.f37327IO
            s3.w r6 = new s3.w
            r7 = 4
            r6.<init>(r0, r7)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r5, r6)
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.COMPUTATION
            b50.h r6 = new b50.h
            r6.<init>(r2, r3, r4, r9)
            com.google.android.gms.tasks.Task r9 = r0.onSuccessTask(r5, r6)
            com.facebook.appevents.l r0 = new com.facebook.appevents.l
            r2 = 13
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r9 = r9.onSuccessTask(r5, r0)
            zz.s r0 = new zz.s
            r0.<init>(r1)
            r9.addOnCompleteListener((java.util.concurrent.Executor) r5, r0)
        L_0x008b:
            com.moovit.payment.account.deposit.DepositActivity$a r9 = new com.moovit.payment.account.deposit.DepositActivity$a
            r9.<init>(r1)
            r1.observe(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.deposit.DepositActivity.mo83440A2(java.lang.String):void");
    }

    /* renamed from: C1 */
    public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
        int i;
        Void voidR = (Void) obj;
        ListItemView listItemView = this.f63950Y;
        if (listItemView == null) {
            return null;
        }
        CreditCardPreview creditCardPreview = creditCardPaymentMethod.f63943e;
        String string = getString(C25754i.format_last_digits, new Object[]{creditCardPreview.f24083c});
        boolean equals = PaymentMethodStatus.EXPIRED.equals(creditCardPaymentMethod.f64054d);
        listItemView.setIcon(creditCardPreview.f24082b.iconResId);
        if (equals) {
            i = C25749d.ic_alert_ring_16_error;
        } else {
            i = 0;
        }
        listItemView.setIconTopEndDecorationDrawable(i);
        listItemView.setTitle(C25754i.purchase_ticket_confirmation_payment_method);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        if (equals) {
            listItemView.setSubtitle((CharSequence) getString(C25754i.credit_card_expiration_with_latest_digits, new Object[]{string}));
            listItemView.setSubtitleThemeTextColor(C25748c.colorError);
            return null;
        }
        listItemView.setSubtitle((CharSequence) string);
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
        return null;
    }

    /* renamed from: E0 */
    public final void mo24144E0(CreditCardPaymentMethod creditCardPaymentMethod, String str) {
        mo83440A2(str);
    }

    /* renamed from: K0 */
    public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
        Void voidR = (Void) obj;
        ListItemView listItemView = this.f63950Y;
        if (listItemView == null) {
            return null;
        }
        ExternalPaymentMethodPreview externalPaymentMethodPreview = externalPaymentMethod.f64007e;
        listItemView.setIcon(externalPaymentMethodPreview.f64009b);
        String str = externalPaymentMethodPreview.f64010c;
        listItemView.setTitle((CharSequence) str);
        if (str != null) {
            listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
            listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        }
        String str2 = externalPaymentMethodPreview.f64011d;
        listItemView.setSubtitle((CharSequence) str2);
        if (str2 == null) {
            return null;
        }
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
        return null;
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(C25752g.deposit_activity_menu, menu);
        return true;
    }

    /* renamed from: V */
    public final void mo50589V(CreditCardToken creditCardToken, String str) {
        C25643a aVar = this.f63949X;
        aVar.getClass();
        C1043v vVar = new C1043v();
        DepositInstructions value = aVar.f63965e.getValue();
        if (value == null) {
            vVar.setValue(new C20961r((Exception) new IllegalStateException("Missing Deposit instructions.")));
        } else {
            PaymentMethod value2 = aVar.f63969i.getValue();
            if (value2 == null) {
                vVar.setValue(new C20961r((Exception) new IllegalStateException("Missing payment method.")));
            } else {
                Task call = Tasks.call(MoovitExecutors.f37327IO, new C20466c(aVar, 2));
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                call.onSuccessTask(executorService, new C5789h(1, value, value2, creditCardToken)).onSuccessTask(executorService, new C5227c(18)).addOnCompleteListener((Executor) executorService, new C20963s(vVar));
            }
        }
        vVar.observe(this, new C25640b(vVar));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.deposit_activity);
        ListItemView listItemView = (ListItemView) findViewById(C25750e.payment_method_view);
        this.f63950Y = listItemView;
        listItemView.setOnClickListener(new C18284b(this, 8));
        this.f63951Z = (TextView) findViewById(C25750e.subtitle);
        this.f63952l0 = (Button) findViewById(C25750e.deposit_button);
        DepositInstructions depositInstructions = (DepositInstructions) getIntent().getParcelableExtra("depositInstructions");
        if (depositInstructions != null) {
            C25643a aVar = (C25643a) new C1026n0(this).mo4313a(C25643a.class);
            this.f63949X = aVar;
            aVar.f63967g.observe(this, new C7121y(this, 5));
            this.f63949X.f63969i.observe(this, new C13543e(this, 1));
            if (bundle == null) {
                this.f63949X.f63965e.postValue(depositInstructions);
                return;
            }
            return;
        }
        throw new IllegalStateException("Did you use DepositActivity.createStartIntent(...)");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C25750e.more_info) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "more_info_clicked");
        mo44545v2(aVar.mo49933a());
        new AlertDialogFragment.C15856a((Context) this).mo47682k("action_confirmation_dialog").mo47678g(C25754i.reservation_deposit_explanation).mo47681j(C25754i.got_it).mo47673b().show(getSupportFragmentManager(), "more_information_dialog");
        return true;
    }

    /* renamed from: s0 */
    public final void mo83441s0() {
        DepositInstructions value = this.f63949X.f63965e.getValue();
        if (value != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_add_clicked");
            mo44545v2(aVar.mo49933a());
            this.f63948U.mo772a(PaymentCreditCardActivity.m64074y2(this, value.f63961e, CreditCardRequest.Action.ADD, false, C25754i.payment_registration_add_card_title, C25754i.payment_registration_add_card_deposit_subtitle));
        }
    }

    /* renamed from: u */
    public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
        Void voidR = (Void) obj;
        ListItemView listItemView = this.f63950Y;
        if (listItemView == null) {
            return null;
        }
        BalancePreview balancePreview = balancePaymentMethod.f63926e;
        listItemView.setIcon(balancePreview.f63928b);
        listItemView.setTitle((CharSequence) balancePreview.f63929c);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBody);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurfaceEmphasisMedium);
        listItemView.setSubtitle((CharSequence) balancePreview.f63930d.toString());
        listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurface);
        return null;
    }

    /* renamed from: x0 */
    public final void mo83442x0(PaymentMethod paymentMethod) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_clicked");
        mo44545v2(aVar.mo49933a());
        this.f63949X.f63968h.postValue(paymentMethod);
    }

    /* renamed from: z0 */
    public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
        Void voidR = (Void) obj;
        ListItemView listItemView = this.f63950Y;
        if (listItemView == null) {
            return null;
        }
        BankPreview bankPreview = bankPaymentMethod.f63932e;
        listItemView.setIcon(bankPreview.f63935c);
        listItemView.setTitle(C25754i.purchase_ticket_confirmation_payment_method);
        listItemView.setTitleThemeTextAppearance(C25748c.textAppearanceBodyStrong);
        listItemView.setTitleThemeTextColor(C25748c.colorOnSurface);
        listItemView.setSubtitle(C20964s0.m49099q(" ", bankPreview.f63934b, bankPreview.f63936d));
        listItemView.setSubtitleThemeTextAppearance(C25748c.textAppearanceCaption);
        listItemView.setSubtitleThemeTextColor(C25748c.colorOnSurfaceEmphasisHigh);
        return null;
    }
}
