package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p269u2.C6679c;

/* renamed from: androidx.room.a */
public final class C1256a {

    /* renamed from: a */
    public final C6679c.C6682c f4733a;

    /* renamed from: b */
    public final Context f4734b;

    /* renamed from: c */
    public final String f4735c;

    /* renamed from: d */
    public final RoomDatabase.C1254c f4736d;

    /* renamed from: e */
    public final List<RoomDatabase.C1253b> f4737e;

    /* renamed from: f */
    public final List<Object> f4738f = Collections.emptyList();

    /* renamed from: g */
    public final Executor f4739g;

    /* renamed from: h */
    public final Executor f4740h;

    /* renamed from: i */
    public final boolean f4741i;

    /* renamed from: j */
    public final boolean f4742j;

    @SuppressLint({"LambdaLast"})
    public C1256a(Context context, String str, C6679c.C6682c cVar, RoomDatabase.C1254c cVar2, ArrayList arrayList, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.f4733a = cVar;
        this.f4734b = context;
        this.f4735c = str;
        this.f4736d = cVar2;
        this.f4737e = arrayList;
        this.f4739g = executor;
        this.f4740h = executor2;
        this.f4741i = z2;
        this.f4742j = z3;
    }

    /* renamed from: a */
    public final boolean mo5200a(int i, int i2) {
        boolean z;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if ((!z || !this.f4742j) && this.f4741i) {
            return true;
        }
        return false;
    }
}
