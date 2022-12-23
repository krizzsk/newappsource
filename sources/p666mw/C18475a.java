package p666mw;

import android.util.SparseArray;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import com.moovit.commons.request.BadResponseException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.surveys.MVAnswerNode;
import com.tranzmate.moovit.protocol.surveys.MVQuestionNode;
import java.util.ArrayList;
import java.util.List;
import p549hw.C17507e;

/* renamed from: mw.a */
public final class C18475a {

    /* renamed from: a */
    public final List<MVQuestionNode> f47076a;

    /* renamed from: b */
    public final SparseArray<MVQuestionNode> f47077b;

    /* renamed from: c */
    public final SparseArray<SurveyQuestionTreeNode> f47078c;

    public C18475a(List<MVQuestionNode> list) {
        C21100e.m49373x(list, "mvQuestionNodes");
        this.f47076a = list;
        this.f47077b = new SparseArray<>(list.size());
        for (MVQuestionNode next : list) {
            this.f47077b.put(next.nodeId, next);
        }
        this.f47078c = new SparseArray<>(this.f47077b.size());
    }

    /* renamed from: a */
    public final SurveyQuestionTreeNode mo50900a(MVQuestionNode mVQuestionNode) throws BadResponseException {
        int i;
        List<MVAnswerNode> list = mVQuestionNode.answers;
        int i2 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        if (i < 0 || i > 3) {
            throw new BadResponseException(C16759e.m42349e("Invalid answer size: ", i));
        }
        SurveyQuestionTreeNode surveyQuestionTreeNode = this.f47078c.get(mVQuestionNode.nodeId);
        if (surveyQuestionTreeNode != null) {
            return surveyQuestionTreeNode;
        }
        ServerId serverId = new ServerId(mVQuestionNode.nodeId);
        ServerId serverId2 = new ServerId(mVQuestionNode.questionId);
        String str = mVQuestionNode.label;
        List<MVAnswerNode> list2 = mVQuestionNode.answers;
        if (list2 != null) {
            i2 = list2.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        SurveyQuestionTreeNode surveyQuestionTreeNode2 = new SurveyQuestionTreeNode(serverId, serverId2, str, arrayList);
        this.f47078c.put(mVQuestionNode.nodeId, surveyQuestionTreeNode2);
        C13720d.m34276f(mVQuestionNode.answers, (C13722f) null, new C17507e(this, 1), arrayList);
        return surveyQuestionTreeNode2;
    }
}
