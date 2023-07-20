
public class Main {

    public static int maximumProfit(int[] array){
        int minAmount = Integer.MAX_VALUE, indexOfMin = -1;
        for(int iterator = 0 ; iterator < array.length ; iterator++){
            if(array[iterator] < minAmount){
                minAmount = array[iterator];
                indexOfMin = iterator;
            }
        }
        int maxAmount = Integer.MIN_VALUE;
        for (int iterator = indexOfMin + 1 ; iterator < array.length ; iterator++){
            maxAmount = Math.max(array[iterator], maxAmount);
        }
        return maxAmount - minAmount;
    }

    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{1, 4, 5, 2, 4}));
    }
}