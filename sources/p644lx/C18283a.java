package p644lx;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingState;
import com.tranzmate.R;
import p241s0.C6302b;
import p304x.C7099r1;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: lx.a */
public abstract class C18283a extends C15682c<TodShuttleBookingActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f46614q = 0;

    /* renamed from: n */
    public Button f46615n;

    /* renamed from: o */
    public ColorStateList f46616o;

    /* renamed from: p */
    public ProgressBar f46617p;

    public C18283a() {
        super(TodShuttleBookingActivity.class);
    }

    /* renamed from: m2 */
    public void mo50674m2(C6302b bVar) {
    }

    /* renamed from: n2 */
    public final TodShuttleBookingState mo50675n2() {
        return ((TodShuttleBookingActivity) this.f40822c).f40377Y;
    }

    /* renamed from: o2 */
    public abstract String mo50676o2();

    public final boolean onBackPressed() {
        ProgressBar progressBar = this.f46617p;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public void onStart() {
        super.onStart();
        mo50679r2();
        MoovitExecutors.MAIN_THREAD.execute(new C7099r1(this, 11));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(this instanceof C18296j)) {
            Button button = (Button) view.findViewById(R.id.button);
            this.f46615n = button;
            if (button != null) {
                this.f46616o = button.getTextColors();
                ViewParent parent = this.f46615n.getParent();
                if (parent instanceof ConstraintLayout) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                    LayoutInflater.from(view.getContext()).inflate(R.layout.tod_shuttle_booking_step_progress_bar, constraintLayout, true);
                    ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(R.id.progress_bar);
                    this.f46617p = progressBar;
                    progressBar.getIndeterminateDrawable().setColorFilter(this.f46615n.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
                    return;
                }
                throw new IllegalStateException("Button parent must be ConstraintLayout!");
            }
            throw new IllegalStateException("Unable to find button with id R.id.button");
        }
    }

    /* renamed from: p2 */
    public String mo50677p2() {
        return null;
    }

    /* renamed from: q2 */
    public final void mo50678q2() {
        if (!(this instanceof C18296j)) {
            this.f46615n.setClickable(true);
            this.f46615n.setTextColor(this.f46616o);
            this.f46617p.setVisibility(4);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STEP_COMPLETED);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo50676o2());
        mo46797j2(aVar.mo49933a());
        ((TodShuttleBookingActivity) this.f40822c).mo46415y2();
    }

    /* renamed from: r2 */
    public final void mo50679r2() {
        ActionBar supportActionBar = ((TodShuttleBookingActivity) this.f40822c).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo801w(C20964s0.m49106x(mo50677p2()));
        }
    }
}
