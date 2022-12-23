package com.unity3d.services.ads.gmascar;

import android.app.Activity;
import com.google.android.gms.ads.AdActivity;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import java.util.ArrayDeque;
import java.util.Arrays;
import oc0.C12981a;
import oc0.C12982b;
import oc0.C12984d;
import oc0.C12986f;
import oc0.C12987g;
import oc0.C12988h;
import p358af.C13437d;
import p584jl.C17885a;
import pc0.C13006a;
import pc0.C13008c;

public class GMAScarAdapterBridge {
    private final String SCAR_ACTIVITY_CLASS_NAME = AdActivity.CLASS_NAME;
    private AdapterStatusBridge _adapterStatusBridge = new AdapterStatusBridge();
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private InitializeListenerBridge _initializationListenerBridge = new InitializeListenerBridge();
    private InitializationStatusBridge _initializationStatusBridge = new InitializationStatusBridge();
    private MobileAdsBridge _mobileAdsBridge = new MobileAdsBridge();
    private PresenceDetector _presenceDetector = new PresenceDetector(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);
    private C12984d _scarAdapter;
    private ScarAdapterFactory _scarAdapterFactory = new ScarAdapterFactory();
    private ScarVersionFinder _scarVersionFinder;
    private WebViewErrorHandler _webViewErrorHandler = new WebViewErrorHandler();

    public GMAScarAdapterBridge() {
        GMAInitializer gMAInitializer = new GMAInitializer(this._mobileAdsBridge, this._initializationListenerBridge, this._initializationStatusBridge, this._adapterStatusBridge);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(this._mobileAdsBridge, this._presenceDetector, gMAInitializer);
        this._gmaEventSender = new GMAEventSender();
    }

    private C12984d getScarAdapterObject() {
        if (this._scarAdapter == null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(this._scarVersionFinder.getGoogleSdkVersionCode(), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(AdActivity.CLASS_NAME, new ArrayDeque(Arrays.asList(new GMAEvent[]{GMAEvent.FIRST_QUARTILE, GMAEvent.MIDPOINT, GMAEvent.THIRD_QUARTILE, GMAEvent.LAST_QUARTILE})), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(C13008c cVar) {
        this._scarAdapter.mo39874b(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.f32197e)));
    }

    private void loadRewardedAd(C13008c cVar) {
        this._scarAdapter.mo39873a(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.f32197e)));
    }

    public void getSCARSignals(String[] strArr, String[] strArr2) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler();
        C12984d dVar = this._scarAdapter;
        if (dVar != null) {
            ((C12987g) dVar).f32144a.mo39932a(ClientProperties.getApplicationContext(), strArr, strArr2, signalsHandler);
            return;
        }
        this._webViewErrorHandler.handleError((C12988h) new C12981a(GMAEvent.INTERNAL_SIGNALS_ERROR, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(GMAEvent.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        this._webViewErrorHandler.handleError((C12988h) new C12981a(GMAEvent.SCAR_NOT_PRESENT, new Object[0]));
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String str, String str2, String str3, String str4, int i) {
        C13008c cVar = new C13008c(str, str2, str4, str3, Integer.valueOf(i));
        C12984d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((C12988h) new C12981a(GMAEvent.INTERNAL_LOAD_ERROR, "Scar Adapter object is null", cVar.f32193a, cVar.f32194b, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void show(String str, String str2, boolean z) {
        C12984d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            Activity activity = ClientProperties.getActivity();
            C12987g gVar = (C12987g) scarAdapterObject;
            C13006a aVar = (C13006a) gVar.f32145b.get(str);
            if (aVar == null) {
                C12982b bVar = gVar.f32147d;
                String k = C13437d.m33706k("Could not find ad for placement '", str, "'.");
                bVar.handleError(new C12981a(GMAEvent.NO_AD_ERROR, k, str, str2, k));
                return;
            }
            gVar.f32146c = aVar;
            C17885a.m44461s0(new C12986f(gVar, activity));
            return;
        }
        this._webViewErrorHandler.handleError((C12988h) new C12981a(GMAEvent.INTERNAL_SHOW_ERROR, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
    }
}
