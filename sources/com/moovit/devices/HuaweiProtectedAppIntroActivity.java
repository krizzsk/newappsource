package com.moovit.devices;

import android.net.Uri;
import android.widget.VideoView;
import b10.C13565a;
import com.moovit.MoovitActivity;
import p583jk.C17884p;
import p824tp.C19745w;

public final class HuaweiProtectedAppIntroActivity extends MoovitActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f41469X = 0;

    /* renamed from: U */
    public VideoView f41470U;

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        VideoView videoView = this.f41470U;
        if (videoView != null && videoView.isPlaying()) {
            this.f41470U.setVisibility(4);
        }
    }

    /* JADX WARNING: type inference failed for: r5v18, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19425e2(android.os.Bundle r5) {
        /*
            r4 = this;
            super.mo19425e2(r5)
            int r5 = p824tp.C19742t.huawei_settings_info_layout
            r4.setContentView((int) r5)
            int r5 = p824tp.C19740r.tool_bar
            android.view.View r5 = r4.findViewById(r5)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r4.setSupportActionBar(r5)
            androidx.appcompat.app.ActionBar r5 = r4.getSupportActionBar()
            r0 = 1
            if (r5 == 0) goto L_0x0022
            r5.mo791m(r0)
            int r1 = p824tp.C19739q.ic_close_24_control_normal
            r5.mo795q(r1)
        L_0x0022:
            int r5 = p824tp.C19740r.button
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            sx.d r1 = new sx.d
            r2 = 2
            r1.<init>(r4, r2)
            r5.setOnClickListener(r1)
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            int r5 = r5.labelRes
            r1 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = r4.getString(r5)
            goto L_0x0042
        L_0x0041:
            r5 = r1
        L_0x0042:
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = ""
        L_0x0046:
            int r2 = p824tp.C19740r.message
            android.view.View r2 = r4.findViewById(r2)
            com.moovit.commons.view.FormatTextView r2 = (com.moovit.commons.view.FormatTextView) r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            r2.setArguments(r0)
            tp.i r5 = p824tp.C19731i.m47197a(r4)
            tp.a r5 = r5.f50171a
            java.lang.String r5 = r5.f50155f
            java.lang.String r0 = "moovit"
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L_0x006f
            int r5 = p824tp.C19740r.video_view
            android.view.View r5 = r4.findViewById(r5)
            r1 = r5
            android.widget.VideoView r1 = (android.widget.VideoView) r1
        L_0x006f:
            r4.f41470U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.devices.HuaweiProtectedAppIntroActivity.mo19425e2(android.os.Bundle):void");
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        if (this.f41470U != null) {
            Uri V = C17884p.m44351V(getResources(), C19745w.mov_hauwei_protected);
            this.f41470U.setVisibility(0);
            this.f41470U.setVideoURI(V);
            this.f41470U.setOnPreparedListener(new C13565a());
            this.f41470U.start();
            this.f41470U.setZOrderOnTop(true);
        }
    }
}
