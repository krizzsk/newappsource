package zendesk.support;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface SupportBlipsProvider {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ArticleVote {
        public static final int ARTICLE_VOTE_DOWN = -1;
        public static final int ARTICLE_VOTE_UP = 1;
    }

    void articleView(Article article);

    void articleVote(Long l, int i);

    void helpCenterSearch(String str);

    void requestCreated(String str);

    void requestListViewed();

    void requestUpdated(String str);

    void requestViewed(String str);

    void supportSdkInit();
}
