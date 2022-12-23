package zendesk.support;

import fe0.C23345c;
import java.util.List;
import java.util.Locale;

public interface HelpCenterProvider {
    void deleteVote(Long l, C23345c<Void> cVar);

    void downvoteArticle(Long l, C23345c<ArticleVote> cVar);

    void getArticle(Long l, C23345c<Article> cVar);

    void getArticles(Long l, C23345c<List<Article>> cVar);

    void getArticles(Long l, String str, C23345c<List<Article>> cVar);

    void getAttachments(Long l, AttachmentType attachmentType, C23345c<List<HelpCenterAttachment>> cVar);

    void getCategories(C23345c<List<Category>> cVar);

    void getCategory(Long l, C23345c<Category> cVar);

    void getHelp(HelpRequest helpRequest, C23345c<List<HelpItem>> cVar);

    void getSection(Long l, C23345c<Section> cVar);

    void getSections(Long l, C23345c<List<Section>> cVar);

    void getSuggestedArticles(SuggestedArticleSearch suggestedArticleSearch, C23345c<SuggestedArticleResponse> cVar);

    void listArticles(ListArticleQuery listArticleQuery, C23345c<List<SearchArticle>> cVar);

    void listArticlesFlat(ListArticleQuery listArticleQuery, C23345c<List<FlatArticle>> cVar);

    void searchArticles(HelpCenterSearch helpCenterSearch, C23345c<List<SearchArticle>> cVar);

    void submitRecordArticleView(Article article, Locale locale, C23345c<Void> cVar);

    void upvoteArticle(Long l, C23345c<ArticleVote> cVar);
}
