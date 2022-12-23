package com.moovit.app.metro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b00.C13556a;
import b00.C13557b;
import ci0.C21211f;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.commons.utils.UiUtils;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.util.ServerIdMap;
import com.tranzmate.R;
import g30.C4773f;
import h30.C5047a;
import h30.C5048b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m10.C18321b;
import p269u2.C6677a;
import p543hq.C17474b;
import p543hq.C17479f;
import p567iq.C17635b;
import p646lz.C18299a;
import p906wz.C20431c;
import p906wz.C20436g;

public class ChangeMetroFragment extends C15676b<MoovitActivity> {

    /* renamed from: z */
    public static final /* synthetic */ int f38931z = 0;

    /* renamed from: h */
    public MetroArea f38932h;

    /* renamed from: i */
    public MetroArea f38933i;

    /* renamed from: j */
    public SwitchProcessStates f38934j;

    /* renamed from: k */
    public long f38935k;

    /* renamed from: l */
    public Handler f38936l;

    /* renamed from: m */
    public TextView f38937m;

    /* renamed from: n */
    public TextView f38938n;

    /* renamed from: o */
    public ProgressBar f38939o;

    /* renamed from: p */
    public ImageView f38940p;

    /* renamed from: q */
    public Button f38941q;

    /* renamed from: r */
    public Button f38942r;

    /* renamed from: s */
    public final C15124a f38943s = new C15124a();

    /* renamed from: t */
    public final C15125b f38944t = new C15125b();

    /* renamed from: u */
    public final C15126c f38945u = new C15126c();

    /* renamed from: v */
    public final C15127d f38946v = new C15127d();

    /* renamed from: w */
    public final C15128e f38947w = new C15128e();

    /* renamed from: x */
    public final C15129f f38948x = new C15129f();

    /* renamed from: y */
    public C13556a f38949y = null;

    public enum SwitchProcessStates {
        CONFIRMATION,
        CHANGING_METRO,
        SUCCESS,
        FAILURE
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$a */
    public class C15124a extends C21211f {
        public C15124a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C5047a aVar = (C5047a) cVar;
            ChangeMetroFragment.this.f38949y = null;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C5047a aVar = (C5047a) cVar;
            ChangeMetroFragment.m38570T1(ChangeMetroFragment.this);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C5047a aVar = (C5047a) cVar;
            ChangeMetroFragment.m38570T1(ChangeMetroFragment.this);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C5047a aVar = (C5047a) cVar;
            C5048b bVar = (C5048b) gVar;
            ChangeMetroFragment.m38569S1(ChangeMetroFragment.this);
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$b */
    public class C15125b implements View.OnClickListener {
        public C15125b() {
        }

