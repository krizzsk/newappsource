package com.moovit.app.ridesharing.booking;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationType;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k10.C17993a;
import p001a0.C0016g;
import p090g1.C4732a;
import p435de.C16596f;
import p689nv.C18639a;
import p689nv.C18640b;
import p713ov.C18831a;
import p713ov.C18836e;
import p713ov.C18837f;
import p713ov.C18841h;
import p713ov.C18845j;
import p713ov.C18846k;
import p737pv.C19010a;
import p737pv.C19011b;
import p737pv.C19014e;
import p906wz.C20431c;
import p906wz.C20436g;

public class EventBookingActivity extends MoovitAppActivity implements C18831a.C18832a {

    /* renamed from: Z */
    public static final /* synthetic */ int f39338Z = 0;

    /* renamed from: U */
    public C13556a f39339U = null;

    /* renamed from: X */
    public EventBookingParams f39340X;

    /* renamed from: Y */
    public final C15250a f39341Y = new C15250a(this);

    /* renamed from: com.moovit.app.ridesharing.booking.EventBookingActivity$a */
    public class C15250a extends C18640b<C19010a, C19011b> {
        public C15250a(EventBookingActivity eventBookingActivity) {
            super(eventBookingActivity);
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19010a aVar = (C19010a) cVar;
            EventBookingActivity.this.mo44506I1();
        }

