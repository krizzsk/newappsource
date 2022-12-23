package p572iw;

import a00.C13382a;
import a00.C13385b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.appcompat.widget.C0441n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13723g;
import c70.C13751d;
import ce0.C21100e;
import ci0.C21211f;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C14132i;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.surveys.recorder.events.SurveyItineraryEvent;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.SafeRunnable;
import com.moovit.commons.view.BannerView;
import com.moovit.genies.Genie;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.request.UserRequestError;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerTime;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16783l;
import e20.C16790o;
import e20.C16791p;
import e20.C16792q;
import e20.C16794s;
import ja0.C12793c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import m10.C18316a;
import p019b0.C1436m;
import p501fw.C17102a;
import p543hq.C17474b;
import p589jq.C17910b;
import p664mu.C18454l;
import p690nw.C18641a;
import p735pt.C18983d;
import p735pt.C18985f;
import p735pt.C18990g;
import p735pt.C18991h;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p908xd.C20460d;
import p924xt.C20590e;
import p924xt.C20595f;
import p924xt.C20596g;
import p924xt.C20598h;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20956o0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import w40.C25761d;
import z00.C20795a;
import z20.C20806a;

/* renamed from: iw.h */
public class C17666h extends C20598h<TripPlanOptions> {

    /* renamed from: O */
    public static final /* synthetic */ int f45402O = 0;

    /* renamed from: A */
    public C17674j f45403A;

    /* renamed from: B */
    public C13556a f45404B = null;

    /* renamed from: C */
    public C13556a f45405C = null;

    /* renamed from: D */
    public C16792q f45406D;

    /* renamed from: E */
    public final ArrayList f45407E = new ArrayList();

    /* renamed from: F */
    public TripPlanConfig f45408F;

    /* renamed from: G */
    public Snackbar f45409G;

    /* renamed from: H */
    public LocationDescriptor f45410H = null;

    /* renamed from: I */
    public final C17667a f45411I = new C17667a(this, Genie.SUGGESTED_ROUTES_FIRST_ITINERARY);

    /* renamed from: J */
    public final C17668b f45412J = new C17668b(this, Genie.SUGGESTED_ROUTES_MULTI_ROUTES);

    /* renamed from: K */
    public final C17669c f45413K = new C17669c(this, Genie.FLEX_TIME_BANNER);

    /* renamed from: L */
    public final C17670d f45414L = new C17670d();

    /* renamed from: M */
    public final Handler f45415M = new Handler(Looper.getMainLooper());

    /* renamed from: N */
    public final C0441n1 f45416N = new C0441n1(this, 13);

    /* renamed from: iw.h$a */
    public class C17667a extends C17671e {
        public C17667a(C17666h hVar, Genie genie) {
            super(genie, 7000);
        }

        /* renamed from: a */
        public final boolean mo50126a(C20595f fVar) {
            Itinerary itinerary = fVar.f52087a;
            return itinerary != null && C16783l.m42470b(itinerary, 2, 9);
        }
    }

    /* renamed from: iw.h$b */
    public class C17668b extends C17671e {
        public C17668b(C17666h hVar, Genie genie) {
            super(genie, 2000);
        }

        /* renamed from: a */
        public final boolean mo50126a(C20595f fVar) {
            Itinerary itinerary = fVar.f52087a;
            return itinerary != null && C16783l.m42471c(itinerary) > 0;
        }
    }

    /* renamed from: iw.h$c */
    public class C17669c extends C17671e {
        public C17669c(C17666h hVar, Genie genie) {
            super(genie, 1000);
        }

        /* renamed from: a */
        public final boolean mo50126a(C20595f fVar) {
            return fVar.f52091e != null;
        }
    }

