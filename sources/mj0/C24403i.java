package mj0;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.GregorianCalendar;
import org.simpleframework.xml.transform.C24678a;

/* renamed from: mj0.i */
public final class C24403i implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61763a;

    /* renamed from: b */
    public final Object f61764b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24403i() {
        this(1, Date.class);
        this.f61763a = 1;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61763a) {
            case 0:
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                Class cls = (Class) this.f61764b;
                if (cls == Character.TYPE) {
                    return charArray;
                }
                Object newInstance = Array.newInstance(cls, length);
                for (int i = 0; i < length; i++) {
                    Array.set(newInstance, i, Character.valueOf(charArray[i]));
                }
                return newInstance;
            default:
                Date b = ((C24678a) this.f61764b).mo60538a(str);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                if (b != null) {
                    gregorianCalendar.setTime(b);
                }
                return gregorianCalendar;
        }
    }

    public C24403i(int i, Class cls) {
        this.f61763a = i;
        if (i != 1) {
            this.f61764b = cls;
        } else {
            this.f61764b = new C24678a(cls);
        }
    }
}
