package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a */
    public VideoView f9015a;

    /* renamed from: b */
    public int f9016b = 0;

    /* renamed from: c */
    public final MediaPlayer.OnPreparedListener f9017c = new C2530a();

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore$a */
    public class C2530a implements MediaPlayer.OnPreparedListener {
        public C2530a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.m9902a("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = InneractiveRichMediaVideoPlayerActivityCore.this;
            inneractiveRichMediaVideoPlayerActivityCore.f9015a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f9016b);
            InneractiveRichMediaVideoPlayerActivityCore.this.f9015a.start();
        }
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra(VIDEO_URL, str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m9902a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(RecyclerView.C1119a0.FLAG_IGNORE);
    }

    public void onCreate(Bundle bundle) {
        String str;
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9016b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C2524R.layout.ia_rich_media_video);
        this.f9015a = (VideoView) findViewById(C2524R.C2526id.mraid_video_view);
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra(VIDEO_URL)) {
            str = null;
        } else {
            str = intent.getStringExtra(VIDEO_URL);
        }
        if (TextUtils.isEmpty(str)) {
            IAlog.m9902a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f9015a.setVideoPath(str);
            this.f9015a.setOnCompletionListener(new C2538h(this));
            this.f9015a.setOnErrorListener(new C2539i(this));
            this.f9015a.setOnPreparedListener(this.f9017c);
        }
        findViewById(C2524R.C2526id.ia_iv_close_button).setOnClickListener(new C2537g(this));
    }

    public void onPause() {
        super.onPause();
        this.f9016b = this.f9015a.getCurrentPosition();
        this.f9015a.pause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f9015a;
        if (videoView == null) {
            i = 0;
        } else {
            i = videoView.getCurrentPosition();
        }
        bundle.putInt(VIDEO_CURRENT_POSITION, i);
    }
}
