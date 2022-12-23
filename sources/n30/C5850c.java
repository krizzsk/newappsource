package n30;

import ce0.C21100e;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionQrCodeAdditionalInfo;
import n30.C5847a;
import t30.C6559a;

/* renamed from: n30.c */
public final class C5850c implements C5847a {

    /* renamed from: a */
    public final String f18838a;

    public C5850c(String str) {
        C21100e.m49373x(str, "qrCode");
        this.f18838a = str;
    }

    /* renamed from: a */
    public final MVMicroMobilityActionAdditionalInfo mo21719a(C5847a.C5848a aVar) {
        ((C6559a) aVar).getClass();
        String str = this.f18838a;
        MVMicroMobilityActionQrCodeAdditionalInfo mVMicroMobilityActionQrCodeAdditionalInfo = new MVMicroMobilityActionQrCodeAdditionalInfo();
        mVMicroMobilityActionQrCodeAdditionalInfo.qrCode = str;
        MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = new MVMicroMobilityActionAdditionalInfo();
        mVMicroMobilityActionAdditionalInfo.setField_ = MVMicroMobilityActionAdditionalInfo._Fields.QR_CODE;
        mVMicroMobilityActionAdditionalInfo.value_ = mVMicroMobilityActionQrCodeAdditionalInfo;
        return mVMicroMobilityActionAdditionalInfo;
    }
}
