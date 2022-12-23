package p401bz;

import android.content.Context;
import com.moovit.appdata.UserContextLoader;
import com.tranzmate.moovit.protocol.kinesis.MVClientConfigurationActivated;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import y90.C13272f;

/* renamed from: bz.a */
public final class C13707a extends C13712f {

    /* renamed from: c */
    public final long f33782c;

    /* renamed from: d */
    public final long f33783d;

    public C13707a(Context context, long j, long j2) {
        super(context);
        this.f33782c = j;
        this.f33783d = j2;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        int i;
        C13272f m = UserContextLoader.m40005m(this.f33791b);
        long j = this.f33782c;
        long j2 = this.f33783d;
        if (m != null) {
            i = m.f32927c.f15142b;
        } else {
            i = -1;
        }
        MVClientConfigurationActivated mVClientConfigurationActivated = new MVClientConfigurationActivated();
        mVClientConfigurationActivated.configurationTimestamp = j;
        mVClientConfigurationActivated.mo27674i();
        mVClientConfigurationActivated.timestamp = j2;
        mVClientConfigurationActivated.mo27676k();
        mVClientConfigurationActivated.metroId = i;
        mVClientConfigurationActivated.mo27675j();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.CLIENT_CONFIGURATION_ACTIVATED;
        mVServerMessage.value_ = mVClientConfigurationActivated;
        return mVServerMessage;
    }
}
