package p759qw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p297w5.C6994a;
import p471eq.C16850a;

/* renamed from: qw.a */
public abstract class C19195a extends C19196b {

    /* renamed from: j */
    public static final /* synthetic */ int f48800j = 0;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131952803);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.satisfaction_survey_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UiUtils.m40234B((TextView) view.findViewById(R.id.question), mo51493U1());
        Button button = (Button) view.findViewById(R.id.alternative_answer);
        UiUtils.m40234B(button, mo51492T1());
        button.setOnClickListener(new C6994a(this, 23));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.satisfaction_bar);
        int i = 1;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ("face".equals(childAt.getTag())) {
                ImageView imageView = (ImageView) childAt;
                imageView.setTag(Integer.valueOf(i));
                imageView.setImageLevel(i);
                imageView.setOnClickListener(new C16850a(this, 22));
                i++;
            }
        }
    }
}
