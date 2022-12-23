package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.c */
public class C3448c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3433a f12294a;

    public C3448c(C3433a aVar) {
        this.f12294a = aVar;
    }

    public void run() {
        C3433a aVar = this.f12294a;
        String c = aVar.mo14639c();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) aVar.f12256a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        IAlog.m9902a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.mo14639c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 0.1f;
        }
        aVar.setVolume(f, f);
        IAlog.m9905d(c + "timelog: " + "unmute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
