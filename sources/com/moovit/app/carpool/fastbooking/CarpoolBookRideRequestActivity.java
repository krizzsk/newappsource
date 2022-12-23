package com.moovit.app.carpool.fastbooking;

import a00.C13382a;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import b00.C13556a;
import c70.C13751d;
import c70.C13752e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.fastbooking.C14808a;
import com.moovit.app.carpool.fastbooking.C14810b;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.app.carpool.registration.CarpoolRegistrationActivity;
import com.moovit.app.suggestedroutes.TripPlanLocationSearchFragment;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.carpool.CarpoolRegistrationSteps;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.moovit.view.dialogs.DropDownListPopup;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.Calendar;
import p543hq.C17474b;
import p568ir.C17638a;
import p568ir.C17639b;
import p568ir.C17640c;
import p568ir.C17641d;
import p568ir.C17644g;
import p568ir.C17647i;
import p568ir.C17648j;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;

public class CarpoolBookRideRequestActivity extends MoovitAppActivity implements C15578a.C15580b, DatePickerDialog.OnDateSetListener, C14810b.C14811a, C14808a.C14809a {

    /* renamed from: F0 */
    public static final int[] f37721F0 = {5, 10, 15, 30};

    /* renamed from: A0 */
    public CurrencyAmount f37722A0;

    /* renamed from: B0 */
    public C14804a f37723B0 = new C14804a();

    /* renamed from: C0 */
    public C13556a f37724C0;

    /* renamed from: D0 */
    public C13556a f37725D0;

    /* renamed from: E0 */
    public boolean f37726E0 = false;

    /* renamed from: U */
    public ListItemView f37727U;

    /* renamed from: X */
    public ListItemView f37728X;

    /* renamed from: Y */
    public TextView f37729Y;

    /* renamed from: Z */
    public View f37730Z;

    /* renamed from: l0 */
    public TextView f37731l0;

    /* renamed from: m0 */
    public ProgressBar f37732m0;

    /* renamed from: n0 */
    public ProgressBar f37733n0;

    /* renamed from: o0 */
    public View f37734o0;

    /* renamed from: p0 */
    public TextView f37735p0;

    /* renamed from: q0 */
    public Button f37736q0;

    /* renamed from: r0 */
    public TripPlannerLocations f37737r0;

    /* renamed from: s0 */
    public long f37738s0;

    /* renamed from: t0 */
    public long f37739t0;

    /* renamed from: u0 */
    public Calendar f37740u0;

    /* renamed from: v0 */
    public Calendar f37741v0;

    /* renamed from: w0 */
    public int f37742w0;

    /* renamed from: x0 */
    public CurrencyAmount f37743x0;

    /* renamed from: y0 */
    public CurrencyAmount f37744y0;

    /* renamed from: z0 */
    public CurrencyAmount f37745z0;

