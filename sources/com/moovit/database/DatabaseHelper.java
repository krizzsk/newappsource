package com.moovit.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import ce0.C21100e;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteOpenHelper;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.File;

public class DatabaseHelper extends SQLiteOpenHelper {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile DatabaseHelper INSTANCE;
    private final Resources resources;

    private DatabaseHelper(Context context) {
        super(context, "moovit_v1.db", (SQLiteDatabase.CursorFactory) null, 6);
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.resources = context.getResources();
        setWriteAheadLoggingEnabled(true);
    }

    public static DatabaseHelper get(Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DatabaseHelper(context.getApplicationContext());
                    INSTANCE.getWritableDatabase();
                }
            }
        }
        return INSTANCE;
    }

    public static long getDatabaseSize(Context context) {
        String[] strArr = {"moovit_v1.db", "moovit_v1.db-wal", "moovit_v1.db-shm"};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            File databasePath = context.getDatabasePath(strArr[i]);
            if (databasePath.exists() && databasePath.isFile()) {
                j = databasePath.length() + j;
            }
        }
        return j;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(Tables$Revisions.createTable());
        sQLiteDatabase.execSQL(Tables$MetroInfo.createTable());
        sQLiteDatabase.execSQL(Tables$Configuration.createTable());
        sQLiteDatabase.execSQL(Tables$TransitTypes.createTable());
        sQLiteDatabase.execSQL(Tables$TransitAgencies.createTable());
        sQLiteDatabase.execSQL(Tables$TransitStops.createTable());
        sQLiteDatabase.execSQL(Tables$TransitLines.createTable());
        sQLiteDatabase.execSQL(Tables$TransitLinesGroups.createTable());
        sQLiteDatabase.execSQL(Tables$StopsAndLines.createTable());
        sQLiteDatabase.execSQL(Tables$TransportationMaps.createTable());
        sQLiteDatabase.execSQL(Tables$WebPages.createTable());
        sQLiteDatabase.execSQL(Tables$LineSearchData.createTable());
        sQLiteDatabase.execSQL(Tables$LineSearchFts.createTable());
        sQLiteDatabase.execSQL(Tables$MapItems.createTable());
        sQLiteDatabase.execSQL(Tables$TransitPattern.createTable());
        sQLiteDatabase.execSQL(Tables$StopSearchFts.createTable());
        sQLiteDatabase.execSQL(Tables$BicycleProviders.createTable());
        sQLiteDatabase.execSQL(Tables$BicycleStops.createTable());
        sQLiteDatabase.execSQL(Tables$Shapes.createTable());
        sQLiteDatabase.execSQL(Tables$ShapeSegments.createTable());
        sQLiteDatabase.execSQL(Tables$TransitFrequencies.createTable());
        sQLiteDatabase.execSQL(Tables$CustomPOISearchData.createTable());
        sQLiteDatabase.execSQL(Tables$CustomPOISearchFts.createTable());
        sQLiteDatabase.execSQL(Indexes$AgenciesMetroIndex.createIndex());
        sQLiteDatabase.execSQL(Indexes$TransitStopLatLonIndex.createIndex());
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(com.moovit.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
        /*
            r5 = this;
            r8 = 0
            java.lang.String[] r0 = new java.lang.String[r8]
            r1 = 2
            if (r7 >= r1) goto L_0x0014
            android.content.res.Resources r1 = r5.resources
            int r2 = p824tp.C19734l.upgradeV1ToV2
            java.lang.String[] r1 = r1.getStringArray(r2)
            java.lang.Object[] r0 = mf0.C24361g.m61131A(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0014:
            r1 = 3
            if (r7 >= r1) goto L_0x0025
            android.content.res.Resources r1 = r5.resources
            int r2 = p824tp.C19734l.upgradeV2ToV3
            java.lang.String[] r1 = r1.getStringArray(r2)
            java.lang.Object[] r0 = mf0.C24361g.m61131A(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0025:
            r1 = 4
            if (r7 >= r1) goto L_0x0036
            android.content.res.Resources r1 = r5.resources
            int r2 = p824tp.C19734l.upgradeV3ToV4
            java.lang.String[] r1 = r1.getStringArray(r2)
            java.lang.Object[] r0 = mf0.C24361g.m61131A(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0036:
            r1 = 5
            if (r7 >= r1) goto L_0x0047
            android.content.res.Resources r1 = r5.resources
            int r2 = p824tp.C19734l.upgradeV4ToV5
            java.lang.String[] r1 = r1.getStringArray(r2)
            java.lang.Object[] r0 = mf0.C24361g.m61131A(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0047:
            r1 = 6
            if (r7 >= r1) goto L_0x0059
            android.content.res.Resources r7 = r5.resources
            int r1 = p824tp.C19734l.upgradeV5ToV6
            java.lang.String[] r7 = r7.getStringArray(r1)
            java.lang.Object[] r7 = mf0.C24361g.m61131A(r0, r7)
            r0 = r7
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0059:
            int r7 = r0.length
        L_0x005a:
            if (r8 >= r7) goto L_0x007c
            r1 = r0[r8]
            de.f r2 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Performing upgrade script: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.mo49363b(r3)
            r6.execSQL(r1)
            int r8 = r8 + 1
            goto L_0x005a
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.DatabaseHelper.onUpgrade(com.moovit.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
