package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import kotlin.Metadata;
import p009a8.C0107g;
import p009a8.C0115o;

public final class CallbackManagerImpl implements C0107g {

    /* renamed from: b */
    public static final C2366b f8585b = new C2366b();

    /* renamed from: c */
    public static final HashMap f8586c = new HashMap();

    /* renamed from: a */
    public final HashMap f8587a = new HashMap();

    @Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, mo59060d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", "offset", "", "(Ljava/lang/String;II)V", "toRequestCode", "Login", "Share", "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "TournamentJoinDialog", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            C0115o oVar = C0115o.f331a;
            C2400g0.m6342g();
            return C0115o.f340j + this.offset;
        }
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$a */
    public interface C2365a {
        /* renamed from: a */
        boolean mo12522a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$b */
    public static final class C2366b {
        /* renamed from: a */
        public final synchronized void mo12523a(int i, C2365a aVar) {
            HashMap hashMap = CallbackManagerImpl.f8586c;
            if (!hashMap.containsKey(Integer.valueOf(i))) {
                hashMap.put(Integer.valueOf(i), aVar);
            }
        }
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        C2365a aVar;
        C2365a aVar2 = (C2365a) this.f8587a.get(Integer.valueOf(i));
        if (aVar2 != null) {
            return aVar2.mo12522a(i2, intent);
        }
        synchronized (f8585b) {
            aVar = (C2365a) f8586c.get(Integer.valueOf(i));
        }
        if (aVar == null) {
            return false;
        }
        return aVar.mo12522a(i2, intent);
    }
}