    /* renamed from: com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity$a */
    public class C14804a implements View.OnClickListener {
        public C14804a() {
        }

        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.pickup_date) {
                CarpoolBookRideRequestActivity.this.mo44547w2("set_date_clicked");
                CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
                Calendar calendar = carpoolBookRideRequestActivity.f37740u0;
                int i = C17644g.f45362h;
                int i2 = calendar.get(1);
                int i3 = calendar.get(2);
                int i4 = calendar.get(5);
                Bundle bundle = new Bundle();
                bundle.putInt("year", i2);
                bundle.putInt("month", i3);
                bundle.putInt("dayOfMonth", i4);
                bundle.putBoolean("allowHistory", false);
                C17644g gVar = new C17644g();
                gVar.setArguments(bundle);
                gVar.show(carpoolBookRideRequestActivity.getSupportFragmentManager(), "date_picker");
            } else if (id == R.id.pickup_time_range) {
                CarpoolBookRideRequestActivity.this.mo44547w2("set_pickup_time_clicked");
                CarpoolBookRideRequestActivity carpoolBookRideRequestActivity2 = CarpoolBookRideRequestActivity.this;
                long timeInMillis = carpoolBookRideRequestActivity2.f37740u0.getTimeInMillis();
                long timeInMillis2 = carpoolBookRideRequestActivity2.f37741v0.getTimeInMillis();
                int i5 = C14810b.f37770o;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("fromTime", timeInMillis);
                bundle2.putLong("toTime", timeInMillis2);
                C14810b bVar = new C14810b();
                bVar.setArguments(bundle2);
                bVar.show(carpoolBookRideRequestActivity2.getSupportFragmentManager(), "time_picker");
            } else if (id == R.id.book_ride_request) {
                CarpoolBookRideRequestActivity.this.mo44547w2("fast_book_ride_clicked");
                CarpoolBookRideRequestActivity.this.mo44855A2();
            } else if (id == R.id.walk_time) {
                CarpoolBookRideRequestActivity.this.mo44547w2("total_walking_time_clicked");
                CarpoolBookRideRequestActivity carpoolBookRideRequestActivity3 = CarpoolBookRideRequestActivity.this;
                carpoolBookRideRequestActivity3.getClass();
                DropDownListPopup dropDownListPopup = new DropDownListPopup(carpoolBookRideRequestActivity3);
                dropDownListPopup.setAdapter(ArrayAdapter.createFromResource(carpoolBookRideRequestActivity3, R.array.max_walk_time, R.layout.carpool_spinner_text_item_dropdown));
                dropDownListPopup.setModal(true);
                dropDownListPopup.setAnchorView(view);
                dropDownListPopup.setOnItemClickListener(new C17640c(carpoolBookRideRequestActivity3, dropDownListPopup));
                dropDownListPopup.show();
            } else if (id == R.id.walk_time_info) {
                CarpoolBookRideRequestActivity.this.mo44547w2("info_time_icon_clicked");
                CarpoolBookRideRequestActivity carpoolBookRideRequestActivity4 = CarpoolBookRideRequestActivity.this;
                new AlertDialogFragment.C15856a(carpoolBookRideRequestActivity4.getResources()).mo47683l(R.string.carpool_passenger_total_walking_time_label).mo47678g(R.string.carpool_passenger_total_walking_time_explanation).mo47681j(R.string.action_ok).mo47673b().show(carpoolBookRideRequestActivity4.getSupportFragmentManager(), "walk_tag");
            } else if (id == R.id.current_price_button) {
                CarpoolBookRideRequestActivity.this.mo44547w2("set_price_clicked");
                CarpoolBookRideRequestActivity carpoolBookRideRequestActivity5 = CarpoolBookRideRequestActivity.this;
                CurrencyAmount currencyAmount = carpoolBookRideRequestActivity5.f37743x0;
                CurrencyAmount currencyAmount2 = carpoolBookRideRequestActivity5.f37745z0;
                CurrencyAmount currencyAmount3 = carpoolBookRideRequestActivity5.f37744y0;
                C14808a aVar = new C14808a();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("currentPrice", currencyAmount);
                bundle3.putParcelable("recommendedPrice", currencyAmount2);
                bundle3.putParcelable("maxPrice", currencyAmount3);
                aVar.setArguments(bundle3);
                aVar.show(carpoolBookRideRequestActivity5.getSupportFragmentManager(), "max_price");
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity$b */
    public class C14805b extends C20438i<C17638a, C17639b> {
        public C14805b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17638a aVar = (C17638a) cVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            int[] iArr = CarpoolBookRideRequestActivity.f37721F0;
            carpoolBookRideRequestActivity.f37731l0.setVisibility(0);
            carpoolBookRideRequestActivity.f37733n0.setVisibility(4);
            CarpoolBookRideRequestActivity.this.f37724C0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17638a aVar = (C17638a) cVar;
            C17639b bVar = (C17639b) gVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            carpoolBookRideRequestActivity.f37736q0.setEnabled(true);
            carpoolBookRideRequestActivity.f37745z0 = bVar.f45353m;
            CurrencyAmount currencyAmount = carpoolBookRideRequestActivity.f37745z0;
            carpoolBookRideRequestActivity.f37743x0 = new CurrencyAmount(currencyAmount.f23844b, currencyAmount.f23845c);
            carpoolBookRideRequestActivity.f37744y0 = bVar.f45354n;
            carpoolBookRideRequestActivity.f37722A0 = bVar.f45355o;
            carpoolBookRideRequestActivity.mo44856B2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17638a aVar = (C17638a) cVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            carpoolBookRideRequestActivity.mo44530n2(C13751d.m34341b(carpoolBookRideRequestActivity, (String) null, exc));
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity2 = CarpoolBookRideRequestActivity.this;
            carpoolBookRideRequestActivity2.f37743x0 = null;
            carpoolBookRideRequestActivity2.f37722A0 = null;
            carpoolBookRideRequestActivity2.f37744y0 = null;
            carpoolBookRideRequestActivity2.f37734o0.setVisibility(8);
            C20964s0.m49107y(carpoolBookRideRequestActivity2.f37731l0, R.attr.textAppearanceBodyStrong, R.attr.colorOnSurface);
            carpoolBookRideRequestActivity2.f37731l0.setText(R.string.no_price);
            carpoolBookRideRequestActivity2.f37730Z.setClickable(false);
            carpoolBookRideRequestActivity2.f37736q0.setEnabled(false);
            return true;
        }
    }

