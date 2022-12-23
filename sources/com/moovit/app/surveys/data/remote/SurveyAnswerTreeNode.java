package com.moovit.app.surveys.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyAnswerTreeNode implements Parcelable {
    public static final Parcelable.Creator<SurveyAnswerTreeNode> CREATOR = new C15398a();

    /* renamed from: g */
    public static C15399b f39868g = new C15399b(SurveyAnswerTreeNode.class);

    /* renamed from: b */
    public final ServerId f39869b;

    /* renamed from: c */
    public final String f39870c;

    /* renamed from: d */
    public final String f39871d;

    /* renamed from: e */
    public final Image f39872e;

    /* renamed from: f */
    public final SurveyQuestionTreeNode f39873f;

    /* renamed from: com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode$a */
    public class C15398a implements Parcelable.Creator<SurveyAnswerTreeNode> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyAnswerTreeNode) C19612n.m46981v(parcel, SurveyAnswerTreeNode.f39868g);
        }

        public final Object[] newArray(int i) {
            return new SurveyAnswerTreeNode[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode$b */
    public class C15399b extends C19619s<SurveyAnswerTreeNode> {
        public C15399b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new SurveyAnswerTreeNode(new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), (SurveyQuestionTreeNode) pVar.mo51962q(SurveyQuestionTreeNode.f39874f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyAnswerTreeNode surveyAnswerTreeNode = (SurveyAnswerTreeNode) obj;
            ServerId serverId = surveyAnswerTreeNode.f39869b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(surveyAnswerTreeNode.f39870c);
            qVar.mo51954p(surveyAnswerTreeNode.f39871d);
            C16019d.m40803a().f41718d.write(surveyAnswerTreeNode.f39872e, qVar);
            qVar.mo51967q(surveyAnswerTreeNode.f39873f, SurveyQuestionTreeNode.f39874f);
        }
    }

    public SurveyAnswerTreeNode(ServerId serverId, String str, String str2, Image image, SurveyQuestionTreeNode surveyQuestionTreeNode) {
        this.f39869b = serverId;
        C21100e.m49373x(str, "answerValue");
        this.f39870c = str;
        C21100e.m49373x(str2, "answerText");
        this.f39871d = str2;
        C21100e.m49373x(image, "answerIcon");
        this.f39872e = image;
        this.f39873f = surveyQuestionTreeNode;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39868g);
    }
}
