package p868vl;

import com.masabi.justride.sdk.exception.config.SdkConfigurationException;

/* renamed from: vl.f */
public final class C20159f {
    /* renamed from: a */
    public static void m47740a(String str) throws SdkConfigurationException {
        int i;
        int i2;
        if (str != null) {
            String[] split = "9.10.0".split("\\.");
            String[] split2 = str.split("\\.");
            try {
                int max = Math.max(split.length, split2.length);
                int i3 = 0;
                while (i3 < max) {
                    if (i3 < split.length) {
                        i = Integer.parseInt(split[i3]);
                    } else {
                        i = 0;
                    }
                    if (i3 < split2.length) {
                        i2 = Integer.parseInt(split2[i3]);
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        throw new SdkConfigurationException("The Configuration data requires SDK version " + str + " or later to run.");
                    } else if (i <= i2) {
                        i3++;
                    } else {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                throw new SdkConfigurationException("The SDK version name is not in the correct format", e);
            }
        }
    }
}
