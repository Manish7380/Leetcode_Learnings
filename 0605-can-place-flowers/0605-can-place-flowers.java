class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int a = 0;
    int b =flowerbed.length-1;
    if(flowerbed.length ==1 && n==1){
        if(flowerbed[a] ==0){
            flowerbed[a] =1;
            
            return true;
            
        }
    }
    if(flowerbed[a] ==0 && (a ==b || flowerbed[a+1]==0)){
        flowerbed[a] =1;
        n--;
    }
    if(flowerbed[b]==0 && (b==a || flowerbed[b-1]==0)){
        flowerbed[b] =1;
        n--;
    }
    if(n==0){
        return true;
    }
    for(int i=1; i<flowerbed.length-1; i++){
        if(flowerbed[i-1] ==0 && flowerbed[i]==0 && flowerbed[i+1] ==0){
            flowerbed[i] =1;
            n--;
        }
    }
    if(n <=0){
        return true;
    }
    return false;
    }
}