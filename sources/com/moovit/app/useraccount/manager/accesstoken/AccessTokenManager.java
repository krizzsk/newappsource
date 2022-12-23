package com.moovit.app.useraccount.manager.accesstoken;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import ce0.C21100e;
import com.moovit.request.UserRequestError;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p130j2.C5367a;
import p241s0.C6313h;
import p479ey.C16893e;
import p479ey.C16894f;
import p479ey.C16900k;
import p479ey.C16901l;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p975zx.C20919a;

public final class AccessTokenManager {

    /* renamed from: f */
    public static AccessTokenManager f40579f;

    /* renamed from: a */
    public final Context f40580a;

    /* renamed from: b */
    public final C20919a f40581b;

    /* renamed from: c */
    public final SparseBooleanArray f40582c = new SparseBooleanArray(2);

    /* renamed from: d */
    public final C15597a f40583d = new C15597a();

    /* renamed from: e */
    public final C15598b f40584e = new C15598b();

    public enum Procedure {
        GET_ACCESS_TOKEN("com.moovit.useraccount.manager.accesstoken.get_access_token_success", "com.moovit.useraccount.manager.accesstoken.get_access_token_failure"),
        CREATE_ACCESS_TOKEN("com.moovit.useraccount.manager.accesstoken.create_access_token_success", "com.moovit.useraccount.manager.accesstoken.create_access_token_failure");
        
        private static C6313h<String, Procedure> eventToProcedure;
        public String[] completionEvents;

        /* access modifiers changed from: public */
        static {
            eventToProcedure = new C6313h<>();
            for (Procedure procedure : values()) {
                for (String put : procedure.completionEvents) {
                    eventToProcedure.put(put, procedure);
                }
            }
        }

        private Procedure(String... strArr) {
            this.completionEvents = strArr;
        }

        public static Procedure getProcedure(String str) {
            return eventToProcedure.getOrDefault(str, null);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager$a */
    public class C15597a extends C20438i<C16900k, C16901l> {
        public C15597a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16900k kVar = (C16900k) cVar;
            AccessTokenManager accessTokenManager = AccessTokenManager.this;
            String str = ((C16901l) gVar).f43916m;
            C20919a aVar = accessTokenManager.f40581b;
            aVar.getClass();
            C21100e.m49373x(str, "accessToken");
            C20919a.f52665b.mo49545d(aVar.f52668a, str);
            C20919a.f52666c.mo49545d(aVar.f52668a, Boolean.FALSE);
            accessTokenManager.mo46580a("com.moovit.useraccount.manager.accesstoken.get_access_token_success", str);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            String str;
            C16900k kVar = (C16900k) cVar;
            AccessTokenManager accessTokenManager = AccessTokenManager.this;
            accessTokenManager.getClass();
            if (exc instanceof UserRequestError) {
                str = ((UserRequestError) exc).mo49161c();
            } else {
                str = null;
            }
            accessTokenManager.mo46580a("com.moovit.useraccount.manager.accesstoken.get_access_token_failure", str);
            return true;
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager$b */
    public class C15598b extends C20438i<C16893e, C16894f> {
        public C15598b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16893e eVar = (C16893e) cVar;
            AccessTokenManager accessTokenManager = AccessTokenManager.this;
            String str = ((C16894f) gVar).f43914m;
            C20919a aVar = accessTokenManager.f40581b;
            aVar.getClass();
            C21100e.m49373x(str, "accessToken");
            C20919a.f52665b.mo49545d(aVar.f52668a, str);
            C20919a.f52666c.mo49545d(aVar.f52668a, Boolean.TRUE);
            accessTokenManager.mo46580a("com.moovit.useraccount.manager.accesstoken.create_access_token_success", str);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            String str;
            C16893e eVar = (C16893e) cVar;
            AccessTokenManager accessTokenManager = AccessTokenManager.this;
            accessTokenManager.getClass();
            if (exc instanceof UserRequestError) {
                str = ((UserRequestError) exc).mo49161c();
            } else {
                str = null;
            }
            accessTokenManager.mo46580a("com.moovit.useraccount.manager.accesstoken.create_access_token_failure", str);
            return true;
        }
    }

    public AccessTokenManager(Context context, C20919a aVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f40580a = context.getApplicationContext();
        C21100e.m49373x(aVar, "accessTokenStore");
        this.f40581b = aVar;
    }

    /* renamed from: b */
    public static synchronized AccessTokenManager m39875b(Context context) {
        AccessTokenManager accessTokenManager;
        synchronized (AccessTokenManager.class) {
            if (f40579f == null) {
                synchronized (C20919a.class) {
                    if (f40579f == null) {
                        f40579f = new AccessTokenManager(context, C20919a.m49002a(context));
                    }
                }
            }
            accessTokenManager = f40579f;
        }
        return accessTokenManager;
    }

    /* renamed from: a */
    public final void mo46580a(String str, String str2) {
        Procedure procedure = Procedure.getProcedure(str);
        if (procedure != null) {
            this.f40582c.put(procedure.ordinal(), false);
        }
        Intent intent = new Intent();
        intent.setAction(str);
        if (str2 != null) {
            intent.putExtra("additional_data", str2);
        }
        C5367a.m13473a(this.f40580a).mo21147c(intent);
    }
}
