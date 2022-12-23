package n30;

import ce0.C21100e;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionImageAdditionalInfo;
import java.nio.ByteBuffer;
import n30.C5847a;
import t30.C6559a;

/* renamed from: n30.b */
public final class C5849b implements C5847a {

    /* renamed from: a */
    public final ByteBuffer f18837a;

    public C5849b(ByteBuffer byteBuffer) {
        C21100e.m49373x(byteBuffer, "data");
        this.f18837a = byteBuffer;
    }

    /* renamed from: a */
    public final MVMicroMobilityActionAdditionalInfo mo21719a(C5847a.C5848a aVar) {
        ((C6559a) aVar).getClass();
        ByteBuffer byteBuffer = this.f18837a;
        MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = new MVMicroMobilityActionImageAdditionalInfo();
        mVMicroMobilityActionImageAdditionalInfo.data = byteBuffer;
        MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = new MVMicroMobilityActionAdditionalInfo();
        mVMicroMobilityActionAdditionalInfo.setField_ = MVMicroMobilityActionAdditionalInfo._Fields.IMAGE;
        mVMicroMobilityActionAdditionalInfo.value_ = mVMicroMobilityActionImageAdditionalInfo;
        return mVMicroMobilityActionAdditionalInfo;
    }
}
