// Your current selection is Java
//sort in descnending order based on number of factors
import java.util.*;
import java.util.Map.Entry;
public class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=arr[i];
            int c=factors(arr[i]);
            
            map.put(a,c);
        }
        //LinkedHashMap <Integer,Integer> sortedmap=sortByValue(map);
        List<Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue()));
        
        
        System.out.println("Sorted array based on number of factors:");
        
        for(Entry<Integer,Integer> entry:list){
            
            System.out.print(entry.getKey()+" ");
        }
       
    }
    
    private static int factors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                
                count++;
            }
        }
        return count;
    }
}