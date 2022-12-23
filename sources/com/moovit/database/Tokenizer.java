package com.moovit.database;

import java.lang.Character;
import java.text.Normalizer;
import p977zz.C20964s0;

public final class Tokenizer {
    public static String normalizeQuery(String str) {
        if (C20964s0.m49090h(str)) {
            return "";
        }
        char[] charArray = Normalizer.normalize(str.trim(), Normalizer.Form.NFD).toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length);
        for (char c : charArray) {
            if (Character.UnicodeBlock.of(c) != Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS) {
                if (Character.isLetter(c)) {
                    sb.append(Character.toLowerCase(c));
                } else if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }

    public static String tokenPrefixQuery(String str) {
        if (C20964s0.m49090h(str)) {
            return "";
        }
        String[] strArr = tokenizeQuery(str);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (!C20964s0.m49090h(str2)) {
                sb.append(str2);
                sb.append("* ");
            }
        }
        return sb.toString().trim();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] tokenize(java.lang.String r6) {
        /*
            r0 = 32
            java.lang.String[] r6 = p977zz.C20964s0.m49080A(r6, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r6.length
            if (r2 >= r4) goto L_0x0022
            r4 = r6[r2]
            java.lang.String r5 = ""
            boolean r4 = p977zz.C20975x0.m49118e(r4, r5)
            if (r4 != 0) goto L_0x001f
            int r4 = r3 + 1
            r5 = r6[r2]
            r6[r3] = r5
            r3 = r4
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0022:
            int r2 = r6.length
            if (r3 != r2) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.System.arraycopy(r6, r1, r0, r1, r3)
            r6 = r0
        L_0x0030:
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.Tokenizer.tokenize(java.lang.String):java.lang.String[]");
    }

    public static String[] tokenizeQuery(String str) {
        return tokenize(normalizeQuery(str));
    }
}
