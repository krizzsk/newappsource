package p799so;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4273c0;
import p364al.C13487h;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p658mo.C18409c;
import p821tm.C19714r;
import p891wk.C20362q;

/* renamed from: so.b */
public final class C19497b extends RecyclerView.Adapter<C19498a> {

    /* renamed from: g */
    public final List<C18409c> f49595g;

    /* renamed from: h */
    public final C4273c0 f49596h;

    /* renamed from: so.b$a */
    public static class C19498a extends RecyclerView.C1119a0 implements View.OnClickListener {

        /* renamed from: d */
        public final View f49597d;

        /* renamed from: e */
        public final C4273c0 f49598e;

        public C19498a(View view, C4273c0 c0Var) {
            super(view);
            this.f49597d = view;
            view.setOnClickListener(this);
            this.f49598e = c0Var;
        }

        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition != -1) {
                C4273c0 c0Var = this.f49598e;
                C19496a aVar = (C19496a) c0Var.f15189c;
                List list = (List) c0Var.f15190d;
                int i = C19496a.f49593f;
                aVar.getClass();
                try {
                    C19499c cVar = (C19499c) aVar.mo50082H1();
                    String str = aVar.f49594e;
                    cVar.getClass();
                    ((C18409c) list.get(adapterPosition)).getClass();
                    ((C19496a) cVar.f45942a).getActivity();
                    C13487h<C20362q> a = cVar.f49600c.mo44363a(str);
                    if (!a.mo40399a()) {
                        cVar.f49601d.getClass();
                        C19714r.m47180a((C20362q) a.f33365a);
                    }
                    throw null;
                } catch (TicketSummaryBuilderException unused) {
                    Toast.makeText(aVar.getActivity(), C18066t.com_masabi_justride_sdk_ticket_action_error, 0).show();
                    aVar.dismiss();
                }
            }
        }
    }

    public C19497b(ArrayList arrayList, C4273c0 c0Var) {
        this.f49595g = arrayList;
        this.f49596h = c0Var;
    }

    public final int getItemCount() {
        return this.f49595g.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        this.f49595g.get(i).getClass();
        ((TextView) ((C19498a) a0Var).f49597d.findViewById(C18061o.action_button_textView)).setText((CharSequence) null);
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19498a(LayoutInflater.from(viewGroup.getContext()).inflate(C18063q.list_action_item, viewGroup, false), this.f49596h);
    }
}
