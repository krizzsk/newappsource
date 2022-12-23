package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* renamed from: com.fyber.inneractive.sdk.activities.h */
public class C2538h implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f9025a;

    public C2538h(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f9025a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f9025a.finish();
    }
}
