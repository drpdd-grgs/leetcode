package ru.kaifkaby.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateIPAddressTest {

    @Test
    void test_1() {
        Assertions.assertEquals("IPv4", new ValidateIPAddress().validIPAddress("192.168.1.1"));
    }

    @Test
    void test_2() {
        Assertions.assertEquals("IPv4", new ValidateIPAddress().validIPAddress("192.168.1.0"));
    }

    @Test
    void test_3() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("192.168.01.1"));
    }

    @Test
    void test_4() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("192.168.1.00"));
    }

    @Test
    void test_5() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("192.168@1.1"));
    }

    @Test
    void test_6() {
        Assertions.assertEquals("IPv6", new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    void test_7() {
        Assertions.assertEquals("IPv6", new ValidateIPAddress().validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
    }

    @Test
    void test_8() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("2001:0db8:85a3::8A2E:037j:7334"));
    }

    @Test
    void test_9() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    void test_10() {
        Assertions.assertEquals("Neither", new ValidateIPAddress().validIPAddress("256.256.256"));
    }

    @Test
    void test_11() {
        Assertions.assertEquals("IPv4", new ValidateIPAddress().validIPAddress("172.16.254.1"));
    }

    @Test
    void test_12() {
        Assertions.assertEquals("IPv6", new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }
}