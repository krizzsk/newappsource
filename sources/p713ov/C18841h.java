package p713ov;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13723g;
import c70.C13751d;
import c70.C13752e;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4053s;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.ridesharing.booking.EventBookingParams;
import com.moovit.app.ridesharing.booking.EventBookingTicket;
import com.moovit.app.ridesharing.view.BookingOptionListItemView;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.ridesharing.model.EventVehicleType;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o00.C18676l;
import o00.C18681n;
import p239rb.C6298j;
import p593ju.C17926b;
import p665mv.C18470e;
import p689nv.C18640b;
import p737pv.C19014e;
import p737pv.C19015f;
import p906wz.C20431c;
import p906wz.C20436g;
import p924xt.C20603k;
import p977zz.C20935e;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import z00.C20795a;

/* renamed from: ov.h */
public class C18841h extends C18831a {

    /* renamed from: s */
    public static final /* synthetic */ int f47970s = 0;

    /* renamed from: o */
    public final C18842a f47971o = new C18842a(this);

    /* renamed from: p */
    public C13556a f47972p = null;

    /* renamed from: q */
    public RecyclerView f47973q;

    /* renamed from: r */
    public Button f47974r;

    /* renamed from: ov.h$a */
    public class C18842a extends C18640b<C19014e, C19015f> {
        public C18842a(C18831a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19014e eVar = (C19014e) cVar;
            C18841h hVar = C18841h.this;
            hVar.f47972p = null;
            RecyclerView.Adapter adapter = hVar.f47973q.getAdapter();
            if (adapter instanceof C18843b) {
                hVar.mo51329u2((C18843b) adapter);
            } else {
                hVar.mo51329u2((C18843b) null);
            }
        }

        /* renamed from: h */
        public final boolean mo51023h(C20431c cVar, Exception exc) {
            boolean z;
            int b;
            C19014e eVar = (C19014e) cVar;
            int i = C13751d.f33851b;
            if ((exc instanceof UserRequestError) && ((b = ((UserRequestError) exc).mo49160b()) == 30002 || b == 30008)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C18841h.this.f47973q.mo4627l0((RecyclerView.Adapter) null);
                return false;
            }
            UserRequestError userRequestError = (UserRequestError) exc;
            RecyclerView recyclerView = C18841h.this.f47973q;
            C21100e.m49373x(eVar.f51759b, AppActionRequest.KEY_CONTEXT);
            recyclerView.setAdapter(new C20795a((Drawable) null, userRequestError.mo49162d(), userRequestError.mo49161c()));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            EventBookingTicket eventBookingTicket;
            C20944i0<ServerId, EventVehicleType> i0Var;
            C20944i0<ServerId, EventVehicleType> i0Var2;
            C19014e eVar = (C19014e) cVar;
            C18841h hVar = C18841h.this;
            List<EventBookingOption> list = ((C19015f) gVar).f48376m;
            int i = C18841h.f47970s;
            EventBookingParams p2 = hVar.mo51316p2();
            EventBookingCart o2 = hVar.mo51315o2();
            if (hVar.mo51327s2()) {
                eventBookingTicket = o2.f39346e;
            } else {
                eventBookingTicket = o2.f39347f;
            }
            EventBookingOption eventBookingOption = eventBookingTicket.f39359d;
            if (eventBookingOption != null) {
                i0Var = new C20944i0<>(eventBookingOption.f42927b, eventBookingOption.f42929d);
            } else {
                if (hVar.mo51327s2()) {
                    i0Var2 = p2.f39353e;
                } else {
                    i0Var2 = p2.f39354f;
                }
                i0Var = i0Var2;
            }
            C18843b r2 = hVar.mo51326r2(list, i0Var);
            hVar.f47973q.mo4627l0(r2);
            hVar.mo51329u2(r2);
        }

        /* renamed from: l */
        public final void mo45760l(Bundle bundle) {
            C18841h hVar = C18841h.this;
            int i = C18841h.f47970s;
            hVar.mo51328t2();
        }
    }

    /* renamed from: ov.h$b */
    public static class C18843b extends C18676l<EventBookingOption, C18676l.C18678b<EventBookingOption>, C12797f> {

        /* renamed from: j */
        public int f47976j = -1;

        /* renamed from: k */
        public final C20935e<C18843b> f47977k;

        /* renamed from: l */
        public final boolean f47978l;

        /* renamed from: m */
        public final int f47979m;

        /* renamed from: n */
        public final C20944i0<ServerId, EventVehicleType> f47980n;

        /* renamed from: o */
        public final String f47981o;

