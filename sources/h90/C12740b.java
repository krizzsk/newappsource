package h90;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c20.C13744a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.util.CurrencyAmount;
import f90.C12645e;
import f90.C12646f;
import g70.C4843a;
import h60.C17327j1;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import m80.C12866b;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12887v;
import p009a8.C0111k;
import p019b0.C1436m;
import p244s3.C6444s;
import p244s3.C6445t;
import p310x5.C7156a;
import p543hq.C17474b;
import p80.C12989a;
import p80.C12991b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20941h;
import s90.C13076d;

/* renamed from: h90.b */
public class C12740b extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f31473s = 0;

    /* renamed from: n */
    public final C12741a f31474n = new C12741a();

    /* renamed from: o */
    public final C12742b f31475o = new C12742b();

    /* renamed from: p */
    public final C12743c f31476p = new C12743c();

    /* renamed from: q */
    public SwipeRefreshLayout f31477q;

    /* renamed from: r */
    public RecyclerView f31478r;

    /* renamed from: h90.b$a */
    public class C12741a extends C20438i<C12645e, C12646f> {
        public C12741a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C12645e eVar = (C12645e) cVar;
            C12646f fVar = (C12646f) gVar;
            Toast.makeText(C12740b.this.getContext(), C12740b.this.getResources().getString(C12873i.payment_autoload_toggle_off), 0).show();
            C12740b bVar = C12740b.this;
            int i = C12740b.f31473s;
            bVar.mo39539m2(true);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C12645e eVar = (C12645e) cVar;
            C12740b.this.f31476p.notifyDataSetChanged();
            return false;
        }
    }

    /* renamed from: h90.b$b */
    public class C12742b extends BroadcastReceiver {
        public C12742b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C12740b bVar = C12740b.this;
            int i = C12740b.f31473s;
            bVar.mo39539m2(false);
        }
    }

    /* renamed from: h90.b$c */
    public class C12743c extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final ArrayList f31481g = new ArrayList();

        public C12743c() {
        }

        public final int getItemCount() {
            return this.f31481g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            boolean z2;
            C12797f fVar = (C12797f) a0Var;
            C12739a aVar = (C12739a) this.f31481g.get(i);
            StoredValueStatus storedValueStatus = aVar.f31470d;
            C12989a a = ((C12991b) C12740b.this.mo46776J1("TICKETING_CONFIGURATION")).mo39880a(aVar.f31467a, aVar.f31468b.f23495b);
            if (a == null || !a.f32153e.contains(TicketingAgencyCapability.STORED_VALUE)) {
                z = false;
            } else {
                z = true;
            }
            if (a == null || !a.f32153e.contains(TicketingAgencyCapability.STORED_VALUE_AUTO_LOAD)) {
                z2 = false;
            } else {
                z2 = true;
            }
            MaterialCardView materialCardView = (MaterialCardView) fVar.itemView;
            materialCardView.setClickable(z);
            materialCardView.setOnClickListener(new C7156a(8, this, aVar));
            C13744a.m34300b((ImageView) fVar.mo39639f(C12869e.agency_icon), aVar.f31468b.mo24222b());
            ((TextView) fVar.mo39639f(C12869e.agency_name)).setText(aVar.f31468b.mo24223c());
            TextView textView = (TextView) fVar.mo39639f(C12869e.balance);
            textView.setText(aVar.f31469c.toString());
            textView.setTextColor(C20941h.m49043f(storedValueStatus.colorAttrId, fVar.mo39638e()));
            TextView textView2 = (TextView) fVar.mo39639f(C12869e.status_view);
            C15780a.m40272e(textView2, storedValueStatus.iconResId);
            int i2 = 4;
            UiUtils.m40235C(textView2, storedValueStatus.textResId, 4);
            View f = fVar.mo39639f(C12869e.topup);
            if (z) {
                i2 = 0;
            }
            f.setVisibility(i2);
            View f2 = fVar.mo39639f(C12869e.divider);
            SwitchMaterial switchMaterial = (SwitchMaterial) fVar.mo39639f(C12869e.auto_load);
            if (z2) {
                boolean z3 = aVar.f31471e;
                CurrencyAmount currencyAmount = aVar.f31472f;
                switchMaterial.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                switchMaterial.setChecked(z3);
                switchMaterial.setOnCheckedChangeListener(new C12744c(this, aVar, switchMaterial));
                if (!z3) {
                    switchMaterial.setText(C12873i.payment_autoload_toggle_off);
                } else if (currencyAmount == null) {
                    switchMaterial.setText(C12873i.payment_autoload_toggle_on_no_sum);
                } else {
                    switchMaterial.setText(C12740b.this.getString(C12873i.payment_autoload_toggle_on, currencyAmount));
                }
                switchMaterial.setImportantForAccessibility(1);
                UiUtils.m40238F(0, f2, switchMaterial);
                return;
            }
            UiUtils.m40238F(8, f2, switchMaterial);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.stored_value_list_item, viewGroup, false));
        }
    }

    public C12740b() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TICKETING_CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo39539m2(false);
    }

    /* renamed from: m2 */
    public final void mo39539m2(boolean z) {
        if (isResumed() && mo46775H1()) {
            A a = this.f40822c;
            Task<C13076d> g = C12887v.m32668b().mo39736g(z);
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            g.onSuccessTask(executorService, new C0111k(8)).onSuccessTask(executorService, new C1436m((C12991b) mo46776J1("TICKETING_CONFIGURATION"), 12)).addOnSuccessListener((Activity) a, new C6444s(this, 7)).addOnFailureListener((Activity) a, (OnFailureListener) new C6445t(this, 2)).addOnCompleteListener((Activity) a, new C4843a(this, 3));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2505) {
            Context context = getContext();
            if (i2 == -1 && context != null) {
                Toast.makeText(context, context.getString(C12873i.payment_autoload_screen_success), 0).show();
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(C12870f.stored_values_list_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C12869e.swipe_refresh_layout);
        this.f31477q = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(C12866b.colorSecondary, inflate.getContext()));
        this.f31477q.setOnRefreshListener(new C17327j1(this, 25));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f31478r = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.f31478r.setAdapter(new C12793c());
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        mo39539m2(false);
    }

    public final void onStart() {
        super.onStart();
        C12887v.m32673k(requireContext(), this.f31475o);
    }

    public final void onStop() {
        super.onStop();
        C12887v.m32674l(requireContext(), this.f31475o);
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("disable_auto_load_dialog_tag".equals(str)) {
            ServerId serverId = (ServerId) bundle.getParcelable("providerId");
            String string = bundle.getString("agencyKey");
            if (i != -1 || serverId == null || string == null) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
                mo46797j2(aVar.mo49933a());
                this.f31476p.notifyDataSetChanged();
            } else {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ok_clicked");
                mo46797j2(aVar2.mo49933a());
                C12645e eVar = new C12645e(mo46783R1(), serverId, string);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C12645e.class, sb, "#");
                sb.append(eVar.f31260w.f15142b);
                sb.append("#");
                sb.append(eVar.f31261x.hashCode());
                String sb2 = sb.toString();
                RequestOptions L1 = mo46777L1();
                L1.f42909f = true;
                mo46793f2(sb2, eVar, L1, this.f31474n);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
