package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p290vb.C6939e;
import p290vb.C6940f;

public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements C6940f {

    /* renamed from: b */
    public final C4079a f14630b;

    /* renamed from: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$a */
    public static final class C4079a implements GLSurfaceView.Renderer {

        /* renamed from: k */
        public static final float[] f14631k = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.213f, 2.112f, 1.793f, -0.533f, BitmapDescriptorFactory.HUE_RED};

        /* renamed from: l */
        public static final String[] f14632l = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: m */
        public static final FloatBuffer f14633m = C21100e.m49310H(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b */
        public final GLSurfaceView f14634b;

        /* renamed from: c */
        public final int[] f14635c = new int[3];

        /* renamed from: d */
        public final int[] f14636d = new int[3];

        /* renamed from: e */
        public final int[] f14637e = new int[3];

        /* renamed from: f */
        public final int[] f14638f = new int[3];

        /* renamed from: g */
        public final AtomicReference<C6939e> f14639g = new AtomicReference<>();

        /* renamed from: h */
        public int f14640h;

        /* renamed from: i */
        public int f14641i;

        /* renamed from: j */
        public C6939e f14642j;

        public C4079a(GLSurfaceView gLSurfaceView) {
            this.f14634b = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f14637e;
                this.f14638f[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void onDrawFrame(GL10 gl10) {
            C6939e andSet = this.f14639g.getAndSet((Object) null);
            if (andSet != null || this.f14642j != null) {
                if (andSet != null) {
                    C6939e eVar = this.f14642j;
                    if (eVar != null) {
                        eVar.getClass();
                        throw null;
                    }
                    this.f14642j = andSet;
                }
                this.f14642j.getClass();
                GLES20.glUniformMatrix3fv(this.f14641i, 1, false, f14631k, 0);
                throw null;
            }
        }

        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int C = C21100e.m49300C("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f14640h = C;
            GLES20.glUseProgram(C);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f14640h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f14633m);
            this.f14636d[0] = GLES20.glGetAttribLocation(this.f14640h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f14636d[0]);
            this.f14636d[1] = GLES20.glGetAttribLocation(this.f14640h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f14636d[1]);
            this.f14636d[2] = GLES20.glGetAttribLocation(this.f14640h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f14636d[2]);
            C21100e.m49353n();
            this.f14641i = GLES20.glGetUniformLocation(this.f14640h, "mColorConversion");
            C21100e.m49353n();
            GLES20.glGenTextures(3, this.f14635c, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f14640h, f14632l[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.f14635c[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            C21100e.m49353n();
            C21100e.m49353n();
        }
    }

    public VideoDecoderGLSurfaceView() {
        throw null;
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4079a aVar = new C4079a(this);
        this.f14630b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public C6940f getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(C6939e eVar) {
        C4079a aVar = this.f14630b;
        if (aVar.f14639g.getAndSet(eVar) == null) {
            aVar.f14634b.requestRender();
            return;
        }
        throw null;
    }
}
