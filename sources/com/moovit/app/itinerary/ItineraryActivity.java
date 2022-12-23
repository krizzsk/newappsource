package com.moovit.app.itinerary;

import a00.C13382a;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import c00.C13717b;
import c70.C13751d;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.MoovitNotificationChannel;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.itinerary.view.ItineraryListView;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.list.ListItemView;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.notification.GcmNotificationPublisher;
import com.moovit.gcm.payload.TripPlanPayload;
import com.moovit.genies.Genie;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e00.C16760a;
import e20.C16769e;
import e20.C16783l;
import e20.C16789n;
import e20.C16795t;
import e20.C16796u;
import ga0.C12699d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import m10.C18316a;
import m10.C18321b;
import p001a0.C0016g;
import p001a0.C0017h;
import p039c7.C1800c;
import p067e1.C4486g;
import p073e7.C4585c;
import p241s0.C6302b;
import p297w5.C6994a;
import p373au.C13521a;
import p373au.C13526b;
import p453dw.C16738n;
import p471eq.C16850a;
import p543hq.C17474b;
import p613kq.C18118d;
import p824tp.C19728f;
import p858uz.C20061g;
import p874vr.C20199a;
import p886wf.C20295a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20943i;
import q00.C19047a;
import z20.C20806a;

public class ItineraryActivity extends MoovitAppActivity implements AbstractLegView.C15075b, C13521a.C13525b {

    /* renamed from: B0 */
    public static final /* synthetic */ int f38474B0 = 0;

    /* renamed from: A0 */
    public boolean f38475A0;

    /* renamed from: U */
    public final C4052r f38476U = new C4052r(this, 10);

    /* renamed from: X */
    public final C1800c f38477X = new C1800c(this, 10);

    /* renamed from: Y */
    public List<Itinerary> f38478Y;

    /* renamed from: Z */
    public int f38479Z;

    /* renamed from: l0 */
    public ListItemView f38480l0;

    /* renamed from: m0 */
    public Button f38481m0;

    /* renamed from: n0 */
    public Button f38482n0;

    /* renamed from: o0 */
    public TextView f38483o0;

    /* renamed from: p0 */
    public ItineraryListView f38484p0;

    /* renamed from: q0 */
    public C15043f f38485q0;

    /* renamed from: r0 */
    public ViewSwitcher f38486r0;

    /* renamed from: s0 */
    public boolean f38487s0;

    /* renamed from: t0 */
    public final C16760a f38488t0 = new C16760a(new C6302b(), 0);

    /* renamed from: u0 */
    public C15040d f38489u0;

    /* renamed from: v0 */
    public C18118d f38490v0;

    /* renamed from: w0 */
    public ReturnTripReminderView f38491w0;

    /* renamed from: x0 */
    public ReturnTripReminderView f38492x0;

    /* renamed from: y0 */
    public final C15025a f38493y0 = new C15025a();

    /* renamed from: z0 */
    public LinearLayout f38494z0;

