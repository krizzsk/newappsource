package com.moovit.database.sqlite;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p001a0.C0016g;

public class SQLiteQueryBuilder {
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    private static void appendClause(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public static void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(' ');
    }

    public static String buildQueryString(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        } else if (TextUtils.isEmpty(str6) || sLimitPattern.matcher(str6).matches()) {
            StringBuilder r = C0016g.m34r(120, "SELECT ");
            if (z) {
                r.append("DISTINCT ");
            }
            if (strArr == null || strArr.length == 0) {
                r.append("* ");
            } else {
                appendColumns(r, strArr);
            }
            r.append("FROM ");
            r.append(str);
            appendClause(r, " WHERE ", str2);
            appendClause(r, " GROUP BY ", str3);
            appendClause(r, " HAVING ", str4);
            appendClause(r, " ORDER BY ", str5);
            appendClause(r, " LIMIT ", str6);
            return r.toString();
        } else {
            throw new IllegalArgumentException(C25541a.m63881k("invalid LIMIT clauses:", str6));
        }
    }
}
