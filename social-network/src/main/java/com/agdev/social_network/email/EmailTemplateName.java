package com.agdev.social_network.email;

import lombok.Getter;

import javax.swing.*;

@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
