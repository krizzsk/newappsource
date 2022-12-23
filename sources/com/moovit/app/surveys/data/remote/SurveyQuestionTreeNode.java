package com.moovit.app.surveys.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyQuestionTreeNode implements Parcelable {
    public static final Parcelable.Creator<SurveyQuestionTreeNode> CREATOR = new C15400a();

    /* renamed from: f */
    public static C15401b f39874f = new C15401b(SurveyQuestionTreeNode.class);

    /* renamed from: b */
    public final ServerId f39875b;

    /* renamed from: c */
    public final ServerId f39876c;

    /* renamed from: d */
    public final String f39877d;

    /* renamed from: e */
    public final List<SurveyAnswerTreeNode> f39878e;

    /* renamed from: com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode$a */
    public class C15400a implements Parcelable.Creator<SurveyQuestionTreeNode> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyQuestionTreeNode) C19612n.m46981v(parcel, SurveyQuestionTreeNode.f39874f);
        }

        public final Object[] newArray(int i) {
            return new SurveyQuestionTreeNode[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode$b */
    public class C15401b extends C19619s<SurveyQuestionTreeNode> {
        public C15401b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new SurveyQuestionTreeNode(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51959g(SurveyAnswerTreeNode.f39868g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyQuestionTreeNode surveyQuestionTreeNode = (SurveyQuestionTreeNode) obj;
            ServerId serverId = surveyQuestionTreeNode.f39875b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(surveyQuestionTreeNode.f39876c.f15142b);
            qVar.mo51954p(surveyQuestionTreeNode.f39877d);
            qVar.mo51965h(surveyQuestionTreeNode.f39878e, SurveyAnswerTreeNode.f39868g);
        }
    }

    public SurveyQuestionTreeNode(ServerId serverId, ServerId serverId2, String str, ArrayList arrayList) {
        this.f39875b = serverId;
        this.f39876c = serverId2;
        C21100e.m49373x(str, "questionText");
        this.f39877d = str;
        C21100e.m49373x(arrayList, "answers");
        this.f39878e = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SurveyQuestionTreeNode)) {
            return false;
        }
        return this.f39875b.equals(((SurveyQuestionTreeNode) obj).f39875b);
    }

    public final int hashCode() {
        return this.f39875b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39874f);
    }
}
