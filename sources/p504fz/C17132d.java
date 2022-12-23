package p504fz;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p358af.C13437d;
import p496fr.C17064a;
import p543hq.C17474b;
import p583jk.C17884p;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;

/* renamed from: fz.d */
public class C17132d extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f44361h = 0;

    public C17132d() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.bicycle_station_dialog, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_bikes");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        Bundle K1 = mo46752K1();
        BicycleStationMetadata bicycleStationMetadata = (BicycleStationMetadata) K1.getParcelable("metadata");
        if (bicycleStationMetadata != null) {
            int i2 = 0;
            boolean z = K1.getBoolean("showNavigationButton", false);
            boolean z2 = K1.getBoolean("showMapSettingHint", false);
            if (bicycleStationMetadata.f42478g != null) {
                ImageView imageView = (ImageView) view.findViewById(C19740r.provider_image);
                Image image = bicycleStationMetadata.f42478g;
                C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            }
            TextView textView = (TextView) view.findViewById(C19740r.station_update_time);
            if (bicycleStationMetadata.f42480i) {
                TextView textView2 = (TextView) view.findViewById(C19740r.free_bicycles);
                String str3 = "--";
                if (bicycleStationMetadata.f42473b >= 0) {
                    str = C13437d.m33707l(new StringBuilder(), bicycleStationMetadata.f42473b, "");
                } else {
                    str = str3;
                }
                textView2.setText(str);
                TextView textView3 = (TextView) view.findViewById(C19740r.free_docks);
                if (bicycleStationMetadata.f42474c >= 0) {
                    str3 = C13437d.m33707l(new StringBuilder(), bicycleStationMetadata.f42474c, "");
                }
                textView3.setText(str3);
                if (DateFormat.is24HourFormat(this.f40792c)) {
                    str2 = "HH:mm";
                } else {
                    str2 = "hh:mm";
                }
                String format = new SimpleDateFormat(str2, Locale.getDefault()).format(new Date(bicycleStationMetadata.f42476e));
                textView.setText(String.format(getString(C19746x.bike_station_time_label), new Object[]{format}));
            } else {
                view.findViewById(C19740r.bicycles_section).setVisibility(8);
                view.findViewById(C19740r.bicycles_section_error_message).setVisibility(0);
                textView.setVisibility(8);
            }
            ((TextView) view.findViewById(C19740r.provider_name)).setText(bicycleStationMetadata.f42477f);
            ((TextView) view.findViewById(C19740r.station_name)).setText(bicycleStationMetadata.f42475d.mo24313f());
            UiUtils.m40234B((TextView) view.findViewById(C19740r.driving_rate), bicycleStationMetadata.f42479h);
            Button button = (Button) view.findViewById(C19740r.btn_directions);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            button.setVisibility(i);
            button.setOnClickListener(new C17064a(9, this, bicycleStationMetadata));
            View findViewById = view.findViewById(C19740r.map_settings_hint);
            if (!z2) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
            return;
        }
        throw new ApplicationBugException("Did you use BicycleStationDialog.newInstance(...)?");
    }
}
