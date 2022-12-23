package com.moovit.ticketing.validation.receipt.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.TextureView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.commons.view.TextureVideoHelper;
import java.util.Locale;
import p977zz.C20964s0;

class MediaTicketReceiptFragment$2 extends TextureVideoHelper {

    /* renamed from: h */
    public final /* synthetic */ TextureView f23590h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaTicketReceiptFragment$2(Context context, Uri uri, TextureView textureView) {
        super(context, uri, true);
        this.f23590h = textureView;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f23590h.getLayoutParams();
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        String str = C20964s0.f52718a;
        String format = String.format((Locale) null, "H,%s:%s", objArr);
        if (!format.equals(layoutParams.f3011G)) {
            layoutParams.height = 0;
            layoutParams.f3011G = format;
            this.f23590h.setLayoutParams(layoutParams);
        }
    }
}
