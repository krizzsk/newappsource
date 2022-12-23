package p783rw;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.answer.SurveyEndReason;
import com.moovit.app.surveys.answer.SurveyQuestionAnswer;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.data.remote.RemoteSurvey;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import com.tranzmate.R;
import java.util.ArrayList;
import p543hq.C17474b;
import p619kw.C18153a;
import p783rw.C19373e;

/* renamed from: rw.c */
public class C19371c extends C15676b<MoovitActivity> implements C19373e.C19374a {

    /* renamed from: l */
    public static final String f49287l = C19371c.class.getName();

    /* renamed from: h */
    public View f49288h;

    /* renamed from: i */
    public RemoteSurvey f49289i;

    /* renamed from: j */
    public SurveyQuestionTreeNode f49290j;

    /* renamed from: k */
    public ArrayList<SurveyQuestionAnswer> f49291k;

    public C19371c() {
        super(MoovitActivity.class);
        setStyle(3, 2131952799);
    }

    /* renamed from: L0 */
    public final void mo51777L0(SurveyQuestionTreeNode surveyQuestionTreeNode, SurveyAnswerTreeNode surveyAnswerTreeNode) {
        this.f49291k.add(new SurveyQuestionAnswer(surveyQuestionTreeNode.f39875b, surveyQuestionTreeNode.f39876c, surveyAnswerTreeNode.f39869b, surveyAnswerTreeNode.f39870c));
        SurveyQuestionTreeNode surveyQuestionTreeNode2 = surveyAnswerTreeNode.f39873f;
        if (surveyQuestionTreeNode2 != null) {
            mo51778S1(surveyQuestionTreeNode2);
            return;
        }
        mo51780T1(SurveyEndReason.FINISHED);
        this.f49288h.setClickable(false);
        this.f49288h.setVisibility(4);
        new C19369a().show(getChildFragmentManager(), C19369a.f49283i);
    }

    /* renamed from: S1 */
    public final void mo51778S1(SurveyQuestionTreeNode surveyQuestionTreeNode) {
        this.f49290j = surveyQuestionTreeNode;
        C19373e eVar = new C19373e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SURVEY_QUESTION_TREE_NODE_EXTRA", surveyQuestionTreeNode);
        eVar.setArguments(bundle);
        eVar.show(getChildFragmentManager(), C19373e.f49295k);
    }

    /* renamed from: T0 */
    public final void mo51779T0() {
        mo51780T1(SurveyEndReason.CANCELLED);
        if (this.f49291k.size() > 0) {
            this.f49288h.setClickable(false);
            this.f49288h.setVisibility(4);
            new C19369a().show(getChildFragmentManager(), C19369a.f49283i);
            return;
        }
        dismissAllowingStateLoss();
    }

    /* renamed from: T1 */
    public final void mo51780T1(SurveyEndReason surveyEndReason) {
        A a = this.f40792c;
        if (a != null && this.f49290j != null) {
            this.f49290j = null;
            SurveyManager.m39375d(a).mo45976g(new C18153a(this.f49289i.f39852c, new SurveyQuestionnaireAnswer(this.f49289i.f39851b, System.currentTimeMillis(), surveyEndReason), this.f49291k));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f49290j == null) {
            dismissAllowingStateLoss();
        } else {
            mo22564R1(new C17474b(AnalyticsEventKey.SURVEY_SHOWN));
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList<SurveyQuestionAnswer> arrayList;
        SurveyQuestionTreeNode surveyQuestionTreeNode;
        super.onCreate(bundle);
        this.f49289i = (RemoteSurvey) mo46752K1().getParcelable("survey");
        if (bundle != null) {
            arrayList = bundle.getParcelableArrayList("surveyAnswers");
        } else {
            arrayList = new ArrayList<>();
        }
        this.f49291k = arrayList;
        if (bundle != null) {
            surveyQuestionTreeNode = (SurveyQuestionTreeNode) bundle.getParcelable("currentSurveyQuestionTreeNode");
        } else {
            surveyQuestionTreeNode = this.f49289i.f39867f;
        }
        this.f49290j = surveyQuestionTreeNode;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remote_survey_dialog_container, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.close_survey);
        this.f49288h = findViewById;
        findViewById.setOnClickListener(new C19370b(this, 0));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener) activity).onDismiss(dialogInterface);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("surveyAnswers", this.f49291k);
        bundle.putParcelable("currentSurveyQuestionTreeNode", this.f49290j);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SurveyQuestionTreeNode surveyQuestionTreeNode = this.f49290j;
        if (surveyQuestionTreeNode != null) {
            mo51778S1(surveyQuestionTreeNode);
        }
    }
}
