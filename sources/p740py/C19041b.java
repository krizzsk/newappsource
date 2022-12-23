package p740py;

import android.content.Context;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: py.b */
public final class C19041b extends C13712f {

    /* renamed from: c */
    public final Boolean f48428c;

    /* renamed from: d */
    public final Boolean f48429d;

    /* renamed from: e */
    public final Boolean f48430e;

    public C19041b(Context context, Boolean bool, Boolean bool2, Boolean bool3) {
        super(context);
        this.f48428c = bool;
        this.f48429d = bool2;
        this.f48430e = bool3;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = new MVSetGDPRPropertiesRequest();
        Boolean bool = this.f48428c;
        if (bool != null) {
            mVSetGDPRPropertiesRequest.agreedToTermsOfUse = bool.booleanValue();
            mVSetGDPRPropertiesRequest.mo35324i();
        }
        Boolean bool2 = this.f48429d;
        if (bool2 != null) {
            mVSetGDPRPropertiesRequest.canUseDataForPromotions = bool2.booleanValue();
            mVSetGDPRPropertiesRequest.mo35325j();
        }
        Boolean bool3 = this.f48430e;
        if (bool3 != null) {
            mVSetGDPRPropertiesRequest.canUseDataForResearch = bool3.booleanValue();
            mVSetGDPRPropertiesRequest.mo35326k();
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.SET_GDPRPROPERTIES_REQUEST;
        mVServerMessage.value_ = mVSetGDPRPropertiesRequest;
        return mVServerMessage;
    }
}
