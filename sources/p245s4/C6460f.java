package p245s4;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.List;

/* renamed from: s4.f */
public class C6460f extends C6457c {

    /* renamed from: e */
    public List<String> f20177e;

    public C6460f(Object obj) {
        super(2, obj);
    }

    public C6460f(String str) {
        super(1, str);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C6460f)) {
            return false;
        }
        List<String> list = this.f20177e;
        List<String> list2 = ((C6460f) obj).f20177e;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        if (this.f20177e == null) {
            sb = C13555b.m33972k("KeyWord(");
            sb.append(this.f20172b);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            obj = this.f20170d;
        } else {
            sb = C13555b.m33972k("KeyWord(");
            sb.append(this.f20172b);
            sb.append(", ");
            sb.append(this.f20170d);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            obj = this.f20177e;
        }
        sb.append(obj);
        sb.append(")");
        sb2.append(sb.toString());
        sb2.append(mo22576a());
        return sb2.toString();
    }
}
