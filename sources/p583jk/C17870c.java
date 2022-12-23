package p583jk;

import com.masabi.justride.sdk.helpers.ColourTransformerException;

/* renamed from: jk.c */
public final class C17870c {
    /* renamed from: a */
    public static int m44273a(String str) throws ColourTransformerException {
        if (str.charAt(0) == '#') {
            try {
                long parseLong = Long.parseLong(str.substring(1), 16);
                if (str.length() == 7) {
                    parseLong |= -16777216;
                } else if (str.length() != 9) {
                    throw new ColourTransformerException(C25541a.m63881k("Unknown color: ", str));
                }
                return (int) parseLong;
            } catch (NumberFormatException e) {
                throw new ColourTransformerException(C25541a.m63881k("Failed parsing string to long: ", str), e);
            }
        } else {
            throw new ColourTransformerException(C25541a.m63881k("The Hex color String is missing the '#' prefix: ", str));
        }
    }
}
