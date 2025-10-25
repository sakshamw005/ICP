class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[] time = new double[n];
        
        for (int i = 0; i < n; i++) {
            time[i] = (double)(target - position[i]) / speed[i];
        }

        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = i;
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        
        int ans = 0;
        double curr = 0.0;

        for (int i = 0; i < n; i++) {
            double t = time[cars[i][1]];
            if (t > curr) {     // new fleet
                ans++;
                curr = t;       
            }
        }
        return ans ;
    }
}