package p401bz;

import android.content.Context;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.kinesis.MVMetroRevisionActivated;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;

/* renamed from: bz.e */
public final class C13711e extends C13712f {

    /* renamed from: c */
    public final ServerId f33786c;

    /* renamed from: d */
    public final long f33787d;

    /* renamed from: e */
    public final long f33788e;

    public C13711e(Context context, ServerId serverId, long j, long j2) {
        super(context);
        this.f33786c = serverId;
        this.f33787d = j;
        this.f33788e = j2;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        long j = this.f33787d;
        long j2 = this.f33788e;
        int i = this.f33786c.f15142b;
        MVMetroRevisionActivated mVMetroRevisionActivated = new MVMetroRevisionActivated();
        mVMetroRevisionActivated.revisionId = j;
        mVMetroRevisionActivated.mo27778j();
        mVMetroRevisionActivated.timestamp = j2;
        mVMetroRevisionActivated.mo27779k();
        mVMetroRevisionActivated.metroAreadId = i;
        mVMetroRevisionActivated.mo27777i();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.METRO_REVISION_UPDATED;
        mVServerMessage.value_ = mVMetroRevisionActivated;
        return mVServerMessage;
    }
}
