package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.i */
public class C2539i implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f9026a;

    public C2539i(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f9026a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m9902a("Error: video can not be played.", new Object[0]);
        this.f9026a.finish();
        return false;
    }
}
