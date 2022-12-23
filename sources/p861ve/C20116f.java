package p861ve;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C14456b;
import java.io.IOException;
import p789se.C19448b;
import p789se.C19452f;

/* renamed from: ve.f */
public final class C20116f implements C19452f {

    /* renamed from: a */
    public boolean f51032a = false;

    /* renamed from: b */
    public boolean f51033b = false;

    /* renamed from: c */
    public C19448b f51034c;

    /* renamed from: d */
    public final C14456b f51035d;

    public C20116f(C14456b bVar) {
        this.f51035d = bVar;
    }

    public final C19452f add(String str) throws IOException {
        if (!this.f51032a) {
            this.f51032a = true;
            this.f51035d.mo43345a(this.f51034c, str, this.f51033b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final C19452f add(boolean z) throws IOException {
        if (!this.f51032a) {
            this.f51032a = true;
            this.f51035d.mo43354d(this.f51034c, z ? 1 : 0, this.f51033b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
