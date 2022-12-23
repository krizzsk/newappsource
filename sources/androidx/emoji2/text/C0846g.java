package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import androidx.emoji2.text.C0836f;
import androidx.emoji2.text.C0852l;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.room.C1257b;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.p044ui.AppboyFeedFragment;
import com.facebook.FacebookException;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.p414v1.C14523g;
import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p159l8.C5639a;
import p262t8.C6606a;
import p626lf.C18200a;
import p766rf.C19260d;

/* renamed from: androidx.emoji2.text.g */
public final /* synthetic */ class C0846g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f3508b;

    /* renamed from: c */
    public final /* synthetic */ Object f3509c;

    /* renamed from: d */
    public final /* synthetic */ Object f3510d;

    /* renamed from: e */
    public final /* synthetic */ Object f3511e;

    public /* synthetic */ C0846g(int i, Object obj, Object obj2, Object obj3) {
        this.f3508b = i;
        this.f3509c = obj;
        this.f3510d = obj2;
        this.f3511e = obj3;
    }

    public final void run() {
        Class<RemoteServiceWrapper> cls;
        switch (this.f3508b) {
            case 0:
                EmojiCompatInitializer.C0826b bVar = (EmojiCompatInitializer.C0826b) this.f3509c;
                C0836f.C0844h hVar = (C0836f.C0844h) this.f3510d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3511e;
                bVar.getClass();
                try {
                    C0852l a = C0830c.m2523a(bVar.f3485a);
                    if (a != null) {
                        C0852l.C0854b bVar2 = (C0852l.C0854b) a.f3503a;
                        synchronized (bVar2.f3534d) {
                            bVar2.f3536f = threadPoolExecutor;
                        }
                        a.f3503a.mo3613a(new C0847h(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.mo3617a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((C1257b) this.f3509c).getClass();
                throw null;
            case 2:
                FeedUpdatedEvent feedUpdatedEvent = (FeedUpdatedEvent) this.f3510d;
                ((AppboyFeedFragment) this.f3509c).lambda$null$2(feedUpdatedEvent, (ListView) this.f3511e);
                return;
            case 3:
                Context context = (Context) this.f3509c;
                String str = (String) this.f3510d;
                String str2 = (String) this.f3511e;
                C5639a aVar = C5639a.f18388a;
                Class<C5639a> cls2 = C5639a.class;
                if (!C6606a.m15601b(cls2)) {
                    try {
                        C24362h.m61211f(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                        String k = C24362h.m61216k("pingForOnDevice", str2);
                        if (sharedPreferences.getLong(k, 0) == 0) {
                            RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f8563a;
                            cls = RemoteServiceWrapper.class;
                            if (!C6606a.m15601b(cls)) {
                                C24362h.m61211f(str2, "applicationId");
                                RemoteServiceWrapper.f8563a.mo12504b(RemoteServiceWrapper.EventType.MOBILE_APP_INSTALL, str2, EmptyList.f60173b);
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(k, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C6606a.m15600a(cls2, th2);
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler) this.f3509c;
                LoginClient.Request request = (LoginClient.Request) this.f3510d;
                Bundle bundle = (Bundle) this.f3511e;
                C24362h.m61211f(customTabLoginMethodHandler, "this$0");
                C24362h.m61211f(request, "$request");
                C24362h.m61211f(bundle, "$values");
                try {
                    customTabLoginMethodHandler.mo12684m(bundle, request);
                    customTabLoginMethodHandler.mo12691s(request, bundle, (FacebookException) null);
                    return;
                } catch (FacebookException e) {
                    customTabLoginMethodHandler.mo12691s(request, (Bundle) null, e);
                    return;
                }
            case 5:
                ((EnhancedIntentService) this.f3509c).lambda$processIntent$0((Intent) this.f3510d, (TaskCompletionSource) this.f3511e);
                return;
            default:
                C19260d dVar = (C19260d) this.f3509c;
                C18200a aVar2 = C19260d.f48933s;
                dVar.getClass();
                C14523g.C14525b z = C14523g.m36191z();
                z.mo43956p();
                C14523g.m36190w((C14523g) z.f36809c, (NetworkRequestMetric) this.f3510d);
                dVar.mo51681c(z, (ApplicationProcessState) this.f3511e);
                return;
        }
    }
}
