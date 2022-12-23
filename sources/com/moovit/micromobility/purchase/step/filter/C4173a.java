package com.moovit.micromobility.purchase.step.filter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c20.C13744a;
import ce0.C21100e;
import com.google.android.material.card.MaterialCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep;
import ja0.C12790a;
import ja0.C12797f;
import java.util.List;
import l30.C5566a0;
import l30.C5596y;
import l30.C5597z;
import o00.C18665b;
import o00.C18680m;
import p543hq.C17474b;
import p597jy.C17979a;
import p739px.C19037a;
import p977zz.C20964s0;
import u30.C6687a;
import w30.C6982a;

/* renamed from: com.moovit.micromobility.purchase.step.filter.a */
public class C4173a extends C6687a<MicroMobilityFilterSelectionStep, MicroMobilityFilterSelectionStepResult> {

    /* renamed from: r */
    public static final /* synthetic */ int f14956r = 0;

    /* renamed from: p */
    public C4175b f14957p;

    /* renamed from: q */
    public Button f14958q;

    /* renamed from: com.moovit.micromobility.purchase.step.filter.a$a */
    public static /* synthetic */ class C4174a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14959a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep$FilterPresentationType[] r0 = com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep.FilterPresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14959a = r0
                com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep$FilterPresentationType r1 = com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep.FilterPresentationType.INDICATORS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14959a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep$FilterPresentationType r1 = com.moovit.micromobility.purchase.step.filter.MicroMobilityFilterSelectionStep.FilterPresentationType.CARDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.purchase.step.filter.C4173a.C4174a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.filter.a$b */
    public class C4175b extends C12790a<MicroMobilityPurchaseFilter> {

        /* renamed from: h */
        public final C6982a f14960h = new C6982a(this, 0);

        /* renamed from: i */
        public final C17979a f14961i = new C17979a(this, 4);

        /* renamed from: j */
        public final MicroMobilityFilterSelectionStep.FilterPresentationType f14962j;

        /* renamed from: k */
        public int f14963k;

        public C4175b(MicroMobilityFilterSelectionStep.FilterPresentationType filterPresentationType, List<MicroMobilityPurchaseFilter> list, int i) {
            super(list);
            C21100e.m49373x(filterPresentationType, "type");
            this.f14962j = filterPresentationType;
            this.f14963k = i;
        }

        public final int getItemViewType(int i) {
            int i2 = C4174a.f14959a[this.f14962j.ordinal()];
            if (i2 == 1) {
                return C5566a0.micro_mobility_filter_selection_item;
            }
            if (i2 == 2) {
                return C5566a0.micro_mobility_filter_selection_card_item;
            }
            StringBuilder k = C13555b.m33972k("Unknown presentation type: ");
            k.append(this.f14962j);
            throw new IllegalStateException(k.toString());
        }

