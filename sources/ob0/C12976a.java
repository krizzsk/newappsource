package ob0;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import nb0.C12947k;

/* renamed from: ob0.a */
public final class C12976a<T> extends C8011k<T> {

    /* renamed from: a */
    public final C8011k<T> f32130a;

    public C12976a(C8011k<T> kVar) {
        this.f32130a = kVar;
    }

    /* renamed from: a */
    public final T mo11093a(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo24986H() != JsonReader.Token.NULL) {
            return this.f32130a.mo11093a(jsonReader);
        }
        jsonReader.mo24984B();
        return null;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, T t) throws IOException {
        if (t == null) {
            kVar.mo25078x();
        } else {
            this.f32130a.mo11094e(kVar, t);
        }
    }

    public final String toString() {
        return this.f32130a + ".nullSafe()";
    }
}
