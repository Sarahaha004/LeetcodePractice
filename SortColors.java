/*Sort array of 0,1,2 without using library function */
/*Used count sort algorithm, count of each element and sorting*/
class SortColors {
    public void sortColors(int[] nums) {
        
        if(nums==null||nums.length==0){
            return;
        }

        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                c0++;
            }
            if(nums[i]==1)
                c1++;

            else
            c2++;
        }

        for(int j=0;j<c0;j++){
            nums[j]=0;
        }
        for(int j=c0;j<c0+c1;j++){
            nums[j]=1;
            }

        for(int j=c0+c1;j<nums.length;j++){
        nums[j]=2;
        }

        
    }
}
