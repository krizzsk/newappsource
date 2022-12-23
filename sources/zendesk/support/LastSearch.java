package zendesk.support;

class LastSearch {
    private final String origin = "mobile_sdk";
    private final String query;
    private final int resultsCount;

    public LastSearch(String str, int i) {
        this.query = str;
        this.resultsCount = i;
    }

    public String getQuery() {
        return this.query;
    }

    public int getResultsCount() {
        return this.resultsCount;
    }
}
