package p868vl;

import com.masabi.justride.sdk.exception.config.SdkConfigurationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: vl.c */
public final class C20156c {
    /* renamed from: a */
    public static void m47738a(String str) throws SdkConfigurationException {
        if (str != null) {
            try {
                if (new Date().after(new SimpleDateFormat("yyyy-MM-dd").parse(str))) {
                    throw new SdkConfigurationException(C25541a.m63881k("The SDK Configuration data expired on ", str));
                }
            } catch (ParseException e) {
                throw new SdkConfigurationException("The expiry date in the SDK Configuration data is not in the right format.", e);
            }
        }
    }
}
