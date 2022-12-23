package p805su;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g20.C17161i;
import ja0.C12793c;
import ja0.C12797f;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import k00.C17988b;
import o00.C18669f;
import o00.C18671h;
import o00.C18676l;
import o00.C18681n;
import p054d0.C4267a0;
import p073e7.C4583a;
import p115i0.C5227c;
import p242s1.C6333d0;
import p259t5.C6593c;
import p543hq.C17474b;
import p824tp.C19728f;
import p829tu.C19775f;
import p829tu.C19778i;
import p946ys.C20763d;
import p977zz.C20964s0;
import q00.C19047a;
import z00.C20795a;
import z20.C20806a;

/* renamed from: su.p */
public class C19560p extends C19539a {

    /* renamed from: q */
    public static final /* synthetic */ int f49719q = 0;

    /* renamed from: n */
    public final C18671h f49720n = new C18671h(R.layout.mot_qr_code_activation_trip_empty_list_item);

    /* renamed from: o */
    public TextView f49721o;

    /* renamed from: p */
    public ServerId f49722p = null;

    /* renamed from: su.p$a */
    public class C19561a extends C18676l<MotQrCodeTrip, C18676l.C18679c<MotQrCodeTrip>, C12797f> {

        /* renamed from: j */
        public final C17161i<C16181a.C16184c, TransitLine> f49723j;

        public C19561a(C19728f fVar) {
            this.f49723j = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
        }

        /* renamed from: p */
        public final int mo23815p(int i) {
            if (C20964s0.m49090h(mo51052n(i).getName())) {
                return 11;
            }
            return 10;
        }

        /* renamed from: s */
        public final boolean mo23816s(int i) {
            return i == 10 || i == 11;
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            MotQrCodeTrip motQrCodeTrip = (MotQrCodeTrip) mo51052n(i).getItem(i2);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            C16181a.m41233b(this.f49723j, listItemView, motQrCodeTrip.f39073c);
            listItemView.setOnClickListener(new C19559o(this, motQrCodeTrip, i2));
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            if (fVar.getItemViewType() != 11) {
                ((ListItemView) fVar.itemView).setTitle(mo51052n(i).getName());
            }
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.mot_qr_code_activation_trip_list_item, viewGroup, false));
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            View view;
            if (i == 10) {
                view = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
                view.setLayoutParams(UiUtils.m40254m());
                C6333d0.m15030r(view, true);
            } else {
                view = new Space(viewGroup.getContext());
            }
            return new C12797f(view);
        }
    }

    /* renamed from: r2 */
    public static void m46932r2(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        boolean z;
        recyclerView.mo4627l0(adapter);
        boolean z2 = adapter instanceof C19561a;
        if (recyclerView.getItemDecorationCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && !z) {
            recyclerView.mo4593g(new C18669f(recyclerView.getContext(), R.drawable.divider_horizontal), -1);
        } else if (z && !z2) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            if (1 < itemDecorationCount) {
                int itemDecorationCount2 = recyclerView.getItemDecorationCount();
                if (1 < itemDecorationCount2) {
                    recyclerView.mo4568Z(recyclerView.f4277q.get(1));
                    return;
                }
                throw new IndexOutOfBoundsException(1 + " is an invalid index for size " + itemDecorationCount2);
            }
            throw new IndexOutOfBoundsException(1 + " is an invalid index for size " + itemDecorationCount);
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo51910s2();
    }

    /* renamed from: m2 */
    public final int mo51895m2() {
        return R.string.payment_mot_activation_trip_title;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 5556) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i3 = SearchLineActivity.f41621U;
            this.f49722p = ((SearchLineItem) intent.getParcelableExtra("item")).f41637b;
            new C20806a.C20807a("mot_lines_search_tap").mo52935c();
            mo51910s2();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_qr_code_activation_trip_selection_fragment, viewGroup, false);
        this.f49721o = (TextView) inflate.findViewById(R.id.header);
        inflate.findViewById(R.id.search_proxy).setOnClickListener(new C6593c(this, 20));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(layoutInflater.getContext()));
        Context context = recyclerView.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(1, R.drawable.divider_horizontal);
        recyclerView.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        ((Button) inflate.findViewById(R.id.action_select_fare)).setOnClickListener(new C4583a(this, 19));
        return inflate;
    }

    /* renamed from: p2 */
    public final void mo51908p2(int i, ServerId serverId) {
        String str;
        if (serverId == null) {
            str = "suggested_lines_view";
        } else {
            str = "line_direction_view";
        }
        C20806a.C20807a aVar = new C20806a.C20807a(str);
        aVar.mo52934b(Integer.valueOf(i), "number_of_items");
        aVar.mo52936d("line_group", serverId);
        MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
    }

    /* renamed from: q2 */
    public final void mo51909q2(RecyclerView recyclerView) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_trip_selection_impression");
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, 0);
        mo46797j2(aVar.mo49933a());
        mo51908p2(0, (ServerId) null);
        Context requireContext = requireContext();
        C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
        m46932r2(recyclerView, new C20795a(C17988b.m44611b(R.drawable.img_empty_error_sign, requireContext), (CharSequence) null, requireContext.getText(R.string.response_read_error_message)));
    }

    /* renamed from: s2 */
    public final void mo51910s2() {
        int i;
        Task task;
        Task task2;
        View view = getView();
        if (view != null && mo46775H1()) {
            mo51897o2();
            TextView textView = this.f49721o;
            if (this.f49722p == null) {
                i = R.string.payment_mot_activation_trip_message;
            } else {
                i = R.string.payment_mot_activation_select_direction_title;
            }
            textView.setText(i);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            m46932r2(recyclerView, new C12793c());
            if (this.f49722p == null) {
                MotQrCodeScanResult n2 = mo51896n2();
                MotQrCodeLinePrediction motQrCodeLinePrediction = n2.f39067g;
                if (motQrCodeLinePrediction == null) {
                    task = Tasks.forResult(null);
                } else {
                    task = Tasks.call(MoovitExecutors.f37327IO, new C19775f(mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"), (C19047a) mo46776J1("CONFIGURATION"), n2, motQrCodeLinePrediction.f39058b)).onSuccessTask(MoovitExecutors.COMPUTATION, new C4267a0(motQrCodeLinePrediction, 5));
                }
            } else {
                task = Tasks.forResult(null);
            }
            ServerId serverId = this.f49722p;
            if (serverId == null) {
                FragmentActivity requireActivity = requireActivity();
                MotQrCodeScanResult n22 = mo51896n2();
                C13752e R1 = mo46783R1();
                C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
                ExecutorService executorService = MoovitExecutors.f37327IO;
                task2 = Tasks.call(executorService, new C19778i(R1, aVar, n22.f39065e)).onSuccessTask(executorService, new C19558n(R1, (C19728f) mo46776J1("METRO_CONTEXT"), aVar, n22, 0)).addOnSuccessListener((Activity) requireActivity, new C20763d(this, 1)).onSuccessTask(MoovitExecutors.COMPUTATION, new C5227c(16));
            } else {
                task2 = Tasks.call(MoovitExecutors.f37327IO, new C19775f(mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"), (C19047a) mo46776J1("CONFIGURATION"), mo51896n2(), serverId));
            }
            Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).addOnSuccessListener(new C19556l(this, task, task2, recyclerView)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C19557m(this, recyclerView, 0));
        }
    }
}
