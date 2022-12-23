package p244s3;

import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import p030bo.app.C1659p0;
import p030bo.app.C1729y;

/* renamed from: s3.y */
public final /* synthetic */ class C6450y implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20152a;

    /* renamed from: b */
    public final /* synthetic */ Object f20153b;

    public /* synthetic */ C6450y(Object obj, int i) {
        this.f20152a = i;
        this.f20153b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20152a) {
            case 0:
                ((C1729y) this.f20153b).m4912a((C1659p0) obj);
                return;
            default:
                ((AppboyInAppMessageManager) this.f20153b).lambda$createInAppMessageEventSubscriber$1((InAppMessageEvent) obj);
                return;
        }
    }
}
