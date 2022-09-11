class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] team_m = new int[n][2];
   
        for(int i = 0; i < n; i++){
            team_m[i][0] = efficiency[i];
            team_m[i][1] = speed[i];
        }
        
        Arrays.sort(team_m, (a, b) -> b[0] - a[0]);
    
        PriorityQueue<Integer> speedqueue = new PriorityQueue<>(k); 
        
        long speedv = 0;
        long performance = 0;
        for(int i = 0; i < n; i++){
            // when size of the queue become equal to k
            if(speedqueue.size() == k){
                
                speedv -= speedqueue.poll(); 
            }
            
            speedv+=team_m[i][1];
            
            
            speedqueue.offer(team_m[i][1]);
            performance = Math.max(performance, speedv*team_m[i][0]);
        }
        return (int)(performance%1000000007);

    }
}