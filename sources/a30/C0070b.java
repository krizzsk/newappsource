package a30;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import b30.C1467c;
import c70.C13752e;
import c70.C13772m;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.request.ResponseSource;
import com.moovit.commons.request.ServerException;
import com.moovit.masabi.MasabiException;
import com.moovit.request.UserRequestError;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p605ki.C18047b;
import p605ki.C18052f;
import p693nz.C18648a;
import p693nz.C18650b;
import p824tp.C19722a0;

/* renamed from: a30.b */
public final class C0070b {

    /* renamed from: a */
    public static final AtomicReference<C18650b<String>> f149a = new AtomicReference<>((Object) null);

    /* renamed from: a */
    public static C18047b m131a(Application application, String str) throws MasabiException, ServerException {
        try {
            ByteArrayInputStream c = m133c(application, Uri.parse(str));
            C18047b.f46173p.getClass();
            C18052f fVar = new C18052f();
            fVar.f46189a = application;
            fVar.f46190b = c;
            return fVar.mo50526a();
        } catch (JustRideSdkException unused) {
            throw new UserRequestError(1, "", application.getString(C0075g.payment_general_error_message));
        } catch (ServerException | IOException e) {
            throw new MasabiException("Failed reading in the configuration data", e);
        }
    }

    /* renamed from: b */
    public static C18650b<String> m132b(Context context) throws IOException {
        AtomicReference<C18650b<String>> atomicReference = f149a;
        C18650b<String> bVar = atomicReference.get();
        if (bVar == null) {
            synchronized (atomicReference) {
                bVar = atomicReference.get();
                if (bVar == null) {
                    bVar = new C18650b<>(new File(new File(context.getFilesDir(), "stores"), "masabi"), Long.MAX_VALUE, true);
                    bVar.mo51042l();
                    atomicReference.set(bVar);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public static ByteArrayInputStream m133c(Application application, Uri uri) throws IOException, ServerException {
        byte[] bArr;
        String valueOf = String.valueOf(uri.hashCode());
        byte[] bArr2 = null;
        try {
            bArr = ((C1467c) new C13772m(new C13752e(application, (C19722a0) null, (AnalyticsFlowKey) null), uri, C1467c.class).mo52626J()).f5337f;
            if (ResponseSource.NETWORK.equals(bArr)) {
                m132b(application).put(valueOf, new C18648a(Long.MAX_VALUE, bArr));
            }
        } catch (Exception unused) {
            C18648a aVar = (C18648a) m132b(application).get(valueOf);
            if (aVar != null) {
                bArr2 = aVar.f47516a;
            }
            bArr = bArr2;
        }
        return new ByteArrayInputStream(bArr);
    }
}
