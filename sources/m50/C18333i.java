package m50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import ja0.C12797f;
import java.util.HashSet;
import java.util.List;
import n50.C18522a;
import o00.C18665b;
import o00.C18680m;
import p543hq.C17474b;
import p597jy.C17979a;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: m50.i */
public class C18333i extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f46750s = 0;

    /* renamed from: n */
    public boolean f46751n;

    /* renamed from: o */
    public HashSet f46752o;

    /* renamed from: p */
    public C18335b f46753p;

    /* renamed from: q */
    public CheckBox f46754q;

    /* renamed from: r */
    public Button f46755r;

    /* renamed from: m50.i$a */
    public interface C18334a {
        /* renamed from: u0 */
        void mo50787u0(int i);
    }

    /* renamed from: m50.i$b */
    public class C18335b extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C18336a f46756g = new C18336a();

        /* renamed from: h */
        public final List<Integer> f46757h;

        /* renamed from: i */
        public int f46758i = -1;

        /* renamed from: m50.i$b$a */
        public class C18336a implements View.OnClickListener {
            public C18336a() {
            }

            public final void onClick(View view) {
                int intValue = ((Integer) view.getTag()).intValue();
                C18335b bVar = C18335b.this;
                int i = bVar.f46758i;
                bVar.f46758i = intValue;
                if (i != -1) {
                    bVar.notifyItemChanged(i);
                }
                C18335b bVar2 = C18335b.this;
                bVar2.notifyItemChanged(bVar2.f46758i);
                C18335b bVar3 = C18335b.this;
                C18333i iVar = C18333i.this;
                int intValue2 = bVar3.f46757h.get(bVar3.f46758i).intValue();
                int i2 = C18333i.f46750s;
                iVar.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, C13555b.m33978r(intValue2));
                iVar.mo46797j2(aVar.mo49933a());
                if (iVar.f46751n) {
                    boolean contains = iVar.f46752o.contains(Integer.valueOf(intValue2));
                    iVar.f46754q.setEnabled(contains);
                    if (!contains) {
                        iVar.f46754q.setChecked(false);
                    }
                }
                iVar.f46755r.setEnabled(true);
            }
        }

        public C18335b(List<Integer> list) {
            C21100e.m49373x(list, "supportedMethods");
            this.f46757h = list;
        }

        public final int getItemCount() {
            return this.f46757h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(Integer.valueOf(i));
            if (this.f46758i == i) {
                z = true;
            } else {
                z = false;
            }
            listItemView.setChecked(z);
            int intValue = this.f46757h.get(i).intValue();
            switch (intValue) {
                case 1:
                    listItemView.setIcon(C25749d.img_credit_card);
                    listItemView.setTitle(C25754i.payment_registration_credit_card_title);
                    return;
                case 2:
                    listItemView.setIcon(C25749d.img_logo_ideal);
                    listItemView.setTitle(C25754i.payment_registration_ideal_title);
                    return;
                case 3:
                    listItemView.setIcon(C25749d.img_logo_bancontact);
                    listItemView.setTitle(C25754i.payment_registration_bancontact_title);
                    return;
                case 4:
                    listItemView.setIcon(C25749d.img_logo_giropay);
                    listItemView.setTitle(C25754i.payment_registration_giropay_title);
                    return;
                case 5:
                    listItemView.setIcon(C25749d.img_logo_sofort);
                    listItemView.setTitle(C25754i.payment_registration_sofort_title);
                    return;
                case 6:
                    listItemView.setIcon(C25749d.img_logo_paypal);
                    listItemView.setTitle(C25754i.payment_registration_paypal_title);
                    return;
                case 7:
                    listItemView.setIcon(C25749d.img_logo_sepa);
                    listItemView.setTitle(C25754i.payment_registration_sepa_title);
                    return;
                default:
                    throw new ApplicationBugException(C16759e.m42349e("Unknown payment method: ", intValue));
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_buckaroo_chooser_item, viewGroup, false);
            inflate.setOnClickListener(this.f46756g);
            return new C12797f(inflate);
        }
    }

    public C18333i() {
        super(MoovitActivity.class);
    }

    /* renamed from: n2 */
    public static C18333i m45129n2(CreditCardInstructions creditCardInstructions, String str, CharSequence charSequence, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instructions", creditCardInstructions);
        bundle.putString("title", str);
        bundle.putCharSequence("subtitle", charSequence);
        bundle.putBoolean("isSaveSelectionSupported", z);
        C18333i iVar = new C18333i();
        iVar.setArguments(bundle);
        return iVar;
    }

    /* renamed from: m2 */
    public final Boolean mo50788m2() {
        if (this.f46751n) {
            return Boolean.valueOf(this.f46754q.isChecked());
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        CreditCardInstructions creditCardInstructions = (CreditCardInstructions) Q1.getParcelable("instructions");
        if (creditCardInstructions != null) {
            this.f46751n = Q1.getBoolean("isSaveSelectionSupported");
            this.f46752o = new HashSet(C18522a.m45409a(creditCardInstructions.f42774c.f42606d.get("buckarooSaveEnabledPaymentMethodsKey")));
            this.f46753p = new C18335b(C18522a.m45409a(creditCardInstructions.f42774c.f42606d.get("buckarooSupportedPaymentMethodsKey")));
            return;
        }
        throw new ApplicationBugException("Did you use BuckarooPaymentMethodChooserFragment.newInstance(...)?");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_buckaroo_chooser_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CheckBox checkBox = this.f46754q;
        if (checkBox != null) {
            bundle.putBoolean("isSaveChecked", checkBox.isChecked());
        }
    }

    public final void onStart() {
        super.onStart();
        this.f40822c.setTitle("");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_method_selection_shown");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        Bundle Q1 = mo46782Q1();
        UiUtils.m40234B((TextView) view.findViewById(C25750e.title), Q1.getString("title"));
        UiUtils.m40234B((TextView) view.findViewById(C25750e.subtitle), Q1.getCharSequence("subtitle"));
        CheckBox checkBox = (CheckBox) view.findViewById(C25750e.saveButton);
        this.f46754q = checkBox;
        if (this.f46751n) {
            i = 0;
        } else {
            i = 8;
        }
        checkBox.setVisibility(i);
        if (bundle != null) {
            this.f46754q.setChecked(bundle.getBoolean("isSaveChecked"));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C25750e.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.mo4593g(new C18665b(recyclerView.getContext(), C25749d.divider_horizontal), -1);
        recyclerView.setAdapter(new ConcatAdapter(this.f46753p, new C18680m(C25751f.payment_buckaroo_chooser_footer, getResources().getString(C25754i.payment_one_off_partner))));
        Button button = (Button) view.findViewById(C25750e.continue_button);
        this.f46755r = button;
        button.setOnClickListener(new C17979a(this, 9));
    }
}
