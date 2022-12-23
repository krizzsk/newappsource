package com.moovit.ticketing.validation.provider.agency;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import o00.C18665b;
import p597jy.C17979a;
import p977zz.C20944i0;
import p977zz.C20964s0;

public class TransitAgencySelectionActivity extends MoovitActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f23580U = 0;

    /* renamed from: com.moovit.ticketing.validation.provider.agency.TransitAgencySelectionActivity$a */
    public class C7769a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C17979a f23581g = new C17979a(this, 15);

        /* renamed from: h */
        public final List<AgencySummaryInfo> f23582h;

        /* renamed from: i */
        public final String f23583i;

        public C7769a(ArrayList arrayList, String str) {
            this.f23582h = arrayList;
            this.f23583i = str;
        }

        public final int getItemCount() {
            return this.f23582h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            int i2;
            String str;
            C12797f fVar = (C12797f) a0Var;
            Context e = fVar.mo39638e();
            AgencySummaryInfo agencySummaryInfo = this.f23582h.get(i);
            View view = fVar.itemView;
            view.setTag(agencySummaryInfo.f23573b);
            view.setOnClickListener(this.f23581g);
            TicketAgency ticketAgency = agencySummaryInfo.f23573b;
            ListItemView listItemView = (ListItemView) fVar.mo39639f(C12869e.list_item);
            listItemView.setIcon(ticketAgency.mo24222b());
            listItemView.setTitle((CharSequence) ticketAgency.mo24223c());
            if (ticketAgency.f23495b.equals(this.f23583i)) {
                i2 = C12868d.ic_check_mark_24_primary;
            } else {
                i2 = 0;
            }
            listItemView.setAccessoryDrawable(i2);
            C20944i0<CurrencyAmount, StoredValueStatus> i0Var = agencySummaryInfo.f23574c;
            if (i0Var != null) {
                str = ((CurrencyAmount) i0Var.f52692a).toString();
            } else {
                str = null;
            }
            String d = C12875k.m32664d(e, agencySummaryInfo);
            listItemView.setSubtitle(C20964s0.m49099q(e.getString(C12873i.string_list_delimiter_dot), str, d));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C12870f.transit_agency_selection_list_item, viewGroup, false));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.transit_agency_selection_activity);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("agencySummaryInfos");
        String stringExtra = getIntent().getStringExtra("selectedAgencyKey");
        if (parcelableArrayListExtra == null || stringExtra == null) {
            throw new IllegalStateException("Did you use TransitAgencySelectionActivity.createStartIntent(...)");
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(C12869e.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.mo4593g(new C18665b(this, C12868d.divider_horizontal), -1);
        recyclerView.setAdapter(new C7769a(parcelableArrayListExtra, stringExtra));
    }
}
