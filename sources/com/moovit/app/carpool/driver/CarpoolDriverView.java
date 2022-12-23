package com.moovit.app.carpool.driver;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.carpool.CarpoolCar;
import com.moovit.carpool.CarpoolCompany;
import com.moovit.carpool.CarpoolConfirmationRate;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.commons.view.FormatTextView;
import com.tranzmate.R;
import p472er.C16865g;
import p544hr.C17483d;
import p544hr.C17484e;
import p544hr.C17485f;

public class CarpoolDriverView extends FrameLayout {

    /* renamed from: b */
    public TextView f37714b;

    /* renamed from: c */
    public ImageView f37715c;

    /* renamed from: d */
    public RatingBar f37716d;

    /* renamed from: e */
    public FormatTextView f37717e;

    /* renamed from: f */
    public ViewGroup f37718f;

    /* renamed from: g */
    public View f37719g;

    /* renamed from: h */
    public C14803a f37720h;

    /* renamed from: com.moovit.app.carpool.driver.CarpoolDriverView$a */
    public interface C14803a {
    }

    public CarpoolDriverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo44853a(CarpoolDriver carpoolDriver) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        this.f37714b.setText(String.format("%1$s %2$s", new Object[]{carpoolDriver.f40876c, carpoolDriver.f40877d}));
        float f = carpoolDriver.f40880g;
        int i3 = carpoolDriver.f40887n;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup viewGroup = this.f37718f;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        if (z) {
            RatingBar ratingBar = this.f37716d;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            ratingBar.setRating(f);
            this.f37717e.setArguments(Integer.valueOf(i3));
        }
        View findViewById = findViewById(R.id.contact);
        if (carpoolDriver.f40878e != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        if (carpoolDriver.f40891r == null && carpoolDriver.f40887n == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        TextView textView = (TextView) findViewById(R.id.new_driver_badge);
        if (z3) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        if (z3) {
            Context context = getContext();
            textView.setText(String.format("%1$s - %2$s", new Object[]{context.getString(R.string.carpool_ride_details_driver_profile_new_driver_label), context.getString(R.string.carpool_ride_details_driver_profile_book_first_ride)}));
        }
        C16865g.m42681d(this.f37715c, carpoolDriver.f40881h);
        C16865g.m42680c(this.f37719g, carpoolDriver.f40891r);
    }

    public void setListener(C14803a aVar) {
        this.f37720h = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarpoolDriverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.carpool_driver_view, this);
        this.f37714b = (TextView) findViewById(R.id.name);
        this.f37718f = (ViewGroup) findViewById(R.id.rating_container);
        this.f37716d = (RatingBar) findViewById(R.id.rating);
        this.f37717e = (FormatTextView) findViewById(R.id.num_ratings);
        ImageView imageView = (ImageView) findViewById(R.id.profile_picture);
        this.f37715c = imageView;
        imageView.setOnClickListener(new C17483d(this));
        this.f37719g = findViewById(R.id.confirmation_rate);
        findViewById(R.id.view_profile).setOnClickListener(new C17484e(this));
        findViewById(R.id.contact).setOnClickListener(new C17485f(this));
        if (isInEditMode()) {
            CarpoolCar carpoolCar = r3;
            CarpoolCar carpoolCar2 = new CarpoolCar("7438744", "Rolls Royce", "Swamp Green");
            mo44853a(new CarpoolDriver("1234", "Freddie", "Mercury", (String) null, carpoolCar, 3.6f, (Uri) null, 5, "I'm a fast and crazy driver. I listen to classical Rock and Roll, and occasionally like to sing myself. The show must go on!", 28, 20, System.currentTimeMillis(), 105, (String) null, (CarpoolCompany) null, false, (CarpoolConfirmationRate) null));
        }
    }
}
