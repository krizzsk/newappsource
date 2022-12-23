package m50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c20.C13744a;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.payment.clearance.model.Bank;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import ja0.C12791b;
import ja0.C12797f;
import java.util.ArrayList;
import p304x.C7038d0;
import p543hq.C17474b;
import v40.C25751f;
import v40.C25754i;

/* renamed from: m50.a */
public class C18323a extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f46730q = 0;

    /* renamed from: n */
    public CreditCardInstructions f46731n;

    /* renamed from: o */
    public String f46732o;

    /* renamed from: p */
    public int f46733p;

    /* renamed from: m50.a$a */
    public class C18324a extends C12791b<Bank> {
        public C18324a(C18323a aVar, ArrayList arrayList) {
            super(arrayList, C25751f.buckaroo_bank_item, new C7038d0(aVar, 19));
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            Bank bank = (Bank) obj;
            TextView textView = (TextView) fVar.itemView;
            C13744a.m34299a(textView, UiUtils.Edge.LEFT, bank.f42602e);
            textView.setText(bank.f42601d);
        }
    }

    /* renamed from: m50.a$b */
    public interface C18325b {
        /* renamed from: h0 */
        void mo50775h0(Bank bank);
    }

    public C18323a() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static C18323a m45100m2(CreditCardInstructions creditCardInstructions, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instructions", creditCardInstructions);
        bundle.putString(LinksConfiguration.KEY_KEY, "BuckarooIdealBanks");
        bundle.putInt("type", i);
        C18323a aVar = new C18323a();
        aVar.setArguments(bundle);
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f46731n = (CreditCardInstructions) Q1.getParcelable("instructions");
        String string = Q1.getString(LinksConfiguration.KEY_KEY);
        this.f46732o = string;
        if (this.f46731n == null || string == null) {
            throw new ApplicationBugException("Did you use BuckarooBankChooserFragment.newInstance(...)?");
        }
        int i = Q1.getInt("type");
        this.f46733p = i;
        if (i == 0) {
            throw new ApplicationBugException("Did you use BuckarooBankPaymentMethodChooserFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.buckaroo_bank_chooser_fragment, viewGroup, false);
    }

    public final void onStart() {
        String str;
        super.onStart();
        this.f40822c.setTitle(C25754i.payment_registration_select_bank_title);
        if (this.f46733p == 2) {
            str = "ideal_bank_selection_shown";
        } else {
            str = "sepa_bank_selection_shown";
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo46797j2(aVar.mo49933a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            super.onViewCreated(r4, r5)
            int r5 = v40.C25750e.recycler_view
            android.view.View r4 = r4.findViewById(r5)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r3.requireContext()
            r5.<init>(r0)
            r4.setLayoutManager(r5)
            o00.b r5 = new o00.b
            android.content.Context r0 = r3.requireContext()
            int r1 = v40.C25749d.divider_horizontal
            r5.<init>(r0, r1)
            r0 = -1
            r4.mo4593g(r5, r0)
            com.moovit.payment.registration.steps.cc.CreditCardInstructions r5 = r3.f46731n
            java.lang.String r0 = r3.f46732o
            com.moovit.payment.clearance.model.ClearanceProviderInstructions r5 = r5.f42774c
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f42606d
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = p977zz.C20964s0.m49090h(r5)
            r1 = 0
            if (r0 != 0) goto L_0x005d
            byte[] r5 = r5.getBytes()
            r0 = 0
            byte[] r5 = android.util.Base64.decode(r5, r0)
            java.lang.Class<com.tranzmate.moovit.protocol.payments.MVClearanceBankInfo> r0 = com.tranzmate.moovit.protocol.payments.MVClearanceBankInfo.class
            org.apache.thrift.TBase r5 = ce0.C21100e.m49324S(r0, r5)
            com.tranzmate.moovit.protocol.payments.MVClearanceBankInfo r5 = (com.tranzmate.moovit.protocol.payments.MVClearanceBankInfo) r5
            if (r5 != 0) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            java.util.List<com.tranzmate.moovit.protocol.payments.MVClearanceBank> r5 = r5.banks
            a8.l r0 = new a8.l
            r2 = 14
            r0.<init>(r2)
            java.util.ArrayList r5 = c00.C13720d.m34273c(r5, r1, r0)
            goto L_0x005e
        L_0x005d:
            r5 = r1
        L_0x005e:
            boolean r0 = c00.C13717b.m34258e(r5)
            if (r0 == 0) goto L_0x0086
            android.content.Context r5 = r3.requireContext()
            java.lang.String r0 = "context"
            ce0.C21100e.m49373x(r5, r0)
            int r0 = v40.C25749d.img_empty_error
            android.graphics.drawable.Drawable r0 = k00.C17988b.m44611b(r0, r5)
            int r2 = v40.C25754i.response_read_error_message
            if (r2 != 0) goto L_0x0079
            r5 = r1
            goto L_0x007d
        L_0x0079:
            java.lang.CharSequence r5 = r5.getText(r2)
        L_0x007d:
            z00.a r2 = new z00.a
            r2.<init>(r0, r1, r5)
            r4.mo4627l0(r2)
            goto L_0x008e
        L_0x0086:
            m50.a$a r0 = new m50.a$a
            r0.<init>(r3, r5)
            r4.setAdapter(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m50.C18323a.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
