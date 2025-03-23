package org.skypro.skyshop.exception;

import java.io.IOException;

public class BestResultNotFoundException extends IOException {
    public BestResultNotFoundException(String messag) {
        super(messag);
    }
}