    /* renamed from: iw.h$d */
    public class C17670d extends C21211f {
        public C17670d() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            ArrayList arrayList;
            boolean c;
            C16790o oVar = (C16790o) cVar;
            C17666h hVar = C17666h.this;
            TripPlanConfig tripPlanConfig = hVar.f45408F;
            if (tripPlanConfig == null) {
                tripPlanConfig = hVar.f52101s;
            }
            hVar.mo50120J2(tripPlanConfig);
            Snackbar snackbar = C17666h.this.f45409G;
            if (snackbar != null) {
                C14132i b = C14132i.m35170b();
                BaseTransientBottomBar.C14118c cVar2 = snackbar.f35321n;
                synchronized (b.f35354a) {
                    c = b.mo42276c(cVar2);
                }
                if (c) {
                    return;
                }
            }
            if (!C17666h.this.f45407E.isEmpty() && ((Boolean) C19047a.m46164a(C17666h.this.f40822c).mo51505b(C20199a.f51286l0)).booleanValue()) {
                C17666h.this.mo46797j2(new C17474b(AnalyticsEventKey.NEW_ROUTES_SNACKBAR_SHOWN));
                C17666h hVar2 = C17666h.this;
                Snackbar l = Snackbar.m35159l(hVar2.f40822c.findViewById(16908290), R.string.suggested_routes_new_message, -2);
                ((SnackbarContentLayout) l.f35310c.getChildAt(0)).getActionView().setTextColor(C20941h.m49043f(R.attr.colorLive, C17666h.this.requireContext()));
                C17673i iVar = new C17673i(this);
                Snackbar.C14123a aVar = l.f35340s;
                if (!(aVar == null || (arrayList = l.f35319l) == null)) {
                    arrayList.remove(aVar);
                }
                l.mo42224a(iVar);
                l.f35340s = iVar;
                l.mo42256m(R.string.suggested_routes_new_button, new C17102a(this, 2));
                hVar2.f45409G = l;
                C17666h.this.f45409G.mo42259p();
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ boolean mo315c(C20431c cVar, ServerException serverException) {
            C16790o oVar = (C16790o) cVar;
            return true;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ boolean mo316d(C20431c cVar, IOException iOException) {
            C16790o oVar = (C16790o) cVar;
            return true;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ boolean mo319i(C20431c cVar, IOException iOException) {
            C16790o oVar = (C16790o) cVar;
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            boolean z;
            C16790o oVar = (C16790o) cVar;
            TripPlanResult tripPlanResult = ((C16791p) gVar).f43709m;
            TripPlanConfig tripPlanConfig = tripPlanResult.f41851b;
            if (tripPlanConfig != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C17666h.this.f45408F = tripPlanConfig;
            } else if (tripPlanResult.mo48273b()) {
                C17666h.this.f45407E.add(tripPlanResult.f41852c);
            }
        }
    }

    /* renamed from: iw.h$e */
    public abstract class C17671e implements SafeRunnable {

        /* renamed from: b */
        public final Genie f45418b;

        /* renamed from: c */
        public final long f45419c;

        public C17671e(Genie genie, long j) {
            C21100e.m49373x(genie, "genie");
            this.f45418b = genie;
            this.f45419c = Math.max(0, j);
        }

        /* renamed from: a */
        public abstract boolean mo50126a(C20595f fVar);

        /* renamed from: b */
        public final void mo50127b() {
            if (C20943i.m49051d(23)) {
                C17666h.this.f45415M.removeCallbacks(this);
                C17666h.this.f45415M.postDelayed(this, this.f45419c);
            }
        }

        public final /* synthetic */ void onError(Throwable th) {
            C20956o0.m49073a(this, th);
        }

        public final /* synthetic */ void run() {
            C20956o0.m49074b(this);
        }

        public final void safeRun() {
            View view;
            LinearLayoutManager linearLayoutManager;
            int findFirstCompletelyVisibleItemPosition;
            int findLastCompletelyVisibleItemPosition;
            C17666h hVar = C17666h.this;
            A a = hVar.f40822c;
            if (a != null && (view = hVar.getView()) != null) {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.results);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if ((adapter instanceof C20590e) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null && (findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition()) != -1 && (findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()) != -1) {
                    C20590e eVar = (C20590e) adapter;
                    for (findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition(); findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition; findFirstCompletelyVisibleItemPosition++) {
                        if (adapter.getItemViewType(findFirstCompletelyVisibleItemPosition) != 0) {
                            List q = eVar.mo51054q();
                            int o = eVar.mo51053o(findFirstCompletelyVisibleItemPosition);
                            C20595f fVar = (C20595f) ((C20596g) q.get(o)).get(eVar.mo51050k(findFirstCompletelyVisibleItemPosition, o));
                            if (fVar != null && mo50126a(fVar)) {
                                C18316a.f46708c.mo50767a(this.f45418b, linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition), a);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: iw.h$f */
    public class C17672f extends C16794s {
        public C17672f() {
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            int i;
            C16792q qVar = (C16792q) cVar;
            mo50128e(serverException);
            if (!(serverException instanceof UserRequestError)) {
                return false;
            }
            UserRequestError userRequestError = (UserRequestError) serverException;
            C17666h hVar = C17666h.this;
            String d = userRequestError.mo49162d();
            String c = userRequestError.mo49161c();
            Context context = qVar.f51759b;
            int b = userRequestError.mo49160b();
            if (b == 10) {
                i = R.drawable.img_empty_state_near_me;
            } else if (b != 11) {
                i = R.drawable.img_empty_error;
            } else {
                i = R.drawable.img_empty_state_search_location;
            }
            Drawable b2 = C17988b.m44611b(i, context);
            int i2 = C17666h.f45402O;
            RecyclerView recyclerView = hVar.f52100r;
            C21100e.m49373x(hVar.requireContext(), AppActionRequest.KEY_CONTEXT);
            recyclerView.mo4627l0(new C20795a(b2, d, c));
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C16792q qVar = (C16792q) cVar;
            mo50128e(iOException);
            C17666h hVar = C17666h.this;
            int i = C17666h.f45402O;
            hVar.mo52806E2(R.string.request_send_error_message, R.drawable.img_empty_no_network);
            return true;
        }

        /* renamed from: e */
        public final void mo50128e(Exception exc) {
            C17666h hVar = C17666h.this;
            C20806a.C20807a aVar = new C20806a.C20807a("suggested_routes_view");
            aVar.mo52934b(Integer.valueOf(C13751d.m34343d(exc)), "error_code");
            aVar.f52526d = 30;
            MarketingEventImpressionBinder.m41586a(hVar, aVar.mo52933a());
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C16792q qVar = (C16792q) cVar;
            C17666h hVar = C17666h.this;
            int i = C17666h.f45402O;
            if (!(!hVar.f52098p.mo51054q().isEmpty())) {
                mo50128e(iOException);
                C17666h.this.mo52806E2(R.string.response_read_error_message, R.drawable.img_empty_error);
            }
            return true;
        }
    }

    /* renamed from: G2 */
    public final void mo50117G2() {
        C13556a aVar = this.f45405C;
        if (aVar != null) {
            aVar.cancel(true);
            this.f45405C = null;
        }
        this.f45415M.removeCallbacks(this.f45416N);
    }

    /* renamed from: H2 */
    public final void mo50118H2() {
        if (C20943i.m49051d(23)) {
            C17667a aVar = this.f45411I;
            C17666h.this.f45415M.removeCallbacks(aVar);
            C17668b bVar = this.f45412J;
            C17666h.this.f45415M.removeCallbacks(bVar);
            C17669c cVar = this.f45413K;
            C17666h.this.f45415M.removeCallbacks(cVar);
            C18316a.C18317a aVar2 = C18316a.f46708c.f46709a;
            if (aVar2 != null) {
                aVar2.mo50769a();
            }
        }
    }

    /* renamed from: I2 */
    public final void mo50119I2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_routes_banner_impression");
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: J2 */
    public final void mo50120J2(TripPlanConfig tripPlanConfig) {
        mo50117G2();
        int intValue = ((Integer) C19047a.m46164a(this.f40822c).mo51505b(C20199a.f51288m0)).intValue();
        if (tripPlanConfig != null && tripPlanConfig.f41933c && intValue > 0 && !Collections.unmodifiableList(this.f52105w).isEmpty()) {
            this.f45415M.postDelayed(this.f45416N, (long) (intValue * 1000));
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: K2 */
    public final void mo50121K2() {
        List unmodifiableList = Collections.unmodifiableList(this.f52105w);
        if (unmodifiableList.isEmpty()) {
            if (this.f45403A == null) {
                this.f45403A = new C17674j(this, getContext());
            }
            this.f45403A.mo23803d();
            return;
        }
        if (this.f45403A == null) {
            this.f45403A = new C17674j(this, getContext());
        }
        C17674j jVar = this.f45403A;
        jVar.mo49465g(unmodifiableList);
        jVar.mo23804e();
    }

    /* renamed from: L2 */
    public final void mo50122L2() {
        if (this.f45410H != null) {
            Context requireContext = requireContext();
            LocationDescriptor locationDescriptor = this.f45410H;
            if (C18990g.m46100c(locationDescriptor)) {
                C20460d.m48083b(requireContext).mo52651a(C18985f.m46096b(C18991h.m46101b(locationDescriptor))).addOnFailureListener(new C18983d(0));
            }
            this.f45410H = null;
        }
    }

    /* renamed from: M2 */
    public final void mo50123M2(PaymentAccount paymentAccount) {
        boolean z;
        String str;
        String str2;
        String str3;
        if (!C18454l.m45315k() || !C13723g.m34280a(Collections.unmodifiableList(this.f52105w), new C17910b(5))) {
            z = true;
        } else if (!C25761d.m64299a().mo83590e()) {
            z = false;
        } else {
            z = !PaymentAccount.m64175c(paymentAccount, "IsraelMot", PaymentAccountContextStatus.CONNECTED, PaymentAccountContextStatus.INCOMPLETE);
        }
        if (z) {
            this.f52099q.mo47021c(0, (CharSequence) null, (String) null);
            this.f52099q.setOnClickListener((View.OnClickListener) null);
            return;
        }
        boolean c = PaymentAccount.m64175c(paymentAccount, "IsraelMot", PaymentAccountContextStatus.CONNECTED);
        if (c) {
            str = getString(R.string.payment_suggested_routes_connected_message);
        } else {
            str = getString(R.string.payment_suggested_routes_first_use_message);
        }
        if (c) {
            str2 = getString(R.string.payment_suggested_routes_connected_button);
        } else {
            str2 = getString(R.string.payment_suggested_routes_first_use_button);
        }
        if (c) {
            str3 = "payment_account_logged_in";
        } else {
            str3 = "payment_account_logged_out";
        }
        String t = C20964s0.m49102t(" ", str, str2);
        Context requireContext = requireContext();
        SpannableString spannableString = new SpannableString(t);
        spannableString.setSpan(C20964s0.m49084b(requireContext, R.attr.textAppearanceCaption, R.attr.colorOnSurfaceEmphasisHigh), 0, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorPrimary, requireContext)), str.length(), spannableString.length(), 33);
        C17665g gVar = new C17665g(this, c, paymentAccount);
        this.f52099q.mo47021c(R.drawable.ic_qr_24_primary, spannableString, str3);
        this.f52099q.setOnClickListener(gVar);
        BannerView bannerView = this.f52099q;
        C13382a.C13383a aVar = C13382a.f33219a;
        if (bannerView != null) {
            bannerView.setAccessibilityDelegate(new C13385b());
        }
        if (this.f52099q.getVisibility() == 0) {
            mo50119I2();
        }
    }

    /* renamed from: b2 */
    public final void mo46789b2() {
        mo50118H2();
        Snackbar snackbar = this.f45409G;
        if (snackbar != null) {
            snackbar.mo42226c(3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40556o2(com.moovit.tripplanner.TripPlannerLocations r24, com.moovit.tripplanner.TripPlannerOptions r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            com.moovit.app.suggestedroutes.TripPlanOptions r2 = (com.moovit.app.suggestedroutes.TripPlanOptions) r2
            com.moovit.commons.view.BannerView r3 = r0.f52099q
            r4 = 0
            r5 = 0
            r3.mo47021c(r4, r5, r5)
            com.moovit.commons.view.BannerView r3 = r0.f52099q
            r3.setOnClickListener(r5)
            r23.mo50122L2()
            com.moovit.transit.LocationDescriptor r3 = r1.f23787c
            r0.f45410H = r3
            android.content.Context r3 = r23.requireContext()
            com.moovit.transit.LocationDescriptor r6 = r0.f45410H
            boolean r7 = p735pt.C18990g.m46100c(r6)
            r8 = 1
            if (r7 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            android.os.Parcelable$Creator<com.moovit.app.index.UpdateIndexingDescription> r7 = com.moovit.app.index.UpdateIndexingDescription.CREATOR
            java.lang.String r11 = r6.mo24313f()
            java.lang.String r13 = r6.mo24313f()
            java.lang.String r12 = p735pt.C18990g.m46099b(r6)
            com.moovit.app.index.UpdateIndexingDescription r6 = new com.moovit.app.index.UpdateIndexingDescription
            r10 = 1
            r14 = 0
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            xd.c r7 = p908xd.C20459c.m48080a(r3)
            xd.e[] r9 = new p908xd.C20461e[r8]
            com.google.firebase.appindexing.internal.Thing r10 = p735pt.C18985f.m46095a(r6)
            r9[r4] = r10
            com.google.android.gms.tasks.Task r7 = r7.mo52650c(r9)
            java.util.concurrent.ExecutorService r9 = com.moovit.MoovitExecutors.f37327IO
            pt.f$d r10 = new pt.f$d
            r10.<init>(r6)
            r7.continueWith(r9, r10)
        L_0x0059:
            com.moovit.transit.LocationDescriptor r6 = r0.f45410H
            boolean r7 = p735pt.C18990g.m46100c(r6)
            if (r7 != 0) goto L_0x0062
            goto L_0x007a
        L_0x0062:
            pt.h r6 = p735pt.C18991h.m46101b(r6)
            xd.d r3 = p908xd.C20460d.m48083b(r3)
            com.google.firebase.appindexing.internal.zzc r6 = p735pt.C18985f.m46096b(r6)
            com.google.android.gms.tasks.Task r3 = r3.mo52652c(r6)
            pt.e r6 = new pt.e
            r6.<init>(r4)
            r3.addOnFailureListener(r6)
        L_0x007a:
            android.os.Bundle r3 = r23.getArguments()
            if (r3 != 0) goto L_0x0081
            goto L_0x008d
        L_0x0081:
            java.lang.String r6 = "initial_results"
            java.util.ArrayList r7 = r3.getParcelableArrayList(r6)
            boolean r9 = c00.C13717b.m34258e(r7)
            if (r9 == 0) goto L_0x008f
        L_0x008d:
            r3 = 0
            goto L_0x00cf
        L_0x008f:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r7.size()
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
            r10 = r5
        L_0x009d:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r7.next()
            com.moovit.itinerary.TripPlanResult r11 = (com.moovit.itinerary.TripPlanResult) r11
            com.moovit.itinerary.model.TripPlanConfig r12 = r11.f41851b
            if (r12 == 0) goto L_0x00af
            r13 = 1
            goto L_0x00b0
        L_0x00af:
            r13 = 0
        L_0x00b0:
            if (r13 == 0) goto L_0x00b4
            r10 = r12
            goto L_0x009d
        L_0x00b4:
            boolean r12 = r11.mo48273b()
            if (r12 == 0) goto L_0x009d
            com.moovit.itinerary.model.Itinerary r11 = r11.f41852c
            r9.add(r11)
            goto L_0x009d
        L_0x00c0:
            if (r10 == 0) goto L_0x00cb
            r23.mo40558y2()
            r0.mo52810z2(r10)
            r0.mo52808q2(r9)
        L_0x00cb:
            r3.remove(r6)
            r3 = 1
        L_0x00cf:
            if (r3 == 0) goto L_0x00d3
            goto L_0x01eb
        L_0x00d3:
            b00.a r3 = r0.f45404B
            if (r3 == 0) goto L_0x00dc
            r3.cancel(r8)
            r0.f45404B = r5
        L_0x00dc:
            r23.mo50117G2()
            android.view.View r3 = r23.getView()
            if (r3 != 0) goto L_0x00e7
            goto L_0x01eb
        L_0x00e7:
            A r3 = r0.f40822c
            com.moovit.app.taxi.providers.TaxiProvidersManager r5 = com.moovit.app.taxi.providers.TaxiProvidersManager.m39496b(r3)
            if (r5 == 0) goto L_0x00fc
            java.util.List<com.moovit.app.taxi.providers.TaxiProvider> r5 = r5.f39985b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r5 = 0
            r20 = 0
            goto L_0x00ff
        L_0x00fc:
            r5 = 1
            r20 = 1
        L_0x00ff:
            com.moovit.itinerary.TripPlanFlexTimeBanner r5 = r0.f52103u
            if (r5 == 0) goto L_0x0111
            com.moovit.tripplanner.TripPlannerTime r6 = r2.f39803b
            com.moovit.tripplanner.TripPlannerTime r5 = r5.f41848e
            boolean r5 = p977zz.C20975x0.m49118e(r6, r5)
            if (r5 == 0) goto L_0x0111
            r5 = 1
            r21 = 1
            goto L_0x0114
        L_0x0111:
            r5 = 0
            r21 = 0
        L_0x0114:
            e20.q r5 = new e20.q
            c70.e r10 = r23.mo46783R1()
            java.util.HashSet r6 = p824tp.C19728f.f50164e
            java.lang.String r6 = "metro_context"
            java.lang.Object r6 = r3.getSystemService(r6)
            r11 = r6
            tp.f r11 = (p824tp.C19728f) r11
            q00.a$a r6 = q00.C19047a.f48441d
            java.lang.String r6 = "user_configuration"
            java.lang.Object r3 = r3.getSystemService(r6)
            r12 = r3
            q00.a r12 = (q00.C19047a) r12
            com.moovit.tripplanner.TripPlannerTime r13 = r2.f39803b
            com.moovit.tripplanner.TripPlannerRouteType r14 = r2.f39804c
            java.util.Set<com.moovit.tripplanner.TripPlannerTransportType> r15 = r2.f39805d
            com.moovit.tripplanner.TripPlannerPersonalPrefs r3 = r2.f39807f
            com.moovit.accessibility.AccessibilityPersonalPrefs r2 = r2.f39808g
            com.moovit.transit.LocationDescriptor r6 = r1.f23786b
            com.moovit.transit.LocationDescriptor r1 = r1.f23787c
            oy.a r7 = p716oy.C18860a.m45884a()
            com.moovit.tripplanner.TripPlannerAlgorithmType r7 = r7.f48028p
            r9 = r5
            r16 = r3
            r17 = r2
            r18 = r6
            r19 = r1
            r22 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r23.mo40558y2()
            androidx.recyclerview.widget.RecyclerView r1 = r0.f52100r
            if (r1 == 0) goto L_0x016f
            o00.c r2 = r0.f52106x
            r1.mo4568Z(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f52100r
            o00.f r2 = r0.f52107y
            r1.mo4568Z(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f52100r
            ja0.c r2 = new ja0.c
            r2.<init>()
            r1.mo4627l0(r2)
        L_0x016f:
            r0.f45406D = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<e20.q> r2 = e20.C16792q.class
            java.lang.String r3 = "_"
            p379.C13715c.m34249o(r2, r1, r3)
            com.moovit.tripplanner.TripPlannerRouteType r2 = r5.f43723y
            int r2 = p583jk.C17884p.m44335F(r2)
            r3 = 9
            int[] r3 = new int[r3]
            com.moovit.tripplanner.TripPlannerTime r6 = r5.f43724z
            int r6 = p583jk.C17884p.m44335F(r6)
            r3[r4] = r6
            java.util.Collection<com.moovit.tripplanner.TripPlannerTransportType> r4 = r5.f43710A
            int r4 = p583jk.C17884p.m44335F(r4)
            r3[r8] = r4
            com.moovit.transit.LocationDescriptor r4 = r5.f43714E
            int r4 = p583jk.C17884p.m44335F(r4)
            r6 = 2
            r3[r6] = r4
            com.moovit.transit.LocationDescriptor r4 = r5.f43715F
            int r4 = p583jk.C17884p.m44335F(r4)
            r6 = 3
            r3[r6] = r4
            boolean r4 = r5.f43716G
            r6 = 4
            r3[r6] = r4
            r4 = 5
            boolean r6 = r5.f43717H
            r3[r4] = r6
            r4 = 6
            com.moovit.tripplanner.TripPlannerPersonalPrefs r6 = r5.f43712C
            int r6 = p583jk.C17884p.m44335F(r6)
            r3[r4] = r6
            r4 = 7
            com.moovit.accessibility.AccessibilityPersonalPrefs r6 = r5.f43713D
            int r6 = p583jk.C17884p.m44335F(r6)
            r3[r4] = r6
            r4 = 8
            com.moovit.tripplanner.TripPlannerAlgorithmType r6 = r5.f43711B
            int r6 = p583jk.C17884p.m44335F(r6)
            r3[r4] = r6
            int r2 = p583jk.C17884p.m44333D(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.moovit.request.RequestOptions r2 = r23.mo46777L1()
            r2.f42909f = r8
            iw.h$f r3 = new iw.h$f
            r3.<init>()
            b00.a r1 = r0.mo46793f2(r1, r5, r2, r3)
            r0.f45404B = r1
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p572iw.C17666h.mo40556o2(com.moovit.tripplanner.TripPlannerLocations, com.moovit.tripplanner.TripPlannerOptions):void");
    }

    public final void onPause() {
        super.onPause();
        mo50118H2();
    }

    public final void onStart() {
        boolean z;
        super.onStart();
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        RecyclerView recyclerView = this.f52100r;
        if (recyclerView == null || (recyclerView.getAdapter() instanceof C12793c)) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f45404B == null && searchParams != null) {
            mo46524n2(searchParams.f40518c, (TripPlanOptions) searchParams.f40519d);
        } else if (this.f45406D != null) {
            mo50120J2(this.f52101s);
        }
        mo50121K2();
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f45404B;
        if (aVar != null) {
            aVar.cancel(true);
            this.f45404B = null;
        }
        mo50117G2();
        if (this.f45403A == null) {
            this.f45403A = new C17674j(this, getContext());
        }
        this.f45403A.mo23803d();
        mo50122L2();
    }

    /* renamed from: p2 */
    public final boolean mo46525p2(TripPlannerOptions tripPlannerOptions, TripPlannerOptions tripPlannerOptions2) {
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        TripPlanOptions tripPlanOptions2 = (TripPlanOptions) tripPlannerOptions2;
        if (!tripPlanOptions.f39803b.equals(tripPlanOptions2.f39803b) || !tripPlanOptions.f39804c.equals(tripPlanOptions2.f39804c) || !tripPlanOptions.f39805d.equals(tripPlanOptions2.f39805d) || !tripPlanOptions.f39807f.equals(tripPlanOptions2.f39807f) || !C20975x0.m49118e(Boolean.valueOf(tripPlanOptions.f39808g.f37352b), Boolean.valueOf(tripPlanOptions2.f39808g.f37352b))) {
            return true;
        }
        return false;
    }

    /* renamed from: t2 */
    public final void mo50124t2(TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
        super.mo50124t2(tripPlanFlexTimeBanner);
        TripPlannerResultsFragment.SearchParams<O> searchParams = this.f40516o;
        if (searchParams != null) {
            TripPlannerTime tripPlannerTime = tripPlanFlexTimeBanner.f41848e;
            TripPlanOptions tripPlanOptions = (TripPlanOptions) searchParams.f40519d;
            mo46786U1(SuggestRoutesActivity.class, new C1436m(new TripPlanOptions(tripPlannerTime, tripPlanOptions.f39804c, tripPlanOptions.f39805d, tripPlanOptions.f39806e, tripPlanOptions.f39807f, tripPlanOptions.f39808g), 8));
        }
    }

    /* renamed from: u2 */
    public final void mo40557u2(Itinerary itinerary) {
        super.mo40557u2(itinerary);
        mo52804B2(itinerary);
        C18641a.f47503b.mo51027a(new SurveyItineraryEvent(System.currentTimeMillis(), itinerary));
    }

    /* renamed from: v2 */
    public final void mo50125v2(Itinerary itinerary) {
        super.mo50125v2(itinerary);
        C18641a.f47503b.mo51027a(new SurveyItineraryEvent(System.currentTimeMillis(), itinerary));
    }

    /* renamed from: y2 */
    public final void mo40558y2() {
        super.mo40558y2();
        this.f45407E.clear();
        this.f45408F = null;
        Snackbar snackbar = this.f45409G;
        if (snackbar != null) {
            snackbar.mo42226c(3);
        }
    }
}
