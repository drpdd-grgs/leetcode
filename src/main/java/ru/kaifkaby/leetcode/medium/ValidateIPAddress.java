package ru.kaifkaby.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/validate-ip-address">Validate IP Address - LeetCode</a>
 */
public class ValidateIPAddress {

    public String validIPAddress(String queryIP) {

        int l = queryIP.length();

        // Minimum length of ip address (0.0.0.0).
        if (l < 7) {
            return "Neither";
        }

        // String iterator.
        int i = 0;
        // Current character at iteration.
        char c;

        // Slice iterator (slice is number/characters between separators).
        int si = 0;
        // Number in slice (for ipv4 validation only).
        int sl = 0;
        // Count of separators (dots or colons).
        int sc = 0;

        // Flag represents, that address is surely not IPv4 but may be IPv6.
        boolean ms = false;

        while (i != l) {
            // Lowercase.
            c = (char) (queryIP.charAt(i) | 0x20);

            if (c == '.') {
                if (sl < 256 && sc != 3 && si != 0) {
                    sl = 0;
                    si = 0;
                    i++;
                    sc++;
                    continue;
                } else {
                    return "Neither";
                }
            }

            // Starts with 0.
            if (si == 1 && sl == 0) {
                if (sc == 0) {
                    ms = true;
                    i++;
                    si++;
                    break;
                }
                return "Neither";
            }

            if (si == 3 || c > '9' || c < '0') {
                if (sc == 0) {
                    if ((c >= 'a' && c <= 'f') || (c >= '0' && c <= '9')) {
                        ms = true;
                        i++;
                        si++;
                        break;
                    }
                    if (c == ':') {
                        sc++;
                        ms = true;
                        i++;
                        si = 0;
                        break;
                    }
                }
                return "Neither";
            }

            // Add number character to slice.
            sl = (sl * 10) + c - 48;
            si++;
            i++;
        }

        if (!ms) {
            if (sc == 3 && si != 0 && sl < 256) {
                return "IPv4";
            } else {
                return "Neither";
            }
        }

        while (i != l) {
            // Lowercase.
            c = (char) (queryIP.charAt(i) | 0x20);
            if (c == ':' && si != 0) {
                if (sc == 7) {
                    return "Neither";
                }
                sc++;
                si = 0;
                i++;
                continue;
            }
            if (si == 4) {
                return "Neither";
            }
            if ((c < 'a' || c > 'f') && (c < '0' || c > '9')) {
                return "Neither";
            }
            i++;
            si++;
        }

        if (sc == 7 && si != 0) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}