        public final void onClick(View view) {
            if (view.getVisibility() == 0) {
                ChangeMetroFragment changeMetroFragment = ChangeMetroFragment.this;
                int i = ChangeMetroFragment.f38931z;
                changeMetroFragment.getClass();
                changeMetroFragment.f38934j = SwitchProcessStates.CHANGING_METRO;
                changeMetroFragment.mo45509X1();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CHANGE_METRO);
                aVar.mo49939g(AnalyticsAttributeKey.BUTTON_CLICK, "change_metro_clicked");
                changeMetroFragment.mo22564R1(aVar.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$c */
    public class C15126c implements View.OnClickListener {
        public C15126c() {
        }

        public final void onClick(View view) {
            if (view.getVisibility() == 0) {
                if (SwitchProcessStates.CONFIRMATION.equals(ChangeMetroFragment.this.f38934j)) {
                    ChangeMetroFragment changeMetroFragment = ChangeMetroFragment.this;
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CHANGE_METRO);
                    aVar.mo49939g(AnalyticsAttributeKey.BUTTON_CLICK, "stay_in_metro_clicked");
                    changeMetroFragment.mo22564R1(aVar.mo49933a());
                }
                ChangeMetroFragment.this.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$d */
    public class C15127d implements Runnable {
        public C15127d() {
        }

        public final void run() {
            ChangeMetroFragment.m38570T1(ChangeMetroFragment.this);
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$e */
    public class C15128e implements Runnable {
        public C15128e() {
        }

        public final void run() {
            ChangeMetroFragment.m38569S1(ChangeMetroFragment.this);
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$f */
    public class C15129f implements Runnable {
        public C15129f() {
        }

        public final void run() {
            MoovitAppApplication x = MoovitAppApplication.m37038x();
            ChangeMetroFragment changeMetroFragment = ChangeMetroFragment.this;
            x.mo44686y(changeMetroFragment.f38933i.f14802b, changeMetroFragment.getActivity(), (Intent) null);
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$g */
    public static /* synthetic */ class C15130g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38956a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.metro.ChangeMetroFragment$SwitchProcessStates[] r0 = com.moovit.app.metro.ChangeMetroFragment.SwitchProcessStates.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38956a = r0
                com.moovit.app.metro.ChangeMetroFragment$SwitchProcessStates r1 = com.moovit.app.metro.ChangeMetroFragment.SwitchProcessStates.CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38956a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.metro.ChangeMetroFragment$SwitchProcessStates r1 = com.moovit.app.metro.ChangeMetroFragment.SwitchProcessStates.CHANGING_METRO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38956a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.metro.ChangeMetroFragment$SwitchProcessStates r1 = com.moovit.app.metro.ChangeMetroFragment.SwitchProcessStates.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38956a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.metro.ChangeMetroFragment$SwitchProcessStates r1 = com.moovit.app.metro.ChangeMetroFragment.SwitchProcessStates.FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.metro.ChangeMetroFragment.C15130g.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.metro.ChangeMetroFragment$h */
    public class C15131h extends C13557b<Void, Void, Boolean> {
        public C15131h() {
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                MoovitAppApplication x = MoovitAppApplication.m37038x();
                ServerId serverId = ChangeMetroFragment.this.f38933i.f14802b;
                C18299a aVar = x.f37321e;
                ((C4773f) x.f37321e.mo50693f("METRO_CONTEXT")).getClass();
                C4773f.m12099s(x, serverId, aVar, false, true, false);
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            ChangeMetroFragment.this.f38949y = null;
            if (!isCancelled()) {
                Boolean bool2 = Boolean.TRUE;
                if (bool2.equals(bool)) {
                    ChangeMetroFragment changeMetroFragment = ChangeMetroFragment.this;
                    A a = changeMetroFragment.f40792c;
                    C5047a aVar = new C5047a(changeMetroFragment.f38933i.f14802b, a.mo44548x1());
                    RequestOptions requestOptions = new RequestOptions();
                    requestOptions.f42909f = true;
                    changeMetroFragment.f38949y = a.mo44527k2(aVar.mo20772O(), aVar, requestOptions, changeMetroFragment.f38943s);
                } else {
                    ChangeMetroFragment.m38570T1(ChangeMetroFragment.this);
                }
                ChangeMetroFragment changeMetroFragment2 = ChangeMetroFragment.this;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.METRO_SYNC);
                aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, bool2.equals(bool));
                changeMetroFragment2.mo22564R1(aVar2.mo49933a());
            }
        }

        public final void onPreExecute() {
            ChangeMetroFragment changeMetroFragment = ChangeMetroFragment.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.START_METRO_SWITCH);
            aVar.mo49937e(AnalyticsAttributeKey.FROM_METRO, ChangeMetroFragment.this.f38932h.f14802b);
            aVar.mo49937e(AnalyticsAttributeKey.TO_METRO, ChangeMetroFragment.this.f38933i.f14802b);
            changeMetroFragment.mo22564R1(aVar.mo49933a());
        }
    }

    public ChangeMetroFragment() {
        super(MoovitActivity.class);
        setStyle(0, 2131952800);
    }

    /* renamed from: S1 */
    public static void m38569S1(ChangeMetroFragment changeMetroFragment) {
        changeMetroFragment.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - changeMetroFragment.f38935k;
        if (elapsedRealtime < 2000) {
            changeMetroFragment.f38936l.removeCallbacks(changeMetroFragment.f38947w);
            changeMetroFragment.f38936l.postDelayed(changeMetroFragment.f38947w, elapsedRealtime);
            return;
        }
        changeMetroFragment.f38934j = SwitchProcessStates.SUCCESS;
        changeMetroFragment.mo45511Z1();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CHANGE_METRO);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
        changeMetroFragment.mo22564R1(aVar.mo49933a());
        changeMetroFragment.f38936l.postDelayed(changeMetroFragment.f38948x, 1000);
    }

    /* renamed from: T1 */
    public static void m38570T1(ChangeMetroFragment changeMetroFragment) {
        changeMetroFragment.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - changeMetroFragment.f38935k;
        if (elapsedRealtime < 2000) {
            changeMetroFragment.f38936l.removeCallbacks(changeMetroFragment.f38946v);
            changeMetroFragment.f38936l.postDelayed(changeMetroFragment.f38946v, elapsedRealtime);
            return;
        }
        changeMetroFragment.f38934j = SwitchProcessStates.FAILURE;
        changeMetroFragment.mo45510Y1();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CHANGE_METRO);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
        changeMetroFragment.mo22564R1(aVar.mo49933a());
    }

    /* renamed from: U1 */
    public static ChangeMetroFragment m38571U1(MetroArea metroArea, MetroArea metroArea2, boolean z) {
        SwitchProcessStates switchProcessStates;
        Bundle bundle = new Bundle();
        bundle.putParcelable("currentMetroArea", metroArea);
        bundle.putParcelable("newMetroArea", metroArea2);
        if (z) {
            switchProcessStates = SwitchProcessStates.CONFIRMATION;
        } else {
            switchProcessStates = SwitchProcessStates.CHANGING_METRO;
        }
        bundle.putSerializable("switchProcessState", switchProcessStates);
        ChangeMetroFragment changeMetroFragment = new ChangeMetroFragment();
        changeMetroFragment.setArguments(bundle);
        return changeMetroFragment;
    }

    /* renamed from: V1 */
    public static ChangeMetroFragment m38572V1(ServerId serverId, ServerId serverId2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("currentMetroId", serverId);
        bundle.putParcelable("newMetroId", serverId2);
        bundle.putSerializable("switchProcessState", SwitchProcessStates.CHANGING_METRO);
        ChangeMetroFragment changeMetroFragment = new ChangeMetroFragment();
        changeMetroFragment.setArguments(bundle);
        return changeMetroFragment;
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        if (this.f38932h == null || this.f38933i == null) {
            return Collections.singleton("SUPPORTED_METROS");
        }
        return Collections.emptySet();
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        this.f38940p = (ImageView) view.findViewById(R.id.icon);
        this.f38937m = (TextView) view.findViewById(R.id.title);
        this.f38938n = (TextView) view.findViewById(R.id.subtitle);
        this.f38939o = (ProgressBar) view.findViewById(R.id.progress_bar);
        Button button = (Button) view.findViewById(R.id.confirm_button);
        this.f38941q = button;
        button.setOnClickListener(this.f38944t);
        Button button2 = (Button) view.findViewById(R.id.dismiss_button);
        this.f38942r = button2;
        button2.setOnClickListener(this.f38945u);
        Bundle K1 = mo46752K1();
        ServerId serverId = (ServerId) K1.getParcelable("currentMetroId");
        ServerId serverId2 = (ServerId) K1.getParcelable("newMetroId");
        if (!(serverId == null || serverId2 == null)) {
            ArrayList arrayList = new ArrayList();
            for (Country country : (List) mo46750H1("SUPPORTED_METROS")) {
                for (MetroArea add : country.f14799e) {
                    arrayList.add(add);
                }
            }
            ServerIdMap a = ServerIdMap.m17949a(arrayList);
            this.f38932h = (MetroArea) a.get(serverId);
            this.f38933i = (MetroArea) a.get(serverId2);
        }
        int i = C15130g.f38956a[this.f38934j.ordinal()];
        if (i == 1) {
            this.f38939o.setVisibility(4);
            UiUtils.m40264w(this.f38940p, 0, 4);
            UiUtils.m40235C(this.f38937m, R.string.change_metro_area_to, 4);
            UiUtils.m40236D(this.f38938n, this.f38933i.f14803c, 4);
            UiUtils.m40236D(this.f38941q, getString(R.string.change_metro_switch_button, this.f38933i.f14803c), 4);
            UiUtils.m40236D(this.f38942r, getString(R.string.change_metro_stay_button, this.f38932h.f14803c), 4);
        } else if (i == 2) {
            mo45509X1();
        } else if (i == 3) {
            mo45511Z1();
        } else if (i == 4) {
            mo45510Y1();
        }
    }

    /* renamed from: P1 */
    public final void mo45507P1(Object obj, String str) {
        dismissAllowingStateLoss();
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: W1 */
    public final void mo45508W1() {
        boolean z;
        Context context = getContext();
        C6677a aVar = C17635b.m43779f(context).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.POPUP;
        if (((C17479f) ((Map) aVar.f20759c).get(analyticsFlowKey)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C17635b.m43779f(context).f50173c.mo22849g(context, analyticsFlowKey);
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_metro_change_type");
            mo22564R1(aVar2.mo49933a());
        }
    }

    /* renamed from: X1 */
    public final void mo45509X1() {
        this.f38935k = SystemClock.elapsedRealtime();
        this.f38939o.setVisibility(0);
        UiUtils.m40264w(this.f38940p, 0, 4);
        UiUtils.m40235C(this.f38937m, R.string.changing_metro_wait_message, 4);
        UiUtils.m40235C(this.f38938n, 0, 4);
        UiUtils.m40235C(this.f38941q, 0, 4);
        UiUtils.m40235C(this.f38942r, 0, 4);
        C13556a aVar = this.f38949y;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38949y = null;
        }
        C15131h hVar = new C15131h();
        hVar.execute(new Void[0]);
        this.f38949y = hVar;
    }

    /* renamed from: Y1 */
    public final void mo45510Y1() {
        this.f38939o.setVisibility(4);
        UiUtils.m40264w(this.f38940p, R.drawable.ic_close_circ_24_error, 4);
        UiUtils.m40236D(this.f38937m, getString(R.string.failed_to_change_metro, this.f38933i.f14803c), 4);
        UiUtils.m40235C(this.f38938n, 0, 4);
        UiUtils.m40235C(this.f38941q, 0, 4);
        UiUtils.m40235C(this.f38942r, R.string.std_positive_button, 4);
    }

    /* renamed from: Z1 */
    public final void mo45511Z1() {
        this.f38939o.setVisibility(4);
        UiUtils.m40264w(this.f38940p, R.drawable.ic_check_mark_circ_24_good, 4);
        UiUtils.m40235C(this.f38937m, 0, 4);
        UiUtils.m40236D(this.f38938n, getString(R.string.welcome_to_metro_message, this.f38933i.f14803c), 4);
        UiUtils.m40235C(this.f38941q, 0, 4);
        UiUtils.m40235C(this.f38942r, 0, 4);
    }

    public final void onCreate(Bundle bundle) {
        SwitchProcessStates switchProcessStates;
        super.onCreate(bundle);
        setCancelable(false);
        mo45508W1();
        Bundle K1 = mo46752K1();
        this.f38932h = (MetroArea) K1.getParcelable("currentMetroArea");
        this.f38933i = (MetroArea) K1.getParcelable("newMetroArea");
        if (bundle == null) {
            switchProcessStates = (SwitchProcessStates) K1.getSerializable("switchProcessState");
        } else {
            switchProcessStates = (SwitchProcessStates) bundle.getSerializable("switchProcessState");
        }
        this.f38934j = switchProcessStates;
        this.f38936l = new Handler(Looper.getMainLooper());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.change_metro_layout, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f38936l.removeCallbacks(this.f38946v);
        this.f38936l.removeCallbacks(this.f38947w);
        this.f38936l.removeCallbacks(this.f38948x);
        C13556a aVar = this.f38949y;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38949y = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("switchProcessState", this.f38934j);
    }

    public final void onStart() {
        super.onStart();
        mo45508W1();
        if (this.f38934j == SwitchProcessStates.CONFIRMATION) {
            C18321b.f46723a.mo49545d(getActivity().getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
        }
    }

    public final void onStop() {
        super.onStop();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_metro_change_type");
        mo22564R1(aVar.mo49933a());
        Context context = getContext();
        C17635b.m43779f(context).f50173c.mo22847b(context, AnalyticsFlowKey.POPUP, false);
    }
}
