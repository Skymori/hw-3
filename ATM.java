public class ATM {
    public int countBanknotes(int sum) {
        int[] many = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int bill = 0;
        while (sum != 0){
            if(sum >= many[count]) {
                bill += sum / many[count];
                sum =sum -(sum / many[count]) * many[count];
            }
            count++;
        }
        return bill; }
}