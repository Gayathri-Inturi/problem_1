/*calculate variance and variance percentage given sales data ofproduct for two years like 2022 and 2021 */

import java.util.*;

public class Main{
    public static void main(String args[]){
        List<Data> sales2021=new ArrayList<>();
        List<Data> sales2022=new ArrayList<>();
        sales2021.add(new Data("tea",120));
        sales2021.add(new Data("Coffee",230));
        sales2021.add(new Data("greentea",60));
       

        sales2022.add(new Data("tea",100));
        sales2022.add(new Data("Coffee",250));
        sales2022.add(new Data("greentea",50));
        
        List<Data> variances=new ArrayList<>();
        List<Data> variancepcts=new ArrayList<>();
         
        for(int i=0;i<sales2021.size();i++){
             int variance=sales2022.get(i).getvalue()-sales2021.get(i).getvalue(); 
             variances.add(new Data(sales2022.get(i).getProduct(),variance));

             double variancepct=((double)variance/sales2022.get(i).getvalue())*100;
             variancepcts.add(new Data(sales2022.get(i).getProduct(),variancepct));

        }
       
       
        System.out.println(variances);
        System.out.println(variancepcts);
       

        
       }
}
class Data {
    private String product;
    private int value;
    private double varpct;
     public Data(String product,int value){
        this.product=product;
        this.value=value;
        

     }
     public Data(String product,double varpct){
        this.product=product;
        this.varpct=varpct;
     }
     public int getvalue(){
        return value;

     }
     public String getProduct(){
        return product;
     }
     public String toString(){
        return "{"+this.product+":"+this.value+":"+this.varpct+"}";
     }

    
}
/*Output
 [{tea:-20:0.0}, {Coffee:20:0.0}, {greentea:-10:0.0}]
[{tea:0:-20.0}, {Coffee:0:8.0}, {greentea:0:-20.0}]
 */
