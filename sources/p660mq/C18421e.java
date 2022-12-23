package p660mq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bf0.C21050d;
import c00.C13717b;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.genies.Genie;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.usebutton.sdk.internal.events.Events;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import m10.C18316a;
import mf0.C24362h;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p977zz.C20975x0;

/* renamed from: mq.e */
public abstract class C18421e<T extends MoovitActivity> extends C18116c<T> {

    /* renamed from: s */
    public final AtomicReference<C18422a> f46970s = new AtomicReference<>(new C18422a(C23826d.m58530U(), EmptyList.f60173b, "empty"));

    /* renamed from: mq.e$a */
    public static final class C18422a {

        /* renamed from: a */
        public final String f46971a;

        /* renamed from: b */
        public final List<ServerId> f46972b;

        /* renamed from: c */
        public final Map<ServerId, List<ServerId>> f46973c;

        public C18422a(Map map, List list, String str) {
            C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
            C24362h.m61211f(list, "stopIds");
            this.f46971a = str;
            this.f46972b = list;
            this.f46973c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18422a)) {
                return false;
            }
            C18422a aVar = (C18422a) obj;
            return C24362h.m61206a(this.f46971a, aVar.f46971a) && C24362h.m61206a(this.f46972b, aVar.f46972b) && C24362h.m61206a(this.f46973c, aVar.f46973c);
        }

        public final int hashCode() {
            int hashCode = this.f46972b.hashCode();
            return this.f46973c.hashCode() + ((hashCode + (this.f46971a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Snapshot(key=");
            k.append(this.f46971a);
            k.append(", stopIds=");
            k.append(this.f46972b);
            k.append(", lineIdsByStopId=");
            k.append(this.f46973c);
            k.append(')');
            return k.toString();
        }
    }

    public C18421e(Class<T> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public abstract Genie mo50869A2();

    /* renamed from: B2 */
    public final C18422a mo50874B2() {
        C18422a z2;
        String C2 = mo50870C2();
        C18422a aVar = this.f46970s.get();
        C24362h.m61210e(aVar, "snapshotRef.get()");
        C18422a aVar2 = aVar;
        if (C20975x0.m49118e(C2, aVar2.f46971a)) {
            return aVar2;
        }
        synchronized (this.f46970s) {
            z2 = mo50871z2();
            this.f46970s.set(z2);
            C21050d dVar = C21050d.f52856a;
        }
        return z2;
    }

    /* renamed from: C2 */
    public abstract String mo50870C2();

    /* renamed from: D2 */
    public final void mo50875D2(ServerId serverId) {
        boolean z;
        C24362h.m61211f(serverId, "stopId");
        List list = mo50874B2().f46973c.get(serverId);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = StopArrivalsActivity.f39603q0;
            Context requireContext = requireContext();
            C24362h.m61210e(requireContext, "requireContext()");
            C24362h.m61211f(list, "lineIds");
            Intent intent = new Intent(requireContext, StopArrivalsActivity.class);
            intent.putExtra("stopId", serverId);
            intent.putParcelableArrayListExtra("lineIds", C13717b.m34264k(list));
            startActivity(intent);
            this.f40822c.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        }
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C24362h.m61211f(button, Events.VALUE_TYPE_BUTTON);
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.live_location_button);
        C17885a.m44467v0(button, R.drawable.ic_transit_type_bus_16_on_surface);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        C18422a B2 = mo50874B2();
        boolean z = true;
        if (!(!B2.f46972b.isEmpty()) || !(!B2.f46973c.isEmpty())) {
            z = false;
        }
        Task<Boolean> forResult = Tasks.forResult(Boolean.valueOf(z));
        C24362h.m61210e(forResult, "forResult(snapshot.stopI…IdsByStopId.isNotEmpty())");
        return forResult;
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "live_location_clicked");
        mo46797j2(aVar.mo49933a());
        C18422a B2 = mo50874B2();
        if (B2.f46972b.size() == 1) {
            mo50875D2((ServerId) C23825c.m58513j0(B2.f46972b));
            return;
        }
        List<ServerId> list = B2.f46972b;
        C24362h.m61211f(list, "stopIds");
        LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment = new LiveLocationTransitStopChooserFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("stopIds", C13717b.m34264k(list));
        liveLocationTransitStopChooserFragment.setArguments(bundle);
        liveLocationTransitStopChooserFragment.show(getChildFragmentManager(), "transit_stop_chooser_fragment");
    }

    /* renamed from: y2 */
    public final void mo50563y2(Button button) {
        C24362h.m61211f(button, Events.VALUE_TYPE_BUTTON);
        Genie A2 = mo50869A2();
        A a = this.f40822c;
        if (a != null && A2 != null) {
            C18316a.f46708c.mo50767a(A2, button, a);
        }
    }

    /* renamed from: z2 */
    public abstract C18422a mo50871z2();
}
