package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SampleTest {

    public static class NestClass {
        private String field1;

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }
    }

    @Test
    public void test() throws Exception {
        assertTrue(true);
    }
}
