package p468en;

import ce0.C21100e;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p364al.C13487h;
import p583jk.C17867b;
import p583jk.C17873f;
import p725pj.C18926a;
import p961zj.C20871a;

/* renamed from: en.c */
public final class C16843c {

    /* renamed from: a */
    public final C17867b.C17868a f43836a;

    /* renamed from: b */
    public final C17873f f43837b;

    public C16843c(C17867b.C17868a aVar, C17873f fVar) {
        this.f43836a = aVar;
        this.f43837b = fVar;
    }

    /* renamed from: a */
    public final C13487h<JSONObject> mo49504a(String str) {
        C13487h hVar;
        if (C21100e.m49352m0(str)) {
            hVar = new C13487h(null, new C20871a(C20871a.f52604e, "Token is null or empty."));
        } else {
            String[] split = str.split("\\.");
            if (split.length < 3) {
                hVar = new C13487h(null, new C20871a(C20871a.f52605f, "Malformed JWT. Not in 3 parts."));
            } else {
                String str2 = split[1];
                int length = str2.length() % 4;
                if (length != 0) {
                    char[] cArr = new char[(4 - length)];
                    Arrays.fill(cArr, '=');
                    str2 = str2 + new String(cArr);
                }
                try {
                    this.f43836a.getClass();
                    hVar = new C13487h(new String(C17867b.C17868a.m44272a(str2), StandardCharsets.UTF_8), (C18926a) null);
                } catch (IllegalArgumentException e) {
                    Integer num = C20871a.f52606g;
                    this.f43837b.getClass();
                    hVar = new C13487h(null, new C20871a(C17873f.m44275b(e), num, "Failed to decode from base64."));
                }
            }
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, hVar.f33366b);
        }
        try {
            return new C13487h<>(new JSONObject((String) hVar.f33365a), (C18926a) null);
        } catch (JSONException e2) {
            Integer num2 = C20871a.f52607h;
            this.f43837b.getClass();
            return new C13487h<>(null, new C20871a(C17873f.m44275b(e2), num2, "Failed to read json."));
        }
    }
}
