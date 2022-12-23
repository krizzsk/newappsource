package com.moovit.app.tod.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import c20.C13744a;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiButtonSpec;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.taxi.providers.TaxiTripPlanConfig;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p242s1.C6333d0;
import p583jk.C17884p;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20964s0;

public class TodTripPlanBannerView extends ConstraintLayout {

    /* renamed from: h */
    public final ImageView f40489h;

    /* renamed from: i */
    public final ImageView f40490i;

    /* renamed from: j */
    public final TextView f40491j;

    /* renamed from: k */
    public final ListItemView f40492k;

    /* renamed from: l */
    public final ListItemView f40493l;

    /* renamed from: m */
    public final Button f40494m;

    /* renamed from: n */
    public final Group f40495n;

    /* renamed from: o */
    public final Group f40496o;

    public TodTripPlanBannerView() {
        throw null;
    }

    public TodTripPlanBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static TaxiProvider m39766c(Context context, ServerId serverId) {
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(context.getApplicationContext());
        if (b != null) {
            return b.mo46163c(serverId);
        }
        return null;
    }

    public void set(TripPlanTodBanner tripPlanTodBanner) {
        Image image;
        Image image2;
        TaxiTripPlanConfig taxiTripPlanConfig;
        int i;
        TaxiProvider c = m39766c(getContext(), tripPlanTodBanner.f41858c);
        TaxiButtonSpec taxiButtonSpec = null;
        if (c != null) {
            image = c.f39972g;
        } else {
            image = null;
        }
        ImageView imageView = this.f40489h;
        if (image != null) {
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22730m(R.drawable.ic_taxi_24_on_surface).mo10850T(imageView);
        } else {
            imageView.setImageResource(R.drawable.ic_taxi_24_on_surface);
        }
        TaxiProvider c2 = m39766c(getContext(), tripPlanTodBanner.f41858c);
        if (c2 != null) {
            image2 = c2.f39977l.f39991e;
        } else {
            image2 = null;
        }
        C13744a.m34300b(this.f40490i, image2);
        TripPlanTodBanner.C16078c cVar = tripPlanTodBanner.f41863h;
        TaxiProvider c3 = m39766c(getContext(), tripPlanTodBanner.f41858c);
        if (c3 != null) {
            taxiTripPlanConfig = c3.f39977l;
        } else {
            taxiTripPlanConfig = null;
        }
        if (taxiTripPlanConfig != null) {
            taxiButtonSpec = taxiTripPlanConfig.f39992f;
        }
        if (cVar != null) {
            this.f40493l.setTitle((CharSequence) cVar.f41866a);
            this.f40493l.setSubtitle((CharSequence) cVar.f41867b);
            boolean z = !C20964s0.m49090h(cVar.f41868c);
            if (z) {
                Button button = this.f40494m;
                button.setText(cVar.f41869d);
                if (taxiButtonSpec != null) {
                    button.setTextColor(taxiButtonSpec.f39929c.f41007b);
                    C6333d0.m15032t(button, ColorStateList.valueOf(taxiButtonSpec.f39930d.f41007b));
                }
            }
            Button button2 = this.f40494m;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            button2.setVisibility(i);
            this.f40496o.setVisibility(0);
            this.f40495n.setVisibility(4);
            return;
        }
        CurrencyAmount currencyAmount = tripPlanTodBanner.f41861f;
        if (currencyAmount == null) {
            this.f40491j.setVisibility(8);
        } else {
            this.f40491j.setText(currencyAmount.toString());
            this.f40491j.setVisibility(0);
        }
        long j = tripPlanTodBanner.f41859d;
        if (j < 0) {
            this.f40492k.setVisibility(4);
        } else {
            Context context = getContext();
            Resources resources = getResources();
            this.f40492k.setTitle((CharSequence) resources.getString(R.string.tod_suggested_routes_approx_pickup, new Object[]{C7925b.m18017e(context, j), C7925b.m18024l(context, j)}));
            long j2 = tripPlanTodBanner.f41860e;
            if (j2 >= 0) {
                this.f40492k.setSubtitle((CharSequence) resources.getString(R.string.tod_suggested_routes_eta, new Object[]{C7925b.m18018f(context, j2, false)}));
            }
        }
        if (taxiButtonSpec != null) {
            C15413a.m39456a(this.f40494m, taxiButtonSpec);
        } else {
            this.f40494m.setText(R.string.tod_suggested_routes_find_ride);
        }
        this.f40494m.setVisibility(0);
        this.f40495n.setVisibility(0);
        this.f40496o.setVisibility(8);
    }

    public TodTripPlanBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMinHeight(UiUtils.m40249h(context.getResources(), 98.0f));
        C20943i.m49053f(this, C20941h.m49045h(R.attr.selectableItemBackground, context));
        LayoutInflater.from(context).inflate(R.layout.tod_trip_plan_banner_view, this, true);
        this.f40489h = (ImageView) findViewById(R.id.image);
        this.f40490i = (ImageView) findViewById(R.id.backdropImage);
        this.f40491j = (TextView) findViewById(R.id.price);
        this.f40492k = (ListItemView) findViewById(R.id.times);
        this.f40493l = (ListItemView) findViewById(R.id.message);
        this.f40494m = (Button) findViewById(R.id.order_button);
        this.f40495n = (Group) findViewById(R.id.group_ride);
        this.f40496o = (Group) findViewById(R.id.group_message);
    }
}
