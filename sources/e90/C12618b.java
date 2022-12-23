package e90;

import aa0.C7527d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import i00.C17522a;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import m80.C12866b;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import n10.C18505b;
import o00.C18676l;
import o00.C18681n;
import p304x.C7065j0;
import p555ie.C17589h;
import p578jf.C17843u;
import p693nz.C18659h;
import p739px.C19037a;
import p950yw.C20777d;
import p977zz.C20964s0;
import v80.C13183a;
import z70.C13337m;

/* renamed from: e90.b */
public class C12618b extends C13183a<PurchaseStationSelectionStep, PurchaseStationSelectionStepResult> {

    /* renamed from: w */
    public static final /* synthetic */ int f31181w = 0;

    /* renamed from: p */
    public final C12620b f31182p = new C12620b();

    /* renamed from: q */
    public final C13337m f31183q = new C13337m();

    /* renamed from: r */
    public final C7527d<PurchaseStation> f31184r = new C7527d<>(new C18505b(8));

    /* renamed from: s */
    public EditText f31185s;

    /* renamed from: t */
    public View f31186t;

    /* renamed from: u */
    public RecyclerView f31187u;

    /* renamed from: v */
    public C12621c f31188v;

    /* renamed from: e90.b$a */
    public class C12619a extends C17522a {
        public C12619a() {
        }

        public final void afterTextChanged(Editable editable) {
            C12618b bVar = C12618b.this;
            String C = C20964s0.m49082C(editable);
            bVar.f31183q.mo40229d(C);
            bVar.mo39412p2(C);
        }
    }

    /* renamed from: e90.b$b */
    public class C12620b extends C18676l<PurchaseStation, C18676l.C18679c<PurchaseStation>, C12797f> {

        /* renamed from: j */
        public final C19037a f31190j = new C19037a(this, 15);

        public C12620b() {
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            PurchaseStation purchaseStation = (PurchaseStation) mo51052n(i).getItem(i2);
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setTag(purchaseStation);
            listItemView.setOnClickListener(this.f31190j);
            listItemView.setText((CharSequence) purchaseStation.f23420c);
            listItemView.setIcon(purchaseStation.f23421d);
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.purchase_ticket_station_item, viewGroup, false));
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C12866b.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(listItemView);
        }
    }

    /* renamed from: e90.b$c */
    public static class C12621c {

        /* renamed from: a */
        public final List<C18676l.C18678b<PurchaseStation>> f31192a;

        /* renamed from: b */
        public final C18659h f31193b = new C18659h(10);

        public C12621c(ArrayList arrayList) {
            this.f31192a = arrayList;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.purchase_ticket_station_selection_fragment, viewGroup, false);
        EditText editText = (EditText) inflate.findViewById(C12869e.search_view);
        this.f31185s = editText;
        editText.addTextChangedListener(new C12619a());
        this.f31186t = inflate.findViewById(C12869e.divider);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f31187u = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = this.f31187u;
        Context context = layoutInflater.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.append(1, C12868d.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        this.f31187u.mo4615h(this.f31183q);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        this.f31183q.f33115i = true;
    }

    public final void onStop() {
        super.onStop();
        mo46797j2(this.f31183q.mo40228c());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String C = C20964s0.m49082C(this.f31185s.getText());
        this.f31183q.mo40231f(C);
        mo39412p2(C);
    }

    /* renamed from: p2 */
    public final void mo39412p2(String str) {
        Task task;
        PurchaseStationSelectionStep purchaseStationSelectionStep = (PurchaseStationSelectionStep) this.f32728o;
        C12621c cVar = this.f31188v;
        if (cVar != null) {
            task = Tasks.forResult(cVar);
        } else {
            task = Tasks.call(MoovitExecutors.COMPUTATION, new C17589h(purchaseStationSelectionStep, 7)).addOnSuccessListener((Activity) requireActivity(), new C17843u(this, 12));
        }
        task.onSuccessTask(MoovitExecutors.SINGLE, new C7065j0(5, this, str)).addOnSuccessListener((Activity) requireActivity(), new C20777d(3, this, str)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C12617a(this, str));
    }
}
