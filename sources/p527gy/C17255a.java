package p527gy;

import android.content.Context;
import com.moovit.carpool.CarpoolCompany;
import com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: gy.a */
public final class C17255a extends C13712f {

    /* renamed from: c */
    public final CarpoolCompany f44598c;

    public C17255a(Context context, CarpoolCompany carpoolCompany) {
        super(context);
        this.f44598c = carpoolCompany;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        CarpoolCompany carpoolCompany = this.f44598c;
        MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
        String str = carpoolCompany.f40868b;
        if (str != null) {
            mVCarPoolWorkDetails.workName = str;
        }
        String str2 = carpoolCompany.f40869c;
        if (str2 != null) {
            mVCarPoolWorkDetails.workEmail = str2;
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.CAR_POOL_PASSENGERS_WORK_DETAILS;
        mVServerMessage.value_ = mVCarPoolWorkDetails;
        return mVServerMessage;
    }
}
