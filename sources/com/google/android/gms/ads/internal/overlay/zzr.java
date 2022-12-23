package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.C25559R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzr extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */
    public final ImageButton zza;
    private final zzaa zzb;

    public zzr(Context context, zzq zzq, zzaa zzaa) {
        super(context);
        zzp zzp;
        this.zzb = zzaa;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzaw.zzb();
        int zzv = zzcfb.zzv(context, zzq.zza);
        zzaw.zzb();
        int zzv2 = zzcfb.zzv(context, 0);
        zzaw.zzb();
        int zzv3 = zzcfb.zzv(context, zzq.zzb);
        zzaw.zzb();
        imageButton.setPadding(zzv, zzv2, zzv3, zzcfb.zzv(context, zzq.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzaw.zzb();
        int zzv4 = zzcfb.zzv(context, zzq.zzd + zzq.zza + zzq.zzb);
        zzaw.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzv4, zzcfb.zzv(context, zzq.zzd + zzq.zzc), 17));
        long longValue = ((Long) zzay.zzc().zzb(zzbhy.zzaW)).longValue();
        if (longValue > 0) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzaX)).booleanValue()) {
                zzp = new zzp(this);
            } else {
                zzp = null;
            }
            imageButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzp);
        }
    }

    private final void zzc() {
        String str = (String) zzay.zzc().zzb(zzbhy.zzaV);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(17301527);
            return;
        }
        Resources zzd = zzt.zzo().zzd();
        if (zzd != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zzd.getDrawable(C25559R.C25560drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zzd.getDrawable(C25559R.C25560drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                zzcfi.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.zza.setImageResource(17301527);
                return;
            }
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    public final void onClick(View view) {
        zzaa zzaa = this.zzb;
        if (zzaa != null) {
            zzaa.zzbJ();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
            if (((Long) zzay.zzc().zzb(zzbhy.zzaW)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