        public C18843b(C17926b bVar, boolean z, int i, C20944i0 i0Var, String str) {
            this.f47977k = bVar;
            this.f47978l = z;
            this.f47979m = i;
            this.f47980n = i0Var;
            this.f47981o = str;
        }

        /* renamed from: p */
        public final int mo23815p(int i) {
            return i == 0 ? 10 : 0;
        }

        /* renamed from: s */
        public final boolean mo23816s(int i) {
            if (i != 10) {
                return i == 0;
            }
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            long j;
            int i3;
            long j2;
            int i4;
            int i5;
            boolean z;
            boolean z2;
            int i6 = i;
            int i7 = i2;
            int l = mo51051l(i6, i7);
            EventBookingOption eventBookingOption = (EventBookingOption) ((C18676l.C18678b) mo51052n(i6)).getItem(i7);
            BookingOptionListItemView bookingOptionListItemView = (BookingOptionListItemView) ((C12797f) a0Var).itemView;
            boolean z3 = this.f47978l;
            int i8 = this.f47979m;
            Context context = bookingOptionListItemView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(C7925b.m18015c(context, eventBookingOption.f42928c));
            int i9 = eventBookingOption.f42932g;
            boolean z4 = true;
            if (i8 > i9) {
                spannableStringBuilder.append(' ');
                String quantityString = context.getResources().getQuantityString(R.plurals.event_booking_option_selector_step_available_tickets, i9, new Object[]{Integer.valueOf(i9)});
                int length = spannableStringBuilder.length();
                int length2 = quantityString.length() + length;
                spannableStringBuilder.append(quantityString);
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorCritical, context)), length, length2, 33);
            }
            bookingOptionListItemView.setTitle((CharSequence) spannableStringBuilder);
            if (z3) {
                i5 = R.string.event_booking_option_selector_step_to_event_pickup_time;
                j2 = eventBookingOption.f42934i;
                i4 = R.string.event_booking_option_selector_step_to_event_predefined_location;
                i3 = R.string.event_booking_option_selector_step_to_event_time;
                j = eventBookingOption.f42928c;
            } else {
                i5 = R.string.event_booking_option_selector_step_from_event_time;
                j2 = eventBookingOption.f42928c;
                i4 = R.string.event_booking_option_selector_step_from_event_predefined_location;
                i3 = R.string.event_booking_option_selector_step_from_event_dropoff_time;
                j = eventBookingOption.f42934i;
            }
            StringBuilder sb = new StringBuilder();
            if (j2 > 0) {
                sb.append(context.getString(i5, new Object[]{C7925b.m18024l(context, j2)}));
            }
            LocationDescriptor locationDescriptor = eventBookingOption.f42933h;
            if (locationDescriptor != null) {
                if (sb.length() > 0) {
                    sb.append(C20964s0.f52718a);
                }
                sb.append(context.getString(i4, new Object[]{locationDescriptor.mo24313f()}));
            }
            if (j > 0) {
                if (sb.length() > 0) {
                    sb.append(C20964s0.f52718a);
                }
                sb.append(context.getString(i3, new Object[]{C7925b.m18024l(context, j)}));
            }
            String str = null;
            if (sb.length() <= 0) {
                sb = null;
            }
            bookingOptionListItemView.setSubtitle((CharSequence) sb);
            ((PriceView) bookingOptionListItemView.getAccessoryView()).mo24682a(eventBookingOption.f42931f, eventBookingOption.f42930e, (String) null);
            if (this.f47979m <= eventBookingOption.f42932g) {
                z = true;
            } else {
                z = false;
            }
            bookingOptionListItemView.setEnabled(z);
            if (this.f47976j == l) {
                z2 = true;
            } else {
                z2 = false;
            }
            bookingOptionListItemView.setChecked(z2);
            bookingOptionListItemView.setOnClickListener(new C4053s(l, 2, this));
            C20944i0<ServerId, EventVehicleType> i0Var = this.f47980n;
            if (i0Var == null || !eventBookingOption.f42927b.equals(i0Var.f52692a) || !eventBookingOption.f42929d.equals(this.f47980n.f52693b)) {
                z4 = false;
            }
            if (z4) {
                str = this.f47981o;
            }
            bookingOptionListItemView.setReferral(str);
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            BookingOptionListItemView bookingOptionListItemView = new BookingOptionListItemView(viewGroup.getContext(), (AttributeSet) null);
            bookingOptionListItemView.setLayoutParams(UiUtils.m40254m());
            return new C12797f(bookingOptionListItemView);
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView;
            if (i == 10) {
                listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderLargeStyle);
            } else {
                listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            }
            listItemView.setLayoutParams(UiUtils.m40254m());
            return new C12797f(listItemView);
        }

        /* renamed from: z */
        public final EventBookingOption mo51330z() {
            boolean z;
            int i = this.f47976j;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            int o = mo51053o(i);
            return (EventBookingOption) ((C18676l.C18678b) mo51052n(o)).getItem(mo51050k(this.f47976j, o));
        }
    }

    /* renamed from: n2 */
    public final int mo51314n2() {
        return mo51327s2() ? R.string.event_booking_option_selector_step_arrival_title : R.string.event_booking_option_selector_step_return_title;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.event_booking_step_option_selector_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f47973q = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(layoutInflater.getContext()));
        RecyclerView recyclerView2 = this.f47973q;
        Context context = layoutInflater.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(10, R.drawable.divider_horizontal_full);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        Button button = (Button) inflate.findViewById(R.id.save);
        this.f47974r = button;
        button.setOnClickListener(new C4051q(this, 26));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C13556a aVar = this.f47972p;
        if (aVar != null) {
            aVar.cancel(true);
            this.f47972p = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.f47973q;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof C18843b) {
                C18843b bVar = (C18843b) adapter;
                ArrayList arrayList = new ArrayList(bVar.f47552g);
                for (C18676l.C18678b addAll : bVar.mo51054q()) {
                    arrayList.addAll(addAll);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList("options", arrayList);
                    EventBookingOption z = bVar.mo51330z();
                    if (z != null) {
                        bundle.putParcelable("selected_option", z);
                    }
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onViewCreated(view, bundle);
        C18843b bVar = null;
        if (!(bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("options")) == null)) {
            EventBookingOption eventBookingOption = (EventBookingOption) bundle.getParcelable("selected_option");
            bVar = eventBookingOption != null ? mo51326r2(parcelableArrayList, new C20944i0(eventBookingOption.f42927b, eventBookingOption.f42929d)) : mo51326r2(parcelableArrayList, (C20944i0<ServerId, EventVehicleType>) null);
        }
        if (bVar == null) {
            mo51328t2();
        } else {
            this.f47973q.mo4627l0(bVar);
        }
        mo51329u2(bVar);
    }

    /* renamed from: r2 */
    public final C18843b mo51326r2(List<EventBookingOption> list, C20944i0<ServerId, EventVehicleType> i0Var) {
        int i;
        int i2;
        C20944i0<ServerId, EventVehicleType> i0Var2;
        Context context = this.f47973q.getContext();
        CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
        for (EventBookingOption next : list) {
            arrayListHashMap.mo47001a(next.f42929d, next);
        }
        ArrayList arrayList = new ArrayList(arrayListHashMap.size() + 1);
        for (Map.Entry entry : arrayListHashMap.entrySet()) {
            List list2 = (List) entry.getValue();
            String string = context.getString(C18470e.m45333b((EventVehicleType) entry.getKey()));
            if (C13723g.m34280a(list2, new C20603k(2))) {
                string = context.getString(R.string.event_booking_option_selector_step_predefined_locations_title, new Object[]{string});
            }
            Collections.sort(list2, new C6298j(1));
            arrayList.add(new C18676l.C18678b(string, list2));
        }
        boolean s2 = mo51327s2();
        if (s2) {
            i = R.string.event_booking_arrival_message;
        } else {
            i = R.string.event_booking_return_message;
        }
        arrayList.add(0, new C18676l.C18678b(getString(i), (List) null));
        EventBookingParams p2 = mo51316p2();
        EventBookingCart o2 = mo51315o2();
        if (s2) {
            i2 = o2.f39346e.f39357b;
        } else {
            i2 = o2.f39347f.f39357b;
        }
        int i3 = i2;
        if (s2) {
            i0Var2 = p2.f39353e;
        } else {
            i0Var2 = p2.f39354f;
        }
        String str = p2.f39356h;
        C18843b bVar = new C18843b(new C17926b(this, 2), s2, i3, i0Var2, str);
        bVar.mo51055y(arrayList);
        if (i0Var != null) {
            ServerId serverId = (ServerId) i0Var.f52692a;
            EventVehicleType eventVehicleType = (EventVehicleType) i0Var.f52693b;
            List q = bVar.mo51054q();
            int i4 = -1;
            for (int i5 = 0; i5 < q.size(); i5++) {
                C18676l.C18678b bVar2 = (C18676l.C18678b) q.get(i5);
                int i6 = 0;
                while (true) {
                    if (i6 >= bVar2.size()) {
                        break;
                    }
                    EventBookingOption eventBookingOption = (EventBookingOption) bVar2.getItem(i6);
                    if (serverId.equals(eventBookingOption.f42927b) && eventVehicleType.equals(eventBookingOption.f42929d) && bVar.f47979m <= eventBookingOption.f42932g) {
                        i4 = bVar.mo51051l(i5, i6);
                        break;
                    }
                    i6++;
                }
                if (i4 != -1) {
                    break;
                }
            }
            int i7 = bVar.f47976j;
            if (i7 != i4) {
                if (i7 != -1) {
                    bVar.notifyItemChanged(i7);
                }
                bVar.f47976j = i4;
                bVar.notifyItemChanged(i4);
                C20935e<C18843b> eVar = bVar.f47977k;
                if (eVar != null) {
                    eVar.invoke(bVar);
                }
            }
        }
        return bVar;
    }

    /* renamed from: s2 */
    public final boolean mo51327s2() {
        return "arrival_booking_option_fragment_tag".equals(getTag());
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if (this.f47971o.mo51022g(str, i, bundle)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: t2 */
    public final void mo51328t2() {
        EventBookingTicket eventBookingTicket;
        ServerId serverId;
        Object obj;
        C13556a aVar = this.f47972p;
        EventBookingOption eventBookingOption = null;
        if (aVar != null) {
            aVar.cancel(true);
            this.f47972p = null;
        }
        this.f47973q.mo4627l0(new C12793c());
        this.f47973q.setEnabled(false);
        boolean s2 = mo51327s2();
        EventBookingParams p2 = mo51316p2();
        EventBookingCart o2 = mo51315o2();
        if (s2) {
            eventBookingTicket = o2.f39346e;
        } else {
            eventBookingTicket = o2.f39347f;
        }
        int i = eventBookingTicket.f39357b;
        C13752e R1 = mo46783R1();
        ServerId serverId2 = p2.f39350b;
        LatLonE6 d = eventBookingTicket.f39358c.mo24310d();
        EventBookingBucket eventBookingBucket = o2.f39344c;
        if (eventBookingBucket != null) {
            serverId = eventBookingBucket.f42920b;
        } else {
            serverId = null;
        }
        if (!s2) {
            eventBookingOption = o2.f39346e.f39359d;
        }
        C19014e eVar = new C19014e(R1, serverId2, d, s2, serverId, eventBookingOption, i);
        this.f47971o.mo51024j();
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C19014e.class, sb, "#");
        sb.append(eVar.f48372w);
        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        sb.append(eVar.f48373x);
        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        sb.append(eVar.f48374y);
        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        sb.append(eVar.f48375z);
        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        EventBookingOption eventBookingOption2 = eVar.f48370A;
        if (eventBookingOption2 != null) {
            obj = eventBookingOption2.f42927b;
        } else {
            StringBuilder k = C13555b.m33972k("null,");
            k.append(eVar.f48371B);
            obj = k.toString();
        }
        sb.append(obj);
        this.f47972p = mo46794g2(sb.toString(), eVar, this.f47971o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51329u2(p713ov.C18841h.C18843b r6) {
        /*
            r5 = this;
            com.moovit.app.ridesharing.booking.EventBookingCart r0 = r5.mo51315o2()
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L_0x0014
            int r6 = r6.f47976j
            r3 = -1
            if (r6 == r3) goto L_0x000f
            r6 = 1
            goto L_0x0010
        L_0x000f:
            r6 = 0
        L_0x0010:
            if (r6 == 0) goto L_0x0014
            r6 = 1
            goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            if (r6 != 0) goto L_0x003c
            b00.a r3 = r5.f47972p
            if (r3 != 0) goto L_0x003c
            com.moovit.ridesharing.model.EventBookingBucket r3 = r0.f39344c
            if (r3 == 0) goto L_0x0028
            java.util.Set<java.lang.Integer> r3 = r3.f42925g
            int r3 = r3.size()
            r4 = 2
            if (r3 < r4) goto L_0x003c
        L_0x0028:
            boolean r3 = r5.mo51327s2()
            if (r3 == 0) goto L_0x0034
            com.moovit.app.ridesharing.booking.EventBookingTicket r3 = r0.f39347f
            int r3 = r3.f39357b
            if (r3 > 0) goto L_0x003a
        L_0x0034:
            com.moovit.app.ridesharing.booking.EventBookingTicket r0 = r0.f39346e
            com.moovit.ridesharing.model.EventBookingOption r0 = r0.f39359d
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            android.widget.Button r3 = r5.f47974r
            if (r0 == 0) goto L_0x0045
            r4 = 2131888812(0x7f120aac, float:1.941227E38)
            goto L_0x0048
        L_0x0045:
            r4 = 2131886155(0x7f12004b, float:1.940688E38)
        L_0x0048:
            r3.setText(r4)
            android.widget.Button r3 = r5.f47974r
            if (r6 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            r3.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p713ov.C18841h.mo51329u2(ov.h$b):void");
    }
}
