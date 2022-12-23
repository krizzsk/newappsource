package p401bz;

import android.content.Context;
import com.moovit.aws.kinesis.KinesisStream;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;

/* renamed from: bz.f */
public abstract class C13712f extends C13714h<MVServerMessage> {
    public C13712f(Context context) {
        super(context);
    }

    /* renamed from: g */
    public final KinesisStream mo40578g() {
        return KinesisStream.MESSAGE;
    }
}
