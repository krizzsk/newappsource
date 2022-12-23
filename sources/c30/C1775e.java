package c30;

import android.content.Context;
import com.moovit.network.model.ServerId;
import f00.C16918f;
import f00.C16919g;
import p898wr.C20399a;
import t00.C19622a;

/* renamed from: c30.e */
public final class C1775e extends C19622a {
    public C1775e(C20399a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public static C16918f<String> m5081d(Context context, ServerId serverId) {
        return new C16918f<>(context.getSharedPreferences("user_metro_language", 0), new C16919g.C16928i(serverId.mo19751c(), (String) null));
    }
}