    /* renamed from: com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity$c */
    public class C14806c extends C20438i<C17647i, C17648j> {
        public C14806c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17647i iVar = (C17647i) cVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            int[] iArr = CarpoolBookRideRequestActivity.f37721F0;
            carpoolBookRideRequestActivity.mo44863z2(false);
            CarpoolBookRideRequestActivity.this.f37725D0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            boolean z;
            C17647i iVar = (C17647i) cVar;
            C17648j jVar = (C17648j) gVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            int[] iArr = CarpoolBookRideRequestActivity.f37721F0;
            carpoolBookRideRequestActivity.getClass();
            CarpoolRegistrationSteps carpoolRegistrationSteps = jVar.f45369n;
            CurrencyAmount currencyAmount = jVar.f45370o;
            if (carpoolRegistrationSteps != null) {
                if (!carpoolRegistrationSteps.f40908d || carpoolRegistrationSteps.f40907c || carpoolRegistrationSteps.f40906b) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i = CarpoolAddCreditCardActivity.f37786x0;
                    carpoolBookRideRequestActivity.startActivityForResult(new Intent(carpoolBookRideRequestActivity, CarpoolAddCreditCardActivity.class), 1974);
                } else {
                    int i2 = CarpoolRegistrationActivity.f37816q0;
                    Intent intent = new Intent(carpoolBookRideRequestActivity, CarpoolRegistrationActivity.class);
                    intent.putExtra("requiredRegStepsExtra", carpoolRegistrationSteps);
                    carpoolBookRideRequestActivity.startActivityForResult(intent, 1974);
                }
                carpoolBookRideRequestActivity.mo44857C2("not_registered_user", "", "");
            } else if (currencyAmount != null) {
                carpoolBookRideRequestActivity.f37722A0 = currencyAmount;
                carpoolBookRideRequestActivity.mo44856B2();
                ScrollView scrollView = (ScrollView) carpoolBookRideRequestActivity.findViewById(R.id.page_content);
                scrollView.post(new C17641d(scrollView));
                carpoolBookRideRequestActivity.mo44535p2(carpoolBookRideRequestActivity.getString(R.string.carpool_passenger_coupon_credit_popup_title), carpoolBookRideRequestActivity.getString(R.string.carpool_passenger_coupon_credit_popup_subtitle));
                carpoolBookRideRequestActivity.mo44857C2("migrated", "", currencyAmount.toString());
            } else {
                carpoolBookRideRequestActivity.mo44857C2("registered_user", jVar.f45368m.mo19751c(), "");
                CarpoolRidesProvider.f37661j.mo44833c(16);
                carpoolBookRideRequestActivity.startActivity(CarpoolCenterActivity.m37255y2(carpoolBookRideRequestActivity));
                carpoolBookRideRequestActivity.finish();
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17647i iVar = (C17647i) cVar;
            CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = CarpoolBookRideRequestActivity.this;
            carpoolBookRideRequestActivity.mo44530n2(C13751d.m34341b(carpoolBookRideRequestActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: A2 */
    public final void mo44855A2() {
        TripPlannerLocations tripPlannerLocations = this.f37737r0;
        if (tripPlannerLocations == null || tripPlannerLocations.f23786b == null || tripPlannerLocations.f23787c == null) {
            ((TripPlanLocationSearchFragment) getSupportFragmentManager().mo3983z(R.id.location_search_fragment)).mo46531m2();
        } else if (this.f37743x0 != null && this.f37722A0 != null) {
            C13752e x1 = mo44548x1();
            TripPlannerLocations tripPlannerLocations2 = this.f37737r0;
            C17647i iVar = new C17647i(x1, tripPlannerLocations2.f23786b, tripPlannerLocations2.f23787c, this.f37740u0.getTimeInMillis(), this.f37741v0.getTimeInMillis(), f37721F0[this.f37742w0], this.f37743x0, this.f37722A0);
            mo44863z2(true);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f37725D0 = mo44527k2("setRideRequestRequest", iVar, requestOptions, new C14806c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* renamed from: B2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44856B2() {
        /*
            r8 = this;
            com.moovit.util.CurrencyAmount r0 = r8.f37743x0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.moovit.util.CurrencyAmount r0 = r8.f37722A0
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0029
        L_0x000d:
            java.math.BigDecimal r0 = r0.f23845c
            java.math.BigDecimal r0 = r0.movePointRight(r2)
            long r4 = r0.longValue()
            com.moovit.util.CurrencyAmount r0 = r8.f37744y0
            java.math.BigDecimal r0 = r0.f23845c
            java.math.BigDecimal r0 = r0.movePointRight(r2)
            long r6 = r0.longValue()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r4 = 2130970306(0x7f0406c2, float:1.7549318E38)
            if (r0 == 0) goto L_0x0050
            android.view.View r0 = r8.f37734o0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.f37731l0
            r1 = 2131886630(0x7f120226, float:1.9407844E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r8.f37731l0
            r1 = 2130968985(0x7f040199, float:1.754664E38)
            p977zz.C20964s0.m49107y(r0, r4, r1)
            android.view.View r0 = r8.f37730Z
            r0.setClickable(r3)
            goto L_0x00b4
        L_0x0050:
            android.view.View r0 = r8.f37734o0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.f37731l0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.moovit.util.CurrencyAmount r6 = r8.f37743x0
            java.lang.String r6 = r6.toString()
            r5[r3] = r6
            r6 = 2131886689(0x7f120261, float:1.9407964E38)
            java.lang.String r5 = r8.getString(r6, r5)
            r0.setText(r5)
            android.widget.TextView r0 = r8.f37731l0
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.moovit.util.CurrencyAmount r7 = r8.f37743x0
            java.lang.String r7 = r7.toString()
            r5[r3] = r7
            java.lang.String r5 = r8.getString(r6, r5)
            r2[r3] = r5
            com.moovit.util.CurrencyAmount r5 = r8.f37743x0
            java.lang.String r5 = r5.f23844b
            java.lang.String r5 = a00.C13382a.m33670f(r5)
            r2[r1] = r5
            a00.C13382a.m33674j(r0, r2)
            android.view.View r0 = r8.f37730Z
            r0.setClickable(r1)
            android.widget.TextView r0 = r8.f37731l0
            r1 = 2130969048(0x7f0401d8, float:1.7546767E38)
            p977zz.C20964s0.m49107y(r0, r4, r1)
            com.moovit.util.CurrencyAmount r0 = r8.f37722A0
            if (r0 == 0) goto L_0x00ae
            android.widget.TextView r0 = r8.f37735p0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.f37735p0
            com.moovit.util.CurrencyAmount r1 = r8.f37722A0
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            goto L_0x00b4
        L_0x00ae:
            android.widget.TextView r0 = r8.f37735p0
            r1 = 4
            r0.setVisibility(r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity.mo44856B2():void");
    }

    /* renamed from: C2 */
    public final void mo44857C2(String str, String str2, String str3) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BOOK_RESULT);
        aVar.mo49939g(AnalyticsAttributeKey.USER_TYPE, str);
        aVar.mo49939g(AnalyticsAttributeKey.REQUEST_ID, str2);
        aVar.mo49939g(AnalyticsAttributeKey.NEW_COUPON, str3);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: D1 */
    public final void mo44858D1(TripPlannerLocations tripPlannerLocations) {
        this.f37737r0 = tripPlannerLocations;
        mo44862y2();
    }

    /* renamed from: Q0 */
    public final void mo44859Q0(Calendar calendar, Calendar calendar2) {
        if (calendar2.getTimeInMillis() > calendar.getTimeInMillis() && calendar.getTimeInMillis() >= Calendar.getInstance().getTimeInMillis()) {
            this.f37738s0 = calendar.getTimeInMillis();
            this.f37739t0 = calendar2.getTimeInMillis();
            this.f37740u0.setTimeInMillis(this.f37738s0);
            this.f37741v0.setTimeInMillis(this.f37739t0);
            String l = C7925b.m18024l(this, this.f37738s0);
            String l2 = C7925b.m18024l(this, this.f37739t0);
            ListItemView listItemView = this.f37728X;
            listItemView.setSubtitle((CharSequence) l + " - " + l2);
            C13382a.m33674j(this.f37728X, l, getString(R.string.carpool_to_lowercase), l2);
            mo44862y2();
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_carpool_book_ride, menu);
        return true;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.book_ride_request_layout);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
        }
        ListItemView listItemView = (ListItemView) findViewById(R.id.pickup_date);
        this.f37727U = listItemView;
        listItemView.setOnClickListener(this.f37723B0);
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.pickup_time_range);
        this.f37728X = listItemView2;
        listItemView2.setOnClickListener(this.f37723B0);
        findViewById(R.id.walk_time_info).setOnClickListener(this.f37723B0);
        findViewById(R.id.walk_time).setOnClickListener(this.f37723B0);
        this.f37729Y = (TextView) findViewById(R.id.walk_time_text);
        View findViewById = findViewById(R.id.current_price_button);
        this.f37730Z = findViewById;
        findViewById.setOnClickListener(this.f37723B0);
        this.f37730Z.setClickable(false);
        this.f37731l0 = (TextView) findViewById(R.id.current_price);
        this.f37733n0 = (ProgressBar) findViewById(R.id.pricing_progressbar);
        this.f37734o0 = findViewById(R.id.credit_container);
        this.f37735p0 = (TextView) findViewById(R.id.next_ride_coupon);
        Button button = (Button) findViewById(R.id.book_ride_request);
        this.f37736q0 = button;
        button.setOnClickListener(this.f37723B0);
        this.f37732m0 = (ProgressBar) findViewById(R.id.book_ride_request_progressbar);
        if (bundle != null) {
            this.f37737r0 = (TripPlannerLocations) bundle.getParcelable("selectedRideRequestLocations");
            this.f37738s0 = bundle.getLong("selectedPickupTimeFrom");
            Calendar instance = Calendar.getInstance();
            this.f37740u0 = instance;
            instance.setTimeInMillis(this.f37738s0);
            this.f37739t0 = bundle.getLong("selectedPickupTimeTo");
            Calendar instance2 = Calendar.getInstance();
            this.f37741v0 = instance2;
            instance2.setTimeInMillis(this.f37739t0);
            this.f37742w0 = bundle.getInt("selectedMaxWalkTimeIndex");
            this.f37743x0 = (CurrencyAmount) bundle.getParcelable("currentPrice");
            this.f37744y0 = (CurrencyAmount) bundle.getParcelable("maxPrice");
            this.f37745z0 = (CurrencyAmount) bundle.getParcelable("origPrice");
            this.f37722A0 = (CurrencyAmount) bundle.getParcelable("creditToNextRide");
            this.f37726E0 = bundle.getBoolean("calculatePriceRequestWasCanceled");
        } else {
            Calendar instance3 = Calendar.getInstance();
            this.f37740u0 = instance3;
            long timeInMillis = instance3.getTimeInMillis();
            this.f37738s0 = timeInMillis;
            this.f37739t0 = timeInMillis + 3600000;
            Calendar instance4 = Calendar.getInstance();
            this.f37741v0 = instance4;
            instance4.setTimeInMillis(this.f37739t0);
            this.f37742w0 = 2;
            this.f37743x0 = null;
            this.f37744y0 = null;
            this.f37745z0 = null;
            this.f37722A0 = null;
        }
        this.f37727U.setSubtitle((CharSequence) C7925b.m18015c(this, this.f37738s0));
        this.f37727U.setContentDescription(DateUtils.formatDateTime(this, this.f37738s0, 26));
        String l = C7925b.m18024l(this, this.f37738s0);
        String l2 = C7925b.m18024l(this, this.f37739t0);
        ListItemView listItemView3 = this.f37728X;
        listItemView3.setSubtitle((CharSequence) l + " - " + l2);
        C13382a.m33674j(this.f37728X, l, getString(R.string.carpool_to_lowercase), l2);
        this.f37729Y.setText(getResources().getStringArray(R.array.max_walk_time)[this.f37742w0]);
        mo44856B2();
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("selectedRideRequestLocations", this.f37737r0);
        bundle.putLong("selectedPickupTimeFrom", this.f37738s0);
        bundle.putLong("selectedPickupTimeTo", this.f37739t0);
        bundle.putInt("selectedMaxWalkTimeIndex", this.f37742w0);
        bundle.putParcelable("currentPrice", this.f37743x0);
        bundle.putParcelable("maxPrice", this.f37744y0);
        bundle.putParcelable("origPrice", this.f37745z0);
        bundle.putParcelable("creditToNextRide", this.f37722A0);
        bundle.putBoolean("calculatePriceRequestWasCanceled", this.f37726E0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        if (this.f37726E0) {
            this.f37726E0 = false;
            mo44862y2();
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C13556a aVar = this.f37724C0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37724C0 = null;
            this.f37726E0 = true;
        }
        C13556a aVar2 = this.f37725D0;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f37725D0 = null;
            mo44863z2(false);
        }
    }

    /* renamed from: l0 */
    public final void mo44860l0(CurrencyAmount currencyAmount) {
        this.f37743x0 = currencyAmount;
        mo44856B2();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "save_price_clicked");
        aVar.mo49936d(AnalyticsAttributeKey.PRICE_SET, this.f37743x0.f23845c.movePointRight(2).longValue());
        aVar.mo49936d(AnalyticsAttributeKey.RECOMMENDED, this.f37745z0.f23845c.movePointRight(2).longValue());
        mo44545v2(aVar.mo49933a());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1974) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            mo44855A2();
        } else {
            mo44862y2();
        }
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f37740u0.set(1, i);
        this.f37740u0.set(2, i2);
        this.f37740u0.set(5, i3);
        this.f37738s0 = this.f37740u0.getTimeInMillis();
        this.f37741v0.set(1, i);
        this.f37741v0.set(2, i2);
        this.f37741v0.set(5, i3);
        this.f37739t0 = this.f37741v0.getTimeInMillis();
        this.f37727U.setSubtitle((CharSequence) C7925b.m18015c(this, this.f37740u0.getTimeInMillis()));
        this.f37727U.setContentDescription(DateUtils.formatDateTime(this, this.f37740u0.getTimeInMillis(), 26));
        mo44862y2();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_more) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(WebViewActivity.m18168y2(this, getString(R.string.carpool_quickbooking_url), (CharSequence) null));
        return true;
    }

    /* renamed from: y2 */
    public final void mo44862y2() {
        TripPlannerLocations tripPlannerLocations = this.f37737r0;
        if (tripPlannerLocations != null && tripPlannerLocations.f23786b != null && tripPlannerLocations.f23787c != null) {
            this.f37731l0.setVisibility(4);
            this.f37733n0.setVisibility(0);
            this.f37736q0.setEnabled(false);
            C13752e x1 = mo44548x1();
            TripPlannerLocations tripPlannerLocations2 = this.f37737r0;
            C17638a aVar = new C17638a(x1, tripPlannerLocations2.f23786b, tripPlannerLocations2.f23787c, this.f37738s0);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f37724C0 = mo44527k2("calculatePriceRequest", aVar, requestOptions, new C14805b());
        }
    }

    /* renamed from: z2 */
    public final void mo44863z2(boolean z) {
        int i;
        ProgressBar progressBar = this.f37732m0;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        progressBar.setVisibility(i);
        Button button = this.f37736q0;
        if (z) {
            i2 = 8;
        }
        button.setVisibility(i2);
    }
}
