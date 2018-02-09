package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        int index=1;
        ArrayList<TableData> dataArrayList = new ArrayList<>();

        for (index=1; index<10; index++) {
            String link = "http://evaluare.edu.ro/Evaluare/CandFromJudIAD.aspx?Jud=4&Poz="+(index-1)+"&PageN="+index;

            try {
                Document doc = Jsoup.connect(link).get();
                Elements tableElements = doc.select("table[class=mainTable]");
                Elements tableRow = tableElements.select(":not(thead) tr");

                for (int i = 2; i < tableRow.size(); i++) {
                    Element row = tableRow.get(i);
                    System.out.println("rand nou");
                    Elements rowItems = row.select("td");

                    TableData table = new TableData();
                    table.setName(rowItems.get(1).text());
                    table.setPos(rowItems.get(2).text());
                    table.setSchool(rowItems.get(3).text());
                    table.setMeanSchool(rowItems.get(14).text());
                    dataArrayList.add(table);

                    for (int j = 0; j < rowItems.size(); j++) {
                        System.out.println(rowItems.get(j).text());
                    }
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //calculate avrg
        Scanner inputSchool=new Scanner(System.in);
        System.out.println("input school name:");
        String schoolName = inputSchool.nextLine();

        if (schoolName == dataArrayList.toString()){

        }

    }
}