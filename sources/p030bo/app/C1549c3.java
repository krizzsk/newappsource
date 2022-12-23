package p030bo.app;

import com.appboy.models.MessageButton;
import com.appboy.support.JsonUtils;
import org.json.JSONObject;

/* renamed from: bo.app.c3 */
public class C1549c3 {

    /* renamed from: a */
    public final Integer f5580a;

    /* renamed from: b */
    public final Integer f5581b;

    /* renamed from: c */
    public final Integer f5582c;

    public C1549c3(JSONObject jSONObject) {
        this(JsonUtils.getColorIntegerOrNull(jSONObject, "bg_color"), JsonUtils.getColorIntegerOrNull(jSONObject, "text_color"), JsonUtils.getColorIntegerOrNull(jSONObject, MessageButton.BORDER_COLOR));
    }

    /* renamed from: a */
    public Integer mo5954a() {
        return this.f5580a;
    }

    /* renamed from: b */
    public Integer mo5955b() {
        return this.f5582c;
    }

    /* renamed from: c */
    public Integer mo5956c() {
        return this.f5581b;
    }

    public C1549c3(Integer num, Integer num2, Integer num3) {
        this.f5580a = num;
        this.f5581b = num2;
        this.f5582c = num3;
    }
}
