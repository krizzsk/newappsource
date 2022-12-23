package p738pw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0194b;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.app.surveys.view.abs.LocalSurveyType;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p039c7.C1800c;
import p824tp.C19728f;

/* renamed from: pw.d */
public class C19036d extends C15676b<MoovitActivity> {

    /* renamed from: m */
    public static final String f48405m = C19036d.class.getName();

    /* renamed from: h */
    public final C0194b f48406h = new C0194b(this, 9);

    /* renamed from: i */
    public boolean f48407i;

    /* renamed from: j */
    public LocalSurveyType f48408j;

    /* renamed from: k */
    public View f48409k;

    /* renamed from: l */
    public C19728f f48410l;

    public C19036d() {
        super(MoovitActivity.class);
        setStyle(0, 2131952804);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: M1 */
    public final void mo46754M1() {
        super.mo46754M1();
        this.f48410l = (C19728f) mo46750H1("METRO_CONTEXT");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f48407i = arguments.getBoolean("requestFeedback");
        this.f48408j = (LocalSurveyType) arguments.getParcelable("surveyType");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.survey_complete_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        if (!this.f48407i) {
            this.f48409k.postDelayed(this.f48406h, 2000);
        }
    }

    public final void onStop() {
        this.f48409k.removeCallbacks(this.f48406h);
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        this.f48409k = view.findViewById(R.id.main_content);
        TextView textView = (TextView) view.findViewById(R.id.survey_complete_title);
        if (this.f48407i) {
            i = R.string.user_survey_in_app_tell_us_more;
        } else {
            i = R.string.report_thank_you;
        }
        textView.setText(i);
        View findViewById = view.findViewById(R.id.tell_us_more);
        findViewById.setOnClickListener(new C4052r(this, 22));
        View findViewById2 = view.findViewById(R.id.not_now);
        findViewById2.setOnClickListener(new C1800c(this, 24));
        if (this.f48407i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        UiUtils.m40238F(i2, findViewById, findViewById2);
    }
}
