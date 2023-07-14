package com.dharsh.codewars;

public class Ipv6HexString {
    public static String parseIPv6(String ip) {
        String[] blocks = ip.split("[^A-Z0-9]+");
        StringBuilder result = new StringBuilder();

        for (String block : blocks) {
            int sum = 0;

            for (char c : block.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += c - '0';
                } else if (Character.isLetter(c)) {
                    sum += Character.toLowerCase(c) - 'a' + 10;
                }
            }

            result.append(sum);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        if("10264228481217".equals(Ipv6HexString.parseIPv6("1234:5678:9ABC:D00F:1111:2222:3333:4445"))){
            System.out.println("Test Case 1 Passed");
        }
        if("18544240608532".equals(Ipv6HexString.parseIPv6("5454:FBFD:9ABC:AAAA:FFFF:2222:FBDE:0101"))){
            System.out.println("Test Case 2 Passed");
        }
        if("00000000".equals(Ipv6HexString.parseIPv6("0000:0000:0000:0000:0000:0000:0000:0000"))){
            System.out.println("Test Case 3 Passed");
        }
        if("6060444864304".equals(Ipv6HexString.parseIPv6("FFFF:FFFF:BBBB:CCCC:1212:AABC:0000:1111"))){
            System.out.println("Test Case 4 Passed");
        }
        if("48242406085346".equals(Ipv6HexString.parseIPv6("ACDD-0101-9ABC-AAAA-FFFF-2222-FBDE-ACCC"))){
            System.out.println("Test Case 5 Passed");
        }
        if("18544230558532".equals(Ipv6HexString.parseIPv6("5454rFBFDr9ABCrAA0ArFAFFr2222rFBDEr0101"))){
            System.out.println("Test Case 6 Passed");
        }
        if("24264228481221".equals(Ipv6HexString.parseIPv6("F234#5678#9ABC#D00F#1111#2222#3333#4485"))){
            System.out.println("Test Case 7 Passed");
        }
    }
}
