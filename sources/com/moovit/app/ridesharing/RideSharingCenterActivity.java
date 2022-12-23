package com.moovit.app.ridesharing;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13717b;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.app.ridesharing.view.EventRequestView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import ja0.C12797f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00.C18671h;
import o00.C18676l;
import o00.C18681n;
import p304x.C7038d0;
import p310x5.C7157b;
import p665mv.C18472f;
import z00.C20795a;

public class RideSharingCenterActivity extends MoovitAppActivity implements EventsProvider.C15238d {

    /* renamed from: Z */
    public static final /* synthetic */ int f39304Z = 0;

    /* renamed from: U */
    public final C15240a f39305U = new C15240a();

    /* renamed from: X */
    public SwipeRefreshLayout f39306X;

    /* renamed from: Y */
    public RecyclerView f39307Y;

    /* renamed from: com.moovit.app.ridesharing.RideSharingCenterActivity$a */
    public class C15240a extends C18676l<EventRequest, C18676l.C18679c<EventRequest>, C12797f> {
        public C15240a() {
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            EventRequest eventRequest = (EventRequest) mo51052n(i).getItem(i2);
            EventRequestView eventRequestView = (EventRequestView) ((C12797f) a0Var).itemView;
            eventRequestView.setOnClickListener(new C7157b(4, this, eventRequest));
            eventRequestView.mo45799d(eventRequest, new C18472f(RideSharingCenterActivity.this));
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            EventRequestView eventRequestView = new EventRequestView(viewGroup.getContext(), (AttributeSet) null);
            eventRequestView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(eventRequestView);
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(listItemView);
        }
    }

    /* renamed from: B */
    public final void mo45744B(int i) {
        int i2;
        int i3;
        int i4;
        if ((i & 31) != 0) {
            int i5 = 0;
            this.f39306X.setRefreshing(false);
            EventsProvider eventsProvider = EventsProvider.f39286k;
            ArrayList arrayList = new ArrayList(3);
            List<T> list = eventsProvider.f39290d.f39297a;
            if (!C13717b.m34258e(list)) {
                arrayList.add(new C18676l.C18678b(getString(R.string.ride_sharing_center_section_active), new ArrayList(list)));
            }
            List<T> list2 = eventsProvider.f39288b.f39297a;
            List<T> list3 = eventsProvider.f39289c.f39297a;
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            if (list3 != null) {
                i3 = list3.size();
            } else {
                i3 = 0;
            }
            ArrayList arrayList2 = new ArrayList(i2 + i3);
            if (i2 > 0) {
                arrayList2.addAll(list2);
            }
            if (i3 > 0) {
                arrayList2.addAll(list3);
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C18676l.C18678b(getString(R.string.ride_sharing_center_section_future), arrayList2));
            }
            List<T> list4 = eventsProvider.f39291e.f39297a;
            List<T> list5 = eventsProvider.f39292f.f39297a;
            if (list4 != null) {
                i4 = list4.size();
            } else {
                i4 = 0;
            }
            if (list5 != null) {
                i5 = list5.size();
            }
            ArrayList arrayList3 = new ArrayList(i4 + i5);
            if (i4 > 0) {
                arrayList3.addAll(list4);
            }
            if (i5 > 0) {
                arrayList3.addAll(list5);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new C18676l.C18678b(getString(R.string.ride_sharing_center_section_historical), arrayList3));
            }
            this.f39305U.mo51055y(arrayList);
            if (arrayList.isEmpty()) {
                this.f39307Y.mo4627l0(new C20795a((Drawable) null, (CharSequence) null, getText(R.string.ride_sharing_center_empty_message)));
                return;
            }
            RecyclerView.Adapter adapter = this.f39307Y.getAdapter();
            C15240a aVar = this.f39305U;
            if (adapter != aVar) {
                this.f39307Y.mo4627l0(aVar);
            }
        }
    }

    /* renamed from: b0 */
    public final void mo45745b0() {
        mo45748y2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.ride_sharing_center_activity);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.f39306X = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new C7038d0(this, 8));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f39307Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f39307Y;
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(1, R.drawable.divider_horizontal_full);
        recyclerView2.mo4593g(new C18681n(this, sparseIntArray, false), -1);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        EventsProvider eventsProvider = EventsProvider.f39286k;
        eventsProvider.getClass();
        EventsProvider.m38934b(31);
        eventsProvider.f39293g.put(this, 31);
        mo45748y2();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        EventsProvider eventsProvider = EventsProvider.f39286k;
        eventsProvider.getClass();
        eventsProvider.f39293g.remove(this);
    }

    /* renamed from: k1 */
    public final void mo45746k1(IOException iOException, int i) {
        if ((i & 31) != 0) {
            this.f39306X.setRefreshing(false);
            this.f39307Y.mo4627l0(new C18671h(R.layout.request_send_error_view));
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("RIDE_SHARING_EVENTS_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45748y2() {
        boolean e = EventsProvider.f39286k.mo45739e(31);
        this.f39306X.setRefreshing(e);
        if (!e) {
            mo45744B(31);
        }
    }
}
