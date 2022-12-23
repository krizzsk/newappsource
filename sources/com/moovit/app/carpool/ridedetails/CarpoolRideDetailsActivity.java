package com.moovit.app.carpool.ridedetails;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import c00.C13717b;
import c70.C13756i;
import ce0.C21100e;
import ci0.C21211f;
import com.appboy.models.InAppMessageBase;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolRideDetourView;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.app.carpool.registration.CarpoolRegistrationActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment;
import com.moovit.app.carpool.survey.SurveyOption;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.CarpoolRegistrationSteps;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.utils.UiUtils;
import com.moovit.gcm.payload.CarpoolRidePayload;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.pickers.StringsPickerActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import e20.C16783l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p011aa.C0141e;
import p401bz.C13713g;
import p472er.C16858b;
import p472er.C16865g;
import p543hq.C17474b;
import p567iq.C17635b;
import p614kr.C18124f;
import p638lr.C18254a;
import p638lr.C18255b;
import p638lr.C18256c;
import p638lr.C18263j;
import p638lr.C18264k;
import p638lr.C18265l;
import p638lr.C18266m;
import p638lr.C18270q;
import p638lr.C18271r;
import p641lu.C18277b;
import p754qr.C19162b;
import p778rr.C19321e;
import p824tp.C19725d;
import p850ur.C19986a;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20975x0;

public class CarpoolRideDetailsActivity extends MoovitAppActivity implements CarpoolRideDetailsFragment.C14834f, C19321e.C19322a, CarpoolRidesProvider.C14793d {

    /* renamed from: A0 */
    public static final /* synthetic */ int f37829A0 = 0;

    /* renamed from: U */
    public final C14824a f37830U = new C14824a();

    /* renamed from: X */
    public CarpoolRidesProvider f37831X;

    /* renamed from: Y */
    public CarpoolRideDetailsFragment f37832Y;

    /* renamed from: Z */
    public TextView f37833Z;

    /* renamed from: l0 */
    public ServerId f37834l0;

    /* renamed from: m0 */
    public boolean f37835m0;

    /* renamed from: n0 */
    public CarpoolRide f37836n0;

    /* renamed from: o0 */
    public FutureCarpoolRide f37837o0;

    /* renamed from: p0 */
    public ActiveCarpoolRide f37838p0;

    /* renamed from: q0 */
    public HistoricalCarpoolRide f37839q0;

    /* renamed from: r0 */
    public boolean f37840r0 = false;

    /* renamed from: s0 */
    public boolean f37841s0 = false;

    /* renamed from: t0 */
    public boolean f37842t0 = false;

    /* renamed from: u0 */
    public SurveyOption f37843u0;

    /* renamed from: v0 */
    public PassengerRideStops f37844v0;

    /* renamed from: w0 */
    public TripPlannerLocations f37845w0;

    /* renamed from: x0 */
    public Itinerary f37846x0 = null;

    /* renamed from: y0 */
    public String f37847y0 = null;

