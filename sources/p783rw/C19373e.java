package p783rw;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p250s9.C6489b;
import p501fw.C17102a;
import p583jk.C17884p;
import y10.C20690e;

/* renamed from: rw.e */
public class C19373e extends C15676b<MoovitActivity> {

    /* renamed from: k */
    public static final String f49295k = C19373e.class.getName();

    /* renamed from: h */
    public SurveyQuestionTreeNode f49296h;

    /* renamed from: i */
    public TextView f49297i;

    /* renamed from: j */
    public LinearLayout f49298j;

    /* renamed from: rw.e$a */
    public interface C19374a {
        /* renamed from: L0 */
        void mo51777L0(SurveyQuestionTreeNode surveyQuestionTreeNode, SurveyAnswerTreeNode surveyAnswerTreeNode);

        /* renamed from: T0 */
        void mo51779T0();
    }

    public C19373e() {
        super(MoovitActivity.class);
        setStyle(0, 2131952802);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo46753L1(C19374a.class, new C6489b(12));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f49296h = (SurveyQuestionTreeNode) arguments.getParcelable("SURVEY_QUESTION_TREE_NODE_EXTRA");
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setFlags(32, 32);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remote_survey_dialog_fragment, viewGroup, false);
        this.f49297i = (TextView) inflate.findViewById(R.id.survey_title);
        this.f49298j = (LinearLayout) inflate.findViewById(R.id.answers_container);
        SurveyQuestionTreeNode surveyQuestionTreeNode = this.f49296h;
        if (surveyQuestionTreeNode != null) {
            this.f49297i.setText(surveyQuestionTreeNode.f39877d);
            for (SurveyAnswerTreeNode next : surveyQuestionTreeNode.f39878e) {
                TextView textView = (TextView) layoutInflater.inflate(R.layout.single_survey_answer, this.f49298j, false);
                textView.setTag(next);
                textView.setText(next.f39871d);
                textView.setOnClickListener(new C17102a(this, 3));
                this.f49298j.addView(textView);
                C17884p.m44354Y(textView).mo51642v(next.f39872e).mo51628o0(next.f39872e).mo10848R(new C20690e(textView, UiUtils.Edge.TOP));
            }
        }
        return inflate;
    }
}
