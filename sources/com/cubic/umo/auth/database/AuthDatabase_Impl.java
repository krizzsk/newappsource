package com.cubic.umo.auth.database;

import android.content.Context;
import androidx.room.C1256a;
import androidx.room.C1259d;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p158l7.C5631a;
import p158l7.C5634d;
import p158l7.C5635e;
import p158l7.C5638h;
import p217q2.C6155h;
import p243s2.C6420c;
import p243s2.C6421d;
import p269u2.C6679c;
import p281v2.C6846a;

public final class AuthDatabase_Impl extends AuthDatabase {

    /* renamed from: n */
    public volatile C5634d f7791n;

    /* renamed from: o */
    public volatile C5638h f7792o;

    /* renamed from: com.cubic.umo.auth.database.AuthDatabase_Impl$a */
    public class C2233a extends C1259d.C1260a {
        public C2233a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo5207a(C6846a aVar) {
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `Account` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cubic_id` TEXT NOT NULL, `session_state` TEXT NOT NULL, `email_is_verified` INTEGER NOT NULL, `preferred_username` TEXT NOT NULL, `pass_id` INTEGER, `card_number` TEXT, `account_key` TEXT, `mobile_is_verified` INTEGER, `media_id` TEXT, `user_token` TEXT, `mobile_number` TEXT)");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS `Token` (`account_id` INTEGER NOT NULL, `access_token` TEXT NOT NULL, `access_expire_time` INTEGER NOT NULL, `refresh_expire_time` INTEGER NOT NULL, `refresh_token` TEXT NOT NULL, `token_type` TEXT NOT NULL, PRIMARY KEY(`account_id`), FOREIGN KEY(`account_id`) REFERENCES `Account`(`_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            aVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc175d1e390754fef0ce48c0710b1f51')");
        }

        /* renamed from: b */
        public final void mo5208b(C6846a aVar) {
            aVar.execSQL("DROP TABLE IF EXISTS `Account`");
            aVar.execSQL("DROP TABLE IF EXISTS `Token`");
            List<RoomDatabase.C1253b> list = AuthDatabase_Impl.this.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AuthDatabase_Impl.this.f4714g.get(i).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo5209c() {
            List<RoomDatabase.C1253b> list = AuthDatabase_Impl.this.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AuthDatabase_Impl.this.f4714g.get(i).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo5210d(C6846a aVar) {
            AuthDatabase_Impl.this.f4708a = aVar;
            aVar.execSQL("PRAGMA foreign_keys = ON");
            AuthDatabase_Impl.this.mo5192h(aVar);
            List<RoomDatabase.C1253b> list = AuthDatabase_Impl.this.f4714g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AuthDatabase_Impl.this.f4714g.get(i).mo5198a(aVar);
                }
            }
        }

        /* renamed from: e */
        public final void mo5211e() {
        }

        /* renamed from: f */
        public final void mo5212f(C6846a aVar) {
            C6420c.m15328a(aVar);
        }

