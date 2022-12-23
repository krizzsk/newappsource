package com.cubic.umo.auth;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.cubic.umo.auth.database.AuthDatabase;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p008a7.C0088a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/cubic/umo/auth/database/AuthDatabase;", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class CubicAuth$db$2 extends Lambda implements C24225a<AuthDatabase> {

    /* renamed from: f */
    public static final CubicAuth$db$2 f7727f = new CubicAuth$db$2();

    public CubicAuth$db$2() {
        super(0);
    }

    public final Object invoke() {
        boolean z;
        AuthDatabase.C2232a aVar = AuthDatabase.f7789l;
        C0088a aVar2 = C0088a.f265d;
        if (aVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new UninitializedPropertyAccessException();
        } else if (aVar2 != null) {
            Context context = aVar2.f266a;
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            AuthDatabase authDatabase = AuthDatabase.f7790m;
            if (authDatabase == null) {
                synchronized (aVar) {
                    authDatabase = AuthDatabase.f7790m;
                    if (authDatabase == null) {
                        AuthDatabase authDatabase2 = (AuthDatabase) new RoomDatabase.C1252a(context, AuthDatabase.class, "cubicid-db").mo5197b();
                        AuthDatabase.f7790m = authDatabase2;
                        authDatabase = authDatabase2;
                    }
                }
            }
            return authDatabase;
        } else {
            C24362h.m61217l("instance");
            throw null;
        }
    }
}
