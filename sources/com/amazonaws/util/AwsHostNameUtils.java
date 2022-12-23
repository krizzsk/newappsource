package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.ServiceAbbreviations;
import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p358af.C13437d;

public class AwsHostNameUtils {
    private static final Pattern S3_ENDPOINT_PATTERN = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    public static String localHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            LogFactory.getLog((Class<?>) AwsHostNameUtils.class).debug("Failed to determine the local hostname; fall back to use \"localhost\".", e);
            return "localhost";
        }
    }

    @Deprecated
    public static String parseRegionName(URI uri) {
        return parseRegionName(uri.getHost(), (String) null);
    }

    private static String parseRegionNameByInternalConfig(String str) {
        for (HostRegexToRegionMapping next : InternalConfig.Factory.getInternalConfig().getHostRegexToRegionMappings()) {
            if (str.matches(next.getHostNameRegex())) {
                return next.getRegionName();
            }
        }
        return null;
    }

    @Deprecated
    public static String parseServiceName(URI uri) {
        String host = uri.getHost();
        if (host.endsWith(".amazonaws.com")) {
            String substring = host.substring(0, host.indexOf(".amazonaws.com"));
            if (substring.endsWith(".s3") || S3_ENDPOINT_PATTERN.matcher(substring).matches()) {
                return ServiceAbbreviations.f6722S3;
            }
            if (substring.indexOf(46) == -1) {
                return substring;
            }
            return substring.substring(0, substring.indexOf(46));
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
    }

    private static String parseStandardRegionName(String str) {
        Matcher matcher = S3_ENDPOINT_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "us-east-1";
        }
        String substring = str.substring(lastIndexOf + 1);
        if ("us-gov".equals(substring)) {
            return "us-gov-west-1";
        }
        return substring;
    }

    public static String parseRegionName(String str, String str2) {
        if (str != null) {
            String parseRegionNameByInternalConfig = parseRegionNameByInternalConfig(str);
            if (parseRegionNameByInternalConfig != null) {
                return parseRegionNameByInternalConfig;
            }
            if (str.endsWith(".amazonaws.com")) {
                return parseStandardRegionName(str.substring(0, str.length() - 14));
            }
            if (str.endsWith(".amazonaws.com.cn")) {
                return parseStandardRegionName(str.substring(0, str.length() - 17));
            }
            if (str2 == null) {
                return "us-east-1";
            }
            StringBuilder k = C13555b.m33972k("^(?:.+\\.)?");
            k.append(Pattern.quote(str2));
            k.append("[.-]([a-z0-9-]+)\\.");
            Matcher matcher = Pattern.compile(k.toString()).matcher(str);
            return matcher.find() ? matcher.group(1) : "us-east-1";
        }
        throw new IllegalArgumentException("hostname cannot be null");
    }
}
