package com.nice.avishkar;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.*;

public class InventoryPredictorImpl implements InventoryPredictor {
    @Override
    public PredictedWarehouseInfo predictWarehouseCapacityWithProductDetails(ResourceInfo resourceInfo) throws IOException {
        //Code here

        //Constant Paths
        Path p1 = resourceInfo.day1HistoryPath;
        Path p2 = resourceInfo.day2HistoryPath;
        Path p3 = resourceInfo.day3HistoryPath;
        Path p4 = resourceInfo.day4HistoryPath;
        Path pi = resourceInfo.productInfoPath;

        String COMMA_DELIMITER = ",";

        //Reading Product Info
        List<List<String>> product_info = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(pi, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                product_info.add(Arrays.asList(values));
            }
        }

        //Reading Day 1 Records
        List<List<String>> day1_reccords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(p1, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                day1_reccords.add(Arrays.asList(values));
            }
        }


        //Reading Day 2 records
        List<List<String>> day2_reccords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(p2, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                day2_reccords.add(Arrays.asList(values));
            }
        }

        //Reading Day 3 records
        List<List<String>> day3_reccords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(p3, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                day3_reccords.add(Arrays.asList(values));
            }
        }

        //Reading Day 4 records
        List<List<String>> day4_reccords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(p4, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                day4_reccords.add(Arrays.asList(values));
            }
        }

        //Day 1 Stats
        int[] p_day1_Quantity = new int[15];
        int[] p_day2_Quantity = new int[15];
        int[] p_day3_Quantity = new int[15];
        int[] p_day4_Quantity = new int[15];

       for(int i=1;i!=day1_reccords.size();i++){



           //Product 1
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==1 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[0] = p_day1_Quantity[0]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==1 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[0] = p_day2_Quantity[0]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==1 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[0] = p_day3_Quantity[0]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==1 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[0] = p_day4_Quantity[0]+Integer.parseInt(day4_reccords.get(i).get(2));
           }




           //Product2
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==2 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[1] = p_day1_Quantity[1]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==2 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[1] = p_day2_Quantity[1]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==2 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[1] = p_day3_Quantity[1]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==2 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[1] = p_day4_Quantity[1]+Integer.parseInt(day4_reccords.get(i).get(2));
           }




           //Product3
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==3 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[2] = p_day1_Quantity[2]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==3 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[2] = p_day2_Quantity[2]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==3 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[2] = p_day3_Quantity[2]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==3 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[2] = p_day4_Quantity[2]+Integer.parseInt(day4_reccords.get(i).get(2));
           }



           //Product4
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==4 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[3] = p_day1_Quantity[3]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==4 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[3] = p_day2_Quantity[3]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==4 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[3] = p_day3_Quantity[3]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==4 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[3] = p_day4_Quantity[3]+Integer.parseInt(day4_reccords.get(i).get(2));
           }




           //Product5
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==5 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[4] = p_day1_Quantity[4]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==5 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[4] = p_day2_Quantity[4]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==5 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[4] = p_day3_Quantity[4]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==5 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[4] = p_day4_Quantity[4]+Integer.parseInt(day4_reccords.get(i).get(2));
           }





           //Product6
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==6 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[5] = p_day1_Quantity[5]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==6 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[5] = p_day2_Quantity[5]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==6 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[5] = p_day3_Quantity[5]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==6 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[5] = p_day4_Quantity[5]+Integer.parseInt(day4_reccords.get(i).get(2));
           }




           //Product7
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==7 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[6] = p_day1_Quantity[6]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==7 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[6] = p_day2_Quantity[6]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==7 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[6] = p_day3_Quantity[6]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==7 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[6] = p_day4_Quantity[6]+Integer.parseInt(day4_reccords.get(i).get(2));
           }

           //Product8
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==8 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[7] = p_day1_Quantity[7]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==8 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[7] = p_day2_Quantity[7]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==8 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[7] = p_day3_Quantity[7]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==8 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[7] = p_day4_Quantity[7]+Integer.parseInt(day4_reccords.get(i).get(2));
           }


           //Product9
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==9 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[8] = p_day1_Quantity[8]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==9 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[8] = p_day2_Quantity[8]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==9 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[8] = p_day3_Quantity[8]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==9 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[8] = p_day4_Quantity[8]+Integer.parseInt(day4_reccords.get(i).get(2));
           }

           //Product10
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==10 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[9] = p_day1_Quantity[9]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==10 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[9] = p_day2_Quantity[9]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==10 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[9] = p_day3_Quantity[9]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==10 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[9] = p_day4_Quantity[9]+Integer.parseInt(day4_reccords.get(i).get(2));
           }


           //Product11
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==11 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[10] = p_day1_Quantity[10]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==11 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[10] = p_day2_Quantity[10]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==11 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[10] = p_day3_Quantity[10]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==11 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[10] = p_day4_Quantity[10]+Integer.parseInt(day4_reccords.get(i).get(2));
           }


           //Product12
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==12 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[11] = p_day1_Quantity[11]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==12 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[11] = p_day2_Quantity[11]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==12 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[11] = p_day3_Quantity[11]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==12 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[11] = p_day4_Quantity[11]+Integer.parseInt(day4_reccords.get(i).get(2));
           }




           //Product13
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==13 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[12] = p_day1_Quantity[12]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==13 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[12] = p_day2_Quantity[12]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==13 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[12] = p_day3_Quantity[12]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==13 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[12] = p_day4_Quantity[12]+Integer.parseInt(day4_reccords.get(i).get(2));
           }



           //Product14
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==14 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[13] = p_day1_Quantity[13]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==14 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[13] = p_day2_Quantity[13]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==14 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[13] = p_day3_Quantity[13]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==14 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[13] = p_day4_Quantity[13]+Integer.parseInt(day4_reccords.get(i).get(2));
           }



           //Product15
           //Day1
           if(Integer.parseInt(day1_reccords.get(i).get(1))==15 && day1_reccords.get(i).size()==5) {
               p_day1_Quantity[14] = p_day1_Quantity[14]+Integer.parseInt(day1_reccords.get(i).get(2));
           }
           //Day2
           if(Integer.parseInt(day2_reccords.get(i).get(1))==15 && day2_reccords.get(i).size()==5) {
               p_day2_Quantity[14] = p_day2_Quantity[14]+Integer.parseInt(day2_reccords.get(i).get(2));
           }
           //Day3
           if(Integer.parseInt(day3_reccords.get(i).get(1))==15 && day3_reccords.get(i).size()==5) {
               p_day3_Quantity[14] = p_day3_Quantity[14]+Integer.parseInt(day3_reccords.get(i).get(2));
           }
           //Day4
           if(Integer.parseInt(day4_reccords.get(i).get(1))==15 && day4_reccords.get(i).size()==5) {
               p_day4_Quantity[14] = p_day4_Quantity[14]+Integer.parseInt(day4_reccords.get(i).get(2));
           }


       }

       //Every Product Total Quantity Calculation
        int[] p_total_quantity  = new int[15];
       for(int i=0;i!=p_total_quantity.length;i++){
           p_total_quantity[i] = p_day1_Quantity[i]+p_day2_Quantity[i]+p_day3_Quantity[i]+p_day4_Quantity[i];
       }

       //ROI for every product
       int[] p_ROI = new int[15];
       for(int i=0;i!=p_ROI.length;i++){
           p_ROI[i] = ROI(p_total_quantity[i],Integer.parseInt(product_info.get(i+1).get(2)),Integer.parseInt(product_info.get(i+1).get(3)),Integer.parseInt(product_info.get(i+1).get(4)));
       }


        //ASR for every product
        int[] p_asr = new int[15];
        for(int i=0;i!=p_asr.length;i++){
            if(Integer.parseInt(product_info.get(i+1).get(4))==0){
                continue;
            }
            p_asr[i] = ASR(p_day1_Quantity[i],p_day2_Quantity[i],p_day3_Quantity[i],p_day4_Quantity[i],Integer.parseInt(product_info.get(i+1).get(4)));
        }




        //Predictions
        int[] p_preds = new int[15];
        for(int i=0;i!=p_preds.length;i++){
            if(Integer.parseInt(product_info.get(i+1).get(4))==0){
                continue;
            }
            p_preds[i] = day5_final(p_asr[i],p_ROI[i],Integer.parseInt(product_info.get(i+1).get(4)));
        }
        int sum= 0;
        for(int i:p_preds){
            sum = sum+i;

        }


        //Submission Object Creation
        List<PredictedProductInfo> productInfoList = new ArrayList<>();
        for(int i=0;i!=15;i++){
            PredictedProductInfo p = new PredictedProductInfo();
            p.productId = Long.parseLong(product_info.get(i+1).get(0));
            p.predictedQuantity = p_preds[i];
            p.productName = product_info.get(i+1).get(1);
            productInfoList.add(p);
        }
        PredictedWarehouseInfo ans = new PredictedWarehouseInfo();
        ans.productList = productInfoList;
        ans.warehouseCapacity = sum;
        ans.productList.sort((o1, o2) -> {
            if (o1.predictedQuantity > o2.predictedQuantity) {
                return -1;
            } else if (o1.predictedQuantity < o2.predictedQuantity) {
                return 1;
            }
            return o1.productName.compareTo(o2.productName);
        });
        


        return ans;
    }


    //Helper Functions
    public int ROI(int sum, int cp, int sp, int quantity)
    {
        double margin = Math.ceil(((double) (sp - cp) /cp)*100);
        double total_inv = quantity*cp;
        double total_prof = sum*margin*0.01*cp;
        double roi = (total_prof/total_inv)*100;
        roi = Math.ceil(roi);
        return (int)roi;
    }

    public int ASR(int q1,int q2, int q3, int q4, int av)
    {
        double s1, s2, s3,s4;
        s1= Math.ceil(((double) q1 /av)*100);
        s1 = Math.ceil(s1*0.1);
        s2= Math.ceil(((double) q2 /av)*100);
        s2 = Math.ceil(s2*0.2);
        s3= Math.ceil(((double) q3 /av)*100);
        s3 = Math.ceil(s3*0.3);
        s4= Math.ceil(((double) q4 /av)*100);
        s4 = Math.ceil(s4*0.4);
        double asr = Math.ceil(((s1+s2+s3+s4))/4);
        return (int) asr;
    }

    public int day5_final(int asr,int roi, int av)
    {
        double roi_pred = av+ (Math.ceil(roi*0.1*av))/100;
        double asr_pred = Math.ceil((((double) ((asr) * av) /100)))+ av;
        double avg =  (roi_pred+asr_pred)/2;
        return (int) Math.ceil(avg);
    }
}