    /* renamed from: com.moovit.app.itinerary.ItineraryActivity$a */
    public class C15025a extends C20438i<C16795t, C16796u> {
        public C15025a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C16795t tVar = (C16795t) cVar;
            ItineraryActivity itineraryActivity = ItineraryActivity.this;
            if (itineraryActivity.f38486r0.getCurrentView().getId() == R.id.progress_animation) {
                itineraryActivity.f38486r0.showPrevious();
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int indexOf;
            C16795t tVar = (C16795t) cVar;
            Itinerary itinerary = ((C16796u) gVar).f43736m;
            if (itinerary != null && (indexOf = ItineraryActivity.this.f38478Y.indexOf(tVar.f43734y)) >= 0) {
                String str = itinerary.f41894b;
                ItineraryActivity.this.f38478Y.set(indexOf, itinerary);
                ItineraryActivity.this.f38488t0.put(str, Integer.valueOf(tVar.f43735z));
                ItineraryActivity itineraryActivity = ItineraryActivity.this;
                if (indexOf == itineraryActivity.f38479Z) {
                    itineraryActivity.f38475A0 = false;
                    if (tVar.f43735z != 0) {
                        itineraryActivity.f38489u0.mo23803d();
                    } else {
                        itineraryActivity.f38489u0.mo23804e();
                    }
                    ItineraryActivity itineraryActivity2 = ItineraryActivity.this;
                    itineraryActivity2.mo45271F2(itineraryActivity2.f38479Z, false);
                }
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16795t tVar = (C16795t) cVar;
            ItineraryActivity itineraryActivity = ItineraryActivity.this;
            itineraryActivity.mo44530n2(C13751d.m34341b(itineraryActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.app.itinerary.ItineraryActivity$b */
    public static /* synthetic */ class C15026b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38496a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.micromobility.MicroMobilityIntegrationFlow[] r0 = com.moovit.micromobility.MicroMobilityIntegrationFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38496a = r0
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38496a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38496a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.ItineraryActivity.C15026b.<clinit>():void");
        }
    }

    /* renamed from: y2 */
    public static Intent m37991y2(Context context, Itinerary itinerary) {
        return m37992z2(context, Collections.singletonList(itinerary), false, false);
    }

    /* renamed from: z2 */
    public static Intent m37992z2(Context context, List list, boolean z, boolean z2) {
        Intent intent = new Intent(context, ItineraryActivity.class);
        intent.putParcelableArrayListExtra("scheduled_itinerary_list_key", new ArrayList(list));
        intent.putExtra("scheduled_itinerary_list_index_key", 0);
        intent.putExtra("disable_actions_extra", z);
        intent.putExtra("display_history_date_extra", z2);
        return intent;
    }

    /* renamed from: A2 */
    public final Itinerary mo45266A2() {
        return this.f38478Y.get(this.f38479Z);
    }

    /* renamed from: B2 */
    public final void mo45267B2(AppDeepLink appDeepLink) {
        String str;
        if (appDeepLink != null) {
            C19047a a = C19047a.m46164a(getApplicationContext());
            if (a == null || !((Boolean) a.mo51505b(C20199a.f51307y0)).booleanValue()) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                if (appDeepLink.mo46945b(this)) {
                    str = "open_app";
                } else {
                    str = "download_app";
                }
                aVar.mo49939g(analyticsAttributeKey, str);
                aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, appDeepLink.f40997b);
                mo44545v2(aVar.mo49933a());
                appDeepLink.mo46946c(this);
                return;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, appDeepLink.f40997b);
            mo44545v2(aVar2.mo49933a());
            startActivity(WondoOffersActivity.m39988y2(this, appDeepLink.f40997b));
        }
    }

    /* renamed from: C2 */
    public final void mo45268C2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo44545v2(aVar.mo49933a());
        C12699d.C12701b bVar = new C12699d.C12701b(getResources());
        bVar.mo39494d("return_trip_reminder_tag");
        bVar.mo39488j();
        CharSequence text = bVar.f31374a.getText(R.string.return_trip_reminder_picker);
        if (text == null) {
            bVar.mo39491a("title");
        }
        bVar.f31375b.putCharSequence("title", text);
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.HOURS;
        bVar.f31375b.putLong("minTime", timeUnit.toMillis(1) + currentTimeMillis);
        bVar.mo39487i(timeUnit.toMillis(1) + System.currentTimeMillis());
        bVar.mo39493c(R.string.done);
        bVar.mo39492b(R.string.cancel);
        bVar.f31375b.putString("source", str);
        bVar.mo39489k().show(getSupportFragmentManager(), "return_trip_reminder_tag");
    }

    /* renamed from: D2 */
    public final void mo45269D2() {
        startActivity(SuggestRoutesActivity.m39325M2(this, (TripPlanParams) getIntent().getParcelableExtra("trip_plan_params_extra"), true));
        finish();
    }