        /* renamed from: l */
        public final void mo19546l(int i) {
            int i2 = this.f14963k;
            this.f14963k = i;
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            MicroMobilityPurchaseFilter microMobilityPurchaseFilter = (MicroMobilityPurchaseFilter) mo39636j(i);
            C4173a aVar = C4173a.this;
            int i3 = C4173a.f14956r;
            aVar.getClass();
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "list_item_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.ID, microMobilityPurchaseFilter.f14951b);
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, microMobilityPurchaseFilter.f14953d);
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, ((MicroMobilityFilterSelectionStep) aVar.f20766o).f14921c);
            aVar.mo46797j2(aVar2.mo49933a());
            aVar.f14958q.setEnabled(true);
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            MicroMobilityPurchaseFilter microMobilityPurchaseFilter = (MicroMobilityPurchaseFilter) mo39636j(i);
            int i2 = C4174a.f14959a[this.f14962j.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                ListItemView listItemView = (ListItemView) fVar.itemView;
                listItemView.setTag(Integer.valueOf(i));
                listItemView.setOnCheckedChangeListener((AbstractListItemView.C15871b) null);
                if (this.f14963k != i) {
                    z = false;
                }
                listItemView.setChecked(z);
                listItemView.setOnCheckedChangeListener(this.f14960h);
                listItemView.setIcon(microMobilityPurchaseFilter.f14952c);
                listItemView.setTitle((CharSequence) microMobilityPurchaseFilter.f14953d);
                listItemView.setSubtitle((CharSequence) microMobilityPurchaseFilter.f14954e);
            } else if (i2 == 2) {
                MaterialCardView materialCardView = (MaterialCardView) fVar.itemView;
                if (this.f14963k != i) {
                    z = false;
                }
                materialCardView.setChecked(z);
                materialCardView.setTag(Integer.valueOf(i));
                materialCardView.setOnClickListener(this.f14961i);
                C13744a.m34300b((ImageView) fVar.mo39639f(C5597z.icon), microMobilityPurchaseFilter.f14952c);
                UiUtils.m40234B((TextView) fVar.mo39639f(C5597z.title), microMobilityPurchaseFilter.f14953d);
                UiUtils.m40234B((TextView) fVar.mo39639f(C5597z.subtitle), microMobilityPurchaseFilter.f14954e);
            } else {
                StringBuilder k = C13555b.m33972k("Unknown presentation type: ");
                k.append(this.f14962j);
                throw new IllegalStateException(k.toString());
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
        }
    }

    /* renamed from: n2 */
    public final void mo19545n2(String str) {
        if (((MicroMobilityFilterSelectionStep) this.f20766o).f14942f == MicroMobilityFilterSelectionStep.FilterPresentationType.CARDS) {
            super.mo19545n2((String) null);
        } else {
            super.mo19545n2(str);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_filter_selection_step_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C4175b bVar = this.f14957p;
        if (bVar != null) {
            bundle.putInt("selectedIndex", bVar.f14963k);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        RecyclerView.Adapter adapter;
        super.onViewCreated(view, bundle);
        MicroMobilityFilterSelectionStep microMobilityFilterSelectionStep = (MicroMobilityFilterSelectionStep) this.f20766o;
        int i2 = microMobilityFilterSelectionStep.f14946j;
        C4175b bVar = this.f14957p;
        if (bVar != null) {
            i = bVar.f14963k;
        } else {
            if (bundle != null) {
                i2 = bundle.getInt("selectedIndex", i2);
            }
            i = i2;
        }
        int i3 = C4174a.f14959a[microMobilityFilterSelectionStep.f14942f.ordinal()];
        boolean z = false;
        if (i3 == 1) {
            this.f14957p = new C4175b(microMobilityFilterSelectionStep.f14942f, microMobilityFilterSelectionStep.f14943g, i);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(C5597z.recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.mo4593g(new C18665b(view.getContext(), C5596y.divider_horizontal), -1);
            recyclerView.setAdapter(this.f14957p);
        } else if (i3 == 2) {
            this.f14957p = new C4175b(microMobilityFilterSelectionStep.f14942f, microMobilityFilterSelectionStep.f14943g, i);
            String str = microMobilityFilterSelectionStep.f14922d;
            if (C20964s0.m49090h(str)) {
                adapter = this.f14957p;
            } else {
                adapter = new ConcatAdapter(new C18680m(C5566a0.micro_mobility_filter_selection_card_header, str), this.f14957p);
            }
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C5597z.recycler_view);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setAdapter(adapter);
        } else {
            StringBuilder k = C13555b.m33972k("Unexpected value: ");
            k.append(microMobilityFilterSelectionStep.f14942f);
            throw new IllegalStateException(k.toString());
        }
        UiUtils.m40234B((TextView) view.findViewById(C5597z.instructions), ((MicroMobilityFilterSelectionStep) this.f20766o).f14944h);
        Button button = (Button) view.findViewById(C5597z.continue_button);
        this.f14958q = button;
        button.setText(microMobilityFilterSelectionStep.f14945i);
        Button button2 = this.f14958q;
        if (i != -1) {
            z = true;
        }
        button2.setEnabled(z);
        this.f14958q.setOnClickListener(new C19037a(this, 8));
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        MicroMobilityFilterSelectionStepResult microMobilityFilterSelectionStepResult;
        if ("filter_confirmation".equals(str)) {
            if (i == -1 && (microMobilityFilterSelectionStepResult = (MicroMobilityFilterSelectionStepResult) bundle.getParcelable("result")) != null) {
                mo22864m2(microMobilityFilterSelectionStepResult);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