    /* renamed from: z0 */
    public C13556a f37848z0 = null;

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$a */
    public class C14824a extends C0141e {
        public C14824a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18263j jVar = (C18263j) cVar;
            C18264k kVar = (C18264k) gVar;
            CarpoolRide carpoolRide = CarpoolRideDetailsActivity.this.f37836n0;
            if (carpoolRide != null && carpoolRide.f40910b.equals(jVar.f46589y)) {
                CarpoolRideDetailsActivity.this.mo44895F2(kVar.f46590m);
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$b */
    public class C14825b extends C21211f {
        public C14825b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18254a aVar = (C18254a) cVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            CurrencyAmount currencyAmount = ((C18255b) gVar).f46572m;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.mo44899K2(0);
            if (currencyAmount == null) {
                carpoolRideDetailsActivity.mo44900L2(carpoolRideDetailsActivity.f37837o0, false, (CurrencyAmount) null);
                return;
            }
            C16858b.C16860b bVar = new C16858b.C16860b(carpoolRideDetailsActivity.getResources());
            bVar.mo39494d("confirm_cancellation");
            String string = carpoolRideDetailsActivity.getString(R.string.carpool_cancellation_fee_confirmation_message, new Object[]{currencyAmount.toString()});
            if (string == null) {
                bVar.mo39491a(InAppMessageBase.MESSAGE);
            }
            bVar.f31375b.putCharSequence(InAppMessageBase.MESSAGE, string);
            bVar.mo39493c(R.string.carpool_cancellation_confirmation_confirm);
            bVar.mo39492b(R.string.carpool_cancellation_confirmation_abort);
            bVar.f31375b.putParcelable("profile_uri", carpoolRideDetailsActivity.f37837o0.f40937b.f40911c.f40881h);
            bVar.f31375b.putParcelable("fee", currencyAmount);
            C16858b bVar2 = new C16858b();
            bVar2.setArguments(bVar.f31375b);
            bVar2.show(carpoolRideDetailsActivity.getSupportFragmentManager(), "confirm_cancellation");
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$c */
    public class C14826c extends C21211f {

        /* renamed from: b */
        public final /* synthetic */ boolean f37851b;

        public C14826c(boolean z) {
            this.f37851b = z;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18265l lVar = (C18265l) cVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.mo44899K2(0);
            CarpoolRideDetailsActivity.this.mo44897I2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18265l lVar = (C18265l) cVar;
            C18266m mVar = (C18266m) gVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            boolean z = true;
            if (carpoolRideDetailsActivity.f37843u0 != null) {
                Context applicationContext = carpoolRideDetailsActivity.getApplicationContext();
                SurveyOption surveyOption = CarpoolRideDetailsActivity.this.f37843u0;
                List<SurveyOption> list = C19986a.f50821a;
                C17635b.m43779f(applicationContext).f50172b.mo42913b(new C13713g(applicationContext, 3, Collections.singletonMap("cancel_pickup_driver", surveyOption.f37915c)), true);
                CarpoolRideDetailsActivity.this.f37843u0 = null;
            }
            CarpoolRideDetailsActivity.this.mo44892C2();
            CarpoolRideDetailsActivity carpoolRideDetailsActivity2 = CarpoolRideDetailsActivity.this;
            if (carpoolRideDetailsActivity2.f37299H && !this.f37851b) {
                Resources resources = carpoolRideDetailsActivity2.getResources();
                C21100e.m49373x(resources, "resources");
                Bundle bundle = new Bundle();
                bundle.putString("tag", "no_show_confirmation");
                CharSequence text = resources.getText(R.string.carpool_driver_noshow_message);
                if (text == null) {
                    bundle.remove(InAppMessageBase.MESSAGE);
                }
                bundle.putCharSequence(InAppMessageBase.MESSAGE, text);
                CharSequence text2 = resources.getText(R.string.carpool_alert_dialog_neutral_button);
                if (text2 == null) {
                    z = false;
                }
                if (z) {
                    bundle.putCharSequence("neutralButton", text2);
                } else {
                    bundle.remove("neutralButton");
                }
                bundle.putBoolean("showNeutralButton", z);
                C16858b bVar = new C16858b();
                bVar.setArguments(bundle);
                bVar.show(CarpoolRideDetailsActivity.this.getSupportFragmentManager(), "no_show_confirmation");
            }
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$d */
    public class C14827d extends C21211f {

        /* renamed from: b */
        public final /* synthetic */ boolean f37853b;

        public C14827d(boolean z) {
            this.f37853b = z;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18270q qVar = (C18270q) cVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.mo44899K2(0);
            CarpoolRideDetailsActivity.this.mo44897I2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18270q qVar = (C18270q) cVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            boolean z = this.f37853b;
            CarpoolRegistrationSteps carpoolRegistrationSteps = ((C18271r) gVar).f46601m;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.getClass();
            boolean z2 = true;
            if (carpoolRegistrationSteps != null) {
                if (!carpoolRegistrationSteps.f40908d || carpoolRegistrationSteps.f40907c || carpoolRegistrationSteps.f40906b) {
                    z2 = false;
                }
                if (z2) {
                    int i2 = CarpoolAddCreditCardActivity.f37786x0;
                    carpoolRideDetailsActivity.startActivityForResult(new Intent(carpoolRideDetailsActivity, CarpoolAddCreditCardActivity.class), 1001);
                    return;
                }
                FutureCarpoolRide futureCarpoolRide = carpoolRideDetailsActivity.f37837o0;
                int i3 = CarpoolRegistrationActivity.f37816q0;
                Intent intent = new Intent(carpoolRideDetailsActivity, CarpoolRegistrationActivity.class);
                intent.putExtra("requiredRegStepsExtra", carpoolRegistrationSteps);
                if (futureCarpoolRide != null) {
                    intent.putExtra("futureRideExtra", futureCarpoolRide);
                }
                carpoolRideDetailsActivity.startActivityForResult(intent, 1001);
                return;
            }
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_BOOK_RIDE_OCCURRED);
                aVar.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, carpoolRideDetailsActivity.f37837o0.f40937b.f40910b);
                carpoolRideDetailsActivity.mo44545v2(aVar.mo49933a());
                Resources resources = carpoolRideDetailsActivity.getResources();
                C21100e.m49373x(resources, "resources");
                Bundle b = C25541a.m63872b("tag", "request_confirmation");
                String string = carpoolRideDetailsActivity.getString(R.string.carpool_booking_request_confirmation, new Object[]{carpoolRideDetailsActivity.f37837o0.f40937b.f40911c.f40876c});
                if (string == null) {
                    b.remove(InAppMessageBase.MESSAGE);
                }
                b.putCharSequence(InAppMessageBase.MESSAGE, string);
                CharSequence text = resources.getText(R.string.carpool_alert_dialog_neutral_button);
                if (text == null) {
                    z2 = false;
                }
                if (z2) {
                    b.putCharSequence("neutralButton", text);
                } else {
                    b.remove("neutralButton");
                }
                b.putBoolean("showNeutralButton", z2);
                C16858b bVar = new C16858b();
                bVar.setArguments(b);
                bVar.show(carpoolRideDetailsActivity.getSupportFragmentManager(), "request_confirmation");
            } else {
                Resources resources2 = carpoolRideDetailsActivity.getResources();
                C21100e.m49373x(resources2, "resources");
                Bundle bundle = new Bundle();
                bundle.putString("tag", "booking_cancelled_successfully");
                CharSequence text2 = resources2.getText(R.string.carpool_booking_cancelled_successfully);
                if (text2 == null) {
                    bundle.remove(InAppMessageBase.MESSAGE);
                }
                bundle.putCharSequence(InAppMessageBase.MESSAGE, text2);
                CharSequence text3 = resources2.getText(R.string.carpool_alert_dialog_neutral_button);
                if (text3 == null) {
                    z2 = false;
                }
                if (z2) {
                    bundle.putCharSequence("neutralButton", text3);
                } else {
                    bundle.remove("neutralButton");
                }
                bundle.putBoolean("showNeutralButton", z2);
                C16858b bVar2 = new C16858b();
                bVar2.setArguments(bundle);
                bVar2.show(carpoolRideDetailsActivity.getSupportFragmentManager(), "booking_cancelled_successfully");
            }
            carpoolRideDetailsActivity.mo44892C2();
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$e */
    public class C14828e extends C21211f {
        public C14828e() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18265l lVar = (C18265l) cVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.mo44899K2(0);
            CarpoolRideDetailsActivity.this.mo44897I2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18265l lVar = (C18265l) cVar;
            C18266m mVar = (C18266m) gVar;
            CarpoolRideDetailsActivity carpoolRideDetailsActivity = CarpoolRideDetailsActivity.this;
            int i = CarpoolRideDetailsActivity.f37829A0;
            carpoolRideDetailsActivity.mo44892C2();
        }
    }

    /* renamed from: A2 */
    public static Intent m37357A2(Context context, ServerId serverId, PassengerRideStops passengerRideStops, TripPlannerLocations tripPlannerLocations, Itinerary itinerary, boolean z) {
        Intent intent = new Intent(context, CarpoolRideDetailsActivity.class);
        intent.putExtra("ride_id", serverId);
        intent.putExtra("passenger_stops", passengerRideStops);
        intent.putExtra("trip_planner_locations", tripPlannerLocations);
        intent.putExtra("itinerary", itinerary);
        intent.putExtra("is_suggestion", z);
        return intent;
    }

    /* renamed from: G2 */
    public static Short m37358G2(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Short.valueOf(Short.parseShort(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r6 == 5) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC, Splitter:B:32:0x007a] */
    /* renamed from: B2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.moovit.network.model.ServerId mo44891B2(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ride_id"
            java.lang.String r0 = r6.getQueryParameter(r0)
            r1 = 0
            java.lang.String r2 = "SMS"
            if (r0 == 0) goto L_0x0018
            r5.f37847y0 = r2
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId     // Catch:{ NumberFormatException -> 0x0017 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            r6.<init>(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            r1 = r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.List r0 = r6.getPathSegments()
            if (r0 == 0) goto L_0x008c
            int r3 = r0.size()
            r4 = 2
            if (r3 >= r4) goto L_0x0026
            goto L_0x008c
        L_0x0026:
            r3 = 1
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            java.lang.String r4 = "t"
            java.lang.String r6 = r6.getQueryParameter(r4)
            if (r6 == 0) goto L_0x0042
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r6 = -1
        L_0x003e:
            r4 = 5
            if (r6 != r4) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            java.lang.String r2 = "SHARE"
        L_0x0044:
            r5.f37847y0 = r2
            byte[] r6 = r0.getBytes()     // Catch:{ Exception -> 0x0056 }
            byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch:{ Exception -> 0x0056 }
            if (r6 == 0) goto L_0x0077
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0056 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0078
        L_0x0056:
            r6 = move-exception
            de.f r2 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed decode param: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " ex: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.mo49363b(r6)
        L_0x0077:
            r2 = r1
        L_0x0078:
            if (r2 == 0) goto L_0x0087
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId     // Catch:{ NumberFormatException -> 0x0084 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            r6.<init>(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            r1 = r6
        L_0x0084:
            if (r1 == 0) goto L_0x0087
            return r1
        L_0x0087:
            com.moovit.network.model.ServerId r6 = com.moovit.network.model.ServerId.m11392b(r0)
            return r6
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity.mo44891B2(android.net.Uri):com.moovit.network.model.ServerId");
    }

    /* renamed from: C2 */
    public final void mo44892C2() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f37837o0 != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f37838p0 != null) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (this.f37839q0 != null) {
            i3 = 8;
        }
        this.f37831X.mo44833c(i4 | i3);
    }

    /* renamed from: D2 */
    public final void mo44893D2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_DRIVER_SHOW_REPORT);
        aVar.mo49941i(AnalyticsAttributeKey.TYPE, z);
        mo44545v2(aVar.mo49933a());
        if (!z) {
            ArrayList<T> k = C13717b.m34264k(C19986a.f50821a);
            Collections.shuffle(k);
            Intent intent = new Intent(this, StringsPickerActivity.class);
            intent.putExtra("actionBarTitle", R.string.carpool_ride_annulled_survey_activity_title);
            intent.putExtra("headerTitle", R.string.carpool_ride_annulled_survey_title);
            intent.putParcelableArrayListExtra("options", k);
            startActivityForResult(intent, 1002);
            return;
        }
        mo44896H2(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: E2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44894E2(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0085
            android.net.Uri r0 = r11.getData()
            if (r0 == 0) goto L_0x0085
            de.f r0 = p435de.C16596f.m42113a()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r0.mo49363b(r3)
            android.net.Uri r0 = r11.getData()
            com.moovit.network.model.ServerId r0 = r10.mo44891B2(r0)
            r10.f37834l0 = r0
            r10.f37835m0 = r1
            android.net.Uri r0 = r11.getData()
            java.lang.String r1 = "os"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.Short r1 = m37358G2(r1)
            java.lang.String r3 = "or"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.Short r3 = m37358G2(r3)
            java.lang.String r4 = "ds"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.Short r4 = m37358G2(r4)
            java.lang.String r5 = "dr"
            java.lang.String r0 = r0.getQueryParameter(r5)
            java.lang.Short r0 = m37358G2(r0)
            if (r1 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
            if (r4 == 0) goto L_0x007c
            if (r0 != 0) goto L_0x0064
            goto L_0x007c
        L_0x0064:
            com.moovit.carpool.PassengerRideStops r5 = new com.moovit.carpool.PassengerRideStops
            com.moovit.carpool.PassengerRideStop r6 = new com.moovit.carpool.PassengerRideStop
            short r1 = r1.shortValue()
            r6.<init>(r1, r3)
            com.moovit.carpool.PassengerRideStop r1 = new com.moovit.carpool.PassengerRideStop
            short r3 = r4.shortValue()
            r1.<init>(r3, r0)
            r5.<init>(r6, r1, r2, r2)
            goto L_0x0080
        L_0x007c:
            com.moovit.carpool.PassengerRideStops r5 = com.moovit.carpool.PassengerRideStops.m40150b()
        L_0x0080:
            r10.f37844v0 = r5
            r10.f37845w0 = r2
            goto L_0x00ab
        L_0x0085:
            java.lang.String r0 = "ride_id"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            com.moovit.network.model.ServerId r0 = (com.moovit.network.model.ServerId) r0
            r10.f37834l0 = r0
            java.lang.String r0 = "is_suggestion"
            boolean r0 = r11.getBooleanExtra(r0, r1)
            r10.f37835m0 = r0
            java.lang.String r0 = "passenger_stops"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            com.moovit.carpool.PassengerRideStops r0 = (com.moovit.carpool.PassengerRideStops) r0
            r10.f37844v0 = r0
            java.lang.String r0 = "trip_planner_locations"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            com.moovit.tripplanner.TripPlannerLocations r0 = (com.moovit.tripplanner.TripPlannerLocations) r0
            r10.f37845w0 = r0
        L_0x00ab:
            com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment r0 = r10.f37832Y
            com.moovit.tripplanner.TripPlannerLocations r1 = r10.f37845w0
            r0.f37864H = r1
            com.moovit.network.model.ServerId r0 = r10.f37834l0
            if (r0 == 0) goto L_0x0135
            com.moovit.carpool.PassengerRideStops r0 = r10.f37844v0
            if (r0 == 0) goto L_0x0135
            r10.mo44897I2()
            java.lang.String r0 = "itinerary"
            android.os.Parcelable r11 = r11.getParcelableExtra(r0)
            com.moovit.itinerary.model.Itinerary r11 = (com.moovit.itinerary.model.Itinerary) r11
            if (r11 != 0) goto L_0x0131
            com.moovit.itinerary.model.Itinerary r11 = r10.f37846x0
            if (r11 == 0) goto L_0x00cc
            goto L_0x0134
        L_0x00cc:
            com.moovit.carpool.FutureCarpoolRide r11 = r10.f37837o0
            if (r11 == 0) goto L_0x00d8
            com.moovit.carpool.CarpoolRide r0 = r11.f40937b
            com.moovit.network.model.ServerId r0 = r0.f40910b
            com.moovit.carpool.PassengerRideStops r11 = r11.f40940e
        L_0x00d6:
            r2 = r11
            goto L_0x00e3
        L_0x00d8:
            com.moovit.carpool.ActiveCarpoolRide r11 = r10.f37838p0
            if (r11 == 0) goto L_0x00e6
            com.moovit.carpool.CarpoolRide r0 = r11.f40854b
            com.moovit.network.model.ServerId r0 = r0.f40910b
            com.moovit.carpool.PassengerRideStops r11 = r11.f40857e
            goto L_0x00d6
        L_0x00e3:
            r7 = r0
            r8 = r2
            goto L_0x00e8
        L_0x00e6:
            r7 = r2
            r8 = r7
        L_0x00e8:
            if (r8 == 0) goto L_0x0134
            com.moovit.transit.LocationDescriptor r11 = r8.f40954e
            if (r11 != 0) goto L_0x00ef
            goto L_0x0134
        L_0x00ef:
            java.lang.String r11 = "METRO_CONTEXT"
            java.lang.Object r11 = r10.mo44537r1(r11)
            r5 = r11
            tp.f r5 = (p824tp.C19728f) r5
            java.lang.String r11 = "CONFIGURATION"
            java.lang.Object r11 = r10.mo44537r1(r11)
            r6 = r11
            q00.a r6 = (q00.C19047a) r6
            java.lang.String r11 = "TRIP_PLANNER_CONFIGURATION"
            java.lang.Object r11 = r10.mo44537r1(r11)
            r9 = r11
            v90.a r9 = (v90.C13187a) r9
            lr.j r11 = new lr.j
            c70.e r4 = r10.mo44548x1()
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<lr.j> r1 = p638lr.C18263j.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            RO r1 = r11.f33922v
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity$a r1 = r10.f37830U
            r10.mo44528l2(r0, r11, r1)
            goto L_0x0134
        L_0x0131:
            r10.mo44895F2(r11)
        L_0x0134:
            return
        L_0x0135:
            com.moovit.commons.utils.ApplicationBugException r11 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r0 = "Did you use CarpoolRideDetailsActivity.createStartingIntent(...)?"
            r11.<init>((java.lang.String) r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity.mo44894E2(android.content.Intent):void");
    }

    /* renamed from: F0 */
    public final void mo44841F0(int i) {
    }

    /* renamed from: F2 */
    public final void mo44895F2(Itinerary itinerary) {
        CarpoolLeg carpoolLeg;
        if (itinerary != null) {
            C18277b bVar = C16783l.f43688a;
            carpoolLeg = (CarpoolLeg) C16783l.m42476h(itinerary.mo48295u0(), -1, 7);
        } else {
            carpoolLeg = null;
        }
        if (carpoolLeg != null && C20975x0.m49118e(this.f37834l0, carpoolLeg.f41980p.f40910b)) {
            this.f37844v0 = carpoolLeg.f41981q;
            this.f37846x0 = itinerary;
            CarpoolRideDetailsFragment carpoolRideDetailsFragment = this.f37832Y;
            if (!C20975x0.m49118e(carpoolRideDetailsFragment.f37863G, itinerary)) {
                carpoolRideDetailsFragment.f37863G = itinerary;
                if (carpoolRideDetailsFragment.getView() != null) {
                    carpoolRideDetailsFragment.mo44914s2();
                }
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_ITINERARY_RECEIVED);
            aVar.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, carpoolLeg.f41980p.f40910b);
            aVar.mo49940h(AnalyticsAttributeKey.FROM_STOP, carpoolLeg.f41981q.f40951b.f40948b);
            aVar.mo49940h(AnalyticsAttributeKey.TO_STOP, carpoolLeg.f41981q.f40952c.f40948b);
            aVar.mo49941i(AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION, C16783l.m42469a(itinerary, 2));
            mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: H2 */
    public final void mo44896H2(boolean z) {
        mo44899K2(R.string.carpool_status_sending_driver_noshow);
        mo44528l2("driver_show", new C18265l(mo44548x1(), this.f37834l0, z, (byte) 0, mo44542u1()), new C14826c(z));
    }

    /* renamed from: I2 */
    public final void mo44897I2() {
        mo44899K2(R.string.carpool_status_loading_ride_details);
        CarpoolRidesProvider carpoolRidesProvider = this.f37831X;
        ServerId serverId = this.f37834l0;
        PassengerRideStops passengerRideStops = this.f37844v0;
        C14835a aVar = new C14835a(this);
        FutureCarpoolRide a = carpoolRidesProvider.f37663b.mo44836a(serverId);
        ActiveCarpoolRide a2 = carpoolRidesProvider.f37664c.mo44836a(serverId);
        HistoricalCarpoolRide a3 = carpoolRidesProvider.f37666e.mo44836a(serverId);
        if (a == null && a2 == null && a3 == null) {
            CarpoolRidesProvider.C14794e eVar = new CarpoolRidesProvider.C14794e(this, aVar);
            C19725d.m47191a(eVar.f37674b).f50162b.add(eVar);
            C13756i a4 = C13756i.m34349a(eVar.f37674b);
            C18256c cVar = new C18256c(a4.mo40679b(), serverId, passengerRideStops);
            RequestOptions c = a4.mo40680c();
            c.f42909f = true;
            StringBuilder k = C13555b.m33972k("get_ride_");
            k.append(serverId.mo19751c());
            eVar.f37676d = a4.mo40684g(k.toString(), cVar, c, eVar);
            return;
        }
        aVar.mo44839a(a, a2, a3);
    }

    /* renamed from: J2 */
    public final void mo44898J2(CarpoolRide carpoolRide, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19321e eVar = (C19321e) supportFragmentManager.mo3923A("rate_ride");
        if (eVar != null) {
            eVar.dismissAllowingStateLoss();
        }
        C19321e eVar2 = new C19321e();
        Bundle bundle = new Bundle();
        bundle.putBoolean("canReportNoShow", z);
        bundle.putParcelable("ride", carpoolRide);
        eVar2.setArguments(bundle);
        eVar2.show(supportFragmentManager, "rate_ride");
    }

    /* renamed from: K2 */
    public final void mo44899K2(int i) {
        UiUtils.m40233A(this.f37833Z, i);
    }

    /* renamed from: L2 */
    public final void mo44900L2(FutureCarpoolRide futureCarpoolRide, boolean z, CurrencyAmount currencyAmount) {
        int i;
        String str;
        CarpoolRideDetourView carpoolRideDetourView;
        if (z) {
            i = R.string.carpool_status_booking_ride;
        } else {
            i = R.string.carpool_status_cancelling_ride;
        }
        mo44899K2(i);
        PassengerRideStops passengerRideStops = futureCarpoolRide.f40940e;
        CarpoolRideDetour carpoolRideDetour = null;
        if (z && this.f37832Y.mo44909o2() && (carpoolRideDetourView = this.f37832Y.f37860D) != null) {
            carpoolRideDetour = carpoolRideDetourView.getRideDetour();
        }
        C18270q qVar = new C18270q(mo44548x1(), futureCarpoolRide, passengerRideStops, z, currencyAmount, carpoolRideDetour);
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = "book_ride_";
        } else {
            str = "cancel_ride_";
        }
        sb.append(str);
        sb.append(futureCarpoolRide.f40937b.f40910b.mo19751c());
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, qVar, requestOptions, new C14827d(z));
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_carpool_ride_details, menu);
        menu.findItem(R.id.action_carpool_service_info).setIntent(WebViewActivity.m18168y2(this, getString(R.string.carpool_explanation_link), (CharSequence) null));
        return true;
    }

    /* renamed from: S1 */
    public final void mo19483S1(int i, String str) {
        if ("confirm_cancellation".equals(str) && i == -1) {
            mo44900L2(this.f37837o0, false, (CurrencyAmount) mo44539t1("confirm_cancellation").getArguments().getParcelable("fee"));
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        this.f37831X.f37668g.remove(this);
    }

    /* renamed from: a */
    public final void mo44901a(float f) {
        mo44899K2(R.string.carpool_status_sending_rating);
        C18265l lVar = new C18265l(mo44548x1(), this.f37834l0, true, (byte) Math.round(f), mo44542u1());
        StringBuilder k = C13555b.m33972k("ride_report_");
        k.append(this.f37834l0.mo19751c());
        mo44528l2(k.toString(), lVar, new C14828e());
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        mo44894E2(intent);
        setIntent(intent);
    }

    /* renamed from: d0 */
    public final void mo44842d0(GcmPayload gcmPayload) {
        if (gcmPayload == null || !"carpool_ride".equals(gcmPayload.mo47977c())) {
            mo44897I2();
            return;
        }
        if (C20975x0.m49118e(this.f37834l0, ((CarpoolRidePayload) gcmPayload).f41535c)) {
            mo44897I2();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        CarpoolRidesProvider carpoolRidesProvider = CarpoolRidesProvider.f37661j;
        this.f37831X = carpoolRidesProvider;
        carpoolRidesProvider.f37668g.put(this, 15);
        setContentView((int) R.layout.carpool_ride_details_activity);
        CarpoolRideDetailsFragment carpoolRideDetailsFragment = (CarpoolRideDetailsFragment) getSupportFragmentManager().mo3983z(R.id.ride_details_fragment);
        this.f37832Y = carpoolRideDetailsFragment;
        carpoolRideDetailsFragment.f37861E = this;
        carpoolRideDetailsFragment.f37874v.setListener(this);
        this.f37833Z = (TextView) findViewById(R.id.status);
        mo44894E2(getIntent());
        Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
        if (!getSharedPreferences("com.moovit.carpool.CarpoolUtils", 0).getBoolean("carpoolRideMapItemDialogShown", false)) {
            C18124f fVar = new C18124f(mo44548x1());
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f37848z0 = mo44527k2("get_passenger_credit", fVar, requestOptions, new C19162b(this));
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        if (this.f37841s0) {
            this.f37841s0 = false;
            mo44897I2();
        }
    }

    /* renamed from: g1 */
    public final void mo44843g1(int i) {
    }

    public final Intent getSupportParentActivityIntent() {
        Intent intent = getIntent();
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            return super.getSupportParentActivityIntent();
        }
        return C14226d.m35335A0(this);
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C13556a aVar = this.f37848z0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37848z0 = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        ServerId serverId;
        PassengerRideStops passengerRideStops;
        C17474b.C17475a m1 = super.mo19762m1();
        Intent intent = getIntent();
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            serverId = (ServerId) intent.getParcelableExtra("ride_id");
        } else {
            serverId = mo44891B2(intent.getData());
        }
        if (serverId != null) {
            m1.mo49939g(AnalyticsAttributeKey.CARPOOL_RIDE_ID, serverId.mo19751c());
        }
        String str = this.f37847y0;
        if (str != null) {
            m1.mo49939g(AnalyticsAttributeKey.ORIGIN, str);
        }
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            passengerRideStops = (PassengerRideStops) intent.getParcelableExtra("passenger_stops");
        } else {
            passengerRideStops = PassengerRideStops.m40150b();
        }
        if (passengerRideStops != null) {
            m1.mo49940h(AnalyticsAttributeKey.FROM_STOP, passengerRideStops.f40951b.f40948b);
            m1.mo49940h(AnalyticsAttributeKey.TO_STOP, passengerRideStops.f40952c.f40948b);
        }
        return m1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i == 1001) {
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 1001) {
                this.f37840r0 = true;
                this.f37841s0 = !this.f37299H;
            }
            if (this.f37299H) {
                mo44897I2();
            }
        } else if (i != 1002) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C21100e.m49373x(intent, "data");
            this.f37843u0 = (SurveyOption) intent.getParcelableExtra("itemPicked");
            this.f37842t0 = true;
            if (this.f37299H) {
                mo44897I2();
            }
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CARPOOL_SUPPORT_VALIDATOR");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("ride_cancellation_tag".equals(str)) {
            if (i == -1) {
                mo44904z2();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: v0 */
    public final void mo44902v0() {
        mo44896H2(false);
    }

    /* renamed from: y2 */
    public final void mo44903y2() {
        boolean z;
        boolean z2 = false;
        if (this.f37836n0.f40911c.f40891r == null) {
            z = true;
        } else {
            z = false;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_book_ride_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.DETOUR_REQUESTED, this.f37832Y.mo44909o2());
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.CONTAINS_PUBLIC_TRANSPORTATION;
        Itinerary itinerary = this.f37846x0;
        if (itinerary != null && C16783l.m42469a(itinerary, 2)) {
            z2 = true;
        }
        aVar.mo49941i(analyticsAttributeKey, z2);
        aVar.mo49941i(AnalyticsAttributeKey.IS_NEW_DRIVER, z);
        mo44545v2(aVar.mo49933a());
        FutureCarpoolRide futureCarpoolRide = this.f37837o0;
        mo44900L2(futureCarpoolRide, true, futureCarpoolRide.f40937b.f40918j);
    }

    /* renamed from: z2 */
    public final void mo44904z2() {
        mo44899K2(R.string.carpool_status_asking_cancellation_fee);
        C18254a aVar = new C18254a(this.f37834l0, mo44548x1());
        StringBuilder k = C13555b.m33972k("get_cancellation_fee_");
        k.append(this.f37834l0.mo19751c());
        String sb = k.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb, aVar, requestOptions, new C14825b());
    }
}
