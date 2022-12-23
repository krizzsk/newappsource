package p194o5;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.p044ui.AppboyFeedFragment;

/* renamed from: o5.c */
public final /* synthetic */ class C5992c implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ AppboyFeedFragment f19149a;

    /* renamed from: b */
    public final /* synthetic */ ListView f19150b;

    public /* synthetic */ C5992c(AppboyFeedFragment appboyFeedFragment, ListView listView) {
        this.f19149a = appboyFeedFragment;
        this.f19150b = listView;
    }

    public final void trigger(Object obj) {
        this.f19149a.lambda$onActivityCreated$3(this.f19150b, (FeedUpdatedEvent) obj);
    }
}
