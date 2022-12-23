package p929xy;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.location.C16202a;
import java.io.IOException;
import java.util.HashSet;
import p532hf.C17427b;
import p578jf.C17823a;
import p578jf.C17825c;
import p626lf.C18200a;
import p646lz.C18299a;
import p743qd.C19107d;

/* renamed from: xy.e */
public final class C20662e extends C20664g<Boolean> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.remove("USER_CONTEXT");
        return b;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        C17825c cVar;
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            C16202a.get(context).onGooglePlayServicesAvailable();
            C17427b a = C17427b.m43467a();
            Boolean bool = Boolean.TRUE;
            synchronized (a) {
                try {
                    C19107d.m46265d();
                    if (a.f44887b.mo50408f().booleanValue()) {
                        C18200a aVar2 = C17427b.f44885g;
                        if (aVar2.f46452b) {
                            aVar2.f46451a.getClass();
                        }
                    } else {
                        C17823a aVar3 = a.f44887b;
                        if (!aVar3.mo50408f().booleanValue()) {
                            synchronized (C17825c.class) {
                                if (C17825c.f45794b == null) {
                                    C17825c.f45794b = new C17825c();
                                }
                                cVar = C17825c.f45794b;
                            }
                            cVar.getClass();
                            if (bool != null) {
                                aVar3.f45792c.mo50421f("isEnabled", bool.equals(bool));
                            } else {
                                aVar3.f45792c.f45813a.edit().remove("isEnabled").apply();
                            }
                        }
                        if (bool != null) {
                            a.f44888c = bool;
                        } else {
                            a.f44888c = a.f44887b.mo50409g();
                        }
                        if (bool.equals(a.f44888c)) {
                            C18200a aVar4 = C17427b.f44885g;
                            if (aVar4.f46452b) {
                                aVar4.f46451a.getClass();
                            }
                        } else if (Boolean.FALSE.equals(a.f44888c)) {
                            C18200a aVar5 = C17427b.f44885g;
                            if (aVar5.f46452b) {
                                aVar5.f46451a.getClass();
                            }
                        }
                    }
                } catch (IllegalStateException unused) {
                }
            }
            return Boolean.TRUE;
        }
        throw new AppDataPartLoadFailedException(Integer.valueOf(isGooglePlayServicesAvailable), instance.getErrorString(isGooglePlayServicesAvailable), (Throwable) null);
    }
}
