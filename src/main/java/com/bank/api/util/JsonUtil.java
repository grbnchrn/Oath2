package com.bank.api.util;

import com.bank.api.dao.CardDetailsDao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
     public static  String cardDetailsJson = FileUtil.readFromInputStream("card.json");

    public static CardDetailsDao[] getJsonStringAsArray() {
        Gson gson = new Gson();
        CardDetailsDao[] cardDetailsDaoArray = gson.fromJson(cardDetailsJson, CardDetailsDao[].class);
        return cardDetailsDaoArray;
    }

    public static List getJsonStringAsList(){
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<CardDetailsDao>>(){}.getType();
        ArrayList<CardDetailsDao> cardDetailsDaoList = gson.fromJson(cardDetailsJson, userListType);
        return cardDetailsDaoList;
    }

}
