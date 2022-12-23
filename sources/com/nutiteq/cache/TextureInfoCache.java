package com.nutiteq.cache;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import na0.C12935l;
import ya0.C13277d;

public final class TextureInfoCache {

    /* renamed from: a */
    public int f24165a = 5242880;

    /* renamed from: b */
    public int f24166b = 0;

    /* renamed from: c */
    public int f24167c = 0;

    /* renamed from: d */
    public LinkedHashMap<C12935l, C7976a> f24168d = new LinkedHashMap<C12935l, C7976a>() {
        public final boolean removeEldestEntry(Map.Entry<C12935l, C7976a> entry) {
            TextureInfoCache textureInfoCache = TextureInfoCache.this;
            if (textureInfoCache.f24166b <= textureInfoCache.f24165a) {
                return false;
            }
            textureInfoCache.f24166b -= entry.getValue().f24170a;
            TextureInfoCache.this.f24169e.put(entry.getKey(), entry.getValue());
            return true;
        }
    };

    /* renamed from: e */
    public HashMap f24169e = new HashMap();

    /* renamed from: com.nutiteq.cache.TextureInfoCache$a */
    public class C7976a {

        /* renamed from: a */
        public final int f24170a;

        /* renamed from: b */
        public int f24171b;

        /* renamed from: c */
        public int f24172c;

        public C7976a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f24170a = (((bitmap.getHeight() * bitmap.getRowBytes()) * 4) * 4) / 3;
                return;
            }
            this.f24170a = 0;
        }
    }

    /* renamed from: a */
    public final int mo24910a(GL10 gl10, C12935l lVar) {
        int i;
        C7976a aVar = this.f24168d.get(lVar);
        if (aVar == null && (aVar = (C7976a) this.f24169e.remove(lVar)) != null) {
            this.f24166b += aVar.f24170a;
            this.f24168d.put(lVar, aVar);
        }
        if (aVar != null) {
            aVar.f24172c = this.f24167c;
            return aVar.f24171b;
        }
        synchronized (lVar) {
            Bitmap bitmap = lVar.f32059a;
            if (bitmap != null) {
                aVar = new C7976a(bitmap);
                aVar.f24171b = C13277d.m33403a(gl10, lVar.f32059a);
                int i2 = 10497;
                if (lVar.f32064f == 0) {
                    i = 33071;
                } else {
                    i = 10497;
                }
                gl10.glTexParameterx(3553, 10242, i);
                if (lVar.f32065g == 0) {
                    i2 = 33071;
                }
                gl10.glTexParameterx(3553, 10243, i2);
                this.f24166b += aVar.f24170a;
                this.f24168d.put(lVar, aVar);
                aVar.f24172c = this.f24167c;
            }
        }
        if (aVar != null) {
            return aVar.f24171b;
        }
        return 0;
    }
}
