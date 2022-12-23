package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.login.C2474f;
import com.facebook.login.C2475g;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.android.gms.common.Scopes;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import p054d0.C4319x0;

/* renamed from: com.facebook.internal.b0 */
public abstract class C2380b0 implements ServiceConnection {

    /* renamed from: b */
    public final Context f8613b;

    /* renamed from: c */
    public final C2375a0 f8614c;

    /* renamed from: d */
    public C2381a f8615d;

    /* renamed from: e */
    public boolean f8616e;

    /* renamed from: f */
    public Messenger f8617f;

    /* renamed from: g */
    public final int f8618g;

    /* renamed from: h */
    public final int f8619h;

    /* renamed from: i */
    public final String f8620i;

    /* renamed from: j */
    public final int f8621j;

    /* renamed from: k */
    public final String f8622k;

    /* renamed from: com.facebook.internal.b0$a */
    public interface C2381a {
    }

    public C2380b0(Context context, String str, String str2) {
        C24362h.m61211f(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f8613b = applicationContext != null ? applicationContext : context;
        this.f8618g = SQLiteDatabase.OPEN_FULLMUTEX;
        this.f8619h = 65537;
        this.f8620i = str;
        this.f8621j = 20121101;
        this.f8622k = str2;
        this.f8614c = new C2375a0(this);
    }

    /* renamed from: a */
    public final void mo12548a(Bundle bundle) {
        boolean z;
        if (this.f8616e) {
            boolean z2 = false;
            this.f8616e = false;
            C2381a aVar = this.f8615d;
            if (aVar != null) {
                C4319x0 x0Var = (C4319x0) aVar;
                GetTokenLoginMethodHandler getTokenLoginMethodHandler = (GetTokenLoginMethodHandler) x0Var.f15296c;
                LoginClient.Request request = (LoginClient.Request) x0Var.f15297d;
                C24362h.m61211f(getTokenLoginMethodHandler, "this$0");
                C24362h.m61211f(request, "$request");
                C2474f fVar = getTokenLoginMethodHandler.f8781d;
                if (fVar != null) {
                    fVar.f8615d = null;
                }
                getTokenLoginMethodHandler.f8781d = null;
                LoginClient.C2460a aVar2 = getTokenLoginMethodHandler.mo12682f().f8790f;
                if (aVar2 != null) {
                    aVar2.mo12677b();
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = EmptyList.f60173b;
                    }
                    Set<String> set = request.f8799c;
                    if (set == null) {
                        set = EmptySet.f60175b;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains(Scopes.OPEN_ID)) {
                        if (string == null || string.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            getTokenLoginMethodHandler.mo12682f().mo12664n();
                            return;
                        }
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 == null || string2.length() == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            LoginClient.C2460a aVar3 = getTokenLoginMethodHandler.mo12682f().f8790f;
                            if (aVar3 != null) {
                                aVar3.mo12676a();
                            }
                            String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                            if (string3 != null) {
                                C2397f0.m6322p(new C2475g(bundle, getTokenLoginMethodHandler, request), string3);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        getTokenLoginMethodHandler.mo12637q(bundle, request);
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.mo12680b(TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, hashSet), "new_permissions");
                    }
                    request.f8799c = hashSet;
                }
                getTokenLoginMethodHandler.mo12682f().mo12664n();
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C24362h.m61211f(componentName, "name");
        C24362h.m61211f(iBinder, "service");
        this.f8617f = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f8620i);
        String str = this.f8622k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.f8618g);
        obtain.arg1 = this.f8621j;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f8614c);
        try {
            Messenger messenger = this.f8617f;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            mo12548a((Bundle) null);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C24362h.m61211f(componentName, "name");
        this.f8617f = null;
        try {
            this.f8613b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        mo12548a((Bundle) null);
    }
}
