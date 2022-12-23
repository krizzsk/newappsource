package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import p009a8.C0111k;
import p237r9.C6273f;
import p358af.C13436c;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p743qd.C19107d;
import p838uf.C19904f;
import p838uf.C19906g;
import p885we.C20294d;
import p933ye.C20713a;

@KeepForSdk
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C13786c cVar) {
        return new FirebaseMessaging((C19107d) cVar.mo314b(C19107d.class), (C20713a) cVar.mo314b(C20713a.class), cVar.mo40719h(C19906g.class), cVar.mo40719h(HeartBeatInfo.class), (C13436c) cVar.mo314b(C13436c.class), (C6273f) cVar.mo314b(C6273f.class), (C20294d) cVar.mo314b(C20294d.class));
    }

    @Keep
    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<FirebaseMessaging> a = C13784b.m34444a(FirebaseMessaging.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(0, 0, C20713a.class));
        a.mo40715a(new C13800m(0, 1, C19906g.class));
        a.mo40715a(new C13800m(0, 1, HeartBeatInfo.class));
        a.mo40715a(new C13800m(0, 0, C6273f.class));
        a.mo40715a(new C13800m(1, 0, C13436c.class));
        a.mo40715a(new C13800m(1, 0, C20294d.class));
        a.f33944e = new C0111k(0);
        a.mo40717c(1);
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-fcm", "23.0.8")});
    }
}
