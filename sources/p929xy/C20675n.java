package p929xy;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import c70.C13752e;
import com.appsflyer.ServerParameters;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.gcm.topic.GcmTopicManager;
import com.moovit.user.LocaleInfo;
import f00.C16919g;
import java.io.IOException;
import p646lz.C18299a;
import p824tp.C19722a0;
import p977zz.C20943i;
import p977zz.C20975x0;
import y90.C13269c;
import y90.C13272f;

/* renamed from: xy.n */
public final class C20675n extends C20664g<Boolean> {

    /* renamed from: c */
    public static final C20676a f52236c = new C20676a();

    /* renamed from: xy.n$a */
    public class C20676a extends C16919g<LocaleInfo> {
        public C20676a() {
            super("localeKnownToServer", null);
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString("language", (String) null);
            if (string == null) {
                return null;
            }
            return new LocaleInfo(string, sharedPreferences.getString(ServerParameters.COUNTRY, ""), sharedPreferences.getString("variant", ""));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            LocaleInfo localeInfo = (LocaleInfo) obj;
            editor.putString("language", localeInfo.f23835b);
            editor.putString(ServerParameters.COUNTRY, localeInfo.f23836c);
            editor.putString("variant", localeInfo.f23837d);
        }
    }

    /* renamed from: a */
    public final Object mo46174a(Context context, Configuration configuration, C18299a aVar) {
        return C20943i.m49050c(configuration);
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (C20975x0.m49118e(LocaleInfo.m17919b(context), (LocaleInfo) f52236c.mo19759a(context.getSharedPreferences("user_locale", 0)))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        Context context = eVar.f33852a;
        C19722a0 a0Var = eVar.f33853b;
        if (a0Var != null) {
            String str = GcmTopicManager.f41617b;
            C13272f fVar = a0Var.f50160a;
            GcmTopicManager.m40721a(context, fVar.f32927c, fVar.f32926b);
        }
        LocaleInfo b = LocaleInfo.m17919b(context);
        new C13269c(eVar, b).mo52626J();
        f52236c.mo49545d(context.getSharedPreferences("user_locale", 0), b);
        return Boolean.TRUE;
    }
}
