package com.moovit.app.useraccount.manager;

import android.content.Context;
import c70.C13752e;
import com.amazonaws.services.kinesis.model.InvalidArgumentException;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.IOException;
import java.util.EnumSet;
import p241s0.C6313h;
import p377ay.C13547a;
import p377ay.C13550c;
import p389bl.C13641g;
import p431cy.C16523a;
import p435de.C16596f;
import p455dy.C16748a;
import p455dy.C16753e;
import p503fy.C17125a;
import p527gy.C17261e;
import p527gy.C17264g;
import p551hy.C17515a;
import p646lz.C18299a;
import p929xy.C20663f;
import p929xy.C20664g;
import p951yx.C20784a;

/* renamed from: com.moovit.app.useraccount.manager.a */
public final class C15595a extends C20663f<UserAccountManager> {

    /* renamed from: com.moovit.app.useraccount.manager.a$a */
    public static /* synthetic */ class C15596a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40578a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType[] r0 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40578a = r0
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.FAVORITES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40578a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.PROFILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40578a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.NOTIFICATIONS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40578a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.CAMPAIGNS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40578a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.useraccount.manager.UserAccountDataProvider$ProviderType r1 = com.moovit.app.useraccount.manager.UserAccountDataProvider.ProviderType.PROMOTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.manager.C15595a.C15596a.<clinit>():void");
        }
    }

    /* renamed from: q */
    public static UserAccountDataProvider m39873q(Context context, C18299a aVar, C13752e eVar, UserAccountManager userAccountManager, UserAccountDataProvider.ProviderType providerType) {
        int i = C15596a.f40578a[providerType.ordinal()];
        if (i == 1) {
            return new C16753e(context, userAccountManager, eVar, C20663f.m48573k(aVar));
        }
        if (i == 2) {
            return new C17261e(context, userAccountManager, eVar);
        }
        if (i == 3) {
            return new C17125a(context, userAccountManager, eVar);
        }
        if (i == 4) {
            return new C16523a(context, userAccountManager, eVar);
        }
        if (i == 5) {
            return new C17515a(context, userAccountManager, eVar);
        }
        throw new InvalidArgumentException("Have you forgot to include creation login for: " + providerType + " ?");
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean exists;
        UserAccountManager userAccountManager = new UserAccountManager(context);
        C13752e i = C20664g.m48584i(context, aVar);
        UserAccountDataProvider q = m39873q(context, aVar, i, userAccountManager, UserAccountDataProvider.ProviderType.PROFILE);
        userAccountManager.f40569d.put(q.getType(), q);
        UserAccountDataProvider q2 = m39873q(context, aVar, i, userAccountManager, UserAccountDataProvider.ProviderType.FAVORITES);
        userAccountManager.f40569d.put(q2.getType(), q2);
        UserAccountDataProvider q3 = m39873q(context, aVar, i, userAccountManager, UserAccountDataProvider.ProviderType.NOTIFICATIONS);
        userAccountManager.f40569d.put(q3.getType(), q3);
        UserAccountDataProvider q4 = m39873q(context, aVar, i, userAccountManager, UserAccountDataProvider.ProviderType.CAMPAIGNS);
        userAccountManager.f40569d.put(q4.getType(), q4);
        UserAccountDataProvider q5 = m39873q(context, aVar, i, userAccountManager, UserAccountDataProvider.ProviderType.PROMOTIONS);
        userAccountManager.f40569d.put(q5.getType(), q5);
        C13550c cVar = userAccountManager.f40567b;
        synchronized (cVar) {
            C13547a aVar2 = (C13547a) C13641g.m34133v(cVar.f33493a, "user_account.dat", C13547a.f33489c);
            if (aVar2 != null) {
                cVar.f33494b = aVar2;
            }
        }
        int i2 = 0;
        while (true) {
            C6313h<UserAccountDataProvider.ProviderType, UserAccountDataProvider<?>> hVar = userAccountManager.f40569d;
            if (i2 >= hVar.f19969d) {
                break;
            }
            hVar.mo22422l(i2).load();
            i2++;
        }
        if (userAccountManager.mo46576g()) {
            userAccountManager.mo46571b();
            try {
                userAccountManager.mo46577i(EnumSet.of(UserAccountDataProvider.ProviderType.PROFILE, UserAccountDataProvider.ProviderType.FAVORITES));
            } catch (Exception e) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Update user account data on loader failure", e));
            }
        } else {
            C17264g a = C17264g.m43277a(context);
            synchronized (a) {
                exists = a.f44628a.getFileStreamPath("user_profile.dat").exists();
            }
            if (!exists) {
                try {
                    userAccountManager.mo46577i(EnumSet.of(UserAccountDataProvider.ProviderType.PROFILE));
                } catch (Exception e2) {
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Update user account data on loader failure", e2));
                }
            } else {
                Tasks.call(MoovitExecutors.f37327IO, new C20784a(userAccountManager, EnumSet.of(UserAccountDataProvider.ProviderType.PROFILE)));
            }
        }
        userAccountManager.mo46573d().mo49434h(new C16748a());
        return userAccountManager;
    }
}
