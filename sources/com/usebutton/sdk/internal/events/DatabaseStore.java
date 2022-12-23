package com.usebutton.sdk.internal.events;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class DatabaseStore implements EventsStore {
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_PROPERTIES = "properties";
    private static final String COLUMN_REFERRER = "referrer";
    private static final String COLUMN_SEQNO = "seqno";
    private static final String COLUMN_TIME = "time";
    private static final String COLUMN_UUID = "uuid";
    private static final int INDEX_NAME = 2;
    private static final int INDEX_PROPERTIES = 5;
    private static final int INDEX_SEQNO = 0;
    private static final int INDEX_TIME = 1;
    private static final int INDEX_UUID = 4;
    private static final String[] PROJECTION_EVENTS = {COLUMN_SEQNO, COLUMN_TIME, "name", "referrer", COLUMN_UUID, COLUMN_PROPERTIES};
    private static final String TABLE_EVENTS = "events";
    private static final String TAG = "DatabaseStore";
    private final Executor mDelayedExecutor = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */
    public DatabaseHelper mHelper;
    /* access modifiers changed from: private */
    public boolean mReady = false;

    public static class DatabaseHelper extends SQLiteOpenHelper {
        private static final String NAME = "com.usebutton.events";
        private static final String SQL_CREATE = "CREATE TABLE IF NOT EXISTS events (seqno INTEGER PRIMARY KEY AUTOINCREMENT, time TEXT NOT NULL, name TEXT NOT NULL, referrer TEXT, uuid TEXT NOT NULL, properties TEXT);";
        private static final int VERSION = 1;

        public DatabaseHelper(Context context) {
            super(context, NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            ButtonLog.infoFormat(DatabaseStore.TAG, "Creating database at %s.", sQLiteDatabase.getPath());
            sQLiteDatabase.execSQL(SQL_CREATE);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            ButtonLog.infoFormat(DatabaseStore.TAG, "Opened database at %s.", sQLiteDatabase.getPath());
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            ButtonLog.infoFormat(DatabaseStore.TAG, "onUpgrade from %d to %d.", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public DatabaseStore(Context context) {
        prepareDatabase(context.getApplicationContext());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.usebutton.sdk.internal.events.DatabaseStore.DatabaseHelper getHelper() {
        /*
            r2 = this;
            monitor-enter(r2)
        L_0x0001:
            boolean r0 = r2.mReady     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0011
            r2.wait()     // Catch:{ InterruptedException -> 0x0009 }
            goto L_0x0001
        L_0x0009:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "DatabaseHelper.getHelper() interrupted."
            r0.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0011:
            com.usebutton.sdk.internal.events.DatabaseStore$DatabaseHelper r0 = r2.mHelper     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.events.DatabaseStore.getHelper():com.usebutton.sdk.internal.events.DatabaseStore$DatabaseHelper");
    }

    private JSONObject jsonOrNull(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void prepareDatabase(final Context context) {
        this.mDelayedExecutor.execute(new Runnable() {
            public void run() {
                synchronized (DatabaseStore.this) {
                    DatabaseHelper unused = DatabaseStore.this.mHelper = new DatabaseHelper(context);
                    boolean unused2 = DatabaseStore.this.mReady = true;
                    DatabaseStore.this.notifyAll();
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(com.usebutton.sdk.internal.api.models.ClientEventDTO r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events"
            java.lang.String r1 = "DatabaseStore"
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = r13.getName()
            java.lang.String r4 = "name"
            r2.put(r4, r3)
            java.lang.String r3 = "referrer"
            java.lang.String r4 = ""
            r2.put(r3, r4)
            java.lang.String r3 = r13.getTime()
            java.lang.String r4 = "time"
            r2.put(r4, r3)
            java.lang.String r3 = r13.getUuid()
            java.lang.String r4 = "uuid"
            r2.put(r4, r3)
            org.json.JSONObject r13 = r13.getProperties()
            r3 = 0
            if (r13 == 0) goto L_0x0037
            java.lang.String r13 = r13.toString()
            goto L_0x0038
        L_0x0037:
            r13 = r3
        L_0x0038:
            java.lang.String r4 = "properties"
            r2.put(r4, r13)
            r13 = 1
            r4 = 0
            r5 = 0
            com.usebutton.sdk.internal.events.DatabaseStore$DatabaseHelper r7 = r12.getHelper()     // Catch:{ SQLiteException -> 0x006e }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x006e }
            long r8 = r7.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x006e }
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0068
            java.lang.String r3 = "Inserted row id=%d in table %s\n%s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x006c }
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x006c }
            r10[r4] = r11     // Catch:{ SQLiteException -> 0x006c }
            r10[r13] = r0     // Catch:{ SQLiteException -> 0x006c }
            r0 = 2
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x006c }
            r10[r0] = r2     // Catch:{ SQLiteException -> 0x006c }
            com.usebutton.sdk.internal.util.ButtonLog.infoFormat(r1, r3, r10)     // Catch:{ SQLiteException -> 0x006c }
        L_0x0068:
            r7.close()     // Catch:{ SQLiteException -> 0x006c }
            goto L_0x0075
        L_0x006c:
            r0 = move-exception
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            r8 = r5
        L_0x0070:
            java.lang.String r2 = "Issue while inserting event"
            com.usebutton.sdk.internal.util.ButtonLog.warn(r1, r2, r0)
        L_0x0075:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r13 = 0
        L_0x007b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.events.DatabaseStore.add(com.usebutton.sdk.internal.api.models.ClientEventDTO):boolean");
    }

    public boolean deleteDatabase(Context context) {
        return context.getApplicationContext().deleteDatabase("com.usebutton.events");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r3.isOpen() != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r3.isOpen() != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.usebutton.sdk.internal.api.models.ClientEventDTO> peek(int r15) {
        /*
            r14 = this;
            java.lang.String r0 = "Exception while reading event row, skip"
            java.lang.String r1 = "DatabaseStore"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.usebutton.sdk.internal.events.DatabaseStore$DatabaseHelper r3 = r14.getHelper()     // Catch:{ SQLiteException -> 0x00a7 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00a7 }
            r13 = 0
            java.lang.String r5 = "events"
            java.lang.String[] r6 = PROJECTION_EVENTS     // Catch:{ Exception -> 0x0075 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r11 = "seqno ASC"
            java.lang.String r12 = java.lang.Integer.toString(r15)     // Catch:{ Exception -> 0x0075 }
            r4 = r3
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0075 }
        L_0x0025:
            boolean r15 = r13.moveToNext()     // Catch:{ Exception -> 0x0075 }
            if (r15 == 0) goto L_0x005d
            r15 = 0
            int r7 = r13.getInt(r15)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r15 = 1
            java.lang.String r9 = r13.getString(r15)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r15 = 2
            java.lang.String r5 = r13.getString(r15)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r15 = 4
            java.lang.String r15 = r13.getString(r15)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r4 = 5
            java.lang.String r4 = r13.getString(r4)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            com.usebutton.sdk.internal.api.models.ClientEventDTO r10 = new com.usebutton.sdk.internal.api.models.ClientEventDTO     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            org.json.JSONObject r6 = r14.jsonOrNull(r4)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            java.util.UUID r8 = java.util.UUID.fromString(r15)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            r2.add(r10)     // Catch:{ IllegalArgumentException -> 0x0058, NullPointerException -> 0x0056 }
            goto L_0x0025
        L_0x0056:
            r15 = move-exception
            goto L_0x0059
        L_0x0058:
            r15 = move-exception
        L_0x0059:
            com.usebutton.sdk.internal.util.ButtonLog.warn(r1, r0, r15)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0025
        L_0x005d:
            r13.close()     // Catch:{ Exception -> 0x0075 }
            r3.close()     // Catch:{ Exception -> 0x0075 }
            boolean r15 = r13.isClosed()
            if (r15 != 0) goto L_0x006c
            r13.close()
        L_0x006c:
            boolean r15 = r3.isOpen()
            if (r15 == 0) goto L_0x008f
            goto L_0x008c
        L_0x0073:
            r15 = move-exception
            goto L_0x0090
        L_0x0075:
            r15 = move-exception
            com.usebutton.sdk.internal.util.ButtonLog.warn(r1, r0, r15)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x0084
            boolean r15 = r13.isClosed()
            if (r15 != 0) goto L_0x0084
            r13.close()
        L_0x0084:
            if (r3 == 0) goto L_0x008f
            boolean r15 = r3.isOpen()
            if (r15 == 0) goto L_0x008f
        L_0x008c:
            r3.close()
        L_0x008f:
            return r2
        L_0x0090:
            if (r13 == 0) goto L_0x009b
            boolean r0 = r13.isClosed()
            if (r0 != 0) goto L_0x009b
            r13.close()
        L_0x009b:
            if (r3 == 0) goto L_0x00a6
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00a6
            r3.close()
        L_0x00a6:
            throw r15
        L_0x00a7:
            r15 = move-exception
            java.lang.String r0 = "Could not open database."
            com.usebutton.sdk.internal.util.ButtonLog.warn(r1, r0, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.events.DatabaseStore.peek(int):java.util.List");
    }

    public void remove(int i) {
        try {
            SQLiteDatabase readableDatabase = getHelper().getReadableDatabase();
            ButtonLog.infoFormat(TAG, "Deleted %d rows from %s.", Integer.valueOf(readableDatabase.delete(TABLE_EVENTS, "seqno IN (SELECT seqno FROM events ORDER BY seqno ASC LIMIT ?)", new String[]{Integer.toString(i)})), TABLE_EVENTS);
            readableDatabase.close();
        } catch (SQLiteException e) {
            ButtonLog.warn(TAG, "Issue while removing " + i + " entries.", e);
        }
    }

    public int size() {
        int i = 0;
        try {
            SQLiteDatabase readableDatabase = getHelper().getReadableDatabase();
            Cursor query = readableDatabase.query(TABLE_EVENTS, new String[]{COLUMN_SEQNO}, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                i = query.getCount();
            }
            query.close();
            readableDatabase.close();
        } catch (SQLiteException e) {
            ButtonLog.warn(TAG, "Issue while getting size.", e);
        }
        return i;
    }

    public void trimToSize(int i) {
        try {
            SQLiteDatabase writableDatabase = getHelper().getWritableDatabase();
            writableDatabase.beginTransaction();
            Cursor query = writableDatabase.query(TABLE_EVENTS, new String[]{COLUMN_SEQNO}, (String) null, (String[]) null, (String) null, (String) null, "seqno ASC");
            int max = Math.max(0, query.getCount() - i);
            int i2 = 0;
            while (query.moveToNext()) {
                int i3 = max - 1;
                if (max <= 0) {
                    break;
                }
                i2 += writableDatabase.delete(TABLE_EVENTS, "seqno = ?", new String[]{Integer.toString(query.getInt(0))});
                max = i3;
            }
            query.close();
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            ButtonLog.infoFormat(TAG, "Deleted %d rows from %s.", Integer.valueOf(i2), TABLE_EVENTS);
            writableDatabase.close();
        } catch (SQLiteException e) {
            ButtonLog.warn(TAG, "Issue while trimming to size " + i, e);
        }
    }
}
