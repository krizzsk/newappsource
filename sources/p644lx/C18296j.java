package p644lx;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.app.tod.shuttle.model.TodZone;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lx.j */
public class C18296j extends C18283a {

    /* renamed from: s */
    public static final /* synthetic */ int f46657s = 0;

    /* renamed from: r */
    public List<TodZone> f46658r = Collections.emptyList();

    /* renamed from: lx.j$a */
    public class C18297a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TodZone> f46659g;

        public C18297a(List<TodZone> list) {
            this.f46659g = list;
        }

        public final int getItemCount() {
            return this.f46659g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            TodZone todZone = this.f46659g.get(i);
            ((TextView) fVar.mo39639f(R.id.name)).setText(todZone.f40448c);
            fVar.itemView.setOnClickListener(new C4054t(8, this, todZone));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.tod_shuttle_booking_step_choose_zone_item, viewGroup, false));
        }
    }

    /* renamed from: o2 */
    public final String mo50676o2() {
        return "tod_shuttle_zone_selection_step";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = ((TodShuttleBookingActivity) this.f40822c).f40376X;
        if (!arrayList.isEmpty()) {
            this.f46658r = arrayList;
            return;
        }
        throw new IllegalStateException("displayed zones may not be empty");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tod_shuttle_booking_step_choose_zone_fragment, viewGroup, false);
        ((RecyclerView) inflate.findViewById(R.id.recycler)).setAdapter(new C18297a(this.f46658r));
        return inflate;
    }

    /* renamed from: p2 */
    public final String mo50677p2() {
        return getString(R.string.tod_shuttle_booking_select_service_header);
    }
}
