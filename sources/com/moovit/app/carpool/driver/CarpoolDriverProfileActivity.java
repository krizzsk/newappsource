package com.moovit.app.carpool.driver;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.transition.Fade;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.CarpoolProfilePopupActivity;
import com.moovit.carpool.CarpoolCar;
import com.moovit.carpool.CarpoolCompany;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.view.CheckListView;
import com.tranzmate.R;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p073e7.C4584b;
import p090g1.C4732a;
import p297w5.C6996c;
import p472er.C16865g;
import p543hq.C17474b;
import p544hr.C17480a;
import p544hr.C17481b;
import p977zz.C20943i;
import p977zz.C20964s0;

public class CarpoolDriverProfileActivity extends MoovitAppActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f37706n0 = 0;

    /* renamed from: U */
    public View f37707U;

    /* renamed from: X */
    public View f37708X;

    /* renamed from: Y */
    public View f37709Y;

    /* renamed from: Z */
    public CarpoolDriver f37710Z;

    /* renamed from: l0 */
    public final C14802a f37711l0 = new C14802a();

    /* renamed from: m0 */
    public C17481b f37712m0;

    /* renamed from: com.moovit.app.carpool.driver.CarpoolDriverProfileActivity$a */
    public class C14802a implements View.OnClickListener {
        public C14802a() {
        }

        public final void onClick(View view) {
            CarpoolDriverProfileActivity carpoolDriverProfileActivity = CarpoolDriverProfileActivity.this;
            Uri uri = carpoolDriverProfileActivity.f37710Z.f40881h;
            int i = CarpoolProfilePopupActivity.f37640l0;
            Intent intent = new Intent(carpoolDriverProfileActivity, CarpoolProfilePopupActivity.class);
            intent.putExtra("profile.image.url_extra", uri);
            intent.putExtra("profile.image.url.placeholder.drawable_extra", R.drawable.img_profile_seat_belt_90_gray52);
            intent.putExtra("profile.ride.id", (Parcelable) null);
            C4732a.startActivity(carpoolDriverProfileActivity, intent, CarpoolProfilePopupActivity.m37193y2(carpoolDriverProfileActivity, carpoolDriverProfileActivity.findViewById(R.id.profile_picture)).mo20005a());
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_driver_profile_clicked");
            carpoolDriverProfileActivity.mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        String str;
        boolean z5;
        boolean z6;
        boolean z7;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_driver_profile_activity);
        this.f37710Z = (CarpoolDriver) getIntent().getParcelableExtra("driver");
        this.f37708X = findViewById(R.id.extended_container);
        this.f37707U = findViewById(R.id.main_details_container);
        this.f37709Y = findViewById(R.id.contact_container);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        getSupportActionBar().mo791m(true);
        ImageView imageView = (ImageView) findViewById(R.id.profile_picture);
        C16865g.m42681d(imageView, this.f37710Z.f40881h);
        imageView.setOnClickListener(this.f37711l0);
        CarpoolDriver carpoolDriver = this.f37710Z;
        ((TextView) findViewById(R.id.name)).setText(String.format("%1$s %2$s", new Object[]{carpoolDriver.f40876c, carpoolDriver.f40877d}));
        CarpoolDriver carpoolDriver2 = this.f37710Z;
        float f = carpoolDriver2.f40880g;
        int i4 = carpoolDriver2.f40887n;
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        View findViewById = findViewById(R.id.rating_container);
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (z) {
            RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);
            FormatTextView formatTextView = (FormatTextView) findViewById(R.id.num_ratings);
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            ratingBar.setRating(f);
            formatTextView.setArguments(Integer.valueOf(i4));
        }
        FormatTextView formatTextView2 = (FormatTextView) findViewById(R.id.facebook_friends);
        int i6 = this.f37710Z.f40882i;
        if (i6 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            formatTextView2.setArguments(Integer.valueOf(i6));
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        formatTextView2.setVisibility(i2);
        ImageView imageView2 = (ImageView) findViewById(R.id.call);
        imageView2.setImageDrawable(UiUtils.m40244c(this, R.drawable.ic_call_24_tertiary));
        if (this.f37710Z.f40878e != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        imageView2.setEnabled(z3);
        imageView2.setOnClickListener(new C6996c(this, 7));
        ImageView imageView3 = (ImageView) findViewById(R.id.sms);
        imageView3.setImageDrawable(UiUtils.m40244c(this, R.drawable.ic_message_24_tertiary));
        if (this.f37710Z.f40878e != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        imageView3.setEnabled(z4);
        imageView3.setOnClickListener(new C4584b(this, 3));
        String str2 = this.f37710Z.f40883j;
        boolean z8 = !TextUtils.isEmpty(str2);
        TextView textView = (TextView) findViewById(R.id.self_description);
        if (z8) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (z8) {
            textView.setText(str2);
        }
        TextView textView2 = (TextView) findViewById(R.id.car_description);
        CarpoolCar carpoolCar = this.f37710Z.f40879f;
        String str3 = carpoolCar.f40865c;
        if (C20964s0.m49090h(str3)) {
            textView2.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder(str3);
            if (!C20964s0.m49090h(carpoolCar.f40866d)) {
                sb.append(", ");
                sb.append(getString(R.string.carpool_car_description, new Object[]{carpoolCar.f40866d}));
            }
            textView2.setText(sb.toString());
            textView2.setVisibility(0);
        }
        TextView textView3 = (TextView) findViewById(R.id.company_description);
        CarpoolCompany carpoolCompany = this.f37710Z.f40889p;
        if (carpoolCompany == null) {
            str = null;
        } else {
            str = carpoolCompany.f40868b;
        }
        if (!C20964s0.m49090h(str)) {
            textView3.setText(getString(R.string.carpool_ride_details_driver_profile_company, new Object[]{str}));
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        CheckListView checkListView = (CheckListView) findViewById(R.id.check_list);
        checkListView.removeAllViews();
        checkListView.mo24677a(R.string.carpool_ride_details_driver_profile_checked_phone_message, null);
        checkListView.mo24677a(R.string.carpool_email_confirmation, null);
        int i7 = this.f37710Z.f40885l;
        if (i7 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            checkListView.mo24677a(R.string.carpool_ride_details_driver_profile_checked_number_of_rides_message, Integer.valueOf(i7));
        }
        long j = this.f37710Z.f40886m;
        if (j > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            checkListView.mo24677a(R.string.carpool_ride_details_driver_profile_checked_user_creation_message, String.format("%1$s %2$s", new Object[]{instance.getDisplayName(2, 2, Locale.getDefault()), Integer.valueOf(instance.get(1))}));
        }
        C16865g.m42680c(findViewById(R.id.confirmation_rate), this.f37710Z.f40891r);
        CarpoolDriver carpoolDriver3 = this.f37710Z;
        if (carpoolDriver3.f40891r == null && carpoolDriver3.f40887n == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        View findViewById2 = findViewById(R.id.new_driver_badge);
        if (z7) {
            i5 = 0;
        }
        findViewById2.setVisibility(i5);
        if (C20943i.m49051d(21)) {
            Fade fade = new Fade();
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(16908335, true);
            getWindow().setEnterTransition(fade);
            this.f37712m0 = new C17481b(this);
            this.f37707U.setVisibility(4);
            this.f37708X.setVisibility(4);
            this.f37709Y.setVisibility(4);
            getWindow().getSharedElementEnterTransition().addListener(this.f37712m0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.description_container);
        UiUtils.m40263v(viewGroup);
        findViewById(R.id.divider).setVisibility(viewGroup.getVisibility());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        String str4 = C17480a.f45011t;
        C17480a aVar2 = (C17480a) supportFragmentManager.mo3923A(str4);
        if (aVar2 != null) {
            aVar.mo4050p(aVar2);
        }
        CarpoolDriver carpoolDriver4 = this.f37710Z;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("driver", carpoolDriver4);
        C17480a aVar3 = new C17480a();
        aVar3.setArguments(bundle2);
        aVar.mo4041e(0, aVar3, str4, 1);
        aVar.mo4040d();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        CarpoolRide carpoolRide = (CarpoolRide) getIntent().getParcelableExtra("ride");
        if (carpoolRide != null) {
            m1.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, carpoolRide.f40910b);
        }
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CARPOOL_SUPPORT_VALIDATOR");
        return s1;
    }
}
