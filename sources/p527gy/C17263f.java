package p527gy;

import android.content.Context;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVUpdateUserInfo;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: gy.f */
public final class C17263f extends C13712f {

    /* renamed from: c */
    public String f44624c = null;

    /* renamed from: d */
    public String f44625d = null;

    /* renamed from: e */
    public ServerId f44626e;

    public C17263f(Context context, ServerId serverId) {
        super(context);
        this.f44626e = serverId;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        String str = this.f44624c;
        String str2 = this.f44625d;
        int i = this.f44626e.f15142b;
        MVUpdateUserInfo mVUpdateUserInfo = new MVUpdateUserInfo();
        mVUpdateUserInfo.email = str;
        mVUpdateUserInfo.nickname = str2;
        mVUpdateUserInfo.avatarId = i;
        mVUpdateUserInfo.mo35418i();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.UPDATE_USER_INFO;
        mVServerMessage.value_ = mVUpdateUserInfo;
        return mVServerMessage;
    }
}
