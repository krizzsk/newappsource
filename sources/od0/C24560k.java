package od0;

import android.content.ContentValues;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.Map;
import p509gg.C17189a;
import td0.C24931b;

/* renamed from: od0.k */
public final class C24560k implements C24931b<C24559j> {

    /* renamed from: a */
    public Gson f62250a = new GsonBuilder().create();

    /* renamed from: b */
    public Type f62251b = new C24561a().f44432b;

    /* renamed from: c */
    public Type f62252c = new C24562b().f44432b;

    /* renamed from: d */
    public Type f62253d = new C24563c().f44432b;

    /* renamed from: e */
    public Type f62254e = new C24564d().f44432b;

    /* renamed from: od0.k$a */
    public class C24561a extends C17189a<Map<String, Boolean>> {
    }

    /* renamed from: od0.k$b */
    public class C24562b extends C17189a<Map<String, Integer>> {
    }

    /* renamed from: od0.k$c */
    public class C24563c extends C17189a<Map<String, Long>> {
    }

    /* renamed from: od0.k$d */
    public class C24564d extends C17189a<Map<String, String>> {
    }

    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24559j jVar = (C24559j) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", jVar.f62249e);
        contentValues.put("bools", this.f62250a.toJson((Object) jVar.f62246b, this.f62251b));
        contentValues.put("ints", this.f62250a.toJson((Object) jVar.f62247c, this.f62252c));
        contentValues.put("longs", this.f62250a.toJson((Object) jVar.f62248d, this.f62253d));
        contentValues.put("strings", this.f62250a.toJson((Object) jVar.f62245a, this.f62254e));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "cookie";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        C24559j jVar = new C24559j(contentValues.getAsString("item_id"));
        jVar.f62246b = (Map) this.f62250a.fromJson(contentValues.getAsString("bools"), this.f62251b);
        jVar.f62248d = (Map) this.f62250a.fromJson(contentValues.getAsString("longs"), this.f62253d);
        jVar.f62247c = (Map) this.f62250a.fromJson(contentValues.getAsString("ints"), this.f62252c);
        jVar.f62245a = (Map) this.f62250a.fromJson(contentValues.getAsString("strings"), this.f62254e);
        return jVar;
    }
}
