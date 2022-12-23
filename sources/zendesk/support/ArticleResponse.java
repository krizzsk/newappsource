package zendesk.support;

import ge0.C23408a;
import java.util.List;

class ArticleResponse {
    private Article article;
    private List<User> users;

    public Article getArticle() {
        return this.article;
    }

    public List<User> getUsers() {
        return C23408a.m57526a(this.users);
    }
}
