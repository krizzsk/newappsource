package androidx.camera.core.impl;

public abstract class SurfaceConfig {

    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        public final int mId;

        private ConfigSize(int i) {
            this.mId = i;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* renamed from: a */
    public abstract ConfigSize mo2465a();

    /* renamed from: b */
    public abstract ConfigType mo2466b();
}
