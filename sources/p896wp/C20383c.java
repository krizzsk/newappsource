package p896wp;

import android.content.Context;
import ce0.C21100e;
import com.moovit.ads.AdvertisingInfo;
import com.tranzmate.moovit.protocol.Reports4_0.MVUnLikeReportRequest;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: wp.c */
public final class C20383c extends C13712f {

    /* renamed from: c */
    public final /* synthetic */ int f51684c = 0;

    /* renamed from: d */
    public Object f51685d;

    public C20383c(Context context, String str) {
        super(context);
        C21100e.m49373x(str, "reportId");
        this.f51685d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ TBase mo21426a() {
        switch (this.f51684c) {
            case 0:
                return mo52608e();
            default:
                return mo52608e();
        }
    }

    /* renamed from: e */
    public final MVServerMessage mo52608e() {
        switch (this.f51684c) {
            case 0:
                AdvertisingInfo advertisingInfo = (AdvertisingInfo) this.f51685d;
                MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest(advertisingInfo.f37363b, advertisingInfo.f37364c, advertisingInfo.f37366e);
                MVServerMessage mVServerMessage = new MVServerMessage();
                mVServerMessage.setField_ = MVServerMessage._Fields.SET_ADVERTISING_INFO_REQUEST;
                mVServerMessage.value_ = mVSetAdvertisingInfoRequest;
                return mVServerMessage;
            default:
                MVUnLikeReportRequest mVUnLikeReportRequest = new MVUnLikeReportRequest();
                mVUnLikeReportRequest.reportId = (String) this.f51685d;
                MVServerMessage mVServerMessage2 = new MVServerMessage();
                mVServerMessage2.setField_ = MVServerMessage._Fields.USER_REPORT_UNLIKE_REQUEST;
                mVServerMessage2.value_ = mVUnLikeReportRequest;
                return mVServerMessage2;
        }
    }

    public C20383c(Context context, AdvertisingInfo advertisingInfo) {
        super(context);
        C21100e.m49373x(advertisingInfo, "advertisingInfo");
        this.f51685d = advertisingInfo;
    }
}
