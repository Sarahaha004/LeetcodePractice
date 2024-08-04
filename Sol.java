class Sol{
    public static void main(String args[]){
        
        int arr[]={1,2,3,4,5};
        
        int n=5;
        
        int p=1;
        boolean flag=false;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]!=0){
                
                p*=arr[i];
            }
            
            else{
                flag=true;
            }
        }
        int result[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            if(arr[i]==0){
                result[i]=p;
            }
            else{
            if(flag){
                
                result[i]=0;
                
            }
            else{
                result[i]=p/arr[i];
            }
            }
            
        }
        
        for(int i=0;i<n;i++){
            
            System.out.print(result[i]+" ");
        }
    }
}