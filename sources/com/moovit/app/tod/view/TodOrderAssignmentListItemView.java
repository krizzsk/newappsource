package com.moovit.app.tod.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.moovit.app.tod.model.TodOrderAssignment;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import p501fw.C17102a;
import p583jk.C17884p;
import p927xw.C20652s;
import p977zz.C20930c;
import p977zz.C20941h;
import p977zz.C20958p0;
import p977zz.C20964s0;

public class TodOrderAssignmentListItemView extends ConstraintLayout {

    /* renamed from: A */
    public static final long f40453A = TimeUnit.MINUTES.toMillis(60);

    /* renamed from: B */
    public static final /* synthetic */ int f40454B = 0;

    /* renamed from: h */
    public final TextView f40455h;

    /* renamed from: i */
    public final TextView f40456i;

    /* renamed from: j */
    public final ImageView f40457j;

    /* renamed from: k */
    public final TextView f40458k;

    /* renamed from: l */
    public final TextView f40459l;

    /* renamed from: m */
    public final ListItemView f40460m;

    /* renamed from: n */
    public final ListItemView f40461n;

    /* renamed from: o */
    public final ListItemView f40462o;

    /* renamed from: p */
    public final ListItemView f40463p;

    /* renamed from: q */
    public final Group f40464q;

    /* renamed from: r */
    public final Group f40465r;

    /* renamed from: s */
    public final Group f40466s;

    /* renamed from: t */
    public final Group f40467t;

    /* renamed from: u */
    public final FormatTextView f40468u;

    /* renamed from: v */
    public final FormatTextView f40469v;

    /* renamed from: w */
    public final ImageView f40470w;

    /* renamed from: x */
    public final View f40471x;

    /* renamed from: y */
    public final View f40472y;

    /* renamed from: z */
    public final Context f40473z;

    public TodOrderAssignmentListItemView() {
        throw null;
    }

    public TodOrderAssignmentListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setJourney(TodRideJourney todRideJourney) {
        LocationDescriptor locationDescriptor = todRideJourney.f40284b;
        long j = todRideJourney.f40288f;
        LocationDescriptor locationDescriptor2 = todRideJourney.f40285c;
        LocationDescriptor locationDescriptor3 = todRideJourney.f40286d;
        long j2 = todRideJourney.f40289g;
        LocationDescriptor locationDescriptor4 = todRideJourney.f40287e;
        this.f40460m.setSubtitle((CharSequence) locationDescriptor.mo24313f());
        this.f40463p.setSubtitle((CharSequence) locationDescriptor4.mo24313f());
        if (locationDescriptor2 == null || locationDescriptor3 == null) {
            UiUtils.m40238F(8, this.f40464q, this.f40465r, this.f40466s, this.f40467t, this.f40471x, this.f40472y);
            this.f40470w.setVisibility(0);
            return;
        }
        this.f40461n.setSubtitle((CharSequence) locationDescriptor2.mo24313f());
        this.f40462o.setSubtitle((CharSequence) locationDescriptor3.mo24313f());
        this.f40470w.setVisibility(4);
        UiUtils.m40238F(0, this.f40464q, this.f40465r);
        if (j > 0) {
            this.f40468u.setArguments(Long.valueOf(j));
            this.f40466s.setVisibility(0);
            this.f40471x.setVisibility(8);
        } else {
            this.f40466s.setVisibility(8);
            this.f40471x.setVisibility(0);
        }
        if (j2 > 0) {
            this.f40469v.setArguments(Long.valueOf(j2));
            this.f40467t.setVisibility(0);
            this.f40472y.setVisibility(8);
            return;
        }
        this.f40467t.setVisibility(8);
        this.f40472y.setVisibility(0);
    }

