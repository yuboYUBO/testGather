package com.example.demo.java;

import java.util.Arrays;
import java.util.List;

/**
 * @author Boris
 * @date 2020/6/15 20:01
 */
public class TestBase {
    public static void main(String[] args) {
        String []  aList = {"50",
                "2475",
                "3524",
                "5051",
                "6024",
                "6709",
                "7554",
                "8786",
                "8861",
                "8962",
                "8994",
                "9066",
                "51634",
                "51697",
                "53574",
                "76495",
                "76674",
                "127523",
                "127525",
                "136058",
                "136157",
                "136392",
                "136459",
                "136514",
                "136639",
                "137437",
                "137484",
                "137494",
                "137612",
                "137614",
                "139106",
                "140906",
                "148564",
                "149411",
                "149772",
                "153148",
                "155083",
                "157614",
                "157642",
                "157663",
                "157856",
                "158011",
                "158120",
                "158755",
                "158996",
                "159000",
                "159134",
                "160491",
                "160915",
                "163971",
                "164584",
                "165140",
                "165154",
                "165161",
                "165235"};

        List<String> strList = Arrays.asList(aList);

        String [] bList =  {"6024",
                "136392",
                "139106",
                "148564",
                "3524",
                "136058",
                "160491",
                "158120",
                "137437",
                "165161",
                "127523",
                "8962",
                "165154",
                "160915",
                "149772",
                "157663",
                "5051",
                "159000",
                "163363",
                "50",
                "137614",
                "137484",
                "136459",
                "164584",
                "76674",
                "8861",
                "165235",
                "76495",
                "8994",
                "9066",
                "51634",
                "51697",
                "7554",
                "140906",
                "155083",
                "6709",
                "157642",
                "136514",
                "149411",
                "136157",
                "158996",
                "53574",
                "158755",
                "136639",
                "127525",
                "137494",
                "157856",
                "137612",
                "157614",
                "153148",
                "158011",
                "8786",
                "165140",
                "163971",
                "2475",
                "159134"};


        for (String b : bList) {
            if (!strList.contains(b)) {
                System.out.println(b);
            }
        }
    }
}