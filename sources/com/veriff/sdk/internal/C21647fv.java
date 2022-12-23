package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;

/* renamed from: com.veriff.sdk.internal.fv */
public class C21647fv {

    /* renamed from: a */
    public static final String[] f54668a = {"merged_ui_temp_android", "nfc_enabled"};

    /* renamed from: com.veriff.sdk.internal.fv$a */
    public enum C21648a {
        SESSION(21, "session", r5),
        SYSTEM(22, "system", r15),
        UPLOADING(23, "uploading", r5),
        NETWORK(24, ServerParameters.NETWORK, r5),
        CAMERA(26, "camera", r5),
        AUDIO(27, "audio", r5),
        CAMERA_START(28, "camera start", r5),
        VERSION_UNSUPPORTED(29, "version unsupported", r5),
        NO_NFC(30, "no_nfc", r5),
        DEFAULT(6, "default", C21649b.SEVERITY_LOW);
        

        /* renamed from: k */
        public final int f54680k;

        /* renamed from: l */
        public final String f54681l;

        /* renamed from: m */
        public final C21649b f54682m;

        private C21648a(int i, String str, C21649b bVar) {
            this.f54680k = i;
            this.f54681l = str;
            this.f54682m = bVar;
        }

        /* renamed from: a */
        public static C21648a m52556a(int i) {
            for (C21648a aVar : values()) {
                if (aVar.f54680k == i) {
                    return aVar;
                }
            }
            return DEFAULT;
        }
    }

    /* renamed from: com.veriff.sdk.internal.fv$b */
    public enum C21649b {
        SEVERITY_LOW("low"),
        SEVERITY_MEDIUM("medium"),
        SEVERITY_HIGH("high");
        

        /* renamed from: d */
        public final String f54687d;

        private C21649b(String str) {
            this.f54687d = str;
        }
    }
}
