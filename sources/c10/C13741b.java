package c10;

import android.content.Context;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.kinesis.MVDeepLinkInstallation;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: c10.b */
public final class C13741b extends C13712f {

    /* renamed from: c */
    public final String f33816c;

    /* renamed from: d */
    public final long f33817d;

    public C13741b(Context context, String str, long j) {
        super(context);
        C21100e.m49373x(str, "dynamicLink");
        this.f33816c = str;
        this.f33817d = j;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        String str = this.f33816c;
        long j = this.f33817d;
        MVDeepLinkInstallation mVDeepLinkInstallation = new MVDeepLinkInstallation();
        mVDeepLinkInstallation.deepLink = str;
        mVDeepLinkInstallation.timestamp = j;
        mVDeepLinkInstallation.mo27729h();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.DEEP_LINK_INSTALLATION;
        mVServerMessage.value_ = mVDeepLinkInstallation;
        return mVServerMessage;
    }
}
