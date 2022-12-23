package com.moovit.view;

import a00.C13382a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Amenities;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p824tp.C19748z;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;

public class SimpleStopsView extends LinearLayout {

    /* renamed from: b */
    public final float f24003b;

    /* renamed from: c */
    public final float f24004c;

    /* renamed from: d */
    public final float f24005d;

    /* renamed from: e */
    public final Paint f24006e;

    /* renamed from: f */
    public final Paint f24007f;

    /* renamed from: g */
    public View.OnClickListener f24008g;

    public SimpleStopsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24754a(int i, TransitStop transitStop, TransitStop transitStop2, Time time, Time time2, String str, String str2) {
        String str3;
        TransitStop transitStop3 = transitStop;
        removeAllViews();
        Context context = getContext();
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = C19742t.simple_stop_view_item_layout;
        View inflate = from.inflate(i2, this, false);
        context.getString(C19746x.voice_over_tripplan_from, new Object[]{transitStop3});
        mo24755b(inflate, transitStop, time, str, i);
        inflate.setMinimumHeight(UiUtils.m40249h(context.getResources(), 44.0f));
        addView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(i2, this, false);
        context.getString(C19746x.voice_over_tripplan_to, new Object[]{transitStop3});
        mo24755b(inflate2, transitStop2, time2, str2, 0);
        addView(inflate2);
        Context context2 = getContext();
        String l = C7925b.m18024l(getContext(), time.mo24631g());
        String l2 = C7925b.m18024l(getContext(), time2.mo24631g());
        CharSequence[] charSequenceArr = new CharSequence[7];
        charSequenceArr[0] = context2.getString(C19746x.suggested_routes_depart, new Object[]{transitStop3.f23731c});
        String str4 = null;
        if (C20964s0.m49090h(str)) {
            str3 = null;
        } else {
            str3 = str;
        }
        charSequenceArr[1] = str3;
        charSequenceArr[2] = context2.getString(C19746x.voiceover_departure_time, new Object[]{l});
        charSequenceArr[3] = context2.getString(C19746x.tripplan_itinerary_stops_count_text_android, new Object[]{Integer.valueOf(i)});
        charSequenceArr[4] = transitStop2.f23731c;
        if (!C20964s0.m49090h(str2)) {
            str4 = str2;
        }
        charSequenceArr[5] = str4;
        charSequenceArr[6] = context2.getString(C19746x.tripplan_itinerary_arrive, new Object[]{l2});
        C13382a.m33674j(this, C13382a.m33667c(charSequenceArr));
    }

