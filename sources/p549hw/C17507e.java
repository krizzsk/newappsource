package p549hw;

import c00.C13721e;
import com.moovit.app.subscription.model.PurchaseDetails;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttleSchedule;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData;
import com.tranzmate.moovit.protocol.surveys.MVAnswerNode;
import com.tranzmate.moovit.protocol.surveys.MVQuestionNode;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip;
import f00.C16919g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p435de.C16596f;
import p666mw.C18475a;
import p715ox.C18859i;
import p80.C12991b;
import q80.C13036y;

/* renamed from: hw.e */
public final /* synthetic */ class C17507e implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f45075b;

    /* renamed from: c */
    public final /* synthetic */ Object f45076c;

    public /* synthetic */ C17507e(Object obj, int i) {
        this.f45075b = i;
        this.f45076c = obj;
    }

    public final Object convert(Object obj) {
        SurveyQuestionTreeNode surveyQuestionTreeNode;
        long j;
        switch (this.f45075b) {
            case 0:
                String str = ((PurchaseDetails) this.f45076c).f39786d;
                MVGooglePaymentData mVGooglePaymentData = new MVGooglePaymentData();
                mVGooglePaymentData.sku = (String) obj;
                mVGooglePaymentData.purchaseToken = str;
                return mVGooglePaymentData;
            case 1:
                C18475a aVar = (C18475a) this.f45076c;
                MVAnswerNode mVAnswerNode = (MVAnswerNode) obj;
                aVar.getClass();
                ServerId serverId = new ServerId(mVAnswerNode.answerId);
                String str2 = mVAnswerNode.value;
                String str3 = mVAnswerNode.label;
                Image a = C16028g.m40823a(Integer.valueOf(mVAnswerNode.imageId));
                if (mVAnswerNode.mo31855i()) {
                    int i = mVAnswerNode.nextQuestionNodeId;
                    MVQuestionNode mVQuestionNode = aVar.f47077b.get(i);
                    if (mVQuestionNode != null) {
                        surveyQuestionTreeNode = aVar.mo50900a(mVQuestionNode);
                    } else {
                        C16596f a2 = C16596f.m42113a();
                        a2.mo49363b("Node Id: " + i);
                        throw new BadResponseException("Missing survey question node!");
                    }
                } else {
                    surveyQuestionTreeNode = null;
                }
                return new SurveyAnswerTreeNode(serverId, str2, str3, a, surveyQuestionTreeNode);
            case 2:
                MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) obj;
                String str4 = mVTodShuttleTrip.tripId;
                TodShuttlePattern todShuttlePattern = ((C18859i) this.f45076c).f48011a.get(mVTodShuttleTrip.patternId);
                int i2 = 0;
                if (todShuttlePattern != null) {
                    long j2 = mVTodShuttleTrip.departure;
                    List<Short> list = mVTodShuttleTrip.arrivalsIntervals;
                    int size = todShuttlePattern.f40420d.size();
                    int size2 = list.size();
                    if (size2 == size - 1) {
                        long[] jArr = new long[size];
                        jArr[0] = j2;
                        while (i2 < size2) {
                            int i3 = i2 + 1;
                            jArr[i3] = TimeUnit.SECONDS.toMillis((long) list.get(i2).shortValue()) + jArr[i2];
                            i2 = i3;
                        }
                        TodShuttleSchedule todShuttleSchedule = new TodShuttleSchedule(jArr);
                        if (mVTodShuttleTrip.mo34030i()) {
                            j = mVTodShuttleTrip.lockTime;
                        } else {
                            j = -1;
                        }
                        return new TodShuttleTrip(str4, todShuttlePattern, todShuttleSchedule, j, mVTodShuttleTrip.inaccurateTimes);
                    }
                    throw new BadResponseException(String.format("number of arrivalsIntervals(%1$s) does not match number of stops in the pattern(%2$s) - 1", new Object[]{Integer.valueOf(size2), Integer.valueOf(size)}));
                }
                throw new BadResponseException(String.format("Pattern(%1$s) not found in meta data while decoding shuttle trip(%2$S)", new Object[]{mVTodShuttleTrip.patternId, str4}));
            case 3:
                C16919g.C16922c cVar = (C16919g.C16922c) this.f45076c;
                cVar.getClass();
                return cVar.f43938c.mo51916a(Short.parseShort((String) obj));
            default:
                return C13036y.m32954f((C12991b) this.f45076c, (MVTicketingFare) obj);
        }
    }
}
