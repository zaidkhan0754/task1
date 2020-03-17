package com.example.task;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Language implements Serializable {
    boolean isSelected;
    String title;
    String body;
    List<String> subLang;
    Language(boolean isSelected
             ,String title, String  body , List<String> subLang){
        this.title = title;
        this.isSelected = isSelected;
        this.body = body;
        this.subLang = subLang;

    }

}
