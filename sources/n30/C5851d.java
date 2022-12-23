package n30;

import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRatingAdditionalInfo;
import n30.C5847a;
import t30.C6559a;

/* renamed from: n30.d */
public final class C5851d implements C5847a {

    /* renamed from: a */
    public final Integer f18839a;

    public C5851d(Integer num) {
        this.f18839a = num;
    }

    /* renamed from: a */
    public final MVMicroMobilityActionAdditionalInfo mo21719a(C5847a.C5848a aVar) {
        ((C6559a) aVar).getClass();
        MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = new MVMicroMobilityActionRatingAdditionalInfo();
        Integer num = this.f18839a;
        if (num != null) {
            mVMicroMobilityActionRatingAdditionalInfo.rating = num.intValue();
            mVMicroMobilityActionRatingAdditionalInfo.mo28616g();
        }
        MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = new MVMicroMobilityActionAdditionalInfo();
        mVMicroMobilityActionAdditionalInfo.setField_ = MVMicroMobilityActionAdditionalInfo._Fields.RATING;
        mVMicroMobilityActionAdditionalInfo.value_ = mVMicroMobilityActionRatingAdditionalInfo;
        return mVMicroMobilityActionAdditionalInfo;
    }
}
