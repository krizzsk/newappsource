package e40;

import com.moovit.navigation.event.NavigableUpdateEvent;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationReturnEvent;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;

/* renamed from: e40.a */
public interface C4553a {
    /* renamed from: a */
    void mo19864a(NavigationProgressEvent navigationProgressEvent);

    /* renamed from: b */
    void mo19865b(NavigableUpdateEvent navigableUpdateEvent);

    /* renamed from: c */
    void mo19866c(NavigationStopEvent navigationStopEvent);

    /* renamed from: d */
    void mo19867d(NavigationStartEvent navigationStartEvent);

    /* renamed from: e */
    void mo19868e(NavigationDeviationEvent navigationDeviationEvent);

    /* renamed from: f */
    void mo19869f(NavigationReturnEvent navigationReturnEvent);
}
