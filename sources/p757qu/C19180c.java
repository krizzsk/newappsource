package p757qu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.tranzmate.R;
import p039c7.C1800c;
import p297w5.C6994a;
import p543hq.C17474b;

/* renamed from: qu.c */
public class C19180c extends C15676b<MotStationExitActivationActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f48766i = 0;

    /* renamed from: h */
    public CheckBox f48767h;

    public C19180c() {
        super(MotStationExitActivationActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_exit_station_verification_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_exit_verification_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.dont_show_again);
        this.f48767h = checkBox;
        checkBox.setOnCheckedChangeListener(new C19179b(this));
        view.findViewById(R.id.primary_button).setOnClickListener(new C1800c(this, 17));
        view.findViewById(R.id.secondary_button).setOnClickListener(new C6994a(this, 18));
    }
}
