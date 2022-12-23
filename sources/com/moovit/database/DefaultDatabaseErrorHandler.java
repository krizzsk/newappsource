package com.moovit.database;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.File;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        deleteDatabaseFile((java.lang.String) r3.next().second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        deleteDatabaseFile(r3.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[ExcHandler: all (r1v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v1 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0012, B:8:0x0019, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0012] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCorruption(com.moovit.database.sqlite.SQLiteDatabase r3) {
        /*
            r2 = this;
            r3.getPath()
            boolean r0 = r3.isOpen()
            if (r0 != 0) goto L_0x0011
            java.lang.String r3 = r3.getPath()
            r2.deleteDatabaseFile(r3)
            return
        L_0x0011:
            r0 = 0
            java.util.List r0 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0019, all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r1 = move-exception
            goto L_0x001d
        L_0x0019:
            r3.close()     // Catch:{ SQLiteException -> 0x003f, all -> 0x0017 }
            goto L_0x0040
        L_0x001d:
            if (r0 == 0) goto L_0x0037
            java.util.Iterator r3 = r0.iterator()
        L_0x0023:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r2.deleteDatabaseFile(r0)
            goto L_0x0023
        L_0x0037:
            java.lang.String r3 = r3.getPath()
            r2.deleteDatabaseFile(r3)
        L_0x003e:
            throw r1
        L_0x003f:
        L_0x0040:
            if (r0 == 0) goto L_0x005a
            java.util.Iterator r3 = r0.iterator()
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r2.deleteDatabaseFile(r0)
            goto L_0x0046
        L_0x005a:
            java.lang.String r3 = r3.getPath()
            r2.deleteDatabaseFile(r3)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.DefaultDatabaseErrorHandler.onCorruption(com.moovit.database.sqlite.SQLiteDatabase):void");
    }
}
