package com.moovit.ticketing.ticket;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import h60.C17327j1;
import ja0.C12793c;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import m80.C12866b;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12887v;
import o00.C18681n;
import p613kq.C18114a;
import p613kq.C18115b;
import p644lx.C18284b;
import p664mu.C18461p;
import p977zz.C20941h;

/* renamed from: com.moovit.ticketing.ticket.e */
public abstract class C7758e extends C15682c<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f23537u = 0;

    /* renamed from: n */
    public final C7759a f23538n = new C7759a();

    /* renamed from: o */
    public final C7760b f23539o = new C7760b();

    /* renamed from: p */
    public SwipeRefreshLayout f23540p;

    /* renamed from: q */
    public RecyclerView f23541q;

    /* renamed from: r */
    public int f23542r;

    /* renamed from: s */
    public int f23543s;

    /* renamed from: t */
    public int f23544t;

    /* renamed from: com.moovit.ticketing.ticket.e$a */
    public class C7759a extends BroadcastReceiver {
        public C7759a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C7758e eVar = C7758e.this;
            int i = C7758e.f23537u;
            eVar.mo24250n2(false);
        }
    }

    /* renamed from: com.moovit.ticketing.ticket.e$b */
    public class C7760b extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C18284b f23546g = new C18284b(this, 17);

        /* renamed from: h */
        public List<Ticket> f23547h = Collections.emptyList();

        public C7760b() {
        }

        public final int getItemCount() {
            return this.f23547h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            Ticket ticket = this.f23547h.get(i);
            TicketListItemView ticketListItemView = (TicketListItemView) ((C12797f) a0Var).itemView;
            ticketListItemView.setTag(ticket);
            ticketListItemView.setOnClickListener(this.f23546g);
            ticketListItemView.setTicket(ticket);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            TicketListItemView ticketListItemView = new TicketListItemView(viewGroup.getContext(), (AttributeSet) null);
            ticketListItemView.setLayoutParams(UiUtils.m40254m());
            return new C12797f(ticketListItemView);
        }
    }

    public C7758e() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public abstract Task<List<Ticket>> mo24249m2(boolean z);

    /* renamed from: n2 */
    public final void mo24250n2(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            mo24249m2(z).addOnSuccessListener((Activity) activity, new C18114a(this, 13)).addOnFailureListener((Activity) activity, (OnFailureListener) new C18115b(this, 8)).addOnCompleteListener((Activity) activity, new C18461p(this, 4));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f23542r = Q1.getInt("empty_state_title");
        this.f23543s = Q1.getInt("empty_state_subtitle");
        this.f23544t = Q1.getInt("empty_state_drawable");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.tickets_list_fragment, viewGroup, false);
        Context context = layoutInflater.getContext();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C12869e.swipe_refresh_layout);
        this.f23540p = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(C12866b.colorSecondary, inflate.getContext()));
        this.f23540p.setOnRefreshListener(new C17327j1(this, 26));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12869e.recycler_view);
        this.f23541q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = this.f23541q;
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(0, C12868d.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, true), -1);
        this.f23541q.setAdapter(new C12793c());
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        mo24250n2(false);
    }

    public final void onStart() {
        super.onStart();
        C12887v.m32673k(requireContext(), this.f23538n);
    }

    public final void onStop() {
        super.onStop();
        C12887v.m32674l(requireContext(), this.f23538n);
    }
}
