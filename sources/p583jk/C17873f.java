package p583jk;

import com.masabi.justride.sdk.error.ConvertedErrorException;
import p725pj.C18926a;

/* renamed from: jk.f */
public final class C17873f {
    /* renamed from: a */
    public static ConvertedErrorException m44274a(C18926a aVar) {
        ConvertedErrorException convertedErrorException;
        String str = aVar.f48169a;
        int intValue = aVar.f48170b.intValue();
        String str2 = aVar.f48171c;
        C18926a aVar2 = aVar.f48172d;
        if (aVar2 == null) {
            convertedErrorException = null;
        } else {
            convertedErrorException = m44274a(aVar2);
        }
        return new ConvertedErrorException(intValue, str, str2, convertedErrorException);
    }

    /* renamed from: b */
    public static C18926a m44275b(Throwable th) {
        C18926a aVar = null;
        if (th instanceof ConvertedErrorException) {
            ConvertedErrorException convertedErrorException = (ConvertedErrorException) th;
            String b = convertedErrorException.mo44334b();
            Integer valueOf = Integer.valueOf(convertedErrorException.mo44333a());
            String localizedMessage = th.getLocalizedMessage();
            Throwable cause = th.getCause();
            if (cause != null) {
                aVar = m44275b(cause);
            }
            return new C18926a(b, valueOf, localizedMessage, aVar);
        }
        String name = th.getClass().getName();
        String localizedMessage2 = th.getLocalizedMessage();
        Throwable cause2 = th.getCause();
        if (cause2 != null) {
            aVar = m44275b(cause2);
        }
        return new C18926a(name, -1, localizedMessage2, aVar);
    }
}
