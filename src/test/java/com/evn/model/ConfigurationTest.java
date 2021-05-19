package com.evn.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ConfigurationTest {

    private static final String ID_CONFIGURATION = "ID_CONFIGURATION";
    private static final String SUBJECT = "SUBJECT";
    private static final String CREATOR = "CREATOR";
    private static final float PRICE = 10;
    private static final String EDITOR = "EDITOR";
    private Configuration configurationUnderTest;
    @Mock
    private Date dateCreate;
    @Mock
    private Date dateEdit;
    @InjectMocks
    private Configuration underTest;

    @BeforeEach
    void setUp() {
        configurationUnderTest = new Configuration();
    }

    @Test
    void testEquals() {
        // Setup

        // Run the test
        final boolean result = configurationUnderTest.equals("o");

        // Verify the results
        assertThat(result).isTrue();
    }

    @Test
    void testHashCode() {
        // Setup

        // Run the test
        final int result = configurationUnderTest.hashCode();

        // Verify the results
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testToString() {
        // Setup

        // Run the test
        final String result = configurationUnderTest.toString();

        // Verify the results
        assertThat(result).isEqualTo("result");
    }

    @Test
    void testCanEqual() {
        // Setup

        // Run the test
        final boolean result = configurationUnderTest.canEqual("other");

        // Verify the results
        assertThat(result).isTrue();
    }

    @Test
    void getIdConfiguration() {
    }

    @Test
    void getSubject() {
    }

    @Test
    void getCreator() {
    }

    @Test
    void getDateCreate() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void getEditor() {
    }

    @Test
    void getDateEdit() {
    }

    @Test
    void setIdConfiguration() {
    }

    @Test
    void setSubject() {
    }

    @Test
    void setCreator() {
    }

    @Test
    void setDateCreate() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void setEditor() {
    }

    @Test
    void setDateEdit() {
    }

    @Test
    void testEquals1() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode1() {
    }

    @Test
    void testToString1() {
    }
}
