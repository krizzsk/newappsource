package com.moovit.appdata;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.location.C16202a;
import com.moovit.maintenance.MaintenanceManager;
import com.moovit.user.LocaleInfo;
import java.io.IOException;
import java.util.HashSet;
import n20.C18516f;
import p389bl.C13641g;
import p401bz.C13709c;
import p584jl.C17885a;
import p646lz.C18299a;
import p824tp.C19722a0;
import p929xy.C20664g;
import p929xy.C20675n;
import y90.C13272f;

public abstract class UserContextLoader extends C20664g<C19722a0> {

    public enum FailureReason {
        LOCATION_PERMISSION_MISSING,
        LOCATION_NOT_DETECTED,
        UNSUPPORTED_METRO,
        NETWORK_ERROR,
        UNKNOWN
    }

    /* renamed from: l */
    public static boolean m40004l(Context context) {
        return context.getFileStreamPath("user.dat").exists();
    }

    /* renamed from: m */
    public static C13272f m40005m(Context context) {
        return (C13272f) C13641g.m34133v(context, "user.dat", C13272f.f32924f);
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.remove("USER_CONTEXT");
        if (C16202a.get(context).requiresGooglePlayServices()) {
            b.add("GOOGLE_PLAY_SERVICES");
        }
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        C13272f m = m40005m(context);
        if (m == null) {
            return null;
        }
        return new C19722a0(m);
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            C13272f k = mo46741k(eVar);
            if (k != null) {
                Context context = eVar.f33852a;
                C13641g.m34136y(context, "user.dat", k, C13272f.f32924f);
                C19722a0 a0Var = new C19722a0(k);
                mo46742n(context, a0Var);
                return a0Var;
            }
            throw new AppDataPartLoadFailedException(FailureReason.UNKNOWN, (String) null, (Throwable) null);
        } catch (IOException e) {
            throw new AppDataPartLoadFailedException(FailureReason.NETWORK_ERROR, (String) null, e);
        }
    }

    /* renamed from: k */
    public abstract C13272f mo46741k(C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException;

    /* renamed from: n */
    public void mo46742n(Context context, C19722a0 a0Var) {
        C20675n.f52236c.mo49545d(context.getSharedPreferences("user_locale", 0), LocaleInfo.m17919b(context));
        C13709c.m34225a(context, a0Var);
        C17885a.m44448l0(context, a0Var);
        MaintenanceManager.m41336b(context);
        C18516f.m45397d(context, a0Var);
    }
}
