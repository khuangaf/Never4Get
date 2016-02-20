package com.example.huang.never4get;

import com.example.huang.never4get.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by huang on 2016/2/20.
 */
public class ItemList {
    public static List<Item> getList(int day)
    {
        List<Item> myList = new ArrayList<>();
        myList.add(new Item("NoteBook", "sdfdfgd555g"));
        myList.add(new Item("Student ID", "fdjk743hg"));
        myList.add(new Item("Octopus","ygireu453"));
        myList.add(new Item("Pencil Case", "fdg1f5g"));
        myList.add(new Item("Charger", "dfgh5fmh"));
        if(day == 1) myList.add(new Item("Physics","dfsg123dfg"));

        else if(day == 2) myList.add(new Item("Chemistry","sdfhjb45f"));

        else if(day == 3) myList.add(new Item("Calculus","dfj48yhjf"));

        else if(day == 4) myList.add(new Item("Probability","sadj3ys"));

        else if(day == 5) myList.add(new Item("Humanity","dfgd1fd153"));

        else if(day == 6) myList.remove(3);

        else myList.remove(1);


        Collections.sort(myList, new Comparator<Item>() {
            @Override
            public int compare(Item item2, Item item1) {

                return item1.getName().compareTo(item2.getName());
            }
        });
        return myList;


    }

}
