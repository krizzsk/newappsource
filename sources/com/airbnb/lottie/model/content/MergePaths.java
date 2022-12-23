package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p059d5.C4370b;
import p107h5.C5055c;
import p321y4.C7314b;
import p321y4.C7323k;

public final class MergePaths implements C4370b {

    /* renamed from: a */
    public final MergePathsMode f6543a;

    /* renamed from: b */
    public final boolean f6544b;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f6543a = mergePathsMode;
        this.f6544b = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        if (lVar.f6492m) {
            return new C7323k(this);
        }
        C5055c.m12896b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MergePaths{mode=");
        k.append(this.f6543a);
        k.append('}');
        return k.toString();
    }
}
