package ru.kaifkaby.leetcode.medium;

public class ValidateIPAddress {

    public String validIPAddress(String queryIP) {
        if (queryIP.length() < 7) {
            return "Neither";
        }
        char[] ip = queryIP.toCharArray();

        int i = 0;
        int pos = 0;
        int ipv4slice = 0;
        int separatorCount = 0;

        boolean mayBeIPv6 = false;

        while (i < queryIP.length()) {
            if (ip[i] == 46) {
                if (ipv4slice < 256 && separatorCount < 3 && pos != 0) {
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

            if (pos > 2 || ip[i] > 57 || ip[i] < 48) {
                if (separatorCount == 0) {
                    if ((ip[i] > 96 && ip[i] < 103) || (ip[i] > 64 && ip[i] < 71) || (ip[i] < 58 && ip[i] > 47)) {
                        mayBeIPv6 = true;
                        i++;
                        pos++;
                        break;
                    }
                    if (ip[i] == 58) {
                        separatorCount++;
                        mayBeIPv6 = true;
                        i++;
                        pos = 0;
                        break;
                    }
                }
                return "Neither";
            }

            ipv4slice = (ipv4slice * 10) + ip[i] - 48;
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
            if (ip[i] == 58 && pos != 0) {
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
            if (!(ip[i] < 58 && ip[i] > 47) && !(ip[i] > 96 && ip[i] < 103) && !(ip[i] > 64 && ip[i] < 71)) {
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
