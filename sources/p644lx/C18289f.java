package p644lx;

import aa0.C7527d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13720d;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingState;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.C16202a;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import o00.C18668e;
import o00.C18669f;
import o00.C18670g;
import p145k5.C5487f;
import p241s0.C6302b;
import p543hq.C17474b;
import p858uz.C20061g;
import p926xv.C20628i;
import p977zz.C20941h;
import p977zz.C20964s0;
import q00.C19047a;
import z00.C20795a;
import z70.C13329g;
import z70.C13337m;

/* renamed from: lx.f */
public class C18289f extends C18283a implements SearchView.C0366m {

    /* renamed from: z */
    public static final /* synthetic */ int f46625z = 0;

    /* renamed from: r */
    public String f46626r;

    /* renamed from: s */
    public String f46627s;

    /* renamed from: t */
    public TodShuttleTrip f46628t;

    /* renamed from: u */
    public RecyclerView f46629u;

    /* renamed from: v */
    public SearchView f46630v;

    /* renamed from: w */
    public final C13337m f46631w = new C13337m();

    /* renamed from: x */
    public C18291b f46632x;

    /* renamed from: y */
    public Button f46633y;

    /* renamed from: lx.f$a */
    public class C18290a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<TodShuttleStop> f46634g;

        /* renamed from: h */
        public final List<TodShuttlePatternStopRestriction> f46635h;

        /* renamed from: i */
        public final long[] f46636i;

        /* renamed from: j */
        public final int f46637j;

        /* renamed from: k */
        public final int f46638k;

        /* renamed from: l */
        public final int f46639l;

        /* renamed from: m */
        public int f46640m = -1;

        /* renamed from: n */
        public int f46641n;

        /* renamed from: o */
        public int f46642o;

        public C18290a(Context context, List<TodShuttleStop> list, List<TodShuttlePatternStopRestriction> list2, long[] jArr) {
            C21100e.m49373x(list, "stops");
            this.f46634g = list;
            this.f46635h = list2;
            C21100e.m49373x(jArr, "times");
            this.f46636i = jArr;
            this.f46637j = C20941h.m49043f(R.attr.colorOnSurface, context);
            this.f46638k = C20941h.m49043f(R.attr.colorPrimary, context);
            this.f46639l = C20941h.m49043f(R.attr.colorOnSurfaceEmphasisLow, context);
            this.f46641n = list.size();
            this.f46642o = -1;
        }

        public final int getItemCount() {
            return this.f46634g.size();
        }

