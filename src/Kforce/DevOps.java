package Kforce;
//You are given a data.csv file in the /root/customers/ directory containing information about your customers.
//
//        It has the following columns:
//
//        ID,NAME,CITY,COUNTRY,CPERSON,EMPLCNT,CONTRCNT,CONTRCOST
//
//        where
//
//        ID: Unique id of the customer
//        NAME: Official customer company name
//        CITY: Location city name
//        COUNTRY: Location country name
//        CPERSON: Email of the customer company contact person
//        EMPLCNT: Customer company employees number
//        CONTRCNT: Number of contracts signed with the customer
//        CONTRCOST: Total amount of money paid by customer (float in format dollars.cents)
//
//        Read and analyze the data.csv file, and output the answers to these questions:
//
//        How many total customers are in this data set?
//        How many customers are in each city?
//        How many customers are in each country?
//        Which country has the largest number of customers' contracts signed in it? How many contracts does it have?
//        How many unique cities have at least one customer in them?
//
//        The answers for second and third questions (the number of customers in each city and in each country) must be sorted by city and country name respectively, in ascending order. If there are several cities that are tied for having the most customers' contracts, print the alphabetically larger one. Please keep in mind that all string comparisons should be considered case-sensitive.
//
//        The answers should be formatted as:
//
//        Total customers:
//<number>
//Customers by city:
//<CITY>: <number>
//<CITY>: <number>
//...
//        Customers by country:
//<COUNTRY>: <number>
//<COUNTRY>: <number>
//...
//        Country with the largest number of customers' contracts:
//<country> (<number> contracts)
//        Unique cities with at least one customer:
//<number>
//
//Example
//
//        For the following data.csv
//
//        ID,NAME,CITY,COUNTRY,CPERSON,EMPLCNT,CONTRCNT,CONTRCOST
//        00000001,Breadpot,Sydney,Australia,Sam.Keng@info.com,250,48,1024.00
//        00000002,Hoviz,Manchester,UK,harry.ham@hoviz.com,150,7,900.00
//        00000003,Hoviz,London,UK,hamlet.host@hoviz.com,1500,12800,10510.50
//        00000004,Grenns,London,UK,grenns@grenns.com,200,12800,128.30
//        00000005,Magnolia,Chicago,USA,man@info.com,1024,25600,512000.00
//        00000006,Dozen,San Francisco,USA,dozen@dozen.com,1000,5,1000.20
//        00000007,Sun,San Francisco,USA,sunny@sun.com,2000,2,10000.01
//
//        the output for this should be:
//
//        Total customers:
//        7
//        Customers by city:
//        Chicago: 1
//        London: 2
//        Manchester: 1
//        San Francisco: 2
//        Sydney: 1
//        Customers by country:
//        Australia: 1
//        UK: 3
//        USA: 3
//        Country with the largest number of customers' contracts:
//        USA (25607 contracts)
//        Unique cities with at least one customer:
//        5
//
//        Note that both USA and UK have the same number of contracts - 25607, but USA is alphabetically larger, so it is the answer.
//
//        [execution time limit] 7 seconds (java)
//
import java.io.*;
import java.util.*;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonProcessingException;

public class DevOps {
    final String COMMA_DELIMITER = ",";
    // Main class should be named 'Solution'
    class Solution {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
    List<List<String>> CSVReader() throws IOException {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/root/customers/data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        }
        return records;
    }
    void totalCustomers(List<List<String>> records){
        System.out.println("Total customers:");
        System.out.println(records.size());
    }
    void customerByCity(List<List<String>> records){
        HashMap<String, Integer> map = new HashMap<>();
        for(List<String> record:records){
            map.put(record.get(2),map.getOrDefault(record.get(2),1));
        }
        for(Map.Entry<String, Integer> set: map.entrySet()){
            System.out.println(set.getKey()+": "+set.getValue());
        }
    }
    void customerByCountry(List<List<String>> records){
        HashMap<String, Integer> map = new HashMap<>();
        for(List<String> record:records){
            map.put(record.get(3),map.getOrDefault(record.get(3),1));
        }
        for(Map.Entry<String, Integer> set: map.entrySet()){
            System.out.println(set.getKey()+": "+set.getValue());
        }
    }
    void countryWithLargestContract(List<List<String>> records){
        HashMap<String, Integer> map = new HashMap<>();
        for(List<String> record:records){
            map.put(record.get(3),map.getOrDefault(record.get(3),1));
        }
        for(Map.Entry<String, Integer> set: map.entrySet()){
            System.out.println(set.getKey()+": "+set.getValue());
        }
    }
}
