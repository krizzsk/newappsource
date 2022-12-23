package com.moovit.app.ridesharing;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.view.EventView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.ridesharing.model.Event;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import o00.C18665b;
import p297w5.C6996c;

public class AllEventsActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f39262U = 0;

    /* renamed from: com.moovit.app.ridesharing.AllEventsActivity$a */
    public static class C15231a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final View.OnClickListener f39263g;

        /* renamed from: h */
        public final List<Event> f39264h;

        public C15231a(C6996c cVar, ArrayList arrayList) {
            this.f39263g = cVar;
            C21100e.m49373x(arrayList, "events");
            this.f39264h = arrayList;
        }

        public final int getItemCount() {
            return this.f39264h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            Event event = this.f39264h.get(i);
            EventView eventView = (EventView) ((C12797f) a0Var).itemView;
            eventView.setTag(event);
            eventView.setOnClickListener(this.f39263g);
            eventView.mo45800u(event, true);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            EventView eventView = new EventView(viewGroup.getContext(), (AttributeSet) null);
            eventView.setLayoutParams(UiUtils.m40254m());
            return new C12797f(eventView);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.all_events_activity);
        C15231a aVar = new C15231a(new C6996c(this, 24), getIntent().getParcelableArrayListExtra("events"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.mo4593g(new C18665b(context, R.drawable.divider_horizontal_full), -1);
        recyclerView.setAdapter(aVar);
    }
}