        /* renamed from: g */
        public final C1259d.C1261b mo5213g(C6846a aVar) {
            C6846a aVar2 = aVar;
            HashMap hashMap = new HashMap(12);
            hashMap.put("_id", new C6421d.C6422a(1, "_id", "INTEGER", (String) null, true, 1));
            hashMap.put("cubic_id", new C6421d.C6422a(0, "cubic_id", "TEXT", (String) null, true, 1));
            hashMap.put("session_state", new C6421d.C6422a(0, "session_state", "TEXT", (String) null, true, 1));
            hashMap.put("email_is_verified", new C6421d.C6422a(0, "email_is_verified", "INTEGER", (String) null, true, 1));
            hashMap.put("preferred_username", new C6421d.C6422a(0, "preferred_username", "TEXT", (String) null, true, 1));
            hashMap.put("pass_id", new C6421d.C6422a(0, "pass_id", "INTEGER", (String) null, false, 1));
            hashMap.put("card_number", new C6421d.C6422a(0, "card_number", "TEXT", (String) null, false, 1));
            hashMap.put("account_key", new C6421d.C6422a(0, "account_key", "TEXT", (String) null, false, 1));
            hashMap.put("mobile_is_verified", new C6421d.C6422a(0, "mobile_is_verified", "INTEGER", (String) null, false, 1));
            hashMap.put("media_id", new C6421d.C6422a(0, "media_id", "TEXT", (String) null, false, 1));
            hashMap.put("user_token", new C6421d.C6422a(0, "user_token", "TEXT", (String) null, false, 1));
            hashMap.put("mobile_number", new C6421d.C6422a(0, "mobile_number", "TEXT", (String) null, false, 1));
            C6421d dVar = new C6421d("Account", hashMap, new HashSet(0), new HashSet(0));
            C6421d a = C6421d.m15329a(aVar2, "Account");
            if (!dVar.equals(a)) {
                return new C1259d.C1261b(false, "Account(com.cubic.umo.auth.database.entity.Account).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("account_id", new C6421d.C6422a(1, "account_id", "INTEGER", (String) null, true, 1));
            hashMap2.put("access_token", new C6421d.C6422a(0, "access_token", "TEXT", (String) null, true, 1));
            hashMap2.put("access_expire_time", new C6421d.C6422a(0, "access_expire_time", "INTEGER", (String) null, true, 1));
            hashMap2.put("refresh_expire_time", new C6421d.C6422a(0, "refresh_expire_time", "INTEGER", (String) null, true, 1));
            hashMap2.put("refresh_token", new C6421d.C6422a(0, "refresh_token", "TEXT", (String) null, true, 1));
            hashMap2.put("token_type", new C6421d.C6422a(0, "token_type", "TEXT", (String) null, true, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new C6421d.C6423b("Account", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"account_id"}), Arrays.asList(new String[]{"_id"})));
            C6421d dVar2 = new C6421d("Token", hashMap2, hashSet, new HashSet(0));
            C6421d a2 = C6421d.m15329a(aVar2, "Token");
            if (dVar2.equals(a2)) {
                return new C1259d.C1261b(true, (String) null);
            }
            return new C1259d.C1261b(false, "Token(com.cubic.umo.auth.database.entity.Token).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: d */
    public final C6155h mo5188d() {
        return new C6155h(this, new HashMap(0), new HashMap(0), "Account", "Token");
    }

    /* renamed from: e */
    public final C6679c mo5189e(C1256a aVar) {
        C1259d dVar = new C1259d(aVar, new C2233a(), "dc175d1e390754fef0ce48c0710b1f51", "26b18cee7857218c9bc1882ace3c9908");
        Context context = aVar.f4734b;
        String str = aVar.f4735c;
        if (context != null) {
            return aVar.f4733a.mo20274a(new C6679c.C6681b(context, str, dVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: f */
    public final Map<Class<?>, List<Class<?>>> mo5190f() {
        HashMap hashMap = new HashMap();
        hashMap.put(C5631a.class, Collections.emptyList());
        hashMap.put(C5635e.class, Collections.emptyList());
        return hashMap;
    }

    /* renamed from: l */
    public final C5631a mo11612l() {
        C5634d dVar;
        if (this.f7791n != null) {
            return this.f7791n;
        }
        synchronized (this) {
            if (this.f7791n == null) {
                this.f7791n = new C5634d(this);
            }
            dVar = this.f7791n;
        }
        return dVar;
    }

    /* renamed from: m */
    public final C5635e mo11613m() {
        C5638h hVar;
        if (this.f7792o != null) {
            return this.f7792o;
        }
        synchronized (this) {
            if (this.f7792o == null) {
                this.f7792o = new C5638h(this);
            }
            hVar = this.f7792o;
        }
        return hVar;
    }
}
