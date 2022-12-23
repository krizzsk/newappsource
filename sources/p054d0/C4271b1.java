package p054d0;

import android.util.Size;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: d0.b1 */
public final class C4271b1 implements SessionConfig.C0567c {

    /* renamed from: a */
    public final /* synthetic */ String f15183a;

    /* renamed from: b */
    public final /* synthetic */ Size f15184b;

    /* renamed from: c */
    public final /* synthetic */ VideoCapture f15185c;

    public C4271b1(VideoCapture videoCapture, String str, Size size) {
        this.f15185c = videoCapture;
        this.f15183a = str;
        this.f15184b = size;
    }

    public final void onError() {
        if (this.f15185c.mo2374i(this.f15183a)) {
            this.f15185c.mo2395C(this.f15184b, this.f15183a);
            this.f15185c.mo2378m();
        }
    }
}
