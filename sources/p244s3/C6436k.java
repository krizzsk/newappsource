package p244s3;

import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.p044ui.AppboyContentCardsFragment;
import p030bo.app.C1582g0;
import p030bo.app.C1617k0;
import p030bo.app.C1692t0;
import p030bo.app.C1729y;

/* renamed from: s3.k */
public final /* synthetic */ class C6436k implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20126a;

    /* renamed from: b */
    public final /* synthetic */ Object f20127b;

    public /* synthetic */ C6436k(Object obj, int i) {
        this.f20126a = i;
        this.f20127b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20126a) {
            case 0:
                ((C1582g0) this.f20127b).m4179a((C1617k0) obj);
                return;
            case 1:
                ((C1729y) this.f20127b).m4913a((C1692t0) obj);
                return;
            default:
                ((AppboyContentCardsFragment) this.f20127b).lambda$onResume$1((ContentCardsUpdatedEvent) obj);
                return;
        }
    }
}
