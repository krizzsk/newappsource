package f10;

import android.content.Context;
import ce0.C21100e;
import com.braze.Braze;
import com.moovit.appdata.UserContextLoader;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.users.MVAppId;
import com.tranzmate.moovit.protocol.users.MVUpdatePushToken;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p528gz.C17269d;
import p824tp.C19731i;
import p977zz.C20975x0;

/* renamed from: f10.h */
public final class C16937h {

    /* renamed from: f10.h$a */
    public static class C16938a extends C13712f {

        /* renamed from: c */
        public final String f43957c;

        public C16938a(Context context, String str) {
            super(context);
            C21100e.m49373x(str, "regToken");
            this.f43957c = str;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            MVUpdatePushToken mVUpdatePushToken = new MVUpdatePushToken(this.f43957c, MVAppId.findByValue(C19731i.m47197a(this.f33791b).f50171a.f50158i));
            MVServerMessage mVServerMessage = new MVServerMessage();
            mVServerMessage.setField_ = MVServerMessage._Fields.PUSH_TOKEN;
            mVServerMessage.value_ = mVUpdatePushToken;
            return mVServerMessage;
        }
    }

    /* renamed from: a */
    public static void m42772a(Context context, String str) {
        if (!str.equals(C16935f.m42759b(context)) && UserContextLoader.m40004l(context)) {
            C19731i.m47197a(context).f50172b.mo42913b(new C16938a(context, str), true);
            C16935f.m42763f(context, false);
            C16935f.m42762e(context, str);
        }
        C17269d a = C17269d.m43283a();
        synchronized (a) {
            if (a.f44638b) {
                Braze instance = Braze.getInstance(a.f44637a);
                if (!C20975x0.m49118e(instance.getAppboyPushMessageRegistrationId(), str)) {
                    instance.registerAppboyPushMessages(str);
                }
            }
        }
    }
}
