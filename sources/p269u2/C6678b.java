package p269u2;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: u2.b */
public interface C6678b extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    C6685f compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(C6684e eVar);

    void setTransactionSuccessful();
}