        /* renamed from: j */
        public final boolean mo50684j(int i) {
            boolean z;
            boolean z2;
            TodShuttlePatternStopRestriction todShuttlePatternStopRestriction;
            if (this.f46640m != -1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f46641n != this.f46634g.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            List<TodShuttlePatternStopRestriction> list = this.f46635h;
            if (list != null) {
                todShuttlePatternStopRestriction = list.get(i);
            } else {
                todShuttlePatternStopRestriction = null;
            }
            if (z || z2) {
                if (!z || z2) {
                    if (z || !z2) {
                        if (i == this.f46640m || i == this.f46641n) {
                            return true;
                        }
                        return false;
                    } else if (i > this.f46641n || todShuttlePatternStopRestriction == TodShuttlePatternStopRestriction.DROP_OFF_ONLY) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i < this.f46640m || todShuttlePatternStopRestriction == TodShuttlePatternStopRestriction.PICKUP_ONLY) {
                    return false;
                } else {
                    return true;
                }
            } else if (todShuttlePatternStopRestriction != TodShuttlePatternStopRestriction.DROP_OFF_ONLY) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: k */
        public final boolean mo50685k(int i) {
            TodShuttlePatternStopRestriction todShuttlePatternStopRestriction;
            boolean z;
            boolean z2;
            if (i < this.f46640m || i > this.f46641n) {
                return true;
            }
            List<TodShuttlePatternStopRestriction> list = this.f46635h;
            if (list != null) {
                todShuttlePatternStopRestriction = list.get(i);
            } else {
                todShuttlePatternStopRestriction = null;
            }
            if (todShuttlePatternStopRestriction == null) {
                return false;
            }
            if (this.f46640m != -1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f46641n != this.f46634g.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                if (todShuttlePatternStopRestriction == TodShuttlePatternStopRestriction.DROP_OFF_ONLY) {
                    return true;
                }
                return false;
            } else if (z2 || todShuttlePatternStopRestriction != TodShuttlePatternStopRestriction.PICKUP_ONLY) {
                return false;
            } else {
                return true;
            }
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            int i2;
            int i3;
            String str;
            int i4;
            int i5;
            C12797f fVar = (C12797f) a0Var;
            TodShuttleStop todShuttleStop = this.f46634g.get(i);
            long j = this.f46636i[i];
            View view = fVar.itemView;
            if (this.f46640m == i || this.f46641n == i) {
                z = true;
            } else {
                z = false;
            }
            view.setActivated(z);
            view.setOnClickListener(new C18288e(this, todShuttleStop, i));
            view.setClickable(mo50684j(i));
            if (mo50685k(i)) {
                i2 = this.f46639l;
            } else {
                i2 = this.f46637j;
            }
            TextView textView = (TextView) fVar.mo39639f(R.id.title);
            textView.setText(C13329g.m33604c(todShuttleStop.f40429d, ((C7527d) C18289f.this.f46632x.f47544h).f23007d));
            textView.setTextColor(i2);
            TextView textView2 = (TextView) fVar.mo39639f(R.id.subtitle);
            textView2.setTextColor(i2);
            if (this.f46642o == i) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView2.setVisibility(i3);
            TextView textView3 = (TextView) fVar.mo39639f(R.id.time);
            textView3.setTextColor(i2);
            if (!C18289f.this.f46628t.f40435f) {
                str = C7925b.m18024l(fVar.mo39638e(), j);
            } else {
                str = null;
            }
            UiUtils.m40236D(textView3, str, 8);
            ImageView imageView = (ImageView) fVar.mo39639f(R.id.line1);
            if (i == 0) {
                imageView.setVisibility(4);
            } else {
                if (i <= this.f46640m || i > this.f46641n) {
                    i5 = this.f46639l;
                } else {
                    i5 = this.f46638k;
                }
                imageView.setColorFilter(i5);
                imageView.setVisibility(0);
            }
            ImageView imageView2 = (ImageView) fVar.mo39639f(R.id.line2);
            if (i == this.f46634g.size() - 1) {
                imageView2.setVisibility(4);
            } else {
                if (i < this.f46640m || i >= this.f46641n) {
                    i4 = this.f46639l;
                } else {
                    i4 = this.f46638k;
                }
                imageView2.setColorFilter(i4);
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = (ImageView) fVar.mo39639f(R.id.icon);
            if (i == this.f46640m) {
                imageView3.setImageResource(R.drawable.wdg_tod_img_pickup_location_24);
            } else if (i == this.f46641n) {
                imageView3.setImageResource(R.drawable.wdg_tod_img_drop_off_24);
            } else if (mo50685k(i)) {
                imageView3.setImageResource(R.drawable.ic_circle_12_on_surface_low);
            } else {
                imageView3.setImageResource(R.drawable.ic_circle_12_primary);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.tod_shuttle_stop_item_view, viewGroup, false));
        }
    }

    /* renamed from: lx.f$b */
    public static class C18291b extends C18668e<C12797f, C18290a, C7527d<String>> {
        public C18291b(C18290a aVar) {
            super(aVar, new C7527d(C13720d.f33796a));
        }

        /* renamed from: k */
        public final boolean mo45935k(RecyclerView.Adapter adapter, int i, Object obj) {
            C18290a aVar = (C18290a) adapter;
            C7527d dVar = (C7527d) obj;
            if (C20964s0.m49090h(dVar.f23007d)) {
                return true;
            }
            if (!aVar.mo50684j(i)) {
                return false;
            }
            return dVar.mo19661o(aVar.f46634g.get(i).f40429d);
        }
    }

    /* renamed from: A */
    public final void mo1843A(String str) {
        String str2;
        this.f46631w.mo40229d(str);
        ((C7527d) this.f46632x.f47544h).mo23793a(str);
        this.f46632x.mo51049j();
        if (((C18290a) this.f46632x.f47543g).f46640m == -1) {
            str2 = "pick_up";
        } else {
            str2 = "drop_off";
        }
        this.f46631w.mo40230e(str, this.f46632x.getItemCount(), Collections.singletonMap(AnalyticsAttributeKey.TYPE, str2), (Set<String>) null);
        mo50683s2();
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: J */
    public final boolean mo1844J(String str) {
        return false;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        Tasks.call(MoovitExecutors.COMPUTATION, new C5487f(2, this, (C19047a) mo46776J1("CONFIGURATION"))).addOnCompleteListener((Activity) requireActivity(), new C20628i(this, 1));
    }

    /* renamed from: m2 */
    public final void mo50674m2(C6302b bVar) {
        bVar.put(AnalyticsAttributeKey.TRIP_ID, this.f46628t.f40431b);
    }

    /* renamed from: o2 */
    public final String mo50676o2() {
        return "tod_shuttle_stops_selection_step";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        TodShuttleTrip todShuttleTrip = mo50675n2().f40401d;
        if (todShuttleTrip != null) {
            String str = "";
            if (bundle != null) {
                str = bundle.getString("searchQuery", str);
            }
            Context requireContext = requireContext();
            this.f46626r = requireContext.getString(R.string.tod_shuttle_booking_select_pickup_header);
            this.f46627s = requireContext.getString(R.string.tod_shuttle_booking_select_dropoff_header);
            this.f46628t = todShuttleTrip;
            TodShuttlePattern todShuttlePattern = todShuttleTrip.f40432c;
            C18291b bVar = new C18291b(new C18290a(requireContext, todShuttlePattern.f40420d, todShuttlePattern.f40421e, todShuttleTrip.f40433d.f40425b));
            this.f46632x = bVar;
            ((C7527d) bVar.f47544h).mo23793a(str);
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.clear_menu, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.tod_shuttle_booking_step_choose_stops_fragment, viewGroup, false);
        SearchView searchView = (SearchView) inflate.findViewById(R.id.search_view);
        this.f46630v = searchView;
        searchView.setOnQueryTextListener(this);
        this.f46631w.mo40231f(((C7527d) this.f46632x.f47544h).f23007d);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.container);
        this.f46629u = recyclerView;
        recyclerView.setLayoutManager(new C18286d(requireContext()));
        this.f46629u.mo4593g(C18670g.m45652e(UiUtils.m40245d(requireContext().getResources(), 16.0f)), -1);
        this.f46629u.mo4593g(C18669f.m45651e(UiUtils.m40245d(requireContext().getResources(), 16.0f)), -1);
        this.f46629u.setAdapter(this.f46632x);
        this.f46629u.mo4615h(this.f46631w);
        TodShuttleBookingState n2 = mo50675n2();
        Button button = (Button) inflate.findViewById(R.id.button);
        this.f46633y = button;
        button.setOnClickListener(new C18284b(this, 0));
        Button button2 = this.f46633y;
        if (!(n2.f40402e == -1 || n2.f40403f == -1)) {
            z = true;
        }
        button2.setEnabled(z);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.clear) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "clear_clicked");
        mo46797j2(aVar.mo49933a());
        C18290a aVar2 = (C18290a) this.f46632x.f47543g;
        aVar2.f46640m = -1;
        aVar2.f46641n = aVar2.f46634g.size();
        aVar2.notifyDataSetChanged();
        mo50679r2();
        this.f46633y.setEnabled(false);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("searchQuery", ((C7527d) this.f46632x.f47544h).f23007d);
    }

    public final void onStart() {
        super.onStart();
        this.f46631w.f33115i = true;
    }

    public final void onStop() {
        super.onStop();
        mo46797j2(this.f46631w.mo40228c());
    }

    /* renamed from: p2 */
    public final String mo50677p2() {
        TodShuttleStop todShuttleStop;
        C18290a aVar = (C18290a) this.f46632x.f47543g;
        int i = aVar.f46640m;
        if (i != -1) {
            todShuttleStop = aVar.f46634g.get(i);
        } else {
            todShuttleStop = null;
        }
        if (todShuttleStop == null) {
            return this.f46626r;
        }
        return this.f46627s;
    }

    /* renamed from: s2 */
    public final void mo50683s2() {
        if (this.f46632x.getItemCount() == 0) {
            RecyclerView recyclerView = this.f46629u;
            Context requireContext = requireContext();
            C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
            recyclerView.mo4627l0(new C20795a(C17988b.m44611b(R.drawable.img_empty_state_omni, requireContext), requireContext.getText(R.string.tod_shuttle_stations_search_empty), (CharSequence) null));
            return;
        }
        RecyclerView.Adapter adapter = this.f46629u.getAdapter();
        C18291b bVar = this.f46632x;
        if (adapter != bVar) {
            this.f46629u.mo4627l0(bVar);
        }
    }
}
