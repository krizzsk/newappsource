package com.moovit.payment.account.actions;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.card.MaterialCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.actions.model.OptionSelectionStep;
import com.moovit.payment.account.actions.model.OptionSelectionStepResult;
import com.moovit.payment.account.actions.model.PresentationType;
import com.moovit.payment.account.actions.model.SelectionOption;
import com.moovit.util.PriceInfo;
import com.moovit.view.PriceView;
import ja0.C12790a;
import ja0.C12797f;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import o00.C18665b;
import p216q1.C6133b;
import p543hq.C17474b;
import p644lx.C18284b;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import x40.C25767a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/AccountActionSelectionStepFragment;", "Lx40/a;", "<init>", "()V", "OptionsAdapter", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountActionSelectionStepFragment extends C25767a {

    /* renamed from: q */
    public static final /* synthetic */ int f63858q = 0;

    /* renamed from: n */
    public OptionsAdapter f63859n;

    /* renamed from: o */
    public Button f63860o;

    /* renamed from: p */
    public final C21049c f63861p = C23812a.m58432b(new AccountActionSelectionStepFragment$selectionStep$2(this));

    public final class OptionsAdapter extends C12790a<SelectionOption> {

        /* renamed from: h */
        public final PresentationType f63862h;

        /* renamed from: i */
        public int f63863i;

        /* renamed from: j */
        public final C21049c f63864j = C23812a.m58432b(new C25613x8f1c3ca5(this));

        /* renamed from: k */
        public final C21049c f63865k = C23812a.m58432b(new C25614xd72ff027(this));

        /* renamed from: l */
        public final /* synthetic */ AccountActionSelectionStepFragment f63866l;

        /* renamed from: com.moovit.payment.account.actions.AccountActionSelectionStepFragment$OptionsAdapter$a */
        public /* synthetic */ class C25611a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63867a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.moovit.payment.account.actions.model.PresentationType[] r0 = com.moovit.payment.account.actions.model.PresentationType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.moovit.payment.account.actions.model.PresentationType r1 = com.moovit.payment.account.actions.model.PresentationType.INDICATORS     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.moovit.payment.account.actions.model.PresentationType r1 = com.moovit.payment.account.actions.model.PresentationType.CARDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f63867a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.actions.AccountActionSelectionStepFragment.OptionsAdapter.C25611a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OptionsAdapter(AccountActionSelectionStepFragment accountActionSelectionStepFragment, List<SelectionOption> list, PresentationType presentationType, int i) {
            super(list);
            C24362h.m61211f(list, "options");
            C24362h.m61211f(presentationType, "type");
            this.f63866l = accountActionSelectionStepFragment;
            this.f63862h = presentationType;
            this.f63863i = i;
        }

        /* renamed from: l */
        public static final void m64041l(OptionsAdapter optionsAdapter, int i) {
            int i2 = optionsAdapter.f63863i;
            optionsAdapter.f63863i = i;
            if (i2 != -1) {
                optionsAdapter.notifyItemChanged(i2);
            }
            Object j = optionsAdapter.mo39636j(i);
            C24362h.m61210e(j, "get(position)");
            SelectionOption selectionOption = (SelectionOption) j;
            AccountActionSelectionStepFragment accountActionSelectionStepFragment = optionsAdapter.f63866l;
            int i3 = AccountActionSelectionStepFragment.f63858q;
            accountActionSelectionStepFragment.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "list_item_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.ID, selectionOption.f63918b);
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, accountActionSelectionStepFragment.mo83341p2().f63894c);
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, selectionOption.f63920d);
            accountActionSelectionStepFragment.mo46797j2(aVar.mo49933a());
            Button button = accountActionSelectionStepFragment.f63860o;
            if (button != null) {
                button.setEnabled(true);
            } else {
                C24362h.m61217l("actionView");
                throw null;
            }
        }

        public final int getItemViewType(int i) {
            int i2 = C25611a.f63867a[this.f63862h.ordinal()];
            if (i2 == 1) {
                return C25751f.account_action_option_selection_item;
            }
            if (i2 == 2) {
                return C25751f.account_action_option_selection_payment_item;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            C24362h.m61211f(fVar, "holder");
            Object j = mo39636j(i);
            C24362h.m61210e(j, "get(position)");
            SelectionOption selectionOption = (SelectionOption) j;
            int i2 = C25611a.f63867a[this.f63862h.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                View view = fVar.itemView;
                C24362h.m61210e(view, "getItemView<ListItemView>()");
                ListItemView listItemView = (ListItemView) view;
                listItemView.setTag(Integer.valueOf(i));
                listItemView.setOnCheckedChangeListener((AbstractListItemView.C15871b) null);
                if (this.f63863i != i) {
                    z = false;
                }
                listItemView.setChecked(z);
                listItemView.setOnCheckedChangeListener((AbstractListItemView.C15871b) this.f63864j.getValue());
                listItemView.setIcon(selectionOption.f63919c);
                listItemView.setTitle((CharSequence) selectionOption.f63920d);
                listItemView.setSubtitle((CharSequence) selectionOption.f63921e);
            } else if (i2 == 2) {
                View view2 = fVar.itemView;
                C24362h.m61210e(view2, "getItemView<MaterialCardView>()");
                MaterialCardView materialCardView = (MaterialCardView) view2;
                if (this.f63863i != i) {
                    z = false;
                }
                materialCardView.setChecked(z);
                materialCardView.setTag(Integer.valueOf(i));
                materialCardView.setOnClickListener((View.OnClickListener) this.f63865k.getValue());
                UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.title), selectionOption.f63920d);
                UiUtils.m40234B((TextView) fVar.mo39639f(C25750e.subtitle), selectionOption.f63921e);
                PriceInfo priceInfo = selectionOption.f63923g;
                if (priceInfo != null) {
                    ((PriceView) fVar.mo39639f(C25750e.price_view)).mo24682a(priceInfo.f23865b, priceInfo.f23866c, priceInfo.f23867d);
                }
                String str = selectionOption.f63924h;
                if (str != null) {
                    TextView textView = (TextView) fVar.mo39639f(C25750e.description);
                    textView.setText(C6133b.m14694a(str));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C24362h.m61211f(viewGroup, "parent");
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
    }

    /* renamed from: com.moovit.payment.account.actions.AccountActionSelectionStepFragment$a */
    public /* synthetic */ class C25612a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63868a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.moovit.payment.account.actions.model.PresentationType[] r0 = com.moovit.payment.account.actions.model.PresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.moovit.payment.account.actions.model.PresentationType r1 = com.moovit.payment.account.actions.model.PresentationType.INDICATORS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.moovit.payment.account.actions.model.PresentationType r1 = com.moovit.payment.account.actions.model.PresentationType.CARDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f63868a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.actions.AccountActionSelectionStepFragment.C25612a.<clinit>():void");
        }
    }

    /* renamed from: m2 */
    public final String mo83334m2() {
        return mo83341p2().f63894c;
    }

    /* renamed from: n2 */
    public final String mo83335n2() {
        return mo83341p2().f63897f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C25751f.account_action_selection_step_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        OptionsAdapter optionsAdapter = this.f63859n;
        if (optionsAdapter != null) {
            bundle.putInt("selectedIndex", optionsAdapter.f63863i);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        int i = mo83341p2().f63900i;
        OptionsAdapter optionsAdapter = this.f63859n;
        if (optionsAdapter != null) {
            i = optionsAdapter.f63863i;
        } else if (bundle != null) {
            i = bundle.getInt("selectedIndex", i);
        }
        UiUtils.m40234B((TextView) view.findViewById(C25750e.instructions), mo83341p2().f63898g);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C25750e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.f63859n = new OptionsAdapter(this, mo83341p2().f63896e, mo83341p2().f63901j, i);
        int i2 = C25612a.f63868a[mo83341p2().f63901j.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            recyclerView.mo4593g(new C18665b(recyclerView.getContext(), C25749d.divider_horizontal), -1);
            recyclerView.setAdapter(this.f63859n);
        } else if (i2 == 2) {
            recyclerView.setAdapter(this.f63859n);
        }
        View findViewById = view.findViewById(C25750e.action_view);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.action_view)");
        Button button = (Button) findViewById;
        this.f63860o = button;
        button.setText(mo83341p2().f63899h);
        Button button2 = this.f63860o;
        if (button2 != null) {
            if (i == -1) {
                z = false;
            }
            button2.setEnabled(z);
            Button button3 = this.f63860o;
            if (button3 != null) {
                button3.setOnClickListener(new C18284b(this, 7));
            } else {
                C24362h.m61217l("actionView");
                throw null;
            }
        } else {
            C24362h.m61217l("actionView");
            throw null;
        }
    }

    /* renamed from: p2 */
    public final OptionSelectionStep mo83341p2() {
        return (OptionSelectionStep) this.f63861p.getValue();
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        OptionSelectionStepResult optionSelectionStepResult;
        C24362h.m61211f(bundle, "args");
        if (C24362h.m61206a("option_confirmation", str)) {
            if (i == -1 && (optionSelectionStepResult = (OptionSelectionStepResult) bundle.getParcelable("result")) != null) {
                mo83596o2(optionSelectionStepResult);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
