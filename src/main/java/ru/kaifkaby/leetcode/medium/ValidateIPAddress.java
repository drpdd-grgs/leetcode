package ru.kaifkaby.leetcode.medium;

public class ValidateIPAddress {

    public String validIPAddress(String queryIP) {
        if (queryIP.length() < 7) {
            return "Neither";
        }
        char[] ip = queryIP.toCharArray();

        char c;
        int i = 0;
        int pos = 0;
        int ipv4slice = 0;
        int separatorCount = 0;

        boolean mayBeIPv6 = false;

        while (i < queryIP.length()) {
            c = (char) (ip[i] | 0x20);
            if (c == '.') {
                if (ipv4slice < 256 && separatorCount != 3 && pos != 0) {
                    ipv4slice = 0;
                    pos = 0;
                    i++;
                    separatorCount++;
                    continue;
                } else {
                    return "Neither";
                }
            }

            if (pos == 1 && ipv4slice == 0) {
                if (separatorCount == 0) {
                    mayBeIPv6 = true;
                    i++;
                    pos++;
                    break;
                }
                return "Neither";
            }

            if (pos > 2 || c > '9' || c < '0') {
                if (separatorCount == 0) {
                    if ((c >= 'a' && c <= 'f') || (c >= '0' && c <= '9')) {
                        mayBeIPv6 = true;
                        i++;
                        pos++;
                        break;
                    }
                    if (c == 58) {
                        separatorCount++;
                        mayBeIPv6 = true;
                        i++;
                        pos = 0;
                        break;
                    }
                }
                return "Neither";
            }

            ipv4slice = (ipv4slice * 10) + c - 48;
            pos++;
            i++;
        }

        if (!mayBeIPv6) {
            if (separatorCount == 3 && pos != 0 && ipv4slice < 256) {
                return "IPv4";
            } else {
                return "Neither";
            }
        }

        while (i < queryIP.length()) {
            c = (char) (ip[i] | 0x20);
            if (c == ':' && pos != 0) {
                if (separatorCount == 7) {
                    return "Neither";
                }
                separatorCount++;
                pos = 0;
                i++;
                continue;
            }
            if (pos > 3) {
                return "Neither";
            }
            if (!(c >= 'a' && c <= 'f') && !(c >= '0' && c <= '9')) {
                return "Neither";
            }
            i++;
            pos++;
        }

        if (separatorCount == 7 && pos != 0) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}