    /* renamed from: E2 */
    public final void mo45270E2(long j, String str, String str2) {
        Long l;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        aVar.mo49945m(AnalyticsAttributeKey.SOURCE, str2);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TIME;
        if (j != -1) {
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        aVar.mo49944l(analyticsAttributeKey, l);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: F2 */
    public final void mo45271F2(int i, boolean z) {
        int i2;
        this.f38479Z = i;
        this.f38484p0.setItinerary(this.f38478Y.get(i));
        Itinerary itinerary = this.f38478Y.get(i);
        mo45273H2();
        if (!this.f38487s0) {
            this.f38482n0.setVisibility(0);
            this.f38481m0.setVisibility(0);
        }
        this.f38489u0.mo49466h(itinerary);
        String str = null;
        if (z) {
            this.f38485q0.mo45313d(itinerary, (C16769e.C16772c) null);
            this.f38485q0.mo45311b(itinerary);
        }
        if (((Integer) this.f38488t0.get(itinerary.f41894b)).intValue() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.f38483o0.setTypeface((Typeface) null, i2);
        mo45274I2();
        ItineraryMetadata itineraryMetadata = itinerary.f41895c;
        this.f38482n0.setEnabled(itineraryMetadata.f41905g);
        this.f38481m0.setEnabled(itineraryMetadata.f41906h);
        String f = itinerary.mo48290c().mo48334e2().mo24313f();
        this.f38480l0.setTitle((CharSequence) f);
        String r = C16783l.m42486r(this, itinerary);
        CurrencyAmount currencyAmount = itinerary.f41895c.f41904f;
        if (currencyAmount == null) {
            this.f38480l0.setSubtitle((CharSequence) r);
        } else {
            ListItemView listItemView = this.f38480l0;
            listItemView.setSubtitle((CharSequence) r + getString(R.string.string_list_delimiter_dot) + currencyAmount.toString());
        }
        CharSequence h = C7925b.m18020h(this, C16783l.m42485q(itinerary, TimeUnit.MILLISECONDS));
        ListItemView listItemView2 = this.f38480l0;
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = getString(R.string.tripplan_itinerary_trip_duration_label);
        charSequenceArr[1] = h;
        charSequenceArr[2] = getString(R.string.voice_over_towards, new Object[]{f});
        if (currencyAmount != null) {
            str = getString(R.string.voiceover_fare, new Object[]{currencyAmount});
        }
        charSequenceArr[3] = str;
        C13382a.m33674j(listItemView2, charSequenceArr);
        if (this.f38490v0 == null) {
            this.f38490v0 = new C18118d(this, C20199a.f51249K0);
        }
        this.f38490v0.mo50564a();
    }

    /* renamed from: G2 */
    public final void mo45272G2(int i) {
        if (this.f38486r0.getCurrentView().getId() != R.id.progress_animation) {
            this.f38486r0.showNext();
        }
        Itinerary A2 = mo45266A2();
        int intValue = ((Integer) this.f38488t0.get(A2.f41894b)).intValue();
        Tasks.call(MoovitExecutors.f37327IO, new C20295a(1, this, A2.f41895c.f41900b)).addOnSuccessListener((Activity) this, new C15038b(this, mo44548x1(), (C19728f) mo44537r1("METRO_CONTEXT"), (C19047a) mo44537r1("CONFIGURATION"), A2, intValue, i));
    }

    /* renamed from: H2 */
    public final void mo45273H2() {
        if (getIntent().getBooleanExtra("display_history_date_extra", false)) {
            String f = C7925b.m18018f(this, this.f38478Y.get(0).mo48294o1().mo24631g(), false);
            TextView textView = (TextView) findViewById(R.id.trip_date);
            textView.setVisibility(0);
            textView.setText(getResources().getString(R.string.trip_planned_at, new Object[]{f}));
        }
    }

    /* renamed from: I2 */
    public final void mo45274I2() {
        Itinerary A2 = mo45266A2();
        String l = C7925b.m18024l(this, A2.mo48294o1().mo24631g());
        String l2 = C7925b.m18024l(this, A2.mo48288K1().mo24631g());
        this.f38483o0.setText(getString(R.string.itinerary_start_end_times, new Object[]{l, l2}));
        this.f38483o0.setContentDescription(getString(R.string.voice_over_itinerary_trip_time, new Object[]{l, l2}));
        TextView textView = this.f38483o0;
        C13382a.m33665a(textView, textView.getContentDescription());
    }

    /* renamed from: S1 */
    public final void mo19483S1(int i, String str) {
        String str2;
        int i2;
        if ("return_trip_reminder_tag".equals(str)) {
            C12699d dVar = (C12699d) mo44539t1(str);
            if (dVar.getArguments() != null) {
                str2 = dVar.getArguments().getString("source");
            } else {
                str2 = null;
            }
            if (i == -2) {
                mo45270E2(-1, "return_trip_reminder_dialog_cancel_clicked", str2);
            } else if (i == -1) {
                mo45270E2(dVar.mo39477W1(), "return_trip_reminder_dialog_done_clicked", str2);
                long W1 = dVar.mo39477W1();
                Toast.makeText(this, R.string.return_trip_reminder_success, 1).show();
                this.f38491w0.setReminderTime(W1);
                this.f38492x0.setReminderTime(W1);
                LocationDescriptor e2 = mo45266A2().mo48289b().mo48334e2();
                StringBuilder k = C13555b.m33972k("RETURN_TRIP#");
                k.append(UUID.randomUUID().toString());
                String sb = k.toString();
                TripPlanParams.C7626d dVar2 = new TripPlanParams.C7626d();
                dVar2.f23791b = e2;
                long j = W1;
                GcmNotification gcmNotification = new GcmNotification(getString(R.string.return_trip_reminder_push_title), getString(R.string.return_trip_reminder_push_body), (String) null, (String) null, j, new TripPlanPayload(sb, dVar2.mo23958a(), true), GcmNotification.f41516j, MoovitNotificationChannel.RIDE_SHARING);
                int i3 = GcmNotificationPublisher.f41527a;
                Intent intent = new Intent(this, GcmNotificationPublisher.class);
                intent.putExtra("notification", gcmNotification);
                if (C20943i.m49051d(23)) {
                    i2 = 335544320;
                } else {
                    i2 = 268435456;
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, i2);
                AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                if (Build.VERSION.SDK_INT >= 23) {
                    C4486g.m11708a(alarmManager, 0, W1, broadcast);
                } else {
                    alarmManager.set(0, W1, broadcast);
                }
            }
        }
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        Itinerary itinerary = ((C16789n) C13717b.m34256c(list)).f43705m;
        if (itinerary == null) {
            mo45269D2();
            return;
        }
        this.f38478Y = Arrays.asList(new Itinerary[]{itinerary});
    }

    /* renamed from: W1 */
    public final void mo44514W1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        super.mo44514W1(arrayListHashMap, map);
        mo45269D2();
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f38489u0.mo23803d();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        boolean z;
        super.mo19425e2(bundle);
        if (!isFinishing()) {
            setContentView((int) R.layout.itinerary_activity);
            this.f38480l0 = (ListItemView) findViewById(R.id.header);
            this.f38481m0 = (Button) findViewById(R.id.itinerary_prev);
            this.f38482n0 = (Button) findViewById(R.id.itinerary_next);
            this.f38483o0 = (TextView) findViewById(R.id.trip_times_range);
            this.f38486r0 = (ViewSwitcher) findViewById(R.id.progres_switcher);
            this.f38494z0 = (LinearLayout) findViewById(R.id.trip_times_range_container);
            View findViewById = findViewById(R.id.more_routes_banner);
            if (this.f38478Y != null) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
            findViewById.setOnClickListener(new C4585c(this, 14));
            MapFragment mapFragment = (MapFragment) mo44529n1(R.id.map_fragment);
            int h = UiUtils.m40249h(getResources(), 5.0f);
            mapFragment.mo48645n3(h, h, h, h);
            this.f38485q0 = new C15043f(this, mapFragment);
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            getSupportActionBar().mo791m(true);
            ReturnTripReminderView returnTripReminderView = (ReturnTripReminderView) findViewById(R.id.return_trip_reminder_header);
            this.f38491w0 = returnTripReminderView;
            returnTripReminderView.setOnClickListener(new C6994a(this, 13));
            ReturnTripReminderView returnTripReminderView2 = (ReturnTripReminderView) findViewById(R.id.return_trip_reminder_footer);
            this.f38492x0 = returnTripReminderView2;
            returnTripReminderView2.setOnClickListener(new C16850a(this, 13));
            ItineraryListView itineraryListView = (ItineraryListView) findViewById(R.id.itinerary_legs);
            this.f38484p0 = itineraryListView;
            itineraryListView.setListener(this);
            this.f38484p0.setStopImagesManagerFragment(C16738n.m42285w2(getSupportFragmentManager()));
            this.f38481m0.setOnClickListener(this.f38476U);
            this.f38482n0.setOnClickListener(this.f38477X);
            this.f38494z0.setOnClickListener(new C4051q(this, 18));
            Intent intent = getIntent();
            if (this.f38478Y == null) {
                this.f38478Y = intent.getParcelableArrayListExtra("scheduled_itinerary_list_key");
            }
            this.f38475A0 = true;
            this.f38479Z = intent.getIntExtra("scheduled_itinerary_list_index_key", 0);
            this.f38488t0.clear();
            if (this.f38478Y != null) {
                this.f38489u0 = new C15040d(this, this);
                mo45271F2(this.f38479Z, true);
                boolean booleanExtra = intent.getBooleanExtra("disable_actions_extra", false);
                this.f38487s0 = booleanExtra;
                if (booleanExtra) {
                    this.f38482n0.setVisibility(8);
                    this.f38481m0.setVisibility(8);
                }
                mo45273H2();
                if (!((Boolean) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C20199a.f51275f1)).booleanValue()) {
                    UiUtils.m40238F(8, this.f38491w0, this.f38492x0);
                } else {
                    long g = mo45266A2().mo48294o1().mo24631g() - System.currentTimeMillis();
                    if (g < 0 || g > TimeUnit.MINUTES.toMillis(30)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        UiUtils.m40238F(8, this.f38491w0, this.f38492x0);
                    } else {
                        UiUtils.m40238F(0, this.f38491w0, this.f38492x0);
                        C18316a.f46708c.mo50767a(Genie.RETURN_TRIP_REMINDER, this.f38491w0, this);
                        AnalyticsEventKey analyticsEventKey = AnalyticsEventKey.CONTENT_SHOWN;
                        C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                        aVar.mo49939g(analyticsAttributeKey, "return_trip_reminder_header_impression");
                        mo44545v2(aVar.mo49933a());
                        C17474b.C17475a aVar2 = new C17474b.C17475a(analyticsEventKey);
                        aVar2.mo49939g(analyticsAttributeKey, "return_trip_reminder_footer_impression");
                        mo44545v2(aVar2.mo49933a());
                    }
                }
                C14741h hVar = new C14741h();
                hVar.mo44745a(1, mo44542u1());
                hVar.mo44745a(2, mo45266A2().mo48290c().mo48334e2().mo24310d());
                ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.ITINERARY_SCREEN_BANNER, hVar);
                C18321b.f46724b.mo49545d(getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
                C20806a.C20807a aVar3 = new C20806a.C20807a("itinerary_view");
                aVar3.f52526d = 30;
                MarketingEventImpressionBinder.m41586a(this, aVar3.mo52933a());
                return;
            }
            throw new IllegalStateException(getClass().getName() + " can not be initiated with out a Itinerary list");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c70.C13753f<?> mo44522f1() {
        /*
            r15 = this;
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r1 = "trip_plan_params_extra"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.moovit.suggestedroutes.TripPlanParams r0 = (com.moovit.suggestedroutes.TripPlanParams) r0
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.String r2 = "CONFIGURATION"
            java.lang.Object r2 = r15.mo44537r1(r2)
            r6 = r2
            q00.a r6 = (q00.C19047a) r6
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r2 = r15.mo44537r1(r2)
            r5 = r2
            tp.f r5 = (p824tp.C19728f) r5
            java.lang.String r2 = "TRIP_PLANNER_CONFIGURATION"
            java.lang.Object r2 = r15.mo44537r1(r2)
            v90.a r2 = (v90.C13187a) r2
            java.lang.String r3 = "ACCESSIBILITY_CONFIGURATION"
            java.lang.Object r3 = r15.mo44537r1(r3)
            jq.a r3 = (p589jq.C17909a) r3
            com.moovit.transit.LocationDescriptor r4 = r0.f23788b
            if (r4 != 0) goto L_0x0052
            com.moovit.location.a r4 = com.moovit.location.C16202a.get(r15)
            uz.g r4 = r4.getPermissionAwareHighAccuracyFrequentUpdates()
            android.location.Location r4 = r4.mo50014i()
            com.moovit.commons.geo.LatLonE6 r4 = com.moovit.commons.geo.LatLonE6.m40177j(r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x0057
        L_0x0049:
            com.moovit.transit.LocationDescriptor r7 = com.moovit.transit.LocationDescriptor.m17772m(r15)
            r7.mo24317n(r4)
            r12 = r7
            goto L_0x0053
        L_0x0052:
            r12 = r4
        L_0x0053:
            com.moovit.transit.LocationDescriptor r13 = r0.f23789c
            if (r13 != 0) goto L_0x0059
        L_0x0057:
            r0 = r1
            goto L_0x0090
        L_0x0059:
            com.moovit.tripplanner.TripPlannerTime r4 = r0.f23218d
            if (r4 != 0) goto L_0x0061
            com.moovit.tripplanner.TripPlannerTime r4 = com.moovit.tripplanner.TripPlannerTime.m17899f()
        L_0x0061:
            r7 = r4
            com.moovit.tripplanner.TripPlannerRouteType r4 = r0.f23219e
            if (r4 != 0) goto L_0x006a
            com.moovit.tripplanner.TripPlannerRouteType r4 = r2.mo40061b()
        L_0x006a:
            r8 = r4
            java.util.Set<com.moovit.tripplanner.TripPlannerTransportType> r0 = r0.f23220f
            boolean r4 = c00.C13717b.m34258e(r0)
            if (r4 == 0) goto L_0x0077
            java.util.Set r0 = r2.mo40063d()
        L_0x0077:
            r9 = r0
            com.moovit.tripplanner.TripPlannerPersonalPrefs r10 = r2.mo40060a()
            com.moovit.accessibility.AccessibilityPersonalPrefs r11 = r3.mo50463a()
            e20.m r0 = new e20.m
            c70.e r4 = r15.mo44548x1()
            oy.a r2 = p716oy.C18860a.m45884a()
            com.moovit.tripplanner.TripPlannerAlgorithmType r14 = r2.f48028p
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0090:
            if (r0 != 0) goto L_0x0093
            return r1
        L_0x0093:
            c70.f r1 = new c70.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<e20.m> r3 = e20.C16788m.class
            java.lang.String r4 = "_"
            p379.C13715c.m34249o(r3, r2, r4)
            com.moovit.tripplanner.TripPlannerRouteType r3 = r0.f43703y
            java.lang.String r3 = r3.name()
            r2.append(r3)
            com.moovit.tripplanner.TripPlannerTime r3 = r0.f43704z
            com.moovit.tripplanner.TripPlannerTime$Type r3 = r3.f23799b
            java.lang.String r3 = r3.name()
            r2.append(r3)
            com.moovit.tripplanner.TripPlannerTime r3 = r0.f43704z
            long r3 = r3.mo24487b()
            r2.append(r3)
            java.util.Collection<com.moovit.tripplanner.TripPlannerTransportType> r3 = r0.f43695A
            java.lang.String r3 = c00.C13717b.m34269p(r3)
            r2.append(r3)
            com.moovit.transit.LocationDescriptor r3 = r0.f43696B
            r2.append(r3)
            com.moovit.transit.LocationDescriptor r3 = r0.f43697C
            r2.append(r3)
            boolean r3 = r0.f43698D
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.ItineraryActivity.mo44522f1():c70.f");
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        Integer num;
        super.mo24881f2();
        Itinerary A2 = mo45266A2();
        if (!(A2 == null || (num = (Integer) this.f38488t0.get(A2.f41894b)) == null || num.intValue() != 0)) {
            this.f38489u0.mo23804e();
        }
        AnalyticsEventKey analyticsEventKey = AnalyticsEventKey.ITINERARY_LOADED;
        Itinerary A22 = mo45266A2();
        C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
        aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_INDEX, this.f38479Z);
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_ITINERARIES, this.f38478Y.size());
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_STEPS, A22.mo48295u0().size() + 1);
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, A22.f41894b);
        aVar.mo49935c(AnalyticsAttributeKey.LEGS_WITH_ALTERNATIVES, C16783l.m42471c(A22));
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: m */
    public final void mo40416m(MultiTransitLinesLeg multiTransitLinesLeg, int i) {
        Itinerary A2 = mo45266A2();
        if (A2 != null) {
            boolean D = C16783l.m42467D(A2, multiTransitLinesLeg, i);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.WAS_LINE_CHANGED);
            aVar.mo49941i(AnalyticsAttributeKey.LINE_CHANGED, D);
            mo44545v2(aVar.mo49933a());
            ItineraryListView itineraryListView = this.f38484p0;
            itineraryListView.mo45337o();
            itineraryListView.f38654L = A2;
            List<Leg> u0 = A2.mo48295u0();
            if (itineraryListView.f38652J.getVisibility() == 0) {
                itineraryListView.mo45338p(u0);
            }
            int size = u0.size();
            for (int i2 = 0; i2 < size; i2++) {
                Leg leg = u0.get(i2);
                AbstractLegView abstractLegView = (AbstractLegView) itineraryListView.f38653K.get(i2);
                if (abstractLegView != null) {
                    abstractLegView.mo45376I(leg, C16783l.m42489u(i2, u0), itineraryListView.f38655M, itineraryListView.f38656N);
                }
            }
            UiUtils.m40259r(itineraryListView, new C13526b(itineraryListView));
            this.f38485q0.mo45313d(A2, this.f38489u0.f43661l);
            mo45274I2();
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        int i;
        Intent intent = getIntent();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("scheduled_itinerary_list_key");
        boolean z = false;
        int intExtra = intent.getIntExtra("scheduled_itinerary_list_index_key", 0);
        if (parcelableArrayListExtra == null || intExtra < 0 || intExtra >= parcelableArrayListExtra.size()) {
            str = null;
            i = 0;
        } else {
            Itinerary itinerary = (Itinerary) parcelableArrayListExtra.get(intExtra);
            z = itinerary.f41895c.f41908j;
            str = C0017h.m52I(itinerary);
            i = C16783l.m42473e(itinerary);
        }
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.WHEELCHAIR_ACCESSIBLE, z);
        m1.mo49939g(AnalyticsAttributeKey.ROUTE_TYPE, str);
        m1.mo49935c(AnalyticsAttributeKey.NUM_OF_WAIT_ON_VEHICLE_LEGS, i);
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        C0016g.m11A(hashSet, "METRO_CONTEXT", "CONFIGURATION", "TAXI_PROVIDERS_MANAGER", "TWITTER_SERVICE_ALERTS_FEEDS");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        return s1;
    }
}
