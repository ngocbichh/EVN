package com.evn.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    private static final String ID_CUSTOMER = "ID_CUSTOMER";
    private static final String FULL_NAME = "FULL_NAME";
    private static final String EMAIL = "EMAIL";
    private static final String ADDRESS = "ADDRESS";
    private static final String DISTRICT = "DISTRICT";
    private static final String STRESS = "STRESS";
    private Customer customerUnderTest;
    @InjectMocks
    private Customer underTest;

    @BeforeEach
    void setUp() {
        customerUnderTest = new Customer();
    }

    @Test
    void testEquals() {
        // Setup

        // Run the test
        final boolean result = customerUnderTest.equals("o");

        // Verify the results
        assertThat(result).isTrue();
    }

    @Test
    void testHashCode() {
        // Setup

        // Run the test
        final int result = customerUnderTest.hashCode();

        // Verify the results
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testToString() {
        // Setup

        // Run the test
        final String result = customerUnderTest.toString();

        // Verify the results
        assertThat(result).isEqualTo("result");
    }

    @Test
    void testCanEqual() {
        // Setup

        // Run the test
        final boolean result = customerUnderTest.canEqual("other");

        // Verify the results
        assertThat(result).isTrue();
    }
}
