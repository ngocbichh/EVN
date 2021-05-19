package com.evn.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InvoiceTest {

    private static final String ID_INVICE = "ID_INVICE";
    private static final int OLD_INDEX = 17;
    private static final int NEW_INDEX = 42;
    private static final float MONEY = 10000;
    private static final float V_A_T = 10;
    private static final float TOTAL = 100;
    private static final int MONTH = 12;
    private static final int YEAR = 36;
    private static final int QUARTER = 69;
    private static final String STATUS = "STATUS";
    @Mock
    private Customer customer;
    @InjectMocks
    private Invoice underTest;

    @Test
    void getIdInvice() {
    }

    @Test
    void getOldIndex() {
    }

    @Test
    void getNewIndex() {
    }

    @Test
    void getMoney() {
    }

    @Test
    void getVAT() {
    }

    @Test
    void getTotal() {
    }

    @Test
    void getMonth() {
    }

    @Test
    void getYear() {
    }

    @Test
    void getQuarter() {
    }

    @Test
    void getStatus() {
    }

    @Test
    void getCustomer() {
    }

    @Test
    void setIdInvice() {
    }

    @Test
    void setOldIndex() {
    }

    @Test
    void setNewIndex() {
    }

    @Test
    void setMoney() {
    }

    @Test
    void setVAT() {
    }

    @Test
    void setTotal() {
    }

    @Test
    void setMonth() {
    }

    @Test
    void setYear() {
    }

    @Test
    void setQuarter() {
    }

    @Test
    void setStatus() {
    }

    @Test
    void setCustomer() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}