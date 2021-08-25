package com.hu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HsTest {



    @Test
    void main() {
        Hs hs = new Hs();
        Hs.main(new String[]{"a"});
    }

    @Test
    void js() {
        Hs hs = new Hs();
        hs.js();
    }
}