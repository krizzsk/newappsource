package com.moovit.ticketing.purchase.cart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.util.CurrencyAmount;
import ja0.C12791b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12885t;
import m80.C12887v;
import o00.C18665b;
import o00.C18669f;
import o00.C18670g;
import o00.C18671h;
import p001a0.C0016g;
import p019b0.C1426c;
import p304x.C7071l0;
import p376ax.C13543e;
import p453dw.C16740o;
import p543hq.C17474b;
import p597jy.C17979a;
import p669mz.C18490f;
import p750ql.C19138d;
import p756qt.C19176e;
import p785ry.C19382b;
import p923xs.C20566b;
import p926xv.C20628i;
import p977zz.C20963s;
import w50.C20283g;
import x80.C13239a;
import y50.C20703a;

public class PurchaseCartConfirmationActivity extends AbstractPaymentGatewayActivity implements PaymentGatewayFragment.C16322a {

    /* renamed from: o0 */
    public static final /* synthetic */ int f23266o0 = 0;

    /* renamed from: X */
    public final C7651a f23267X = new C7651a(C12870f.shopping_cart_empty_state);

    /* renamed from: Y */
    public final C7652b f23268Y = new C7652b(C12870f.add_cart_item_list_item);

    /* renamed from: Z */
    public PurchaseCartStep f23269Z;

    /* renamed from: l0 */
    public RecyclerView f23270l0;

    /* renamed from: m0 */
    public C13239a f23271m0;

