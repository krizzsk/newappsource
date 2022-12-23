package p303wb;

import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.FloatBuffer;
import p303wb.C7015d;

/* renamed from: wb.f */
public final class C7019f {

    /* renamed from: i */
    public static final String[] f21837i = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: j */
    public static final String[] f21838j = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: k */
    public static final float[] f21839k = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* renamed from: l */
    public static final float[] f21840l = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: m */
    public static final float[] f21841m = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* renamed from: a */
    public int f21842a;

    /* renamed from: b */
    public C7020a f21843b;

    /* renamed from: c */
    public int f21844c;

    /* renamed from: d */
    public int f21845d;

    /* renamed from: e */
    public int f21846e;

    /* renamed from: f */
    public int f21847f;

    /* renamed from: g */
    public int f21848g;

    /* renamed from: h */
    public int f21849h;

    /* renamed from: wb.f$a */
    public static class C7020a {

        /* renamed from: a */
        public final int f21850a;

        /* renamed from: b */
        public final FloatBuffer f21851b;

        /* renamed from: c */
        public final FloatBuffer f21852c;

        /* renamed from: d */
        public final int f21853d;

        public C7020a(C7015d.C7017b bVar) {
            float[] fArr = bVar.f21835c;
            this.f21850a = fArr.length / 3;
            this.f21851b = C21100e.m49310H(fArr);
            this.f21852c = C21100e.m49310H(bVar.f21836d);
            int i = bVar.f21834b;
            if (i == 1) {
                this.f21853d = 5;
            } else if (i != 2) {
                this.f21853d = 4;
            } else {
                this.f21853d = 6;
            }
        }
    }

    /* renamed from: a */
    public static boolean m16512a(C7015d dVar) {
        C7015d.C7016a aVar = dVar.f21828a;
        C7015d.C7016a aVar2 = dVar.f21829b;
        C7015d.C7017b[] bVarArr = aVar.f21832a;
        if (bVarArr.length == 1 && bVarArr[0].f21833a == 0) {
            C7015d.C7017b[] bVarArr2 = aVar2.f21832a;
            if (bVarArr2.length == 1 && bVarArr2[0].f21833a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