    private void setPrice(TodOrderAssignment todOrderAssignment) {
        String str;
        int i;
        Drawable drawable;
        CurrencyAmount currencyAmount = todOrderAssignment.f40252j;
        TextView textView = this.f40456i;
        if (currencyAmount != null) {
            str = currencyAmount.toString();
        } else {
            str = "";
        }
        textView.setText(str);
        String str2 = todOrderAssignment.f40255m;
        TextView textView2 = this.f40456i;
        if (!C20964s0.m49090h(str2)) {
            i = R.drawable.img_more_info;
        } else {
            i = 0;
        }
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C17988b.m44611b(i, textView2.getContext());
        }
        C15780a.m40271d(textView2, UiUtils.Edge.RIGHT, drawable);
        this.f40456i.setTag(str2);
    }

    private void setProviderImage(Image image) {
        C17884p.m44354Y(this.f40457j).mo51642v(image).mo51628o0(image).mo10850T(this.f40457j);
    }

    public TodOrderAssignment getTodOrderAssignment() {
        return (TodOrderAssignment) getTag();
    }

    public void setTodOrderAssignment(TodOrderAssignment todOrderAssignment) {
        int i;
        CharSequence charSequence;
        String str;
        long j;
        long j2;
        TodOrderAssignment todOrderAssignment2 = todOrderAssignment;
        setTag(todOrderAssignment);
        TodRideJourney todRideJourney = todOrderAssignment2.f40250h;
        long j3 = todOrderAssignment2.f40248f;
        long j4 = todOrderAssignment2.f40249g;
        boolean z = todOrderAssignment2.f40253k;
        if (j3 == 0 || j4 == 0) {
            i = 8;
            this.f40455h.setVisibility(8);
        } else {
            long j5 = todRideJourney.f40289g;
            if (j5 != -1) {
                j = TimeUnit.MILLISECONDS.convert(j5, TimeUnit.MINUTES);
            } else {
                j = 0;
            }
            long j6 = todRideJourney.f40288f;
            if (j6 != -1) {
                j2 = TimeUnit.MILLISECONDS.convert(j6, TimeUnit.MINUTES);
            } else {
                j2 = 0;
            }
            long j7 = j4 + j;
            String g = C7925b.m18019g(getContext(), j7 - (j3 - j2));
            String f = C7925b.m18018f(getContext(), j7, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C20958p0.m49078b(C20930c.m49020b(this.f40473z), this.f40473z.getString(R.string.tod_passenger_order_duration), g, f));
            spannableStringBuilder.setSpan(C20964s0.m49084b(this.f40473z, R.attr.textAppearanceBodyStrong, R.attr.colorOnSurface), 0, g.length(), 33);
            spannableStringBuilder.setSpan(C20964s0.m49084b(this.f40473z, R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisMedium), g.length(), spannableStringBuilder.length(), 33);
            this.f40455h.setText(spannableStringBuilder);
            this.f40455h.setVisibility(0);
            i = 8;
        }
        setPrice(todOrderAssignment);
        setProviderImage(todOrderAssignment2.f40245c);
        long j8 = todOrderAssignment2.f40254l;
        TextView textView = this.f40458k;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        if (z) {
            Resources resources = getResources();
            if (j8 > 0) {
                str = resources.getString(R.string.tod_passenger_ride_status_future_time_message, new Object[]{C7925b.m18017e(this.f40473z, j8), C7925b.m18024l(this.f40473z, j8)});
            } else {
                str = resources.getString(R.string.tod_passenger_order_future_message);
            }
            this.f40458k.setText(str);
        }
        LocationDescriptor locationDescriptor = todRideJourney.f40285c;
        TextView textView2 = this.f40459l;
        if (z || locationDescriptor == null || j3 - System.currentTimeMillis() > f40453A) {
            charSequence = C20652s.m48548c(this.f40473z, j3);
        } else {
            Context context = this.f40473z;
            SpannableStringBuilder g2 = C7925b.f23935b.mo24607g(context, j3, Collections.emptyList());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(C20964s0.m49085c(context, R.drawable.ic_real_time_12_live));
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append(g2);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorLive, context)), length, spannableStringBuilder2.length(), 33);
            charSequence = C20958p0.m49078b(C20930c.m49020b(context), context.getString(R.string.tod_passenger_order_pickup_address), spannableStringBuilder2, locationDescriptor.mo24313f());
        }
        textView2.setText(charSequence);
        setJourney(todRideJourney);
    }

    public TodOrderAssignmentListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.screen_edge);
        int h = UiUtils.m40249h(context.getResources(), 16.0f);
        setPadding(dimensionPixelSize, h, dimensionPixelSize, h);
        LayoutInflater.from(context).inflate(R.layout.tod_assignment_list_item_view, this, true);
        this.f40473z = context;
        this.f40455h = (TextView) findViewById(R.id.duration);
        TextView textView = (TextView) findViewById(R.id.price);
        this.f40456i = textView;
        textView.setOnClickListener(new C17102a(this, 7));
        this.f40457j = (ImageView) findViewById(R.id.icon);
        this.f40458k = (TextView) findViewById(R.id.message);
        this.f40459l = (TextView) findViewById(R.id.details);
        this.f40460m = (ListItemView) findViewById(R.id.origin_info);
        this.f40463p = (ListItemView) findViewById(R.id.destination_info);
        this.f40464q = (Group) findViewById(R.id.pickup_group);
        this.f40465r = (Group) findViewById(R.id.dropoff_group);
        this.f40466s = (Group) findViewById(R.id.walk_pickup_group);
        this.f40467t = (Group) findViewById(R.id.walk_destination_group);
        this.f40461n = (ListItemView) findViewById(R.id.pickup_info);
        this.f40462o = (ListItemView) findViewById(R.id.drop_off_info);
        this.f40468u = (FormatTextView) findViewById(R.id.walk_pickup_info);
        this.f40469v = (FormatTextView) findViewById(R.id.walk_destination_info);
        this.f40470w = (ImageView) findViewById(R.id.origin_destination_line);
        this.f40471x = findViewById(R.id.origin_pickup_line);
        this.f40472y = findViewById(R.id.dropoff_dest_line);
    }
}