    /* renamed from: n0 */
    public C20283g f23272n0;

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity$a */
    public class C7651a extends C18671h {
        public C7651a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((Button) onCreateViewHolder.itemView.findViewById(C12869e.add_button)).setOnClickListener(new C16740o(this, 22));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity$b */
    public class C7652b extends C18671h {
        public C7652b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((Button) onCreateViewHolder.itemView).setOnClickListener(new C17979a(this, 13));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity$c */
    public class C7653c extends C12791b<CartItem> {
        public C7653c(List<CartItem> list) {
            super(list, C12870f.purchase_cart_list_item, (C12791b.C12792a) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23840l(ja0.C12797f r18, java.lang.Object r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                com.moovit.ticketing.purchase.cart.CartItem r2 = (com.moovit.ticketing.purchase.cart.CartItem) r2
                android.view.View r3 = r1.itemView
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 2
                r4.<init>(r5)
                int r5 = m80.C12869e.cart_item_view
                android.view.View r5 = r1.mo39639f(r5)
                com.moovit.design.view.list.ListItemView r5 = (com.moovit.design.view.list.ListItemView) r5
                java.lang.String r6 = r2.f23259c
                r5.setTitle((java.lang.CharSequence) r6)
                int r6 = m80.C12869e.price_view
                android.view.View r6 = r1.mo39639f(r6)
                com.moovit.view.PriceView r6 = (com.moovit.view.PriceView) r6
                com.moovit.util.CurrencyAmount r7 = r2.f23262f
                com.moovit.util.CurrencyAmount r8 = r2.f23263g
                r9 = 0
                r6.mo24682a(r7, r8, r9)
                int r6 = m80.C12869e.quantity
                android.view.View r6 = r1.mo39639f(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                android.content.Context r7 = r3.getContext()
                int r8 = m80.C12873i.quantity_w_parameter
                int r10 = r2.f23260d
                android.content.Context r11 = r3.getContext()
                int r12 = m80.C12866b.colorOnSurface
                int r11 = p977zz.C20941h.m49043f(r12, r11)
                java.lang.String r12 = p977zz.C20964s0.f52718a
                java.util.Locale r12 = p977zz.C20930c.m49020b(r7)
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
                r16 = 0
                r14[r16] = r15
                java.lang.String r15 = "%d"
                java.lang.String r12 = java.lang.String.format(r12, r15, r14)
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r14[r16] = r10
                java.lang.String r7 = r7.getString(r8, r14)
                int r8 = r7.indexOf(r12)
                r10 = -1
                if (r8 != r10) goto L_0x0072
                goto L_0x0087
            L_0x0072:
                android.text.SpannableString r10 = new android.text.SpannableString
                r10.<init>(r7)
                android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
                r7.<init>(r11)
                int r11 = r12.length()
                int r11 = r11 + r8
                r12 = 33
                r10.setSpan(r7, r8, r11, r12)
                r7 = r10
            L_0x0087:
                r6.setText(r7)
                int r6 = m80.C12869e.action_remove
                android.view.View r6 = r1.mo39639f(r6)
                android.widget.Button r6 = (android.widget.Button) r6
                mv.c r7 = new mv.c
                r8 = 4
                r7.<init>(r8, r0, r2)
                r6.setOnClickListener(r7)
                boolean r7 = r2.f23264h
                if (r7 == 0) goto L_0x00a1
                r7 = 0
                goto L_0x00a5
            L_0x00a1:
                r16 = 8
                r7 = 8
            L_0x00a5:
                r6.setVisibility(r7)
                java.lang.String r6 = r2.f23261e
                int r7 = m80.C12869e.description
                android.view.View r7 = r1.mo39639f(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                if (r6 == 0) goto L_0x00ba
                r7.setText(r6)
                r4.add(r7)
            L_0x00ba:
                int r6 = m80.C12869e.info_view
                android.view.View r1 = r1.mo39639f(r6)
                com.moovit.design.view.list.ListItemView r1 = (com.moovit.design.view.list.ListItemView) r1
                com.moovit.util.InfoBoxData r2 = r2.f23265i
                if (r2 == 0) goto L_0x00e9
                com.moovit.image.model.Image r6 = r2.f23850b
                r1.setIcon((com.moovit.image.model.Image) r6)
                java.lang.String r6 = r2.f23851c
                r1.setTitle((java.lang.CharSequence) r6)
                java.lang.String r6 = r2.f23852d
                r1.setSubtitle((java.lang.CharSequence) r6)
                android.content.Context r3 = r3.getContext()
                com.moovit.util.ColorScheme r2 = r2.f23853e
                int r2 = r2.getColorAttrId()
                android.content.res.ColorStateList r2 = p977zz.C20941h.m49044g(r2, r3)
                p242s1.C6333d0.m15032t(r1, r2)
                r4.add(r1)
            L_0x00e9:
                boolean r1 = r4.isEmpty()
                r1 = r1 ^ r13
                if (r1 == 0) goto L_0x00ff
                int r1 = m80.C12873i.more_details
                r5.setSubtitle((int) r1)
                bu.b r1 = new bu.b
                r2 = 3
                r1.<init>(r2, r0, r5, r4)
                r5.setOnClickListener(r1)
                goto L_0x0105
            L_0x00ff:
                r5.setSubtitle((java.lang.CharSequence) r9)
                r5.setOnClickListener(r9)
            L_0x0105:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity.C7653c.mo23840l(ja0.f, java.lang.Object):void");
        }
    }

    /* renamed from: y2 */
    public static void m17482y2(PurchaseCartConfirmationActivity purchaseCartConfirmationActivity) {
        CartInfo value = purchaseCartConfirmationActivity.f23271m0.f32862c.getValue();
        if (value != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_more_clicked");
            purchaseCartConfirmationActivity.mo44545v2(aVar.mo49933a());
            purchaseCartConfirmationActivity.startActivity(PurchaseTicketActivity.m17465z2(purchaseCartConfirmationActivity, new PurchaseCartIntent(value.f23253b)));
        }
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        CartInfo value = this.f23271m0.f32862c.getValue();
        if (value == null) {
            return null;
        }
        return new PaymentGatewayInfo(this.f23269Z.f23278e, value.f23254c, (String) null, Collections.singletonMap("cart_context_id", value.f23253b));
    }

    /* renamed from: L */
    public final /* synthetic */ CharSequence mo23106L() {
        return null;
    }

    /* renamed from: M */
    public final /* synthetic */ void mo23107M() {
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        CartInfo value = this.f23271m0.f32862c.getValue();
        if (value == null || value.f23255d.isEmpty()) {
            return false;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog");
        mo44545v2(aVar.mo49933a());
        AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) this).mo47682k("abandon_cart_dialog");
        k.mo47676e(C12868d.img_information_sign, false);
        mo44530n2(k.mo47683l(C12873i.payment_cart_abandon_title).mo47678g(C12873i.payment_cart_abandon_message).mo47681j(C12873i.payment_cart_abandon_no).mo47680i(C12873i.payment_cart_abandon_yes).mo47673b());
        return true;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        PurchaseCartStep purchaseCartStep = (PurchaseCartStep) intent.getParcelableExtra("step");
        if (purchaseCartStep != null) {
            setIntent(intent);
            this.f23269Z = purchaseCartStep;
            C13239a aVar = this.f23271m0;
            aVar.f32862c.postValue(purchaseCartStep.f23279f);
            C20283g gVar = this.f23272n0;
            gVar.f51435i.postValue(this.f23269Z.f23280g);
        }
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        CurrencyAmount currencyAmount;
        C1426c cVar = new C1426c(8);
        if (paymentGatewayToken != null) {
            cVar.mo5766e(1, paymentGatewayToken);
        }
        CartInfo value = this.f23271m0.f32862c.getValue();
        if (value != null) {
            C20703a e = this.f23272n0.mo52454e();
            if (e != null) {
                currencyAmount = e.f52282f;
            } else {
                currencyAmount = null;
            }
            if (currencyAmount != null) {
                String str = e.f52279c;
                if (str != null) {
                    cVar.mo5766e(3, str);
                }
                mo44543u2((CharSequence) null);
                C13239a aVar = this.f23271m0;
                C19138d dVar = new C19138d(value.f23253b, currencyAmount, cVar);
                aVar.getClass();
                C18490f fVar = new C18490f();
                C12887v b = C12887v.m32668b();
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                Tasks.call(executorService, new C12885t(b)).onSuccessTask(executorService, new C7071l0(dVar, 18)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C19382b(2)).addOnCompleteListener((Executor) executorService, new C20628i(b, 5)).addOnSuccessListener((Executor) executorService, new C19176e(b, 2)).addOnCompleteListener(new C20963s(fVar));
                fVar.observe(this, new C20566b(this, 3));
            }
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.purchase_cart_confirmation_activity);
        PurchaseCartStep purchaseCartStep = (PurchaseCartStep) getIntent().getParcelableExtra("step");
        this.f23269Z = purchaseCartStep;
        if (purchaseCartStep != null) {
            this.f23272n0 = (C20283g) new C1026n0(this).mo4313a(C20283g.class);
            C13239a aVar = (C13239a) new C1026n0(this).mo4313a(C13239a.class);
            this.f23271m0 = aVar;
            aVar.f32862c.observe(this, new C13543e(this, 6));
            this.f23271m0.f32863d = this.f23272n0;
            RecyclerView recyclerView = (RecyclerView) findViewById(C12869e.recycler_view);
            this.f23270l0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.f23270l0.mo4593g(C18670g.m45652e(UiUtils.m40249h(getResources(), 16.0f)), -1);
            this.f23270l0.mo4593g(C18665b.m45644e(UiUtils.m40249h(getResources(), 16.0f)), -1);
            this.f23270l0.mo4593g(C18669f.m45651e(UiUtils.m40249h(getResources(), 16.0f)), -1);
            if (bundle == null) {
                C13239a aVar2 = this.f23271m0;
                aVar2.f32862c.postValue(this.f23269Z.f23279f);
                C20283g gVar = this.f23272n0;
                gVar.f51435i.postValue(this.f23269Z.f23280g);
                return;
            }
            return;
        }
        throw new IllegalStateException("Did you use PurchaseCartConfirmationActivity.createStartIntent(...)?");
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        Integer num;
        CartInfo value = this.f23271m0.f32862c.getValue();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_clicked");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.COUNT;
        if (value != null) {
            num = Integer.valueOf(value.f23255d.size());
        } else {
            num = null;
        }
        aVar.mo49944l(analyticsAttributeKey, num);
        return aVar;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("abandon_cart_dialog".equals(str)) {
            if (i == -2) {
                finish();
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirmation_dialog");
            aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, C0016g.m17G(i));
            mo44545v2(aVar.mo49933a());
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
