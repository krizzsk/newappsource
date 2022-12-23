package com.moovit.app.realtimehelp;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.app.tracking.TrackingEvent;
import com.tranzmate.R;
import p977zz.C20930c;
import p977zz.C20941h;

public class RealTimeHelpBannerView extends ConstraintLayout {

    /* renamed from: h */
    public final Button f39174h;

    /* renamed from: i */
    public final View f39175i;

    public RealTimeHelpBannerView() {
        throw null;
    }

    public RealTimeHelpBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static void m38837c(Context context) {
        TrackingEvent trackingEvent = TrackingEvent.REAL_TIME_HELP_BANNER;
        context.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
    }

    /* renamed from: d */
    public static boolean m38838d(Context context) {
        TrackingEvent trackingEvent = TrackingEvent.REAL_TIME_HELP_BANNER;
        boolean z = false;
        if (context.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
            z = true;
        }
        return !z;
    }

    public void setOnDismissClickListener(View.OnClickListener onClickListener) {
        this.f39175i.setOnClickListener(onClickListener);
    }

    public void setOnLinkClickListener(View.OnClickListener onClickListener) {
        this.f39174h.setOnClickListener(onClickListener);
    }

    public RealTimeHelpBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.real_time_help_banner_view, this, true);
        setBackgroundColor(C20941h.m49043f(R.attr.colorInfo, context));
        this.f39175i = findViewById(R.id.rt_banner_action);
        Button button = (Button) findViewById(R.id.rt_banner_text);
        this.f39174h = button;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String upperCase = context.getString(R.string.station_view_where_we_get_times_read_more).toUpperCase(C20930c.m49020b(context.getApplicationContext()));
        spannableStringBuilder.append(context.getString(R.string.station_view_where_we_get_times_link));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append(upperCase);
        int indexOf = spannableStringBuilder.toString().indexOf(upperCase);
        spannableStringBuilder.setSpan(new UnderlineSpan(), indexOf, upperCase.length() + indexOf, 33);
        button.setText(spannableStringBuilder);
    }
}
