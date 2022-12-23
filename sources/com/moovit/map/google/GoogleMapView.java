package com.moovit.map.google;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.maps.MapView;
import com.moovit.commons.utils.UiUtils;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19737o;

public class GoogleMapView extends MapView {

    /* renamed from: b */
    public static final /* synthetic */ int f42542b = 0;

    /* renamed from: com.moovit.map.google.GoogleMapView$a */
    public class C16279a implements Runnable {
        public C16279a() {
        }

        public final void run() {
            GoogleMapView googleMapView = GoogleMapView.this;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(googleMapView) && GoogleMapView.this.getWindowVisibility() == 0) {
                GoogleMapView googleMapView2 = GoogleMapView.this;
                int i = GoogleMapView.f42542b;
                googleMapView2.getClass();
                TextureView textureView = (TextureView) UiUtils.m40251j(googleMapView2, TextureView.class);
                boolean z = false;
                if (!(textureView == null || textureView.getSurfaceTexture() == null)) {
                    z = true;
                }
                if (z) {
                    GoogleMapView.this.setBackground((Drawable) null);
                } else {
                    GoogleMapView.this.postDelayed(this, 100);
                }
            }
        }
    }

    public GoogleMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(C19737o.map_background_color);
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            setBackgroundResource(C19737o.map_background_color);
        } else if (i == 0) {
            postDelayed(new C16279a(), 100);
        }
    }

    public GoogleMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(C19737o.map_background_color);
    }
}
