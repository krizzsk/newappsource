package p243s2;

import android.database.Cursor;
import android.os.Build;
import java.util.Arrays;
import p358af.C13437d;

/* renamed from: s2.b */
public final class C6419b {
    /* renamed from: a */
    public static int m15327a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String k = C25541a.m63881k(".", str);
                    String k2 = C13437d.m33706k(".", str, "`");
                    int i = 0;
                    while (true) {
                        if (i >= columnNames.length) {
                            break;
                        }
                        String str3 = columnNames[i];
                        if (str3.length() < str.length() + 2 || (!str3.endsWith(k) && (str3.charAt(0) != '`' || !str3.endsWith(k2)))) {
                            i++;
                        }
                    }
                    columnIndex = i;
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException(C25541a.m63882l("column '", str, "' does not exist. Available columns: ", str2));
    }
}
