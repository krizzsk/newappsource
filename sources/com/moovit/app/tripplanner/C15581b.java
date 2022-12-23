package com.moovit.app.tripplanner;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.view.View;
import b00.C13556a;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import p009a8.C0114n;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.tripplanner.b */
public abstract class C15581b<O extends TripPlannerOptions> extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f40534r = 0;

    /* renamed from: n */
    public final Handler f40535n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    public C15581b<O>.C13555b f40536o = null;

    /* renamed from: p */
    public O f40537p = null;

    /* renamed from: q */
    public long f40538q = -1;

    /* renamed from: com.moovit.app.tripplanner.b$a */
    public interface C15582a {
        /* renamed from: G1 */
        void mo45128G1();
    }

    /* renamed from: com.moovit.app.tripplanner.b$b */
    public class C15583b implements Runnable, C13556a {

        /* renamed from: b */
        public final AtomicBoolean f40539b = new AtomicBoolean(false);

        public C15583b() {
        }

        public final boolean cancel(boolean z) {
            this.f40539b.set(true);
            C15581b.this.f40535n.removeCallbacks(this);
            return true;
        }

        public final void run() {
            if (this.f40539b.compareAndSet(false, true)) {
                C0114n nVar = new C0114n(15);
                int i = C15581b.f40534r;
                C15581b.this.mo46786U1(C15582a.class, nVar);
            }
        }
    }

    public C15581b() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static String m39816m2(Context context, TripPlannerTime tripPlannerTime, CharSequence charSequence) {
        boolean z;
        String str;
        if (tripPlannerTime.mo24489d() || tripPlannerTime.mo24488c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            long b = tripPlannerTime.mo24487b();
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            if (DateUtils.isToday(b)) {
                str = context.getString(R.string.today);
            } else if (C7925b.m18029q(b)) {
                str = context.getString(R.string.tomorrow);
            } else {
                str = DateUtils.formatDateTime(context, b, 26).toString();
            }
            charSequence = C13382a.m33667c(str, C7925b.m18024l(context, b));
        }
        return C13382a.m33667c(context.getString(R.string.voice_over_tripplan_time, new Object[]{charSequence}), context.getString(R.string.time_picker_select_time));
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        if (this.f40537p == null) {
            this.f40537p = mo40550n2();
        }
        if (this.f40538q == -1) {
            this.f40538q = this.f40537p.mo24463V().mo24487b();
        }
        mo40551o2(view);
        mo40552q2(this.f40537p, this.f40538q);
    }

    /* renamed from: n2 */
    public abstract O mo40550n2();

    /* renamed from: o2 */
    public abstract void mo40551o2(View view);

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        O o;
        super.onCreate(bundle);
        if (bundle == null) {
            bundle2 = getArguments();
        } else {
            bundle2 = bundle;
        }
        if (bundle2 != null) {
            o = (TripPlannerOptions) bundle2.getParcelable("options");
        } else {
            o = null;
        }
        this.f40537p = o;
        long j = -1;
        if (bundle != null) {
            j = bundle.getLong("searchTime", -1);
        }
        this.f40538q = j;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("options", this.f40537p);
        bundle.putLong("searchTime", this.f40538q);
    }

    /* renamed from: p2 */
    public final void mo46541p2(O o, long j) {
        O o2 = this.f40537p;
        C21100e.m49373x(o, "options");
        this.f40537p = o;
        this.f40538q = o.mo24463V().mo24487b();
        if (getView() != null) {
            mo40552q2(o, this.f40538q);
        }
        if (!C20975x0.m49118e(o2, o)) {
            C15581b<O>.C13555b bVar = this.f40536o;
            if (bVar != null) {
                bVar.cancel(true);
            }
            C15581b<O>.C13555b bVar2 = new C15583b();
            this.f40536o = bVar2;
            this.f40535n.postDelayed(bVar2, j);
        }
    }

    /* renamed from: q2 */
    public abstract void mo40552q2(O o, long j);
}
