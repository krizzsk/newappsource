package p401bz;

import com.moovit.app.datacollection.ForegroundWifiScanner;
import com.moovit.aws.kinesis.KinesisStream;
import com.tranzmate.moovit.protocol.crowd.MVCrowdData;

/* renamed from: bz.b */
public abstract class C13708b extends C13714h<MVCrowdData> {
    public C13708b(ForegroundWifiScanner foregroundWifiScanner) {
        super(foregroundWifiScanner);
    }

    /* renamed from: g */
    public final KinesisStream mo40578g() {
        return KinesisStream.SENSORS;
    }
}
