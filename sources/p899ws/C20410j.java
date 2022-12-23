package p899ws;

import ce0.C21100e;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.help.feedback.FeedbackType;
import java.util.List;

/* renamed from: ws.j */
public final class C20410j {

    /* renamed from: a */
    public final String f51710a;

    /* renamed from: b */
    public final CategoryType f51711b;

    /* renamed from: c */
    public final FeedbackType f51712c;

    /* renamed from: d */
    public final String f51713d;

    /* renamed from: e */
    public final String f51714e;

    /* renamed from: f */
    public final String f51715f;

    /* renamed from: g */
    public final String f51716g;

    /* renamed from: h */
    public final String f51717h;

    /* renamed from: i */
    public final String f51718i;

    /* renamed from: j */
    public final List<String> f51719j;

    public C20410j(String str, CategoryType categoryType, FeedbackType feedbackType, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        this.f51710a = str;
        C21100e.m49373x(categoryType, "categoryType");
        this.f51711b = categoryType;
        C21100e.m49373x(feedbackType, "feedbackType");
        this.f51712c = feedbackType;
        C21100e.m49373x(str2, "name");
        this.f51713d = str2;
        C21100e.m49373x(str3, "email");
        this.f51714e = str3;
        C21100e.m49373x(str4, "userId");
        this.f51715f = str4;
        this.f51716g = str5;
        this.f51718i = str6;
        C21100e.m49373x(str7, "feedback");
        this.f51717h = str7;
        C21100e.m49373x(list, "imagesTokens");
        this.f51719j = list;
    }
}
