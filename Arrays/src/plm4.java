public class plm4 {
    //  Richest Customer Wealth

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{8,9}};

        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];

                if (total > wealth) {
                    wealth = total;
                }
            }
        }
        return wealth;
    }

}
