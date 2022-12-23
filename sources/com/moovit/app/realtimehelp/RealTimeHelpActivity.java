package com.moovit.app.realtimehelp;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p977zz.C20941h;

public class RealTimeHelpActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f39173U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.real_time_help_activity);
        TextView textView = (TextView) findViewById(R.id.real_time_title);
        Context context = textView.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(R.string.station_view_realtime_explanation_title_green);
        spannableStringBuilder.append(getString(R.string.station_view_realtime_explanation_title_color, new Object[]{string}));
        int indexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorLive, context)), indexOf, string.length() + indexOf, 33);
        textView.setText(spannableStringBuilder);
        findViewById(R.id.action).setOnClickListener(new C4051q(this, 23));
    }
}
