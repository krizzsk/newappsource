package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import oc0.C12983c;
import pc0.C13008c;

public abstract class ScarAdHandlerBase implements C12983c {
    public final EventSubject<GMAEvent> _eventSubject;
    public final GMAEventSender _gmaEventSender = new GMAEventSender();
    public final C13008c _scarAdMetadata;

    public ScarAdHandlerBase(C13008c cVar, EventSubject<GMAEvent> eventSubject) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
    }

    public void onAdClosed() {
        this._gmaEventSender.send(GMAEvent.AD_CLOSED, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        GMAEvent gMAEvent = GMAEvent.LOAD_ERROR;
        C13008c cVar = this._scarAdMetadata;
        gMAEventSender.send(gMAEvent, cVar.f32193a, cVar.f32194b, str, Integer.valueOf(i));
    }

    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        GMAEvent gMAEvent = GMAEvent.AD_LOADED;
        C13008c cVar = this._scarAdMetadata;
        gMAEventSender.send(gMAEvent, cVar.f32193a, cVar.f32194b);
    }

    public void onAdOpened() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, GMAEvent.AD_STARTED, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<GMAEvent>() {
            public void onNextEvent(GMAEvent gMAEvent) {
                ScarAdHandlerBase.this._gmaEventSender.send(gMAEvent, new Object[0]);
            }
        });
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(GMAEvent.AD_SKIPPED, new Object[0]);
    }
}
