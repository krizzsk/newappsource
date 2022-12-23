package p929xy;

import android.content.Context;
import c70.C13752e;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.HashSet;
import p646lz.C18299a;
import p646lz.C18305c;
import p824tp.C19722a0;

/* renamed from: xy.g */
public abstract class C20664g<T> extends C18305c<T> {
    /* renamed from: i */
    public static C13752e m48584i(Context context, C18299a aVar) {
        return new C13752e(context, (C19722a0) aVar.mo50690c("USER_CONTEXT"), (AnalyticsFlowKey) null);
    }

    /* renamed from: b */
    public HashSet mo20294b(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add("ENVIRONMENT_VALIDATOR");
        hashSet.add("UPGRADER");
        hashSet.add("USER_CONTEXT");
        return hashSet;
    }

    /* renamed from: e */
    public final Object mo50710e(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return mo23772j(aVar, m48584i(context, aVar));
    }

    /* renamed from: j */
    public Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return null;
    }
}
