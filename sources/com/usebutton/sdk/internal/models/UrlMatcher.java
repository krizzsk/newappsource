package com.usebutton.sdk.internal.models;

import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.LinksConfiguration;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlMatcher {
    private static final String PARTNER_SUBDOMAIN_REGEX = "^(?:track\\.bttn\\.io\\/([^\\/]+).*|(?!track)([^\\.]+)\\.bttn\\.io(?:\\/.*|$))";
    private final Getter<Configuration> configurationGetter;
    private LinksConfiguration linksConfiguration;

    public UrlMatcher(Getter<Configuration> getter) {
        this.configurationGetter = getter;
    }

    private String extractCandidateHostname(URL url) {
        String host = url.getHost();
        if (host.startsWith("www.")) {
            return host.replaceFirst("www.", "");
        }
        return host;
    }

    private String extractPartnerSubdomain(URL url) {
        String str;
        String host = url.getHost();
        if (url.getPath() != null) {
            str = url.getPath();
        } else {
            str = "/";
        }
        Matcher matcher = Pattern.compile(PARTNER_SUBDOMAIN_REGEX).matcher(C25541a.m63881k(host, str));
        if (!matcher.find()) {
            return null;
        }
        if (matcher.group(1) != null) {
            return matcher.group(1);
        }
        return matcher.group(0).split("\\.")[0];
    }

    private String[] getUrlMatches(Matcher matcher) {
        String[] strArr = new String[matcher.groupCount()];
        int i = 0;
        while (i < matcher.groupCount()) {
            int i2 = i + 1;
            strArr[i] = matcher.group(i2);
            i = i2;
        }
        return strArr;
    }

    private boolean hasMatchingAffiliatePathnameIdPattern(URL url, LinksConfiguration.Affiliate affiliate, boolean z) {
        List<LinksConfiguration.PathnameId> list;
        if (!z) {
            list = affiliate.getPathnameIds();
        } else {
            ArrayList arrayList = new ArrayList();
            for (LinksConfiguration.PathnameId next : affiliate.getPathnameIds()) {
                if (next.isGuaranteedAction()) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        Iterator<LinksConfiguration.PathnameId> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            LinksConfiguration.PathnameId next2 = it.next();
            Matcher matcher = next2.getRegex().matcher(url.getPath());
            if (matcher.find()) {
                String[] urlMatches = getUrlMatches(matcher);
                if (urlMatches.length == 0 && next2.getMatches().length == 0) {
                    return true;
                }
                for (String[] equals : next2.getMatches()) {
                    if (Arrays.equals(equals, urlMatches)) {
                        return true;
                    }
                }
                continue;
            }
        }
    }

    private boolean hasMatchingAffiliateQueryIdValue(URL url, LinksConfiguration.Affiliate affiliate, boolean z) {
        List<LinksConfiguration.QueryId> list;
        List<String> values;
        if (!z) {
            list = affiliate.getQueryIds();
        } else {
            ArrayList arrayList = new ArrayList();
            for (LinksConfiguration.QueryId next : affiliate.getQueryIds()) {
                if (next.isGuaranteedAction()) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        Map<String, String> splitQuery = splitQuery(url);
        for (LinksConfiguration.QueryId next2 : list) {
            Iterator<String> it = splitQuery.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next3 = it.next();
                    if (next3.equals(next2.getKey()) && (values = next2.getValues()) != null && values.contains(splitQuery.get(next3))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasMatchingAffiliateQueryUrlKey(URL url, LinksConfiguration.Affiliate affiliate) {
        Map<String, String> splitQuery = splitQuery(url);
        for (String containsKey : affiliate.getQueryUrlKeys()) {
            if (splitQuery.containsKey(containsKey)) {
                return true;
            }
        }
        return false;
    }

    private boolean isInvalidHost(URL url) {
        if (!url.getHost().isEmpty()) {
            return false;
        }
        StringBuilder k = C13555b.m33972k("Unable to match url. No hostname specified: ");
        k.append(url.toString());
        ButtonLog.visible(k.toString());
        return true;
    }

    private boolean isInvalidLinksConfig() {
        if (this.linksConfiguration != null) {
            return false;
        }
        ButtonLog.visible("There are no supported merchants for matching. Please contact Button if this is unexpected.");
        return true;
    }

    private boolean isInvalidProtocol(URL url) {
        if ("http".equals(url.getProtocol()) || "https".equals(url.getProtocol())) {
            return false;
        }
        StringBuilder k = C13555b.m33972k("Unable to match url. Unsupported protocol: ");
        k.append(url.getProtocol());
        ButtonLog.visible(k.toString());
        return true;
    }

    private boolean isInvalidUrl(URL url) {
        if (url != null) {
            return false;
        }
        ButtonLog.visible("Unable to match url. Url cannot be null.");
        return true;
    }

    private boolean isSupportedAffiliateLink(URL url, boolean z) {
        String extractCandidateHostname = extractCandidateHostname(url);
        for (LinksConfiguration.Affiliate next : this.linksConfiguration.getSupportedAffiliates()) {
            if (extractCandidateHostname.equals(next.getHostname()) && (hasMatchingAffiliateQueryUrlKey(url, next) || hasMatchingAffiliateQueryIdValue(url, next, z) || hasMatchingAffiliatePathnameIdPattern(url, next, z))) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedHostname(URL url) {
        String extractCandidateHostname = extractCandidateHostname(url);
        for (String equalsIgnoreCase : this.linksConfiguration.getSupportedHostnames()) {
            if (equalsIgnoreCase.equalsIgnoreCase(extractCandidateHostname)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedSubdomain(URL url) {
        String extractPartnerSubdomain = extractPartnerSubdomain(url);
        for (String equalsIgnoreCase : this.linksConfiguration.getSupportedButtonSubdomains()) {
            if (equalsIgnoreCase.equalsIgnoreCase(extractPartnerSubdomain)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> splitQuery(URL url) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String query = url.getQuery();
        if (query != null) {
            for (String str : query.split("&")) {
                int indexOf = str.indexOf("=");
                try {
                    linkedHashMap.put(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    StringBuilder k = C13555b.m33972k("Error decoding url params: ");
                    k.append(e.getLocalizedMessage());
                    ButtonLog.visible(k.toString());
                }
            }
        }
        return linkedHashMap;
    }

    public boolean canExchangeUrl(URL url) {
        return canExchangeUrl(url, true);
    }

    public boolean canExchangeUrl(URL url, boolean z) {
        this.linksConfiguration = this.configurationGetter.get().getLinks();
        if (isInvalidLinksConfig() || isInvalidUrl(url) || isInvalidProtocol(url) || isInvalidHost(url)) {
            return false;
        }
        if (!isSupportedHostname(url) && !isSupportedSubdomain(url) && !isSupportedAffiliateLink(url, z)) {
            return false;
        }
        return true;
    }
}
