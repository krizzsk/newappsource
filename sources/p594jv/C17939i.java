package p594jv;

import android.content.Context;
import ce0.C21100e;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.tranzmate.moovit.protocol.Reports4_0.MVLikeReportRequest;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.ticketingV2.MVSuggestionRemoval;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingExternalPurchaseReport;
import com.usebutton.sdk.internal.api.AppActionRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p824tp.C19731i;

/* renamed from: jv.i */
public final class C17939i extends C13712f {

    /* renamed from: c */
    public final /* synthetic */ int f46003c = 1;

    /* renamed from: d */
    public Object f46004d;

    public C17939i(Context context, String str) {
        super(context);
        C21100e.m49373x(str, "reportId");
        this.f46004d = str;
    }

    /* renamed from: k */
    public static void m44563k(Context context, SuggestedTicketFare suggestedTicketFare) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        C21100e.m49373x(suggestedTicketFare, "fare");
        C19731i.m47197a(applicationContext).f50172b.mo42913b(new C17939i(applicationContext, suggestedTicketFare), true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ TBase mo21426a() {
        switch (this.f46003c) {
            case 0:
                return mo50471e();
            default:
                return mo50471e();
        }
    }

    /* renamed from: e */
    public final MVServerMessage mo50471e() {
        switch (this.f46003c) {
            case 0:
                MVLikeReportRequest mVLikeReportRequest = new MVLikeReportRequest();
                mVLikeReportRequest.reportId = (String) this.f46004d;
                MVServerMessage mVServerMessage = new MVServerMessage();
                mVServerMessage.setField_ = MVServerMessage._Fields.USER_REPORT_LIKE_REQUEST;
                mVServerMessage.value_ = mVLikeReportRequest;
                return mVServerMessage;
            default:
                SuggestedTicketFare suggestedTicketFare = (SuggestedTicketFare) this.f46004d;
                int i = suggestedTicketFare.f23313b.f15142b;
                String str = suggestedTicketFare.f23315d;
                String str2 = suggestedTicketFare.f23317f.f23495b;
                int i2 = suggestedTicketFare.f23314c.f15142b;
                MVSuggestionRemoval mVSuggestionRemoval = new MVSuggestionRemoval();
                mVSuggestionRemoval.providerId = i;
                mVSuggestionRemoval.mo33012k();
                mVSuggestionRemoval.fareId = str;
                mVSuggestionRemoval.agencyKey = str2;
                mVSuggestionRemoval.metroId = i2;
                mVSuggestionRemoval.mo33011j();
                MVTicketingExternalPurchaseReport mVTicketingExternalPurchaseReport = new MVTicketingExternalPurchaseReport();
                mVTicketingExternalPurchaseReport.setField_ = MVTicketingExternalPurchaseReport._Fields.SUGGESTION_REMOVAL;
                mVTicketingExternalPurchaseReport.value_ = mVSuggestionRemoval;
                MVServerMessage mVServerMessage2 = new MVServerMessage();
                mVServerMessage2.setField_ = MVServerMessage._Fields.TICKETING_EXTERNAL_PURCHASE_REPORT;
                mVServerMessage2.value_ = mVTicketingExternalPurchaseReport;
                return mVServerMessage2;
        }
    }

    public C17939i(Context context, SuggestedTicketFare suggestedTicketFare) {
        super(context);
        C21100e.m49373x(suggestedTicketFare, "fare");
        this.f46004d = suggestedTicketFare;
    }
}
