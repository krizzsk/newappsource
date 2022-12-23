package p713ov;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingParams;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ja0.C12793c;
import ja0.C12797f;
import java.util.List;
import o00.C18665b;
import p073e7.C4583a;
import p495fq.C17058c;
import p689nv.C18640b;
import p737pv.C19012c;
import p737pv.C19013d;
import p757qu.C19181d;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20935e;

/* renamed from: ov.f */
public class C18837f extends C18831a {

    /* renamed from: s */
    public static final /* synthetic */ int f47959s = 0;

    /* renamed from: o */
    public final C18838a f47960o = new C18838a(this);

    /* renamed from: p */
    public C13556a f47961p = null;

    /* renamed from: q */
    public RecyclerView f47962q;

    /* renamed from: r */
    public Button f47963r;

    /* renamed from: ov.f$a */
    public class C18838a extends C18640b<C19012c, C19013d> {
        public C18838a(C18831a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19012c cVar2 = (C19012c) cVar;
            C18837f.this.f47961p = null;
        }

        /* renamed from: h */
        public final boolean mo51023h(C20431c cVar, Exception exc) {
            C19012c cVar2 = (C19012c) cVar;
            C18837f.this.f47962q.mo4627l0((RecyclerView.Adapter) null);
            return false;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int i;
            EventBookingBucket eventBookingBucket;
            C19012c cVar2 = (C19012c) cVar;
            C19013d dVar = (C19013d) gVar;
            C18837f fVar = C18837f.this;
            int i2 = C18837f.f47959s;
            fVar.mo51315o2().f39343b = dVar.f48368m;
            List<EventBookingBucket> list = dVar.f48369n;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (i <= 1) {
                if (i == 1) {
                    eventBookingBucket = list.get(0);
                } else {
                    eventBookingBucket = null;
                }
                EventBookingCart o2 = fVar.mo51315o2();
                o2.f39344c = eventBookingBucket;
                o2.f39345d = true;
                fVar.mo51317q2();
                return;
            }
            C18839b bVar = new C18839b(list, new C19181d(fVar, 1));
            EventBookingCart o22 = fVar.mo51315o2();
            EventBookingParams p2 = fVar.mo51316p2();
            EventBookingBucket eventBookingBucket2 = o22.f39344c;
            if (eventBookingBucket2 != null) {
                bVar.mo51324j(eventBookingBucket2.f42920b);
            } else {
                ServerId serverId = p2.f39352d;
                if (serverId != null) {
                    bVar.mo51324j(serverId);
                }
            }
            fVar.f47962q.mo4627l0(bVar);
        }

        /* renamed from: l */
        public final void mo45760l(Bundle bundle) {
            C18837f fVar = C18837f.this;
            int i = C18837f.f47959s;
            fVar.mo51323r2();
        }

        /* renamed from: m */
        public final void mo51025m(int i) {
            mo51020e();
        }
    }

    /* renamed from: ov.f$b */
    public static class C18839b extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<EventBookingBucket> f47965g;

        /* renamed from: h */
        public int f47966h = -1;

        /* renamed from: i */
        public final C20935e<C18839b> f47967i;

        public C18839b(List<EventBookingBucket> list, C20935e<C18839b> eVar) {
            C21100e.m49373x(list, "bookingBuckets");
            this.f47965g = list;
            this.f47967i = eVar;
        }

        public final int getItemCount() {
            return this.f47965g.size();
        }

        /* renamed from: j */
        public final void mo51324j(ServerId serverId) {
            int size = this.f47965g.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (serverId.equals(this.f47965g.get(i).f42920b)) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = this.f47966h;
            if (i2 != i) {
                if (i2 != -1) {
                    notifyItemChanged(i2);
                }
                this.f47966h = i;
                notifyItemChanged(i);
                C20935e<C18839b> eVar = this.f47967i;
                if (eVar != null) {
                    eVar.invoke(this);
                }
            }
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            String str;
            C12797f fVar = (C12797f) a0Var;
            Context e = fVar.mo39638e();
            EventBookingBucket eventBookingBucket = this.f47965g.get(i);
            ListItemView listItemView = (ListItemView) fVar.itemView;
            if (this.f47966h == i) {
                z = true;
            } else {
                z = false;
            }
            listItemView.setChecked(z);
            listItemView.setIcon(eventBookingBucket.f42921c);
            listItemView.setTitle((CharSequence) eventBookingBucket.f42922d);
            if (C7925b.m18027o(eventBookingBucket.f42923e, eventBookingBucket.f42924f)) {
                str = C7925b.m18015c(e, eventBookingBucket.f42923e);
            } else {
                str = DateUtils.formatDateRange(e, eventBookingBucket.f42923e, eventBookingBucket.f42924f, SQLiteDatabase.OPEN_FULLMUTEX);
            }
            listItemView.setSubtitle((CharSequence) str);
            listItemView.setOnClickListener(new C18840g(this, i));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.event_booking_bucket_list_item, viewGroup, false));
        }
    }

    /* renamed from: n2 */
    public final int mo51314n2() {
        return R.string.event_booking_option_selector_step_bucket_title;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.event_booking_step_bucket_selector_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f47962q = recyclerView;
        Context context = recyclerView.getContext();
        this.f47962q.setLayoutManager(new LinearLayoutManager(context));
        this.f47962q.mo4593g(new C18665b(context, R.drawable.divider_horizontal_full), -1);
        Button button = (Button) inflate.findViewById(R.id.save);
        this.f47963r = button;
        button.setOnClickListener(new C4583a(this, 21));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C13556a aVar = this.f47961p;
        if (aVar != null) {
            aVar.cancel(true);
            this.f47961p = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        EventBookingBucket eventBookingBucket;
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.f47962q;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof C18839b) {
                C18839b bVar = (C18839b) adapter;
                bundle.putParcelableArrayList("buckets", C13717b.m34264k(bVar.f47965g));
                int i = bVar.f47966h;
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    eventBookingBucket = null;
                } else {
                    eventBookingBucket = bVar.f47965g.get(i);
                }
                if (eventBookingBucket != null) {
                    bundle.putParcelable("selected_bucket_id", eventBookingBucket.f42920b);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C18839b bVar;
        List list;
        super.onViewCreated(view, bundle);
        if (bundle == null || (list = (List) bundle.getParcelable("buckets")) == null) {
            bVar = null;
        } else {
            C18839b bVar2 = new C18839b(list, new C17058c(this, 3));
            ServerId serverId = (ServerId) bundle.getParcelable("selected_bucket_id");
            if (serverId != null) {
                bVar2.mo51324j(serverId);
            }
            bVar = bVar2;
        }
        if (bVar == null) {
            mo51323r2();
        } else {
            this.f47962q.mo4627l0(bVar);
        }
    }

    /* renamed from: r2 */
    public final void mo51323r2() {
        C13556a aVar = this.f47961p;
        if (aVar != null) {
            aVar.cancel(true);
            this.f47961p = null;
        }
        this.f47962q.mo4627l0(new C12793c());
        this.f47962q.setEnabled(false);
        this.f47960o.mo51024j();
        EventBookingParams p2 = mo51316p2();
        C19012c cVar = new C19012c(p2.f39350b, mo46783R1());
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C19012c.class, sb, "#");
        sb.append(cVar.f48367w);
        this.f47961p = mo46794g2(sb.toString(), cVar, this.f47960o);
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if (this.f47960o.mo51022g(str, i, bundle)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
