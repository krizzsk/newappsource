package mj0;

import org.simpleframework.xml.transform.InvalidFormatException;

/* renamed from: mj0.j */
public final class C24404j implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61765a;

    public /* synthetic */ C24404j(int i) {
        this.f61765a = i;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61765a) {
            case 0:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new InvalidFormatException("Cannot convert '%s' to a character", str);
            default:
                return Integer.valueOf(str);
        }
    }
}
