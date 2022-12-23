package zendesk.support;

import ck0.C21226b;
import ek0.C23317a;
import ek0.C23318b;
import ek0.C23322f;
import ek0.C23331o;
import ek0.C23335s;
import ek0.C23336t;

interface HelpCenterService {
    @C23318b("/api/v2/help_center/votes/{vote_id}.json")
    C21226b<Void> deleteVote(@C23335s("vote_id") Long l);

    @C23331o("/api/v2/help_center/articles/{article_id}/down.json")
    C21226b<ArticleVoteResponse> downvoteArticle(@C23335s("article_id") Long l, @C23317a String str);

    @C23322f("/api/v2/help_center/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    C21226b<ArticleResponse> getArticle(@C23335s("locale") String str, @C23335s("article_id") Long l, @C23336t("include") String str2);

    @C23322f("/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    C21226b<ArticlesListResponse> getArticles(@C23335s("locale") String str, @C23335s("id") Long l, @C23336t("label_names") String str2, @C23336t("include") String str3, @C23336t("per_page") int i);

    @C23322f("/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    C21226b<AttachmentResponse> getAttachments(@C23335s("locale") String str, @C23335s("article_id") Long l, @C23335s("attachment_type") String str2);

    @C23322f("/api/v2/help_center/{locale}/categories.json?per_page=1000")
    C21226b<CategoriesResponse> getCategories(@C23335s("locale") String str);

    @C23322f("/api/v2/help_center/{locale}/categories/{category_id}.json")
    C21226b<CategoryResponse> getCategoryById(@C23335s("locale") String str, @C23335s("category_id") Long l);

    @C23322f("/hc/api/mobile/{locale}/article_tree.json")
    C21226b<HelpResponse> getHelp(@C23335s("locale") String str, @C23336t("category_ids") String str2, @C23336t("section_ids") String str3, @C23336t("include") String str4, @C23336t("limit") int i, @C23336t("article_labels") String str5, @C23336t("per_page") int i2, @C23336t("sort_by") String str6, @C23336t("sort_order") String str7);

    @C23322f("/api/v2/help_center/{locale}/sections/{section_id}.json")
    C21226b<SectionResponse> getSectionById(@C23335s("locale") String str, @C23335s("section_id") Long l);

    @C23322f("/api/v2/help_center/{locale}/categories/{id}/sections.json")
    C21226b<SectionsResponse> getSections(@C23335s("locale") String str, @C23335s("id") Long l, @C23336t("per_page") int i);

    @C23322f("/api/mobile/help_center/search/deflect.json?respect_sanitization_settings=true")
    C21226b<SuggestedArticleResponse> getSuggestedArticles(@C23336t("query") String str, @C23336t("locale") String str2, @C23336t("label_names") String str3, @C23336t("category") Long l, @C23336t("section") Long l2);

    @C23322f("/api/v2/help_center/{locale}/articles.json?respect_sanitization_settings=true")
    C21226b<ArticlesListResponse> listArticles(@C23335s("locale") String str, @C23336t("label_names") String str2, @C23336t("include") String str3, @C23336t("sort_by") String str4, @C23336t("sort_order") String str5, @C23336t("page") Integer num, @C23336t("per_page") Integer num2);

    @C23322f("/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    C21226b<ArticlesSearchResponse> searchArticles(@C23336t("query") String str, @C23336t("locale") String str2, @C23336t("include") String str3, @C23336t("label_names") String str4, @C23336t("category") String str5, @C23336t("section") String str6, @C23336t("page") Integer num, @C23336t("per_page") Integer num2);

    @C23331o("/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    C21226b<Void> submitRecordArticleView(@C23335s("article_id") Long l, @C23335s("locale") String str, @C23317a RecordArticleViewRequest recordArticleViewRequest);

    @C23331o("/api/v2/help_center/articles/{article_id}/up.json")
    C21226b<ArticleVoteResponse> upvoteArticle(@C23335s("article_id") Long l, @C23317a String str);
}