    /* renamed from: b */
    public final void mo24755b(View view, TransitStop transitStop, Time time, String str, int i) {
        int i2;
        boolean z;
        String str2;
        ((TextView) view.findViewById(C19740r.time)).setText(C7925b.m18024l(getContext(), time.mo24631g()));
        ((TextView) view.findViewById(C19740r.destination)).setText(transitStop.f23731c);
        TextView textView = (TextView) view.findViewById(C19740r.description);
        int i3 = 8;
        if (C20964s0.m49090h(str)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        textView.setText(str);
        TextView textView2 = (TextView) view.findViewById(C19740r.action);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = getContext().getString(C19746x.units_stops, new Object[]{Integer.valueOf(i)});
        } else {
            str2 = "";
        }
        textView2.setText(str2);
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        View.OnClickListener onClickListener = this.f24008g;
        if (onClickListener != null) {
            textView2.setOnClickListener(onClickListener);
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        boolean b = C15780a.m40269b(this);
        float strokeWidth = this.f24006e.getStrokeWidth();
        float f3 = 0.5f * strokeWidth;
        if (b) {
            i = getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        int i2 = (((int) this.f24003b) / 2) + i;
        if (b) {
            i2 = getWidth() - i2;
        }
        int childCount = getChildCount();
        if (childCount >= 2) {
            float f4 = (float) i2;
            float f5 = f4 - f3;
            float f6 = f4 + f3;
            float height = (float) getHeight();
            View childAt = getChildAt(0);
            if (childAt != null) {
                float y = childAt.getY();
                View findViewById = childAt.findViewById(C19740r.time);
                f = ((float) ((findViewById.getHeight() / 2) + findViewById.getTop())) + y;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                float y2 = childAt2.getY();
                View findViewById2 = childAt2.findViewById(C19740r.time);
                f2 = ((float) ((findViewById2.getHeight() / 2) + findViewById2.getTop())) + y2;
            } else {
                f2 = height;
            }
            C20975x0.m49117d(canvas, f5, f, f6, f2, this.f24006e);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt3 = getChildAt(i3);
            float y3 = childAt3.getY();
            View findViewById3 = childAt3.findViewById(C19740r.time);
            float height2 = ((float) ((findViewById3.getHeight() / 2) + findViewById3.getTop())) + y3;
            if (i3 == 0) {
                float f7 = (float) i2;
                float f8 = height2 + strokeWidth;
                canvas.drawCircle(f7, f8, this.f24005d, this.f24006e);
                canvas.drawCircle(f7, f8, this.f24004c, this.f24007f);
            } else if (i3 == childCount - 1) {
                canvas.drawCircle((float) i2, height2 + strokeWidth, this.f24005d, this.f24006e);
            }
        }
    }

    public void setFillColor(int i) {
        this.f24007f.setColor(i);
    }

    public void setFullColor(int i) {
        this.f24006e.setColor(i);
    }

    public void setStopsCountClickListener(View.OnClickListener onClickListener) {
        this.f24008g = onClickListener;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleStopsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C19748z.SimpleStopsView, i);
        try {
            this.f24003b = o.getDimension(C19748z.SimpleStopsView_startOffset, UiUtils.m40247f(context.getResources(), 12.0f));
            float dimension = o.getDimension(C19748z.SimpleStopsView_fullRadius, 6.0f);
            this.f24005d = dimension;
            this.f24004c = o.getDimension(C19748z.SimpleStopsView_fillRadius, dimension - ((float) UiUtils.m40249h(context.getResources(), 1.25f)));
            float dimension2 = o.getDimension(C19748z.SimpleStopsView_fullWidth, UiUtils.m40247f(context.getResources(), 1.0f));
            int a = C20941h.m49038a(context2, o, C19748z.SimpleStopsView_fullColor, C19735m.colorSecondary);
            int a2 = C20941h.m49038a(context2, o, C19748z.SimpleStopsView_fillColor, C19735m.colorOnSecondary);
            Paint paint = new Paint(1);
            this.f24006e = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setColor(a);
            paint.setStrokeWidth(dimension2);
            Paint paint2 = new Paint(1);
            this.f24007f = paint2;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(a2);
            o.recycle();
            setOrientation(1);
            setWillNotDraw(false);
            if (isInEditMode()) {
                TransitStop transitStop = new TransitStop(new ServerId(1), "Moorgate Station", new LatLonE6(0, 0), (String) null, (Image) null, Collections.emptyList(), Collections.emptyList(), new ImageSet((C20944i0<Integer, Image>[]) new C20944i0[0]), Collections.emptyList(), Collections.emptyList(), DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
                ServerId serverId = new ServerId(2);
                LatLonE6 latLonE6 = new LatLonE6(0, 0);
                ServerId serverId2 = serverId;
                LatLonE6 latLonE62 = latLonE6;
                TransitStop transitStop2 = new TransitStop(serverId2, "Barbican Station", latLonE62, (String) null, (Image) null, Collections.emptyList(), Collections.emptyList(), new ImageSet((C20944i0<Integer, Image>[]) new C20944i0[0]), Collections.emptyList(), Collections.emptyList(), DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
                Time time = new Time(System.currentTimeMillis());
                TransitStop transitStop3 = transitStop2;
                Time time2 = time;
                mo24754a(4, transitStop, transitStop3, time2, new Time(TimeUnit.HOURS.toMillis(1) + System.currentTimeMillis()), "Platform1", "platform 7");
            }
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
