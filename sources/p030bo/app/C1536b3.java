package p030bo.app;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.InAppMessageImmersiveBase;
import com.appboy.support.JsonUtils;
import org.json.JSONObject;

/* renamed from: bo.app.b3 */
public class C1536b3 {

    /* renamed from: a */
    public final Integer f5541a;

    /* renamed from: b */
    public final Integer f5542b;

    /* renamed from: c */
    public final Integer f5543c;

    /* renamed from: d */
    public final Integer f5544d;

    /* renamed from: e */
    public final Integer f5545e;

    /* renamed from: f */
    public final Integer f5546f;

    /* renamed from: g */
    public final Integer f5547g;

    public C1536b3(JSONObject jSONObject) {
        this(JsonUtils.getColorIntegerOrNull(jSONObject, "bg_color"), JsonUtils.getColorIntegerOrNull(jSONObject, "text_color"), JsonUtils.getColorIntegerOrNull(jSONObject, "close_btn_color"), JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_COLOR), JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageBase.ICON_BG_COLOR), JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageImmersiveBase.HEADER_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(jSONObject, InAppMessageImmersiveBase.FRAME_COLOR));
    }

    /* renamed from: a */
    public Integer mo5915a() {
        return this.f5541a;
    }

    /* renamed from: b */
    public Integer mo5916b() {
        return this.f5543c;
    }

    /* renamed from: c */
    public Integer mo5917c() {
        return this.f5547g;
    }

    /* renamed from: d */
    public Integer mo5918d() {
        return this.f5546f;
    }

    /* renamed from: e */
    public Integer mo5919e() {
        return this.f5545e;
    }

    /* renamed from: f */
    public Integer mo5920f() {
        return this.f5544d;
    }

    /* renamed from: g */
    public Integer mo5921g() {
        return this.f5542b;
    }

    public C1536b3(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f5541a = num;
        this.f5542b = num2;
        this.f5543c = num3;
        this.f5544d = num4;
        this.f5545e = num5;
        this.f5546f = num6;
        this.f5547g = num7;
    }
}
