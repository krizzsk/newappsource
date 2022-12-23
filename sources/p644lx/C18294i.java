package p644lx;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttleSchedule;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.app.tod.shuttle.model.TodZone;
import com.moovit.app.tod.shuttle.model.TodZoneDaySchedule;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.TextPicker;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o00.C18669f;
import o00.C18670g;
import p304x.C7070l;
import p471eq.C16850a;
import p531he.C17399f0;
import p543hq.C17474b;
import p977zz.C20930c;

/* renamed from: lx.i */
public class C18294i extends C18283a {

    /* renamed from: v */
    public static final /* synthetic */ int f46648v = 0;

    /* renamed from: r */
    public TodZone f46649r;

    /* renamed from: s */
    public RecyclerView f46650s;

    /* renamed from: t */
    public TextPicker f46651t;

    /* renamed from: u */
    public Button f46652u;

    /* renamed from: lx.i$a */
    public class C18295a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final Locale f46653g;

        /* renamed from: h */
        public final List<TodShuttleTrip> f46654h;

        /* renamed from: i */
        public int f46655i;

        public C18295a(Context context, List<TodShuttleTrip> list, TodShuttleTrip todShuttleTrip) {
            int i;
            this.f46653g = C20930c.m49020b(context);
            C21100e.m49373x(list, "trips");
            this.f46654h = list;
            if (todShuttleTrip != null) {
                i = list.indexOf(todShuttleTrip);
            } else {
                i = -1;
            }
            this.f46655i = i;
        }

        public final int getItemCount() {
            return this.f46654h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            boolean z2;
            C12797f fVar = (C12797f) a0Var;
            Context e = fVar.mo39638e();
            TodShuttleTrip todShuttleTrip = this.f46654h.get(i);
            View view = fVar.itemView;
            if (this.f46655i == i) {
                z = true;
            } else {
                z = false;
            }
            view.setActivated(z);
            view.setOnClickListener(new C18293h(this, todShuttleTrip, i));
            ((TextView) fVar.mo39639f(R.id.title)).setText(todShuttleTrip.f40432c.f40419c);
            TextView textView = (TextView) fVar.mo39639f(R.id.lock_time);
            long currentTimeMillis = todShuttleTrip.f40434e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                textView.setVisibility(8);
            } else {
                Context context = textView.getContext();
                C13382a.m33674j(textView, context.getString(R.string.voiceover_shuttle_time_to_lock, new Object[]{C7925b.m18020h(context, currentTimeMillis)}));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long hours = timeUnit.toHours(currentTimeMillis);
                if (hours >= 24) {
                    textView.setActivated(false);
                    textView.setText(String.format(this.f46653g, "+%02d:%02d", new Object[]{24, 0}));
                    textView.setVisibility(0);
                } else {
                    long minutes = timeUnit.toMinutes(currentTimeMillis - TimeUnit.HOURS.toMillis(hours));
                    if (hours < 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    textView.setActivated(z2);
                    textView.setText(String.format(this.f46653g, "%02d:%02d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes)}));
                    textView.setVisibility(0);
                }
            }
            TodShuttleSchedule todShuttleSchedule = todShuttleTrip.f40433d;
            ((TextView) fVar.mo39639f(R.id.origin_time)).setText(C7925b.m18024l(e, todShuttleSchedule.f40425b[0]));
            long[] jArr = todShuttleSchedule.f40425b;
            ((TextView) fVar.mo39639f(R.id.destination_time)).setText(C7925b.m18024l(e, jArr[jArr.length - 1]));
            TodShuttlePattern todShuttlePattern = todShuttleTrip.f40432c;
            ((TextView) fVar.mo39639f(R.id.origin)).setText(todShuttlePattern.f40420d.get(0).f40429d);
            List<TodShuttleStop> list = todShuttlePattern.f40420d;
            ((TextView) fVar.mo39639f(R.id.destination)).setText(list.get(list.size() - 1).f40429d);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.tod_shuttle_trip_item_view, viewGroup, false));
            TextView textView = (TextView) fVar.mo39639f(R.id.lock_time);
            textView.setTextColor(UiUtils.m40243b(textView.getContext()));
            C0801k.m2420b(textView, UiUtils.m40243b(textView.getContext()));
            return fVar;
        }
    }

    /* renamed from: o2 */
    public final String mo50676o2() {
        return "tod_shuttle_trip_selection_step";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TodZone todZone = mo50675n2().f40399b;
        if (todZone != null) {
            this.f46649r = todZone;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.tod_shuttle_booking_step_choose_trip_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        int g = UiUtils.m40248g(view.getContext(), 19.0f);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.container);
        this.f46650s = recyclerView;
        recyclerView.mo4593g(C18670g.m45652e(g), -1);
        this.f46650s.mo4593g(C18669f.m45651e(g), -1);
        TextPicker textPicker = (TextPicker) view.findViewById(R.id.day_picker);
        this.f46651t = textPicker;
        textPicker.setTextChangeListener(new C7070l(this, 11));
        TodShuttleTrip todShuttleTrip = null;
        this.f46651t.setTexts(C13720d.m34273c(this.f46649r.f40449d, (C13722f) null, new C17399f0(view, 2)));
        long j = mo50675n2().f40400c;
        List<TodZoneDaySchedule> list = this.f46649r.f40449d;
        int size = list.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (list.get(i).f40451b == j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = Math.max(C13717b.m34257d(this.f46649r.f40449d, new C18292g(0)), 0);
        }
        this.f46651t.setDisplayedTextIndex(i);
        mo50687s2(i);
        Button button = (Button) view.findViewById(R.id.button);
        this.f46652u = button;
        button.setOnClickListener(new C16850a(this, 26));
        RecyclerView.Adapter adapter = this.f46650s.getAdapter();
        if (adapter instanceof C18295a) {
            Button button2 = this.f46652u;
            C18295a aVar = (C18295a) adapter;
            int i2 = aVar.f46655i;
            if (i2 != -1) {
                todShuttleTrip = aVar.f46654h.get(i2);
            }
            if (todShuttleTrip != null) {
                z2 = true;
            }
            button2.setEnabled(z2);
        }
    }

    /* renamed from: p2 */
    public final String mo50677p2() {
        return this.f46649r.f40448c;
    }

    /* renamed from: s2 */
    public final void mo50687s2(int i) {
        List<TodZoneDaySchedule> list = this.f46649r.f40449d;
        C21100e.m49375y(0, list.size() - 1, "dayIndex", i);
        TodZoneDaySchedule todZoneDaySchedule = list.get(i);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "change_time_clicked");
        aVar.mo49936d(AnalyticsAttributeKey.DATE, todZoneDaySchedule.f40451b);
        mo46797j2(aVar.mo49933a());
        List<TodShuttleTrip> list2 = todZoneDaySchedule.f40452c;
        TodShuttleTrip todShuttleTrip = mo50675n2().f40401d;
        RecyclerView recyclerView = this.f46650s;
        recyclerView.setAdapter(new C18295a(recyclerView.getContext(), list2, todShuttleTrip));
    }
}
