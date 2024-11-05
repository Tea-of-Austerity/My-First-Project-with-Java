package calculator;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap<String, Double> items = itemListCreate();
        //itemPrintout(items);

        double totalIncome = 0;
        //System.out.println("Income: "+"$"+totalIncome);
        Scanner scanner = new Scanner(System.in);
        final int itemNum = 6;
        double[] incomeList = {202, 118, 2250, 1680, 1075, 80};
        for (int i =0; i<incomeList.length; i++) {
            totalIncome+= incomeList[i];
        }
        /*double[] incomeListInput = new double[6];
        for (int i = 0; i < itemNum; i++){
            incomeListInput[i] = scanner.nextDouble();
        }*/

        HashMap<String, Double> incomeHash = incomeListCreate(incomeList);
        incomePrintout(incomeHash, totalIncome);
        double totalExpense = expenseCalc();
        System.out.println("Net income: $"+ (totalIncome-totalExpense));

    }
    public static void itemPrintout(HashMap<String, Double> items){
        System.out.println("Prices:\n");
        System.out.println("Bubblegum: "+ "$"+items.get("Bubblegum"));
        System.out.println("Toffee: "+ "$"+items.get("Toffee"));
        System.out.println("Ice Cream: "+ "$"+items.get("Ice Cream"));
        System.out.println("Milk chocolate: "+ "$"+items.get("Milk chocolate"));
        System.out.println("Doughnut: "+ "$"+items.get("Doughnut"));
        System.out.println("Pancake: "+ "$"+items.get("Pancake"));
    }
    public static void incomePrintout(HashMap<String, Double> income, double total){
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: "+ "$"+income.get("Bubblegum"));
        System.out.println("Toffee: "+ "$"+income.get("Toffee"));
        System.out.println("Ice Cream: "+ "$"+income.get("Ice Cream"));
        System.out.println("Milk chocolate: "+ "$"+income.get("Milk chocolate"));
        System.out.println("Doughnut: "+ "$"+income.get("Doughnut"));
        System.out.println("Pancake: "+ "$"+income.get("Pancake"));
        System.out.println();
        System.out.println("Income: "+"$"+total);
    }
    public static HashMap<String, Double> itemListCreate(){
        HashMap<String,Double> itemsHash = new HashMap<String, Double>();
        itemsHash.put("Bubblegum", (double) 2);
        itemsHash.put("Toffee", 0.2);
        itemsHash.put("Ice Cream", (double) 5);
        itemsHash.put("Milk chocolate", (double) 4);
        itemsHash.put("Doughnut", 2.5);
        itemsHash.put("Pancake", 3.2);
        return itemsHash;
    }
    public static HashMap<String, Double> incomeListCreate(double[] income){
        HashMap<String,Double> incomeHash = new HashMap<String, Double>();
        incomeHash.put("Bubblegum", income[0]);
        incomeHash.put("Toffee", income[1]);
        incomeHash.put("Ice Cream", income[2]);
        incomeHash.put("Milk chocolate", income[3]);
        incomeHash.put("Doughnut", income[4]);
        incomeHash.put("Pancake", income[5]);
        return incomeHash;
    }
    public static double expenseCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        double staffExpense = scanner.nextDouble();
        System.out.println("Other expenses:");
        double otherExpense = scanner.nextDouble();
        return staffExpense+otherExpense;
    }
}