        /* renamed from: b */
        public final Bundle mo45759b(C20431c cVar) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("bookingCart", ((C19010a) cVar).f48365w);
            return bundle;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19010a aVar = (C19010a) cVar;
            EventBookingActivity eventBookingActivity = EventBookingActivity.this;
            int i = EventBookingActivity.f39338Z;
            eventBookingActivity.getClass();
            RideSharingRegistrationSteps rideSharingRegistrationSteps = ((C19011b) gVar).f48366m;
            if (rideSharingRegistrationSteps != null) {
                eventBookingActivity.startActivityForResult(RideSharingRegistrationActivity.m39024z2(eventBookingActivity, RideSharingRegistrationType.PURCHASE, rideSharingRegistrationSteps, "book_event"), 1001);
                return;
            }
            AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) eventBookingActivity).mo47682k("complete_dialog_fragment_tag");
            k.mo47676e(R.drawable.ic_success_56_info, false);
            AlertDialogFragment.C15856a j = k.mo47683l(R.string.event_booking_purchase_confirmation_dialog_title).mo47678g(R.string.event_booking_purchase_confirmation_dialog_subtitle).mo47681j(R.string.std_positive_button);
            j.f41328b.putParcelable("bookingCart", aVar.f48365w);
            j.mo47673b().show(eventBookingActivity.getSupportFragmentManager(), "complete_dialog_fragment_tag");
        }

        /* renamed from: l */
        public final void mo45760l(Bundle bundle) {
            EventBookingCart eventBookingCart;
            if (bundle != null) {
                eventBookingCart = (EventBookingCart) bundle.getParcelable("bookingCart");
            } else {
                eventBookingCart = null;
            }
            if (eventBookingCart != null) {
                EventBookingActivity eventBookingActivity = EventBookingActivity.this;
                int i = EventBookingActivity.f39338Z;
                eventBookingActivity.mo45756C2(eventBookingCart);
                return;
            }
            EventBookingActivity.this.finish();
        }
    }

    /* renamed from: y2 */
    public static Intent m38987y2(Context context, EventBookingParams eventBookingParams) {
        Intent intent = new Intent(context, EventBookingActivity.class);
        intent.putExtra("params", eventBookingParams);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45754A2(C18831a aVar, String str, boolean z) {
        setTitle(aVar.mo51314n2());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar2 = new C0909a(supportFragmentManager);
        aVar2.mo4111f(R.id.fragment_container, aVar, str);
        if (!z) {
            aVar2.mo4110c(str);
        }
        aVar2.mo4040d();
        supportFragmentManager.mo3981x();
    }

    /* renamed from: B2 */
    public final void mo45755B2() {
        Intent intent = getIntent();
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            this.f39340X = (EventBookingParams) intent.getParcelableExtra("params");
            return;
        }
        Uri data = intent.getData();
        try {
            this.f39340X = EventBookingParams.m39003b(data);
        } catch (Exception e) {
            C16596f a = C16596f.m42113a();
            a.mo49363b(data.toString());
            a.mo49364c(new ApplicationBugException("Failed to parse booking request URI", e));
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(this).putExtra(C17993a.f46076b, "suppress_popups"));
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent2 = new Intent(intentArr[intentArr.length - 1]);
                    intent2.addFlags(268435456);
                    startActivity(intent2);
                }
                finish();
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
    }

    /* renamed from: C2 */
    public final void mo45756C2(EventBookingCart eventBookingCart) {
        mo44543u2((CharSequence) null);
        C13556a aVar = this.f39339U;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39339U = null;
        }
        this.f39341Y.mo51024j();
        C19010a aVar2 = new C19010a(mo44548x1(), eventBookingCart, this.f39340X.f39355g);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C19014e.class, sb, "#");
        sb.append(aVar2.f48365w.f39343b.f42911b);
        String sb2 = sb.toString();
        if (aVar2.f48365w.f39346e.f39359d != null) {
            StringBuilder t = C0016g.m36t(sb2, "#arrival_");
            t.append(aVar2.f48365w.f39346e.f39357b);
            t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t.append(aVar2.f48365w.f39346e.f39358c.mo24310d());
            t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t.append(aVar2.f48365w.f39346e.f39359d.f42927b);
            sb2 = t.toString();
        }
        if (aVar2.f48365w.f39347f.f39359d != null) {
            StringBuilder t2 = C0016g.m36t(sb2, "#return_");
            t2.append(aVar2.f48365w.f39347f.f39357b);
            t2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t2.append(aVar2.f48365w.f39347f.f39358c.mo24310d());
            t2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t2.append(aVar2.f48365w.f39347f.f39359d.f42927b);
            sb2 = t2.toString();
        }
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f39339U = mo44527k2(sb2, aVar2, requestOptions, this.f39341Y);
    }

    /* renamed from: P0 */
    public final void mo45757P0(EventBookingCart eventBookingCart, String str) {
        str.getClass();
        boolean z = true;
        char c = 65535;
        switch (str.hashCode()) {
            case -1561755511:
                if (str.equals("arrival_booking_option_fragment_tag")) {
                    c = 0;
                    break;
                }
                break;
            case -1438911481:
                if (str.equals("arrival_user_location_fragment_tag")) {
                    c = 1;
                    break;
                }
                break;
            case -1210498775:
                if (str.equals("purchase_confirmation_option_fragment_tag")) {
                    c = 2;
                    break;
                }
                break;
            case -1045464709:
                if (str.equals("booking_bucket_options_fragment_tag")) {
                    c = 3;
                    break;
                }
                break;
            case -545429107:
                if (str.equals("booking_bucket_selection_fragment_tag")) {
                    c = 4;
                    break;
                }
                break;
            case 469995632:
                if (str.equals("return_user_location_fragment_tag")) {
                    c = 5;
                    break;
                }
                break;
            case 1779790144:
                if (str.equals("return_booking_option_fragment_tag")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (eventBookingCart.f39347f.f39357b <= 0) {
                    z = false;
                }
                if (z) {
                    int i = C18845j.f47983r;
                    Bundle m2 = C18831a.m45829m2(eventBookingCart);
                    C18845j jVar = new C18845j();
                    jVar.setArguments(m2);
                    mo45754A2(jVar, "return_user_location_fragment_tag", false);
                    return;
                }
                int i2 = C18846k.f47987o;
                Bundle m22 = C18831a.m45829m2(eventBookingCart);
                C18846k kVar = new C18846k();
                kVar.setArguments(m22);
                mo45754A2(kVar, "purchase_confirmation_option_fragment_tag", false);
                return;
            case 1:
                int i3 = C18841h.f47970s;
                Bundle m23 = C18831a.m45829m2(eventBookingCart);
                C18841h hVar = new C18841h();
                hVar.setArguments(m23);
                mo45754A2(hVar, "arrival_booking_option_fragment_tag", false);
                return;
            case 2:
                mo45756C2(eventBookingCart);
                return;
            case 3:
                if (eventBookingCart.f39346e.f39357b <= 0) {
                    z = false;
                }
                if (z) {
                    int i4 = C18845j.f47983r;
                    Bundle m24 = C18831a.m45829m2(eventBookingCart);
                    C18845j jVar2 = new C18845j();
                    jVar2.setArguments(m24);
                    mo45754A2(jVar2, "arrival_user_location_fragment_tag", false);
                    return;
                }
                int i5 = C18845j.f47983r;
                Bundle m25 = C18831a.m45829m2(eventBookingCart);
                C18845j jVar3 = new C18845j();
                jVar3.setArguments(m25);
                mo45754A2(jVar3, "return_user_location_fragment_tag", false);
                return;
            case 4:
                int i6 = C18836e.f47953t;
                Bundle m26 = C18831a.m45829m2(eventBookingCart);
                C18836e eVar = new C18836e();
                eVar.setArguments(m26);
                mo45754A2(eVar, "booking_bucket_options_fragment_tag", eventBookingCart.f39345d);
                return;
            case 5:
                int i7 = C18841h.f47970s;
                Bundle m27 = C18831a.m45829m2(eventBookingCart);
                C18841h hVar2 = new C18841h();
                hVar2.setArguments(m27);
                mo45754A2(hVar2, "return_booking_option_fragment_tag", false);
                return;
            case 6:
                int i8 = C18846k.f47987o;
                Bundle m28 = C18831a.m45829m2(eventBookingCart);
                C18846k kVar2 = new C18846k();
                kVar2.setArguments(m28);
                mo45754A2(kVar2, "purchase_confirmation_option_fragment_tag", false);
                return;
            default:
                return;
        }
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        EventBookingCart eventBookingCart;
        ServerId serverId;
        if ("complete_dialog_fragment_tag".equals(str) && (eventBookingCart = (EventBookingCart) bundle.getParcelable("bookingCart")) != null) {
            EventBookingOption eventBookingOption = eventBookingCart.f39346e.f39359d;
            EventBookingOption eventBookingOption2 = eventBookingCart.f39347f.f39359d;
            if (eventBookingOption != null) {
                serverId = eventBookingOption.f42927b;
            } else if (eventBookingOption2 != null) {
                serverId = eventBookingOption2.f42927b;
            } else {
                serverId = null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(this));
            arrayList.add(EventDetailActivity.m38909y2(this, this.f39340X.f39350b, serverId));
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                finish();
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45755B2();
        if (!isFinishing()) {
            mo45758z2(true);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.event_booking_activity);
        getSupportFragmentManager().mo3948b(new C18639a(this));
        mo45755B2();
        if (!isFinishing()) {
            mo45758z2(false);
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C13556a aVar = this.f39339U;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39339U = null;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            EventsProvider eventsProvider = EventsProvider.f39286k;
            eventsProvider.getClass();
            EventsProvider.m38934b(-1);
            eventsProvider.f39288b.f39299c = -1;
            eventsProvider.f39289c.f39299c = -1;
            eventsProvider.f39290d.f39299c = -1;
            eventsProvider.f39291e.f39299c = -1;
            eventsProvider.f39292f.f39299c = -1;
            eventsProvider.mo45739e(31);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("RIDE_SHARING_EVENTS_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if (this.f39341Y.mo51022g(str, i, bundle)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: z2 */
    public final void mo45758z2(boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (z || supportFragmentManager.mo3983z(R.id.fragment_container) == null) {
            EventBookingCart eventBookingCart = new EventBookingCart();
            int i = C18837f.f47959s;
            Bundle m2 = C18831a.m45829m2(eventBookingCart);
            C18837f fVar = new C18837f();
            fVar.setArguments(m2);
            mo45754A2(fVar, "booking_bucket_selection_fragment_tag", true);
        }
    }
}
