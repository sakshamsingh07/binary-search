import java.util.Scanner; 
public class brokeneconomy
{
    public static void economy(int [] arr ,int x)
    {
        int li=0;
        int ri=arr.length-1;
        int ceil=0;
        int floor=0;
        while(li<=ri)
        {
            int mid =(li+ri)/2;
            if(arr[mid]==x)
            {  
                ceil=arr[mid];
                floor=arr[mid];
                break;
                
            }
            else if(arr[mid]<x)
            {
                floor=li;
                li=mid+1;
               
            }
            else if (arr[mid]>x)
            {
                ceil=ri;
                ri=mid-1;
                
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    public static void main (String [] args)
    {
        // int [] arr = {1,5,10,15,22,33,40,42,55,66};
        // int x = 34;
        //  economy(arr,x);
        // System.out.println(ans);
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int [] arr = new int [n];
        for (int i =0; i <arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        economy(arr,x);

    }
}
